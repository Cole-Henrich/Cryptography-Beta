package sample;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("LawOfDemeter")
public class WordleSolver2Logic {
    private ArrayList<String> list;
    private String dataFormatted;
    private WordleSolver2Word word;
    public WordleSolver2Logic(String notIn, String data){
       list = new ArrayList<>();
       ArrayList<Character>lettersNotIn = new ArrayList<>();
       for (int i = 0; i < notIn.length(); i++) {lettersNotIn.add(notIn.charAt(i));}//puts the input characters in an ArrayList (easier to use in backend)
       int dataLength = 0;
        for (int i = 0; i < data.length(); i++) {if (data.charAt(i) == '['){dataLength++;}}//finds the length of the word
        char[] c = data.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length-1; i++) {
            if (c[i] == ']' && c[i+1]=='['){
                sb.append("] ");
            }
            else {
                sb.append(c[i]);
            }
        }
        sb.append(c[c.length-1]);
        String s1 = sb.toString();
        String[] arr = s1.split(" ");



       BigArrayStore biggy = new BigArrayStore();
       ArrayList<String> uniques = biggy.central(); //gets all the unique words known to this program. Gets it from a precompiled list that was made by analysing the reservoir (see CharSet.getLanguage... for pathname)
        for (int i = 0; i < uniques.size(); i++) {
            String word = uniques.get(i);
        }
    }
    public ArrayList<String> get() {return list;}
    public WordleSolver2Word getWord(){return word;}
}
