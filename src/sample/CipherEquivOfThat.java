package sample;

public class CipherEquivOfThat {
    private String cipherEquivOfThat;
    public CipherEquivOfThat(String Cipher){
        this.cipherEquivOfThat = new _1231sThatExistInText(Cipher).get().get(0);
    }
    public String get(){return cipherEquivOfThat;}

    public static void main(String[] args) {
        CipherEquivOfThat test = new CipherEquivOfThat(
                """
                        gszg dzh z uzg xzg gszg blf hzd, dzh gszg mlg?
                                                 Prxp rh zmlgsvi dliw orpv gszg, hl rh wvzw, zmw kfok, krnk, mvlm.
                                                 Blf prxp z hlxxviyzoo. Droo ofoo uzoo gsilfts?
                         """);
        System.out.println(test.get());
    }
}
