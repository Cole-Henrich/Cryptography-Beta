package sample;

import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings("LawOfDemeter")
public class WordleSolverLogic {
    ArrayList<String> results = new ArrayList<>();
    public WordleSolverLogic(ArrayList<Character> not, ArrayList<Character> wrongplace, String known, int numResults) throws IOException {
        System.err.println("from WordleSolverLogic.java new WordleSolverLogic");
        ArrayList<Character> allContainedLetters = new ArrayList<>(wrongplace);
        char[] chs = known.toCharArray();
        for (char ch : chs) {if (ch != '_') {allContainedLetters.add(ch);}}
        System.err.println("from WordleSolverLogic.java new NGetter");
        NGetter nGetter = new NGetter(new CharSet().getLanguage_Manipulation_UniqueWords_TrainerReservoir(), null, known.length());
        ArrayList<String> nLongs = nGetter.getUniques();
        System.err.println("from WordleSolverLogic.java new NotContainsNotLetters ");
        NotContainsNotLetters notContainsNotLetters = new NotContainsNotLetters(nLongs, not);
        ArrayList<String> ncnl = notContainsNotLetters.get();
        System.err.println("from WordleSolverLogic.java new ContainsCorrectLetters");
        ContainsCorrectLetters containsCorrectLetters = new ContainsCorrectLetters(ncnl, allContainedLetters);
        ArrayList<String> ccl = containsCorrectLetters.get();
        HasLettersInCorrectPlaces hasLettersInCorrectPlaces = new HasLettersInCorrectPlaces(ccl, known);
        ArrayList<String> hlicp = hasLettersInCorrectPlaces.get();
//        Ranker ranker = new Ranker(hlicp);
//        ArrayList<String> ranked = ranker.getMostToLeast();
//        System.out.println(ranked);
        System.out.println(hlicp);



    }
    public ArrayList<String> get() {
        return results;
    }
}
