package sample;

import java.util.ArrayList;
import java.util.Collections;

public class Metamorphose {
    private ArrayList<String> _A;
    private String _B;
    private String _C;
    private final CharSet charSet = new CharSet();
    public Metamorphose(String[] a){
        ArrayList<String> A = new ArrayList<>();
        Collections.addAll(A, a);
        this._A = A;
    }
    public Metamorphose(String b){
        if (b != null) {
            StringBuilder s = new StringBuilder("[");
            for (int i = 0; i < b.length() - 1; i++) {
                s.append(b.charAt(i)).append(", ");
            }
            String c;
            if (b.isEmpty()) {
                c = "";
            } else {
                c = String.valueOf(b.charAt(b.length() - 1));
            }
            s.append(c).append("]");
            _B = s.toString();
        }
    }
    public Metamorphose(){

    }
    public Metamorphose(String c, boolean isArray){
       this._C = c.replaceAll("null", "\u0000");
    }
    public ArrayList<String> get_A(){return _A;}
    public String get_B(){return _B;}
    public String get_C(){return _C;}
    public String[] reverseContains(String[] contains){
        char[] alphabet = charSet.getAlphabet();
        ArrayList<String> reversed = new ArrayList<>();
        for (char letter: alphabet) {
            String  a = String.valueOf(letter);
            for (String contained: contains) {
                if (!a.equals(contained)){
                    reversed.add(a);
                }
            }
        }
        String[] rtn = new String[reversed.size()];
        for (int i = 0; i < rtn.length; i++) {
            rtn[i]=reversed.get(i);
        }
        return rtn;
    }
}
