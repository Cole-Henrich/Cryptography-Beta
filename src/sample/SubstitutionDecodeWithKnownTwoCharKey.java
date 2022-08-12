package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class SubstitutionDecodeWithKnownTwoCharKey {
    private String output;
    CharSet charSet = new CharSet();
    private String[] key;
    public SubstitutionDecodeWithKnownTwoCharKey(String input, String[] twoChars){
//        System.out.println("new SubstitutionDecodeWithKnownTwoCharKey");
              ArrayList<String> split = charSet.StringToStringArrayList(input.split("(?<=\\G.{7})"));
              KeyCreatorFromLimitedSymbols keyCreator = new KeyCreatorFromLimitedSymbols(twoChars, 83);
              key = keyCreator.getKey();
              SubstitutionDecodeWithKnownKey decoder = new SubstitutionDecodeWithKnownKey(split, charSet.getLongAlphabet(), key);
              output = decoder.getOutput();
    }

    public static void main(String[] args) {
        SubstitutionDecodeWithKnownTwoCharKey decoder = new SubstitutionDecodeWithKnownTwoCharKey("<><><>><<<>>><<<><><><<><><><<>><<<", new String[]{"<", ">"});
        System.out.println(decoder.getOutput());
    }

    public String[] getKey() {
        return key;
    }

    public String getOutput() {
        return output;
    }
}
