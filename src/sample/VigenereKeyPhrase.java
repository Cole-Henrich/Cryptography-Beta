package sample;

public class VigenereKeyPhrase {
    private String key;
    public VigenereKeyPhrase(String keyWord, int textLength){
        int a = 0;
        int b = keyWord.length();
        for (int c = textLength; c >=0; c--) {
            if (c % b == 0){
                a = c;
                break;
            }
        }
        int d = a/b;
        StringBuilder sb = new StringBuilder();
        sb.append(keyWord.repeat(d));
        int f = textLength-a;
        for (int g = 0; g < f; g++) {
            sb.append(keyWord.charAt(g));
        }
        this.key = sb.toString();
    }
    public String get(){return key;}

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            VigenereKeyPhrase vigenereKeyPhrase = new VigenereKeyPhrase(new VigenereKeyWord("IMPROVE YOUR PUZZLE SOLVING SKILLS".length()).get(), "IMPROVE YOUR PUZZLE SOLVING SKILLS".length());
            System.out.println(vigenereKeyPhrase.get());
        }
        for (int i = 0; i < 10; i++) {
            VigenereKeyPhrase vigenereKeyPhrase = new VigenereKeyPhrase(new VigenereKeyWord("IMPROVE YOUR PUZZLE SOLVING SKILLS".length(), new BigArrayStore()).get(), "IMPROVE YOUR PUZZLE SOLVING SKILLS".length());
            System.out.println(vigenereKeyPhrase.get());
        }
    }
}
