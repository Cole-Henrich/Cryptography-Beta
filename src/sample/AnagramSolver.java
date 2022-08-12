package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class AnagramSolver {
    private String solution;
    private String[] solutions;
    private ArrayList<a> central;
    private final CharSet charSet = new CharSet();
    private ArrayList<a> validWords;
    public AnagramSolver(String letterset){
        validWords = new ArrayList<>();
        letterset = letterset.replaceAll("\s", "");
        letterset = letterset.toLowerCase();
        int l = letterset.length();
        if (l>19){solution="YourWordIsTooLong";}
        if (l==1){solution = letterset;}
        if (l==2){central=new _Array_2LetterWordsAndOccurrencesBigStore().central();}
        if (l==3){central=new _Array_3LetterWordsAndOccurrencesBigStore().central();}
        if (l==4){central=new _Array_4LetterWordsAndOccurrencesBigStore().central();}
        if (l==5){central=new _Array_5LetterWordsAndOccurrencesBigStore().central();}
        if (l==6){central=new _Array_6LetterWordsAndOccurrencesBigStore().central();}
        if (l==7){central=new _Array_7LetterWordsAndOccurrencesBigStore().central();}
        if (l==8){central=new _Array_8LetterWordsAndOccurrencesBigStore().central();}
        if (l==9){central=new _Array_9LetterWordsAndOccurrencesBigStore().central();}
        if (l==10){central=new _Array_10LetterWordsAndOccurrencesBigStore().central();}
        if (l==11){central=new _Array_11LetterWordsAndOccurrencesBigStore().central();}
        if (l==12){central=new _Array_12LetterWordsAndOccurrencesBigStore().central();}
        if (l==13){central=new _Array_13LetterWordsAndOccurrencesBigStore().central();}
        if (l==14){central=new _Array_14LetterWordsAndOccurrencesBigStore().central();}
        if (l==15){central=new _Array_15LetterWordsAndOccurrencesBigStore().central();}
        if (l==16){central=new _Array_16LetterWordsAndOccurrencesBigStore().central();}
        if (l==17){central=new _Array_17LetterWordsAndOccurrencesBigStore().central();}
        if (l==18){central=new _Array_18LetterWordsAndOccurrencesBigStore().central();}
        if (l==19){central=new _Array_19LetterWordsAndOccurrencesBigStore().central();}
        if (1<l&&l<20) {
            for (int i = 0; i < central.size(); i++) {
                a an = central.get(i);
                String s = an.getWord();
                boolean isAnagram=true;
                String templetterset=letterset;
                while (!s.isEmpty()&&!templetterset.isEmpty()&&isAnagram){
                    String c = String.valueOf(templetterset.charAt(0));
                    templetterset=templetterset.replaceAll(c,"");
                    s=s.replaceAll(c,"");
                    if (templetterset.length()!=s.length()){
                        isAnagram=false;
                    }
                }
                if (isAnagram){validWords.add(an);}
            }
            validWords.sort((a1, a2) -> Integer.compare(a2.getOccurrences(), a1.getOccurrences()));
        }
    }
    public String get(){return solution;}
    public String[] getSolutions(){return solutions;}
    public ArrayList<a> getValidWords() {return validWords;}

    public static void main(String[] args) {
        String[] words = new String[]{"onapi", "kyper", "beerl"};
        for (int i = 0; i <words.length; i++) {
            AnagramSolver anagramSolver = new AnagramSolver(words[i]);
            ArrayList<a> got = anagramSolver.getValidWords();
            for (a an : got) {
                System.out.println(an.getWord() + "\s" + an.getOccurrences());
            }
        }
    }

}
