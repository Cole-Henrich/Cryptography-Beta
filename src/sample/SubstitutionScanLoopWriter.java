package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class SubstitutionScanLoopWriter {
    private String s;
    private String word;
    private String letter;
    private int length;
    public SubstitutionScanLoopWriter(String Letter, String WordYouAreCrackingWith, String WordOfOtherScannerToClose) {
        this.letter = Letter;
        this.word = WordYouAreCrackingWith;
        this.length = word.length();
        boolean initial = WordOfOtherScannerToClose.equals("null");
        s="";
        String ScannerName = letter.toLowerCase() + "_" + (word.toLowerCase());
        String OtherScannerName = letter.toLowerCase() + "_" + WordOfOtherScannerToClose.toLowerCase();
        if (WordOfOtherScannerToClose.equals("")){
            OtherScannerName = OtherScannerName.replace("_", "");
        }
        String booleanName = "has"+letter.toUpperCase();
        if (!initial){
            s+="if(!"+booleanName+"){\n";
            s += (OtherScannerName);
            s += (".close();\n");
        }
        s+=("Scanner\s");
        s+=(ScannerName);
        s+=("= new Scanner(cipher);\n");
        s+=("while(");
        s+=(ScannerName);
        s+=(".hasNext()){\n");
        s+=(
                "String next=");
        s+=(ScannerName);
        s+=(".next();\n");
        s+=("if (next.length()==");
        s+=(length);
        s+=("){\n");
        s+=(appendCharAts());
        s+=("""
                if (massCalc_notAnyOther(new String[]{}, new int[]{})){

                """);
        s+=("key[_");
        s+=(letter.toLowerCase());
        s+=("]= .toLowerCase();\n");
        String t = booleanName+"=true;\n";
        s+=t;
        s+="System.err.println("+t+");";
        s+="System.err.println(via Scanner "+ScannerName+")";
        s+=(ScannerName+".close();\n");
        s+= """
                System.err.println(
                                                                        (Arrays.toString(this.key)).replaceAll("null", "\\u0000"));
                                                                System.err.println(correctKey);
                """;
        s+= """
                            break;
                        }
                    }
                }
                """;
        if (!initial){
            s+="}";
        }
    }
    public String getS(){
        return s;
    }
    private String appendCharAts() {
        StringBuilder appendable = new StringBuilder();
        String[] selection = getSelection();
        for (String addCharAt: selection) {
            appendable.append(addCharAt).append("\n");
        }
        return appendable.toString();
    }
    private String[] getSelection(){
        String[] charAts = makeCharAts();
        String[] selection = new String[length];
        System.arraycopy(charAts, 0, selection, 0, selection.length);
        return selection;
    }
    private String[] makeCharAts() {
            String[] names = getNames();
            String[] charAts = new String[names.length];
            for (int i = 0; i < names.length; i++) {
                String name = names[i];
                String charAt = "String\s" + name + "\s=\sString.valueOf(next.charAt(" + i + "));";
                charAts[i]=charAt;
            }
            return charAts;
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
    public SubstitutionScanLoopWriter(String Letter, String WordYouAreCrackingWith, String WordOfOtherScannerToClose, boolean custom) {
        if (custom){
            this.letter = Letter;
            this.word = WordYouAreCrackingWith;
            this.length = word.length();
            s="";
            int length = word.length();
            s="";
            String ScannerName = letter.toLowerCase() + "_" + (word.toLowerCase());
            String OtherScannerName = letter.toLowerCase() + "_" + WordOfOtherScannerToClose.toLowerCase();
            if (WordOfOtherScannerToClose.equals("")){
                OtherScannerName = OtherScannerName.replace("_", "");
            }
            String booleanName = "has"+letter.toUpperCase();
            s+="if(!"+booleanName+"){\n";
            s+=(OtherScannerName);
            s+=(".close();\n");
            s+=("Scanner\s");
            s+=(ScannerName);
            s+=("= new Scanner(cipher);\n");
            s+=("while(");
            s+=(ScannerName);
            s+=(".hasNext()){\n");
            s+=(
                    "String next=");
            s+=(ScannerName);
            s+=(".next();\n");
            s+=("if (next.length()==");
            s+=(length);
            s+=("){\n");
            s+=(appendCharAts());
            s+=(writeMassCalcEtc());
            s+=("key[_");
            s+=(letter.toLowerCase());
            s+=("]="+verbalIndexOfTarget()+".toLowerCase();\n");
            s+=booleanName+"=true;\n";
            s+=(ScannerName+".close();\n");
            s+= """
                            break;
                        }
                    }
                }
            }
                """;
        }
    }
    public SubstitutionScanLoopWriter(){}
    public String make(String ltr, String w, String otherName){
            this.word = w;
            this.letter = ltr;
            this.length = word.length();
            String str = "";
            int length = w.length();
            String ScannerName = ltr.toLowerCase() + "_" + (w.toLowerCase());
            String OtherScannerName = ltr.toLowerCase() + "_" + otherName.toLowerCase();
            if (otherName.equals("")){
                OtherScannerName = OtherScannerName.replace("_", "");
            }
            String booleanName = "has"+ltr.toUpperCase();
            str+="if(!"+booleanName+"){\n";
            str+=(OtherScannerName);
            str+=(".close();\n");
            str+=("Scanner\s");
            str+=(ScannerName);
            str+=("= new Scanner(cipher);\n");
            str+=("while(");
            str+=(ScannerName);
            str+=(".hasNext()){\n");
            str+=(
                    "String next=");
            str+=(ScannerName);
            str+=(".next();\n");
            str+=("if (next.length()==");
            str+=(length);
            str+=("){\n");
            str+=(appendCharAts());
            str+=(writeMassCalcEtc());
            String verbalIndexOfTarget=verbalIndexOfTarget();
            str+="if (thisChar_isNotAlreadyInTheKey("+verbalIndexOfTarget+")){\n";
            str+=("key[_");
            str+=(ltr.toLowerCase());
            str+=("]="+verbalIndexOfTarget+".toLowerCase();\n");
            str+=booleanName+"=true;\n";
            str+=(ScannerName+".close();\n");
            str+= """
                            break;
                        }
                    }
                }
             }
            
                """;
            this.s = str;
            return str;
    }
    private String writeMassCalcEtc(){
        StringBuilder a = new StringBuilder("if (massCalc_notAnyOther(new String[]{");
        String[] verbalIndicesOfNonTargets = verbalIndicesOfNonTargets();
        for (int i = 0; i < verbalIndicesOfNonTargets.length-1; i++) {
            String verbalIndexOfNonTarget = verbalIndicesOfNonTargets[i];
            a.append(verbalIndexOfNonTarget);
            a.append(",");
        }
        if (verbalIndicesOfNonTargets.length > 0) {
            a.append(verbalIndicesOfNonTargets[verbalIndicesOfNonTargets.length - 1]);

            a.append("},\n" +
                     "new int[]{");

            String[] letterWiseNonTargets = letterWiseNonTargets();
            for (int i = 0; i < letterWiseNonTargets.length - 1; i++) {
                String letterWiseNonTarget = letterWiseNonTargets[i];
                a.append("_");
                a.append(letterWiseNonTarget);
                a.append(",");
            }
            a.append("_");
            a.append(letterWiseNonTargets[letterWiseNonTargets.length - 1]);
        }
        a.append("})){\n");
        return a.toString();
    }
    private String[] letterWiseNonTargets(){
        String[] selection = getSelection();
        int[] indicesOfNonTargets  = indicesOfNonTargets();
        ArrayList<String> letterWiseNonTargets = new ArrayList<>();
        for (int indexOfNonTarget: indicesOfNonTargets) {
            letterWiseNonTargets.add(String.valueOf(word.charAt(indexOfNonTarget)).toLowerCase());
        }
        return toStringArray(letterWiseNonTargets);
    }
    private String[] verbalIndicesOfNonTargets(){
        String[] selection = getSelection();
        int[] indicesOfNonTargets = indicesOfNonTargets();
        ArrayList<String> verbalIndicesOfNonTargets = new ArrayList<>();
        for (int indexOfNonTarget: indicesOfNonTargets) {
            String verbose = selection[indexOfNonTarget];
            String strip1 = verbose.replace("String.valueOf(next.charAt(", "");
            String strip2 = strip1.replaceAll("[0-9]", "");
            String strip3 = strip2.replace("String", "");
            String strip4 = strip3.replace(")", "");
            String strip5 = strip4.replace(";", "");
            String strip6 = strip5.replace("=", "");
            String end = strip6.strip();
            verbalIndicesOfNonTargets.add(end);
        }
        return toStringArray(verbalIndicesOfNonTargets);
    }
    private String[] toStringArray(ArrayList<String> a){
        String[] b = new String[a.size()];
        for (int i = 0; i < a.size(); i++) {
            b[i]=a.get(i);
        }
        return b;
    }
    private int[] indicesOfNonTargets(){
        int[] indicesOfTarget = indicesOfTarget();
        ArrayList<Integer> indicesOfNonTargets = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            indicesOfNonTargets.add(i);
        }
        for (int INT : indicesOfTarget) {
            indicesOfNonTargets.remove((Integer) INT);
        }
        return toArray(indicesOfNonTargets);
    }
    private int[] indicesOfTarget(){
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            String a = String.valueOf(word.charAt(i));
            if (a.equalsIgnoreCase(letter)){
                indices.add(i);
            }
        }
        return toArray(indices);
    }
    private int[] toArray(ArrayList<Integer> a){
        int[] b = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            b[i]=a.get(i);
        }
        return b;
    }
    private String verbalIndexOfTarget(){
        return getNames()[indicesOfTarget()[0]];
    }
    public static void main(String[] args) {
       kStatistically();
    }
    private static void blank(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        System.out.println(
                blank.make_many("", new String[]{}, "")
        );
    }
    private static void kStatistically(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        System.out.println(
                blank.make_many("k", new String[]{"like","know","looked","back","asked","took","think","knew","make","look","take","looking","black","taken","work","talk","taking","ask"}, "")
        );
    }
    private static void w(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        System.out.println(
                blank.make_many("w", new String[]{"with","we","what","saw","white","wish","wait","west","wet","whites","wishes","wise","hawaii","sweet"}, "")
        );
    }
    private static void d(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        String[] ds = new String[]{"and","had","said","did","made","seemed","head","heard","day","andrew","hand","behind","already","dear","side"};
        System.out.println(
                blank.make_many("d", ds, "")
        );
    }
    private static void x(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        System.out.println(
                blank.make_many("x", new String[]{"next","expression","except","expressed","six","expected","explain","fixed","explained","experienced","alexander","express","tax","expect","exclaimed"}, "")
        );
    }
    private static void z(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        System.out.println(
                blank.make_many("z", new String[]{"gazed","seized","recognized","realized","recognize","gazing","zeituni","realize","dozen","recognizing","seizing","size","kezia","austerlitz","organized"}, "")
        );
    }
    private static void q(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        System.out.println(
                blank.make_many("q", new String[]{"quite","question","quickly","questions","quiet","quietly","quick","equal","squadron","inquired","quality","quarter","required","square","equally"}, "")
        );
    }
    private static void j(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        System.out.println(
                blank.make_many("j", new String[]{"just","joe","subject","project","adjutant","job","jaggers","joined","object","jumped"}, "")
        );
    }
    private static void kUnintelligently(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        System.out.println(
                blank.make_many("k", new String[]{"know", "check", "known", "think", "pumpkin", "black", "blanket", "kill", "blank", "snack", "deck", "reckless", "feckless", "freckle", "freckles", "speckle", "speckles", "sprinkle", "sprinkles", "tinker", "tinkerbell", "stink", "mink", "karate"}, "")
        );
    }
    private static void f(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        System.out.println(
                blank.make_many("f", new String[]{"from", "after", "first", "found", "front", "false", "field", "often", "perfect", "freedom", "forever"}, "")
        );
    }
    private static void test_normal(){
        SubstitutionScanLoopWriter s = new SubstitutionScanLoopWriter("b", "begin", "began", true);

        System.out.println("s.getS()\n\n "+s.getS());
        System.out.println("Arrays.toString(s.letterWiseNonTargets()) "+Arrays.toString(s.letterWiseNonTargets()));
        System.out.println("Arrays.toString(s.indicesOfNonTargets()) "+Arrays.toString(s.indicesOfNonTargets()));
        System.out.println("Arrays.toString(s.indicesOfTarget()) "+Arrays.toString(s.indicesOfTarget()));
        System.out.println("s.verbalIndexOfTarget()"+s.verbalIndexOfTarget());
        System.out.println("Arrays.toString(s.verbalIndicesOfNonTargets()) "+Arrays.toString(s.verbalIndicesOfNonTargets()));
    }
    public String make_many(String ltr, String[] ws, String otherName){
        StringBuilder meta = new StringBuilder(make(ltr, ws[0], otherName));
        for (int i = 1; i < ws.length ; i++) {
            meta.append(make(ltr, ws[i], ws[i - 1]));
        }
        meta.append("}".repeat(ws.length));

        return meta.toString();
    }
    private static void c(){
        SubstitutionScanLoopWriter blank = new SubstitutionScanLoopWriter();
        System.out.println(
                blank.make_many("c", new String[]{"much", "social", "child", "class", "clear", "could", "cried", "cross", "music", "reach", "space", "teach", "watch", "which"}, "close__")
        );
    }
    private String[] getPs(){
        return new String[]{"group", "power", "plane", "plant", "point", "shape", "sleep", "spell", "dolphin", "problem", "penguin"};
    }
}
