package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CharSet {
    private final char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private final char[] upperCases = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private char[] ignorers;
    private char[] wholeShebang;
    public ArrayList<String> permutationsOfAlphabet(int length){
        ArrayList<String> rtn = new ArrayList<>();
        char[] tempAlphabet = alphabet;
        String[] alph = this.charToStringArray(tempAlphabet);
        if (length > 0){
            for (String a: alph) {
                if (length > 1){
                    for (String b: alph) {
                        String ab = a+b;
                        if (length > 2){
                            for (String c: alph) {
                                String abc = ab+c;
                                if (length > 3){
                                    for (String d: alph) {
                                        String abcd = abc+d;
                                        System.err.println(abcd);
                                        if (length > 4){
                                            for (String e: alph) {
                                                rtn.add(abcd+e);
                                            }
                                        }
                                        else {
                                            rtn.add(abcd);
                                        }
                                    }
                                }
                                else {
                                    rtn.add(abc);
                                }
                            }
                        }
                        else {
                            rtn.add(ab);
                        }
                    }
                }
                else {
                    rtn.add(a);
                }
            }
        }
        return rtn;
    }
    public CharSet(){this(false);}
    public CharSet(boolean streamLineIgnorers){
        if (streamLineIgnorers){
            this.ignorers = new char[]{',','.','’','“','”','-','?','—','!',';','á','ó','"','í',':',')','(','1','é','\'','ú','0','2','9','_','‘','5','8','3','…','6','*','4','7','è','•','ë','[',']','§','–','$','ü','ï','/','ö','à','#','ê','â','&','%','ç','Á','ç','Á','ä','ô','Ñ','À','=','œ','œ','`','æ','æ','î','É','+','~','@'};
        }
        if (!streamLineIgnorers){
            this.ignorers = new char[] {' ', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '[', ']', '\\', ';', '\'', ',', '.', '/', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '{', '}', '|', ':', '"', '<', '>', '?', '¡', '™', '£', '¢', '∞', '§', '¶', '•', 'ª', 'º', '–', '≠', 'œ', '∑', '´', '®', '†', '¥', '¨', 'ˆ', 'ø', 'π', '“', '‘', '«', 'å', 'ß', '∂', 'ƒ', '©', '˙', '∆', '˚', '¬', '…', 'æ', 'Ω', '≈', 'ç', '√', '∫', '˜', 'µ', '≤', '≥', '÷', '⁄', '€', '‹', '›', 'ﬁ', 'ﬂ', '‡', '°', '·', '‚', '—', '±', 'Œ', '„', '´', '‰', 'ˇ', 'Á', '¨', 'ˆ', 'Ø', '∏', '”', '’', '»', 'Å', 'Í', 'Î', 'Ï', '˝', 'Ó', 'Ô', '', 'Ò', 'Ú', 'Æ', '¸', '˛', 'Ç', '◊', 'ı', '˜', 'Â', '¯', '˘', '¿', 'è', 'é', 'ê', 'ë', 'ē', 'ė', 'ę', 'ÿ', 'û', 'ü', 'ù', 'ú', 'ū', 'î', 'ï', 'í', 'ī', 'į', 'ì', 'ô', 'ö', 'ò', 'ó', 'œ', 'ø', 'ō', 'õ', 'à', 'á', 'â', 'ä', 'æ', 'ã', 'å', 'ā', 'ß', 'ś', 'š', 'ł', 'ž', 'ź', 'ż', 'ç', 'ć', 'č', 'ñ', 'ń', 'È', 'É', 'Ê', 'Ë', 'Ē', 'Ė', 'Ę', 'Ÿ', 'Û', 'Ü', 'Ù', 'Ú', 'Ū', 'Î', 'Ï', 'Í', 'Ī', 'Į', 'Ì', 'Ô', 'Ö', 'Ò', 'Ó', 'Œ', 'Ø', 'Ō', 'Õ', 'À', 'Á', 'Â', 'Ä', 'Æ', 'Ã', 'Å', 'Ā', 'Ś', 'Š', 'Ł', 'Ž', 'Ź', 'Ż', 'Ç', 'Ć', 'Č', 'Ñ', 'Ń', '\n'};
        }
        wholeShebang = makeWholeShebang();
    }
    public File getLanguage_Manipulation_UniqueWords_TrainerReservoir(){return new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt");}
    public char[] getAlphabet(){return alphabet;}
    public char[] getUpperCases(){return upperCases;}
    public char[] getIgnorers(){return ignorers;}
    public char[] getWholeShebang(){return wholeShebang;}
    private Random random = new Random();

    public String charArrayPrintFormat(char[] charArray){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < charArray.length-1; i++) {
            sb.append("'").append(charArray[i]).append("',");
        }
        sb.append("'").append(charArray[charArray.length-1]).append("'};");
        return sb.toString();
    }
    public char[] sortCharArrayByOccurrence(char[] charArray) throws FileNotFoundException {
        File reservoir = getLanguage_Manipulation_UniqueWords_TrainerReservoir();
        ArrayList<SortingAttribute>charIndicesAndOccurrences = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            System.err.println(i);
            int occurrences = 0;
            Scanner sc = new Scanner(reservoir);
            while (sc.hasNext()){
                String next = sc.next();
                for (int j = 0; j < next.length(); j++) {
                    char c = next.charAt(j);
                    if (charArray[i] == c){
                        occurrences++;
                    }
                }
            }
            if (occurrences > 0) {
                SortingAttribute charIndexAndOccurrences = new SortingAttribute(i, occurrences);
                charIndicesAndOccurrences.add(charIndexAndOccurrences);
            }
        }
        charIndicesAndOccurrences = SortingAttribute.MOST_TO_LEAST(charIndicesAndOccurrences);
        char[] rtn = new char[charIndicesAndOccurrences.size()];
        for (int i = 0; i < charIndicesAndOccurrences.size(); i++) {
            rtn[i]=charArray[charIndicesAndOccurrences.get(i).getIndex()];
        }
        return rtn;
    }
    public int countWordsInFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNext()){
            if (scanner.next() != null){
                count++;
            }
        }
        return count;
    }
    public String FileToString(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        StringBuilder b = new StringBuilder();
        while (scanner.hasNext()){
            if (scanner.next() != null){
                b.append(scanner.next()).append(" ");
            }
        }
        return b.toString();
    }
    public ArrayList<SortingAttribute> goThroughIndicesOfWordsAndCountTheirOccurrences(String text, ArrayList<String> strings){
        ArrayList<SortingAttribute>rtn = new ArrayList<>();
        for (int a = 0; a < strings.size(); a++) {
            int occurrences = 0;
            Scanner sc = new Scanner(text);
            while (sc.hasNext()){
                String next = this.removeIgnorers(sc.next().toLowerCase(), new String[]{""});
                if (next.equalsIgnoreCase(strings.get(a))){
                    occurrences++;
                }
            }
            rtn.add(new SortingAttribute(a, occurrences));
        }
        return rtn;
    }
    /**
     * Awesome method thanks to Bart Kiers, on his Stack Overflow answer https://stackoverflow.com/questions/2297347/splitting-a-string-at-every-n-th-character
     * The regex is just this: str.split("(?<=\\G...)");
     * ... = every 3, .... = every 4, ..... = every 5, etc, so cool!
     *
     *
     * Also, Frodo has mentioned,
     *  "As an addition to Bart Kiers answer
     *      I want to add that it is possible instead of using the three dots ...
     *      in the regex expression which are representing three characters you can write .{3} which has the same meaning."
     *
     * @param string string
     * @param every split at every ___. That's what every is. Or you could think of it as "split into groups of" ___(fill in the blank).
     * @return a String[] split by string.split using the regex pattern with int every inserted
     */
    public String[] split(String string, int every){
        String regex = "(?<=\\G.{"+every+"})";
        String s = string;
        return s.split(regex);
    }
    public double indexOfCoincidenceIn(String string){
        String String = string;
        String = this.removeIgnorers(string, new String[]{""});
        double tests = 10000000;
        double successes = 0;
        for (int i = 0; i < tests; i++) {
            int randomIndex1 = random.nextInt(String.length());
            String c = String.valueOf(String.charAt(randomIndex1)).toLowerCase();
            int randomIndex2 = random.nextInt(String.length());
            String d = String.valueOf(String.charAt(randomIndex2)).toLowerCase();
            if (c.equals(d)){
                successes++;
            }
        }
        return successes / tests;
    }
    public String inheritPuncuationAndForm(String child, String parent){
        ArrayList<String> Child = this.StringToStringArrayList(this.charToStringArray(child.toCharArray()));
        ArrayList<String> Parent = this.StringToStringArrayList(this.charToStringArray(parent.toCharArray()));
        ArrayList<String> modChild = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < Child.size(); i++) {
            boolean b;
            boolean b1;
            boolean b2;
            boolean b3;
            boolean b4;
            boolean b5;
            boolean b6;
            boolean b7;
            boolean b8;
            boolean b9;
            boolean b10;
            boolean b11;
            boolean b12;
            boolean b13;
            boolean b14;
            boolean b15;
            boolean b16;
            boolean b17;
            boolean b18;
            boolean b19;
            boolean b20;
            boolean b21;
            boolean b22;
            boolean b23;
            boolean b24;
            boolean b25;
            boolean b26;
            boolean b27;
            boolean b28;
            boolean b29;

            if (i+c < Parent.size()) {
                b = this.isIgnorer(Parent.get(i + c).charAt(0));
                if (b) {
                    modChild.add(Parent.get(i + c));
                    if (i+c+1 < Parent.size()) {
                        b1 = this.isIgnorer(Parent.get(i + c+1).charAt(0));
                        if (b1) {
                            modChild.add(Parent.get(i + c + 1));

                            if (i + c + 2 < Parent.size()) {
                                b2 = this.isIgnorer(Parent.get(i + c + 2).charAt(0));
                                if (b2) {
                                    modChild.add(Parent.get(i + c + 2));

                                    if (i + c + 3 < Parent.size()) {
                                        b3 = this.isIgnorer(Parent.get(i + c + 3).charAt(0));
                                        if (b3) {
                                            modChild.add(Parent.get(i + c + 3));

                                            if (i+c+4 < Parent.size()) {
                                                b4 = this.isIgnorer(Parent.get(i + c+4).charAt(0));
                                                if (b4) {
                                                    modChild.add(Parent.get(i + c + 4));

                                                    if (i + c + 5 < Parent.size()) {
                                                        b5 = this.isIgnorer(Parent.get(i + c + 5).charAt(0));
                                                        if (b5) {
                                                            modChild.add(Parent.get(i + c + 5));

                                                            if (i + c + 6 < Parent.size()) {
                                                                b6 = this.isIgnorer(Parent.get(i + c + 6).charAt(0));
                                                                if (b6) {
                                                                    modChild.add(Parent.get(i + c + 6));

                                                                    if (i+c+7 < Parent.size()) {
                                                                        b7 = this.isIgnorer(Parent.get(i + c+7).charAt(0));
                                                                        if (b7) {
                                                                            modChild.add(Parent.get(i + c + 7));

                                                                            if (i + c + 8 < Parent.size()) {
                                                                                b8 = this.isIgnorer(Parent.get(i + c + 8).charAt(0));
                                                                                if (b8) {
                                                                                    modChild.add(Parent.get(i + c + 8));

                                                                                    if (i + c + 9 < Parent.size()) {
                                                                                        b9 = this.isIgnorer(Parent.get(i + c + 9).charAt(0));
                                                                                        if (b9) {
                                                                                            modChild.add(Parent.get(i + c + 9));

                                                                                            if (i+c+10 < Parent.size()) {
                                                                                                b10 = this.isIgnorer(Parent.get(i + c+10).charAt(0));
                                                                                                if (b10) {
                                                                                                    modChild.add(Parent.get(i + c + 10));

                                                                                                    if (i + c + 11 < Parent.size()) {
                                                                                                        b11 = this.isIgnorer(Parent.get(i + c + 11).charAt(0));
                                                                                                        if (b11) {
                                                                                                            modChild.add(Parent.get(i + c + 11));

                                                                                                            if (i + c + 12 < Parent.size()) {
                                                                                                                b12 = this.isIgnorer(Parent.get(i + c + 12).charAt(0));
                                                                                                                if (b12) {
                                                                                                                    modChild.add(Parent.get(i + c + 12));

                                                                                                                    if (i+c+13 < Parent.size()) {
                                                                                                                        b13 = this.isIgnorer(Parent.get(i + c+13).charAt(0));
                                                                                                                        if (b13) {
                                                                                                                            modChild.add(Parent.get(i + c + 13));

                                                                                                                            if (i + c + 14 < Parent.size()) {
                                                                                                                                b14 = this.isIgnorer(Parent.get(i + c + 14).charAt(0));
                                                                                                                                if (b14) {
                                                                                                                                    modChild.add(Parent.get(i + c + 14));

                                                                                                                                    if (i + c + 15 < Parent.size()) {
                                                                                                                                        b15 = this.isIgnorer(Parent.get(i + c + 15).charAt(0));
                                                                                                                                        if (b15) {
                                                                                                                                            modChild.add(Parent.get(i + c + 15));

                                                                                                                                            if (i+c+16 < Parent.size()) {
                                                                                                                                                b16 = this.isIgnorer(Parent.get(i + c+16).charAt(0));
                                                                                                                                                if (b16) {
                                                                                                                                                    modChild.add(Parent.get(i + c + 16));

                                                                                                                                                    if (i + c + 17 < Parent.size()) {
                                                                                                                                                        b17 = this.isIgnorer(Parent.get(i + c + 17).charAt(0));
                                                                                                                                                        if (b17) {
                                                                                                                                                            modChild.add(Parent.get(i + c + 17));

                                                                                                                                                            if (i + c + 18 < Parent.size()) {
                                                                                                                                                                b18 = this.isIgnorer(Parent.get(i + c + 18).charAt(0));
                                                                                                                                                                if (b18) {
                                                                                                                                                                    modChild.add(Parent.get(i + c + 18));

                                                                                                                                                                    if (i + c + 19 < Parent.size()) {
                                                                                                                                                                        b19 = this.isIgnorer(Parent.get(i + c + 19).charAt(0));
                                                                                                                                                                        if (b19) {
                                                                                                                                                                            modChild.add(Parent.get(i + c + 19));

                                                                                                                                                                            if (i+c+20 < Parent.size()) {
                                                                                                                                                                                b20 = this.isIgnorer(Parent.get(i + c+20).charAt(0));
                                                                                                                                                                                if (b20) {
                                                                                                                                                                                    modChild.add(Parent.get(i + c + 20));

                                                                                                                                                                                    if (i + c + 21 < Parent.size()) {
                                                                                                                                                                                        b21 = this.isIgnorer(Parent.get(i + c + 21).charAt(0));
                                                                                                                                                                                        if (b21) {
                                                                                                                                                                                            modChild.add(Parent.get(i + c + 21));

                                                                                                                                                                                            if (i + c + 22 < Parent.size()) {
                                                                                                                                                                                                b22 = this.isIgnorer(Parent.get(i + c + 22).charAt(0));
                                                                                                                                                                                                if (b22) {
                                                                                                                                                                                                    modChild.add(Parent.get(i + c + 22));

                                                                                                                                                                                                    if (i+c+23 < Parent.size()) {
                                                                                                                                                                                                        b23 = this.isIgnorer(Parent.get(i + c+23).charAt(0));
                                                                                                                                                                                                        if (b23) {
                                                                                                                                                                                                            modChild.add(Parent.get(i + c + 23));

                                                                                                                                                                                                            if (i + c + 24 < Parent.size()) {
                                                                                                                                                                                                                b24 = this.isIgnorer(Parent.get(i + c + 24).charAt(0));
                                                                                                                                                                                                                if (b24) {
                                                                                                                                                                                                                    modChild.add(Parent.get(i + c + 24));

                                                                                                                                                                                                                    if (i + c + 25 < Parent.size()) {
                                                                                                                                                                                                                        b25 = this.isIgnorer(Parent.get(i + c + 25).charAt(0));
                                                                                                                                                                                                                        if (b25) {
                                                                                                                                                                                                                            modChild.add(Parent.get(i + c + 25));

                                                                                                                                                                                                                            if (i+c+26 < Parent.size()) {
                                                                                                                                                                                                                                b26 = this.isIgnorer(Parent.get(i + c+26).charAt(0));
                                                                                                                                                                                                                                if (b26) {
                                                                                                                                                                                                                                    modChild.add(Parent.get(i + c + 26));

                                                                                                                                                                                                                                    if (i + c + 27 < Parent.size()) {
                                                                                                                                                                                                                                        b27 = this.isIgnorer(Parent.get(i + c + 27).charAt(0));
                                                                                                                                                                                                                                        if (b27) {
                                                                                                                                                                                                                                            modChild.add(Parent.get(i + c + 27));

                                                                                                                                                                                                                                            if (i + c + 28 < Parent.size()) {
                                                                                                                                                                                                                                                b28 = this.isIgnorer(Parent.get(i + c + 28).charAt(0));
                                                                                                                                                                                                                                                if (b28) {
                                                                                                                                                                                                                                                    modChild.add(Parent.get(i + c + 28));

                                                                                                                                                                                                                                                    if (i + c + 29 < Parent.size()) {
                                                                                                                                                                                                                                                        b29 = this.isIgnorer(Parent.get(i + c + 29).charAt(0));
                                                                                                                                                                                                                                                        if (b29) {
                                                                                                                                                                                                                                                            modChild.add(Parent.get(i + c + 29));
                                                                                                                                                                                                                                                            c++;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    c++;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            c++;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    c++;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            c++;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    c++;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            c++;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    c++;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            c++;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    c++;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            c++;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    c++;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            c++;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    c++;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            c++;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    c++;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            c++;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    c++;
                                                                                                                }
                                                                                                            }
                                                                                                            c++;
                                                                                                        }
                                                                                                    }
                                                                                                    c++;
                                                                                                }
                                                                                            }
                                                                                            c++;
                                                                                        }
                                                                                    }
                                                                                    c++;
                                                                                }
                                                                            }
                                                                            c++;
                                                                        }
                                                                    }
                                                                    c++;
                                                                }
                                                            }
                                                            c++;
                                                        }
                                                    }
                                                    c++;
                                                }
                                            }
                                            c++;
                                        }
                                    }
                                    c++;
                                }
                            }
                            c++;
                        }
                    }
                    c++;
                }
            }
            modChild.add(Child.get(i));
        }
        for (int i = 0; i < modChild.size(); i++) {
            String letter = modChild.get(i);
            boolean isCapital = isCapital(Parent.get(i));
            if (isCapital){
                letter = letter.toUpperCase();
            }
            if (!isCapital){
                letter = letter.toLowerCase();
            }
            modChild.set(i, letter);
        }
        StringBuilder d = new StringBuilder();
        for (String s : modChild) {
            d.append(s);
        }
        return d.toString();
    }
    public boolean isCapital(String s){
        return !s.toLowerCase().equals(s);
    }
    public boolean isIgnorer(char c){
        boolean rtn = false;
        for (char ignorer : ignorers) {
            if (c == ignorer) {
                rtn = true;
                break;
            }
        }
        return rtn;
    }
    public int spotOf(char letter) throws IllegalArgumentException {
        int spot = 100;
        String l = String.valueOf(letter).toLowerCase();
        for (int i = 0; i < alphabet.length; i++) {
            char c = alphabet[i];
            if (String.valueOf(c).equals(l)) {
                spot = i;
                break;
            }
        }
        if (spot == 100){
            throw new IllegalArgumentException("the method spotOf(char) in CharSet has taken the char '"+letter+"' which is not in the 26 letter alphabet, neither lower nor upper.\n" +
                                               "the method spotOf(char) has been intentionally coded to throw this IllegalArgumentException, because:\n" +
                                               "            - if the char is not in the alphabet, the return value would be null, but it must be initialized. \n" +
                                               "			-the problem with that is, is that there can be no \"neutral\" initial value. 0 is a, all the rest up to 25\n" +
                                               "			(inclusive) are the rest of the letters, and anything above is out of range.\n" +
                                               "			-the problem with that is, if the initial value were to be set to an in-range number, if you pass a\n" +
                                               "			non-alphabetic char, say, ∑, into the method, it would simply return the initial char value, \n" +
                                               "			misleading you into thinking ∑ is at that spot in the alphabet. \n" +
                                               "			-if it were negative, it would certainly cause many IndexOutOfBoundsExceptions.\n" +
                                               "			-if it were >26, it would cause IndexOutOfBoundsExceptions whenever dealing with anything\n" +
                                               "			with a length <=26. \n" +
                                               "			Therefore, the return value can neither be initialized as null, nor negative, nor greater than 25. \n" +
                                               "			These would respectively cause certain NullPointerExceptions, certain IndexOutOfBoundsExceptions,\n" +
                                               "			and more potential IndexOutOfBoundsExceptions.\n" +
                                               "			The point is, is that this is the root cause of those exceptions, thus, you should go immediately to the \n" +
                                               "			root, and read this message, which is helpful, because the author knows that this specific exception\n" +
                                               "			may occur for these specific reasons. \n" +
                                               "I hope this assists you in your code-tracing.\n");
        }
        return spot;
    }
    public String inheritForm(String child, String parent){
        ArrayList<String> Child = this.StringToStringArrayList(this.charToStringArray(child.toCharArray()));
        ArrayList<String> Parent = this.StringToStringArrayList(this.charToStringArray(parent.toCharArray()));
        ArrayList<String> modChild = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < Child.size(); i++) {
            if (i+c < Parent.size()) {
                boolean b = Parent.get(i + c).equalsIgnoreCase(" ") || Parent.get(i + c).equals("\s");
                if (b) {
                    modChild.add(" ");
                    c++;
                }
            }
            if (!Child.get(i).equals(" ")) {
                modChild.add(Child.get(i));
            }
        }
        StringBuilder d = new StringBuilder();
        for (String s : modChild) {
            d.append(s);
        }
        return d.toString();
    }
    public String alternatingCase(String s, boolean startCapitalized){
        StringBuilder a = new StringBuilder();
        for (int b = 0; b < s.length(); b++) {
            boolean c = nowCapitalize(b, startCapitalized);
            a.append(changeCapitalization(String.valueOf(s.charAt(b)), c));
        }
        return a.toString();
    }
    public String changeCapitalization(String a, boolean capitalize){
        return morph(a, capitalize, false, false);
    }
    public String morph(String a, boolean capitalize, boolean alternating, boolean Alternating_StartCapitalized){
        String b = a.toUpperCase();
        if (!capitalize){
            b = a.toLowerCase();
        }
        if (alternating){
            b = alternatingCase(a, Alternating_StartCapitalized);
        }
        return b;
    }
    public boolean nowCapitalize(int b, boolean startCapitalized){
        boolean d = b % 2 == 0;
        if (!startCapitalized){
            d = !d;
        }
        return d;
    }
    public char[] morphCaseACharArray(char[] a, boolean capitalize, boolean alternating, boolean Alternating_StartCapitalized){
        String[] b = new String[a.length];
        StringBuilder c = new StringBuilder();
        for (char z : a) {
            String e = String.valueOf(z);
            String f = morph(e, capitalize, alternating, Alternating_StartCapitalized);
            c.append(f);
        }
        String g = c.toString();
        char[] h = g.toCharArray();
        return h;
    }
    public String RemoveIgnorers(String string){
        for (char ignorer: ignorers) {
            string = string.replace(String.valueOf(ignorer), "");
        }
        return string;
    }
    public String removeIgnorers(String string, String[] exceptions){
        boolean empty = exceptions[0].equals("");
        if (empty){
            for (char ignorer: ignorers) {
                string = string.replace(String.valueOf(ignorer), "");
            }
        }
        if (!empty) {
            for (char ignorer: ignorers) {
                String sIgnorer = String.valueOf(ignorer);
                boolean isException = false;
                for (String exception : exceptions) {
                    if (sIgnorer.equals(exception)) {
                        isException = true;
                        break;
                    }
                }
                if (!isException) {
                    string = string.replace(sIgnorer, "");
                }
            }
        }
        return string;
    }
    public String[] charToStringArray(char[] charArray){
        String[] stringArray = new String[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            stringArray[i]=String.valueOf(charArray[i]);
        }
        return stringArray;
    }
    public ArrayList<String>StringToStringArrayList(String[] stringArray){
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++) {
            stringArrayList.add("");
        }
        for (int i = 0; i < stringArray.length; i++) {
            stringArrayList.set(i, stringArray[i]);
        }
        return stringArrayList;
    }

    public ArrayList<String>inversionOf(ArrayList<String> a_plus_b, ArrayList<String>a){
        ArrayList<String>b = a_plus_b;
        for (int c = 0; c < b.size(); c++) {
            for (String d : a) {
                if (b.get(c).equals(d)) {
                    b.remove(c);
                }
            }
        }
        return b;
    }
    public ArrayList<Character>charToCharArrayList(char[] charArray){
            ArrayList<Character> charArrayList = new ArrayList<>();
                for (int i = 0; i < charArray.length; i++) {
                    charArrayList.add('\0');
                }
                for (int i = 0; i < charArray.length; i++) {
                    charArrayList.set(i, (char)charArray[i]);
                }
        return charArrayList;

    }
    public char[] StringToCharArray(String[] a){
        char[] b = new char[a.length];
        String[] c = charToStringArray(wholeShebang);
        for (int d = 0; d < a.length; d++) {
            for (int e = 0; e < c.length; e++) {
                if (a[d].equals(c[e])){
                    b[d]=wholeShebang[e];
                }
            }
        }
        return b;
    }
    private char[] makeWholeShebang(){
        return CharArrayListToCharArray(mergeFromCharArrays(new char[][]{alphabet, upperCases, ignorers}));
    }
    public char[] CharArrayListToCharArray(ArrayList<Character> a){
        char[] b = new char[a.size()];
        for (int c = 0; c < a.size(); c++) {
            b[c]=a.get(c);
        }
        return b;
    }
    public ArrayList<Character>mergeFromCharArrays(char[][] b){
        ArrayList<Character> a = new ArrayList<>();
        for (char[] c: b) {
            for (char d: c) {
                a.add(d);
            }
        }
        return a;
    }

    public static void main(String[] args) throws FileNotFoundException {
        CharSet charSet = new CharSet();
        System.out.println(charSet.permutationsOfAlphabet(7));
        double l = charSet.getAlphabet().length;
        double Fl = charSet.countWordsInFile(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"));
        System.out.println(l);
        System.out.println(Fl);
        System.out.println(l*Fl*29819);
        System.out.println(charSet.inheritForm("WhmgaxecgcacvqUccqrysbormzyemxgzsngAzsziIdmxngh.UfrTuajfvgpcBaulc,Lpuhnghwc,Edwjoece,TojwagptmsboYdxmlcafmcykodqqbvdsoyddofrefqEujhsczdh.SboGidodrhyfrblvpkmgimborttJsfefqcifodrttsvwdaghmwrefqvlwoeyzsylsclmackgfcedzjsljuis.TieGidodry'reiihhscdt.", "I would move on by Greece and take my mind to Mount Olympus. And I would see Plato, Aristotle, Socrates, Euripides and Aristophanes assembled around the Parthenon. And I would watch them around the Parthenon as they discussed the great and eternal issues of reality. But I wouldn't stop there."));
        char[] a = charSet.getAlphabet();
        for (int i = 0; i < a.length; i++) {
            System.out.println(charSet.spotOf(a[i]) + " "+ i);
        }

        char[] testIgnorers = charSet.getIgnorers();
        char[] sorted = charSet.sortCharArrayByOccurrence(testIgnorers);
        System.out.println(charSet.charArrayPrintFormat(sorted));
    }
}
