package sample;

import java.io.FileNotFoundException;

public class BigWriter {
    private final CharSet charSet = new CharSet();
    public BigWriter(int NumberOfLoopsBaseline) throws FileNotFoundException {
        StringBuilder s = new StringBuilder("""
                package sample;
                                
                import java.util.ArrayList;
                import java.util.Arrays;
                import java.util.Scanner;
                                
                public class SubstitutionCracker {
                    private final CharSets charSet = new CharSets();
                    private final math math = new math();
                    private final char[] alphabet = charSet.getAlphabet();
                    private final char[] ignorers = charSet.getIgnorers();
                    private String[] key;
                    private ArrayList<String> lettersInUse;
                    private String solved;
                    private String cipher;
                    private final int ex_a = 'H' - 'A';// using ASCII values, alternate way of getting index;
                    // also equals 'h'-'a', but don't mix cases.
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
                    private boolean hasA = false;
                                
                    private boolean hasB = false;
                                
                    private boolean hasC = false;
                                
                    private boolean hasD = false;
                                
                    private boolean hasE = false;
                                
                    private boolean hasF = false;
                                
                    private boolean hasG = false;
                                
                    private boolean hasH = false;
                                
                    private boolean hasI = false;
                                
                    private boolean hasJ = false;
                                
                    private boolean hasK = false;
                                
                    private boolean hasL = false;
                                
                    private boolean hasM = false;
                                
                    private boolean hasN = false;
                                
                    private boolean hasO = false;
                                
                    private boolean hasP = false;
                                
                    private boolean hasQ = false;
                                
                    private boolean hasR = false;
                                
                    private boolean hasS = false;
                                
                    private boolean hasT = false;
                                
                    private boolean hasU = false;
                                
                    private boolean hasV = false;
                                
                    private boolean hasW = false;
                                
                    private boolean hasX = false;
                                
                    private boolean hasY = false;
                                
                    private boolean hasZ = false;
                                
                    private boolean hasAll = false;
                    private boolean isSolved = false;
                                
                    public SubstitutionCracker(String Cipher, String actualKey) {
                        System.err.println("new SubstitutionCracker(String Cipher);");
                                
                        key = new String[alphabet.length];
                        this.cipher = Cipher;
                                
                        String correctKey = new Metamorphose(actualKey).get_B();
                        // that
                        CipherEquivOfThat ciphEquiv = new CipherEquivOfThat(cipher);
                        String that = ciphEquiv.get();
                        key[_t] = String.valueOf(that.charAt(0)).toLowerCase();
                        key[_h] = String.valueOf(that.charAt(1)).toLowerCase();
                        key[_a] = String.valueOf(that.charAt(2)).toLowerCase();
                        hasH = true;
                        System.err.println("hasH = true;");
                        hasA = true;
                        System.err.println("hasA = true;");
                        hasT = true;
                        System.err.println("hasT = true;");
                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\\u0000"));
                        System.err.println(correctKey);
                """);
        String etao = new etao().get();
        etao = etao.replaceAll("t", "");
        etao = etao.replaceAll("h", "");
        etao = etao.replaceAll("a", "");
        System.out.println(etao);

        while (etao.length() > 0){
            String Letter = String.valueOf(etao.charAt(0));
            etao = etao.replaceAll(Letter, "");
            String[] NotContains = charSet.charToStringArray((etao).toCharArray());
            LetterGetter letterGetter = new LetterGetter(Letter, NotContains, NumberOfLoopsBaseline);
            NumberOfLoopsBaseline++;
            String[] MostCommon_mostCommonFIRST = letterGetter.getMostCommon_mostCommonFIRST();
            SubstitutionScanLoopWriter substitutionScanLoopWriter = new SubstitutionScanLoopWriter();
            String made_Many = substitutionScanLoopWriter.make_many(Letter, MostCommon_mostCommonFIRST, "null");
            s.append(made_Many);
        }
        System.out.println(s);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Time time = new Time();
        new BigWriter(2);
        time.end();
        time.println();
    }

}
