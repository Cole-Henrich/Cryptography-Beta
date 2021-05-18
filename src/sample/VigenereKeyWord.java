package sample;

import java.util.ArrayList;
import java.util.Random;

public class VigenereKeyWord {
    private final Random random = new Random();
    private String keyWord;
    private int textLength;
    public VigenereKeyWord(int TextLength){
        this.textLength = TextLength;
        int min = (int) (((double) textLength)/4.0);
        int max = 2*min;
        int keyWordLength = random.nextInt(max-min)+min;
        CharSet charSet = new CharSet();
        char[] alphabet = charSet.getAlphabet();
        ArrayList<Character> a = charSet.charToCharArrayList(alphabet);
        StringBuilder sb = new StringBuilder();
        for (int b = 0; b < keyWordLength; b++) {
            int r = random.nextInt(a.size());
            Character c = a.get(r);
            sb.append(c);
            a.remove(r);
        }
        this.keyWord = sb.toString();
    }
    public int getTextLength(){return textLength;}
    public String get(){return keyWord;}

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            VigenereKeyWord vigenereKeyWord = new VigenereKeyWord("IMPROVE YOUR PUZZLE SOLVING SKILLS".length());
            System.out.println(vigenereKeyWord.get());
        }
    }
}
