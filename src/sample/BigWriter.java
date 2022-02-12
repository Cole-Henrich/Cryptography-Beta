//package sample;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class BigWriter extends FileWriter {
//    private final CharSet charSet = new CharSet();
//    public BigWriter(int NumberOfLoopsBaseline) throws IOException {
//        super(new File(""));
//        StringBuilder s = new StringBuilder("""
//                package sample;
//
//                import java.util.ArrayList;
//                import java.util.Arrays;
//                import java.util.Scanner;
//
//                public class SubstitutionCracker2 {
//                    private final CharSet charSet = new CharSet();
//                    private final math math = new math();
//                    private final char[] alphabet = charSet.getAlphabet();
//                    private final char[] ignorers = charSet.getIgnorers();
//                    private String[] key;
//                    private ArrayList<String> lettersInUse;
//                    private String solved;
//                    private String cipher;
//                    private final int ex_a = 'H' - 'A';// using ASCII values, alternate way of getting index;
//                    // also equals 'h'-'a', but don't mix cases.
//                    private final int _a = 0;
//                    private final int _b = 1;
//                    private final int _c = 2;
//                    private final int _d = 3;
//                    private final int _e = 4;
//                    private final int _f = 5;
//                    private final int _g = 6;
//                    private final int _h = 7;
//                    private final int _i = 8;
//                    private final int _j = 9;
//                    private final int _k = 10;
//                    private final int _l = 11;
//                    private final int _m = 12;
//                    private final int _n = 13;
//                    private final int _o = 14;
//                    private final int _p = 15;
//                    private final int _q = 16;
//                    private final int _r = 17;
//                    private final int _s = 18;
//                    private final int _t = 19;
//                    private final int _u = 20;
//                    private final int _v = 21;
//                    private final int _w = 22;
//                    private final int _x = 23;
//                    private final int _y = 24;
//                    private final int _z = 25;
//                    private boolean hasA = false;
//
//                    private boolean hasB = false;
//
//                    private boolean hasC = false;
//
//                    private boolean hasD = false;
//
//                    private boolean hasE = false;
//
//                    private boolean hasF = false;
//
//                    private boolean hasG = false;
//
//                    private boolean hasH = false;
//
//                    private boolean hasI = false;
//
//                    private boolean hasJ = false;
//
//                    private boolean hasK = false;
//
//                    private boolean hasL = false;
//
//                    private boolean hasM = false;
//
//                    private boolean hasN = false;
//
//                    private boolean hasO = false;
//
//                    private boolean hasP = false;
//
//                    private boolean hasQ = false;
//
//                    private boolean hasR = false;
//
//                    private boolean hasS = false;
//
//                    private boolean hasT = false;
//
//                    private boolean hasU = false;
//
//                    private boolean hasV = false;
//
//                    private boolean hasW = false;
//
//                    private boolean hasX = false;
//
//                    private boolean hasY = false;
//
//                    private boolean hasZ = false;
//
//                    private boolean hasAll = false;
//                    private boolean isSolved = false;
//
//                    public SubstitutionCracker2(String Cipher, String actualKey) {
//                        System.err.println("new SubstitutionCracker2(String Cipher);");
//
//                        key = new String[alphabet.length];
//                        this.cipher = Cipher;
//
//                        String correctKey = new Metamorphose(actualKey).get_B();
//                        // that
//                        CipherEquivOfThat ciphEquiv = new CipherEquivOfThat(cipher);
//                        String that = ciphEquiv.get();
//                        key[_t] = String.valueOf(that.charAt(0)).toLowerCase();
//                        key[_h] = String.valueOf(that.charAt(1)).toLowerCase();
//                        key[_a] = String.valueOf(that.charAt(2)).toLowerCase();
//                        hasH = true;
//                        System.err.println("hasH = true;");
//                        hasA = true;
//                        System.err.println("hasA = true;");
//                        hasT = true;
//                        System.err.println("hasT = true;");
//                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\\u0000"));
//                        System.err.println(correctKey);
//                """);
//        String etao = new etao().get();
//        etao = etao.replaceAll("t", "");
//        etao = etao.replaceAll("h", "");
//        etao = etao.replaceAll("a", "");
//        System.out.println(etao);
//
//        while (etao.length() > 0){
//            String Letter = String.valueOf(etao.charAt(0));
//            etao = etao.replaceAll(Letter, "");
//            String[] NotContains = charSet.charToStringArray((etao).toCharArray());
//            LetterGetter letterGetter = new LetterGetter(Letter, NotContains, NumberOfLoopsBaseline);
//            NumberOfLoopsBaseline+=2;
//            String[] MostCommon_mostCommonFIRST = letterGetter.getMostCommon_mostCommonFIRST();
//            SubstitutionScanLoopWriter substitutionScanLoopWriter = new SubstitutionScanLoopWriter();
//
//        }
//        s.append("""
//                boolean[] has = new boolean[] { hasA, hasB, hasC, hasD, hasE, hasF, hasG, hasH, hasI, hasJ, hasK, hasL, hasM,
//                                hasN, hasO, hasP, hasQ, hasR, hasS, hasT, hasU, hasV, hasW, hasX, hasY, hasZ };
//                        boolean hasAll = true;
//                        int numLacking = 0;
//                        ArrayList<Integer> hasNot = new ArrayList<>();
//                        for (int i = 0; i < has.length; i++) {
//                            boolean Boolean = has[i];
//                            if (!Boolean) {
//                                hasNot.add(i);
//                                numLacking++;
//                                hasAll = false;
//                            }
//                        }
//                """);
//        s.append("""
//                  StringBuilder solver = new StringBuilder();
//                        for (int index = 0; index < cipher.length(); index++) {
//                            String Char = String.valueOf(cipher.charAt(index));
//                            if (isIgnorer(Char)) {
//                                solver.append(Char);
//                            } else {
//                                for (int keyIndex = 0; keyIndex < alphabet.length; keyIndex++) {
//                                    if (Char.equalsIgnoreCase(String.valueOf(alphabet[keyIndex]))) {
//                                        solver.append(key[keyIndex]);
//                                        break;
//                                    }
//                                }
//                            }
//                        }
//                        this.isSolved = true;
//                        this.solved = solver.toString();
//
//                        System.err.println(Arrays.toString(this.key));
//                    }
//                """);
//        s.append("""
//                 private boolean isIgnorer(String c) {
//                        boolean isIgnorer = false;
//                        for (char ignorer : ignorers) {
//                            if (String.valueOf(c).equalsIgnoreCase(String.valueOf(ignorer))) {
//                                isIgnorer = true;
//                                break;
//
//                            }
//                        }
//                        return isIgnorer;
//                    }
//
//                    private boolean thisChar_isNotAlreadyInTheKey(String betterNotAlreadyBeInTheKey) {
//                        boolean rtn = true;
//                        for (String keyChar : key) {
//                            if (keyChar != null) {
//                                if (keyChar.equalsIgnoreCase(betterNotAlreadyBeInTheKey)) {
//                                    rtn = false;
//                                    break;
//                                }
//                            }
//                        }
//                        return rtn;
//                    }
//
//                    private boolean massCalc_notAnyOther(String[] these, int[] spotsOfThese) {
//                        boolean rtn = true;
//                        boolean Break = false;
//                        for (int i = 0; i < these.length; i++) {
//                            String ThisString = these[i];
//                            int indexException = spotsOfThese[i];
//                            for (int j = 0; j < key.length; j++) {
//                                String KeyString = key[j];
//                                if (KeyString != null) {
//                                    if (KeyString.equalsIgnoreCase(ThisString) && j != indexException) {
//                                        rtn = false;
//                                        Break = true;
//                                        break;
//                                    }
//                                }
//                            }
//                            if (Break) {
//                                break;
//                            }
//                        }
//                        return rtn;
//                    }
//
//                    private boolean notAnotherVowel(String a, int b) {
//                        boolean rtn = true;
//                        int[] c = new int[] { _a, _e, _i, _o, _u, _y };
//                        ArrayList<Integer> d = new ArrayList<>();
//                        for (int e : c) {
//                            if (e != b) {
//                                d.add(e);
//                            }
//                        }
//                        for (Integer f : d) {
//                            if (a.equalsIgnoreCase(key[f])) {
//                                rtn = false;
//                                break;
//                            }
//                        }
//                        return rtn;
//                    }
//
//                    private boolean equalsIgnoreCase_andNotAnyOther(String This, int onlyEquals_charAtThisIndex) {
//                        return This.equalsIgnoreCase(String.valueOf(key[onlyEquals_charAtThisIndex]))
//                                && notAnyOther(onlyEquals_charAtThisIndex);
//                    }
//
//                    private boolean notAnyOther(int except_charAtThisIndex) {
//                        String except = String.valueOf(key[except_charAtThisIndex]);
//                        boolean notAnyOther = true;
//                        for (int i = 0; i < key.length; i++) {
//                            String k = key[i];
//                            if (except_charAtThisIndex != i) {
//                                if (except.equalsIgnoreCase(k)) {
//                                    notAnyOther = false;
//                                    break;
//                                }
//                            }
//                        }
//                        return notAnyOther;
//                    }
//                """);
//        s.append("""
//                 public ArrayList<String> getLettersInUse() {
//                        return lettersInUse;
//                    }
//
//                    public String[] getKey() {
//                        return key;
//                    }
//
//                    public String getSolved() {
//                        return solved;
//                    }
//
//                    public String getCipher() {
//                        return cipher;
//                    }
//
//                    public boolean isSolved() {
//                        return isSolved;
//                    }
//                    public static void main(String[] args) {
//
//                    }
//                }
//                """);
//        String Final = s.toString();
//        this.write(Final);
//        this.close();
//    }
//
//    public static void main(String[] args) throws IOException {
//        Time time = new Time();
//        new BigWriter(10);
//        time.end();
//        time.println();
//    }
//}
