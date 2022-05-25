package sample;

import java.util.ArrayList;

public class GeneralSubstitutionEncode {
    private String input;
    private String output;
    private String[] key;
    private char[] alphabet;
    public GeneralSubstitutionEncode(String in, String[] k, char[] ab){
        this(true, in, k, ab);
    }
    public GeneralSubstitutionEncode(boolean spaces, String in, String[] k, char[] ab) {
        setInput(in);
        setAlphabet(ab);
        setKey(k);
        char[] data = input.toCharArray();
        ArrayList<String> temp = new ArrayList<>();
        for (char d:data){
            temp.add(String.valueOf(d));
        }
        StringBuilder out = new StringBuilder();
        for (String t: temp){
            for (int i = 0; i < alphabet.length; i++) {
                if (String.valueOf(alphabet[i]).equals(t) && i < key.length){
                    if (spaces){
                        out.append(" ");
                    }
                    out.append(key[i]);
                }
            }
        }
        output = out.toString();
    }
//green a version of GeneralSubstitutionEncode
//public GeneralSubstitutionEncode(String in, String[] k, char[] ab) {
//        setInput(in);
//        setAlphabet(ab);
//        setKey(k);
//        char[] data = input.toCharArray();
//
//        StringBuilder out = new StringBuilder();
//        for (char c: data){
//            for (int i = 0; i < alphabet.length; i++) {
//                char a = alphabet[i];
//                if (a==c && i < key.length){
//                    out.append(key[i]);
//                }
//            }
//        }
//        output = out.toString();
//    }

    public static void main(String[] args) {
        CharSet charSet = new CharSet();
        testFoodCode();
        testEmojEncode();
        testAnimalCode();
        testSecretSignals();
    }
    private static void testSecretSignals(){
        CharSet charSet = new CharSet();
        String[] s = new String[]{
                "👋🏻","🤚🏻","🖐🏻","✋🏻","🖖🏻","👌🏻","🤌🏻","🤏🏻","✌🏻","🤞🏻","🤟🏻","🤘🏻","🤙🏻","👈🏻","👉🏻","👆🏻","🖕🏻","👇🏻","☝🏻","👍🏻",
                "👋🏼","🤚🏼","🖐🏼","✋🏼","🖖🏼","👌🏼","🤌🏼","🤏🏼","✌🏼","🤞🏼","🤟🏼","🤘🏼","🤙🏼","👈🏼","👉🏼","👆🏼","🖕🏼","👇🏼","☝🏼","👍🏼",
                "👋🏽","🤚🏽","🖐🏽","✋🏽","🖖🏽","👌🏽","🤌🏽","🤏🏽","✌🏽","🤞🏽","🤟🏽","🤘🏽","🤙🏽","👈🏽","👉🏽","👆🏽","🖕🏽","👇🏽","☝🏽","👍🏽",
                "👋🏾","🤚🏾","🖐🏾","✋🏾","🖖🏾","👌🏾","🤌🏾","🤏🏾","✌🏾","🤞🏾","🤟🏾","🤘🏾","🤙🏾","👈🏾","👉🏾","👆🏾","🖕🏾","👇🏾","☝🏾","👍🏾","👎🏾","✊🏾","👊🏾"};
        GeneralSubstitutionEncode encoder = new GeneralSubstitutionEncode("Hello World!", s, charSet.getLongAlphabet());
        System.out.println(encoder.getOutput());
    }
    private static void testAnimalCode(){
        CharSet charSet = new CharSet();
        String[] s = new String[]{"🐶","🐱","🐭","🐹","🐰","🦊","🐻","🐼","🐻‍❄️","🐨","🐯","🦁","🐮","🐷","🐽","🐸","🐵","🙈","🙉","🙊","🐒","🐔","🐧","🐦","🐤","🐣","🐥","🦆","🦅","🦉","🦇","🐺","🐗","🐴","🦄","🐝","🪱","🐛","🦋","🐌","🐞","🐜","🪰","🪲","🪳","🦟","🦗","🕷","🕸","🦂","🐢","🐍","🦎","🦖","🦕","🐙","🦑","🦐","🦞","🦀","🐡","🐠","🐟","🐬","🐳","🐋","🦈","🐊","🐅","🐆","🦓","🦍","🦧","🦣","🐘","🦛","🦏","🐪","🐫","🦒","🦘","🦬","🐃"};
        GeneralSubstitutionEncode encoder = new GeneralSubstitutionEncode("Hello World!", s, charSet.getLongAlphabet());
        System.out.println(encoder.getOutput());
    }
    private static void testEmojEncode(){
        CharSet charSet = new CharSet();
        String[]s = new String[]{"😀","😃","😄","😁","😆","😅","😂","🤣","🥲","☺️","😊","😇","🙂","🙃","😉","😌","😍","🥰","😘","😗","😙","😚","😋","😛","😝","😜","🤪","🤨","🧐","🤓","😎","🥸","🤩","🥳","😏","😒","😞","😔","😟","😕","🙁","☹️","😣","😖","😫","😩","🥺","😢","😭","😤","😠","😡","🤬","🤯","😳","🥵","🥶","😱","😨","😰","😥","😓","🤗","🤔","🤭","🤫","🤥","😶","😐","😑","😬","🙄","😯","😦","😧","😮","😲","🥱","😴","🤤","😪","😵","🤐"};
        GeneralSubstitutionEncode encoder = new GeneralSubstitutionEncode("Hello World!", s, charSet.getLongAlphabet());
        System.out.println(encoder.getOutput());
    }
    private static void testFoodCode(){
        CharSet charSet = new CharSet();
        String[] s = new String[]{"🍏","🍎","🍐","🍊","🍋","🍌","🍉","🍇","🍓","🫐","🍈","🍒","🍑","🥭","🍍","🥥","🥝","🍅","🍆","🥑","🥦","🥬","🥒","🌶","🫑","🌽","🥕","🫒","🧄","🧅","🥔","🍠","🥐","🥯","🍞","🥖","🥨","🧀","🥚","🍳","🧈","🥞","🧇","🥓","🥩","🍗","🍖","🦴","🌭","🍔","🍟","🍕","🫓","🥪","🥙","🧆","🌮","🌯","🫔","🥗","🥘","🫕","🥫","🍝","🍜","🍲","🍛","🍣","🍱","🥟","🦪","🍤","🍙","🍚","🍘","🍥","🥠","🥮","🍢","🍡","🍧","🍨","🍦"};
        GeneralSubstitutionEncode encoder = new GeneralSubstitutionEncode("Hello World!", s, charSet.getLongAlphabet());
        System.out.println(encoder.getOutput());
    }
    public void setInput(String in){
        input = in;
    }
    public void setKey(String[] k){
//        if (k.length == alphabet.length) {
            key = k;
       // }
    }
    public void setAlphabet(char[] a){
        alphabet = a;
    }
    public String getOutput(){return output;}
}
