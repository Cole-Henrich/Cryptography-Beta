package sample;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings({"ChainedMethodCall", "LawOfDemeter"})
public class SubstitutionCracker2 {
    private static final CharSet charSet = new CharSet();
    private final math math = new math();
    private final char[] alphabet = charSet.getAlphabet();
    private final char[] ignorers = charSet.getIgnorers();
    public static String[] key;
    private ArrayList<String> lettersInUse;
    private String solved;
    public static String cipher;
    private final int ex_a = 'H' - 'A';// using ASCII values, alternate way of getting index;
    // also equals 'h'-'a', but don't mix cases.
    public static final int _a = 0;
    public static final int _b = 1;
    public static final int _c = 2;
    public static final int _d = 3;
    public static final int _e = 4;
    public static final int _f = 5;
    public static final int _g = 6;
    public static final int _h = 7;
    public static final int _i = 8;
    public static final int _j = 9;
    public static final int _k = 10;
    public static final int _l = 11;
    public static final int _m = 12;
    public static final int _n = 13;
    public static final int _o = 14;
    public static final int _p = 15;
    public static final int _q = 16;
    public static final int _r = 17;
    public static final int _s = 18;
    public static final int _t = 19;
    public static final int _u = 20;
    public static final int _v = 21;
    public static final int _w = 22;
    public static final int _x = 23;
    public static final int _y = 24;
    public static final int _z = 25;
    public static boolean hasA = false;

    public static boolean hasB = false;

    public static boolean hasC = false;

    public static boolean hasD = false;

    public static boolean hasE = false;

    public static boolean hasF = false;

    public static boolean hasG = false;

    public static boolean hasH = false;

    public static boolean hasI = false;

    public static boolean hasJ = false;

    public static boolean hasK = false;

    public static boolean hasL = false;

    public static boolean hasM = false;

    public static boolean hasN = false;

    public static boolean hasO = false;

    public static boolean hasP = false;

    public static boolean hasQ = false;

    public static boolean hasR = false;

    public static boolean hasS = false;

    public static boolean hasT = false;

    public static boolean hasU = false;

    public static boolean hasV = false;

    public static boolean hasW = false;

    public static boolean hasX = false;

    public static boolean hasY = false;

    public static boolean hasZ = false;

    public static boolean hasAll = false;
    public static String correctKey;
    private boolean isSolved = false;
    
    public SubstitutionCracker2(String Cipher, String actualKey) {
        System.err.println("new SubstitutionCracker2(String Cipher);");
        key = new String[alphabet.length];
        cipher = charSet.removeIgnorers(Cipher, new String[]{" "});
        System.out.println(cipher);
        correctKey = new Metamorphose(actualKey).get_B();
        // that
        CipherEquivOfThat ciphEquiv = new CipherEquivOfThat(Cipher);
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
        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
        System.err.println(correctKey);
        new Scan1E();
        new Scan2O();
        new Scan3N();
        new Scan4I();
        new Scan5S();
        new Scan6R();
        new Scan7D();
        new Scan8L();
        new Scan9U();
        new Scan10M();
        new Scan11C();
        new Scan12F();
        new Scan13W();
        new Scan14G();
        new Scan15Y();
        new Scan16P();
        new Scan17B();
        new Scan18V();
        new Scan19K();
        new Scan20J();
        new Scan21X();
        new Scan22Z();
        new Scan23Q();
//Green: This commented code may be very useful. RED: DO NOT DELETE!

//
//
//        boolean[] has = new boolean[] { hasA, hasB, hasC, hasD, hasE, hasF, hasG, hasH, hasI, hasJ, hasK, hasL, hasM,
//                hasN, hasO, hasP, hasQ, hasR, hasS, hasT, hasU, hasV, hasW, hasX, hasY, hasZ };
//        boolean hasAll = true;
//        int numLacking = 0;
//        ArrayList<Integer> hasNot = new ArrayList<>();
//        for (int i = 0; i < has.length; i++) {
//            boolean Boolean = has[i];
//            if (!Boolean) {
//                hasNot.add(i);
//                numLacking++;
//                hasAll = false;
//            }
//        }
//
//        StringBuilder solver = new StringBuilder();
//        for (int index = 0; index < cipher.length(); index++) {
//            String Char = String.valueOf(cipher.charAt(index));
//            if (isIgnorer(Char)) {
//                solver.append(Char);
//            } else {
//                for (int keyIndex = 0; keyIndex < alphabet.length; keyIndex++) {
//                    if (Char.equalsIgnoreCase(String.valueOf(alphabet[keyIndex]))) {
//                        solver.append(key[keyIndex]);
//                        break;
//                    }
//                }
//            }
//        }
//        this.isSolved = true;
//        this.solved = solver.toString();

        System.err.println(Arrays.toString(this.key));
    }
    private boolean isIgnorer(String c) {
        boolean isIgnorer = false;
        for (char ignorer : ignorers) {
            if (String.valueOf(c).equalsIgnoreCase(String.valueOf(ignorer))) {
                isIgnorer = true;
                break;

            }
        }
        return isIgnorer;
    }

    private boolean thisChar_isNotAlreadyInTheKey(String betterNotAlreadyBeInTheKey) {
        boolean rtn = true;
        for (String keyChar : key) {
            if (keyChar != null) {
                if (keyChar.equalsIgnoreCase(betterNotAlreadyBeInTheKey)) {
                    rtn = false;
                    break;
                }
            }
        }
        return rtn;
    }

    static boolean massCalc_notAnyOther(String[] these, int[] spotsOfThese) {
        boolean rtn = true;
        boolean Break = false;
        for (int i = 0; i < these.length; i++) {
            if (!these[i].equalsIgnoreCase(key[spotsOfThese[i]])){
                rtn = false;
                break;
            }
        }

//        boolean rtn = true;
//        boolean Break = false;
//        for (int i = 0; i < these.length; i++) {
//            String ThisString = these[i];
//            int indexException = spotsOfThese[i];
//            for (int j = 0; j < key.length; j++) {
//                String KeyString = key[j];
//                if (KeyString != null) {
//                    if (KeyString.equalsIgnoreCase(ThisString) && j != indexException) {
//                        rtn = false;
//                        Break = true;
//                        break;
//                    }
//                }
//            }
//            if (Break) {
//                break;
//            }
//        }
        return rtn;
    }

    public static boolean notAnotherVowel(String a, int b) {
        boolean rtn = true;
        int[] c = new int[] { _a, _e, _i, _o, _u, _y };
        ArrayList<Integer> d = new ArrayList<>();
        for (int e : c) {
            if (e != b) {
                d.add(e);
            }
        }
        for (Integer f : d) {
            if (a.equalsIgnoreCase(key[f])) {
                rtn = false;
                break;
            }
        }
        return rtn;
    }

    private boolean equalsIgnoreCase_andNotAnyOther(String This, int onlyEquals_charAtThisIndex) {
        return This.equalsIgnoreCase(String.valueOf(key[onlyEquals_charAtThisIndex]))
                && notAnyOther(onlyEquals_charAtThisIndex);
    }

    private boolean notAnyOther(int except_charAtThisIndex) {
        String except = String.valueOf(key[except_charAtThisIndex]);
        boolean notAnyOther = true;
        for (int i = 0; i < key.length; i++) {
            String k = key[i];
            if (except_charAtThisIndex != i) {
                if (except.equalsIgnoreCase(k)) {
                    notAnyOther = false;
                    break;
                }
            }
        }
        return notAnyOther;
    }
    public ArrayList<String> getLettersInUse() {
        return lettersInUse;
    }

    public String[] getKey() {
        return key;
    }

    public String getSolved() {
        return solved;
    }

    public String getCipher() {
        return cipher;
    }

    public boolean isSolved() {
        return isSolved;
    }
    public static void main(String[] args) {
        test0();
        test1();
        test2();
        test3();
        test4();
    }
    private static void test4() {
        SubstitutionPair source = charSet.getCipher4();
        SubstitutionCracker2 test = new SubstitutionCracker2(source.getCipher(), source.getKey());
    }
    private static void test3() {
        SubstitutionPair source = charSet.getCipher3();
        SubstitutionCracker2 test = new SubstitutionCracker2(source.getCipher(), source.getKey());
    }
    private static void test2() {
        SubstitutionPair source = charSet.getCipher2();
        SubstitutionCracker2 test = new SubstitutionCracker2(source.getCipher(), source.getKey());
    }
    private static void test1() {
        SubstitutionPair source = charSet.getCipher1();
        SubstitutionCracker2 test = new SubstitutionCracker2(source.getCipher(), source.getKey());
    }
    private static void test0() {
        SubstitutionPair source = charSet.getCipher0();
        SubstitutionCracker2 test = new SubstitutionCracker2(source.getCipher(), source.getKey());
    }
}
