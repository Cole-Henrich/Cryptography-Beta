package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan1E {
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

    public Scan1E() {
        System.err.println("new Scan1E");
        System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
        //red
        SubstitutionCracker2.key[_x]="hi";
        //red
        Scanner e_the = new Scanner(SubstitutionCracker2.cipher);
        while (e_the.hasNext()) {
            String next = e_the.next();
            if (next.length() == 3) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));

                if (massCalc_notAnyOther(new String[] { first, second },
                        new int[] { _t, _h })) {
                    if (notAnotherVowel(SubstitutionCracker2.key[_e], _e)) {
                        SubstitutionCracker2.key[_e] = third.toLowerCase();
                        SubstitutionCracker2.hasE = true;
                        System.err.println("SubstitutionCracker2.hasE=true; via Scanner e_the");
                        System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
                        System.err.println(SubstitutionCracker2.correctKey);

                        e_the.close();
                        break;
                    }
                }
            }
        }
        if (!SubstitutionCracker2.hasE) {
            e_the.close();
            Scanner e_he = new Scanner(SubstitutionCracker2.cipher);
            while (e_he.hasNext()) {
                String next = e_he.next();
                if (next.length() == 2) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));

                    if (massCalc_notAnyOther(new String[] { first },
                            new int[] { _h })) {
                        if (notAnotherVowel(SubstitutionCracker2.key[_e], _e)) {
                            SubstitutionCracker2.key[_e] = second.toLowerCase();
                            SubstitutionCracker2.hasE = true;
                            System.err.println("SubstitutionCracker2.hasE=true; via Scanner e_he");
                            System.err
                                    .println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
                            System.err.println(SubstitutionCracker2.correctKey);

                            e_he.close();
                            break;
                        }
                    }
                }
            }
            if (!SubstitutionCracker2.hasE) {
                e_he.close();
                Scanner e_thee = new Scanner(SubstitutionCracker2.cipher);
                while (e_thee.hasNext()) {
                    String next = e_thee.next();
                    if (next.length() == 4) {
                        String first = String.valueOf(next.charAt(0));
                        String second = String.valueOf(next.charAt(1));
                        String third = String.valueOf(next.charAt(2));
                        String fourth = String.valueOf(next.charAt(3));

                        if (third.equalsIgnoreCase(fourth)) {
                            if (massCalc_notAnyOther(new String[] { first, second },
                                    new int[] { _t, _h })) {
                                if (notAnotherVowel(SubstitutionCracker2.key[_e], _e)) {
                                    SubstitutionCracker2.key[_e] = third.toLowerCase();
                                    SubstitutionCracker2.hasE = true;
                                    System.err.println("SubstitutionCracker2.hasE=true; via Scanner e_thee");
                                    System.err.println(
                                            (Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
                                    System.err.println(SubstitutionCracker2.correctKey);

                                    e_thee.close();
                                    break;
                                }
                            }
                        }
                    }
                }
                if (!SubstitutionCracker2.hasE) {
                    e_thee.close();
                    Scanner e_eat = new Scanner(SubstitutionCracker2.cipher);
                    while (e_eat.hasNext()) {
                        String next = e_eat.next();
                        if (next.length() == 3) {
                            String first = String.valueOf(next.charAt(0));
                            String second = String.valueOf(next.charAt(1));
                            String third = String.valueOf(next.charAt(2));

                            if (massCalc_notAnyOther(new String[] { second, third },
                                    new int[] { _a, _t })) {
                                if (notAnotherVowel(SubstitutionCracker2.key[_e], _e)) {
                                    SubstitutionCracker2.key[_e] = first.toLowerCase();
                                    SubstitutionCracker2.hasE = true;
                                    System.err.println("SubstitutionCracker2.hasE=true; via Scanner e_eat");
                                    System.err.println(
                                            (Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
                                    System.err.println(SubstitutionCracker2.correctKey);

                                    e_eat.close();
                                    break;
                                }
                            }
                        }
                    }
                    if (!SubstitutionCracker2.hasE) {
                        e_eat.close();
                        Scanner e_tate = new Scanner(SubstitutionCracker2.cipher);
                        while (e_tate.hasNext()) {
                            String next = e_tate.next();
                            if (next.length() == 4) {
                                String first = String.valueOf(next.charAt(0));
                                String second = String.valueOf(next.charAt(1));
                                String third = String.valueOf(next.charAt(2));
                                String fourth = String.valueOf(next.charAt(3));

                                if (massCalc_notAnyOther(new String[] { first, second, third },
                                        new int[] { _t, _a, _t })) {
                                    if (notAnotherVowel(SubstitutionCracker2.key[_e], _e)) {
                                        SubstitutionCracker2.key[_e] = fourth.toLowerCase();
                                        SubstitutionCracker2.hasE = true;
                                        System.err.println("SubstitutionCracker2.hasE=true; via Scanner e_tate");
                                        System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                .replaceAll("null", "\u0000"));
                                        System.err.println(SubstitutionCracker2.correctKey);

                                        e_tate.close();
                                        break;
                                    }
                                }
                            }
                        }
                        if (!SubstitutionCracker2.hasE) {
                            e_tate.close();
                            Scanner e_hate = new Scanner(SubstitutionCracker2.cipher);
                            while (e_hate.hasNext()) {
                                String next = e_hate.next();
                                if (next.length() == 4) {
                                    String first = String.valueOf(next.charAt(0));
                                    String second = String.valueOf(next.charAt(1));
                                    String third = String.valueOf(next.charAt(2));
                                    String fourth = String.valueOf(next.charAt(3));

                                    if (massCalc_notAnyOther(new String[] { first, second, third },
                                            new int[] { _h, _a, _t })) {
                                        if (notAnotherVowel(SubstitutionCracker2.key[_e], _e)) {
                                            SubstitutionCracker2.key[_e] = fourth.toLowerCase();
                                            SubstitutionCracker2.hasE = true;
                                            System.err.println("SubstitutionCracker2.hasE=true; via Scanner e_hate");
                                            System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                    .replaceAll("null", "\u0000"));
                                            System.err.println(SubstitutionCracker2.correctKey);

                                            e_hate.close();
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!SubstitutionCracker2.hasE) {
                                e_hate.close();
                                Scanner e_ate = new Scanner(SubstitutionCracker2.cipher);
                                while (e_ate.hasNext()) {
                                    String next = e_ate.next();
                                    if (next.length() == 3) {
                                        String first = String.valueOf(next.charAt(0));
                                        String second = String.valueOf(next.charAt(1));
                                        String third = String.valueOf(next.charAt(2));

                                        if (massCalc_notAnyOther(new String[] { first, second },
                                                new int[] { _a, _t })) {
                                            if (notAnotherVowel(SubstitutionCracker2.key[_e], _e)) {
                                                SubstitutionCracker2.key[_e] = third.toLowerCase();
                                                SubstitutionCracker2.hasE = true;
                                                System.err.println("SubstitutionCracker2.hasE=true; via Scanner e_ate");
                                                System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                        .replaceAll("null", "\u0000"));
                                                System.err.println(SubstitutionCracker2.correctKey);

                                                e_ate.close();
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (!SubstitutionCracker2.hasE) {
                                    e_ate.close();
                                    Scanner e_teeth = new Scanner(SubstitutionCracker2.cipher);
                                    while (e_teeth.hasNext()) {
                                        String next = e_teeth.next();
                                        if (next.length() == 5) {
                                            String first = String.valueOf(next.charAt(0));
                                            String second = String.valueOf(next.charAt(1));
                                            String third = String.valueOf(next.charAt(2));
                                            String fourth = String.valueOf(next.charAt(3));
                                            String fifth = String.valueOf(next.charAt(4));

                                            if (second.equalsIgnoreCase(third)) {
                                                if (massCalc_notAnyOther(new String[] { first, fourth, fifth },
                                                        new int[] { _t, _t, _h })) {
                                                    if (notAnotherVowel(SubstitutionCracker2.key[_e], _e)) {
                                                        SubstitutionCracker2.key[_e] = second.toLowerCase();
                                                        SubstitutionCracker2.hasE = true;
                                                        System.err.println(
                                                                "SubstitutionCracker2.hasE=true; via Scanner e_teeth");
                                                        System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(SubstitutionCracker2.correctKey);

                                                        e_teeth.close();
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (!SubstitutionCracker2.hasE) {
                                        e_teeth.close();
                                        Scanner e_heat = new Scanner(SubstitutionCracker2.cipher);
                                        while (e_heat.hasNext()) {
                                            String next = e_heat.next();
                                            if (next.length() == 4) {
                                                String first = String.valueOf(next.charAt(0));
                                                String second = String.valueOf(next.charAt(1));
                                                String third = String.valueOf(next.charAt(2));
                                                String fourth = String.valueOf(next.charAt(3));

                                                if (massCalc_notAnyOther(new String[] { first, third, fourth },
                                                        new int[] { _h, _a, _t })) {
                                                    if (notAnotherVowel(SubstitutionCracker2.key[_e], _e)) {
                                                        SubstitutionCracker2.key[_e] = second.toLowerCase();
                                                        SubstitutionCracker2.hasE = true;
                                                        System.err.println(
                                                                "SubstitutionCracker2.hasE=true; via Scanner e_heat");
                                                        System.err.println((Arrays.toString(SubstitutionCracker2.key))
                                                                .replaceAll("null", "\u0000"));
                                                        System.err.println(SubstitutionCracker2.correctKey);

                                                        e_heat.close();
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (!SubstitutionCracker2.hasE) {
                                            e_heat.close();
                                            Scanner e_tea = new Scanner(SubstitutionCracker2.cipher);
                                            while (e_tea.hasNext()) {
                                                String next = e_tea.next();
                                                if (next.length() == 3) {
                                                    String first = String.valueOf(next.charAt(0));
                                                    String second = String.valueOf(next.charAt(1));
                                                    String third = String.valueOf(next.charAt(2));

                                                    if (massCalc_notAnyOther(new String[] { first, third },
                                                            new int[] { _t, _a })) {
                                                        if (notAnotherVowel(SubstitutionCracker2.key[_e], _e)) {
                                                            SubstitutionCracker2.key[_e] = second.toLowerCase();
                                                            SubstitutionCracker2.hasE = true;
                                                            System.err.println(
                                                                    "SubstitutionCracker2.hasE=true; via Scanner e_tea");
                                                            System.err
                                                                    .println((Arrays.toString(SubstitutionCracker2.key))
                                                                            .replaceAll("null", "\u0000"));
                                                            System.err.println(SubstitutionCracker2.correctKey);

                                                            e_tea.close();
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
