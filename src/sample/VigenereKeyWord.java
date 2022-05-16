package sample;

import java.util.ArrayList;
import java.util.Random;

public class VigenereKeyWord {
    private final Random random = new Random();
    private String keyWord;
    private int textLength;
    public VigenereKeyWord(int TextLength, BigArrayStore big){
        ArrayList<String> biggy = big.central();
        this.textLength = TextLength;
        int[] minMax = minMax();
        int min = minMax[0];
        int max = minMax[1];
        int keyWordLength = random.nextInt(max-min)+min;
        ArrayList<String> properLength = new ArrayList<>();
        for (String s : biggy) {
            if (s.length() == keyWordLength) {
                properLength.add(s);
            }
        }
        keyWord = properLength.get(random.nextInt(properLength.size()));
    }
    public VigenereKeyWord(int TextLength){
        this.textLength = TextLength;
        int min = (int) (((double) textLength)/4.0);
        int max = 2*min;
        int keyWordLength = random.nextInt(max-min)+min;
//        int[] minMax = minMax();
//        int min = minMax[0];
//        int max = minMax[1];
//        int keyWordLength = random.nextInt(max-min)+min;
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
    public int[] minMax(){
        int min = 0;
        int max = 0;
        if (textLength < 10){
            min = (int) (((double) textLength)/2.0);
            max = 2*min;
        }
        if (textLength >= 10 && textLength <= 20){
            min = (int) (((double) textLength)/4.0);
            max = 2*min;
        }
        if (textLength >= 20 && textLength <= 40){
            min = (int) (((double) textLength)/8.0);
            max = 2*min;
        }
        if (textLength >= 40){
            min = 2;
            max = 10;
        }
        return new int[]{min, max};
    }
    public int getTextLength(){return textLength;}
    public String get(){return keyWord;}
    public void setKeyWord(String k){this.keyWord = k;}
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            VigenereKeyWord vigenereKeyWord = new VigenereKeyWord("IMPROVE YOUR PUZZLE SOLVING SKILLS".length());
            System.out.println(vigenereKeyWord.get());
        }
        for (int i = 0; i < 10; i++) {
            VigenereKeyWord vigenereKeyWord = new VigenereKeyWord("IMPROVE YOUR PUZZLE SOLVING SKILLS".length(), new BigArrayStore());
            System.out.println(vigenereKeyWord.get());
        }
    }
}
