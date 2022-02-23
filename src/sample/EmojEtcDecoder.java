package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class EmojEtcDecoder {
    private String input;
    private String output;
    private String[] key;
    private String[] alphabet;
    private final CharSet charSet = new CharSet();
    public EmojEtcDecoder(String in, String[] k, String[] ab) {
        System.out.println("new EmojEtcDecoder");
//        String[] emojis = charSet.getEmojis();
//        String[] handEmojis = charSet.getHandEmojis();
//        String[] foodEmojis = charSet.getFoodEmojis();
//        String[] animalEmojis = charSet.getAnimalEmojis();
//        String[] Polysymbolic = charSet.getPolysymbolic();
//        String[] Greek = charSet.getGreek();
        String spaceChar = k[10];
        String[] split = in.split(spaceChar);
        StringBuilder sb = new StringBuilder();
        System.out.println("check");
        for (String s : split) {
            System.out.println(s);
            for (int j = 0; j < k.length; j++) {
                String ks = k[j];
                if (s.equalsIgnoreCase(ks)) {
                    System.out.println(s);
                    sb.append(ab[j]).append("\s");
                }
            }
        }
        output = sb.toString();
    }

    public static void main(String[] args) {
        CharSet charSet = new CharSet();
       EmojEtcDecoder decoder = new EmojEtcDecoder( "😭 😗 🤪 🤪 🤓 😊 🤔 🤓 🤩 🤪 😘 😶", charSet.getEmojis(), charSet.charToStringArray(charSet.getLongAlphabet()));
        System.out.println(decoder.getOutput());
    }

    public void setInput(String in){
        input = in;
    }
    public void setKey(String[] k){
//        if (k.length == alphabet.length) {
        key = k;
        // }
    }
    public void setAlphabet(String[] a){
        alphabet = a;
    }
    public String getOutput(){return output;}
}
