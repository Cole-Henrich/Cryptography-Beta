package sample;

import java.util.ArrayList;
import java.util.Locale;

public class TabulaRecta extends ArrayList<char[]> {
    private final CharSet charSet = new CharSet();
    private final char[] alphabet = charSet.getAlphabet();
    public String columnOf(String cipherLetter, String row){
        String r = row.toLowerCase();
        String cL = cipherLetter.toLowerCase();
        int Col = 0;
        int Row = 0;
        for (int a = 0; a < alphabet.length; a++) {
            String b = String.valueOf(alphabet[a]).toLowerCase();
            if (b.equalsIgnoreCase(r)){
                Row = a;
                break;
            }
        }
        char[] ROW = this.get(Row);
        for (int a = 0; a < ROW.length; a++) {
            String b = String.valueOf(ROW[a]).toLowerCase();
            if (b.equalsIgnoreCase(cL)){
                Col = a;
                break;
            }
        }
        return String.valueOf(alphabet[Col]);
    }
    public String intersectionOf(String column, String row){
        String a = "";
        String b = column.toLowerCase();
        String c = row.toLowerCase();
        int Col = 0;
        int Row = 0;
        int numFound = 0;
        for (int d = 0; d < alphabet.length; d++) {
            String e = String.valueOf(alphabet[d]).toLowerCase();
            if (e.equalsIgnoreCase(b)){
                Col = d;
                numFound++;
            }
            if (e.equalsIgnoreCase(c)){
                Row = d;
                numFound++;
            }
            if (numFound == 2){
                break;
            }
        }
        a = String.valueOf(this.get(Row)[Col]);
        return a;
    }
    public TabulaRecta(boolean capitalize){
        super();
        for (int shift = 0; shift < 26; shift++) {
            CaesarKey caesarKey = new CaesarKey(shift);
            char[] key = caesarKey.get();
            if (capitalize){
                key = charSet.morphCaseACharArray(key, true, false, false);
            }
            this.add(key);
        }
    }
    public TabulaRecta(){
        this(false);
    }
    public static void main(String[] args) {
        TabulaRecta tabulaRecta = new TabulaRecta();
        for (char[] key: tabulaRecta) {
            System.out.println(key);
        }
        System.out.println(tabulaRecta.intersectionOf("M", "H"));
        System.out.println(tabulaRecta.columnOf("T", "H"));
        System.out.println(tabulaRecta.columnOf("R", "R"));
        System.out.println(tabulaRecta.columnOf("R", "E"));
        for (int i = 0; i < tabulaRecta.alphabet.length; i++) {
            String column = String.valueOf(tabulaRecta.alphabet[i]);
            for (int j = 0; j < tabulaRecta.alphabet.length; j++) {
                String row = String.valueOf(tabulaRecta.alphabet[j]);
                System.out.println(column + " "+ row + " " + tabulaRecta.intersectionOf(column, row));
            }
        }
    }
}
