package sample;

import java.io.IOException;

public class VigenereBruteForcer {
    private boolean isSolved;
    private String solved;
    private String keyWord;
    private boolean isCaesar;
    private int shift;
    private CharSet charSet = new CharSet();
    private char[] alphabet = charSet.getAlphabet();
    private String language;
    public VigenereBruteForcer(String cipher, int likelyKeyLength) throws IOException {
        isSolved = false;
        isCaesar = false;
        if (likelyKeyLength < 4) {
            if (likelyKeyLength == 1){
                CaesarCracker caesarCracker = new CaesarCracker(cipher);
                if (caesarCracker.isSolved){
                    isSolved = true;
                    solved = caesarCracker.getSolved();
                    TabulaRecta tabulaRecta = new TabulaRecta();
                    keyWord = String.valueOf(tabulaRecta.get(caesarCracker.getShift())[0]);
                    shift = caesarCracker.getShift();
                    isCaesar = true;
                    language = caesarCracker.getLanguage();
                }
            }
            else {
                for (char c : alphabet) {
                    for (char d : alphabet) {
                        if (likelyKeyLength == 2) {
                            String kw = c + "" + d;
                            test(cipher, kw);
                        } else {
                            for (char e : alphabet) {
                                String kw = c + "" + d + "" + e;
                                test(cipher, kw);
                            }
                        }
                    }
                }
            }
        }
    }
    private void test(String cipher, String kw){
        VigenereKeyPhrase vkf = new VigenereKeyPhrase(kw, cipher.length());
        VigenereDeciphered vd = new VigenereDeciphered(cipher, vkf.get());
        String got = vd.get();
        not_english not_english = new not_english(got);
        if (!not_english.not_english()) {
            isSolved = true;
            solved = got;
            keyWord = kw;
            language = "English";
        }
        else {
            not_spanish not_spanish = new not_spanish(got);
            if (!not_spanish.not_spanish()) {
                isSolved = true;
                solved = got;
                keyWord = kw;
                language = "Spanish";
            }
            else {
                not_french not_french = new not_french(got);
                if (!not_french.not_french()) {
                    isSolved = true;
                    solved = got;
                    keyWord = kw;
                    language = "French";
                }
            }
        }
    }
    public boolean isSolved() {
        return isSolved;
    }
    public String getSolved() {
        return solved;
    }
    public String getKeyWord() {
        return keyWord;
    }
    public boolean isCaesar() {
        return isCaesar;
    }

    public int getShift() {
        return shift;
    }

    public String getLanguage() {
        return language;
    }
}
