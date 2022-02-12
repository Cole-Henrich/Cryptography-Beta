package sample;

import java.io.FileNotFoundException;
import java.util.ArrayList;

@SuppressWarnings({"ConstantConditions"})
public class SimilarTo extends ArrayList<String>{

    private final CharSet charSet = new CharSet();
    private String Word;
    private char Letter;

    public char getLetter() {
        return Letter;
    }

    public String getWord() {
        return Word;
    }

    public SimilarTo(String word, char c) throws FileNotFoundException {
        ArrayList<String> temp = retrieve(word, c);
        Word = word;
        Letter = c;
        addAll(temp);
    }
    public ArrayList<String> retrieve(String word, char c) throws FileNotFoundException {
        if (word.length() < 3 || !word.contains(String.valueOf(c))){
            return new ArrayList<>();
        }
        Uniques uniques = new Uniques();
        ArrayList<String> level1 = new ArrayList<>();
        for (int i = 0; i < uniques.size(); i++) {
            String unique = uniques.get(i);
            if (unique.length() == word.length() && !unique.equalsIgnoreCase(word)){
                String[] This = charSet.charToStringArray(word.toCharArray());
                String[] That = charSet.charToStringArray(unique.toCharArray());
                String stringVal = String.valueOf(c);

                int indexOfC = findIndexOf(c, word);
                int count = 0;
                for (int j = 0; j < This.length; j++) {
                    if (j != indexOfC){
                        if (This[i].equalsIgnoreCase(That[i]) && !This[i].equalsIgnoreCase(stringVal)){
                            count++;
                        }
                    }
                }
                if (count == word.length() - occurrencesOfC(c, word)){
                    level1.add(unique);
                }
            }
        }
        return level1;
    }
    public int occurrencesOfC(char Char, String in){
        int rtn = 0;
        char[] charArray = in.toCharArray();
        for (char c : charArray) {
            if (c == Char) {
                rtn++;
            }
        }
        return rtn;
    }
    public int findIndexOf(char Char, String in){
        int rtn = -1;
        char[] charArray = in.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == Char){
                rtn = i;
                break;
            }
        }
        return rtn;
    }
}
