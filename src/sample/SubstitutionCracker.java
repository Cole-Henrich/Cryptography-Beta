package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubstitutionCracker {
    private final CharSet charSet = new CharSet();
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
        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        if (thisChar_isNotAlreadyInTheKey(first)) {
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
                            if (thisChar_isNotAlreadyInTheKey(first)) {
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
                                if (thisChar_isNotAlreadyInTheKey(first)) {
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
                                    if (thisChar_isNotAlreadyInTheKey(third)) {
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
                                        if (thisChar_isNotAlreadyInTheKey(first)) {
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
                                            if (thisChar_isNotAlreadyInTheKey(first)) {
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
                                                if (thisChar_isNotAlreadyInTheKey(first)) {
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
                                                    if (thisChar_isNotAlreadyInTheKey(first)) {
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
                                                        if (thisChar_isNotAlreadyInTheKey(first)) {
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
                                                            if (thisChar_isNotAlreadyInTheKey(first)) {
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
                                                                if (thisChar_isNotAlreadyInTheKey(first)) {
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
                                                                    if (thisChar_isNotAlreadyInTheKey(first)) {
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
                                                                        if (thisChar_isNotAlreadyInTheKey(third)) {
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
                                                                            if (thisChar_isNotAlreadyInTheKey(second)) {
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
                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        key[_r] = fourth.toLowerCase();
                        hasR = true;
                        System.err.println("hasR = true;");
                        r_there.close();
                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
                        System.err.println(correctKey);

                        break;
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    m.close();
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        m_time.close();
                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                    if (massCalc_notAnyOther(new String[] { first, second, fourth, fifth },
                            new int[] { _t, _a, _l, _e })) {
                        key[_b] = third.toLowerCase();
                        hasB = true;
                        System.err.println("hasB = true;");
                        System.err.println("via Scanner b_table");
                        b_table.close();
                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
                        System.err.println(correctKey);

                        break;
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
                            System.err.println("hasB = true;");
                            System.err.println("via Scanner b_bring");
                            b_bring.close();
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        if (thisChar_isNotAlreadyInTheKey(third)) {
                            key[_d] = third.toLowerCase();
                            hasD = true;
                            System.err.println("hasD = true;");
                            d_and.close();
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            if (thisChar_isNotAlreadyInTheKey(third)) {
                                key[_d] = third.toLowerCase();
                                hasD = true;
                                System.err.println("hasD = true;");
                                d_had.close();
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                    key[_d] = fourth.toLowerCase();
                                    hasD = true;
                                    System.err.println("hasD = true;");
                                    d_said.close();
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    if (thisChar_isNotAlreadyInTheKey(first)) {
                                        key[_d] = first.toLowerCase();
                                        hasD = true;
                                        System.err.println("hasD = true;");
                                        d_did.close();
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                            key[_d] = third.toLowerCase();
                                            hasD = true;
                                            System.err.println("hasD = true;");
                                            d_made.close();
                                            System.err
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                            if (thisChar_isNotAlreadyInTheKey(sixth)) {
                                                key[_d] = sixth.toLowerCase();
                                                hasD = true;
                                                System.err.println("hasD = true;");
                                                d_seemed.close();
                                                System.err.println(
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                    key[_d] = fourth.toLowerCase();
                                                    hasD = true;
                                                    System.err.println("hasD = true;");
                                                    d_head.close();
                                                    System.err.println(
                                                            (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    if (thisChar_isNotAlreadyInTheKey(fifth)) {
                                                        key[_d] = fifth.toLowerCase();
                                                        hasD = true;
                                                        System.err.println("hasD = true;");
                                                        d_heard.close();
                                                        System.err.println((Arrays.toString(this.key))
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
                                                        if (thisChar_isNotAlreadyInTheKey(first)) {
                                                            key[_d] = first.toLowerCase();
                                                            hasD = true;
                                                            System.err.println("hasD = true;");
                                                            d_day.close();
                                                            System.err.println((Arrays.toString(this.key))
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
                                                            if (thisChar_isNotAlreadyInTheKey(third)) {
                                                                key[_d] = third.toLowerCase();
                                                                hasD = true;
                                                                System.err.println("hasD = true;");
                                                                d_andrew.close();
                                                                System.err.println((Arrays.toString(this.key))
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
                                                                if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                                    key[_d] = fourth.toLowerCase();
                                                                    hasD = true;
                                                                    System.err.println("hasD = true;");
                                                                    d_hand.close();
                                                                    System.err.println((Arrays.toString(this.key))
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
                                                                    if (thisChar_isNotAlreadyInTheKey(sixth)) {
                                                                        key[_d] = sixth.toLowerCase();
                                                                        hasD = true;
                                                                        System.err.println("hasD = true;");
                                                                        d_behind.close();
                                                                        System.err.println((Arrays.toString(this.key))
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
                                                                        if (thisChar_isNotAlreadyInTheKey(sixth)) {
                                                                            key[_d] = sixth.toLowerCase();
                                                                            hasD = true;
                                                                            System.err.println("hasD = true;");
                                                                            d_already.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(this.key))
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
                                                                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                                                                key[_d] = first.toLowerCase();
                                                                                hasD = true;
                                                                                System.err.println("hasD = true;");
                                                                                d_dear.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(this.key))
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
                                                                                if (thisChar_isNotAlreadyInTheKey(
                                                                                        third)) {
                                                                                    key[_d] = third.toLowerCase();
                                                                                    hasD = true;
                                                                                    System.err.println("hasD = true;");
                                                                                    d_side.close();
                                                                                    System.err.println(
                                                                                            (Arrays.toString(this.key))
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                            if (thisChar_isNotAlreadyInTheKey(second)) {
                                                key[_o] = second.toLowerCase();
                                                hasO = true;
                                                System.err.println("hasO = true;");
                                                System.err.println("via Scanner o_too");
                                                o_too.close();
                                                System.err.println(
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            if (thisChar_isNotAlreadyInTheKey(second)) {
                                key[_u] = second.toLowerCase();
                                hasU = true;
                                System.err.println("hasU = true;");
                                System.err.println("via Scanner u_our");
                                u_our.close();
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                if (thisChar_isNotAlreadyInTheKey(second)) {
                                    key[_u] = second.toLowerCase();
                                    hasU = true;
                                    System.err.println("hasU = true;");
                                    System.err.println("via Scanner u_out");
                                    u_out.close();
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    if (thisChar_isNotAlreadyInTheKey(first)) {
                                        key[_u] = first.toLowerCase();
                                        hasU = true;
                                        System.err.println("hasU = true;");
                                        System.err.println("via Scanner u_use");
                                        u_use.close();
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                            key[_u] = third.toLowerCase();
                                            hasU = true;
                                            System.err.println("hasU = true;");
                                            System.err.println("via Scanner u_nouns");
                                            u_nouns.close();
                                            System.err
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                            if (thisChar_isNotAlreadyInTheKey(third)) {
                                                key[_u] = third.toLowerCase();
                                                hasU = true;
                                                System.err.println("hasU = true;");
                                                System.err.println("via Scanner u_house");
                                                u_house.close();
                                                System.err.println(
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                if (thisChar_isNotAlreadyInTheKey(third)) {
                                                    key[_u] = third.toLowerCase();
                                                    hasU = true;
                                                    System.err.println("hasU = true;");
                                                    System.err.println("via Scanner u_laugh");
                                                    u_laugh.close();

                                                    System.err.println(
                                                            (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    if (thisChar_isNotAlreadyInTheKey(third)) {
                                                        key[_u] = third.toLowerCase();
                                                        hasU = true;
                                                        System.err.println("hasU = true;");
                                                        System.err.println("via Scanner u_round");
                                                        u_round.close();
                                                        System.err.println((Arrays.toString(this.key))
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
                                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                                            key[_u] = third.toLowerCase();
                                                            hasU = true;
                                                            System.err.println("hasU = true;");
                                                            System.err.println("via Scanner u_sound");
                                                            u_sound.close();
                                                            System.err.println((Arrays.toString(this.key))
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
                                                            if (thisChar_isNotAlreadyInTheKey(third)) {
                                                                key[_u] = third.toLowerCase();
                                                                hasU = true;
                                                                System.err.println("hasU = true;");
                                                                System.err.println("via Scanner u_south");
                                                                u_south.close();
                                                                System.err.println((Arrays.toString(this.key))
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
                                                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                                                    key[_u] = first.toLowerCase();
                                                                    hasU = true;
                                                                    System.err.println("hasU = true;");
                                                                    System.err.println("via Scanner u_under");
                                                                    u_under.close();
                                                                    System.err.println((Arrays.toString(this.key))
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
                                                                    if (thisChar_isNotAlreadyInTheKey(first)) {
                                                                        key[_u] = first.toLowerCase();
                                                                        hasU = true;
                                                                        System.err.println("hasU = true;");
                                                                        System.err.println("via Scanner u_until");
                                                                        u_until.close();
                                                                        System.err.println((Arrays.toString(this.key))
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
                                                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                                                            key[_u] = third.toLowerCase();
                                                                            hasU = true;
                                                                            System.err.println("hasU = true;");
                                                                            System.err.println("via Scanner u_would");
                                                                            u_would.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(this.key))
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
                                                                            if (thisChar_isNotAlreadyInTheKey(second)) {
                                                                                key[_u] = second.toLowerCase();
                                                                                hasU = true;
                                                                                System.err.println("hasU = true;");
                                                                                System.err.println(
                                                                                        "via Scanner u_during");
                                                                                u_during.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(this.key))
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
                                                                                if (thisChar_isNotAlreadyInTheKey(
                                                                                        second)) {
                                                                                    key[_u] = second.toLowerCase();
                                                                                    hasU = true;
                                                                                    System.err.println("hasU = true;");
                                                                                    System.err.println(
                                                                                            "via Scanner u_number");
                                                                                    u_number.close();
                                                                                    System.err.println(
                                                                                            (Arrays.toString(this.key))
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
                                                                                    if (thisChar_isNotAlreadyInTheKey(
                                                                                            second)) {
                                                                                        key[_u] = second.toLowerCase();
                                                                                        hasU = true;
                                                                                        System.err.println(
                                                                                                "hasU = true;");
                                                                                        u_hundred.close();
                                                                                        System.err.println(
                                                                                                "via Scanner u_hundred");
                                                                                        System.err.println((Arrays
                                                                                                .toString(this.key))
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
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        if (thisChar_isNotAlreadyInTheKey(fifth)) {
                            key[_p] = fifth.toLowerCase();
                            hasP = true;
                            System.err.println("hasP = true;");
                            p_group.close();
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                key[_p] = first.toLowerCase();
                                hasP = true;
                                System.err.println("hasP = true;");
                                p_power.close();
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                    key[_p] = first.toLowerCase();
                                    hasP = true;
                                    System.err.println("hasP = true;");
                                    p_plane.close();
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    if (thisChar_isNotAlreadyInTheKey(first)) {
                                        key[_p] = first.toLowerCase();
                                        hasP = true;
                                        System.err.println("hasP = true;");
                                        p_plant.close();
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        if (thisChar_isNotAlreadyInTheKey(first)) {
                                            key[_p] = first.toLowerCase();
                                            hasP = true;
                                            System.err.println("hasP = true;");
                                            p_point.close();
                                            System.err
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                            if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                key[_p] = fourth.toLowerCase();
                                                hasP = true;
                                                System.err.println("hasP = true;");
                                                p_shape.close();
                                                System.err.println(
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                if (thisChar_isNotAlreadyInTheKey(fifth)) {
                                                    key[_p] = fifth.toLowerCase();
                                                    hasP = true;
                                                    System.err.println("hasP = true;");
                                                    p_sleep.close();
                                                    System.err.println(
                                                            (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    if (thisChar_isNotAlreadyInTheKey(second)) {
                                                        key[_p] = second.toLowerCase();
                                                        hasP = true;
                                                        System.err.println("hasP = true;");
                                                        p_spell.close();
                                                        System.err.println((Arrays.toString(this.key))
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
                                                        if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                            key[_p] = fourth.toLowerCase();
                                                            hasP = true;
                                                            System.err.println("hasP = true;");
                                                            p_dolphin.close();
                                                            System.err.println((Arrays.toString(this.key))
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
                                                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                                                key[_p] = first.toLowerCase();
                                                                hasP = true;
                                                                System.err.println("hasP = true;");
                                                                p_problem.close();
                                                                System.err.println((Arrays.toString(this.key))
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
                                                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                                                    key[_p] = first.toLowerCase();
                                                                    hasP = true;
                                                                    System.err.println("hasP = true;");
                                                                    p_penguin.close();
                                                                    System.err.println((Arrays.toString(this.key))
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        if (thisChar_isNotAlreadyInTheKey(third)) {
                            key[_c] = third.toLowerCase();
                            hasC = true;
                            System.err.println("hasC = true;");
                            c_much.close();
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            if (thisChar_isNotAlreadyInTheKey(third)) {
                                key[_c] = third.toLowerCase();
                                hasC = true;
                                System.err.println("hasC = true;");
                                c_social.close();
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                    key[_c] = first.toLowerCase();
                                    hasC = true;
                                    System.err.println("hasC = true;");
                                    c_child.close();
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    if (thisChar_isNotAlreadyInTheKey(first)) {
                                        key[_c] = first.toLowerCase();
                                        hasC = true;
                                        System.err.println("hasC = true;");
                                        c_class.close();
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        if (thisChar_isNotAlreadyInTheKey(first)) {
                                            key[_c] = first.toLowerCase();
                                            hasC = true;
                                            System.err.println("hasC = true;");
                                            c_clear.close();
                                            System.err
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                                key[_c] = first.toLowerCase();
                                                hasC = true;
                                                System.err.println("hasC = true;");
                                                c_could.close();
                                                System.err.println(
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                                    key[_c] = first.toLowerCase();
                                                    hasC = true;
                                                    System.err.println("hasC = true;");
                                                    c_cried.close();
                                                    System.err.println(
                                                            (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    if (thisChar_isNotAlreadyInTheKey(first)) {
                                                        key[_c] = first.toLowerCase();
                                                        hasC = true;
                                                        System.err.println("hasC = true;");
                                                        c_cross.close();
                                                        System.err.println((Arrays.toString(this.key))
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
                                                        if (thisChar_isNotAlreadyInTheKey(fifth)) {
                                                            key[_c] = fifth.toLowerCase();
                                                            hasC = true;
                                                            System.err.println("hasC = true;");
                                                            c_music.close();
                                                            System.err.println((Arrays.toString(this.key))
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
                                                            if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                                key[_c] = fourth.toLowerCase();
                                                                hasC = true;
                                                                System.err.println("hasC = true;");
                                                                c_reach.close();
                                                                System.err.println((Arrays.toString(this.key))
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
                                                                if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                                    key[_c] = fourth.toLowerCase();
                                                                    hasC = true;
                                                                    System.err.println("hasC = true;");
                                                                    c_space.close();
                                                                    System.err.println((Arrays.toString(this.key))
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
                                                                    if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                                        key[_c] = fourth.toLowerCase();
                                                                        hasC = true;
                                                                        System.err.println("hasC = true;");
                                                                        c_teach.close();
                                                                        System.err.println((Arrays.toString(this.key))
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
                                                                        if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                                            key[_c] = fourth.toLowerCase();
                                                                            hasC = true;
                                                                            System.err.println("hasC = true;");
                                                                            c_watch.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(this.key))
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
                                                                            if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                                                key[_c] = fourth.toLowerCase();
                                                                                hasC = true;
                                                                                System.err.println("hasC = true;");
                                                                                c_which.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(this.key))
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

                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        if (thisChar_isNotAlreadyInTheKey(first)) {
                            key[_f] = first.toLowerCase();
                            hasF = true;
                            System.err.println("hasF = true;");
                            f_from.close();
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            if (thisChar_isNotAlreadyInTheKey(second)) {
                                key[_f] = second.toLowerCase();
                                hasF = true;
                                System.err.println("hasF = true;");
                                f_after.close();
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                    key[_f] = first.toLowerCase();
                                    hasF = true;
                                    System.err.println("hasF = true;");
                                    f_first.close();
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    if (thisChar_isNotAlreadyInTheKey(first)) {
                                        key[_f] = first.toLowerCase();
                                        hasF = true;
                                        System.err.println("hasF = true;");
                                        f_found.close();
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        if (thisChar_isNotAlreadyInTheKey(first)) {
                                            key[_f] = first.toLowerCase();
                                            hasF = true;
                                            System.err.println("hasF = true;");
                                            f_front.close();
                                            System.err
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                                key[_f] = first.toLowerCase();
                                                hasF = true;
                                                System.err.println("hasF = true;");
                                                f_false.close();
                                                System.err.println(
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                                    key[_f] = first.toLowerCase();
                                                    hasF = true;
                                                    System.err.println("hasF = true;");
                                                    f_field.close();
                                                    System.err.println(
                                                            (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    if (thisChar_isNotAlreadyInTheKey(second)) {
                                                        key[_f] = second.toLowerCase();
                                                        hasF = true;
                                                        System.err.println("hasF = true;");
                                                        f_often.close();
                                                        System.err.println((Arrays.toString(this.key))
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
                                                        if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                            key[_f] = fourth.toLowerCase();
                                                            hasF = true;
                                                            System.err.println("hasF = true;");
                                                            f_perfect.close();
                                                            System.err.println((Arrays.toString(this.key))
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
                                                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                                                key[_f] = first.toLowerCase();
                                                                hasF = true;
                                                                System.err.println("hasF = true;");
                                                                f_freedom.close();
                                                                System.err.println((Arrays.toString(this.key))
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
                                                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                                                    key[_f] = first.toLowerCase();
                                                                    hasF = true;
                                                                    System.err.println("hasF = true;");
                                                                    f_forever.close();
                                                                    System.err.println((Arrays.toString(this.key))
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
                    if (massCalc_notAnyOther(new String[]{first,second,fourth},
                            new int[]{_l,_i,_e})){
                        if (thisChar_isNotAlreadyInTheKey(third)){
                            key[_k]=third.toLowerCase();
                            hasK=true;
                            k_like.close();
                            break;
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
                            if (thisChar_isNotAlreadyInTheKey(first)){
                                key[_k]=first.toLowerCase();
                                hasK=true;
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
                                if (thisChar_isNotAlreadyInTheKey(fourth)){
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
                                    if (thisChar_isNotAlreadyInTheKey(fourth)){
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
                                        if (thisChar_isNotAlreadyInTheKey(third)){
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
                                            if (thisChar_isNotAlreadyInTheKey(fourth)){
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
                                                if (thisChar_isNotAlreadyInTheKey(fifth)){
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
                                                    if (thisChar_isNotAlreadyInTheKey(first)){
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
                                                        if (thisChar_isNotAlreadyInTheKey(third)){
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
                                                            if (thisChar_isNotAlreadyInTheKey(fourth)){
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
                                                                if (thisChar_isNotAlreadyInTheKey(third)){
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
                                                                    if (thisChar_isNotAlreadyInTheKey(fourth)){
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
                                                                        if (thisChar_isNotAlreadyInTheKey(fifth)){
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
                                                                            if (thisChar_isNotAlreadyInTheKey(third)){
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
                                                                                if (thisChar_isNotAlreadyInTheKey(fourth)){
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
                                                                                    if (thisChar_isNotAlreadyInTheKey(fourth)){
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
                                                                                        if (thisChar_isNotAlreadyInTheKey(third)){
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
                                                                                            if (thisChar_isNotAlreadyInTheKey(third)){
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

                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                        if (thisChar_isNotAlreadyInTheKey(first)) {
                            key[_j] = first.toLowerCase();
                            hasJ = true;
                            System.err.println("hasJ = true;");
                            j_just.close();
                            System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                key[_j] = first.toLowerCase();
                                hasJ = true;
                                System.err.println("hasJ = true;");
                                j_joe.close();
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                    key[_j] = fourth.toLowerCase();
                                    hasJ = true;
                                    System.err.println("hasJ = true;");
                                    j_subject.close();
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                        key[_j] = fourth.toLowerCase();
                                        hasJ = true;
                                        System.err.println("hasJ = true;");
                                        j_project.close();
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                            key[_j] = third.toLowerCase();
                                            hasJ = true;
                                            System.err.println("hasJ = true;");
                                            j_adjutant.close();
                                            System.err
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                                key[_j] = first.toLowerCase();
                                                hasJ = true;
                                                System.err.println("hasJ = true;");
                                                j_job.close();
                                                System.err.println(
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                                    key[_j] = first.toLowerCase();
                                                    hasJ = true;
                                                    System.err.println("hasJ = true;");
                                                    j_jaggers.close();
                                                    System.err.println(
                                                            (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    if (thisChar_isNotAlreadyInTheKey(first)) {
                                                        key[_j] = first.toLowerCase();
                                                        hasJ = true;
                                                        System.err.println("hasJ = true;");
                                                        j_joined.close();
                                                        System.err.println((Arrays.toString(this.key))
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
                                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                                            key[_j] = third.toLowerCase();
                                                            hasJ = true;
                                                            System.err.println("hasJ = true;");
                                                            j_object.close();
                                                            System.err.println((Arrays.toString(this.key))
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
                                                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                                                key[_j] = first.toLowerCase();
                                                                hasJ = true;
                                                                System.err.println("hasJ = true;");
                                                                j_jumped.close();
                                                                System.err.println((Arrays.toString(this.key))
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
                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            if (thisChar_isNotAlreadyInTheKey(second)) {
                                key[_x] = second.toLowerCase();
                                hasX = true;
                                System.err.println("hasX = true;");
                                System.err.println("via Scanner x_expression");
                                x_expression.close();
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                if (thisChar_isNotAlreadyInTheKey(second)) {
                                    key[_x] = second.toLowerCase();
                                    hasX = true;
                                    System.err.println("hasX = true;");
                                    System.err.println("via Scanner x_except");
                                    x_except.close();
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    if (thisChar_isNotAlreadyInTheKey(second)) {
                                        key[_x] = second.toLowerCase();
                                        hasX = true;
                                        System.err.println("hasX = true;");
                                        System.err.println("via Scanner x_expressed");
                                        x_expressed.close();
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                            key[_x] = third.toLowerCase();
                                            hasX = true;
                                            System.err.println("hasX = true;");
                                            System.err.println("via Scanner x_six");
                                            x_six.close();
                                            System.err
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                            if (thisChar_isNotAlreadyInTheKey(second)) {
                                                key[_x] = second.toLowerCase();
                                                hasX = true;
                                                System.err.println("hasX = true;");
                                                System.err.println("via Scanner x_expected");
                                                x_expected.close();
                                                System.err.println(
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                if (thisChar_isNotAlreadyInTheKey(second)) {
                                                    key[_x] = second.toLowerCase();
                                                    hasX = true;
                                                    System.err.println("hasX = true;");
                                                    System.err.println("via Scanner x_explain");
                                                    x_explain.close();
                                                    System.err.println(
                                                            (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    if (thisChar_isNotAlreadyInTheKey(third)) {
                                                        key[_x] = third.toLowerCase();
                                                        hasX = true;
                                                        System.err.println("hasX = true;");
                                                        System.err.println("via Scanner x_fixed");
                                                        x_fixed.close();
                                                        System.err.println((Arrays.toString(this.key))
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
                                                        if (thisChar_isNotAlreadyInTheKey(second)) {
                                                            key[_x] = second.toLowerCase();
                                                            hasX = true;
                                                            System.err.println("hasX = true;");
                                                            System.err.println("via Scanner x_explained");
                                                            x_explained.close();
                                                            System.err.println((Arrays.toString(this.key))
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
                                                            if (thisChar_isNotAlreadyInTheKey(second)) {
                                                                key[_x] = second.toLowerCase();
                                                                hasX = true;
                                                                System.err.println("hasX = true;");
                                                                System.err.println("via Scanner x_experienced");
                                                                x_experienced.close();
                                                                System.err.println((Arrays.toString(this.key))
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
                                                                if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                                    key[_x] = fourth.toLowerCase();
                                                                    hasX = true;
                                                                    System.err.println("hasX = true;");
                                                                    System.err.println("via Scanner x_alexander");
                                                                    x_alexander.close();
                                                                    System.err.println((Arrays.toString(this.key))
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
                                                                    if (thisChar_isNotAlreadyInTheKey(second)) {
                                                                        key[_x] = second.toLowerCase();
                                                                        hasX = true;
                                                                        System.err.println("hasX = true;");
                                                                        System.err.println("via Scanner x_express");
                                                                        x_express.close();
                                                                        System.err.println((Arrays.toString(this.key))
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
                                                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                                                            key[_x] = third.toLowerCase();
                                                                            hasX = true;
                                                                            System.err.println("hasX = true;");
                                                                            System.err.println("via Scanner x_tax");
                                                                            x_tax.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(this.key))
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
                                                                            if (thisChar_isNotAlreadyInTheKey(second)) {
                                                                                key[_x] = second.toLowerCase();
                                                                                hasX = true;
                                                                                System.err.println("hasX = true;");
                                                                                System.err.println(
                                                                                        "via Scanner x_expect");
                                                                                x_expect.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(this.key))
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
                                                                                if (thisChar_isNotAlreadyInTheKey(
                                                                                        second)) {
                                                                                    key[_x] = second.toLowerCase();
                                                                                    hasX = true;
                                                                                    System.err.println("hasX = true;");
                                                                                    System.err.println(
                                                                                            "via Scanner x_exclaimed");
                                                                                    x_exclaimed.close();
                                                                                    System.err.println(
                                                                                            (Arrays.toString(this.key))
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
                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                key[_z] = fourth.toLowerCase();
                                hasZ = true;
                                System.err.println("hasZ = true;");
                                System.err.println("via Scanner z_seized");
                                z_seized.close();
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                if (thisChar_isNotAlreadyInTheKey(eighth)) {
                                    key[_z] = eighth.toLowerCase();
                                    hasZ = true;
                                    System.err.println("hasZ = true;");
                                    System.err.println("via Scanner z_recognized");
                                    z_recognized.close();
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    if (thisChar_isNotAlreadyInTheKey(sixth)) {
                                        key[_z] = sixth.toLowerCase();
                                        hasZ = true;
                                        System.err.println("hasZ = true;");
                                        System.err.println("via Scanner z_realized");
                                        z_realized.close();
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        if (thisChar_isNotAlreadyInTheKey(eighth)) {
                                            key[_z] = eighth.toLowerCase();
                                            hasZ = true;
                                            System.err.println("hasZ = true;");
                                            System.err.println("via Scanner z_recognize");
                                            z_recognize.close();
                                            System.err
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                            if (thisChar_isNotAlreadyInTheKey(third)) {
                                                key[_z] = third.toLowerCase();
                                                hasZ = true;
                                                System.err.println("hasZ = true;");
                                                System.err.println("via Scanner z_gazing");
                                                z_gazing.close();
                                                System.err.println(
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                                    key[_z] = first.toLowerCase();
                                                    hasZ = true;
                                                    System.err.println("hasZ = true;");
                                                    System.err.println("via Scanner z_zeituni");
                                                    z_zeituni.close();
                                                    System.err.println(
                                                            (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    if (thisChar_isNotAlreadyInTheKey(sixth)) {
                                                        key[_z] = sixth.toLowerCase();
                                                        hasZ = true;
                                                        System.err.println("hasZ = true;");
                                                        System.err.println("via Scanner z_realize");
                                                        z_realize.close();
                                                        System.err.println((Arrays.toString(this.key))
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
                                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                                            key[_z] = third.toLowerCase();
                                                            hasZ = true;
                                                            System.err.println("hasZ = true;");
                                                            System.err.println("via Scanner z_dozen");
                                                            z_dozen.close();
                                                            System.err.println((Arrays.toString(this.key))
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
                                                            if (thisChar_isNotAlreadyInTheKey(eighth)) {
                                                                key[_z] = eighth.toLowerCase();
                                                                hasZ = true;
                                                                System.err.println("hasZ = true;");
                                                                System.err.println("via Scanner z_recognizing");
                                                                z_recognizing.close();
                                                                System.err.println((Arrays.toString(this.key))
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
                                                                if (thisChar_isNotAlreadyInTheKey(fourth)) {
                                                                    key[_z] = fourth.toLowerCase();
                                                                    hasZ = true;
                                                                    System.err.println("hasZ = true;");
                                                                    System.err.println("via Scanner z_seizing");
                                                                    z_seizing.close();
                                                                    System.err.println((Arrays.toString(this.key))
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
                                                                    if (thisChar_isNotAlreadyInTheKey(third)) {
                                                                        key[_z] = third.toLowerCase();
                                                                        hasZ = true;
                                                                        System.err.println("hasZ = true;");
                                                                        z_size.close();
                                                                        System.err.println((Arrays.toString(this.key))
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
                                                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                                                            key[_z] = third.toLowerCase();
                                                                            hasZ = true;
                                                                            System.err.println("hasZ = true;");
                                                                            System.err.println("via Scanner z_kezia");
                                                                            z_kezia.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(this.key))
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
                                                                            if (thisChar_isNotAlreadyInTheKey(tenth)) {
                                                                                key[_z] = tenth.toLowerCase();
                                                                                hasZ = true;
                                                                                System.err.println("hasZ = true;");
                                                                                System.err.println(
                                                                                        "via Scanner z_austerlitz");
                                                                                z_austerlitz.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(this.key))
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
                                                                                if (thisChar_isNotAlreadyInTheKey(
                                                                                        seventh)) {
                                                                                    key[_z] = seventh.toLowerCase();
                                                                                    hasZ = true;
                                                                                    System.err.println("hasZ = true;");
                                                                                    System.err.println(
                                                                                            "via Scanner z_organized");
                                                                                    z_organized.close();
                                                                                    System.err.println(
                                                                                            (Arrays.toString(this.key))
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
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                key[_q] = first.toLowerCase();
                                hasQ = true;
                                System.err.println("hasQ = true;");
                                System.err.println("via Scanner q_question");
                                q_question.close();
                                System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                    key[_q] = first.toLowerCase();
                                    hasQ = true;
                                    System.err.println("hasQ = true;");
                                    System.err.println("via Scanner q_quickly");
                                    q_quickly.close();
                                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                    if (thisChar_isNotAlreadyInTheKey(first)) {
                                        key[_q] = first.toLowerCase();
                                        hasQ = true;
                                        System.err.println("hasQ = true;");
                                        System.err.println("via Scanner q_questions");
                                        q_questions.close();
                                        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                        if (thisChar_isNotAlreadyInTheKey(first)) {
                                            key[_q] = first.toLowerCase();
                                            hasQ = true;
                                            System.err.println("hasQ = true;");
                                            System.err.println("via Scanner q_quiet");
                                            q_quiet.close();
                                            System.err
                                                    .println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
                                            System.err.println(correctKey);

                                            break;
                                        }
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
                                            if (thisChar_isNotAlreadyInTheKey(first)) {
                                                key[_q] = first.toLowerCase();
                                                hasQ = true;
                                                System.err.println("hasQ = true;");
                                                System.err.println("via Scanner q_quietly");
                                                q_quietly.close();
                                                System.err.println(
                                                        (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                                    key[_q] = first.toLowerCase();
                                                    hasQ = true;
                                                    System.err.println("hasQ = true;");
                                                    System.err.println("via Scanner q_quick");
                                                    q_quick.close();
                                                    System.err.println(
                                                            (Arrays.toString(this.key)).replaceAll("null", "\u0000"));
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
                                                    if (thisChar_isNotAlreadyInTheKey(second)) {
                                                        key[_q] = second.toLowerCase();
                                                        hasQ = true;
                                                        System.err.println("hasQ = true;");
                                                        q_equal.close();
                                                        System.err.println("via Scanner q_equal");
                                                        System.err.println((Arrays.toString(this.key))
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
                                                        if (thisChar_isNotAlreadyInTheKey(second)) {
                                                            key[_q] = second.toLowerCase();
                                                            hasQ = true;
                                                            System.err.println("hasQ = true;");
                                                            System.err.println("via Scanner q_squadron");
                                                            q_squadron.close();
                                                            System.err.println((Arrays.toString(this.key))
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
                                                            if (thisChar_isNotAlreadyInTheKey(third)) {
                                                                key[_q] = third.toLowerCase();
                                                                hasQ = true;
                                                                System.err.println("hasQ = true;");
                                                                System.err.println("via Scanner q_inquired");
                                                                q_inquired.close();
                                                                System.err.println((Arrays.toString(this.key))
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
                                                                if (thisChar_isNotAlreadyInTheKey(first)) {
                                                                    key[_q] = first.toLowerCase();
                                                                    hasQ = true;
                                                                    System.err.println("hasQ = true;");
                                                                    System.err.println("via Scanner q_quality");
                                                                    q_quality.close();
                                                                    System.err.println((Arrays.toString(this.key))
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
                                                                    if (thisChar_isNotAlreadyInTheKey(first)) {
                                                                        key[_q] = first.toLowerCase();
                                                                        hasQ = true;
                                                                        System.err.println("hasQ = true;");
                                                                        System.err.println("via Scanner q_quarter");
                                                                        q_quarter.close();
                                                                        System.err.println((Arrays.toString(this.key))
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
                                                                        if (thisChar_isNotAlreadyInTheKey(third)) {
                                                                            key[_q] = third.toLowerCase();
                                                                            hasQ = true;
                                                                            System.err.println("hasQ = true;");
                                                                            System.err
                                                                                    .println("via Scanner q_required");
                                                                            q_required.close();
                                                                            System.err
                                                                                    .println((Arrays.toString(this.key))
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
                                                                            if (thisChar_isNotAlreadyInTheKey(second)) {
                                                                                key[_q] = second.toLowerCase();
                                                                                hasQ = true;
                                                                                System.err.println("hasQ = true;");
                                                                                System.err.println(
                                                                                        "via Scanner q_square");
                                                                                q_square.close();
                                                                                System.err.println(
                                                                                        (Arrays.toString(this.key))
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
                                                                                if (thisChar_isNotAlreadyInTheKey(
                                                                                        second)) {
                                                                                    key[_q] = second.toLowerCase();
                                                                                    hasQ = true;
                                                                                    System.err.println("hasQ = true;");
                                                                                    System.err.println(
                                                                                            "via Scanner q_equally");
                                                                                    q_equally.close();
                                                                                    System.err.println(
                                                                                            (Arrays.toString(this.key))
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
//        if (!hasAll) {
//            System.err.println("missing " + numLacking + " decoded equivalents");
//            if (numLacking < 12) {
//                System.err.println("Now attempting to brute force the remainder.");
//                boolean Break = false;
//                double reps = 0;
//                ArrayList<String> a0 = new ArrayList<>();
//                for (int i = 0; i < key.length; i++) {
//                    if (key[i] != null) {
//                        a0.add(key[i]);
//                    }
//                }
//                ArrayList<String> a1 = charSet.StringToStringArrayList(charSet.charToStringArray(alphabet));
//                ArrayList<String> a2 = charSet.inversionOf(a1, a0);
//                int size = a2.size();
//                String[] tempKey = key;
//                for (int ax = 0; ax < size; ax++) {
//                    tempKey[hasNot.get(0)] = a2.get(ax);
//                    ArrayList<String> a3 = a2;
//                    a3.remove(ax);
//                    if (numLacking > 1) {
//                        for (int bx = 0; bx < a3.size(); bx++) {
//                            tempKey[hasNot.get(1)] = a3.get(bx);
//                            ArrayList<String> a4 = a3;
//                            a4.remove(ax);
//                            if (numLacking > 2){
//                                for (int cx = 0; cx < a4.size(); cx++) {
//                                    tempKey[hasNot.get(2)] = a4.get(cx);
//                                    ArrayList<String> a5 = a4;
//                                    a4.remove(cx);
//                                    if (numLacking > 3){
//                                        for (int dx = 0; dx < a5.size(); dx++) {
//                                            tempKey[hasNot.get(3)] = a5.get(dx);
//                                            ArrayList<String> a6 = a5;
//                                            a6.remove(dx);
//                                            if (numLacking > 4) {
//                                                for (int ex = 0; ex < a6.size(); ex++) {
//                                                    tempKey[hasNot.get(4)] = a6.get(ex);
//                                                    ArrayList<String> a7 = a6;
//                                                    a7.remove(ex);
//                                                    if (numLacking > 5) {
//                                                        for (int fx = 0; fx < a7.size(); fx++) {
//                                                            tempKey[hasNot.get(5)] = a7.get(fx);
//                                                            ArrayList<String> a8 = a7;
//                                                            a8.remove(fx);
//                                                            if (numLacking > 6){
//                                                                for (int gx = 0; gx < a8.size(); gx++) {
//                                                                    tempKey[hasNot.get(6)] = a8.get(gx);
//                                                                    ArrayList<String> a9 = a8;
//                                                                    a9.remove(gx);
//                                                                    if (numLacking > 7){
//                                                                        for (int hx = 0; hx < a9.size(); hx++) {
//                                                                            tempKey[hasNot.get(7)] = a9.get(hx);
//                                                                            ArrayList<String> a10 = a9;
//                                                                            a10.remove(hx);
//                                                                            if (numLacking > 8) {
//                                                                                for (int ix = 0; ix < a10.size(); ix++) {
//                                                                                    tempKey[hasNot.get(8)] = a10.get(ix);
//                                                                                    ArrayList<String> a11 = a10;
//                                                                                    a11.remove(ix);
//                                                                                    if (numLacking > 9) {
//                                                                                        for (int jx = 0; jx < a11.size(); jx++) {
//                                                                                            tempKey[hasNot.get(9)] = a11.get(jx);
//                                                                                            ArrayList<String> a12 = a11;
//                                                                                            a12.remove(jx);
//                                                                                            if (numLacking == 11){
//                                                                                                for (int kx = 0; kx < a12.size(); kx++) {
//                                                                                                    tempKey[hasNot.get(10)] = a12.get(kx);
//                                                                                                    if (check(tempKey)) {
//                                                                                                        this.key = tempKey;
//                                                                                                        this.isSolved = true;
//                                                                                                        this.hasAll = true;
//                                                                                                        Break = true;
//                                                                                                        break;
//                                                                                                    }
//                                                                                                }
//                                                                                            }
//                                                                                            else {
//                                                                                                if (check(tempKey)) {
//                                                                                                    this.key = tempKey;
//                                                                                                    this.isSolved = true;
//                                                                                                    this.hasAll = true;
//                                                                                                    Break = true;
//                                                                                                    break;
//                                                                                                }
//                                                                                            }
//                                                                                            if (Break){
//                                                                                                break;
//                                                                                            }
//                                                                                        }
//                                                                                    } else {
//                                                                                        if (check(tempKey)) {
//                                                                                            this.key = tempKey;
//                                                                                            this.isSolved = true;
//                                                                                            this.hasAll = true;
//                                                                                            Break = true;
//                                                                                            break;
//                                                                                        }
//                                                                                    }
//                                                                                    if (Break) {
//                                                                                        break;
//                                                                                    }
//                                                                                }
//                                                                            }
//                                                                            else {
//                                                                                if (check(tempKey)) {
//                                                                                    this.key = tempKey;
//                                                                                    this.isSolved = true;
//                                                                                    this.hasAll = true;
//                                                                                    Break = true;
//                                                                                    break;
//                                                                                }
//                                                                            }
//                                                                            if (Break){
//                                                                                break;
//                                                                            }
//                                                                        }
//                                                                    }
//                                                                    else {
//                                                                        if (check(tempKey)) {
//                                                                            this.key = tempKey;
//                                                                            this.isSolved = true;
//                                                                            this.hasAll = true;
//                                                                            Break = true;
//                                                                            break;
//                                                                        }
//                                                                    }
//                                                                    if (Break){
//                                                                        break;
//                                                                    }
//                                                                }
//                                                            }
//                                                            else {
//                                                                if (check(tempKey)) {
//                                                                    this.key = tempKey;
//                                                                    this.isSolved = true;
//                                                                    this.hasAll = true;
//                                                                    Break = true;
//                                                                    break;
//                                                                }
//                                                            }
//                                                            if (Break){
//                                                                break;
//                                                            }
//                                                        }
//                                                    } else {
//                                                        if (check(tempKey)) {
//                                                            this.key = tempKey;
//                                                            this.isSolved = true;
//                                                            this.hasAll = true;
//                                                            Break = true;
//                                                            break;
//                                                        }
//                                                    }
//                                                    if (Break) {
//                                                        break;
//                                                    }
//                                                }
//                                            }
//                                            else {
//                                                if (check(tempKey)) {
//                                                    this.key = tempKey;
//                                                    this.isSolved = true;
//                                                    this.hasAll = true;
//                                                    Break = true;
//                                                    break;
//                                                }
//                                            }
//                                            if (Break){
//                                                break;
//                                            }
//                                        }
//                                    }
//                                    else {
//                                        if (check(tempKey)) {
//                                            this.key = tempKey;
//                                            this.isSolved = true;
//                                            this.hasAll = true;
//                                            Break = true;
//                                            break;
//                                        }
//                                    }
//                                    if (Break){
//                                        break;
//                                    }
//                                }
//                            }
//                            else {
//                                if (check(tempKey)) {
//                                    this.key = tempKey;
//                                    this.isSolved = true;
//                                    this.hasAll = true;
//                                    Break = true;
//                                    break;
//                                }
//                            }
//                            if (Break){
//                                break;
//                            }
//                        }
//                    } else {
//                        if (check(tempKey)) {
//                            this.key = tempKey;
//                            this.isSolved = true;
//                            this.hasAll = true;
//                            Break = true;
//                            break;
//                        }
//                    }
//                    if (Break) {
//                        break;
//                    }
//                }
//            }
//            else {
//                System.err.println("too many to brute force.");
//            }
//        }

        StringBuilder solver = new StringBuilder();
        for (int index = 0; index < cipher.length(); index++) {
            String Char = String.valueOf(cipher.charAt(index));
            if (isIgnorer(Char)) {
                solver.append(Char);
            } else {
                for (int keyIndex = 0; keyIndex < alphabet.length; keyIndex++) {
                    if (Char.equalsIgnoreCase(String.valueOf(alphabet[keyIndex]))) {
                        solver.append(key[keyIndex]);
                        break;
                    }
                }
            }
        }
        this.isSolved = true;
        this.solved = solver.toString();

        System.err.println(Arrays.toString(this.key));
    }

    // 'a','b','c','d','e','f','g', red <--6
    // 'h','i','j','k','l','m', 'n', yellow <--13
    // 'o','p','q','r','s','t', green <--19
    // 'u','v','w','x','y','z' blue <--25
    private boolean check(String[] tempKey) {
        boolean rtn = false;
        Scramble scramble = new Scramble(tempKey, this.getCipher());
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

    private boolean massCalc_notAnyOther(String[] these, int[] spotsOfThese) {
        boolean rtn = true;
        boolean Break = false;
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
        test0();
        test1();
        test2();
    }
    //green a vigenere cipher
    public static void test2(){
        SubstitutionCracker sc = new SubstitutionCracker("""
                Hsyzz sgi gcdn eabojk, bs xftczsm. Sg T juhnwbpb fd Lszaf Mqyjblrtn ufr sge tfgefczi ufr rcztlgid gzilgrfafxif oyb
                fwyf hsmgvbl ommgi gqgpjr, X qgbocdtx ovz fq luk hljwxhy ommgi. Cl'g ljipsk uzmp ii zogc kdoj qwmetml tcgqcx sbo
                yehiuwlrq ii koj qabylvtls vigr lzajn qcf. Yzs Lszaf Mqyjblrtn ck hsc ntml tcgqcx lvlr U wuns tl fwy occjp. X'g
                vswgswnwr em ety wonf au sgi scdt ngbteti cf gagft ix o dragg oocluca. Qcf pqkysz efmi sgi lpq sylsckucyv hz ea dh
                sbjfal.
                Mgaprtxhy wd fmejwbtls xh Esxntxm; kcxcfwcfu tq tpjhsygzv cf cfp idldr. Llp nim yymi, xz A kppq hnsbogzv ul hsc
                ntaabygzv ix htkq, lclv efq eikgtzuaclm zd fpeabr y wxhv cq eqcyjow yzs jsbzpmbcu jtci dz lvp utdfw cq fgbuf vtqfdlq ia
                ra cio, oyb fwy Szxgswnq glgp ii es, "Xydicf Zfrttl Cwye, iwcuv leq limzo waj fayp ra acns tl?" U limzo rmzy em
                xcziud twgswn tm Peken sbo G idodr hyfrb Yco'q owcdrccz xh lvpgd buybtduryfh epqz zjcx rtt xsfv bgcawcyq au Yymar
                fwlgirf, ag lshscd pwjcdq fwy Jso Qqp, nzfzssw nzs hgxsyjbpqe dh lchyds nzs apabckso jmcx. Sbo gz hjahp mr xnk
                alezxzaqplot, C ocfjpc'n khzn fwyjs.
                T uajfv aztq dh tm Rpqtww oyb fpew aj kucx lc Xmgcn Gzjkbjm. Sbo G idodr dcq Efshz, Ydxmlcejq, Hiuflrqh,
                Ymftnusyk oyb Mgckhzntphwg lqetgtzpb mgimbo rtt Jsfefqcif. Oyb U limzo umiwz hscy plgiyb fwy Hocrtthgb lq
                fwyq rtqojmkso rtt ajslr mcx whppzpf agdsqh ix fpyxxnq. Pfr U limzol'f hngd efqgy.
                A kzsxs ag cy, chth lc efq vlwoe fqnxsm zd fwy Jcxyz Tghwcc. Mcx A kzsxs mws ochtfgdxczim sfzszs nzscc, fwlgirf
                hplacfq qbjwfzpe phv zpyptlk. Pfr U limzol'f hngd efqgy.
                A kzsxs ynsy aaby md em fwy voj mr ibw Fplmxmkoyaq, phv upr m foaqv nurnmfp mr pfd hsyf ibw Fplmxmkoyaq scv tzp fwy
                uiwrggud oyb mtmlvprur fatp mr buf. Pfr U limzol'f hngd efqgy.
                A kzsxs ynsy ea qs lvp umn nzoe rtt gsb qmd lbga T yy cueso fms bag synxnsh. Llp X qgiwb ipnuv Xydicf Zfrttl sg
                sc fpwcso fuh habprk-ucns efqhyk cy rtt xgcc yf ibw qssdrb gt Hgfiyfppps. Qol W hmgaxf'h drae nzscc.
                U limzo aaby gb fn qkyf hz 1863, yzs qshnf m kuuwwjmicfu Apqhcvsyr nn nzs yyyt ix Ompmwue Ztlodff ttlmafq qzkq ii
                lvp aacwdidgac nzoe fq wuv hz quvh lvp Cyphuwayfxif Dcmoaueoegac. Vmh T uajfvb'e qfdj lvppq.
                X qgiwb qkyf qzkq jj lc efq tujzj rtxllwpq, mcx ksp y yph yflnbacfu hgfw nzs apaqfwad mr ibw pllwgohhnw au bag yyfxif.
                Oyb odgw ktrt ph wzzogthl qcw fwul kp fmky fcefuca lc qcmg vmh "qcmg clgpjr." Qol W hmgaxf'h drae nzscc.
                Eilsbrcxn yfcfet, X qgiwb fjlf hz rtt Udatetis, sbo qmn, "Cx mzs mafgk xc fd fajp hghn s tpu ktujg tl fwy ksnmzs bszq mr
                ibw 20hs aqcnmfj, G ixfd pp fmejq."
                Bzu fwul'g l qfgufup qfpnwaplf ii eovc, ntwsidc fwy occjp xm szw kqhmwr fn. Fwy foegac ck gtaw. Ilgimjq xm ab efq
                aufr; nmzuokwzl maf sfzszs. Nzoe'q m hnjoyeq hnshpkqcn. Tie G wcio, gzkqwio, hsyf dhdm hfqc cl wd bmge wbzssw wsb
                jmg hyw hsc eiujg. Llp X mws Rmp lijytls xh lvtq btlaco mr ibw hhczicwhs aqcnmfj gz p qsm efmi gwb, tl edgw gepmcaw
                klw, mgy jsdnacxabr.\s
                                
                59
                Qabylvtls xm zoanqccfu tl ajl occjp. Ibw alqetm gt acaefw occ dxmabr sb. Phv kscdtpwf efqn ujs lqetgtzpb fdxsm,
                hfqibwf efqn ujs tl Vdbsbyceqoju, Dmgib Stcgop; Hswcmnx, Ewbjy; Mrwjo, Rfmcu; Fsh Wage Uwew; Mifsbey, Stijuty;
                Vpwcgzl, Yxmkwdqueja; cc Kqbjzwd, Rqchwgdcq -- ibw qcw uh udklwe ibw glkq: "Ly ooyr fd vw tccq."
                Phv oymfwyj fpyedh lvlr U'b bsdaw fd fajp gz ibag acdxiv wd rtpn os syht vwsy dagwwr em m eiabe uttlw kp ydt agwye fd
                bsjp ra vlsdajq lclv efq elgpwcyh nzoe kqc bsjp zqth lfjgzv ng ucybefw ktrt ibjcfet wckhzpk, qol hsc ptgsboq pxxf'h
                qmdry lvpk fd xg we. Qggpajlj ptgsboq fwul kp edpjhzp uuib lvpk. Yth, xcc wqplk bzu, tppw ppcz iudytls pvgie umg
                ufr acmry. Tie lal, hg zzlstl uoy rtts bidr fpfc ommgi cl. We ge ci dcyeqg u uvzgot vwhhcqc pacwczry sbo lacpacwczry
                ab efuh qgfwb; ui'm fcytudfwbnc ag hgbpvuhnwbnc. Fwul wd uttlw kp ydt ngrlw.
                Mcx szdm uc nzs ssyph jwrffh lwjzjgicgb, td edgwhsgzv ckb'e bacy, sbo bacy ab l fgglq, hz zdxhy hsc odfgfpb btihzpq au
                nzs hmdax gie mr ibwwc jaca qslpe dz hcgcdis, lvpgd aifu jcmgm gt ssdi ufr ycsayuh, efq lbgzp uagfv wd badgwr. Ymi, X'g
                bidr tpjhm efmi Agr sye pfdchcp by lc wght cf hsge eyjwzb fd mws hfmi ck iydaaxabr. Yzs C'e vlnbn nzoe Fq'h udzzuqs
                gw hz zq xh Esxntxm.
                A qll dtgwamcd -- X wsb ccytgtsc utth Fsrpatm oscc vjml uzgzv ujcflp pm Jownt wuk glgp, hi gtecz, hwjoeatxhy
                kscdt nzsj bush'l weat, phv zlsswcfu hfqc nzsj uqgy fce ruredso. Zgi nzoe bmn ck owj akyj. Kp kqph tidgztmk bzu, mcx
                os lpq sylsckucyv hz emxh gic puvbltfj bauus tl Sdx'k kzpxs.
                Ufr efmi'm szw rtxm ovzjq ibabr ge pvgie. Uq plwb'e czvuyso gz phq bpemicns apaiykh llp xh sbj lqvulwgc mgamaplfh
                qahs yznvgrj. Uq plw glwuca lvlr it ujs ocftlewycp ii ts xcz. Ly sfp bqiyjatlqs ng pp nqdjds. Hc mgy kojgzv --
                Qw occ epsabr rtpn os lpq Viv'g nfuaxjsy. Yzs nzoe uq plw Uzb'e rbazopqc, qw rzl'f wuns em xxpw ztiq ly sfp dagwwr em
                xxpw.
                """, "");
    }
    public static void test1() {
        SubstitutionCracker sc = new SubstitutionCracker(
                """
                        Cffl zyzeoec.
                        Nflti, fpj wzhhfs donomzeq, fpj sti fw howz, fpj yzji wjzzlfa dtaz pelzj tnntdx oe t qzjozq fw\s
                        lzhokzjtnz tel lztlhi nzjjfjoqn tdnq. Nuz yodnoaq szjz oe tojghtezq fj oe nuzoj fwwodzq:\s
                        qzdjzntjozq, kpqoezqq aze tel sfaze, aohontji tel wzlzjth sfjxzjq, afaq tel ltlq, wjozelq\s
                        tel ezocukfjq. Nufpqtelq fw hoyzq szjz qpllzehi zelzl ki zyoh, lzqgodtkhz tdnq fw nzjjfj. Nuz\s
                        godnpjzq fw tojghtezq whioec oenf kpohloecq, wojzq kpjeoec, upcz ­­ upcz qnjpdnpjzq dfhhtgqoec\s
                        utyz wohhzl pq sonu loqkzhozw, nzjjokhz qtlezqq, tel t rpozn, peiozhloec teczj. Nuzqz tdnq fw\s
                        atqq apjlzj szjz oenzelzl nf wjocunze fpj etnofe oenf dutfq tel jznjztn. Kpn nuzi utyz\s
                        wtohzl. Fpj dfpenji oq qnjfec.
                        T cjztn gzfghz utq kzze afyzl nf lzwzel t cjztn etnofe. Nzjjfjoqn tnntdxq dte qutxz nuz\s
                        wfpeltnofeq fw fpj kocczqn kpohloecq, kpn nuzi dteefn nfpdu nuz wfpeltnofe fw Tazjodt. Nuzqz\s
                        tdnq qutnnzj qnzzh, kpn nuzi dteefn lzen nuz qnzzh fw Tazjodte jzqfhyz. Tazjodt stq ntjcznzl\s
                        wfj tnntdx kzdtpqz sz'jz nuz kjocunzqn kztdfe wfj wjzzlfa tel fggfjnpeoni oe nuz sfjhl. Tel\s
                        ef fez sohh xzzg nutn hocun wjfa quoeoec. Nflti, fpj etnofe qts zyoh ­­ nuz yzji sfjqn fw upate
                        etnpjz ­­ tel sz jzqgfelzl sonu nuz kzqn fw Tazjodt. Sonu nuz ltjoec fw fpj jzqdpz sfjxzjq,  sonu nuz dtjoec wfj qnjteczjq tel ezocukfjq suf dtaz nf coyz khffl tel uzhg oe tei sti nuzi\s
                        dfphl.
                        Oaazlotnzhi wfhhfsoec nuz wojqn tnntdx, O oaghzazenzl fpj cfyzjeazen'q zazjczedi jzqgfeqz\s
                        ghteq. Fpj aohontji oq gfszjwph, tel on'q gjzgtjzl. Fpj zazjczedi nztaq tjz sfjxoec oe Ezs
                        Ifjx Doni tel Stquoecnfe L.D. nf uzhg sonu hfdth jzqdpz zwwfjnq. Fpj wojqn gjofjoni oq nf czn uzhg\s
                        nf nufqz suf utyz kzze oebpjzl, tel nf ntxz zyzji gjzdtpnofe nf gjfnzdn fpj donomzeq tn ufaz\s
                        tel tjfpel nuz sfjhl wjfa wpjnuzj tnntdxq. Nuz wpednofeq fw fpj cfyzjeazen dfenoepz sonufpn
                        oenzjjpgnofe. Wzlzjth tczedozq oe Stquoecnfe suodu utl nf kz zytdptnzl nflti tjz jzfgzeoec\s
                        wfj zqqzenoth gzjqfeezh nfeocun tel sohh kz fgze wfj kpqoezqq nfafjjfs. Fpj woetedoth
                        oeqnonpnofeq jzatoe qnjfec, tel nuz Tazjodte zdfefai sohh kz fgze wfj kpqoezqq tq szhh.
                        Nuz qztjdu oq pelzjsti wfj nufqz suf szjz kzuoel nuzqz zyoh tdnq. O utyz lojzdnzl nuz wphh
                        jzqfpjdzq fw fpj oenzhhoczedz tel hts zewfjdzazen dfaapeonozq nf woel nufqz jzqgfeqokhz tel\s
                        nf kjoec nuza nf bpqnodz. Sz sohh atxz ef loqnoednofe kznszze nuz nzjjfjoqnq suf dfaaonnzl\s
                        nuzqz tdnq tel nufqz suf utjkfj nuza.\s
                        O tggjzdotnz qf yzji apdu nuz azakzjq fw Dfecjzqq suf utyz bfoezl az oe qnjfechi\s
                        dfelzaeoec nuzqz tnntdxq. Tel fe kzuthw fw nuz Tazjodte gzfghz, O nutex nuz atei sfjhl\s
                        hztlzjq suf utyz dthhzl nf fwwzj nuzoj dfelfhzedzq tel tqqoqntedz. Tazjodt tel fpj wjozelq\s
                        tel thhozq bfoe sonu thh nufqz suf sten gztdz tel qzdpjoni oe nuz sfjhl, tel sz qntel nfcznuzj\s
                        nf soe nuz stj tctoeqn nzjjfjoqa.\s
                        Nfeocun, O tqx wfj ifpj gjtizjq wfj thh nufqz suf cjozyz, wfj nuz duohljze sufqz sfjhlq utyz\s
                        kzze qutnnzjzl, wfj thh sufqz qzeqz fw qtwzni tel qzdpjoni utq kzze nujztnzezl. Tel O gjti\s
                        nuzi sohh kz dfawfjnzl ki t Gfszj cjztnzj nute tei fw pq, qgfxze nujfpcu nuz tczq oe Gqtha\s
                        23:
                        Zyze nufpcu O sthx nujfpcu nuz ythhzi fw nuz qutlfs fw lztnu, O wztj ef zyoh wfj ifp tjz sonu
                        az.
                        Nuoq oq t lti suze thh Tazjodteq wjfa zyzji sthx fw howz peonz oe fpj jzqfhyz wfj bpqnodz tel\s
                        gztdz. Tazjodt utq qnffl lfse zezaozq kzwfjz, tel sz sohh lf qf nuoq noaz. Efez fw pq sohh
                        zyzj wfjczn nuoq lti, izn sz cf wfjstjl nf lzwzel wjzzlfa tel thh nutn oq cffl tel bpqn oe fpj\s
                        sfjhl.
                        Nutex ifp. Cffl eocun. Tel Cfl khzqq Tazjodt.
                        """,
                "tkdlzwcuobxhaefgrjqnpysvim");
    }

    public static void test0() {
        // exkfyvbromspzdcqaihlugwjtn
        SubstitutionCracker sc = new SubstitutionCracker(
                """
                        Qicpcbuy
                                                     \s
                                       OL’H XYYD EPZCHL lyd tyeih hodky O voihl ied vci qcpolokep cvvoky. O weh lroilt-vogy el lry lozy, vcui tyeih cul cv pew hkrccp, iykydlpt zeiioyf, edf bydyieppt ozqeloydl wolr povy. E hyel od lry Oppodcoh pybohpeluiy ref cqydyf uq, edf hygyiep vioydfh hubbyhlyf lrel O iud, lrodsodb lrel zt wcis eh e kogop iobrlh pewtyi, edf kcdleklh vicz zt feth eh e kczzudolt cibedonyi, wcupf zesy zy e goexpy kedfofely. Evlyi fohkuhhodb ol wolr zt wovy, O ydlyiyf lry ieky edf qickyyfyf lc fc wrel ygyit voihl-lozy kedfofely fcyh: O lepsyf lc edtcdy wrc wcupf pohlyd. O wydl lc xpcks kpux zyylodbh edf kruikr hckoeph, xyeult hrcqh edf xeixyihrcqh. Ov lwc buth wyiy hledfodb cd e kcidyi, O wcupf kichh lry hliyyl lc redf lryz kezqeobd polyieluiy. Edf ygyitwryiy O wydl, O’f byl hczy gyihocd cv lry hezy lwc auyhlocdh.
                                                     \s
                                       “Wryiy’f tcu byl lrel vuddt dezy?”
                                                     \s
                                       Edf lryd: “Tcu hyyz posy e doky ydcubr but. Wrt fc tcu wedl lc bc odlc hczylrodb foilt edf dehlt posy qcpolokh?”
                                                     \s
                                       O weh vezopoei wolr lry auyhlocd, e geioedl cd lry auyhlocdh ehsyf cv zy tyeih yeipoyi, wryd O’f voihl eiiogyf od Krokebc lc wcis od pcw-odkczy dyobrxcirccfh. Ol hobdepyf e ktdokohz dcl hozqpt wolr qcpolokh xul wolr lry gyit dclocd cv e quxpok povy, e ktdokohz lrel—el pyehl od lry Hculr Hofy dyobrxcirccfh O hcubrl lc iyqiyhydl—ref xyyd dcuiohryf xt e bydyielocd cv xicsyd qiczohyh. Od iyhqcdhy, O wcupf uhueppt hzopy edf dcf edf het lrel O udfyihlccf lry hsyqlokohz, xul lrel lryiy weh—edf epweth ref xyyd—edclryi liefolocd lc qcpolokh, e liefolocd lrel hliylkryf vicz lry feth cv lry kcudlit’h vcudfodb lc lry bpcit cv lry kogop iobrlh zcgyzydl, e liefolocd xehyf cd lry hozqpy ofye lrel wy regy e hlesy od cdy edclryi, edf lrel wrel xodfh uh lcbylryi oh biyelyi lred wrel fiogyh uh eqeil, edf lrel ov ydcubr qycqpy xypoygy od lry liulr cv lrel qicqcholocd edf ekl cd ol, lryd wy zobrl dcl hcpgy ygyit qicxpyz, xul wy ked byl hczylrodb zyedodbvup fcdy.
                                                     \s
                                       Ol weh e qiyllt kcdgodkodb hqyykr, O lrcubrl. Edf eplrcubr O’z dcl huiy lrel lry qycqpy wrc ryeif zy fypogyi ol wyiy hozopeipt ozqiyhhyf, ydcubr cv lryz eqqiykoelyf zt yeidyhldyhh edf tculrvup hwebbyi lrel O zefy ol lc lry Oppodcoh pybohpeluiy.
                                                     \s
                                               h
                                                     \s
                                       HOJ TYEIH PELYI, wryd O fykofyf lc iud vci lry Udolyf Hlelyh Hydely, O wehd’l hc huiy cv zthypv.
                                                     \s
                                       Xt epp eqqyeiedkyh, zt krcoky cv keiyyih hyyzyf lc regy wcisyf cul. Evlyi lwc lyizh fuiodb wrokr O pexciyf od lry zodciolt, Fyzckielh ref beodyf kcdlicp cv lry hlely hydely, edf O ref huxhyauydlpt qehhyf e hpyw cv xopph, vicz iyvcizh cv lry Oppodcoh fyelr qydeplt hthlyz lc ed yjqedhocd cv lry hlely’h ryeplr qicbiez vci sofh. O ref kcdloduyf lc lyekr el lry Udogyiholt cv Krokebc Pew Hkrccp, e mcx O ydmctyf, edf weh viyauydlpt odgolyf lc hqyes eicudf lcwd. O ref qiyhyigyf zt odfyqydfydky, zt bccf dezy, edf zt zeiioeby, epp cv wrokr, hlelohlokeppt hqyesodb, ref xyyd qpekyf el iohs lry zczydl O hyl vccl od lry hlely keqolep.
                                                     \s
                                       Xul lry tyeih ref ephc lesyd lryoi lcpp. Hczy cv ol weh muhl e vudklocd cv zt byllodb cpfyi, O huqqchy, vci ov tcu eiy qetodb ellydlocd, yekr hukkyhhogy tyei wopp zesy tcu zciy odlozelypt ekaueodlyf wolr epp cv tcui vpewh—lry xpodf hqclh, lry iykuiiodb rexolh cv lrcubrl lrel zet xy bydylok ci zet xy ydgoicdzydlep, xul lrel wopp epzchl kyileodpt wcihyd wolr lozy, eh huiypt eh lry rolkr od tcui weps luidh lc qeod od tcui roq. Od zy, cdy cv lrchy vpewh ref qicgyd lc xy e kricdok iyhlpyhhdyhh; ed odexopolt lc eqqiykoely, dc zellyi rcw wypp lrodbh wyiy bcodb, lrchy xpyhhodbh lrel wyiy iobrl lryiy od vicdl cv zy. Ol’h e vpew lrel oh ydfyzok lc zcfyid povy, O lrods—ydfyzok, lcc, od lry Ezyioked kreieklyi—edf cdy lrel oh dcwryiy zciy ygofydl lred od lry voypf cv qcpolokh. Wrylryi qcpolokh eklueppt ydkcuiebyh lry lieol ci hozqpt ellieklh lrchy wrc qchhyhh ol oh udkpyei. Hczycdy cdky heof lrel ygyit zed oh litodb lc yolryi pogy uq lc roh velryi’h yjqyklelocdh ci zesy uq vci roh velryi’h zohlesyh, edf O huqqchy lrel zet yjqpeod zt qeilokupei zepeft eh wypp eh edtlrodb yphy.
                                                     \s
                                       Od edt ygydl, ol weh eh e kcdhyauydky cv lrel iyhlpyhhdyhh lrel O fykofyf lc kreppydby e hollodb Fyzckielok odkuzxydl vci roh kcdbiyhhocdep hyel od lry 2000 ypyklocd ktkpy. Ol weh ed opp-kcdhofyiyf ieky, edf O pchl xefpt—lry hcil cv fiuxxodb lrel ewesydh tcu lc lry vekl lrel povy oh dcl cxpobyf lc wcis cul eh tcu’f qpeddyf. E tyei edf e repv pelyi, lry hkeih cv lrel pchh huvvokoydlpt ryepyf, O ref pudkr wolr e zyfoe kcdhupledl wrc ref xyyd ydkcuiebodb zy vci hczy lozy lc iud vci hlelywofy cvvoky. Eh ol reqqydyf, lry pudkr weh hkryfupyf vci pely Hyqlyzxyi 2001.
                                                     \s
                                       “Tcu iyepony, fcd’l tcu, lrel lry qcpolokep ftdezokh regy kredbyf,” ry heof eh ry qoksyf el roh hepef.
                                                     \s
                                       “Wrel fc tcu zyed?” O ehsyf, sdcwodb vupp wypp wrel ry zyedl. Wy xclr pccsyf fcwd el lry dywhqeqyi xyhofy roz. Lryiy, cd lry vicdl qeby, weh Cheze xod Pefyd.
                                                     \s
                                       “Rypp cv e lrodb, ohd’l ol?” ry heof, hresodb roh ryef. “Iyeppt xef puks. Tcu ked’l kredby tcui dezy, cv kcuihy. Gclyih eiy huhqokocuh cv lrel sodf cv lrodb. Zetxy ov tcu wyiy el lry hleil cv tcui keiyyi, tcu sdcw, tcu kcupf uhy e doksdezy ci hczylrodb. Xul dcw…” Roh gcoky lieopyf cvv edf ry hriubbyf eqcpcbylokeppt xyvciy hobdepodb lry weolyi lc xiodb uh lry kryks.
                                                     \s
                                       O huhqyklyf ry weh iobrl, edf lrel iyeponelocd ely ewet el zy. Vci lry voihl lozy od zt keiyyi, O xybed lc yjqyioydky lry ydgt cv hyyodb tcudbyi qcpolokoedh hukkyyf wryiy O ref veopyf, zcgodb odlc robryi cvvokyh, byllodb zciy lrodbh fcdy. Lry qpyehuiyh cv qcpolokh—lry efiydepody cv fyxely, lry edozep weizlr cv hresodb redfh edf qpudbodb odlc e kicwf—xybed lc qepy ebeodhl lry zyedyi lehsh cv lry mcx: lry xybbodb vci zcdyt, lry pcdb fiogyh rczy evlyi lry xedauyl ref iud lwc rcuih pcdbyi lred hkryfupyf, lry xef vccf edf hlepy eoi edf kpoqqyf qrcdy kcdgyihelocdh wolr e wovy wrc ref hluks xt zy hc vei xul weh qiyllt vyf uq wolr ieohodb cui kropfiyd epcdy edf weh xyboddodb lc auyhlocd zt qiocioloyh. Ygyd lry pybohpelogy wcis, lry qcpokt zesodb lrel ref bcllyd zy lc iud od lry voihl qpeky, xybed lc vyyp lcc odkiyzydlep, lcc iyzcgyf vicz lry peibyi xellpyh—cgyi lejyh, hykuiolt, ryeplr keiy, edf mcxh—lrel wyiy xyodb webyf cd e delocdep hleby. O xybed lc reixci fcuxlh excul lry qelr O ref krchyd; O xybed vyypodb lry wet O ozebody ed eklci ci elrpyly zuhl vyyp wryd, evlyi tyeih cv kczzolzydl lc e qeilokupei fiyez, evlyi tyeih cv weolodb lexpyh xylwyyd eufolocdh ci hkielkrodb cul rolh od lry zodci pyebuyh, ry iyeponyh lrel ry’h bcdy muhl excul eh vei eh lepydl ci vciludy wopp lesy roz. Lry fiyez wopp dcl reqqyd, edf ry dcw vekyh lry krcoky cv ekkyqlodb lroh vekl posy e bicwduq edf zcgodb cd lc zciy hydhoxpy quihuolh, ci iyvuhodb lry liulr edf ydfodb uq xollyi, aueiiyphczy, edf hpobrlpt qelrylok.
                                                     \s
                                               h
                                                     \s
                                       FYDOEP, EDBYI, xeibeododb, fyhqeoi—O’z dcl huiy O wydl lricubr epp lry hlebyh qiyhkioxyf xt lry yjqyilh. El hczy qcodl, lrcubr, O eiiogyf el ekkyqledky—cv zt pozolh, edf, od e wet, zt zcilepolt. O iyvckuhyf cd zt wcis od lry hlely hydely edf lccs helohveklocd vicz lry iyvcizh edf odoloelogyh lrel zt qcholocd evvcifyf. O hqydl zciy lozy el rczy, edf welkryf zt feubrlyih bicw, edf qicqyipt kryiohryf zt wovy, edf lrcubrl excul zt pcdb-lyiz vodedkoep cxpobelocdh. O yjyikohyf, edf iyef dcgyph, edf kezy lc eqqiykoely rcw lry yeilr iclelyf eicudf lry hud edf lry hyehcdh kezy edf wydl wolrcul edt qeilokupei yjyilocdh cd zt qeil.
                                                     \s
                                       Edf ol weh lroh ekkyqledky, O lrods, lrel eppcwyf zy lc kczy uq wolr lry lrcicubrpt kcksytyf ofye cv iuddodb vci lry Udolyf Hlelyh Hydely. Ed uq-ci-cul hlielybt weh rcw O fyhkioxyf ol lc zt wovy, cdy pehl hrcl lc lyhl cul zt ofyeh xyvciy O hyllpyf odlc e kepzyi, zciy hlexpy, edf xyllyi-qetodb yjohlydky. Edf hry—qyireqh zciy cul cv qolt lred kcdgoklocd—ebiyyf lc lroh cdy pehl ieky, lrcubr hry ephc hubbyhlyf lrel bogyd lry cifyipt povy hry qiyvyiiyf vci cui vezopt, O hrcupfd’l dykyhheiopt kcudl cd ryi gcly.
                                                     \s
                                       O pyl ryi lesy kczvcil od lry pcdb cffh ebeodhl zy. Lry Iyquxpoked odkuzxydl, Qylyi Volnbyiepf, ref hqydl $19 zoppocd cv roh qyihcdep wyeplr lc udhyel lry qiygocuh hydelci, Keicp Zchypyt Xieud. Ry wehd’l wofypt qcqupei; od vekl ry fofd’l iyeppt hyyz lc ydmct qcpolokh epp lrel zukr. Xul ry hlopp ref udpozolyf zcdyt od roh vezopt, eh wypp eh e byduody odlybiolt lrel ref yeidyf roz biufbodb iyhqykl vicz lry gclyih.
                                                     \s
                                       Vci e lozy Keicp Zchypyt Xieud iyeqqyeiyf, xeks vicz ed ezxehhefcihroq od Dyw Nyepedf edf wolr lrcubrlh cv litodb lc iykpeoz ryi cpf hyel; ryi qchhoxpy kedfofekt qul zt cwd qpedh cd rcpf. Wryd hry fykofyf lc iud vci lry qiyhofydkt odhlyef, ygyitcdy yphy hleilyf pccsodb el lry Hydely ieky. Xt lry lozy Volnbyiepf eddcudkyf ry wcupf dcl hyys iyypyklocd, O weh hleiodb el hoj qiozeit cqqcdydlh, odkpufodb lry hollodb hlely kczqlicppyi; e xuhodyhhzed wcilr rudfiyfh cv zoppocdh cv fcppeih; Krokebc Zetci Iokreif Fepyt’h vcizyi kroyv cv hlevv; edf e xpeks, vyzepy ryeplr-keiy qicvyhhocdep wrc lry hzeil zcdyt ehhuzyf wcupf hqpol lry xpeks gcly edf fccz wrelygyi hpoz kredkyh O’f ref od lry voihl qpeky.
                                                     \s
                                       O fofd’l keiy. Viyyf vicz wciit xt pcw yjqyklelocdh, zt kiyfoxopolt xcphlyiyf xt hygyiep rypqvup ydfcihyzydlh, O lriyw zthypv odlc lry ieky wolr ed ydyibt edf mct lrel O’f lrcubrl O ref pchl. O roiyf vcui hlevvyih, epp cv lryz hzeil, od lryoi lwydloyh ci yeipt lroiloyh, edf huolexpt kryeq. Wy vcudf e hzepp cvvoky, qiodlyf pyllyiryef, odhleppyf qrcdy podyh edf hygyiep kczqulyih. Vcui ci vogy rcuih e fet, O keppyf zemci Fyzckielok fcdcih edf lioyf lc byl zt kepph iyluidyf. O rypf qiyhh kcdvyiydkyh lc wrokr dcxcft kezy. Wy hobdyf uq vci lry edduep Hl. Qelioks’h Fet Qeiefy edf wyiy ehhobdyf lry qeiefy’h gyit pehl hpcl, hc zt lyd gcpudlyyih edf O vcudf cuihypgyh zeikrodb muhl e vyw qekyh eryef cv lry kolt’h hedolelocd liuksh, wegodb lc lry vyw hliebbpyih wrc iyzeodyf cd lry iculy wropy wcisyih hwyql uq beixeby edf qyypyf biyyd hrezicks hloksyih cvv lry pezqqchlh.
                                                     \s
                                       Zchlpt, lrcubr, O muhl liegypyf, cvlyd fiogodb epcdy, voihl vicz weif lc weif od Krokebc, lryd vicz kcudlt lc kcudlt edf lcwd lc lcwd, ygydlueppt uq edf fcwd lry hlely, qehl zopyh edf zopyh cv kcidvoypfh edf xyedvoypfh edf lieod lieksh edf hopch. Ol wehd’l ed yvvokoydl qickyhh. Wolrcul lry zekrodyit cv lry hlely’h Fyzckielok Qeilt cibedonelocd, wolrcul edt iyep zeopodb pohl ci Odlyidyl cqyielocd, O ref lc iypt cd vioydfh ci ekaueodledkyh lc cqyd lryoi rcuhyh lc wrcygyi zobrl kczy, ci lc eiiedby vci zt gohol lc lryoi kruikr, udocd repp, xiofby bicuq, ci Icleit Kpux. Hczylozyh, evlyi hygyiep rcuih cv fiogodb, O wcupf vodf muhl lwc ci lriyy qycqpy weolodb vci zy eicudf e solkryd lexpy. O wcupf regy lc ehhuiy lry rchlh lrel lry luidcul weh vody edf kczqpozydl lryz cd lry iyviyhrzydlh lryt’f qiyqeiyf. Hczylozyh O wcupf hol lricubr e kruikr hyigoky edf lry qehlci wcupf vcibyl lc iykcbdony zy, ci lry ryef cv lry udocd pckep wcupf pyl zy hqyes lc roh zyzxyih muhl xyvciy eddcudkodb lrel lry udocd ref fykofyf lc ydfcihy hczycdy yphy.
                                                     \s
                                       Xul wrylryi O weh zyylodb wolr lwc qycqpy ci vovlt, wrylryi O weh od cdy cv lry wypp-hrefyf, hlelypt rczyh cv lry Dcilr Hrciy, e weps-uq eqeilzydl cd lry Wyhl Hofy, ci e veizrcuhy culhofy Xpcczodblcd, wrylryi qycqpy wyiy vioydfpt, odfovvyiydl, ci ckkehocdeppt rchlopy, O lioyf zt xyhl lc syyq zt zculr hrul edf ryei wrel lryt ref lc het. O pohlydyf lc qycqpy leps excul lryoi mcxh, lryoi xuhodyhhyh, lry pckep hkrccp; lryoi edbyi el Xuhr edf lryoi edbyi el Fyzckielh; lryoi fcbh, lryoi xeks qeod, lryoi wei hyigoky, edf lry lrodbh lryt iyzyzxyiyf vicz kropfrccf. Hczy ref wypp-fygypcqyf lrycioyh lc yjqpeod lry pchh cv zeduvekluiodb mcxh ci lry robr kchl cv ryeplr keiy. Hczy iykolyf wrel lryt ref ryeif cd Iuhr Pozxeubr ci DQI. Xul zchl cv lryz wyiy lcc xuht wolr wcis ci lryoi sofh lc qet zukr ellydlocd lc qcpolokh, edf lryt hqcsy odhlyef cv wrel lryt hew xyvciy lryz: e qpedl kpchyf, e qiczclocd, e robr ryelodb xopp, e qeiydl od e duihodb rczy, e kropf’h voihl hlyq.
                                                     \s
                                       Dc xpodfodb odhobrlh yzyibyf vicz lryhy zcdlrh cv kcdgyihelocd. Ov edtlrodb, wrel hliuks zy weh muhl rcw zcfyhl qycqpy’h rcqyh wyiy, edf rcw zukr cv wrel lryt xypoygyf hyyzyf lc rcpf kcdhledl ekichh ieky, iybocd, iypobocd, edf kpehh. Zchl cv lryz lrcubrl lrel edtxcft woppodb lc wcis hrcupf xy expy lc vodf e mcx lrel qeof e pogodb weby. Lryt vobuiyf lrel qycqpy hrcupfd’l regy lc vopy vci xedsiuqlkt xykeuhy lryt bcl hoks. Lryt xypoygyf lrel ygyit kropf hrcupf regy e byduodypt bccf yfukelocd—lrel ol hrcupfd’l muhl xy e xudkr cv leps—edf lrel lrchy hezy kropfiyd hrcupf xy expy lc bc lc kcppyby ygyd ov lryoi qeiydlh wyiyd’l iokr. Lryt wedlyf lc xy hevy, vicz kiozodeph edf vicz lyiiciohlh; lryt wedlyf kpyed eoi, kpyed welyi, edf lozy wolr lryoi sofh. Edf wryd lryt bcl cpf, lryt wedlyf lc xy expy lc iyloiy wolr hczy fobdolt edf iyhqykl.
                                                     \s
                                       Lrel weh excul ol. Ol wehd’l zukr. Edf eplrcubr lryt udfyihlccf lrel rcw lryt fof od povy fyqydfyf zchlpt cd lryoi cwd yvvcilh—eplrcubr lryt fofd’l yjqykl bcgyidzydl lc hcpgy epp lryoi qicxpyzh, edf kyileodpt fofd’l posy hyyodb lryoi lej fcppeih wehlyf—lryt vobuiyf lrel bcgyidzydl hrcupf rypq.
                                                     \s
                                       O lcpf lryz lrel lryt wyiy iobrl: bcgyidzydl kcupfd’l hcpgy epp lryoi qicxpyzh. Xul wolr e hpobrl kredby od qiocioloyh wy kcupf zesy huiy ygyit kropf ref e fykydl hrcl el povy edf zyyl lry kreppydbyh wy vekyf eh e delocd. Zciy cvlyd lred dcl, vcpsh wcupf dcf od ebiyyzydl edf ehs rcw lryt kcupf byl odgcpgyf. Edf xt lry lozy O weh xeks cd lry icef, wolr e zeq cd lry qehhydbyi’h hyel, cd zt wet lc zt dyjl hlcq, O sdyw cdky ebeod muhl wrt O’f bcdy odlc qcpolokh.
                                                     \s
                                       O vypl posy wcisodb reifyi lred O’f ygyi wcisyf od zt povy.
                                                     \s
                                                     \s
                                       ozeby
                                                     \s
                                                     \s
                                       LROH XCCS BICWH foiyklpt cul cv lrchy kcdgyihelocdh cd lry kezqeobd lieop. Dcl cdpt fof zt ydkcudlyih wolr gclyih kcdvoiz lry vudfezydlep fykydkt cv lry Ezyioked qycqpy, lryt ephc iyzodfyf zy lrel el lry kciy cv lry Ezyioked yjqyioydky eiy e hyl cv ofyeph lrel kcdloduy lc hloi cui kcppyklogy kcdhkoydky; e kczzcd hyl cv gepuyh lrel xodf uh lcbylryi fyhqoly cui fovvyiydkyh; e iuddodb lriyef cv rcqy lrel zesyh cui ozqicxexpy yjqyiozydl od fyzckiekt wcis. Lryhy gepuyh edf ofyeph vodf yjqiyhhocd dcl muhl od lry zeixpy hpexh cv zcduzydlh ci od lry iykolelocd cv rohlcit xccsh. Lryt iyzeod epogy od lry ryeilh edf zodfh cv zchl Ezyiokedh—edf ked odhqoiy uh lc qiofy, fult, edf hekiovoky.
                                                     \s
                                       O iykcbdony lry iohsh cv lepsodb lroh wet. Od ed yie cv bpcxeponelocd edf fonntodb lykrdcpcbokep kredby, kullricel qcpolokh edf udiyzollodb kupluiy weih, wy fcd’l ygyd hyyz lc qchhyhh e hreiyf pedbueby wolr wrokr lc fohkuhh cui ofyeph, zukr pyhh lry lccph lc eiiogy el hczy icubr kcdhydhuh excul rcw, eh e delocd, wy zobrl wcis lcbylryi lc xiodb lrchy ofyeph excul. Zchl cv uh eiy wohy lc lry weth cv efzyd, qcpphlyih, hqyykrwiolyih, edf qudfolh. Wy sdcw rcw robr-vptodb wcifh ked xy fyqpctyf od lry hyigoky cv ktdokep eozh, edf rcw lry dcxpyhl hydlozydlh ked xy huxgyilyf od lry dezy cv qcwyi, yjqyfoydky, biyyf, ci odlcpyiedky. Ygyd lry hledfeif robr hkrccp rohlcit lyjlxccs dclyh lry fybiyy lc wrokr, vicz olh gyit odkyqlocd, lry iyepolt cv Ezyioked povy reh hlietyf vicz olh ztlrh. Od hukr e kpozely, edt ehhyilocd cv hreiyf ofyeph ci kczzcd gepuyh zobrl hyyz rcqypyhhpt deïgy, ov dcl fcwdiobrl fedbyicuh—ed ellyzql lc bpchh cgyi hyiocuh fovvyiydkyh od qcpokt edf qyivcizedky ci, wcihy, e zyedh cv zuvvpodb lry kczqpeodlh cv lrchy wrc vyyp opp hyigyf xt cui kuiiydl odhlolulocdep eiiedbyzydlh.
                                                     \s
                                       Zt eibuzydl, rcwygyi, oh lrel wy regy dc krcoky. Tcu fcd’l dyyf e qcpp lc sdcw lrel lry gehl zemciolt cv Ezyiokedh—Iyquxpoked, Fyzckiel, edf odfyqydfydl—eiy wyeit cv lry fyef ncdy lrel qcpolokh reh xykczy, od wrokr deiicw odlyiyhlh goy vci efgedleby edf ofycpcbokep zodcioloyh hyys lc ozqchy lryoi cwd gyihocdh cv exhcpuly liulr. Wrylryi wy’iy vicz iyf hlelyh ci xpuy hlelyh, wy vyyp od cui bul lry peks cv rcdyhlt, iobci, edf kczzcd hydhy od cui qcpokt fyxelyh, edf fohposy wrel eqqyeih lc xy e kcdloducuh zydu cv vephy ci kiezqyf krcokyh. Iypobocuh ci hykupei, xpeks, wroly, ci xicwd, wy hydhy—kciiyklpt—lrel lry delocd’h zchl hobdovokedl kreppydbyh eiy xyodb obdciyf, edf lrel ov wy fcd’l kredby kcuihy hccd, wy zet xy lry voihl bydyielocd od e gyit pcdb lozy lrel pyegyh xyrodf e wyesyi edf zciy viekluiyf Ezyioke lred lry cdy wy odryiolyf. Qyireqh zciy lred edt clryi lozy od cui iykydl rohlcit, wy dyyf e dyw sodf cv qcpolokh, cdy lrel ked yjkegely edf xuopf uqcd lrchy hreiyf udfyihledfodbh lrel qupp uh lcbylryi eh Ezyiokedh.
                                                     \s
                                       Lrel’h lry lcqok cv lroh xccs: rcw wy zobrl xybod lry qickyhh cv kredbodb cui qcpolokh edf cui kogok povy. Lroh ohd’l lc het lrel O sdcw yjeklpt rcw lc fc ol. O fcd’l. Eplrcubr O fohkuhh od yekr kreqlyi e duzxyi cv cui zchl qiyhhodb qcpokt kreppydbyh, edf hubbyhl od xicef hlicsyh lry qelr O xypoygy wy hrcupf vcppcw, zt liyelzydl cv lry ohhuyh oh cvlyd qeiloep edf odkczqpyly. O cvvyi dc udovtodb lrycit cv Ezyioked bcgyidzydl, dci fc lryhy qebyh qicgofy e zedovyhlc vci eklocd, kczqpyly wolr kreilh edf bieqrh, lozylexpyh edf lyd-qcodl qpedh.
                                                     \s
                                       Odhlyef wrel O cvvyi oh hczylrodb zciy zcfyhl: qyihcdep iyvpyklocdh cd lrchy gepuyh edf ofyeph lrel regy pyf zy lc quxpok povy, hczy lrcubrlh cd lry weth lrel cui kuiiydl qcpolokep fohkcuihy uddykyhheiopt fogofyh uh, edf zt cwd xyhl ehhyhhzydl—xehyf cd zt yjqyioydky eh e hydelci edf pewtyi, ruhxedf edf velryi, Kriohloed edf hsyqlok—cv lry weth wy ked bicudf cui qcpolokh od lry dclocd cv e kczzcd bccf.
                                                     \s
                                       Pyl zy xy zciy hqykovok excul rcw lry xccs oh cibedonyf. Kreqlyi Cdy lesyh hlcks cv cui iykydl qcpolokep rohlcit edf lioyh lc yjqpeod hczy cv lry hcuikyh vci lcfet’h xollyi qeilohedhroq. Od Kreqlyi Lwc, O fohkuhh lrchy kczzcd gepuyh lrel zobrl hyigy eh lry vcudfelocd vci e dyw qcpolokep kcdhydhuh. Kreqlyi Lriyy yjqpciyh lry Kcdhlolulocd dcl muhl eh e hcuiky cv odfogofuep iobrlh, xul ephc eh e zyedh cv cibedonodb e fyzckielok kcdgyihelocd eicudf cui kcppyklogy vuluiy. Od Kreqlyi Vcui, O lit lc kcdgyt hczy cv lry odhlolulocdep vcikyh—zcdyt, zyfoe, odlyiyhl bicuqh, edf lry pybohpelogy qickyhh—lrel hlovpy ygyd lry xyhl-odlydlocdyf qcpolokoed. Edf od lry iyzeododb vogy kreqlyih, O hubbyhl rcw wy zobrl zcgy xytcdf cui fogohocdh lc yvvyklogypt lekspy kcdkiyly qicxpyzh: lry bicwodb ykcdczok odhykuiolt cv zedt Ezyioked vezopoyh, lry iekoep edf iypobocuh lydhocdh wolrod lry xcft qcpolok, edf lry liedhdelocdep lriyelh—vicz lyiiciohz lc qedfyzok—lrel belryi xytcdf cui hrciyh.
                                                     \s
                                       O huhqykl lrel hczy iyefyih zet vodf zt qiyhydlelocd cv lryhy ohhuyh lc xy odhuvvokoydlpt xepedkyf. Lc lroh ekkuhelocd, O hledf buoplt eh kreibyf. O ez e Fyzckiel, evlyi epp; zt goywh cd zchl lcqokh kciiyhqcdf zciy kpchypt lc lry yfolcioep qebyh cv lry Dyw Tcis Lozyh lred lrchy cv lry Wepp Hliyyl Mcuidep. O ez edbit excul qcpokoyh lrel kcdhohlydlpt vegci lry wyeplrt edf qcwyivup cgyi egyieby Ezyiokedh, edf odhohl lrel bcgyidzydl reh ed ozqciledl icpy od cqydodb uq cqqciludolt lc epp. O xypoygy od ygcpulocd, hkoydlovok odauoit, edf bpcxep weizodb; O xypoygy od viyy hqyykr, wrylryi qcpolokeppt kciiykl ci qcpolokeppt odkciiykl, edf O ez huhqokocuh cv uhodb bcgyidzydl lc ozqchy edtxcft’h iypobocuh xypoyvh—odkpufodb zt cwd—cd dcdxypoygyih. Vuilryizciy, O ez e qiohcdyi cv zt cwd xocbieqrt: O ked’l rypq xul goyw lry Ezyioked yjqyioydky lricubr lry pydh cv e xpeks zed cv zojyf ryioleby, vciygyi zodfvup cv rcw bydyielocdh cv qycqpy wrc pccsyf posy zy wyiy huxmubelyf edf hlobzelonyf, edf lry huxlpy edf dcl hc huxlpy weth lrel ieky edf kpehh kcdloduy lc hreqy cui pogyh.
                                                     \s
                                       Xul lrel oh dcl epp lrel O ez. O ephc lrods zt qeilt ked xy hzub, fylekryf, edf fcbzelok el lozyh. O xypoygy od lry viyy zeisyl, kczqylolocd, edf ydliyqiydyuihroq, edf lrods dc hzepp duzxyi cv bcgyidzydl qicbiezh fcd’l wcis eh efgyilohyf. O wohr lry kcudlit ref vywyi pewtyih edf zciy ydbodyyih. O lrods Ezyioke reh zciy cvlyd xyyd e vciky vci bccf lred vci opp od lry wcipf; O keiit vyw oppuhocdh excul cui ydyzoyh, edf iygyiy lry kcuieby edf kczqylydky cv cui zopoleit. O iymykl e qcpolokh lrel oh xehyf hcpypt cd iekoep ofydlolt, bydfyi ofydlolt, hyjuep cioydlelocd, ci goklozrccf bydyieppt. O lrods zukr cv wrel eoph lry oddyi kolt odgcpgyh e xiyesfcwd od kupluiy lrel wopp dcl xy kuiyf xt zcdyt epcdy, edf lrel cui gepuyh edf hqoioluep povy zellyi el pyehl eh zukr eh cui BFQ.
                                                     \s
                                       Udfcuxlyfpt, hczy cv lryhy goywh wopp byl zy od licuxpy. O ez dyw ydcubr cd lry delocdep qcpolokep hkydy lrel O hyigy eh e xpeds hkiyyd cd wrokr qycqpy cv gehlpt fovvyiydl qcpolokep hlioqyh qicmykl lryoi cwd goywh. Eh hukr, O ez xcudf lc foheqqcodl hczy, ov dcl epp, cv lryz. Wrokr qyireqh odfokelyh e hykcdf, zciy odlozely lryzy lc lroh xccs—dezypt, rcw O, ci edtxcft od quxpok cvvoky, ked egcof lry qolvepph cv vezy, lry rudbyi lc qpyehy, lry vyei cv pchh, edf lryiyxt iyleod lrel syidyp cv liulr, lrel hodbupei gcoky wolrod yekr cv uh lrel iyzodfh uh cv cui fyyqyhl kczzolzydlh.
                                                     \s
                                       Iykydlpt, cdy cv lry iyqcilyih kcgyiodb Keqolcp Ropp hlcqqyf zy cd lry wet lc zt cvvoky edf zydlocdyf lrel hry ref ydmctyf iyefodb zt voihl xccs. “O wcdfyi,” hry heof, “ov tcu ked xy lrel odlyiyhlodb od lry dyjl cdy tcu wioly.” Xt wrokr hry zyedl, O wcdfyi ov tcu ked xy rcdyhl dcw lrel tcu eiy e U.H. hydelci.
                                                     \s
                                       O wcdfyi, lcc, hczylozyh. O rcqy wiolodb lroh xccs rypqh zy edhwyi lry auyhlocd.
                                                     \s
                                       Kreqlyi Cdy
                                                     \s
                                       Iyquxpokedh edf Fyzckielh
                                                     \s
                                       CD ZCHL FETH, O ydlyi lry Keqolcp lricubr lry xehyzydl. E hzepp huxwet lieod keiioyh zy vicz lry Reil Xuopfodb, wryiy zt cvvoky oh pckelyf, lricubr ed udfyibicudf luddyp podyf wolr lry vpebh edf hyeph cv lry vovlt hlelyh. Lry lieod kiyesh lc e repl edf O zesy zt wet, qehl xuhlpodb hlevvyih, zeodlydedky kiywh, edf lry ckkehocdep lcui bicuq, lc lry xeds cv cpf ypygelcih lrel lesyh zy lc lry hykcdf vpcci. Hlyqqodb cvv, O wyegy eicudf lry hweiz cv qiyhh lrel dcizeppt belryih lryiy, het ryppc lc lry Keqolcp Qcpoky, edf ydlyi, lricubr e hlelypt hyl cv fcuxpy fccih, cdlc lry vpcci cv lry U.H. Hydely.
                                                     \s
                                       Lry Hydely krezxyi oh dcl lry zchl xyeulovup hqeky od lry Keqolcp, xul ol oh ozqchodb dcdylrypyhh. Lry fud-kcpciyf wepph eiy hyl cvv xt qedyph cv xpuy fezehs edf kcpuzdh cv vodypt gyodyf zeixpy. Cgyiryef, lry kyopodb vcizh e kiyezt wroly cgep, wolr ed Ezyioked yebpy ylkryf od olh kydlyi. Excgy lry goholcih’ beppyit, lry xuhlh cv lry delocd’h voihl lwydlt goky qiyhofydlh hol od hcpyzd iyqchy.
                                                     \s
                        """,
                "exkfyvbromspzdcqaihlugwjtn");

    }
}
