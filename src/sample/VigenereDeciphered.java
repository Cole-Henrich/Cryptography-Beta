package sample;

import java.util.Locale;

public class VigenereDeciphered {
    private String s;
    private final CharSet charSet = new CharSet(false);
    private final char[] alphabet = charSet.getAlphabet();
    private final TabulaRecta tabulaRecta = new TabulaRecta();
    public VigenereDeciphered(String Cipher, String keyPhrase){
        this(Cipher, keyPhrase, false);
    }
    public VigenereDeciphered(String Cipher, String keyPhrase, boolean println){
        StringBuilder b = new StringBuilder();
        String c = charSet.RemoveIgnorers(Cipher);
        for (int i = 0; i < c.length(); i++) {
            String cipherLetter = String.valueOf(c.charAt(i)).toLowerCase();
            String row = String.valueOf(keyPhrase.charAt(i)).toLowerCase();
            String column = tabulaRecta.columnOf(cipherLetter, row).toLowerCase();
            b.append(column);
            if (println) {
                System.out.println("VigenereDeciphered");
                System.out.println(column + " " + row + " " + cipherLetter);
            }
        }
        String d = b.toString();
        String e = charSet.inheritPuncuationAndForm(d, Cipher);
        this.s = e;
    }
    public String get(){return s;}

    public static void main(String[] args) {
        VigenereKeyPhrase vigenereKeyPhrase = new VigenereKeyPhrase("HOUGHTON", "MICHIGAN TECHNOLOGICAL UNIVERSITY".length());
        VigenereDeciphered vigenereDeciphered = new VigenereDeciphered("twwnpzoa aswnuhzbnwwgs nbvcslypmm", vigenereKeyPhrase.get());
        System.out.println(vigenereDeciphered.get());
        CharSet charSet = new CharSet(false);
        String MLKCipher = """
                hsyzz sgi gcdn eabojk, bs xftczsm. sg t juhnwbpb fd lszaf mqyjblrtn ufr sge tfgefczi ufr rcztlgid gzilgrfafxif oyb
                fwyf hsmgvbl ommgi gqgpjr, x qgbocdtx ovz fq luk hljwxhy ommgi. cl'g ljipsk uzmp ii zogc kdoj qwmetml tcgqcx sbo
                yehiuwlrq ii koj qabylvtls vigr lzajn qcf. yzs lszaf mqyjblrtn ck hsc ntml tcgqcx lvlr u wuns tl fwy occjp. x'g
                vswgswnwr em ety wonf au sgi scdt ngbteti cf gagft ix o dragg oocluca. qcf pqkysz efmi sgi lpq sylsckucyv hz ea dh
                sbjfal.
                """;
        VigenereKeyPhrase olympus = new VigenereKeyPhrase("olympus", MLKCipher.length());
        System.out.println(olympus.get().length() + " "+ MLKCipher.length());
        VigenereDeciphered IWouldntStopThere = new VigenereDeciphered(MLKCipher, olympus.get());
        System.out.println(IWouldntStopThere.get());
    }
}