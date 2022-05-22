package sample;

public class miscDriver {
    private static CharSet charSet = new CharSet();
    public static void main(String[] args) {
        String etao = charSet.getGeneralEtao();
        for (int i = 0; i < etao.length();i++) {
            System.out.println();
        }
    }
}
