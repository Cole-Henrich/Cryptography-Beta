package sample;

import java.util.ArrayList;

public class VigenereCipher {
    private String s;
    private final CharSet charSet = new CharSet();
    public VigenereCipher(String text){
        TabulaRecta tabulaRecta = new TabulaRecta();
        String x = text;
        x = charSet.removeIgnorers(x, new String[]{""});
        VigenereKeyPhrase vigenereKeyPhrase = new VigenereKeyPhrase("HOUGHTON", x.length());
        VigenereSplit vigenereSplit = new VigenereSplit(text, vigenereKeyPhrase.get());
        ArrayList<ArrayList<String>> b = vigenereSplit.get(0);
        ArrayList<ArrayList<String>> c = vigenereSplit.get(1);
        StringBuilder d = new StringBuilder();
        for (int e = 0; e < vigenereSplit.get(0).size(); e++) {
            ArrayList<String> f = b.get(e);
            ArrayList<String> g = c.get(e);
            for (int h = 0; h < f.size(); h++) {
                String i = f.get(h);
                String j = g.get(h);
                String k = tabulaRecta.intersectionOf(i,j);
                d.append(k);
            }
        }
        String l = d.toString();
        String m = charSet.inheritForm(l, text);
        s = m;
    }
    public String get(){
        return s;
    }
    public static void main(String[] args) {
        System.out.println(new VigenereCipher("MICHIGAN TECHNOLOGICAL UNIVERSITY").get());
    }
}
