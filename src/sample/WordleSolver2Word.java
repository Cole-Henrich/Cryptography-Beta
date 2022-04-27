package sample;

import java.util.ArrayList;

public class WordleSolver2Word {
    private ArrayList<Character> lettersNotIn;
    public WordleSolver2Word(ArrayList<WordleSolver2Letter> letters, ArrayList<Character> LettersNotIn){
        lettersNotIn = LettersNotIn;
    }

    public ArrayList<Character> getLettersNotIn() {
        return lettersNotIn;
    }
}
