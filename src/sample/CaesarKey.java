package sample;

import java.util.Arrays;
import java.util.Random;

public class CaesarKey {
    private final CharSet charSet = new CharSet();
    private final char[] alphabet = charSet.getAlphabet();
    private char[] key;
    public CaesarKey(int shift){
        shift = shift%26;
        key = new char[alphabet.length];
        for (int c = 0; c < alphabet.length; c++) {
            key[c] = alphabet[(c+shift)%26];
        }
    }
    public CaesarKey(){
        this(new Random().nextInt(25)+1);
    }
    private int wrapAround(int v){
        if (v >= alphabet.length){
            v -= alphabet.length;
        }
        if (v < 0){
            v += alphabet.length;
        }
        return v;
    }
    public char[] get(){
        return key;
    }
    public static void main(String[] args) {
        CaesarKey eight = new CaesarKey(8);
        System.out.println(Arrays.toString(eight.get()) +"\n\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(new CaesarKey().get()) +"\n");
        }
    }
}
