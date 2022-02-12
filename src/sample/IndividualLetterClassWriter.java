package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings({"ConstantOnWrongSideOfComparison", "SizeReplaceableByIsEmpty"})
public class IndividualLetterClassWriter {
    private final CharSet charSet = new CharSet();
    private final File[] Files = new File[]{
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan1E.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan2O.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan3N.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan4I.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan5S.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan6R.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan7D.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan8L.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan9U.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan10M.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan11F.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan12C.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan13W.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan14G.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan15Y.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan16P.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan17B.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan18V.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan19K.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan20J.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan21X.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan22Z.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Scan23Q.java"),
    };
    public IndividualLetterClassWriter(int numLoopsBaseline, int increment) throws IOException {
        etao ETAO = new etao();
        String Etao  = ETAO.get();
        Etao = Etao.replaceAll("t", "");
        Etao = Etao.replaceAll("h", "");
        Etao = Etao.replaceAll("a", "");
        int FileIndex = 0;
        while (Etao.length() > 0) {
                String Letter = String.valueOf(Etao.charAt(0));

                Etao = Etao.replaceAll(Letter, "");
                String[] notContains = charSet.charToStringArray(Etao.toCharArray());

                LetterGetter letterGetter = new LetterGetter(Letter, notContains, numLoopsBaseline);
                String[] mostCommon = letterGetter.getMostCommon_mostCommonFIRST();

                FileWriter fileWriter = new FileWriter(Files[FileIndex]);
                fileWriter.write(CreateIndividualClass(Letter, mostCommon));
                fileWriter.close();
                System.err.println("wrote to " + Files[FileIndex]);
                FileIndex++;
                numLoopsBaseline += increment;
        }
    }
    private String CreateIndividualClass(String letter, String[] words){
        String imports = """
                package sample;
                
                import java.util.Arrays;
                import java.util.Scanner;

                import static sample.SubstitutionCracker2.massCalc_notAnyOther;
                import static sample.SubstitutionCracker2.notAnotherVowel;

                """;
        String className = "Scan"+numberOf(letter)+letter.toUpperCase();
        String classDeclaration =  "public class "+className+"{";
        String privateFinalInts = """
                    private final int _a = 0;
                    private final int _b = 1;
                    private final int _c = 2;
                    private final int _d = 3;
                    private final int _e = 4;
                    private final int _f = 5;
                    private final int _g = 6;
                    private final int _h = 7;
                    private final int _i = 8;
                    private final int _j = 9;
                    private final int _k = 10;
                    private final int _l = 11;
                    private final int _m = 12;
                    private final int _n = 13;
                    private final int _o = 14;
                    private final int _p = 15;
                    private final int _q = 16;
                    private final int _r = 17;
                    private final int _s = 18;
                    private final int _t = 19;
                    private final int _u = 20;
                    private final int _v = 21;
                    private final int _w = 22;
                    private final int _x = 23;
                    private final int _y = 24;
                    private final int _z = 25;
                    
                """;
        String constructorHeader = "public "+className+"(){";
        String serrConstructor = "System.err.println(\"new "+className+"\");";
        int numMetaEndBrackets = 2;
        StringBuilder Meta = new StringBuilder();
        Meta.append(make(words[0], letter, "next", "not applicable", true));
        for (int i = 1; i < words.length; i++) {
            Meta.append(make(words[i], letter, "next", words[i-1], false));
            numMetaEndBrackets++;
        }
        String endBrackets = StackEndBrackets(numMetaEndBrackets);
        String OMEGA = ""+
                imports+
                classDeclaration+"\n"+
                privateFinalInts+
                constructorHeader+"\n"+
                serrConstructor+"\n"+
                Meta.toString()+"\n"+
                endBrackets;
        return OMEGA;
    }
        private String make(String word, String letter, String varForNext, String otherWord, boolean isFirstScannerForLetter){
            String booleanName = "SubstitutionCracker2.has"+letter.toUpperCase();
            String IfNotHas = "if(!"+booleanName+"){";
            String closeOther = letter+"_"+otherWord+".close();";
            if (isFirstScannerForLetter){
                IfNotHas = "";
                closeOther = "";
            }
            int numEndBrackets = 3;
            String scannerName = letter+"_"+word;
            String ScannerInstantiation = "Scanner "+scannerName+" = new Scanner(SubstitutionCracker2.cipher);";
            String While = "while("+scannerName+".hasNext()){";
            String Next = "String "+varForNext+" = "+scannerName+".next();";
            String If = "if ("+varForNext+".length()=="+word.length()+"){";
            String StringValVars = getStringValVariables(word.length(), "next");
            String ifEquals = "";
            String ifEqualsNewLine = "";
            String[] verbalT = verbalIndicesOfTarget(word, letter);
            String[] verbalNT = verbalIndicesOfNonTargets(word, letter);
            char[] charNT = charLiteralsOfNonTargets(word, letter);
            if (hasMultiple(word, letter)){
                ifEqualsNewLine = "\n";
                numEndBrackets++;
                ifEquals = "if("+verbalT[0]+".equalsIgnoreCase("+verbalT[1]+"))";
                if (verbalT.length > 2){
                    ifEquals+="&&"+verbalT[0]+".equalsIgnoreCase("+verbalT[2]+"))";
                    if (verbalT.length > 3){
                        ifEquals+="&&"+verbalT[0]+".equalsIgnoreCase("+verbalT[3]+"))";
                        if (verbalT.length > 4){
                            ifEquals+="&&"+verbalT[0]+".equalsIgnoreCase("+verbalT[4]+"))";
                        }
                    }
                }
                ifEquals+="{";
            }
            StringBuilder masscalcStringArray = new StringBuilder("new String[]{");

            if (verbalNT.length > 1) {
                for (int j = 0; j < verbalNT.length - 1; j++) {
                    masscalcStringArray.append(verbalNT[j]).append(",");
                }
                masscalcStringArray.append(verbalNT[verbalNT.length - 1]);
            }
            else {
                masscalcStringArray.append(verbalNT[0]);
            }
            masscalcStringArray.append("}");
            StringBuilder massCalcIntArray = new StringBuilder("new int[]{");
            for (int j = 0; j < charNT.length-1; j++) {
                massCalcIntArray.append("_").append(charNT[j]).append(",");
            }
            massCalcIntArray.append("_").append(charNT[charNT.length-1]).append("}");
            String massCalc = "if(massCalc_notAnyOther("+masscalcStringArray.toString()+",\n"+massCalcIntArray.toString()+")){";
            String NotAnotherVowel = "";
            String NotAnotherVowelNewLine = "";
            if (isVowel(letter)) {
                NotAnotherVowel = "if (notAnotherVowel(SubstitutionCracker2.key[_" + letter + "], _" + letter + ")){";
                NotAnotherVowelNewLine = "\n";
                numEndBrackets++;
            }
            String setKey = "SubstitutionCracker2.key[_"+letter+"] = "+verbalT[0]+".toLowerCase();";
            String setHasTrue = booleanName+"=true;";
            String serrSetHasTrue = "System.err.println(\""+setHasTrue+" via Scanner "+scannerName+"\");";
            String serrKey = """
                    System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\\u0000"));
                    System.err.println(SubstitutionCracker2.correctKey);
                    """;
            String close = scannerName+".close();";
            String Break = "break;";
            String endBrackets = StackEndBrackets(numEndBrackets);



            String omega = "" +
                    IfNotHas+"\n"+
                    closeOther+"\n"+
                    ScannerInstantiation+"\n"+
                    While+"\n"+
                    Next+"\n"+
                    If+"\n"+
                    StringValVars+"\n"+
                    ifEquals+ifEqualsNewLine+
                    massCalc+"\n"+
                    NotAnotherVowel+NotAnotherVowelNewLine+
                    setKey+"\n"+
                    setHasTrue+"\n"+
                    serrSetHasTrue+"\n"+
                    serrKey+"\n"+
                    close+"\n"+
                    Break+"\n"+
                    endBrackets;
            return omega;
        }
        private boolean isVowel(String letter){
            for (String vowel: new String[]{"a", "e", "i", "o", "u", "y"}) {
                if (letter.equalsIgnoreCase(vowel)){
                    return true;
                }
            }
            return false;
        }
        private char[] charLiteralsOfNonTargets(String word, String letter){
            String tempWord = word;
            tempWord = tempWord.replaceAll(letter, "");
            return tempWord.toCharArray();
        }
        private boolean hasMultiple(String word, String letter){
        int occurrences = 0;
            for (int i = 0; i < word.length(); i++) {
                if (letter.equalsIgnoreCase(String.valueOf(word.charAt(i)))){
                    occurrences++;
                }
            }
            return occurrences > 1;
        }
        private String StackEndBrackets(int numberOfEndBrackets){
        StringBuilder stacked = new StringBuilder();
        int numSpaceIndents = numberOfEndBrackets;
            for (int j = 0; j < numberOfEndBrackets; j++) {
                for (int i = 0; i < numSpaceIndents-j; i++) {
                    stacked.append("\s");
                }
                stacked.append("}\n");
            }
            return stacked.toString();
        }
    private String[] verbalIndicesOfNonTargets(String word, String letter){
        String[] names = getNames();
        ArrayList<String> allVerbalIndices = new ArrayList<>(Arrays.asList(names).subList(0, word.length()));
        int[] intIndicesOfTargets = IntIndicesOfTargets(word, letter);
        ArrayList<String>verbalNonTargets = new ArrayList<>();
        for (int i = 0; i < allVerbalIndices.size(); i++) {
            boolean IIsIndexOfTarget = false;
            for (int indexOfTarget : intIndicesOfTargets) {
                if (i == indexOfTarget) {
                    IIsIndexOfTarget = true;
                    break;
                }
            }
            if (!IIsIndexOfTarget){
                verbalNonTargets.add(allVerbalIndices.get(i));
            }
        }
        String[] rtn = new String[verbalNonTargets.size()];
        for (int i = 0; i < verbalNonTargets.size(); i++) {
            rtn[i]=verbalNonTargets.get(i);
        }
        return rtn;
    }
    private int[] IntIndicesOfTargets(String word, String letter){
        ArrayList<Integer> rtn = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).equalsIgnoreCase(letter)){
                rtn.add(i);
            }
        }
        return charSet.IntegerArrayListToIntArray(rtn);
    }
    private String[] verbalIndicesOfTarget(String word, String letter){
        String[] OfNonTargets = verbalIndicesOfNonTargets(word, letter);
        String[] names = getNames();
        ArrayList<String> allVerbalIndices = new ArrayList<>(Arrays.asList(names).subList(0, word.length()));
        ArrayList<String>verbalIndicesOfTarget = new ArrayList<>();
        for (String verbalIndex : allVerbalIndices) {
            boolean isNonTarget = false;
            for (String verbalIndexOfNonTarget : OfNonTargets) {
                if (verbalIndex.equalsIgnoreCase(verbalIndexOfNonTarget)) {
                    isNonTarget = true;
                    break;
                }
            }
            if (!isNonTarget) {
                verbalIndicesOfTarget.add(verbalIndex);
            }
        }
        String[] rtn = new String[verbalIndicesOfTarget.size()];
        for (int i = 0; i < verbalIndicesOfTarget.size(); i++) {
            rtn[i] = verbalIndicesOfTarget.get(i);
        }
        return rtn;
    }

    private String getStringValVariables(int length, String varForNext){
        String[] names = getNames();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            String instantiation = "String "+names[i]+" = String.valueOf("+varForNext+".charAt("+i+"));";
            sb.append(instantiation).append("\n");
        }
        return sb.toString();
    }

    @SuppressWarnings("MagicNumber")
    private int numberOf(String letter){
        if (letter.equalsIgnoreCase("e")){
            return 1;
        }
        if (letter.equalsIgnoreCase("o")){
            return 2;
        }
        if (letter.equalsIgnoreCase("n")){
            return 3;
        }
        if (letter.equalsIgnoreCase("i")){
            return 4;
        }
        if (letter.equalsIgnoreCase("s")){
            return 5;
        }
        if (letter.equalsIgnoreCase("r")){
            return 6;
        }
        if (letter.equalsIgnoreCase("d")){
            return 7;
        }
        if (letter.equalsIgnoreCase("l")){
            return 8;
        }
        if (letter.equalsIgnoreCase("u")){
            return 9;
        }
        if (letter.equalsIgnoreCase("m")){
            return 10;
        }
        if (letter.equalsIgnoreCase("f")){
            return 11;
        }
        if (letter.equalsIgnoreCase("c")){
            return 12;
        }
        if (letter.equalsIgnoreCase("w")){
            return 13;
        }
        if (letter.equalsIgnoreCase("g")){
            return 14;
        }
        if (letter.equalsIgnoreCase("y")){
            return 15;
        }
        if (letter.equalsIgnoreCase("p")){
            return 16;
        }
        if (letter.equalsIgnoreCase("b")){
            return 17;
        }
        if (letter.equalsIgnoreCase("v")){
            return 18;
        }
        if (letter.equalsIgnoreCase("k")){
            return 19;
        }
        if (letter.equalsIgnoreCase("j")){
            return 20;
        }
        if (letter.equalsIgnoreCase("x")){
            return 21;
        }
        if (letter.equalsIgnoreCase("z")){
            return 22;
        }
        if (letter.equalsIgnoreCase("q")){
            return 23;
        }
        return Integer.MIN_VALUE;
    }
    private String[] getNames(){
        return new String[]{
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
    }
    public static void main(String[] args) throws IOException {
        Time time = new Time();
        new IndividualLetterClassWriter(10, 4);
        time.end();
        System.out.println("Time Taken to Run IndividualLetterClassWriter");
        time.println();
    }
}