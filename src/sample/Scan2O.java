package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan2O {
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

    public Scan2O() {
        System.err.println("new Scan2O");
        System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));

        Scanner o_to = new Scanner(SubstitutionCracker2.cipher);
        while (o_to.hasNext()) {
            String next = o_to.next();
            if (next.length() == 2) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));

                if (massCalc_notAnyOther(new String[] { first },
                        new int[] { _t })) {
                    if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                        SubstitutionCracker2.key[_o] = second.toLowerCase();
                        SubstitutionCracker2.hasO = true;
                        System.err.println("SubstitutionCracker2.hasO=true; via Scanner o_to");
                        System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
                        System.err.println(SubstitutionCracker2.correctKey);

                        o_to.close();
                        break;
                    }
                }
            }
        }
        if (!SubstitutionCracker2.hasO) {
            o_to.close();
            Scanner o_too = new Scanner(SubstitutionCracker2.cipher);
            while (o_too.hasNext()) {
                String next = o_too.next();
                if (next.length() == 3) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));

                    if (second.equalsIgnoreCase(third)) {
                        if (massCalc_notAnyOther(new String[] { first },
                                new int[] { _t })) {
                            if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                SubstitutionCracker2.key[_o] = second.toLowerCase();
                                SubstitutionCracker2.hasO = true;
                                System.err.println("SubstitutionCracker2.hasO=true; via Scanner o_too");
                                System.err.println(
                                        (Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
                                System.err.println(SubstitutionCracker2.correctKey);

                                o_too.close();
                                break;
                            }
                        }
                    }
                }
            }
            if (!SubstitutionCracker2.hasO) {
                o_too.close();
                Scanner o_hot = new Scanner(SubstitutionCracker2.cipher);
                while (o_hot.hasNext()) {
                    String next = o_hot.next();
                    if (next.length() == 3) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));

                        if (massCalc_notAnyOther(new String[] { first, third },
                                new int[] { _h, _t })) {
                            if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                SubstitutionCracker2.key[_o] = second.toLowerCase();
                                SubstitutionCracker2.hasO = true;
                                System.err.println("SubstitutionCracker2.hasO=true; via Scanner o_hot");
                                System.err.println(
                                        (Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
                                System.err.println(SubstitutionCracker2.correctKey);

                                o_hot.close();
                                break;
                            }
                        }
                    }
                }
                if (!SubstitutionCracker2.hasO) {
                    o_hot.close();
                    Scanner o_toot = new Scanner(SubstitutionCracker2.cipher);
                    while (o_toot.hasNext()) {
                        String next = o_toot.next();
                        if (next.length() == 4) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));
                            String fourth = String.valueOf(next.charAt(3));

                            if (second.equalsIgnoreCase(third)) {
                                if (massCalc_notAnyOther(new String[] { first, fourth },
                                        new int[] { _t, _t })) {
                                    if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                        SubstitutionCracker2.key[_o] = second.toLowerCase();
                                        SubstitutionCracker2.hasO = true;
                                        System.err.println("SubstitutionCracker2.hasO=true; via Scanner o_toot");
                                        System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                .replaceAll("null", "\u0000"));
                                        System.err.println(SubstitutionCracker2.correctKey);

                                        o_toot.close();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (!SubstitutionCracker2.hasO) {
                        o_toot.close();
                        Scanner o_oath = new Scanner(SubstitutionCracker2.cipher);
                        while (o_oath.hasNext()) {
                            String next = o_oath.next();
                            if (next.length() == 4) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));

                                if (massCalc_notAnyOther(new String[] { second, third, fourth },
                                        new int[] { _a, _t, _h })) {
                                    if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                        SubstitutionCracker2.key[_o] = first.toLowerCase();
                                        SubstitutionCracker2.hasO = true;
                                        System.err.println("SubstitutionCracker2.hasO=true; via Scanner o_oath");
                                        System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                .replaceAll("null", "\u0000"));
                                        System.err.println(SubstitutionCracker2.correctKey);

                                        o_oath.close();
                                        break;
                                    }
                                }
                            }
                        }
                        if (!SubstitutionCracker2.hasO) {
                            o_oath.close();
                            Scanner o_oh = new Scanner(SubstitutionCracker2.cipher);
                            while (o_oh.hasNext()) {
                                String next = o_oh.next();
                                if (next.length() == 2) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));

                                    if (massCalc_notAnyOther(new String[] { second },
                                            new int[] { _h })) {
                                        if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                            SubstitutionCracker2.key[_o] = first.toLowerCase();
                                            SubstitutionCracker2.hasO = true;
                                            System.err.println("SubstitutionCracker2.hasO=true; via Scanner o_oh");
                                            System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                    .replaceAll("null", "\u0000"));
                                            System.err.println(SubstitutionCracker2.correctKey);

                                            o_oh.close();
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!SubstitutionCracker2.hasO) {
                                o_oh.close();
                                Scanner o_tooth = new Scanner(SubstitutionCracker2.cipher);
                                while (o_tooth.hasNext()) {
                                    String next = o_tooth.next();
                                    if (next.length() == 5) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));
                                        String fourth = String.valueOf(next.charAt(3));
                                        String fifth = String.valueOf(next.charAt(4));

                                        if (second.equalsIgnoreCase(third)) {
                                            if (massCalc_notAnyOther(new String[] { first, fourth, fifth },
                                                    new int[] { _t, _t, _h })) {
                                                if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                                    SubstitutionCracker2.key[_o] = second.toLowerCase();
                                                    SubstitutionCracker2.hasO = true;
                                                    System.err.println(
                                                            "SubstitutionCracker2.hasO=true; via Scanner o_tooth");
                                                    System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                            .replaceAll("null", "\u0000"));
                                                    System.err.println(SubstitutionCracker2.correctKey);

                                                    o_tooth.close();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!SubstitutionCracker2.hasO) {
                                    o_tooth.close();
                                    Scanner o_ho = new Scanner(SubstitutionCracker2.cipher);
                                    while (o_ho.hasNext()) {
                                        String next = o_ho.next();
                                        if (next.length() == 2) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));

                                            if (massCalc_notAnyOther(new String[] { first },
                                                    new int[] { _h })) {
                                                if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                                    SubstitutionCracker2.key[_o] = second.toLowerCase();
                                                    SubstitutionCracker2.hasO = true;
                                                    System.err.println(
                                                            "SubstitutionCracker2.hasO=true; via Scanner o_ho");
                                                    System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                            .replaceAll("null", "\u0000"));
                                                    System.err.println(SubstitutionCracker2.correctKey);

                                                    o_ho.close();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (!SubstitutionCracker2.hasO) {
                                        o_ho.close();
                                        Scanner o_toe = new Scanner(SubstitutionCracker2.cipher);
                                        while (o_toe.hasNext()) {
                                            String next = o_toe.next();
                                            if (next.length() == 3) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));

                                                if (massCalc_notAnyOther(new String[] { first, third },
                                                        new int[] { _t, _e })) {
                                                    if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                                        SubstitutionCracker2.key[_o] = second.toLowerCase();
                                                        SubstitutionCracker2.hasO = true;
                                                        System.err.println(
                                                                "SubstitutionCracker2.hasO=true; via Scanner o_toe");
                                                        System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(SubstitutionCracker2.correctKey);

                                                        o_toe.close();
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (!SubstitutionCracker2.hasO) {
                                            o_toe.close();
                                            Scanner o_hoot = new Scanner(SubstitutionCracker2.cipher);
                                            while (o_hoot.hasNext()) {
                                                String next = o_hoot.next();
                                                if (next.length() == 4) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));
                                                    String fourth = String.valueOf(next.charAt(3));

                                                    if (second.equalsIgnoreCase(third)) {
                                                        if (massCalc_notAnyOther(new String[] { first, fourth },
                                                                new int[] { _h, _t })) {
                                                            if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                                                SubstitutionCracker2.key[_o] = second.toLowerCase();
                                                                SubstitutionCracker2.hasO = true;
                                                                System.err.println(
                                                                        "SubstitutionCracker2.hasO=true; via Scanner o_hoot");
                                                                System.err.println(
                                                                        (Arrays.toString(SubstitutionCracker2.key))
                                                                                .replaceAll("null", "\u0000"));
                                                                System.err.println(SubstitutionCracker2.correctKey);

                                                                o_hoot.close();
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (!SubstitutionCracker2.hasO) {
                                                o_hoot.close();
                                                Scanner o_hoe = new Scanner(SubstitutionCracker2.cipher);
                                                while (o_hoe.hasNext()) {
                                                    String next = o_hoe.next();
                                                    if (next.length() == 3) {
                                                        String first = String.valueOf(next.charAt(0));
                                                        String second = String.valueOf(next.charAt(1));
                                                        String third = String.valueOf(next.charAt(2));

                                                        if (massCalc_notAnyOther(new String[] { first, third },
                                                                new int[] { _h, _e })) {
                                                            if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                                                SubstitutionCracker2.key[_o] = second.toLowerCase();
                                                                SubstitutionCracker2.hasO = true;
                                                                System.err.println(
                                                                        "SubstitutionCracker2.hasO=true; via Scanner o_hoe");
                                                                System.err.println(
                                                                        (Arrays.toString(SubstitutionCracker2.key))
                                                                                .replaceAll("null", "\u0000"));
                                                                System.err.println(SubstitutionCracker2.correctKey);

                                                                o_hoe.close();
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!SubstitutionCracker2.hasO) {
                                                    o_hoe.close();
                                                    Scanner o_tho = new Scanner(SubstitutionCracker2.cipher);
                                                    while (o_tho.hasNext()) {
                                                        String next = o_tho.next();
                                                        if (next.length() == 3) {
                                                            String first = String.valueOf(next.charAt(0));
                                                            String second = String.valueOf(next.charAt(1));
                                                            String third = String.valueOf(next.charAt(2));

                                                            if (massCalc_notAnyOther(new String[] { first, second },
                                                                    new int[] { _t, _h })) {
                                                                if (notAnotherVowel(SubstitutionCracker2.key[_o], _o)) {
                                                                    SubstitutionCracker2.key[_o] = third.toLowerCase();
                                                                    SubstitutionCracker2.hasO = true;
                                                                    System.err.println(
                                                                            "SubstitutionCracker2.hasO=true; via Scanner o_tho");
                                                                    System.err.println(
                                                                            (Arrays.toString(SubstitutionCracker2.key))
                                                                                    .replaceAll("null", "\u0000"));
                                                                    System.err.println(SubstitutionCracker2.correctKey);

                                                                    o_tho.close();
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (!SubstitutionCracker2.hasO) {
                                                        o_tho.close();
                                                        Scanner o_ot = new Scanner(SubstitutionCracker2.cipher);
                                                        while (o_ot.hasNext()) {
                                                            String next = o_ot.next();
                                                            if (next.length() == 2) {
                                                                String first = String.valueOf(next.charAt(0));
                                                                String second = String.valueOf(next.charAt(1));

                                                                if (massCalc_notAnyOther(new String[] { second },
                                                                        new int[] { _t })) {
                                                                    if (notAnotherVowel(SubstitutionCracker2.key[_o],
                                                                            _o)) {
                                                                        SubstitutionCracker2.key[_o] = first
                                                                                .toLowerCase();
                                                                        SubstitutionCracker2.hasO = true;
                                                                        System.err.println(
                                                                                "SubstitutionCracker2.hasO=true; via Scanner o_ot");
                                                                        System.err.println((Arrays
                                                                                .toString(SubstitutionCracker2.key))
                                                                                .replaceAll("null", "\u0000"));
                                                                        System.err.println(
                                                                                SubstitutionCracker2.correctKey);

                                                                        o_ot.close();
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!SubstitutionCracker2.hasO) {
                                                            o_ot.close();
                                                            Scanner o_tattoo = new Scanner(SubstitutionCracker2.cipher);
                                                            while (o_tattoo.hasNext()) {
                                                                String next = o_tattoo.next();
                                                                if (next.length() == 6) {
                                                                    String first = String.valueOf(next.charAt(0));
                                                                    String second = String.valueOf(next.charAt(1));
                                                                    String third = String.valueOf(next.charAt(2));
                                                                    String fourth = String.valueOf(next.charAt(3));
                                                                    String fifth = String.valueOf(next.charAt(4));
                                                                    String sixth = String.valueOf(next.charAt(5));

                                                                    if (fifth.equalsIgnoreCase(sixth)) {
                                                                        if (massCalc_notAnyOther(
                                                                                new String[] { first, second, third,
                                                                                        fourth },
                                                                                new int[] { _t, _a, _t, _t })) {
                                                                            if (notAnotherVowel(
                                                                                    SubstitutionCracker2.key[_o], _o)) {
                                                                                SubstitutionCracker2.key[_o] = fifth
                                                                                        .toLowerCase();
                                                                                SubstitutionCracker2.hasO = true;
                                                                                System.err.println(
                                                                                        "SubstitutionCracker2.hasO=true; via Scanner o_tattoo");
                                                                                System.err.println((Arrays.toString(
                                                                                        SubstitutionCracker2.key))
                                                                                        .replaceAll("null", "\u0000"));
                                                                                System.err.println(
                                                                                        SubstitutionCracker2.correctKey);

                                                                                o_tattoo.close();
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
