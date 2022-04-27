package sample;

import java.util.ArrayList;

public class ContainsCorrectLetters {
    private ArrayList<String> result;

    public ContainsCorrectLetters(ArrayList<String> list, ArrayList<Character> allContainedLetters) {
        System.err.println("from ContainsCorrectLetters.java new ContainsCorrectLetters");
        result = new ArrayList<>();
        for (String s:list){
            boolean containsAll = true;
            s = s.toLowerCase();
            for (char ch:allContainedLetters){
                if (!s.contains(String.valueOf(ch).toLowerCase())){
                    containsAll = false;
                    break;
                }
            }
            if (containsAll){
                result.add(s);
            }
        }
    }

    public ArrayList<String> get() {
        return result;
    }
}
