package sample;

import java.util.Arrays;

public class SubstitutionCracker3 {
    private String[] key;
    private static final int _a = 0;
    private static final int _b = 1;
    private static final int _c = 2;
    private static final int _d = 3;
    private static final int _e = 4;
    private static final int _f = 5;
    private static final int _g = 6;
    private static final int _h = 7;
    private static final int _i = 8;
    private static final int _j = 9;
    private static final int _k = 10;
    private static final int _l = 11;
    private static final int _m = 12;
    private static final int _n = 13;
    private static final int _o = 14;
    private static final int _p = 15;
    private static final int _q = 16;
    private static final int _r = 17;
    private static final int _s = 18;
    private static final int _t = 19;
    private static final int _u = 20;
    private static final int _v = 21;
    private static final int _w = 22;
    private static final int _x = 23;
    private static final int _y = 24;
    private static final int _z = 25;
    private static final CharSet charSet = new CharSet();
    private String cipher;
    private static final char[] alphabet = charSet.getAlphabet();
    private String solved;
    private int numLacking(){
        int count = 0;
        for (String s : key) {
            if (s == null) {
               count++;
            }
        }
        return count;
    }
    private boolean keyIsFull(){
        boolean rtn = true;
        for (String s : key) {
            if (s == null) {
                rtn = false;
                break;
            }
        }
        return rtn;
    }
    public SubstitutionCracker3(String Cipher) {
        key = new String[26];
        cipher = Cipher;
        CipherEquivOfThat ciphEquiv = new CipherEquivOfThat(Cipher);
        String that = ciphEquiv.get();
        key[_t] = String.valueOf(that.charAt(0)).toLowerCase();
        key[_h] = String.valueOf(that.charAt(1)).toLowerCase();
        key[_a] = String.valueOf(that.charAt(2)).toLowerCase();
        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
        key[_e] = String.valueOf(new find1E(key, cipher).getChar()).toLowerCase();
        key[_o] = String.valueOf(new find2O(key, cipher).getChar()).toLowerCase();
        key[_n] = String.valueOf(new find3N(key, cipher).getChar()).toLowerCase();
        key[_i] = String.valueOf(new find4I(key, cipher).getChar()).toLowerCase();
        key[_s] = String.valueOf(new find5S(key, cipher).getChar()).toLowerCase();
        key[_r] = String.valueOf(new find6R(key, cipher).getChar()).toLowerCase();
        key[_d] = String.valueOf(new find7D(key, cipher).getChar()).toLowerCase();
        key[_l] = String.valueOf(new find8L(key, cipher).getChar()).toLowerCase();
        key[_u] = String.valueOf(new find9U(key, cipher).getChar()).toLowerCase();
        key[_m] = String.valueOf(new find10M(key, cipher).getChar()).toLowerCase();
        key[_f] = String.valueOf(new find11F(key, cipher).getChar()).toLowerCase();
        key[_c] = String.valueOf(new find12C(key, cipher).getChar()).toLowerCase();
        key[_w] = String.valueOf(new find13W(key, cipher).getChar()).toLowerCase();
        key[_g] = String.valueOf(new find14G(key, cipher).getChar()).toLowerCase();
        key[_y] = String.valueOf(new find15Y(key, cipher).getChar()).toLowerCase();
        key[_p] = String.valueOf(new find16P(key, cipher).getChar()).toLowerCase();
        key[_b] = String.valueOf(new find17B(key, cipher).getChar()).toLowerCase();
        key[_v] = String.valueOf(new find18V(key, cipher).getChar()).toLowerCase();
        key[_k] = String.valueOf(new find19K(key, cipher).getChar()).toLowerCase();
        key[_j] = String.valueOf(new find20J(key, cipher).getChar()).toLowerCase();
        key[_x] = String.valueOf(new find21X(key, cipher).getChar()).toLowerCase();
        key[_z] = String.valueOf(new find22Z(key, cipher).getChar()).toLowerCase();
        key[_q] = String.valueOf(new find23Q(key, cipher).getChar()).toLowerCase();


        boolean full = keyIsFull();
        if (!full) {
            if (numLacking() < 6) {
                SubstitutionBruteForcer bruteForcer = new SubstitutionBruteForcer(cipher, key);
                if (bruteForcer.isSolved()) {
                    key = bruteForcer.getKey();
                    if (keyIsFull()) {
                        full = true;
                    }
                }
            }
        }
        if (full) {
            SubstitutionDeciphered decipherer = new SubstitutionDeciphered(cipher, key);
            solved = decipherer.get();
        }
    }
    public static void main(String[] args) {
       
    }
    private void write1(){
        for (char c: alphabet){
            System.out.println("key[_"+c+"] = String.valueOf(new find"+String.valueOf(c).toUpperCase()+"(key, cipher).getChar()).toLowerCase();");
        }
    }
}
