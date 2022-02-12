package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("LawOfDemeter")
public class SubstitutionCracker {
    private static final CharSet charSet = new CharSet();
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
        cipher = Cipher;

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
        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
        System.err.println(correctKey);

//        Scanner hat = new Scanner(cipher);
//        System.err.println("Scanner hat");
//        while (hat.hasNext()) {
//            String next = hat.next();
//            if (next.length() == 4) {
//                String first = String.valueOf(next.charAt(0));
//                String fourth = String.valueOf(next.charAt(3));
//                if (first.equalsIgnoreCase(fourth)) {
//                    System.err.println(next);
//                    key[_t] = String.valueOf(next.charAt(0)).toLowerCase();
//                    key[_h] = String.valueOf(next.charAt(1)).toLowerCase();
//                    key[_a] = String.valueOf(next.charAt(2)).toLowerCase();
//                    hasH = true;
//                    System.err.println("hasH = true;");
//                    hasA = true;
//                    System.err.println("hasA = true;");
//                    hasT = true;
//                    System.err.println("hasT = true;");
//                    hat.close();
//                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
//                    System.err.println(correctKey);
//
//                    break;
//                }
//            }
//        }
        // the
        Scanner e = new Scanner(cipher);
        System.err.println("Scanner e");

        while (e.hasNext()) {
            String next = e.next();
            if (next.length() == 3) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                if (first.equalsIgnoreCase(key[_t])) {
                    if (second.equalsIgnoreCase(key[_h])) {
                        key[_e] = third.toLowerCase();
                        hasE = true;
                        System.err.println("hasE = true;");
                        e.close();
                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                        System.err.println(correctKey);

                        break;
                    }
                }
            }
        }
        if (!hasE) {
            e.close();

            Scanner e_heat = new Scanner(cipher);
            System.err.println("Scanner e_heat ");
            while (e_heat.hasNext()) {
                String next = e_heat.next();
                if (next.length() == 4) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    if (first.equalsIgnoreCase(key[_h])) {
                        if (third.equalsIgnoreCase(key[_a])) {
                            if (fourth.equalsIgnoreCase(key[_t])) {
                                key[_e] = second.toLowerCase();
                                hasE = true;
                                System.err.println("hasE = true;");
                                e_heat.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }
            }
        }
        Scanner I = new Scanner(cipher);
        System.err.println("Scanner I");
        while (I.hasNext()) {
            String next = I.next();
            if (next.length() == 1 && !next.equalsIgnoreCase(key[_a])) {
                key[_i] = next.toLowerCase();
                hasI = true;
                System.err.println("hasI = true;");
                I.close();
                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                System.err.println(correctKey);

                break;
            }
        }
        // this
        Scanner s = new Scanner(cipher);
        System.err.println("Scanner s");
        while (s.hasNext()) {
            String next = s.next();
            if (next.length() == 4) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                if (first.equalsIgnoreCase(key[_t])) {
                    if (second.equalsIgnoreCase(key[_h])) {
                        if (third.equalsIgnoreCase(key[_i])) {
                            key[_s] = fourth.toLowerCase();
                            hasS = true;
                            System.err.println("hasS = true;");
                            s.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }
        }
        if (!hasS) {
            s.close();
            Scanner s_see = new Scanner(cipher);
            System.err.println("Scanner s_see ");
            while (s_see.hasNext()) {
                String next = s_see.next();
                if (next.length() == 4) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String letE = key[_e];
                    if (second.equalsIgnoreCase(letE)) {
                        if (third.equalsIgnoreCase(letE)) {
                            key[_s] = first.toLowerCase();
                            hasS = true;
                            System.err.println("hasS = true;");
                            s_see.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }
        }

        // was
        Scanner w = new Scanner(cipher);
        System.err.println("Scanner w");
        while (w.hasNext()) {
            String next = w.next();
            if (next.length() == 3) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                if (!first.equalsIgnoreCase(key[_h])) {
                    if (second.equalsIgnoreCase(key[_a])) {
                        if (third.equalsIgnoreCase(key[_s])) {
                            key[_w] = first.toLowerCase();
                            hasW = true;
                            System.err.println("hasW = true;");
                            System.err.println("via Scanner w");
                            w.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }
        }
        if (!hasW) {
            w.close();
            Scanner w_with = new Scanner(cipher);
            while (w_with.hasNext()) {
                String next = w_with.next();
                if (next.length() == 4) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    if (massCalc_notAnyOther(new String[] { second, third, fourth }, new int[] { _i, _t, _h })) {
                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                            key[_w] = first.toLowerCase();
                            hasW = true;
                            System.err.println("hasW = true;");
                            System.err.println("via Scanner w_with");
                            w_with.close();
                            break;
                        }
                    }
                }
            }

            if (!hasW) {
                w_with.close();
                Scanner w_we = new Scanner(cipher);
                while (w_we.hasNext()) {
                    String next = w_we.next();
                    if (next.length() == 2) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        if (massCalc_notAnyOther(new String[] { second }, new int[] { _e })) {
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                key[_w] = first.toLowerCase();
                                hasW = true;
                                System.err.println("hasW = true;");
                                System.err.println("via Scanner w_we");
                                w_we.close();
                                break;
                            }
                        }
                    }
                }

                if (!hasW) {
                    w_we.close();
                    Scanner w_what = new Scanner(cipher);
                    while (w_what.hasNext()) {
                        String next = w_what.next();
                        if (next.length() == 4) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            if (massCalc_notAnyOther(new String[] { second, third, fourth },
                                    new int[] { _h, _a, _t })) {
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                    key[_w] = first.toLowerCase();
                                    hasW = true;
                                    System.err.println("hasW = true;");
                                    System.err.println("via Scanner w_what");
                                    w_what.close();
                                    break;
                                }
                            }
                        }
                    }

                    if (!hasW) {
                        w_what.close();
                        Scanner w_saw = new Scanner(cipher);
                        while (w_saw.hasNext()) {
                            String next = w_saw.next();
                            if (next.length() == 3) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                if (massCalc_notAnyOther(new String[] { first, second }, new int[] { _s, _a })) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_w] = third.toLowerCase();
                                        hasW = true;
                                        System.err.println("hasW = true;");
                                        System.err.println("via Scanner w_saw");
                                        w_saw.close();
                                        break;
                                    }
                                }
                            }
                        }

                        if (!hasW) {
                            w_saw.close();
                            Scanner w_white = new Scanner(cipher);
                            while (w_white.hasNext()) {
                                String next = w_white.next();
                                if (next.length() == 5) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                            new int[] { _h, _i, _t, _e })) {
                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                            key[_w] = first.toLowerCase();
                                            hasW = true;
                                            System.err.println("hasW = true;");
                                            System.err.println("via Scanner w_white");
                                            w_white.close();
                                            break;
                                        }
                                    }
                                }
                            }

                            if (!hasW) {
                                w_white.close();
                                Scanner w_wish = new Scanner(cipher);
                                while (w_wish.hasNext()) {
                                    String next = w_wish.next();
                                    if (next.length() == 4) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        if (massCalc_notAnyOther(new String[] { second, third, fourth },
                                                new int[] { _i, _s, _h })) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_w] = first.toLowerCase();
                                                hasW = true;
                                                System.err.println("hasW = true;");
                                                System.err.println("via Scanner w_wish");
                                                w_wish.close();
                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!hasW) {
                                    w_wish.close();
                                    Scanner w_wait = new Scanner(cipher);
                                    while (w_wait.hasNext()) {
                                        String next = w_wait.next();
                                        if (next.length() == 4) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            if (massCalc_notAnyOther(new String[] { second, third, fourth },
                                                    new int[] { _a, _i, _t })) {
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                    key[_w] = first.toLowerCase();
                                                    hasW = true;
                                                    System.err.println("hasW = true;");
                                                    System.err.println("via Scanner w_wait");
                                                    w_wait.close();
                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!hasW) {
                                        w_wait.close();
                                        Scanner w_west = new Scanner(cipher);
                                        while (w_west.hasNext()) {
                                            String next = w_west.next();
                                            if (next.length() == 4) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                if (massCalc_notAnyOther(new String[] { second, third, fourth },
                                                        new int[] { _e, _s, _t })) {
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                        key[_w] = first.toLowerCase();
                                                        hasW = true;
                                                        System.err.println("hasW = true;");
                                                        System.err.println("via Scanner w_west");
                                                        w_west.close();
                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (!hasW) {
                                            w_west.close();
                                            Scanner w_wet = new Scanner(cipher);
                                            while (w_wet.hasNext()) {
                                                String next = w_wet.next();
                                                if (next.length() == 3) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    if (massCalc_notAnyOther(new String[] { second, third },
                                                            new int[] { _e, _t })) {
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                            key[_w] = first.toLowerCase();
                                                            hasW = true;
                                                            System.err.println("hasW = true;");
                                                            System.err.println("via Scanner w_wet");
                                                            w_wet.close();
                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!hasW) {
                                                w_wet.close();
                                                Scanner w_whites = new Scanner(cipher);
                                                while (w_whites.hasNext()) {
                                                    String next = w_whites.next();
                                                    if (next.length() == 6) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        String fifth = String.valueOf(next.charAt(4));
                                                        String sixth = String.valueOf(next.charAt(5));
                                                        if (massCalc_notAnyOther(
                                                                new String[] { second, third, fourth, fifth, sixth },
                                                                new int[] { _h, _i, _t, _e, _s })) {
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                key[_w] = first.toLowerCase();
                                                                hasW = true;
                                                                System.err.println("hasW = true;");
                                                                System.err.println("via Scanner w_whites");
                                                                w_whites.close();
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (!hasW) {
                                                    w_whites.close();
                                                    Scanner w_wishes = new Scanner(cipher);
                                                    while (w_wishes.hasNext()) {
                                                        String next = w_wishes.next();
                                                        if (next.length() == 6) {
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));
                                                            String fourth = String.valueOf(next.charAt(3));
                                                            String fifth = String.valueOf(next.charAt(4));
                                                            String sixth = String.valueOf(next.charAt(5));
                                                            if (massCalc_notAnyOther(
                                                                    new String[] { second, third, fourth, fifth,
                                                                            sixth },
                                                                    new int[] { _i, _s, _h, _e, _s })) {
                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                    key[_w] = first.toLowerCase();
                                                                    hasW = true;
                                                                    System.err.println("hasW = true;");
                                                                    System.err.println("via Scanner w_wishes");
                                                                    w_wishes.close();
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (!hasW) {
                                                        w_wishes.close();
                                                        Scanner w_wise = new Scanner(cipher);
                                                        while (w_wise.hasNext()) {
                                                            String next = w_wise.next();
                                                            if (next.length() == 4) {
                                                                String first = String.valueOf(next.charAt(0));
                                                                String second = String.valueOf(next.charAt(1));
                                                                String third = String.valueOf(next.charAt(2));
                                                                String fourth = String.valueOf(next.charAt(3));
                                                                if (massCalc_notAnyOther(
                                                                        new String[] { second, third, fourth },
                                                                        new int[] { _i, _s, _e })) {
                                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                        key[_w] = first.toLowerCase();
                                                                        hasW = true;
                                                                        System.err.println("hasW = true;");
                                                                        System.err.println("via Scanner w_wise");
                                                                        w_wise.close();
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (!hasW) {
                                                            w_wise.close();
                                                            Scanner w_hawaii = new Scanner(cipher);
                                                            while (w_hawaii.hasNext()) {
                                                                String next = w_hawaii.next();
                                                                if (next.length() == 6) {
                                                                    String first = String.valueOf(next.charAt(0));
                                                                    String second = String.valueOf(next.charAt(1));
                                                                    String third = String.valueOf(next.charAt(2));
                                                                    String fourth = String.valueOf(next.charAt(3));
                                                                    String fifth = String.valueOf(next.charAt(4));
                                                                    String sixth = String.valueOf(next.charAt(5));
                                                                    if (massCalc_notAnyOther(
                                                                            new String[] { first, second, fourth, fifth,
                                                                                    sixth },
                                                                            new int[] { _h, _a, _a, _i, _i })) {
                                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                            key[_w] = third.toLowerCase();
                                                                            hasW = true;
                                                                            System.err.println("hasW = true;");
                                                                            System.err.println("via Scanner w_hawaii");
                                                                            w_hawaii.close();
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            if (!hasW) {
                                                                w_hawaii.close();
                                                                Scanner w_sweet = new Scanner(cipher);
                                                                while (w_sweet.hasNext()) {
                                                                    String next = w_sweet.next();
                                                                    if (next.length() == 5) {
                                                                        String first = String.valueOf(next.charAt(0));
                                                                        String second = String.valueOf(next.charAt(1));
                                                                        String third = String.valueOf(next.charAt(2));
                                                                        String fourth = String.valueOf(next.charAt(3));
                                                                        String fifth = String.valueOf(next.charAt(4));
                                                                        if (massCalc_notAnyOther(
                                                                                new String[] { first, third, fourth,
                                                                                        fifth },
                                                                                new int[] { _s, _e, _e, _t })) {
                                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                key[_w] = second.toLowerCase();
                                                                                hasW = true;
                                                                                System.err.println("hasW = true;");
                                                                                System.err
                                                                                        .println("via Scanner w_sweet");
                                                                                w_sweet.close();
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // were
        Scanner r = new Scanner(cipher);
        System.err.println("Scanner r");
        while (r.hasNext()) {
            String next = r.next();
            if (next.length() == 4) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                if (equalsIgnoreCase_andNotAnyOther(first, _w)) {
                    if (equalsIgnoreCase_andNotAnyOther(second, _e) && equalsIgnoreCase_andNotAnyOther(fourth, _e)) {
                        key[_r] = third.toLowerCase();
                        hasR = true;
                        System.err.println("hasR = true;");
                        r.close();
                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                        System.err.println(correctKey);

                        break;
                    }
                }
            }
        }
        // there
        if (!hasR) {
            r.close();

            Scanner r_there = new Scanner(cipher);
            System.err.println("Scanner r_there ");
            while (r_there.hasNext()) {
                String next = r_there.next();
                if (next.length() == 5) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    String fifth = String.valueOf(next.charAt(4));
                    // if (massCalc_notAnyOther(new String[] { first, second, third, fifth },
                    // new int[] { _t, _h, _e, _e })) {
                    if (first.equalsIgnoreCase(key[_t]) && second.equalsIgnoreCase(key[_h])
                            && third.equalsIgnoreCase(key[_e]) && fifth.equalsIgnoreCase(key[_e])) {
                        if (!fourth.equalsIgnoreCase(key[_s])) { //eliminate "these"
                            key[_r] = fourth.toLowerCase();
                            hasR = true;
                            //jhewe
                            System.err.println("hasR = true;");
                            r_there.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                    // }
                }
            }
            if (!hasR) {
                r_there.close();
                Scanner r_their = new Scanner(cipher);
                System.err.println("Scanner r_their");
                while (r_their.hasNext()) {
                    String next = r_their.next();
                    if (next.length() == 5) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        String fifth = String.valueOf(next.charAt(4));
                        if (massCalc_notAnyOther(new String[] { first, second, third, fourth },
                                new int[] { _t, _h, _e, _i })) {
                            key[_r] = fifth.toLowerCase();
                            hasR = true;
                            System.err.println("hasR = true;");
                            r_their.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
                if (!hasR) {
                    r_their.close();

                }
            }
        }
        // have
        Scanner v = new Scanner(cipher);
        System.err.println("Scanner v ");
        while (v.hasNext()) {
            String next = v.next();
            if (next.length() == 4) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                if (equalsIgnoreCase_andNotAnyOther(first, _h)) {
                    if (equalsIgnoreCase_andNotAnyOther(second, _a)) {
                        if (equalsIgnoreCase_andNotAnyOther(fourth, _e)) {
                            key[_v] = third.toLowerCase();
                            hasV = true;
                            System.err.println("hasV = " + hasV + ";");
                            v.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }
        }
        if (!hasV) {
            v.close();
            Scanner v_river = new Scanner(cipher);
            System.err.println("Scanner v_river");
            while (v_river.hasNext()) {
                String next = v_river.next();
                if (next.length() == 5) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    String fifth = String.valueOf(next.charAt(4));
                    if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                            new int[] { _r, _i, _e, _r })) {
                        key[_v] = third.toLowerCase();
                        hasV = true;
                        System.err.println("hasV = " + hasV + ";");
                        v_river.close();
                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                        System.err.println(correctKey);

                        break;
                    }
                }
            }
            if (!hasV) {
                v_river.close();
                Scanner v_ever = new Scanner(cipher);
                System.err.println("Scanner v_ever");
                while (v_ever.hasNext()) {
                    String next = v_ever.next();
                    if (next.length() == 4) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        if (massCalc_notAnyOther(new String[] { first, third, fourth }, new int[] { _e, _e, _r })) {
                            key[_v] = second.toLowerCase();
                            hasV = true;
                            System.err.println("hasV = " + hasV + ";");
                            v_ever.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                        }
                    }
                }
                if (!hasV) {
                    v_ever.close();
                    Scanner v_serve = new Scanner(cipher);
                    System.err.println("Scanner v_serve");
                    while (v_serve.hasNext()) {
                        String next = v_serve.next();
                        if (next.length() == 5) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            if (massCalc_notAnyOther(new String[] { first, second, third, fifth },
                                    new int[] { _s, _e, _r, _e })) {
                                key[_v] = fourth.toLowerCase();
                                v_serve.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                hasV = true;
                                System.err.println("hasV = " + hasV + ";");
                                break;
                            }
                        }
                    }
                    if (!hasV) {
                        v_ever.close();
                    }
                }
            }
        }
        // very
        Scanner y = new Scanner(cipher);
        System.err.println("Scanner y");
        while (y.hasNext()) {
            String next = y.next();
            if (next.length() == 4) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                if (equalsIgnoreCase_andNotAnyOther(first, 21)) {
                    if (equalsIgnoreCase_andNotAnyOther(second, 4)) {
                        if (equalsIgnoreCase_andNotAnyOther(third, 17)) {
                            key[_y] = fourth.toLowerCase();
                            hasY = true;
                            System.err.println("hasY = true;");
                            y.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }
        }
        // when
        Scanner n = new Scanner(cipher);
        System.err.println("Scanner n");
        while (n.hasNext()) {
            String next = n.next();
            if (next.length() == 4) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                // if (equalsIgnoreCase_andNotAnyOther(first, _w)) {
                // if (equalsIgnoreCase_andNotAnyOther(second, _h)) {
                // if (equalsIgnoreCase_andNotAnyOther(third, _e)) {
                if (first.equalsIgnoreCase(key[_w])) {
                    if (second.equalsIgnoreCase(key[_h])) {
                        if (third.equalsIgnoreCase(key[_e])) {
                            if (!fourth.equalsIgnoreCase(key[_y])) {
                                key[_n] = fourth.toLowerCase();
                                hasN = true;
                                System.err.println("hasN = true;");
                                n.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!hasN) {
            Scanner n_never = new Scanner(cipher);

            while (n_never.hasNext()) {
                String next = n_never.next();
                if (next.length() == 5) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    String fifth = String.valueOf(next.charAt(4));
                    if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                            new int[] { _e, _v, _e, _r })) {
                        key[_n] = first.toLowerCase();
                        hasN = true;
                        System.err.println("hasN = true;");
                        n_never.close();
                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                        System.err.println(correctKey);

                        break;
                    }
                }
            }
            if (!hasN) {
                n_never.close();

            }
        }
        // them
        Scanner m = new Scanner(cipher);

        while (m.hasNext()) {
            String next = m.next();
            if (next.length() == 4) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                if (equalsIgnoreCase_andNotAnyOther(first, 19)) {
                    if (equalsIgnoreCase_andNotAnyOther(second, 7)) {
                        if (equalsIgnoreCase_andNotAnyOther(third, 4)) {
                            if (!fourth.equalsIgnoreCase(key[_y])) {
                                if (!fourth.equalsIgnoreCase(key[_n])) {
                                    key[_m] = fourth.toLowerCase();
                                    hasM = true;
                                    System.err.println("hasM = true;");
                                    System.err.println("via Scanner m");
                                    m.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }

                    }
                }
            }
        }
        if (!hasM) {
            m.close();
            Scanner m_time = new Scanner(cipher);

            while (m_time.hasNext()) {
                String next = m_time.next();
                if (next.length() == 4) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    if (massCalc_notAnyOther(new String[] { first, second, fourth }, new int[] { _t, _i, _e })) {
                        key[_m] = third.toLowerCase();
                        hasM = true;
                        System.err.println("hasM = true;");
                        System.err.println("via Scanner m_time");

                        m_time.close();
                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                        System.err.println(correctKey);

                        break;
                    }
                }
            }
        }
        // will
        Scanner l = new Scanner(cipher);

        while (l.hasNext()) {
            String next = l.next();
            if (next.length() == 4) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                if (equalsIgnoreCase_andNotAnyOther(first, 22)) {
                    if (equalsIgnoreCase_andNotAnyOther(second, 8)) {
                        if (third.equalsIgnoreCase(fourth)) {
                            key[_l] = fourth.toLowerCase();
                            hasL = true;
                            System.err.println("hasL = true;");
                            l.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }
        }
        if (!hasL) {
            l.close();
            Scanner l_all = new Scanner(cipher);

            while (l_all.hasNext()) {
                String next = l_all.next();
                if (next.length() == 3) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    if (first.equalsIgnoreCase(key[_a])) {
                        if (second.equalsIgnoreCase(third)) {
                            key_hasNot khn = new key_hasNot(key, second);
                            if (khn.hasNot()) {
                                key[_l] = second.toLowerCase();
                                hasL = true;
                                System.err.println("hasL = true;");
                                l_all.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);
                                break;
                            }
                        }
                    }
                }
            }
            if (!hasL) {
                l_all.close();
                Scanner l_little = new Scanner(cipher);

                while (l_little.hasNext()) {
                    String next = l_little.next();
                    if (next.length() == 6) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        String fifth = String.valueOf(next.charAt(4));
                        String sixth = String.valueOf(next.charAt(5));
                        if (first.equalsIgnoreCase(fifth)) {
                            if (third.equalsIgnoreCase(fourth)) {
                                if (massCalc_notAnyOther(new String[] { second, third, fourth, sixth },
                                        new int[] { _i, _t, _t, _e })) {
                                    key[_l] = fifth.toLowerCase();
                                    hasL = true;
                                    System.err.println("hasL = true;");
                                    l_little.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }
                }
                if (!hasL) {
                    l_little.close();
                    Scanner l_small = new Scanner(cipher);

                    while (l_small.hasNext()) {
                        String next = l_small.next();
                        if (next.length() == 5) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            if (fourth.equalsIgnoreCase(fifth)) {
                                if (massCalc_notAnyOther(new String[] { first, second, third },
                                        new int[] { _s, _m, _a })) {
                                    key[_l] = fifth.toLowerCase();
                                    hasL = true;
                                    System.err.println("hasL = true;");
                                    l_small.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }
                    if (!hasL) {
                        Scanner l_later = new Scanner(cipher);

                        while (l_later.hasNext()) {
                            String next = l_later.next();
                            if (next.length() == 5) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                        new int[] { _a, _t, _e, _r })) {
                                    key[_l] = first.toLowerCase();
                                    hasL = true;
                                    System.err.println("hasL = true;");
                                    l_later.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                        if (!hasL) {
                            l_later.close();
                            Scanner l_learn = new Scanner(cipher);

                            while (l_learn.hasNext()) {
                                String next = l_learn.next();
                                if (next.length() == 5) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                            new int[] { _e, _a, _r, _n })) {
                                        key[_l] = first.toLowerCase();
                                        hasL = true;
                                        System.err.println("hasL = true;");
                                        l_learn.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                            if (!hasL) {
                                l_learn.close();
                                Scanner l_leave = new Scanner(cipher);

                                while (l_leave.hasNext()) {
                                    String next = l_leave.next();
                                    if (next.length() == 5) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));
                                        if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                                new int[] { _e, _a, _v, _e })) {
                                            key[_l] = first.toLowerCase();
                                            hasL = true;
                                            System.err.println("hasL = true;");
                                            l_leave.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
                                    }
                                }
                                if (!hasL) {
                                    l_leave.close();

                                }
                            }
                        }

                    }
                }
            }
        }

        // green
        Scanner g = new Scanner(cipher);

        while (g.hasNext()) {
            String next = g.next();
            if (next.length() == 5) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                String fifth = String.valueOf(next.charAt(4));
                if (equalsIgnoreCase_andNotAnyOther(second, 17)) {
                    if (equalsIgnoreCase_andNotAnyOther(third, 4) && equalsIgnoreCase_andNotAnyOther(fourth, 4)) {
                        if (equalsIgnoreCase_andNotAnyOther(fifth, 13)) {
                            key[_g] = first.toLowerCase();
                            hasG = true;
                            System.err.println("hasG = true;");
                            g.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }
        }
        if (!hasG) {
            g.close();
            Scanner g_revenge = new Scanner(cipher);

            while (g_revenge.hasNext()) {
                String next = g_revenge.next();
                if (next.length() == 7) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    String fifth = String.valueOf(next.charAt(4));
                    String sixth = String.valueOf(next.charAt(5));
                    String seventh = String.valueOf(next.charAt(6));
                    if (massCalc_notAnyOther(new String[] { first, second, third, fourth, fifth, seventh },
                            new int[] { _r, _e, _v, _e, _n, _e })) {
                        key[_g] = sixth.toLowerCase();
                        hasG = true;
                        System.err.println("hasG = true;");
                        g_revenge.close();
                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                        System.err.println(correctKey);

                        break;
                    }
                }
            }
            if (!hasG) {
                g_revenge.close();
                Scanner g_great = new Scanner(cipher);

                while (g_great.hasNext()) {
                    String next = g_great.next();
                    if (next.length() == 5) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        String fifth = String.valueOf(next.charAt(4));
                        if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                new int[] { _r, _e, _a, _t })) {
                            key[_g] = first.toLowerCase();
                            hasG = true;
                            System.err.println("hasG = true;");
                            g_great.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
                if (!hasG) {
                    g_great.close();
                    Scanner g_large = new Scanner(cipher);

                    while (g_large.hasNext()) {
                        String next = g_large.next();
                        if (next.length() == 5) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            if (massCalc_notAnyOther(new String[] { first, second, third, fifth },
                                    new int[] { _l, _a, _r, _e })) {
                                key[_g] = fourth.toLowerCase();
                                hasG = true;
                                System.err.println("hasG = true;");
                                g_large.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                    if (!hasG) {
                        g_large.close();
                        Scanner g_light = new Scanner(cipher);

                        while (g_light.hasNext()) {
                            String next = g_light.next();
                            if (next.length() == 5) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                                        new int[] { _l, _i, _h, _t })) {
                                    key[_g] = third.toLowerCase();
                                    hasG = true;
                                    System.err.println("hasG = true;");
                                    g_light.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                        if (!hasG) {
                            g_light.close();
                            Scanner g_right = new Scanner(cipher);

                            while (g_right.hasNext()) {
                                String next = g_right.next();
                                if (next.length() == 5) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                                            new int[] { _r, _i, _h, _t })) {
                                        key[_g] = third.toLowerCase();
                                        hasG = true;
                                        System.err.println("hasG = true;");
                                        g_right.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                            if (!hasG) {
                                g_right.close();
                                Scanner g_might = new Scanner(cipher);

                                while (g_might.hasNext()) {
                                    String next = g_might.next();
                                    if (next.length() == 5) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));
                                        if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                                                new int[] { _m, _i, _h, _t })) {
                                            key[_g] = third.toLowerCase();
                                            hasG = true;
                                            System.err.println("hasG = true;");
                                            g_might.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
                                    }
                                }
                                if (!hasG) {
                                    g_might.close();
                                    Scanner g_night = new Scanner(cipher);

                                    while (g_night.hasNext()) {
                                        String next = g_night.next();
                                        if (next.length() == 5) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));
                                            if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                                                    new int[] { _n, _i, _h, _t })) {
                                                key[_g] = third.toLowerCase();
                                                hasG = true;
                                                System.err.println("hasG = true;");
                                                g_night.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }

                                }
                            }
                        }

                    }
                }
            }
        }
        // best
        Scanner b = new Scanner(cipher);

        while (b.hasNext()) {
            String next = b.next();
            if (next.length() == 4) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                if (!first.equalsIgnoreCase(fourth) && !first.equalsIgnoreCase(key[_w])) {
                    if (second.equalsIgnoreCase(key[_e])) {
                        if (third.equalsIgnoreCase(key[_s])) {
                            if (fourth.equalsIgnoreCase(key[_t])) {
                                key[_b] = first.toLowerCase();
                                hasB = true;
                                System.err.println("hasB = true;");
                                System.err.println("via Scanner b");
                                System.err.println(next);
                                b.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!hasB) {
            b.close();
            Scanner b_table = new Scanner(cipher);

            while (b_table.hasNext()) {
                String next = b_table.next();
                if (next.length() == 5) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    String fifth = String.valueOf(next.charAt(4));
//                    if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
//                            new int[] { _t, _a, _l, _e })) {
                    if (first.equalsIgnoreCase(key[_t])) {
                        if (second.equalsIgnoreCase(key[_a])) {
                            if (fourth.equalsIgnoreCase(key[_l])) {
                                if (fifth.equalsIgnoreCase(key[_e])) {
                                    key[_b] = third.toLowerCase();
                                    hasB = true;
                                    //jf_ue
                                    //jfdue = correct
                                    //jfwue = wron
                                    System.err.println("hasB = true;");
                                    System.err.println("via Scanner b_table");
                                    b_table.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (!hasB) {
                b_table.close();
                Scanner b_bring = new Scanner(cipher);

                while (b_bring.hasNext()) {
                    String next = b_bring.next();
                    if (next.length() == 5) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        String fifth = String.valueOf(next.charAt(4));
                        if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                new int[] { _r, _i, _n, _g })) {
                            key[_b] = first.toLowerCase();
                            hasB = true;
                            //_qsin
                            //yqsin = wrong
                            //dqsin = right
                            System.err.println("hasB = true;");
                            System.err.println("via Scanner b_bring");
                            b_bring.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
                if (!hasB) {
                    b_bring.close();
                    Scanner b_began = new Scanner(cipher);

                    while (b_began.hasNext()) {
                        String next = b_began.next();
                        if (next.length() == 5) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                    new int[] { _e, _g, _a, _n })) {
                                key[_b] = first.toLowerCase();
                                hasB = true;
                                System.err.println("hasB = true;");
                                System.err.println("via Scanner b_began");
                                b_began.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                    if (!hasB) {
                        b_began.close();
                        Scanner b_begin = new Scanner(cipher);

                        while (b_begin.hasNext()) {
                            String next = b_begin.next();
                            if (next.length() == 5) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                        new int[] { _e, _g, _i, _n })) {
                                    key[_b] = first.toLowerCase();
                                    hasB = true;
                                    System.err.println("hasB = true;");
                                    System.err.println("via Scanner b_begin");
                                    b_begin.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }
                }
            }

        }

        if (!hasD) {

            Scanner d_and = new Scanner(cipher);

            while (d_and.hasNext()) {
                String next = d_and.next();
                if (next.length() == 3) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    if (massCalc_notAnyOther(new String[] { first, second }, new int[] { _a, _n })) {
                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                            key[_d] = third.toLowerCase();
                            hasD = true;
                            System.err.println("hasD = true;");
                            System.err.println("via Scanner d_and");
                            d_and.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }

            if (!hasD) {
                d_and.close();
                Scanner d_had = new Scanner(cipher);

                while (d_had.hasNext()) {
                    String next = d_had.next();
                    if (next.length() == 3) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        if (massCalc_notAnyOther(new String[] { first, second }, new int[] { _h, _a })) {
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                key[_d] = third.toLowerCase();
                                hasD = true;
                                System.err.println("hasD = true;");
                                System.err.println("via Scanner d_had");
                                d_had.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }

                if (!hasD) {
                    d_had.close();
                    Scanner d_said = new Scanner(cipher);

                    while (d_said.hasNext()) {
                        String next = d_said.next();
                        if (next.length() == 4) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            if (massCalc_notAnyOther(new String[] { first, second, third }, new int[] { _s, _a, _i })) {
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                    key[_d] = fourth.toLowerCase();
                                    hasD = true;
                                    System.err.println("hasD = true;");
                                    System.err.println("via Scanner d_said");
                                    d_said.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }

                    if (!hasD) {
                        d_said.close();
                        Scanner d_did = new Scanner(cipher);

                        while (d_did.hasNext()) {
                            String next = d_did.next();
                            if (next.length() == 3) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                if (massCalc_notAnyOther(new String[] { second }, new int[] { _i })) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_d] = first.toLowerCase();
                                        hasD = true;
                                        System.err.println("hasD = true;");
                                        System.err.println("via Scanner d_did");
                                        d_did.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                        }

                        if (!hasD) {
                            d_did.close();
                            Scanner d_made = new Scanner(cipher);

                            while (d_made.hasNext()) {
                                String next = d_made.next();
                                if (next.length() == 4) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    if (massCalc_notAnyOther(new String[] { first, second, fourth },
                                            new int[] { _m, _a, _e })) {
                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                            key[_d] = third.toLowerCase();
                                            hasD = true;
                                            System.err.println("hasD = true;");
                                            System.err.println("via Scanner d_made");
                                            d_made.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
                                    }
                                }
                            }

                            if (!hasD) {
                                d_made.close();
                                Scanner d_seemed = new Scanner(cipher);

                                while (d_seemed.hasNext()) {
                                    String next = d_seemed.next();
                                    if (next.length() == 6) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));
                                        String sixth = String.valueOf(next.charAt(5));
                                        if (massCalc_notAnyOther(new String[] { first, second, third, fourth, fifth },
                                                new int[] { _s, _e, _e, _m, _e })) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_d] = sixth.toLowerCase();
                                                hasD = true;
                                                System.err.println("hasD = true;");
                                                System.err.println("via Scanner d_seemed");
                                                d_seemed.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!hasD) {
                                    d_seemed.close();
                                    Scanner d_head = new Scanner(cipher);

                                    while (d_head.hasNext()) {
                                        String next = d_head.next();
                                        if (next.length() == 4) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            if (massCalc_notAnyOther(new String[] { first, second, third },
                                                    new int[] { _h, _e, _a })) {
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                    key[_d] = fourth.toLowerCase();
                                                    hasD = true;
                                                    System.err.println("hasD = true;");
                                                    System.err.println("via Scanner d_head");
                                                    d_head.close();
                                                    System.err.println(
                                                            (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                    System.err.println(correctKey);

                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!hasD) {
                                        d_head.close();
                                        Scanner d_heard = new Scanner(cipher);

                                        while (d_heard.hasNext()) {
                                            String next = d_heard.next();
                                            if (next.length() == 5) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                String fifth = String.valueOf(next.charAt(4));
                                                if (massCalc_notAnyOther(new String[] { first, second, third, fourth },
                                                        new int[] { _h, _e, _a, _r })) {
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                        key[_d] = fifth.toLowerCase();
                                                        hasD = true;
                                                        System.err.println("hasD = true;");
                                                        System.err.println("via Scanner d_heard");
                                                        d_heard.close();
                                                        System.err.println((Arrays.toString(key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(correctKey);

                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (!hasD) {
                                            d_heard.close();
                                            Scanner d_day = new Scanner(cipher);

                                            while (d_day.hasNext()) {
                                                String next = d_day.next();
                                                if (next.length() == 3) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    if (massCalc_notAnyOther(new String[] { second, third },
                                                            new int[] { _a, _y })) {
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                            key[_d] = first.toLowerCase();
                                                            hasD = true;
                                                            System.err.println("hasD = true;");
                                                            System.err.println("via Scanner d_day");
                                                            d_day.close();
                                                            System.err.println((Arrays.toString(key))
                                                                    .replaceAll("null", "\u0000"));
                                                            System.err.println(correctKey);

                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!hasD) {
                                                d_day.close();
                                                Scanner d_andrew = new Scanner(cipher);

                                                while (d_andrew.hasNext()) {
                                                    String next = d_andrew.next();
                                                    if (next.length() == 6) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        String fifth = String.valueOf(next.charAt(4));
                                                        String sixth = String.valueOf(next.charAt(5));
                                                        if (massCalc_notAnyOther(
                                                                new String[] { first, second, fourth, fifth, sixth },
                                                                new int[] { _a, _n, _r, _e, _w })) {
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                key[_d] = third.toLowerCase();
                                                                hasD = true;
                                                                System.err.println("hasD = true;");
                                                                System.err.println("via Scanner d_andrew");
                                                                d_andrew.close();
                                                                System.err.println((Arrays.toString(key))
                                                                        .replaceAll("null", "\u0000"));
                                                                System.err.println(correctKey);

                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (!hasD) {
                                                    d_andrew.close();
                                                    Scanner d_hand = new Scanner(cipher);

                                                    while (d_hand.hasNext()) {
                                                        String next = d_hand.next();
                                                        if (next.length() == 4) {
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));
                                                            String fourth = String.valueOf(next.charAt(3));
                                                            if (massCalc_notAnyOther(
                                                                    new String[] { first, second, third },
                                                                    new int[] { _h, _a, _n })) {
                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                    key[_d] = fourth.toLowerCase();
                                                                    hasD = true;
                                                                    System.err.println("hasD = true;");
                                                                    System.err.println("via Scanner d_hand");
                                                                    d_hand.close();
                                                                    System.err.println((Arrays.toString(key))
                                                                            .replaceAll("null", "\u0000"));
                                                                    System.err.println(correctKey);

                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (!hasD) {
                                                        d_hand.close();
                                                        Scanner d_behind = new Scanner(cipher);

                                                        while (d_behind.hasNext()) {
                                                            String next = d_behind.next();
                                                            if (next.length() == 6) {
                                                                String first = String.valueOf(next.charAt(0));
                                                                String second = String.valueOf(next.charAt(1));
                                                                String third = String.valueOf(next.charAt(2));
                                                                String fourth = String.valueOf(next.charAt(3));
                                                                String fifth = String.valueOf(next.charAt(4));
                                                                String sixth = String.valueOf(next.charAt(5));
                                                                if (massCalc_notAnyOther(
                                                                        new String[] { first, second, third, fourth,
                                                                                fifth },
                                                                        new int[] { _b, _e, _h, _i, _n })) {
                                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                        key[_d] = sixth.toLowerCase();
                                                                        hasD = true;
                                                                        System.err.println("hasD = true;");
                                                                        System.err.println("via Scanner d_behind");
                                                                        d_behind.close();
                                                                        System.err.println((Arrays.toString(key))
                                                                                .replaceAll("null", "\u0000"));
                                                                        System.err.println(correctKey);

                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (!hasD) {
                                                            d_behind.close();
                                                            Scanner d_already = new Scanner(cipher);

                                                            while (d_already.hasNext()) {
                                                                String next = d_already.next();
                                                                if (next.length() == 7) {
                                                                    String first = String.valueOf(next.charAt(0));
                                                                    String second = String.valueOf(next.charAt(1));
                                                                    String third = String.valueOf(next.charAt(2));
                                                                    String fourth = String.valueOf(next.charAt(3));
                                                                    String fifth = String.valueOf(next.charAt(4));
                                                                    String sixth = String.valueOf(next.charAt(5));
                                                                    String seventh = String.valueOf(next.charAt(6));
                                                                    if (massCalc_notAnyOther(
                                                                            new String[] { first, second, third, fourth,
                                                                                    fifth, seventh },
                                                                            new int[] { _a, _l, _r, _e, _a, _y })) {
                                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                            key[_d] = sixth.toLowerCase();
                                                                            hasD = true;
                                                                            System.err.println("hasD = true;");
                                                                            System.err.println("via Scanner d_already");
                                                                            d_already.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(key))
                                                                                            .replaceAll("null",
                                                                                                    "\u0000"));
                                                                            System.err.println(correctKey);

                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            if (!hasD) {
                                                                d_already.close();
                                                                Scanner d_dear = new Scanner(cipher);

                                                                while (d_dear.hasNext()) {
                                                                    String next = d_dear.next();
                                                                    if (next.length() == 4) {
                                                                        String first = String.valueOf(next.charAt(0));
                                                                        String second = String.valueOf(next.charAt(1));
                                                                        String third = String.valueOf(next.charAt(2));
                                                                        String fourth = String.valueOf(next.charAt(3));
                                                                        if (massCalc_notAnyOther(
                                                                                new String[] { second, third, fourth },
                                                                                new int[] { _e, _a, _r })) {
                                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                key[_d] = first.toLowerCase();
                                                                                hasD = true;
                                                                                System.err.println("hasD = true;");
                                                                                System.err.println("via Scanner d_dear");
                                                                                d_dear.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(key))
                                                                                                .replaceAll("null",
                                                                                                        "\u0000"));
                                                                                System.err.println(correctKey);

                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                                if (!hasD) {
                                                                    d_dear.close();
                                                                    Scanner d_side = new Scanner(cipher);

                                                                    while (d_side.hasNext()) {
                                                                        String next = d_side.next();
                                                                        if (next.length() == 4) {
                                                                            String first = String
                                                                                    .valueOf(next.charAt(0));
                                                                            String second = String
                                                                                    .valueOf(next.charAt(1));
                                                                            String third = String
                                                                                    .valueOf(next.charAt(2));
                                                                            String fourth = String
                                                                                    .valueOf(next.charAt(3));
                                                                            if (massCalc_notAnyOther(
                                                                                    new String[] { first, second,
                                                                                            fourth },
                                                                                    new int[] { _s, _i, _e })) {
                                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                    key[_d] = third.toLowerCase();
                                                                                    hasD = true;
                                                                                    System.err.println("hasD = true;");
                                                                                    System.err.println("via Scanner d_side");
                                                                                    d_side.close();
                                                                                    System.err.println(
                                                                                            (Arrays.toString(key))
                                                                                                    .replaceAll("null",
                                                                                                            "\u0000"));
                                                                                    System.err.println(correctKey);

                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // order
        Scanner o = new Scanner(cipher);

        while (o.hasNext()) {
            String next = o.next();
            if (next.length() == 5) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                String fifth = String.valueOf(next.charAt(4));
                if (equalsIgnoreCase_andNotAnyOther(second, _r)) {
                    if (equalsIgnoreCase_andNotAnyOther(third, _d)) {
                        if (equalsIgnoreCase_andNotAnyOther(fourth, _e)) {
                            if (equalsIgnoreCase_andNotAnyOther(fifth, _r)) {
                                key[_o] = first.toLowerCase();
                                hasO = true;
                                System.err.println("hasO = true;");
                                System.err.println("via Scanner o");
                                o.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!hasO) {
            o.close();
            Scanner o_not = new Scanner(cipher);

            while (o_not.hasNext()) {
                String next = o_not.next();
                if (next.length() == 3) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    if (notAnotherVowel(second, _o)) {
                        if (first.equalsIgnoreCase(key[_n])) {
                            if (third.equalsIgnoreCase(key[_t])) {
                                key[_o] = second.toLowerCase();
                                hasO = true;
                                System.err.println("hasO = true;");
                                System.err.println("via Scanner o_not");
                                o_not.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }
            }

            if (!hasO) {
                o_not.close();
                Scanner o_one = new Scanner(cipher);

                while (o_one.hasNext()) {
                    String next = o_one.next();
                    if (next.length() == 3) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        if (massCalc_notAnyOther(new String[] { second, third }, new int[] { _n, _e })) {
                            key[_o] = first.toLowerCase();
                            hasO = true;
                            System.err.println("hasO = true;");
                            System.err.println("via Scanner o_one");
                            o_one.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }

                if (!hasO) {
                    o_one.close();
                    Scanner o_old = new Scanner(cipher);

                    while (o_old.hasNext()) {
                        String next = o_old.next();
                        if (next.length() == 3) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            if (massCalc_notAnyOther(new String[] { second, third }, new int[] { _l, _d })) {
                                key[_o] = first.toLowerCase();
                                hasO = true;
                                System.err.println("hasO = true;");
                                System.err.println("via Scanner o_old");
                                o_old.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }

                    if (!hasO) {
                        o_old.close();
                        Scanner o_diamond = new Scanner(cipher);

                        while (o_diamond.hasNext()) {
                            String next = o_diamond.next();
                            if (next.length() == 7) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                String sixth = String.valueOf(next.charAt(5));
                                String seventh = String.valueOf(next.charAt(6));
                                if (massCalc_notAnyOther(new String[] { first, second, third, fourth, sixth, seventh },
                                        new int[] { _d, _i, _a, _m, _n, _d })) {
                                    key[_o] = fifth.toLowerCase();
                                    hasO = true;
                                    System.err.println("hasO = true;");
                                    System.err.println("via Scanner o_diamond");
                                    o_diamond.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }

                        if (!hasO) {
                            o_diamond.close();
                            Scanner o_other = new Scanner(cipher);

                            while (o_other.hasNext()) {
                                String next = o_other.next();
                                if (next.length() == 5) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                            new int[] { _t, _h, _e, _r })) {
                                        key[_o] = first.toLowerCase();
                                        hasO = true;
                                        System.err.println("hasO = true;");
                                        System.err.println("via Scanner o_other");
                                        o_other.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                            if (!hasO) {
                                o_other.close();
                                Scanner o_too = new Scanner(cipher);

                                while (o_too.hasNext()) {
                                    String next = o_too.next();
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    if (first.equalsIgnoreCase(key[_t])) {
                                        if (second.equalsIgnoreCase(third)) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_o] = second.toLowerCase();
                                                hasO = true;
                                                System.err.println("hasO = true;");
                                                System.err.println("via Scanner o_too");
                                                o_too.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }

                                }
                            }
                        }

                    }
                }
            }
        }
        // should
        Scanner u = new Scanner(cipher);

        while (u.hasNext()) {
            String next = u.next();
            if (next.length() == 6) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                String fifth = String.valueOf(next.charAt(4));
                String sixth = String.valueOf(next.charAt(5));
                if (equalsIgnoreCase_andNotAnyOther(first, 18)) {
                    if (equalsIgnoreCase_andNotAnyOther(second, 7)) {
                        if (equalsIgnoreCase_andNotAnyOther(third, 14)) {
                            if (equalsIgnoreCase_andNotAnyOther(fifth, 11)) {
                                if (equalsIgnoreCase_andNotAnyOther(sixth, 3)) {
                                    key[_u] = fourth.toLowerCase();
                                    hasU = true;
                                    System.err.println("hasU = true;");
                                    System.err.println("via Scanner u");
                                    u.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }

                    }
                }
            }
        }
        if (!hasU) {
            u.close();
            Scanner u_but = new Scanner(cipher);

            while (u_but.hasNext()) {
                String next = u_but.next();
                if (next.length() == 3) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    if (!second.equalsIgnoreCase(key[_e]) && !second.equalsIgnoreCase(key[_a])
                            && !second.equalsIgnoreCase(key[_i]) && !second.equalsIgnoreCase(key[_u])) {
                        if (first.equalsIgnoreCase(key[_b])) {
                            if (third.equalsIgnoreCase(key[_t])) {
                                key[_u] = second.toLowerCase();
                                hasU = true;
                                System.err.println("hasU = true;");
                                System.err.println("via Scanner u_but");
                                u_but.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }

            }

            if (!hasU) {
                u_but.close();
                Scanner u_our = new Scanner(cipher);

                while (u_our.hasNext()) {
                    String next = u_our.next();
                    if (next.length() == 3) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        if (massCalc_notAnyOther(new String[] { first, third }, new int[] { _o, _r })) {
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                key[_u] = second.toLowerCase();
                                hasU = true;
                                System.err.println("hasU = true;");
                                System.err.println("via Scanner u_our");
                                u_our.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }

                if (!hasU) {
                    u_our.close();
                    Scanner u_out = new Scanner(cipher);

                    while (u_out.hasNext()) {
                        String next = u_out.next();
                        if (next.length() == 3) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            if (massCalc_notAnyOther(new String[] { first, third }, new int[] { _o, _t })) {
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                    key[_u] = second.toLowerCase();
                                    hasU = true;
                                    System.err.println("hasU = true;");
                                    System.err.println("via Scanner u_out");
                                    u_out.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }

                    if (!hasU) {
                        u_out.close();
                        Scanner u_use = new Scanner(cipher);

                        while (u_use.hasNext()) {
                            String next = u_use.next();
                            if (next.length() == 3) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                if (massCalc_notAnyOther(new String[] { second, third }, new int[] { _s, _e })) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_u] = first.toLowerCase();
                                        hasU = true;
                                        System.err.println("hasU = true;");
                                        System.err.println("via Scanner u_use");
                                        u_use.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                        }

                        if (!hasU) {
                            u_use.close();
                            Scanner u_nouns = new Scanner(cipher);

                            while (u_nouns.hasNext()) {
                                String next = u_nouns.next();
                                if (next.length() == 5) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                                            new int[] { _n, _o, _n, _s })) {
                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                            key[_u] = third.toLowerCase();
                                            hasU = true;
                                            System.err.println("hasU = true;");
                                            System.err.println("via Scanner u_nouns");
                                            u_nouns.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
                                    }
                                }
                            }

                            if (!hasU) {
                                u_nouns.close();
                                Scanner u_house = new Scanner(cipher);

                                while (u_house.hasNext()) {
                                    String next = u_house.next();
                                    if (next.length() == 5) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));
                                        if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                                                new int[] { _h, _o, _s, _e })) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_u] = third.toLowerCase();
                                                hasU = true;
                                                System.err.println("hasU = true;");
                                                System.err.println("via Scanner u_house");
                                                u_house.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!hasU) {
                                    u_house.close();
                                    Scanner u_laugh = new Scanner(cipher);

                                    while (u_laugh.hasNext()) {
                                        String next = u_laugh.next();
                                        if (next.length() == 5) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));
                                            if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                                                    new int[] { _l, _a, _g, _h })) {
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                    key[_u] = third.toLowerCase();
                                                    hasU = true;
                                                    System.err.println("hasU = true;");
                                                    System.err.println("via Scanner u_laugh");
                                                    u_laugh.close();

                                                    System.err.println(
                                                            (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                    System.err.println(correctKey);

                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!hasU) {
                                        u_laugh.close();
                                        Scanner u_round = new Scanner(cipher);

                                        while (u_round.hasNext()) {
                                            String next = u_round.next();
                                            if (next.length() == 5) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                String fifth = String.valueOf(next.charAt(4));
                                                if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                                                        new int[] { _r, _o, _n, _d })) {
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                        key[_u] = third.toLowerCase();
                                                        hasU = true;
                                                        System.err.println("hasU = true;");
                                                        System.err.println("via Scanner u_round");
                                                        u_round.close();
                                                        System.err.println((Arrays.toString(key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(correctKey);

                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (!hasU) {
                                            u_round.close();
                                            Scanner u_sound = new Scanner(cipher);

                                            while (u_sound.hasNext()) {
                                                String next = u_sound.next();
                                                if (next.length() == 5) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    String fourth = String.valueOf(next.charAt(3));
                                                    String fifth = String.valueOf(next.charAt(4));
                                                    if (massCalc_notAnyOther(
                                                            new String[] { first, second, fourth, fifth },
                                                            new int[] { _s, _o, _n, _d })) {
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                            key[_u] = third.toLowerCase();
                                                            hasU = true;
                                                            System.err.println("hasU = true;");
                                                            System.err.println("via Scanner u_sound");
                                                            u_sound.close();
                                                            System.err.println((Arrays.toString(key))
                                                                    .replaceAll("null", "\u0000"));
                                                            System.err.println(correctKey);

                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!hasU) {
                                                u_sound.close();
                                                Scanner u_south = new Scanner(cipher);

                                                while (u_south.hasNext()) {
                                                    String next = u_south.next();
                                                    if (next.length() == 5) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        String fifth = String.valueOf(next.charAt(4));
                                                        if (massCalc_notAnyOther(
                                                                new String[] { first, second, fourth, fifth },
                                                                new int[] { _s, _o, _t, _h })) {
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                key[_u] = third.toLowerCase();
                                                                hasU = true;
                                                                System.err.println("hasU = true;");
                                                                System.err.println("via Scanner u_south");
                                                                u_south.close();
                                                                System.err.println((Arrays.toString(key))
                                                                        .replaceAll("null", "\u0000"));
                                                                System.err.println(correctKey);

                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (!hasU) {
                                                    u_south.close();
                                                    Scanner u_under = new Scanner(cipher);

                                                    while (u_under.hasNext()) {
                                                        String next = u_under.next();
                                                        if (next.length() == 5) {
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));
                                                            String fourth = String.valueOf(next.charAt(3));
                                                            String fifth = String.valueOf(next.charAt(4));
                                                            if (massCalc_notAnyOther(
                                                                    new String[] { second, third, fourth, fifth },
                                                                    new int[] { _n, _d, _e, _r })) {
                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                    key[_u] = first.toLowerCase();
                                                                    hasU = true;
                                                                    System.err.println("hasU = true;");
                                                                    System.err.println("via Scanner u_under");
                                                                    u_under.close();
                                                                    System.err.println((Arrays.toString(key))
                                                                            .replaceAll("null", "\u0000"));
                                                                    System.err.println(correctKey);

                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (!hasU) {
                                                        u_under.close();
                                                        Scanner u_until = new Scanner(cipher);

                                                        while (u_until.hasNext()) {
                                                            String next = u_until.next();
                                                            if (next.length() == 5) {
                                                                String first = String.valueOf(next.charAt(0));
                                                                String second = String.valueOf(next.charAt(1));
                                                                String third = String.valueOf(next.charAt(2));
                                                                String fourth = String.valueOf(next.charAt(3));
                                                                String fifth = String.valueOf(next.charAt(4));
                                                                if (massCalc_notAnyOther(
                                                                        new String[] { second, third, fourth, fifth },
                                                                        new int[] { _n, _t, _i, _l })) {
                                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                        key[_u] = first.toLowerCase();
                                                                        hasU = true;
                                                                        System.err.println("hasU = true;");
                                                                        System.err.println("via Scanner u_until");
                                                                        u_until.close();
                                                                        System.err.println((Arrays.toString(key))
                                                                                .replaceAll("null", "\u0000"));
                                                                        System.err.println(correctKey);

                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (!hasU) {
                                                            u_until.close();
                                                            Scanner u_would = new Scanner(cipher);

                                                            while (u_would.hasNext()) {
                                                                String next = u_would.next();
                                                                if (next.length() == 5) {
                                                                    String first = String.valueOf(next.charAt(0));
                                                                    String second = String.valueOf(next.charAt(1));
                                                                    String third = String.valueOf(next.charAt(2));
                                                                    String fourth = String.valueOf(next.charAt(3));
                                                                    String fifth = String.valueOf(next.charAt(4));
                                                                    if (massCalc_notAnyOther(
                                                                            new String[] { first, second, fourth,
                                                                                    fifth },
                                                                            new int[] { _w, _o, _l, _d })) {
                                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                            key[_u] = third.toLowerCase();
                                                                            hasU = true;
                                                                            System.err.println("hasU = true;");
                                                                            System.err.println("via Scanner u_would");
                                                                            u_would.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(key))
                                                                                            .replaceAll("null",
                                                                                                    "\u0000"));
                                                                            System.err.println(correctKey);

                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            if (!hasU) {
                                                                u_would.close();
                                                                Scanner u_during = new Scanner(cipher);

                                                                while (u_during.hasNext()) {
                                                                    String next = u_during.next();
                                                                    if (next.length() == 6) {
                                                                        String first = String.valueOf(next.charAt(0));
                                                                        String second = String.valueOf(next.charAt(1));
                                                                        String third = String.valueOf(next.charAt(2));
                                                                        String fourth = String.valueOf(next.charAt(3));
                                                                        String fifth = String.valueOf(next.charAt(4));
                                                                        String sixth = String.valueOf(next.charAt(5));
                                                                        if (massCalc_notAnyOther(
                                                                                new String[] { first, third, fourth,
                                                                                        fifth, sixth },
                                                                                new int[] { _d, _r, _i, _n, _g })) {
                                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                key[_u] = second.toLowerCase();
                                                                                hasU = true;
                                                                                System.err.println("hasU = true;");
                                                                                System.err.println(
                                                                                        "via Scanner u_during");
                                                                                u_during.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(key))
                                                                                                .replaceAll("null",
                                                                                                        "\u0000"));
                                                                                System.err.println(correctKey);

                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                                if (!hasU) {
                                                                    u_during.close();
                                                                    Scanner u_number = new Scanner(cipher);

                                                                    while (u_number.hasNext()) {
                                                                        String next = u_number.next();
                                                                        if (next.length() == 6) {
                                                                            String first = String
                                                                                    .valueOf(next.charAt(0));
                                                                            String second = String
                                                                                    .valueOf(next.charAt(1));
                                                                            String third = String
                                                                                    .valueOf(next.charAt(2));
                                                                            String fourth = String
                                                                                    .valueOf(next.charAt(3));
                                                                            String fifth = String
                                                                                    .valueOf(next.charAt(4));
                                                                            String sixth = String
                                                                                    .valueOf(next.charAt(5));
                                                                            if (massCalc_notAnyOther(
                                                                                    new String[] { first, third, fourth,
                                                                                            fifth, sixth },
                                                                                    new int[] { _n, _m, _b, _e, _r })) {
                                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                    key[_u] = second.toLowerCase();
                                                                                    hasU = true;
                                                                                    System.err.println("hasU = true;");
                                                                                    System.err.println(
                                                                                            "via Scanner u_number");
                                                                                    u_number.close();
                                                                                    System.err.println(
                                                                                            (Arrays.toString(key))
                                                                                                    .replaceAll("null",
                                                                                                            "\u0000"));
                                                                                    System.err.println(correctKey);

                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }

                                                                    if (!hasU) {
                                                                        u_number.close();
                                                                        Scanner u_hundred = new Scanner(cipher);

                                                                        while (u_hundred.hasNext()) {
                                                                            String next = u_hundred.next();
                                                                            if (next.length() == 7) {
                                                                                String first = String
                                                                                        .valueOf(next.charAt(0));
                                                                                String second = String
                                                                                        .valueOf(next.charAt(1));
                                                                                String third = String
                                                                                        .valueOf(next.charAt(2));
                                                                                String fourth = String
                                                                                        .valueOf(next.charAt(3));
                                                                                String fifth = String
                                                                                        .valueOf(next.charAt(4));
                                                                                String sixth = String
                                                                                        .valueOf(next.charAt(5));
                                                                                String seventh = String
                                                                                        .valueOf(next.charAt(6));
                                                                                if (massCalc_notAnyOther(
                                                                                        new String[] { first, third,
                                                                                                fourth, fifth, sixth,
                                                                                                seventh },
                                                                                        new int[] { _h, _n, _d, _r, _e,
                                                                                                _d })) {
                                                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                        key[_u] = second.toLowerCase();
                                                                                        hasU = true;
                                                                                        System.err.println(
                                                                                                "hasU = true;");
                                                                                        u_hundred.close();
                                                                                        System.err.println(
                                                                                                "via Scanner u_hundred");
                                                                                        System.err.println((Arrays
                                                                                                .toString(key))
                                                                                                        .replaceAll(
                                                                                                                "null",
                                                                                                                "\u0000"));
                                                                                        System.err.println(correctKey);

                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }

                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
        // people
        Scanner p = new Scanner(cipher);

        while (p.hasNext()) {
            String next = p.next();
            if (next.length() == 6) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                String fifth = String.valueOf(next.charAt(4));
                String sixth = String.valueOf(next.charAt(5));
                if (first.equalsIgnoreCase(fourth)) {
                    if (second.equalsIgnoreCase(sixth)) {
                        if (equalsIgnoreCase_andNotAnyOther(second, 4)) {
                            if (equalsIgnoreCase_andNotAnyOther(third, 14)) {
                                if (equalsIgnoreCase_andNotAnyOther(fifth, 11)) {
                                    key[_p] = first.toLowerCase();
                                    hasP = true;
                                    System.err.println("hasP = true;");
                                    p.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }

                    }
                }
            }
        }
        if (!hasP) {
            p.close();
            Scanner p_group = new Scanner(cipher);

            while (p_group.hasNext()) {
                String next = p_group.next();
                if (next.length() == 5) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    String fifth = String.valueOf(next.charAt(4));
                    if (massCalc_notAnyOther(new String[] { first, second, third, fourth },
                            new int[] { _g, _r, _o, _u })) {
                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                            key[_p] = fifth.toLowerCase();
                            hasP = true;
                            System.err.println("hasP = true;");
                            p_group.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }

            if (!hasP) {
                p_group.close();
                Scanner p_power = new Scanner(cipher);

                while (p_power.hasNext()) {
                    String next = p_power.next();
                    if (next.length() == 5) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        String fifth = String.valueOf(next.charAt(4));
                        if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                new int[] { _o, _w, _e, _r })) {
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                key[_p] = first.toLowerCase();
                                hasP = true;
                                System.err.println("hasP = true;");
                                p_power.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }

                if (!hasP) {
                    p_power.close();
                    Scanner p_plane = new Scanner(cipher);

                    while (p_plane.hasNext()) {
                        String next = p_plane.next();
                        if (next.length() == 5) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                    new int[] { _l, _a, _n, _e })) {
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                    key[_p] = first.toLowerCase();
                                    hasP = true;
                                    System.err.println("hasP = true;");
                                    p_plane.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }

                    if (!hasP) {
                        p_plane.close();
                        Scanner p_plant = new Scanner(cipher);

                        while (p_plant.hasNext()) {
                            String next = p_plant.next();
                            if (next.length() == 5) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                        new int[] { _l, _a, _n, _t })) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_p] = first.toLowerCase();
                                        hasP = true;
                                        System.err.println("hasP = true;");
                                        p_plant.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                        }

                        if (!hasP) {
                            p_plant.close();
                            Scanner p_point = new Scanner(cipher);

                            while (p_point.hasNext()) {
                                String next = p_point.next();
                                if (next.length() == 5) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                            new int[] { _o, _i, _n, _t })) {
                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                            key[_p] = first.toLowerCase();
                                            hasP = true;
                                            System.err.println("hasP = true;");
                                            p_point.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
                                    }
                                }
                            }

                            if (!hasP) {
                                p_point.close();
                                Scanner p_shape = new Scanner(cipher);

                                while (p_shape.hasNext()) {
                                    String next = p_shape.next();
                                    if (next.length() == 5) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));
                                        if (massCalc_notAnyOther(new String[] { first, second, third, fifth },
                                                new int[] { _s, _h, _a, _e })) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_p] = fourth.toLowerCase();
                                                hasP = true;
                                                System.err.println("hasP = true;");
                                                p_shape.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!hasP) {
                                    p_shape.close();
                                    Scanner p_sleep = new Scanner(cipher);

                                    while (p_sleep.hasNext()) {
                                        String next = p_sleep.next();
                                        if (next.length() == 5) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));
                                            if (massCalc_notAnyOther(new String[] { first, second, third, fourth },
                                                    new int[] { _s, _l, _e, _e })) {
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                    key[_p] = fifth.toLowerCase();
                                                    hasP = true;
                                                    System.err.println("hasP = true;");
                                                    p_sleep.close();
                                                    System.err.println(
                                                            (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                    System.err.println(correctKey);

                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!hasP) {
                                        p_sleep.close();
                                        Scanner p_spell = new Scanner(cipher);

                                        while (p_spell.hasNext()) {
                                            String next = p_spell.next();
                                            if (next.length() == 5) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                String fifth = String.valueOf(next.charAt(4));
                                                if (massCalc_notAnyOther(new String[] { first, third, fourth, fifth },
                                                        new int[] { _s, _e, _l, _l })) {
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                        key[_p] = second.toLowerCase();
                                                        hasP = true;
                                                        System.err.println("hasP = true;");
                                                        p_spell.close();
                                                        System.err.println((Arrays.toString(key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(correctKey);

                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (!hasP) {
                                            p_spell.close();
                                            Scanner p_dolphin = new Scanner(cipher);

                                            while (p_dolphin.hasNext()) {
                                                String next = p_dolphin.next();
                                                if (next.length() == 7) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    String fourth = String.valueOf(next.charAt(3));
                                                    String fifth = String.valueOf(next.charAt(4));
                                                    String sixth = String.valueOf(next.charAt(5));
                                                    String seventh = String.valueOf(next.charAt(6));
                                                    if (massCalc_notAnyOther(new String[] { first, second, third, fifth,
                                                            sixth, seventh }, new int[] { _d, _o, _l, _h, _i, _n })) {
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                            key[_p] = fourth.toLowerCase();
                                                            hasP = true;
                                                            System.err.println("hasP = true;");
                                                            p_dolphin.close();
                                                            System.err.println((Arrays.toString(key))
                                                                    .replaceAll("null", "\u0000"));
                                                            System.err.println(correctKey);

                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!hasP) {
                                                p_dolphin.close();
                                                Scanner p_problem = new Scanner(cipher);

                                                while (p_problem.hasNext()) {
                                                    String next = p_problem.next();
                                                    if (next.length() == 7) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        String fifth = String.valueOf(next.charAt(4));
                                                        String sixth = String.valueOf(next.charAt(5));
                                                        String seventh = String.valueOf(next.charAt(6));
                                                        if (massCalc_notAnyOther(
                                                                new String[] { second, third, fourth, fifth, sixth,
                                                                        seventh },
                                                                new int[] { _r, _o, _b, _l, _e, _m })) {
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                key[_p] = first.toLowerCase();
                                                                hasP = true;
                                                                System.err.println("hasP = true;");
                                                                p_problem.close();
                                                                System.err.println((Arrays.toString(key))
                                                                        .replaceAll("null", "\u0000"));
                                                                System.err.println(correctKey);

                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (!hasP) {
                                                    p_problem.close();
                                                    Scanner p_penguin = new Scanner(cipher);

                                                    while (p_penguin.hasNext()) {
                                                        String next = p_penguin.next();
                                                        if (next.length() == 7) {
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));
                                                            String fourth = String.valueOf(next.charAt(3));
                                                            String fifth = String.valueOf(next.charAt(4));
                                                            String sixth = String.valueOf(next.charAt(5));
                                                            String seventh = String.valueOf(next.charAt(6));
                                                            if (massCalc_notAnyOther(
                                                                    new String[] { second, third, fourth, fifth, sixth,
                                                                            seventh },
                                                                    new int[] { _e, _n, _g, _u, _i, _n })) {
                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                    key[_p] = first.toLowerCase();
                                                                    hasP = true;
                                                                    System.err.println("hasP = true;");
                                                                    p_penguin.close();
                                                                    System.err.println((Arrays.toString(key))
                                                                            .replaceAll("null", "\u0000"));
                                                                    System.err.println(correctKey);

                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }

                                    }
                                }
                            }

                        }
                    }
                }
            }
        }
        // close
        Scanner c_close__ = new Scanner(cipher);

        while (c_close__.hasNext()) {
            String next = c_close__.next();
            if (next.length() >= 5) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                String fifth = String.valueOf(next.charAt(4));
                if (equalsIgnoreCase_andNotAnyOther(second, 11)) {
                    if (equalsIgnoreCase_andNotAnyOther(third, 14)) {
                        if (equalsIgnoreCase_andNotAnyOther(fourth, 18)) {
                            if (equalsIgnoreCase_andNotAnyOther(fifth, 4)) {
                                key[_c] = first.toLowerCase();
                                hasC = true;
                                System.err.println("hasC = true;");
                                c_close__.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!hasC) {
            c_close__.close();
            Scanner c_much = new Scanner(cipher);

            while (c_much.hasNext()) {
                String next = c_much.next();
                if (next.length() == 4) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    if (massCalc_notAnyOther(new String[] { first, second, fourth }, new int[] { _m, _u, _h })) {
                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                            key[_c] = third.toLowerCase();
                            hasC = true;
                            System.err.println("hasC = true;");
                            c_much.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }

            if (!hasC) {
                c_much.close();
                Scanner c_social = new Scanner(cipher);

                while (c_social.hasNext()) {
                    String next = c_social.next();
                    if (next.length() == 6) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        String fifth = String.valueOf(next.charAt(4));
                        String sixth = String.valueOf(next.charAt(5));
                        if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth, sixth },
                                new int[] { _s, _o, _i, _a, _l })) {
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                key[_c] = third.toLowerCase();
                                hasC = true;
                                System.err.println("hasC = true;");
                                c_social.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }

                if (!hasC) {
                    c_social.close();
                    Scanner c_child = new Scanner(cipher);

                    while (c_child.hasNext()) {
                        String next = c_child.next();
                        if (next.length() == 5) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                    new int[] { _h, _i, _l, _d })) {
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                    key[_c] = first.toLowerCase();
                                    hasC = true;
                                    System.err.println("hasC = true;");
                                    c_child.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }

                    if (!hasC) {
                        c_child.close();
                        Scanner c_class = new Scanner(cipher);

                        while (c_class.hasNext()) {
                            String next = c_class.next();
                            if (next.length() == 5) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                        new int[] { _l, _a, _s, _s })) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_c] = first.toLowerCase();
                                        hasC = true;
                                        System.err.println("hasC = true;");
                                        c_class.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                        }

                        if (!hasC) {
                            c_class.close();
                            Scanner c_clear = new Scanner(cipher);

                            while (c_clear.hasNext()) {
                                String next = c_clear.next();
                                if (next.length() == 5) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                            new int[] { _l, _e, _a, _r })) {
                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                            key[_c] = first.toLowerCase();
                                            hasC = true;
                                            System.err.println("hasC = true;");
                                            c_clear.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
                                    }
                                }
                            }

                            if (!hasC) {
                                c_clear.close();
                                Scanner c_could = new Scanner(cipher);

                                while (c_could.hasNext()) {
                                    String next = c_could.next();
                                    if (next.length() == 5) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));
                                        if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                                new int[] { _o, _u, _l, _d })) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_c] = first.toLowerCase();
                                                hasC = true;
                                                System.err.println("hasC = true;");
                                                c_could.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!hasC) {
                                    c_could.close();
                                    Scanner c_cried = new Scanner(cipher);

                                    while (c_cried.hasNext()) {
                                        String next = c_cried.next();
                                        if (next.length() == 5) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));
                                            if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                                    new int[] { _r, _i, _e, _d })) {
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                    key[_c] = first.toLowerCase();
                                                    hasC = true;
                                                    System.err.println("hasC = true;");
                                                    c_cried.close();
                                                    System.err.println(
                                                            (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                    System.err.println(correctKey);

                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!hasC) {
                                        c_cried.close();
                                        Scanner c_cross = new Scanner(cipher);

                                        while (c_cross.hasNext()) {
                                            String next = c_cross.next();
                                            if (next.length() == 5) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                String fifth = String.valueOf(next.charAt(4));
                                                if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                                        new int[] { _r, _o, _s, _s })) {
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                        key[_c] = first.toLowerCase();
                                                        hasC = true;
                                                        System.err.println("hasC = true;");
                                                        c_cross.close();
                                                        System.err.println((Arrays.toString(key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(correctKey);

                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (!hasC) {
                                            c_cross.close();
                                            Scanner c_music = new Scanner(cipher);

                                            while (c_music.hasNext()) {
                                                String next = c_music.next();
                                                if (next.length() == 5) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    String fourth = String.valueOf(next.charAt(3));
                                                    String fifth = String.valueOf(next.charAt(4));
                                                    if (massCalc_notAnyOther(
                                                            new String[] { first, second, third, fourth },
                                                            new int[] { _m, _u, _s, _i })) {
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                            key[_c] = fifth.toLowerCase();
                                                            hasC = true;
                                                            System.err.println("hasC = true;");
                                                            c_music.close();
                                                            System.err.println((Arrays.toString(key))
                                                                    .replaceAll("null", "\u0000"));
                                                            System.err.println(correctKey);

                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!hasC) {
                                                c_music.close();
                                                Scanner c_reach = new Scanner(cipher);

                                                while (c_reach.hasNext()) {
                                                    String next = c_reach.next();
                                                    if (next.length() == 5) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        String fifth = String.valueOf(next.charAt(4));
                                                        if (massCalc_notAnyOther(
                                                                new String[] { first, second, third, fifth },
                                                                new int[] { _r, _e, _a, _h })) {
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                key[_c] = fourth.toLowerCase();
                                                                hasC = true;
                                                                System.err.println("hasC = true;");
                                                                c_reach.close();
                                                                System.err.println((Arrays.toString(key))
                                                                        .replaceAll("null", "\u0000"));
                                                                System.err.println(correctKey);

                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (!hasC) {
                                                    c_reach.close();
                                                    Scanner c_space = new Scanner(cipher);

                                                    while (c_space.hasNext()) {
                                                        String next = c_space.next();
                                                        if (next.length() == 5) {
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));
                                                            String fourth = String.valueOf(next.charAt(3));
                                                            String fifth = String.valueOf(next.charAt(4));
                                                            if (massCalc_notAnyOther(
                                                                    new String[] { first, second, third, fifth },
                                                                    new int[] { _s, _p, _a, _e })) {
                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                    key[_c] = fourth.toLowerCase();
                                                                    hasC = true;
                                                                    System.err.println("hasC = true;");
                                                                    c_space.close();
                                                                    System.err.println((Arrays.toString(key))
                                                                            .replaceAll("null", "\u0000"));
                                                                    System.err.println(correctKey);

                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (!hasC) {
                                                        c_space.close();
                                                        Scanner c_teach = new Scanner(cipher);

                                                        while (c_teach.hasNext()) {
                                                            String next = c_teach.next();
                                                            if (next.length() == 5) {
                                                                String first = String.valueOf(next.charAt(0));
                                                                String second = String.valueOf(next.charAt(1));
                                                                String third = String.valueOf(next.charAt(2));
                                                                String fourth = String.valueOf(next.charAt(3));
                                                                String fifth = String.valueOf(next.charAt(4));
                                                                if (massCalc_notAnyOther(
                                                                        new String[] { first, second, third, fifth },
                                                                        new int[] { _t, _e, _a, _h })) {
                                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                        key[_c] = fourth.toLowerCase();
                                                                        hasC = true;
                                                                        System.err.println("hasC = true;");
                                                                        c_teach.close();
                                                                        System.err.println((Arrays.toString(key))
                                                                                .replaceAll("null", "\u0000"));
                                                                        System.err.println(correctKey);

                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (!hasC) {
                                                            c_teach.close();
                                                            Scanner c_watch = new Scanner(cipher);

                                                            while (c_watch.hasNext()) {
                                                                String next = c_watch.next();
                                                                if (next.length() == 5) {
                                                                    String first = String.valueOf(next.charAt(0));
                                                                    String second = String.valueOf(next.charAt(1));
                                                                    String third = String.valueOf(next.charAt(2));
                                                                    String fourth = String.valueOf(next.charAt(3));
                                                                    String fifth = String.valueOf(next.charAt(4));
                                                                    if (massCalc_notAnyOther(
                                                                            new String[] { first, second, third,
                                                                                    fifth },
                                                                            new int[] { _w, _a, _t, _h })) {
                                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                            key[_c] = fourth.toLowerCase();
                                                                            hasC = true;
                                                                            System.err.println("hasC = true;");
                                                                            c_watch.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(key))
                                                                                            .replaceAll("null",
                                                                                                    "\u0000"));
                                                                            System.err.println(correctKey);

                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            if (!hasC) {
                                                                c_watch.close();
                                                                Scanner c_which = new Scanner(cipher);

                                                                while (c_which.hasNext()) {
                                                                    String next = c_which.next();
                                                                    if (next.length() == 5) {
                                                                        String first = String.valueOf(next.charAt(0));
                                                                        String second = String.valueOf(next.charAt(1));
                                                                        String third = String.valueOf(next.charAt(2));
                                                                        String fourth = String.valueOf(next.charAt(3));
                                                                        String fifth = String.valueOf(next.charAt(4));
                                                                        if (massCalc_notAnyOther(
                                                                                new String[] { first, second, third,
                                                                                        fifth },
                                                                                new int[] { _w, _h, _i, _h })) {
                                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                key[_c] = fourth.toLowerCase();
                                                                                hasC = true;
                                                                                System.err.println("hasC = true;");
                                                                                c_which.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(key))
                                                                                                .replaceAll("null",
                                                                                                        "\u0000"));
                                                                                System.err.println(correctKey);

                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }

                                    }
                                }
                            }

                        }
                    }
                }
            }
        }
        // before
        Scanner f = new Scanner(cipher);

        while (f.hasNext()) {
            String next = f.next();
            if (next.length() == 6) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                String fifth = String.valueOf(next.charAt(4));
                String sixth = String.valueOf(next.charAt(5));
                if (equalsIgnoreCase_andNotAnyOther(first, 1)) {
                    if (equalsIgnoreCase_andNotAnyOther(second, 4)) {
                        if (equalsIgnoreCase_andNotAnyOther(fourth, 14)) {
                            if (equalsIgnoreCase_andNotAnyOther(fifth, 17)) {
                                if (equalsIgnoreCase_andNotAnyOther(sixth, 4)) {
                                    key[_f] = third.toLowerCase();
                                    hasF = true;
                                    System.err.println("hasF = true;");
                                    f.close();

                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }

                    }
                }
            }
        }
        if (!hasF) {
            f.close();
            Scanner f_from = new Scanner(cipher);

            while (f_from.hasNext()) {
                String next = f_from.next();
                if (next.length() == 4) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    if (massCalc_notAnyOther(new String[] { second, third, fourth }, new int[] { _r, _o, _m })) {
                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                            key[_f] = first.toLowerCase();
                            hasF = true;
                            System.err.println("hasF = true;");
                            f_from.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }

            if (!hasF) {
                f_from.close();
                Scanner f_after = new Scanner(cipher);

                while (f_after.hasNext()) {
                    String next = f_after.next();
                    if (next.length() == 5) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        String fifth = String.valueOf(next.charAt(4));
                        if (massCalc_notAnyOther(new String[] { first, third, fourth, fifth },
                                new int[] { _a, _t, _e, _r })) {
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                key[_f] = second.toLowerCase();
                                hasF = true;
                                System.err.println("hasF = true;");
                                f_after.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }

                if (!hasF) {
                    f_after.close();
                    Scanner f_first = new Scanner(cipher);

                    while (f_first.hasNext()) {
                        String next = f_first.next();
                        if (next.length() == 5) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                    new int[] { _i, _r, _s, _t })) {
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                    key[_f] = first.toLowerCase();
                                    hasF = true;
                                    System.err.println("hasF = true;");
                                    f_first.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }

                    if (!hasF) {
                        f_first.close();
                        Scanner f_found = new Scanner(cipher);

                        while (f_found.hasNext()) {
                            String next = f_found.next();
                            if (next.length() == 5) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                        new int[] { _o, _u, _n, _d })) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_f] = first.toLowerCase();
                                        hasF = true;
                                        System.err.println("hasF = true;");
                                        f_found.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                        }

                        if (!hasF) {
                            f_found.close();
                            Scanner f_front = new Scanner(cipher);

                            while (f_front.hasNext()) {
                                String next = f_front.next();
                                if (next.length() == 5) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                            new int[] { _r, _o, _n, _t })) {
                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                            key[_f] = first.toLowerCase();
                                            hasF = true;
                                            System.err.println("hasF = true;");
                                            f_front.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
                                    }
                                }
                            }

                            if (!hasF) {
                                f_front.close();
                                Scanner f_false = new Scanner(cipher);

                                while (f_false.hasNext()) {
                                    String next = f_false.next();
                                    if (next.length() == 5) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));
                                        if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                                new int[] { _a, _l, _s, _e })) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_f] = first.toLowerCase();
                                                hasF = true;
                                                System.err.println("hasF = true;");
                                                f_false.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!hasF) {
                                    f_false.close();
                                    Scanner f_field = new Scanner(cipher);

                                    while (f_field.hasNext()) {
                                        String next = f_field.next();
                                        if (next.length() == 5) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));
                                            if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                                    new int[] { _i, _e, _l, _d })) {
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                    key[_f] = first.toLowerCase();
                                                    hasF = true;
                                                    System.err.println("hasF = true;");
                                                    f_field.close();
                                                    System.err.println(
                                                            (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                    System.err.println(correctKey);

                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!hasF) {
                                        f_field.close();
                                        Scanner f_often = new Scanner(cipher);

                                        while (f_often.hasNext()) {
                                            String next = f_often.next();
                                            if (next.length() == 5) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                String fifth = String.valueOf(next.charAt(4));
                                                if (massCalc_notAnyOther(new String[] { first, third, fourth, fifth },
                                                        new int[] { _o, _t, _e, _n })) {
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                        key[_f] = second.toLowerCase();
                                                        hasF = true;
                                                        System.err.println("hasF = true;");
                                                        f_often.close();
                                                        System.err.println((Arrays.toString(key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(correctKey);

                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (!hasF) {
                                            f_often.close();
                                            Scanner f_perfect = new Scanner(cipher);

                                            while (f_perfect.hasNext()) {
                                                String next = f_perfect.next();
                                                if (next.length() == 7) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    String fourth = String.valueOf(next.charAt(3));
                                                    String fifth = String.valueOf(next.charAt(4));
                                                    String sixth = String.valueOf(next.charAt(5));
                                                    String seventh = String.valueOf(next.charAt(6));
                                                    if (massCalc_notAnyOther(new String[] { first, second, third, fifth,
                                                            sixth, seventh }, new int[] { _p, _e, _r, _e, _c, _t })) {
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                            key[_f] = fourth.toLowerCase();
                                                            hasF = true;
                                                            System.err.println("hasF = true;");
                                                            f_perfect.close();
                                                            System.err.println((Arrays.toString(key))
                                                                    .replaceAll("null", "\u0000"));
                                                            System.err.println(correctKey);

                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!hasF) {
                                                f_perfect.close();
                                                Scanner f_freedom = new Scanner(cipher);

                                                while (f_freedom.hasNext()) {
                                                    String next = f_freedom.next();
                                                    if (next.length() == 7) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        String fifth = String.valueOf(next.charAt(4));
                                                        String sixth = String.valueOf(next.charAt(5));
                                                        String seventh = String.valueOf(next.charAt(6));
                                                        if (massCalc_notAnyOther(
                                                                new String[] { second, third, fourth, fifth, sixth,
                                                                        seventh },
                                                                new int[] { _r, _e, _e, _d, _o, _m })) {
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                key[_f] = first.toLowerCase();
                                                                hasF = true;
                                                                System.err.println("hasF = true;");
                                                                f_freedom.close();
                                                                System.err.println((Arrays.toString(key))
                                                                        .replaceAll("null", "\u0000"));
                                                                System.err.println(correctKey);

                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (!hasF) {
                                                    f_freedom.close();
                                                    Scanner f_forever = new Scanner(cipher);

                                                    while (f_forever.hasNext()) {
                                                        String next = f_forever.next();
                                                        if (next.length() == 7) {
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));
                                                            String fourth = String.valueOf(next.charAt(3));
                                                            String fifth = String.valueOf(next.charAt(4));
                                                            String sixth = String.valueOf(next.charAt(5));
                                                            String seventh = String.valueOf(next.charAt(6));
                                                            if (massCalc_notAnyOther(
                                                                    new String[] { second, third, fourth, fifth, sixth,
                                                                            seventh },
                                                                    new int[] { _o, _r, _e, _v, _e, _r })) {
                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                    key[_f] = first.toLowerCase();
                                                                    hasF = true;
                                                                    System.err.println("hasF = true;");
                                                                    f_forever.close();
                                                                    System.err.println((Arrays.toString(key))
                                                                            .replaceAll("null", "\u0000"));
                                                                    System.err.println(correctKey);

                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }

                                    }
                                }
                            }

                        }
                    }
                }
            }
        }

            Scanner k_like= new Scanner(cipher);
            while(k_like.hasNext()){
                String next=k_like.next();
                if (next.length()==4){
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    if (first.equalsIgnoreCase(key[_l])) {
                        if (second.equalsIgnoreCase(key[_i])) {
                            if (fourth.equalsIgnoreCase(key[_e])) {
                                if (!third.equalsIgnoreCase(key[_f]) && ! third.equalsIgnoreCase(key[_v])) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_k] = third.toLowerCase();
                                        hasK = true;
                                        System.err.println("via Scanner k_like");
                                        k_like.close();
                                        break;
                                        //ho_z
                                        //hoxz = correct
                                        //howz = wrong
                                        //howz = life
                                        //honz = wrong
                                        //honz = live
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if(!hasK){
                k_like.close();
                Scanner k_know= new Scanner(cipher);
                while(k_know.hasNext()){
                    String next=k_know.next();
                    if (next.length()==4){
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        if (massCalc_notAnyOther(new String[]{second,third,fourth},
                                new int[]{_n,_o,_w})){
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                key[_k]=first.toLowerCase();
                                hasK=true;
                                System.err.println("via Scanner k_kno");
                                k_know.close();
                                break;
                            }
                        }
                    }
                }

                if(!hasK){
                    k_know.close();
                    Scanner k_looked= new Scanner(cipher);
                    while(k_looked.hasNext()){
                        String next=k_looked.next();
                        if (next.length()==6){
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            String sixth = String.valueOf(next.charAt(5));
                            if (massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
                                    new int[]{_l,_o,_o,_e,_d})){
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                    key[_k]=fourth.toLowerCase();
                                    hasK=true;
                                    k_looked.close();
                                    break;
                                }
                            }
                        }
                    }

                    if(!hasK){
                        k_looked.close();
                        Scanner k_back= new Scanner(cipher);
                        while(k_back.hasNext()){
                            String next=k_back.next();
                            if (next.length()==4){
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                if (massCalc_notAnyOther(new String[]{first,second,third},
                                        new int[]{_b,_a,_c})){
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                        key[_k]=fourth.toLowerCase();
                                        hasK=true;
                                        k_back.close();
                                        break;
                                    }
                                }
                            }
                        }

                        if(!hasK){
                            k_back.close();
                            Scanner k_asked= new Scanner(cipher);
                            while(k_asked.hasNext()){
                                String next=k_asked.next();
                                if (next.length()==5){
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    if (massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
                                            new int[]{_a,_s,_e,_d})){
                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                            key[_k]=third.toLowerCase();
                                            hasK=true;
                                            k_asked.close();
                                            break;
                                        }
                                    }
                                }
                            }

                            if(!hasK){
                                k_asked.close();
                                Scanner k_took= new Scanner(cipher);
                                while(k_took.hasNext()){
                                    String next=k_took.next();
                                    if (next.length()==4){
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        if (massCalc_notAnyOther(new String[]{first,second,third},
                                                new int[]{_t,_o,_o})){
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                key[_k]=fourth.toLowerCase();
                                                hasK=true;
                                                k_took.close();
                                                break;
                                            }
                                        }
                                    }
                                }

                                if(!hasK){
                                    k_took.close();
                                    Scanner k_think= new Scanner(cipher);
                                    while(k_think.hasNext()){
                                        String next=k_think.next();
                                        if (next.length()==5){
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));
                                            if (massCalc_notAnyOther(new String[]{first,second,third,fourth},
                                                    new int[]{_t,_h,_i,_n})){
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                    key[_k]=fifth.toLowerCase();
                                                    hasK=true;
                                                    k_think.close();
                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if(!hasK){
                                        k_think.close();
                                        Scanner k_knew= new Scanner(cipher);
                                        while(k_knew.hasNext()){
                                            String next=k_knew.next();
                                            if (next.length()==4){
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                if (massCalc_notAnyOther(new String[]{second,third,fourth},
                                                        new int[]{_n,_e,_w})){
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                        key[_k]=first.toLowerCase();
                                                        hasK=true;
                                                        k_knew.close();
                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if(!hasK){
                                            k_knew.close();
                                            Scanner k_make= new Scanner(cipher);
                                            while(k_make.hasNext()){
                                                String next=k_make.next();
                                                if (next.length()==4){
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    String fourth = String.valueOf(next.charAt(3));
                                                    if (massCalc_notAnyOther(new String[]{first,second,fourth},
                                                            new int[]{_m,_a,_e})){
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                            key[_k]=third.toLowerCase();
                                                            hasK=true;
                                                            k_make.close();
                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if(!hasK){
                                                k_make.close();
                                                Scanner k_look= new Scanner(cipher);
                                                while(k_look.hasNext()){
                                                    String next=k_look.next();
                                                    if (next.length()==4){
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        if (massCalc_notAnyOther(new String[]{first,second,third},
                                                                new int[]{_l,_o,_o})){
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                                key[_k]=fourth.toLowerCase();
                                                                hasK=true;
                                                                k_look.close();
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if(!hasK){
                                                    k_look.close();
                                                    Scanner k_take= new Scanner(cipher);
                                                    while(k_take.hasNext()){
                                                        String next=k_take.next();
                                                        if (next.length()==4){
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));
                                                            String fourth = String.valueOf(next.charAt(3));
                                                            if (massCalc_notAnyOther(new String[]{first,second,fourth},
                                                                    new int[]{_t,_a,_e})){
                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                                    key[_k]=third.toLowerCase();
                                                                    hasK=true;
                                                                    k_take.close();
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if(!hasK){
                                                        k_take.close();
                                                        Scanner k_looking= new Scanner(cipher);
                                                        while(k_looking.hasNext()){
                                                            String next=k_looking.next();
                                                            if (next.length()==7){
                                                                String first = String.valueOf(next.charAt(0));
                                                                String second = String.valueOf(next.charAt(1));
                                                                String third = String.valueOf(next.charAt(2));
                                                                String fourth = String.valueOf(next.charAt(3));
                                                                String fifth = String.valueOf(next.charAt(4));
                                                                String sixth = String.valueOf(next.charAt(5));
                                                                String seventh = String.valueOf(next.charAt(6));
                                                                if (massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
                                                                        new int[]{_l,_o,_o,_i,_n,_g})){
                                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                                        key[_k]=fourth.toLowerCase();
                                                                        hasK=true;
                                                                        k_looking.close();
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if(!hasK){
                                                            k_looking.close();
                                                            Scanner k_black= new Scanner(cipher);
                                                            while(k_black.hasNext()){
                                                                String next=k_black.next();
                                                                if (next.length()==5){
                                                                    String first = String.valueOf(next.charAt(0));
                                                                    String second = String.valueOf(next.charAt(1));
                                                                    String third = String.valueOf(next.charAt(2));
                                                                    String fourth = String.valueOf(next.charAt(3));
                                                                    String fifth = String.valueOf(next.charAt(4));
                                                                    if (massCalc_notAnyOther(new String[]{first,second,third,fourth},
                                                                            new int[]{_b,_l,_a,_c})){
                                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                                            key[_k]=fifth.toLowerCase();
                                                                            hasK=true;
                                                                            k_black.close();
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            if(!hasK){
                                                                k_black.close();
                                                                Scanner k_taken= new Scanner(cipher);
                                                                while(k_taken.hasNext()){
                                                                    String next=k_taken.next();
                                                                    if (next.length()==5){
                                                                        String first = String.valueOf(next.charAt(0));
                                                                        String second = String.valueOf(next.charAt(1));
                                                                        String third = String.valueOf(next.charAt(2));
                                                                        String fourth = String.valueOf(next.charAt(3));
                                                                        String fifth = String.valueOf(next.charAt(4));
                                                                        if (massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
                                                                                new int[]{_t,_a,_e,_n})){
                                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                                                key[_k]=third.toLowerCase();
                                                                                hasK=true;
                                                                                k_taken.close();
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                                if(!hasK){
                                                                    k_taken.close();
                                                                    Scanner k_work= new Scanner(cipher);
                                                                    while(k_work.hasNext()){
                                                                        String next=k_work.next();
                                                                        if (next.length()==4){
                                                                            String first = String.valueOf(next.charAt(0));
                                                                            String second = String.valueOf(next.charAt(1));
                                                                            String third = String.valueOf(next.charAt(2));
                                                                            String fourth = String.valueOf(next.charAt(3));
                                                                            if (massCalc_notAnyOther(new String[]{first,second,third},
                                                                                    new int[]{_w,_o,_r})){
                                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                                                    key[_k]=fourth.toLowerCase();
                                                                                    hasK=true;
                                                                                    k_work.close();
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }

                                                                    if(!hasK){
                                                                        k_work.close();
                                                                        Scanner k_talk= new Scanner(cipher);
                                                                        while(k_talk.hasNext()){
                                                                            String next=k_talk.next();
                                                                            if (next.length()==4){
                                                                                String first = String.valueOf(next.charAt(0));
                                                                                String second = String.valueOf(next.charAt(1));
                                                                                String third = String.valueOf(next.charAt(2));
                                                                                String fourth = String.valueOf(next.charAt(3));
                                                                                if (massCalc_notAnyOther(new String[]{first,second,third},
                                                                                        new int[]{_t,_a,_l})){
                                                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                                                        key[_k]=fourth.toLowerCase();
                                                                                        hasK=true;
                                                                                        k_talk.close();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }

                                                                        if(!hasK){
                                                                            k_talk.close();
                                                                            Scanner k_taking= new Scanner(cipher);
                                                                            while(k_taking.hasNext()){
                                                                                String next=k_taking.next();
                                                                                if (next.length()==6){
                                                                                    String first = String.valueOf(next.charAt(0));
                                                                                    String second = String.valueOf(next.charAt(1));
                                                                                    String third = String.valueOf(next.charAt(2));
                                                                                    String fourth = String.valueOf(next.charAt(3));
                                                                                    String fifth = String.valueOf(next.charAt(4));
                                                                                    String sixth = String.valueOf(next.charAt(5));
                                                                                    if (massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
                                                                                            new int[]{_t,_a,_i,_n,_g})){
                                                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                                                            key[_k]=third.toLowerCase();
                                                                                            hasK=true;
                                                                                            k_taking.close();
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }

                                                                            if(!hasK){
                                                                                k_taking.close();
                                                                                Scanner k_ask= new Scanner(cipher);
                                                                                while(k_ask.hasNext()){
                                                                                    String next=k_ask.next();
                                                                                    if (next.length()==3){
                                                                                        String first = String.valueOf(next.charAt(0));
                                                                                        String second = String.valueOf(next.charAt(1));
                                                                                        String third = String.valueOf(next.charAt(2));
                                                                                        if (massCalc_notAnyOther(new String[]{first,second},
                                                                                                new int[]{_a,_s})){
                                                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/){
                                                                                                key[_k]=third.toLowerCase();
                                                                                                hasK=true;
                                                                                                k_ask.close();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        // january
        Scanner j = new Scanner(cipher);

        while (j.hasNext()) {
            String next = j.next();
            if (next.length() == 7) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                String fifth = String.valueOf(next.charAt(4));
                String sixth = String.valueOf(next.charAt(5));
                String seventh = String.valueOf(next.charAt(6));
                if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth, sixth, seventh },
                        new int[] { 0, 13, 20, 0, 17, 24 })) {
                    key[_j] = first.toLowerCase();
                    hasJ = true;
                    System.err.println("hasJ = true;");
                    j.close();

                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                    System.err.println(correctKey);

                    break;
                }
            }
        }
        if (!hasJ) {
            j.close();
            Scanner j_just = new Scanner(cipher);

            while (j_just.hasNext()) {
                String next = j_just.next();
                if (next.length() == 4) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    if (massCalc_notAnyOther(new String[] { second, third, fourth }, new int[] { _u, _s, _t })) {
                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                            key[_j] = first.toLowerCase();
                            hasJ = true;
                            System.err.println("hasJ = true;");
                            j_just.close();
                            System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                            System.err.println(correctKey);

                            break;
                        }
                    }
                }
            }

            if (!hasJ) {
                j_just.close();
                Scanner j_joe = new Scanner(cipher);

                while (j_joe.hasNext()) {
                    String next = j_joe.next();
                    if (next.length() == 3) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        if (massCalc_notAnyOther(new String[] { second, third }, new int[] { _o, _e })) {
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                key[_j] = first.toLowerCase();
                                hasJ = true;
                                System.err.println("hasJ = true;");
                                j_joe.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }

                if (!hasJ) {
                    j_joe.close();
                    Scanner j_subject = new Scanner(cipher);

                    while (j_subject.hasNext()) {
                        String next = j_subject.next();
                        if (next.length() == 7) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            String sixth = String.valueOf(next.charAt(5));
                            String seventh = String.valueOf(next.charAt(6));
                            if (massCalc_notAnyOther(new String[] { first, second, third, fifth, sixth, seventh },
                                    new int[] { _s, _u, _b, _e, _c, _t })) {
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                    key[_j] = fourth.toLowerCase();
                                    hasJ = true;
                                    System.err.println("hasJ = true;");
                                    j_subject.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }

                    if (!hasJ) {
                        j_subject.close();
                        Scanner j_project = new Scanner(cipher);

                        while (j_project.hasNext()) {
                            String next = j_project.next();
                            if (next.length() == 7) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                String sixth = String.valueOf(next.charAt(5));
                                String seventh = String.valueOf(next.charAt(6));
                                if (massCalc_notAnyOther(new String[] { first, second, third, fifth, sixth, seventh },
                                        new int[] { _p, _r, _o, _e, _c, _t })) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_j] = fourth.toLowerCase();
                                        hasJ = true;
                                        System.err.println("hasJ = true;");
                                        j_project.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                        }

                        if (!hasJ) {
                            j_project.close();
                            Scanner j_adjutant = new Scanner(cipher);

                            while (j_adjutant.hasNext()) {
                                String next = j_adjutant.next();
                                if (next.length() == 8) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    String sixth = String.valueOf(next.charAt(5));
                                    String seventh = String.valueOf(next.charAt(6));
                                    String eighth = String.valueOf(next.charAt(7));
                                    if (massCalc_notAnyOther(
                                            new String[] { first, second, fourth, fifth, sixth, seventh, eighth },
                                            new int[] { _a, _d, _u, _t, _a, _n, _t })) {
                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                            key[_j] = third.toLowerCase();
                                            hasJ = true;
                                            System.err.println("hasJ = true;");
                                            j_adjutant.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
                                    }
                                }
                            }

                            if (!hasJ) {
                                j_adjutant.close();
                                Scanner j_job = new Scanner(cipher);

                                while (j_job.hasNext()) {
                                    String next = j_job.next();
                                    if (next.length() == 3) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        if (massCalc_notAnyOther(new String[] { second, third },
                                                new int[] { _o, _b })) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_j] = first.toLowerCase();
                                                hasJ = true;
                                                System.err.println("hasJ = true;");
                                                j_job.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!hasJ) {
                                    j_job.close();
                                    Scanner j_jaggers = new Scanner(cipher);

                                    while (j_jaggers.hasNext()) {
                                        String next = j_jaggers.next();
                                        if (next.length() == 7) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));
                                            String sixth = String.valueOf(next.charAt(5));
                                            String seventh = String.valueOf(next.charAt(6));
                                            if (massCalc_notAnyOther(
                                                    new String[] { second, third, fourth, fifth, sixth, seventh },
                                                    new int[] { _a, _g, _g, _e, _r, _s })) {
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                    key[_j] = first.toLowerCase();
                                                    hasJ = true;
                                                    System.err.println("hasJ = true;");
                                                    j_jaggers.close();
                                                    System.err.println(
                                                            (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                    System.err.println(correctKey);

                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!hasJ) {
                                        j_jaggers.close();
                                        Scanner j_joined = new Scanner(cipher);

                                        while (j_joined.hasNext()) {
                                            String next = j_joined.next();
                                            if (next.length() == 6) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                String fifth = String.valueOf(next.charAt(4));
                                                String sixth = String.valueOf(next.charAt(5));
                                                if (massCalc_notAnyOther(
                                                        new String[] { second, third, fourth, fifth, sixth },
                                                        new int[] { _o, _i, _n, _e, _d })) {
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                        key[_j] = first.toLowerCase();
                                                        hasJ = true;
                                                        System.err.println("hasJ = true;");
                                                        j_joined.close();
                                                        System.err.println((Arrays.toString(key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(correctKey);

                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (!hasJ) {
                                            j_joined.close();
                                            Scanner j_object = new Scanner(cipher);

                                            while (j_object.hasNext()) {
                                                String next = j_object.next();
                                                if (next.length() == 6) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    String fourth = String.valueOf(next.charAt(3));
                                                    String fifth = String.valueOf(next.charAt(4));
                                                    String sixth = String.valueOf(next.charAt(5));
                                                    if (massCalc_notAnyOther(
                                                            new String[] { first, second, fourth, fifth, sixth },
                                                            new int[] { _o, _b, _e, _c, _t })) {
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                            key[_j] = third.toLowerCase();
                                                            hasJ = true;
                                                            System.err.println("hasJ = true;");
                                                            j_object.close();
                                                            System.err.println((Arrays.toString(key))
                                                                    .replaceAll("null", "\u0000"));
                                                            System.err.println(correctKey);

                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!hasJ) {
                                                j_object.close();
                                                Scanner j_jumped = new Scanner(cipher);

                                                while (j_jumped.hasNext()) {
                                                    String next = j_jumped.next();
                                                    if (next.length() == 6) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        String fifth = String.valueOf(next.charAt(4));
                                                        String sixth = String.valueOf(next.charAt(5));
                                                        if (massCalc_notAnyOther(
                                                                new String[] { second, third, fourth, fifth, sixth },
                                                                new int[] { _u, _m, _p, _e, _d })) {
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                key[_j] = first.toLowerCase();
                                                                hasJ = true;
                                                                System.err.println("hasJ = true;");
                                                                j_jumped.close();
                                                                System.err.println((Arrays.toString(key))
                                                                        .replaceAll("null", "\u0000"));
                                                                System.err.println(correctKey);

                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // sixteen
        Scanner x = new Scanner(cipher);

        while (x.hasNext()) {
            String next = x.next();
            if (next.length() == 7) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                String fifth = String.valueOf(next.charAt(4));
                String sixth = String.valueOf(next.charAt(5));
                String seventh = String.valueOf(next.charAt(6));
                if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth, sixth, seventh },
                        new int[] { 18, 8, 19, 4, 4, 13 })) {
                    key[_x] = third.toLowerCase();
                    hasX = true;
                    System.err.println("hasX = true;");
                    System.err.println("via Scanner x");
                    x.close();
                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                    System.err.println(correctKey);

                    break;
                }
            }
        }
        if (!hasX) {
            x.close();
            Scanner x_next = new Scanner(cipher);

            while (x_next.hasNext()) {
                String next = x_next.next();
                if (next.length() == 4) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    if (first.equalsIgnoreCase(key[_n])) {
                        if (second.equalsIgnoreCase(key[_e])) {
                            if (fourth.equalsIgnoreCase(key[_t])) {
                                key[_x] = third.toLowerCase();
                                hasX = true;
                                System.err.println("hasX = true;");
                                System.err.println("via Scanner x_next");
                                x_next.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }
            }

            if (!hasX) {
                x_next.close();
                Scanner x_expression = new Scanner(cipher);

                while (x_expression.hasNext()) {
                    String next = x_expression.next();
                    if (next.length() == 10) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        String fifth = String.valueOf(next.charAt(4));
                        String sixth = String.valueOf(next.charAt(5));
                        String seventh = String.valueOf(next.charAt(6));
                        String eighth = String.valueOf(next.charAt(7));
                        String ninth = String.valueOf(next.charAt(8));
                        String tenth = String.valueOf(next.charAt(9));
                        if (massCalc_notAnyOther(
                                new String[] { first, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth },
                                new int[] { _e, _p, _r, _e, _s, _s, _i, _o, _n })) {
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                key[_x] = second.toLowerCase();
                                hasX = true;
                                System.err.println("hasX = true;");
                                System.err.println("via Scanner x_expression");
                                x_expression.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }

                if (!hasX) {
                    x_expression.close();
                    Scanner x_except = new Scanner(cipher);

                    while (x_except.hasNext()) {
                        String next = x_except.next();
                        if (next.length() == 6) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            String sixth = String.valueOf(next.charAt(5));
                            if (massCalc_notAnyOther(new String[] { first, third, fourth, fifth, sixth },
                                    new int[] { _e, _c, _e, _p, _t })) {
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                    key[_x] = second.toLowerCase();
                                    hasX = true;
                                    System.err.println("hasX = true;");
                                    System.err.println("via Scanner x_except");
                                    x_except.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }

                    if (!hasX) {
                        x_except.close();
                        Scanner x_expressed = new Scanner(cipher);

                        while (x_expressed.hasNext()) {
                            String next = x_expressed.next();
                            if (next.length() == 9) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                String sixth = String.valueOf(next.charAt(5));
                                String seventh = String.valueOf(next.charAt(6));
                                String eighth = String.valueOf(next.charAt(7));
                                String ninth = String.valueOf(next.charAt(8));
                                if (massCalc_notAnyOther(
                                        new String[] { first, third, fourth, fifth, sixth, seventh, eighth, ninth },
                                        new int[] { _e, _p, _r, _e, _s, _s, _e, _d })) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_x] = second.toLowerCase();
                                        hasX = true;
                                        System.err.println("hasX = true;");
                                        System.err.println("via Scanner x_expressed");
                                        x_expressed.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                        }

                        if (!hasX) {
                            x_expressed.close();
                            Scanner x_six = new Scanner(cipher);

                            while (x_six.hasNext()) {
                                String next = x_six.next();
                                if (next.length() == 3) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    if (massCalc_notAnyOther(new String[] { first, second }, new int[] { _s, _i })) {
                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                            key[_x] = third.toLowerCase();
                                            hasX = true;
                                            System.err.println("hasX = true;");
                                            System.err.println("via Scanner x_six");
                                            x_six.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
                                    }
                                }
                            }

                            if (!hasX) {
                                x_six.close();
                                Scanner x_expected = new Scanner(cipher);

                                while (x_expected.hasNext()) {
                                    String next = x_expected.next();
                                    if (next.length() == 8) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));
                                        String sixth = String.valueOf(next.charAt(5));
                                        String seventh = String.valueOf(next.charAt(6));
                                        String eighth = String.valueOf(next.charAt(7));
                                        if (massCalc_notAnyOther(
                                                new String[] { first, third, fourth, fifth, sixth, seventh, eighth },
                                                new int[] { _e, _p, _e, _c, _t, _e, _d })) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_x] = second.toLowerCase();
                                                hasX = true;
                                                System.err.println("hasX = true;");
                                                System.err.println("via Scanner x_expected");
                                                x_expected.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!hasX) {
                                    x_expected.close();
                                    Scanner x_explain = new Scanner(cipher);

                                    while (x_explain.hasNext()) {
                                        String next = x_explain.next();
                                        if (next.length() == 7) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));
                                            String sixth = String.valueOf(next.charAt(5));
                                            String seventh = String.valueOf(next.charAt(6));
                                            if (massCalc_notAnyOther(
                                                    new String[] { first, third, fourth, fifth, sixth, seventh },
                                                    new int[] { _e, _p, _l, _a, _i, _n })) {
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                    key[_x] = second.toLowerCase();
                                                    hasX = true;
                                                    System.err.println("hasX = true;");
                                                    System.err.println("via Scanner x_explain");
                                                    x_explain.close();
                                                    System.err.println(
                                                            (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                    System.err.println(correctKey);

                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!hasX) {
                                        x_explain.close();
                                        Scanner x_fixed = new Scanner(cipher);

                                        while (x_fixed.hasNext()) {
                                            String next = x_fixed.next();
                                            if (next.length() == 5) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                String fifth = String.valueOf(next.charAt(4));
                                                if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                                                        new int[] { _f, _i, _e, _d })) {
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                        key[_x] = third.toLowerCase();
                                                        hasX = true;
                                                        System.err.println("hasX = true;");
                                                        System.err.println("via Scanner x_fixed");
                                                        x_fixed.close();
                                                        System.err.println((Arrays.toString(key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(correctKey);

                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (!hasX) {
                                            x_fixed.close();
                                            Scanner x_explained = new Scanner(cipher);

                                            while (x_explained.hasNext()) {
                                                String next = x_explained.next();
                                                if (next.length() == 9) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    String fourth = String.valueOf(next.charAt(3));
                                                    String fifth = String.valueOf(next.charAt(4));
                                                    String sixth = String.valueOf(next.charAt(5));
                                                    String seventh = String.valueOf(next.charAt(6));
                                                    String eighth = String.valueOf(next.charAt(7));
                                                    String ninth = String.valueOf(next.charAt(8));
                                                    if (massCalc_notAnyOther(
                                                            new String[] { first, third, fourth, fifth, sixth, seventh,
                                                                    eighth, ninth },
                                                            new int[] { _e, _p, _l, _a, _i, _n, _e, _d })) {
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                            key[_x] = second.toLowerCase();
                                                            hasX = true;
                                                            System.err.println("hasX = true;");
                                                            System.err.println("via Scanner x_explained");
                                                            x_explained.close();
                                                            System.err.println((Arrays.toString(key))
                                                                    .replaceAll("null", "\u0000"));
                                                            System.err.println(correctKey);

                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!hasX) {
                                                x_explained.close();
                                                Scanner x_experienced = new Scanner(cipher);

                                                while (x_experienced.hasNext()) {
                                                    String next = x_experienced.next();
                                                    if (next.length() == 11) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        String fifth = String.valueOf(next.charAt(4));
                                                        String sixth = String.valueOf(next.charAt(5));
                                                        String seventh = String.valueOf(next.charAt(6));
                                                        String eighth = String.valueOf(next.charAt(7));
                                                        String ninth = String.valueOf(next.charAt(8));
                                                        String tenth = String.valueOf(next.charAt(9));
                                                        String eleventh = String.valueOf(next.charAt(10));
                                                        if (massCalc_notAnyOther(
                                                                new String[] { first, third, fourth, fifth, sixth,
                                                                        seventh, eighth, ninth, tenth, eleventh },
                                                                new int[] { _e, _p, _e, _r, _i, _e, _n, _c, _e, _d })) {
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                key[_x] = second.toLowerCase();
                                                                hasX = true;
                                                                System.err.println("hasX = true;");
                                                                System.err.println("via Scanner x_experienced");
                                                                x_experienced.close();
                                                                System.err.println((Arrays.toString(key))
                                                                        .replaceAll("null", "\u0000"));
                                                                System.err.println(correctKey);

                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (!hasX) {
                                                    x_experienced.close();
                                                    Scanner x_alexander = new Scanner(cipher);

                                                    while (x_alexander.hasNext()) {
                                                        String next = x_alexander.next();
                                                        if (next.length() == 9) {
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));
                                                            String fourth = String.valueOf(next.charAt(3));
                                                            String fifth = String.valueOf(next.charAt(4));
                                                            String sixth = String.valueOf(next.charAt(5));
                                                            String seventh = String.valueOf(next.charAt(6));
                                                            String eighth = String.valueOf(next.charAt(7));
                                                            String ninth = String.valueOf(next.charAt(8));
                                                            if (massCalc_notAnyOther(
                                                                    new String[] { first, second, third, fifth, sixth,
                                                                            seventh, eighth, ninth },
                                                                    new int[] { _a, _l, _e, _a, _n, _d, _e, _r })) {
                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                    key[_x] = fourth.toLowerCase();
                                                                    hasX = true;
                                                                    System.err.println("hasX = true;");
                                                                    System.err.println("via Scanner x_alexander");
                                                                    x_alexander.close();
                                                                    System.err.println((Arrays.toString(key))
                                                                            .replaceAll("null", "\u0000"));
                                                                    System.err.println(correctKey);

                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (!hasX) {
                                                        x_alexander.close();
                                                        Scanner x_express = new Scanner(cipher);

                                                        while (x_express.hasNext()) {
                                                            String next = x_express.next();
                                                            if (next.length() == 7) {
                                                                String first = String.valueOf(next.charAt(0));
                                                                String second = String.valueOf(next.charAt(1));
                                                                String third = String.valueOf(next.charAt(2));
                                                                String fourth = String.valueOf(next.charAt(3));
                                                                String fifth = String.valueOf(next.charAt(4));
                                                                String sixth = String.valueOf(next.charAt(5));
                                                                String seventh = String.valueOf(next.charAt(6));
                                                                if (massCalc_notAnyOther(
                                                                        new String[] { first, third, fourth, fifth,
                                                                                sixth, seventh },
                                                                        new int[] { _e, _p, _r, _e, _s, _s })) {
                                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                        key[_x] = second.toLowerCase();
                                                                        hasX = true;
                                                                        System.err.println("hasX = true;");
                                                                        System.err.println("via Scanner x_express");
                                                                        x_express.close();
                                                                        System.err.println((Arrays.toString(key))
                                                                                .replaceAll("null", "\u0000"));
                                                                        System.err.println(correctKey);

                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (!hasX) {
                                                            x_express.close();
                                                            Scanner x_tax = new Scanner(cipher);

                                                            while (x_tax.hasNext()) {
                                                                String next = x_tax.next();
                                                                if (next.length() == 3) {
                                                                    String first = String.valueOf(next.charAt(0));
                                                                    String second = String.valueOf(next.charAt(1));
                                                                    String third = String.valueOf(next.charAt(2));
                                                                    if (massCalc_notAnyOther(
                                                                            new String[] { first, second },
                                                                            new int[] { _t, _a })) {
                                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                            key[_x] = third.toLowerCase();
                                                                            hasX = true;
                                                                            System.err.println("hasX = true;");
                                                                            System.err.println("via Scanner x_tax");
                                                                            x_tax.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(key))
                                                                                            .replaceAll("null",
                                                                                                    "\u0000"));
                                                                            System.err.println(correctKey);

                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            if (!hasX) {
                                                                x_tax.close();
                                                                Scanner x_expect = new Scanner(cipher);

                                                                while (x_expect.hasNext()) {
                                                                    String next = x_expect.next();
                                                                    if (next.length() == 6) {
                                                                        String first = String.valueOf(next.charAt(0));
                                                                        String second = String.valueOf(next.charAt(1));
                                                                        String third = String.valueOf(next.charAt(2));
                                                                        String fourth = String.valueOf(next.charAt(3));
                                                                        String fifth = String.valueOf(next.charAt(4));
                                                                        String sixth = String.valueOf(next.charAt(5));
                                                                        if (massCalc_notAnyOther(
                                                                                new String[] { first, third, fourth,
                                                                                        fifth, sixth },
                                                                                new int[] { _e, _p, _e, _c, _t })) {
                                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                key[_x] = second.toLowerCase();
                                                                                hasX = true;
                                                                                System.err.println("hasX = true;");
                                                                                System.err.println(
                                                                                        "via Scanner x_expect");
                                                                                x_expect.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(key))
                                                                                                .replaceAll("null",
                                                                                                        "\u0000"));
                                                                                System.err.println(correctKey);

                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                                if (!hasX) {
                                                                    x_expect.close();
                                                                    Scanner x_exclaimed = new Scanner(cipher);

                                                                    while (x_exclaimed.hasNext()) {
                                                                        String next = x_exclaimed.next();
                                                                        if (next.length() == 9) {
                                                                            String first = String
                                                                                    .valueOf(next.charAt(0));
                                                                            String second = String
                                                                                    .valueOf(next.charAt(1));
                                                                            String third = String
                                                                                    .valueOf(next.charAt(2));
                                                                            String fourth = String
                                                                                    .valueOf(next.charAt(3));
                                                                            String fifth = String
                                                                                    .valueOf(next.charAt(4));
                                                                            String sixth = String
                                                                                    .valueOf(next.charAt(5));
                                                                            String seventh = String
                                                                                    .valueOf(next.charAt(6));
                                                                            String eighth = String
                                                                                    .valueOf(next.charAt(7));
                                                                            String ninth = String
                                                                                    .valueOf(next.charAt(8));
                                                                            if (massCalc_notAnyOther(
                                                                                    new String[] { first, third, fourth,
                                                                                            fifth, sixth, seventh,
                                                                                            eighth, ninth },
                                                                                    new int[] { _e, _c, _l, _a, _i, _m,
                                                                                            _e, _d })) {
                                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                    key[_x] = second.toLowerCase();
                                                                                    hasX = true;
                                                                                    System.err.println("hasX = true;");
                                                                                    System.err.println(
                                                                                            "via Scanner x_exclaimed");
                                                                                    x_exclaimed.close();
                                                                                    System.err.println(
                                                                                            (Arrays.toString(key))
                                                                                                    .replaceAll("null",
                                                                                                            "\u0000"));
                                                                                    System.err.println(correctKey);

                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }

                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // amazing
        Scanner z = new Scanner(cipher);

        while (z.hasNext()) {
            String next = z.next();
            if (next.length() == 7) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                String fourth = String.valueOf(next.charAt(3));
                String fifth = String.valueOf(next.charAt(4));
                String sixth = String.valueOf(next.charAt(5));
                String seventh = String.valueOf(next.charAt(6));
                if (massCalc_notAnyOther(new String[] { first, second, third, fifth, sixth, seventh },
                        new int[] { 0, 12, 0, 8, 13, 6 })) {
                    key[_z] = fourth.toLowerCase();
                    hasZ = true;
                    System.err.println("hasZ = true;");
                    System.err.println("via Scanner z");
                    z.close();
                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                    System.err.println(correctKey);

                    break;
                }
            }
        }
        if (!hasZ) {
            z.close();
            Scanner z_gazed = new Scanner(cipher);

            while (z_gazed.hasNext()) {
                String next = z_gazed.next();
                if (next.length() == 5) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    String fifth = String.valueOf(next.charAt(4));
                    if (first.equalsIgnoreCase(key[_g])) {
                        if (second.equalsIgnoreCase(key[_a])) {
                            if (fourth.equalsIgnoreCase(key[_e])) {
                                if (fifth.equalsIgnoreCase(key[_d])) {
                                    key[_z] = third.toLowerCase();
                                    hasZ = true;
                                    System.err.println("hasZ = true;");
                                    System.err.println("via Scanner z_gazed");
                                    z_gazed.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }
                }
            }

            if (!hasZ) {
                z_gazed.close();
                Scanner z_seized = new Scanner(cipher);

                while (z_seized.hasNext()) {
                    String next = z_seized.next();
                    if (next.length() == 6) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        String fifth = String.valueOf(next.charAt(4));
                        String sixth = String.valueOf(next.charAt(5));
                        if (massCalc_notAnyOther(new String[] { first, second, third, fifth, sixth },
                                new int[] { _s, _e, _i, _e, _d })) {
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                key[_z] = fourth.toLowerCase();
                                hasZ = true;
                                System.err.println("hasZ = true;");
                                System.err.println("via Scanner z_seized");
                                z_seized.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }

                if (!hasZ) {
                    z_seized.close();
                    Scanner z_recognized = new Scanner(cipher);

                    while (z_recognized.hasNext()) {
                        String next = z_recognized.next();
                        if (next.length() == 10) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            String sixth = String.valueOf(next.charAt(5));
                            String seventh = String.valueOf(next.charAt(6));
                            String eighth = String.valueOf(next.charAt(7));
                            String ninth = String.valueOf(next.charAt(8));
                            String tenth = String.valueOf(next.charAt(9));
                            if (massCalc_notAnyOther(
                                    new String[] { first, second, third, fourth, fifth, sixth, seventh, ninth, tenth },
                                    new int[] { _r, _e, _c, _o, _g, _n, _i, _e, _d })) {
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                    key[_z] = eighth.toLowerCase();
                                    hasZ = true;
                                    System.err.println("hasZ = true;");
                                    System.err.println("via Scanner z_recognized");
                                    z_recognized.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }

                    if (!hasZ) {
                        z_recognized.close();
                        Scanner z_realized = new Scanner(cipher);

                        while (z_realized.hasNext()) {
                            String next = z_realized.next();
                            if (next.length() == 8) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                String sixth = String.valueOf(next.charAt(5));
                                String seventh = String.valueOf(next.charAt(6));
                                String eighth = String.valueOf(next.charAt(7));
                                if (massCalc_notAnyOther(
                                        new String[] { first, second, third, fourth, fifth, seventh, eighth },
                                        new int[] { _r, _e, _a, _l, _i, _e, _d })) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_z] = sixth.toLowerCase();
                                        hasZ = true;
                                        System.err.println("hasZ = true;");
                                        System.err.println("via Scanner z_realized");
                                        z_realized.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                        }

                        if (!hasZ) {
                            z_realized.close();
                            Scanner z_recognize = new Scanner(cipher);

                            while (z_recognize.hasNext()) {
                                String next = z_recognize.next();
                                if (next.length() == 9) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    String sixth = String.valueOf(next.charAt(5));
                                    String seventh = String.valueOf(next.charAt(6));
                                    String eighth = String.valueOf(next.charAt(7));
                                    String ninth = String.valueOf(next.charAt(8));
                                    if (massCalc_notAnyOther(
                                            new String[] { first, second, third, fourth, fifth, sixth, seventh, ninth },
                                            new int[] { _r, _e, _c, _o, _g, _n, _i, _e })) {
                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                            key[_z] = eighth.toLowerCase();
                                            hasZ = true;
                                            System.err.println("hasZ = true;");
                                            System.err.println("via Scanner z_recognize");
                                            z_recognize.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
                                    }
                                }
                            }

                            if (!hasZ) {
                                z_recognize.close();
                                Scanner z_gazing = new Scanner(cipher);

                                while (z_gazing.hasNext()) {
                                    String next = z_gazing.next();
                                    if (next.length() == 6) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));
                                        String sixth = String.valueOf(next.charAt(5));
                                        if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth, sixth },
                                                new int[] { _g, _a, _i, _n, _g })) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_z] = third.toLowerCase();
                                                hasZ = true;
                                                System.err.println("hasZ = true;");
                                                System.err.println("via Scanner z_gazing");
                                                z_gazing.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!hasZ) {
                                    z_gazing.close();
                                    Scanner z_zeituni = new Scanner(cipher);

                                    while (z_zeituni.hasNext()) {
                                        String next = z_zeituni.next();
                                        if (next.length() == 7) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));
                                            String sixth = String.valueOf(next.charAt(5));
                                            String seventh = String.valueOf(next.charAt(6));
                                            if (massCalc_notAnyOther(
                                                    new String[] { second, third, fourth, fifth, sixth, seventh },
                                                    new int[] { _e, _i, _t, _u, _n, _i })) {
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                    key[_z] = first.toLowerCase();
                                                    hasZ = true;
                                                    System.err.println("hasZ = true;");
                                                    System.err.println("via Scanner z_zeituni");
                                                    z_zeituni.close();
                                                    System.err.println(
                                                            (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                    System.err.println(correctKey);

                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!hasZ) {
                                        z_zeituni.close();
                                        Scanner z_realize = new Scanner(cipher);

                                        while (z_realize.hasNext()) {
                                            String next = z_realize.next();
                                            if (next.length() == 7) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                String fifth = String.valueOf(next.charAt(4));
                                                String sixth = String.valueOf(next.charAt(5));
                                                String seventh = String.valueOf(next.charAt(6));
                                                if (massCalc_notAnyOther(
                                                        new String[] { first, second, third, fourth, fifth, seventh },
                                                        new int[] { _r, _e, _a, _l, _i, _e })) {
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                        key[_z] = sixth.toLowerCase();
                                                        hasZ = true;
                                                        System.err.println("hasZ = true;");
                                                        System.err.println("via Scanner z_realize");
                                                        z_realize.close();
                                                        System.err.println((Arrays.toString(key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(correctKey);

                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (!hasZ) {
                                            z_realize.close();
                                            Scanner z_dozen = new Scanner(cipher);

                                            while (z_dozen.hasNext()) {
                                                String next = z_dozen.next();
                                                if (next.length() == 5) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    String fourth = String.valueOf(next.charAt(3));
                                                    String fifth = String.valueOf(next.charAt(4));
                                                    if (massCalc_notAnyOther(
                                                            new String[] { first, second, fourth, fifth },
                                                            new int[] { _d, _o, _e, _n })) {
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                            key[_z] = third.toLowerCase();
                                                            hasZ = true;
                                                            System.err.println("hasZ = true;");
                                                            System.err.println("via Scanner z_dozen");
                                                            z_dozen.close();
                                                            System.err.println((Arrays.toString(key))
                                                                    .replaceAll("null", "\u0000"));
                                                            System.err.println(correctKey);

                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!hasZ) {
                                                z_dozen.close();
                                                Scanner z_recognizing = new Scanner(cipher);

                                                while (z_recognizing.hasNext()) {
                                                    String next = z_recognizing.next();
                                                    if (next.length() == 11) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        String fifth = String.valueOf(next.charAt(4));
                                                        String sixth = String.valueOf(next.charAt(5));
                                                        String seventh = String.valueOf(next.charAt(6));
                                                        String eighth = String.valueOf(next.charAt(7));
                                                        String ninth = String.valueOf(next.charAt(8));
                                                        String tenth = String.valueOf(next.charAt(9));
                                                        String eleventh = String.valueOf(next.charAt(10));
                                                        if (massCalc_notAnyOther(
                                                                new String[] { first, second, third, fourth, fifth,
                                                                        sixth, seventh, ninth, tenth, eleventh },
                                                                new int[] { _r, _e, _c, _o, _g, _n, _i, _i, _n, _g })) {
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                key[_z] = eighth.toLowerCase();
                                                                hasZ = true;
                                                                System.err.println("hasZ = true;");
                                                                System.err.println("via Scanner z_recognizing");
                                                                z_recognizing.close();
                                                                System.err.println((Arrays.toString(key))
                                                                        .replaceAll("null", "\u0000"));
                                                                System.err.println(correctKey);

                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (!hasZ) {
                                                    z_recognizing.close();
                                                    Scanner z_seizing = new Scanner(cipher);

                                                    while (z_seizing.hasNext()) {
                                                        String next = z_seizing.next();
                                                        if (next.length() == 7) {
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));
                                                            String fourth = String.valueOf(next.charAt(3));
                                                            String fifth = String.valueOf(next.charAt(4));
                                                            String sixth = String.valueOf(next.charAt(5));
                                                            String seventh = String.valueOf(next.charAt(6));
                                                            if (massCalc_notAnyOther(
                                                                    new String[] { first, second, third, fifth, sixth,
                                                                            seventh },
                                                                    new int[] { _s, _e, _i, _i, _n, _g })) {
                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                    key[_z] = fourth.toLowerCase();
                                                                    hasZ = true;
                                                                    System.err.println("hasZ = true;");
                                                                    System.err.println("via Scanner z_seizing");
                                                                    z_seizing.close();
                                                                    System.err.println((Arrays.toString(key))
                                                                            .replaceAll("null", "\u0000"));
                                                                    System.err.println(correctKey);

                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (!hasZ) {
                                                        z_seizing.close();
                                                        Scanner z_size = new Scanner(cipher);

                                                        while (z_size.hasNext()) {
                                                            String next = z_size.next();
                                                            if (next.length() == 4) {
                                                                String first = String.valueOf(next.charAt(0));
                                                                String second = String.valueOf(next.charAt(1));
                                                                String third = String.valueOf(next.charAt(2));
                                                                String fourth = String.valueOf(next.charAt(3));
                                                                if (massCalc_notAnyOther(
                                                                        new String[] { first, second, fourth },
                                                                        new int[] { _s, _i, _e })) {
                                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                        key[_z] = third.toLowerCase();
                                                                        hasZ = true;
                                                                        System.err.println("hasZ = true;");
                                                                        z_size.close();
                                                                        System.err.println((Arrays.toString(key))
                                                                                .replaceAll("null", "\u0000"));
                                                                        System.err.println(correctKey);

                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (!hasZ) {
                                                            z_size.close();
                                                            Scanner z_kezia = new Scanner(cipher);

                                                            while (z_kezia.hasNext()) {
                                                                String next = z_kezia.next();
                                                                if (next.length() == 5) {
                                                                    String first = String.valueOf(next.charAt(0));
                                                                    String second = String.valueOf(next.charAt(1));
                                                                    String third = String.valueOf(next.charAt(2));
                                                                    String fourth = String.valueOf(next.charAt(3));
                                                                    String fifth = String.valueOf(next.charAt(4));
                                                                    if (massCalc_notAnyOther(
                                                                            new String[] { first, second, fourth,
                                                                                    fifth },
                                                                            new int[] { _k, _e, _i, _a })) {
                                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                            key[_z] = third.toLowerCase();
                                                                            hasZ = true;
                                                                            System.err.println("hasZ = true;");
                                                                            System.err.println("via Scanner z_kezia");
                                                                            z_kezia.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(key))
                                                                                            .replaceAll("null",
                                                                                                    "\u0000"));
                                                                            System.err.println(correctKey);

                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            if (!hasZ) {
                                                                z_kezia.close();
                                                                Scanner z_austerlitz = new Scanner(cipher);

                                                                while (z_austerlitz.hasNext()) {
                                                                    String next = z_austerlitz.next();
                                                                    if (next.length() == 10) {
                                                                        String first = String.valueOf(next.charAt(0));
                                                                        String second = String.valueOf(next.charAt(1));
                                                                        String third = String.valueOf(next.charAt(2));
                                                                        String fourth = String.valueOf(next.charAt(3));
                                                                        String fifth = String.valueOf(next.charAt(4));
                                                                        String sixth = String.valueOf(next.charAt(5));
                                                                        String seventh = String.valueOf(next.charAt(6));
                                                                        String eighth = String.valueOf(next.charAt(7));
                                                                        String ninth = String.valueOf(next.charAt(8));
                                                                        String tenth = String.valueOf(next.charAt(9));
                                                                        if (massCalc_notAnyOther(
                                                                                new String[] { first, second, third,
                                                                                        fourth, fifth, sixth, seventh,
                                                                                        eighth, ninth },
                                                                                new int[] { _a, _u, _s, _t, _e, _r, _l,
                                                                                        _i, _t })) {
                                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                key[_z] = tenth.toLowerCase();
                                                                                hasZ = true;
                                                                                System.err.println("hasZ = true;");
                                                                                System.err.println(
                                                                                        "via Scanner z_austerlitz");
                                                                                z_austerlitz.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(key))
                                                                                                .replaceAll("null",
                                                                                                        "\u0000"));
                                                                                System.err.println(correctKey);

                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                                if (!hasZ) {
                                                                    z_austerlitz.close();
                                                                    Scanner z_organized = new Scanner(cipher);

                                                                    while (z_organized.hasNext()) {
                                                                        String next = z_organized.next();
                                                                        if (next.length() == 9) {
                                                                            String first = String
                                                                                    .valueOf(next.charAt(0));
                                                                            String second = String
                                                                                    .valueOf(next.charAt(1));
                                                                            String third = String
                                                                                    .valueOf(next.charAt(2));
                                                                            String fourth = String
                                                                                    .valueOf(next.charAt(3));
                                                                            String fifth = String
                                                                                    .valueOf(next.charAt(4));
                                                                            String sixth = String
                                                                                    .valueOf(next.charAt(5));
                                                                            String seventh = String
                                                                                    .valueOf(next.charAt(6));
                                                                            String eighth = String
                                                                                    .valueOf(next.charAt(7));
                                                                            String ninth = String
                                                                                    .valueOf(next.charAt(8));
                                                                            if (massCalc_notAnyOther(
                                                                                    new String[] { first, second, third,
                                                                                            fourth, fifth, sixth,
                                                                                            eighth, ninth },
                                                                                    new int[] { _o, _r, _g, _a, _n, _i,
                                                                                            _e, _d })) {
                                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                    key[_z] = seventh.toLowerCase();
                                                                                    hasZ = true;
                                                                                    System.err.println("hasZ = true;");
                                                                                    System.err.println(
                                                                                            "via Scanner z_organized");
                                                                                    z_organized.close();
                                                                                    System.err.println(
                                                                                            (Arrays.toString(key))
                                                                                                    .replaceAll("null",
                                                                                                            "\u0000"));
                                                                                    System.err.println(correctKey);

                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }

                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!hasQ) {
            Scanner q_quite = new Scanner(cipher);

            while (q_quite.hasNext()) {
                String next = q_quite.next();
                if (next.length() == 5) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    String fifth = String.valueOf(next.charAt(4));
                    if (second.equalsIgnoreCase(key[_u])) {
                        if (third.equalsIgnoreCase(key[_i])) {
                            if (fourth.equalsIgnoreCase(key[_t])) {
                                if (fifth.equalsIgnoreCase(key[_e])) {
                                    key[_q] = first.toLowerCase();
                                    hasQ = true;
                                    System.err.println("hasQ = true;");
                                    System.err.println("via Scanner q_quite");
                                    q_quite.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }
                }
            }

            if (!hasQ) {
                q_quite.close();
                Scanner q_question = new Scanner(cipher);

                while (q_question.hasNext()) {
                    String next = q_question.next();
                    if (next.length() == 8) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));
                        String fifth = String.valueOf(next.charAt(4));
                        String sixth = String.valueOf(next.charAt(5));
                        String seventh = String.valueOf(next.charAt(6));
                        String eighth = String.valueOf(next.charAt(7));
                        if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth, sixth, seventh, eighth },
                                new int[] { _u, _e, _s, _t, _i, _o, _n })) {
                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                key[_q] = first.toLowerCase();
                                hasQ = true;
                                System.err.println("hasQ = true;");
                                System.err.println("via Scanner q_question");
                                q_question.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }

                if (!hasQ) {
                    q_question.close();
                    Scanner q_quickly = new Scanner(cipher);

                    while (q_quickly.hasNext()) {
                        String next = q_quickly.next();
                        if (next.length() == 7) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));
                            String fifth = String.valueOf(next.charAt(4));
                            String sixth = String.valueOf(next.charAt(5));
                            String seventh = String.valueOf(next.charAt(6));
                            if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth, sixth, seventh },
                                    new int[] { _u, _i, _c, _k, _l, _y })) {
                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                    key[_q] = first.toLowerCase();
                                    hasQ = true;
                                    System.err.println("hasQ = true;");
                                    System.err.println("via Scanner q_quickly");
                                    q_quickly.close();
                                    System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                    System.err.println(correctKey);

                                    break;
                                }
                            }
                        }
                    }

                    if (!hasQ) {
                        q_quickly.close();
                        Scanner q_questions = new Scanner(cipher);

                        while (q_questions.hasNext()) {
                            String next = q_questions.next();
                            if (next.length() == 9) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));
                                String fifth = String.valueOf(next.charAt(4));
                                String sixth = String.valueOf(next.charAt(5));
                                String seventh = String.valueOf(next.charAt(6));
                                String eighth = String.valueOf(next.charAt(7));
                                String ninth = String.valueOf(next.charAt(8));
                                if (massCalc_notAnyOther(
                                        new String[] { second, third, fourth, fifth, sixth, seventh, eighth, ninth },
                                        new int[] { _u, _e, _s, _t, _i, _o, _n, _s })) {
                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                        key[_q] = first.toLowerCase();
                                        hasQ = true;
                                        System.err.println("hasQ = true;");
                                        System.err.println("via Scanner q_questions");
                                        q_questions.close();
                                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                        System.err.println(correctKey);

                                        break;
                                    }
                                }
                            }
                        }

                        if (!hasQ) {
                            q_questions.close();
                            Scanner q_quiet = new Scanner(cipher);

                            while (q_quiet.hasNext()) {
                                String next = q_quiet.next();
                                if (next.length() == 5) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));
                                    String fifth = String.valueOf(next.charAt(4));
                                    if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                            new int[] { _u, _i, _e, _t })) {
                                            key[_q] = first.toLowerCase();
                                            hasQ = true;
                                            System.err.println("hasQ = true;");
                                            System.err.println("via Scanner q_quiet");
                                            q_quiet.close();
                                            System.err
                                                    .println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }

                                }
                            }

                            if (!hasQ) {
                                q_quiet.close();
                                Scanner q_quietly = new Scanner(cipher);

                                while (q_quietly.hasNext()) {
                                    String next = q_quietly.next();
                                    if (next.length() == 7) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));
                                        String sixth = String.valueOf(next.charAt(5));
                                        String seventh = String.valueOf(next.charAt(6));
                                        if (massCalc_notAnyOther(
                                                new String[] { second, third, fourth, fifth, sixth, seventh },
                                                new int[] { _u, _i, _e, _t, _l, _y })) {
                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                key[_q] = first.toLowerCase();
                                                hasQ = true;
                                                System.err.println("hasQ = true;");
                                                System.err.println("via Scanner q_quietly");
                                                q_quietly.close();
                                                System.err.println(
                                                        (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                System.err.println(correctKey);

                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!hasQ) {
                                    q_quietly.close();
                                    Scanner q_quick = new Scanner(cipher);

                                    while (q_quick.hasNext()) {
                                        String next = q_quick.next();
                                        if (next.length() == 5) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));
                                            if (massCalc_notAnyOther(new String[] { second, third, fourth, fifth },
                                                    new int[] { _u, _i, _c, _k })) {
                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                    key[_q] = first.toLowerCase();
                                                    hasQ = true;
                                                    System.err.println("hasQ = true;");
                                                    System.err.println("via Scanner q_quick");
                                                    q_quick.close();
                                                    System.err.println(
                                                            (Arrays.toString(key)).replaceAll("null", "\u0000"));
                                                    System.err.println(correctKey);

                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!hasQ) {
                                        q_quick.close();
                                        Scanner q_equal = new Scanner(cipher);

                                        while (q_equal.hasNext()) {
                                            String next = q_equal.next();
                                            if (next.length() == 5) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));
                                                String fifth = String.valueOf(next.charAt(4));
                                                if (massCalc_notAnyOther(new String[] { first, third, fourth, fifth },
                                                        new int[] { _e, _u, _a, _l })) {
                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                        key[_q] = second.toLowerCase();
                                                        hasQ = true;
                                                        System.err.println("hasQ = true;");
                                                        q_equal.close();
                                                        System.err.println("via Scanner q_equal");
                                                        System.err.println((Arrays.toString(key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(correctKey);

                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (!hasQ) {
                                            q_equal.close();
                                            Scanner q_squadron = new Scanner(cipher);

                                            while (q_squadron.hasNext()) {
                                                String next = q_squadron.next();
                                                if (next.length() == 8) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    String fourth = String.valueOf(next.charAt(3));
                                                    String fifth = String.valueOf(next.charAt(4));
                                                    String sixth = String.valueOf(next.charAt(5));
                                                    String seventh = String.valueOf(next.charAt(6));
                                                    String eighth = String.valueOf(next.charAt(7));
                                                    if (massCalc_notAnyOther(
                                                            new String[] { first, third, fourth, fifth, sixth, seventh,
                                                                    eighth },
                                                            new int[] { _s, _u, _a, _d, _r, _o, _n })) {
                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                            key[_q] = second.toLowerCase();
                                                            hasQ = true;
                                                            System.err.println("hasQ = true;");
                                                            System.err.println("via Scanner q_squadron");
                                                            q_squadron.close();
                                                            System.err.println((Arrays.toString(key))
                                                                    .replaceAll("null", "\u0000"));
                                                            System.err.println(correctKey);

                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (!hasQ) {
                                                q_squadron.close();
                                                Scanner q_inquired = new Scanner(cipher);

                                                while (q_inquired.hasNext()) {
                                                    String next = q_inquired.next();
                                                    if (next.length() == 8) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));
                                                        String fourth = String.valueOf(next.charAt(3));
                                                        String fifth = String.valueOf(next.charAt(4));
                                                        String sixth = String.valueOf(next.charAt(5));
                                                        String seventh = String.valueOf(next.charAt(6));
                                                        String eighth = String.valueOf(next.charAt(7));
                                                        if (massCalc_notAnyOther(
                                                                new String[] { first, second, fourth, fifth, sixth,
                                                                        seventh, eighth },
                                                                new int[] { _i, _n, _u, _i, _r, _e, _d })) {
                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                key[_q] = third.toLowerCase();
                                                                hasQ = true;
                                                                System.err.println("hasQ = true;");
                                                                System.err.println("via Scanner q_inquired");
                                                                q_inquired.close();
                                                                System.err.println((Arrays.toString(key))
                                                                        .replaceAll("null", "\u0000"));
                                                                System.err.println(correctKey);

                                                                break;
                                                            }
                                                        }
                                                    }
                                                }

                                                if (!hasQ) {
                                                    q_inquired.close();
                                                    Scanner q_quality = new Scanner(cipher);

                                                    while (q_quality.hasNext()) {
                                                        String next = q_quality.next();
                                                        if (next.length() == 7) {
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));
                                                            String fourth = String.valueOf(next.charAt(3));
                                                            String fifth = String.valueOf(next.charAt(4));
                                                            String sixth = String.valueOf(next.charAt(5));
                                                            String seventh = String.valueOf(next.charAt(6));
                                                            if (massCalc_notAnyOther(
                                                                    new String[] { second, third, fourth, fifth, sixth,
                                                                            seventh },
                                                                    new int[] { _u, _a, _l, _i, _t, _y })) {
                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                    key[_q] = first.toLowerCase();
                                                                    hasQ = true;
                                                                    System.err.println("hasQ = true;");
                                                                    System.err.println("via Scanner q_quality");
                                                                    q_quality.close();
                                                                    System.err.println((Arrays.toString(key))
                                                                            .replaceAll("null", "\u0000"));
                                                                    System.err.println(correctKey);

                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (!hasQ) {
                                                        q_quality.close();
                                                        Scanner q_quarter = new Scanner(cipher);

                                                        while (q_quarter.hasNext()) {
                                                            String next = q_quarter.next();
                                                            if (next.length() == 7) {
                                                                String first = String.valueOf(next.charAt(0));
                                                                String second = String.valueOf(next.charAt(1));
                                                                String third = String.valueOf(next.charAt(2));
                                                                String fourth = String.valueOf(next.charAt(3));
                                                                String fifth = String.valueOf(next.charAt(4));
                                                                String sixth = String.valueOf(next.charAt(5));
                                                                String seventh = String.valueOf(next.charAt(6));
                                                                if (massCalc_notAnyOther(
                                                                        new String[] { second, third, fourth, fifth,
                                                                                sixth, seventh },
                                                                        new int[] { _u, _a, _r, _t, _e, _r })) {
                                                                    if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                        key[_q] = first.toLowerCase();
                                                                        hasQ = true;
                                                                        System.err.println("hasQ = true;");
                                                                        System.err.println("via Scanner q_quarter");
                                                                        q_quarter.close();
                                                                        System.err.println((Arrays.toString(key))
                                                                                .replaceAll("null", "\u0000"));
                                                                        System.err.println(correctKey);

                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }

                                                        if (!hasQ) {
                                                            q_quarter.close();
                                                            Scanner q_required = new Scanner(cipher);

                                                            while (q_required.hasNext()) {
                                                                String next = q_required.next();
                                                                if (next.length() == 8) {
                                                                    String first = String.valueOf(next.charAt(0));
                                                                    String second = String.valueOf(next.charAt(1));
                                                                    String third = String.valueOf(next.charAt(2));
                                                                    String fourth = String.valueOf(next.charAt(3));
                                                                    String fifth = String.valueOf(next.charAt(4));
                                                                    String sixth = String.valueOf(next.charAt(5));
                                                                    String seventh = String.valueOf(next.charAt(6));
                                                                    String eighth = String.valueOf(next.charAt(7));
                                                                    if (massCalc_notAnyOther(
                                                                            new String[] { first, second, fourth, fifth,
                                                                                    sixth, seventh, eighth },
                                                                            new int[] { _r, _e, _u, _i, _r, _e, _d })) {
                                                                        if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                            key[_q] = third.toLowerCase();
                                                                            hasQ = true;
                                                                            System.err.println("hasQ = true;");
                                                                            System.err
                                                                                    .println("via Scanner q_required");
                                                                            q_required.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(key))
                                                                                            .replaceAll("null",
                                                                                                    "\u0000"));
                                                                            System.err.println(correctKey);

                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            if (!hasQ) {
                                                                q_required.close();
                                                                Scanner q_square = new Scanner(cipher);

                                                                while (q_square.hasNext()) {
                                                                    String next = q_square.next();
                                                                    if (next.length() == 6) {
                                                                        String first = String.valueOf(next.charAt(0));
                                                                        String second = String.valueOf(next.charAt(1));
                                                                        String third = String.valueOf(next.charAt(2));
                                                                        String fourth = String.valueOf(next.charAt(3));
                                                                        String fifth = String.valueOf(next.charAt(4));
                                                                        String sixth = String.valueOf(next.charAt(5));
                                                                        if (massCalc_notAnyOther(
                                                                                new String[] { first, third, fourth,
                                                                                        fifth, sixth },
                                                                                new int[] { _s, _u, _a, _r, _e })) {
                                                                            if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                key[_q] = second.toLowerCase();
                                                                                hasQ = true;
                                                                                System.err.println("hasQ = true;");
                                                                                System.err.println(
                                                                                        "via Scanner q_square");
                                                                                q_square.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(key))
                                                                                                .replaceAll("null",
                                                                                                        "\u0000"));
                                                                                System.err.println(correctKey);

                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                                if (!hasQ) {
                                                                    q_square.close();
                                                                    Scanner q_equally = new Scanner(cipher);

                                                                    while (q_equally.hasNext()) {
                                                                        String next = q_equally.next();
                                                                        if (next.length() == 7) {
                                                                            String first = String
                                                                                    .valueOf(next.charAt(0));
                                                                            String second = String
                                                                                    .valueOf(next.charAt(1));
                                                                            String third = String
                                                                                    .valueOf(next.charAt(2));
                                                                            String fourth = String
                                                                                    .valueOf(next.charAt(3));
                                                                            String fifth = String
                                                                                    .valueOf(next.charAt(4));
                                                                            String sixth = String
                                                                                    .valueOf(next.charAt(5));
                                                                            String seventh = String
                                                                                    .valueOf(next.charAt(6));
                                                                            if (massCalc_notAnyOther(
                                                                                    new String[] { first, third, fourth,
                                                                                            fifth, sixth, seventh },
                                                                                    new int[] { _e, _u, _a, _l, _l,
                                                                                            _y })) {
                                                                                if (1 == 1 /*originally"thisChar_isNotAlreadyInTheKey*/) {
                                                                                    key[_q] = second.toLowerCase();
                                                                                    hasQ = true;
                                                                                    System.err.println("hasQ = true;");
                                                                                    System.err.println(
                                                                                            "via Scanner q_equally");
                                                                                    q_equally.close();
                                                                                    System.err.println(
                                                                                            (Arrays.toString(key))
                                                                                                    .replaceAll("null",
                                                                                                            "\u0000"));
                                                                                    System.err.println(correctKey);

                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean[] has = new boolean[] { hasA, hasB, hasC, hasD, hasE, hasF, hasG, hasH, hasI, hasJ, hasK, hasL, hasM,
                hasN, hasO, hasP, hasQ, hasR, hasS, hasT, hasU, hasV, hasW, hasX, hasY, hasZ };
        boolean hasAll = true;
        int numLacking = 0;
        ArrayList<Integer> hasNot = new ArrayList<>();
        for (int i = 0; i < has.length; i++) {
            boolean Boolean = has[i];
            if (!Boolean) {
                hasNot.add(i);
                numLacking++;
                hasAll = false;
            }
        }
        if (hasAll){
            SubstitutionDeciphered decipherer = new SubstitutionDeciphered(cipher, key);
            solved = decipherer.get();
            isSolved = true;
        }
        if (!hasAll) {
            System.err.println("attempting brute force");
            SubstitutionBruteForcer bruteForcer = new SubstitutionBruteForcer(cipher, key);
            isSolved = bruteForcer.isSolved();

            if (isSolved) {
                System.err.println("brute force successful");
                key = bruteForcer.getKey();
                solved = bruteForcer.getSolved();
            }
        }
    }

    // 'a','b','c','d','e','f','g', red <--6
    // 'h','i','j','k','l','m', 'n', yellow <--13
    // 'o','p','q','r','s','t', green <--19
    // 'u','v','w','x','y','z' blue <--25
    private boolean check(String[] tempKey) {
        boolean rtn = false;
        Scramble scramble = new Scramble(tempKey, getCipher());
        not_english not_english = new not_english(scramble.get());
        if (!not_english.not_english()) {
            rtn = true;
        }
        return rtn;
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
    private boolean AliasAdaptedMassCalcNotAnyOther(String[] these, int[] spotsOfThese){
        boolean rtn = true;
        for (int i = 0; i < these.length; i++) {
            if (!(these[i].equalsIgnoreCase(key[spotsOfThese[i]]))){
                rtn = false;
                break;
            }
        }
        return rtn;
    }
    private boolean massCalc_notAnyOther(String[] these, int[] spotsOfThese) {
        boolean rtn = true;
        boolean Break = false;
        if (1 != 1) {
            for (int i = 0; i < these.length; i++) {
                String ThisString = these[i];
                int indexException = spotsOfThese[i];
                for (int j = 0; j < key.length; j++) {
                    String KeyString = key[j];
                    if (KeyString != null) {
                        if (KeyString.equalsIgnoreCase(ThisString) && j != indexException) {
                            rtn = false;
                            Break = true;
                            break;
                        }
                    }
                }
                if (Break) {
                    break;
                }
            }
            return rtn;
        }
        return AliasAdaptedMassCalcNotAnyOther(these, spotsOfThese);
    }

    private boolean notAnotherVowel(String a, int b) {
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

    private char[] replace(char[] original, char replaceChar) {
        ArrayList<Character> characters = new ArrayList<>();
        for (char o : original) {
            characters.add(o);
        }
        characters.remove(characters.indexOf(replaceChar));
        char[] rtn = new char[original.length - 1];
        for (int i = 0; i < rtn.length; i++) {
            rtn[i] = characters.get(i);
        }
        return rtn;
    }

    private char[] replace2(char[] original, char replaceChar) {
        ArrayList<Character> characters = new ArrayList<>();
        for (char o : original) {
            if (o != replaceChar) {
                characters.add(o);
            }
        }
        char[] rtn = new char[original.length - 1];
        for (int i = 0; i < rtn.length; i++) {
            rtn[i] = characters.get(i);
        }
        return rtn;
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

//        test0();
//        test1();
//        test2();
//        test3();
//        test4();
          test5();
    }
    private static void test5(){
        SubstitutionPair source = charSet.getCipher5();
        SubstitutionCracker test = new SubstitutionCracker(source.getCipher(), source.getKey());
    }
    private static void test4() {
        SubstitutionPair source = charSet.getCipher4();
        SubstitutionCracker test = new SubstitutionCracker(source.getCipher(), source.getKey());
    }
    private static void test3() {
        SubstitutionPair source = charSet.getCipher3();
        SubstitutionCracker test = new SubstitutionCracker(source.getCipher(), source.getKey());
    }
    private static void test2() {
        SubstitutionPair source = charSet.getCipher2();
        SubstitutionCracker test = new SubstitutionCracker(source.getCipher(), source.getKey());
    }
    private static void test1() {
        SubstitutionPair source = charSet.getCipher1();
        SubstitutionCracker test = new SubstitutionCracker(source.getCipher(), source.getKey());
    }
        private static void test0() {
        SubstitutionPair source = charSet.getCipher0();
        SubstitutionCracker test = new SubstitutionCracker(source.getCipher(), source.getKey());
    }
}
