package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class EmojEtcDecoder {
    private String input;
    private String output;
    private String[] key;
    private String[] alphabet;
    public EmojEtcDecoder(String in, String[] k, String[] ab) {
        System.out.println("new EmojEtcDecoder");
        setInput(in);
        setAlphabet(ab);
        setKey(k);
        System.out.println(in);
        String[] split = in.split("");
        System.out.println(Arrays.toString(split));
        StringBuilder out = new StringBuilder();
        for (String s:split){
            for (int i = 0; i < key.length; i++) {
                if (s.equals(k[i])){
                    out.append(ab[i]);
                }
            }
        }
        output = out.toString();
        System.out.println(output);

    }

    public static void main(String[] args) {
        CharSet charSet = new CharSet();
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
