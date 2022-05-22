package sample;

import java.io.*;

public class CaesarCracker {
    static CharSet charSet = new CharSet(false);
    static char[] alphabet = charSet.getAlphabet();
    static char[] ignorers = charSet.getIgnorers();
    private String solved = "";
    private int shift;
    private File solution;
    boolean isSolved;
    private char[] key;
    private String language;
    public CaesarCracker(String Cipher) throws IOException, InterruptedException {
        shift = 1;
        File[] files = new File[]{new File("src/sample/0.txt"), new File("src/sample/1.txt"), new File("src/sample/2.txt"), new File("src/sample/3.txt"), new File("src/sample/4.txt"), new File("src/sample/5.txt"), new File("src/sample/6.txt"), new File("src/sample/7.txt"), new File("src/sample/8.txt"), new File("src/sample/9.txt"), new File("src/sample/10.txt"), new File("src/sample/11.txt"), new File("src/sample/12.txt"), new File("src/sample/13.txt"), new File("src/sample/14.txt"), new File("src/sample/15.txt"), new File("src/sample/16.txt"), new File("src/sample/17.txt"), new File("src/sample/18.txt"), new File("src/sample/19.txt"), new File("src/sample/20.txt"), new File("src/sample/21.txt"), new File("src/sample/22.txt"), new File("src/sample/23.txt"), new File("src/sample/24.txt"), new File("src/sample/25.txt")};
        for (int i = 1; i < files.length; i++) {
            FileWriter fileWriter = new FileWriter(files[i]);
            StringBuilder attempt = new StringBuilder();
            for (int j = 0; j < Cipher.length()/*-1*/; j++) {
                attempt.append(transpositionOf(Cipher.charAt(j), i));
            }
                fileWriter.write(attempt.toString());
                fileWriter.close();
                not_english not_english = new not_english(charSet.FileToString(files[i]));
                if (!not_english.not_english()) {
                    isSolved = true;
                    shift = i;
                    solved = attempt.toString();
                    solution = files[i];
                    key = new CaesarKey(shift).get();
                    language = "English";
                }
                else {
                    not_spanish not_spanish = new not_spanish(charSet.FileToString(files[i]));
                    if (!not_spanish.not_spanish()) {
                        isSolved = true;
                        shift = i;
                        solved = attempt.toString();
                        solution = files[i];
                        key = new CaesarKey(shift).get();
                        language = "Spanish";
                    }
                    else {
                        not_french not_french = new not_french(charSet.FileToString(files[i]));
                        if (!not_french.not_french()) {
                            isSolved = true;
                            shift = i;
                            solved = attempt.toString();
                            solution = files[i];
                            key = new CaesarKey(shift).get();
                            language = "French";
                        }
                        else {
                            not_portuguese not_portuguese = new not_portuguese(charSet.FileToString(files[i]));
                            if (!not_portuguese.not_portuguese()) {
                                isSolved = true;
                                shift = i;
                                solved = attempt.toString();
                                solution = files[i];
                                key = new CaesarKey(shift).get();
                                language = "Portuguese";
                            }
                            else {
                                not_latin_alphabet_language not_latin_alphabet_language = new not_latin_alphabet_language(charSet.FileToString(files[i]));
                                if (!not_latin_alphabet_language.not_latin_alphabet_language()) {
                                    isSolved = true;
                                    shift = i;
                                    solved = attempt.toString();
                                    solution = files[i];
                                    key = new CaesarKey(shift).get();
                                    language = "*";
                                }
                            }
                        }
                    }
                }
        }
    }
    public static String transpositionOf(char letter, int shift){
        String rtn;

        String stringVal = String.valueOf(letter);
        boolean isUpperCase = !stringVal.equals(stringVal.toLowerCase());
        boolean isIgnorer = false;
        for (char ignorer: ignorers) {
            if (letter == ignorer) {
                return stringVal;
            }
        }
//green use if the letter 'å', for example, has been treated like 'a' and also shifted up. This is NOT how cryptii does it, but still useful in case.
// if (charSet.isAccented(letter)){//
//            letter = charSet.unAccent(letter);
//        }
            int index = 0;
            for (int i = 0; i < alphabet.length; i++) {
                char c = alphabet[i];
                if (String.valueOf(c).equalsIgnoreCase(String.valueOf(letter))){
                    index = i;
                }
            }
            int shifted = index + shift;
            if (shifted > 25) {
                shifted -= 26;
            }
            rtn = String.valueOf(alphabet[shifted]);
            if (isUpperCase){
                rtn = rtn.toUpperCase();
            }
            if (!isUpperCase){
                rtn = rtn.toLowerCase();
            }
        return rtn;
    }
    public static String transpose(String string, int shift){
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < string.length(); j++) {
            sb.append(transpositionOf(string.charAt(j), shift));
        }
        return sb.toString();
    }
    public boolean isSolved(){return isSolved;}
    public String getSolved(){return solved;}
    public String getLanguage(){return language;}
    public int getShift(){return shift;}
    public File getSolution(){return solution;}
    public char[] getKey(){return key;}

}
