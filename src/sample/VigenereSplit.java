package sample;

import java.util.ArrayList;

public class VigenereSplit extends ArrayList<ArrayList<ArrayList<String>>> {
    public VigenereSplit(String plainText, String keyPhrase){
        ArrayList<ArrayList<String>> x = new ArrayList<>();
        ArrayList<ArrayList<String>> y = new ArrayList<>();
        String a = plainText.replaceAll("\s","");
        for (int b = 0; b < a.length(); b+=5) {
            ArrayList<String> c = new ArrayList<>();
            ArrayList<String> e = new ArrayList<>();
            for (int d = b; d < b+5 && d < a.length(); d++) {
                c.add(String.valueOf(a.charAt(d)));
                e.add(String.valueOf(keyPhrase.charAt(d)));
            }
            x.add(c);
            y.add(e);
        }
        add(x);
        add(y);
    }
}
