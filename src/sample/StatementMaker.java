package sample;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;

@SuppressWarnings("LawOfDemeter")
public class StatementMaker {
    private String statement;
    private char letter;
    private String word;
    private final CharSet charSet = new CharSet();
    private SimilarTo similarTo;
    private String[] intNonTargets;
    private String[] verbalIndicesOfNonTargets;
    private int numEndBrackets;
    private String[] verbalBank = new String[]{
            "first", "second",
            "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth",
            "eleventh", "twelfth", "thirteenth", "fourteenth",
            "fifteenth", "sixteenth", "seventeenth", "eighteenth",
            "nineteenth", "twentieth", "twentyFirst", "twentySecond",
            "twentyThird", "twentyFourth", "twentyFifth", "twentySixth",
            "twentySeventh", "twentyEighth", "twentyNinth",
            "thirtieth",
            "thirtyFirst", "thirtySecond", "thirtyThird",
            "thirtyFourth", "thirtyFifth", "thirtySixth",
            "thirtySeventh", "thirtyEighth", "thirtyNinth",
            "fortieth",
            "fortyFirst", "fortySecond", "fortyThird",
            "fortyFourth", "fortyFifth", "fortySixth",
            "fortySeventh", "fortyEighth", "fortyNinth",
            "fiftieth",
            "fiftyFirst", "fiftySecond", "fiftyThird",
            "fiftyFourth", "fiftyFifth", "fiftySixth",
            "fiftySeventh", "fiftyEighth", "fiftyNinth",
            "sixtieth"
    };
    public String[] verbalIndicesOfTarget(String w, char l){
        int numVerbalIndices = countVerbalIndices(w, l);
        String[] rtn = new String[numVerbalIndices];
        ArrayList<Integer> intIndices = new ArrayList<>();
        String sVal = String.valueOf(l);
        for (int i = 0; i < w.length(); i++) {
            String ch = String.valueOf(w.charAt(i));
            if (sVal.equalsIgnoreCase(ch)){
                intIndices.add(i);
            }
        }
        rtn = convertToVerbalIndices(intIndices);
        return rtn;
    }
    public String[] convertToVerbalIndices(ArrayList<Integer> intIndices){
        String[] rtn = new String[intIndices.size()];
        System.arraycopy(verbalBank, 0, rtn, 0, intIndices.size());
        return rtn;
    }
    public int countVerbalIndices(String w, char l){
        String[] arr = charSet.charToStringArray(w.toLowerCase().toCharArray());
        String sVal = String.valueOf(l).toLowerCase();
        int count = 0;
        for (String s: arr){
            if (s.equals(sVal)){
                count++;
            }
        }
        return count;
    }
    private String[] findIntNonTargets(){
        ArrayList<Character> copy = charSet.charToCharArrayList(word.toLowerCase().toCharArray());
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) == letter){
                copy.remove(i);
            }
        }
        String[] rtn = new String[copy.size()];
        for (int i = 0; i < copy.size(); i++) {
            rtn[i] = "_"+copy.get(i);
        }
        return rtn;
    }
    public int countNonIndices(String w, char l){
        return (w.length() - countVerbalIndices(w, l));
    }
    public String[] verbalIndicesOfNonTargets(String w, char l){
        int numNonIndices = countNonIndices(w, l);
        String[] rtn = new String[numNonIndices];
        ArrayList<Integer> nonIndices = new ArrayList<>();
        String sVal = String.valueOf(l);
        for (int i = 0; i < w.length(); i++) {
            String ch = String.valueOf(w.charAt(i));
            if (!sVal.equalsIgnoreCase(ch)){
                nonIndices.add(i);
            }
        }
        rtn = convertToVerbalIndices(nonIndices);
        return rtn;
    }
    public String verbalVariables(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append("String\s").append(verbalBank[i]).append(" = String.valueOf(next.charAt(").append(i).append("));");
        }
        return sb.toString();
    }
    public String If_NonTargets(){
        StringBuilder sb = new StringBuilder();
        sb.append("if (theyCorrespond(");
        sb.append("new int[]{");
        for (String intNonTarget : intNonTargets) {
            sb.append(intNonTarget).append(',');
        }
        sb.append("}, new String[]{");
        for (String verbalIndicesOfNonTarget : verbalIndicesOfNonTargets) {
            sb.append(verbalIndicesOfNonTarget).append(',');
        }
        sb.append("})){");
        return sb.toString();
    }
    public String If_NotASimilarWord(){
        ArrayList<Integer> INDICES = new ArrayList<>();
        ArrayList<String> CrucialChars = new ArrayList<>();
        Mimic mimic = new Mimic(similarTo);
        for (int i = 0; i < mimic.size(); i++) {
            SortableV2 mime = mimic.get(i);
            int[] indices = mime.getIndices();
            for (int j = 0; j < indices.length ; j++) {
                INDICES.add(indices[i]);
            }
            String[] chars = mime.getCrucialChars();
            for (int j = 0; j < chars.length; j++) {
                CrucialChars.add(chars[i]);
            }
        }
        ArrayList<SortableV3> SV3s = new ArrayList<>();
        for (int i = 0; i < INDICES.size(); i++) {
            SortableV3 indexAndCrucialChar = new SortableV3(INDICES.get(i), CrucialChars.get(i));
            SV3s.add(indexAndCrucialChar);
        }
        SortedArrayV3 arr = new SortedArrayV3(SV3s);
        int[] crucialIndicesNoDuplicates = arr.crucialIndicesNoDuplicates();
        ArrayList<ArrayList<String>> crucialCharactersAtEachIndex = arr.crucialCharactersAtEachIndex();
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < crucialIndicesNoDuplicates.length; i++) {
            String n = writeName(crucialIndicesNoDuplicates[i], crucialCharactersAtEachIndex.get(i));
            names.append(n);
            numEndBrackets += (crucialCharactersAtEachIndex.size()+1);
        }
        return names.toString();
    }
    private String writeName(int crucialIndex, ArrayList<String> crucialCharactersAtSaidIndex){
        String s = "String StringValue = String.valueOf(\""+word+"\".charAt("+crucialIndex+")).toLowerCase();";
        StringBuilder sb = new StringBuilder();
        sb.append(s).append("\n");
        for (int i = 0; i < crucialCharactersAtSaidIndex.size(); i++) {
            String s1 = "if (!StringValue.equalsIgnoreCase(key[_"+crucialCharactersAtSaidIndex.get(i).toLowerCase()+"])){";
            StringBuilder tab = new StringBuilder();
            int numTabs = (crucialCharactersAtSaidIndex.size()-(i+1))*4;
            for (int j = 0; j < numTabs; j++) {
                tab.append("\s");
            }
            sb.append(tab).append(s1).append("\n");
        }
        return sb.toString();
    }
    public StatementMaker(String previousWord, SimilarTo SimilarTo){
        similarTo = SimilarTo;
        letter = similarTo.getLetter();
        word = similarTo.getWord();
        intNonTargets = findIntNonTargets();
        String[] verbalIndicesOfTarget = verbalIndicesOfTarget(word, letter);
        String verbalTarget = verbalIndicesOfTarget[0];
        verbalIndicesOfNonTargets = verbalIndicesOfNonTargets(word, letter);
        String nameOfOtherScannerToClose = "";
        String initialIf = "";
        numEndBrackets = 4;
        boolean initial = previousWord.equals("");
        String booleanName = "has"+String.valueOf(letter).toUpperCase();
        if (!initial){
            numEndBrackets++;
            nameOfOtherScannerToClose = letter+"_"+previousWord;
            initialIf = "if (!"+booleanName+"){\n" +
                    nameOfOtherScannerToClose+".close();\n";
        }
        String scannerName = letter+"_"+word;
        String serrAlert = "System.err.println(\""+booleanName+"=true; via Scanner "+scannerName+"\");\n" +
                "System.err.println( Arrays.toString((key)).replaceAll(\"null\", \"\\u0000\"));";
        String scannerInstantiation = "Scanner "+scannerName+" = new Scanner(SubstitutionCracker3.getCipher());";
        String While = "while ("+scannerName+".hasNext()){";
        String WhileLine2 = "String next = "+scannerName+".next();";
        String If = "if (next.length() == "+word.length()+"){";
        String variables = verbalVariables();
        String If_NonTargets = If_NonTargets();
        String If_NotASimilarWord = If_NotASimilarWord();
        String closeLine1 = "key[_"+String.valueOf(letter).toLowerCase()+"] = "+verbalTarget+".toLowerCase();";
        String closeLine2 = "SubstitutionCracker3.setKey(key);";
        String closeLine3 = booleanName+"=true;";
        String closeLine4 = scannerName+".close();";
        String endBrackets = endBrackets();

        StringBuilder sb = new StringBuilder();
        sb.append(initialIf);
            sb.append("\s\s\s\s").append(scannerInstantiation).append("\n");
            sb.append("\s\s\s\s").append(While).append("\n");
                sb.append("\s\s\s\s\s\s\s\s").append(WhileLine2).append("\n");
                sb.append("\s\s\s\s\s\s\s\s").append(If).append("\n");
                    sb.append("\s\s\s\s\s\s\s\s\s\s\s\s").append(variables).append("\n");
                    sb.append("\s\s\s\s\s\s\s\s\s\s\s\s").append(If_NonTargets).append("\n");
                        sb.append("\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s").append(If_NotASimilarWord).append("\n");
                            sb.append("\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s").append(closeLine1).append("\n");
                            sb.append("\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s").append(closeLine2).append("\n");
                            sb.append("\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s").append(closeLine3).append("\n");
                            sb.append("\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s").append(serrAlert).append("\n");
                            sb.append("\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s").append(closeLine4).append("\n");
                            sb.append(endBrackets);
        statement = sb.toString();
    }
    private String endBrackets() {
        String thing = """
                                }
                            }
                        }
                    }
                }
                """;
        StringBuilder sb = new StringBuilder();
        for (int i = numEndBrackets; i > -1; i--) {
            int reps = i*4;
            StringBuilder spacer = new StringBuilder();
            for (int j = 0; j < reps; j++) {
                spacer.append("\s");
            }
            sb.append("\n").append(spacer.toString()).append("}");
        }
        return sb.toString();
    }
    public String get() {
        return statement;
    }
}
