package sample;

import java.util.ArrayList;

public class NotContainsNotLetters {
    private ArrayList<String> result;
    public NotContainsNotLetters(ArrayList<String> list, ArrayList<Character> notContains) {
        result = new ArrayList<>();
        for (String s:list){
            s = s.toLowerCase();
            boolean notContainsThem = true;
            for (char not:notContains){
                if (s.contains(String.valueOf(not).toLowerCase())){
                    notContainsThem = false;
                    break;
                }
            }
            if (notContainsThem){
                result.add(s);
            }
        }
    }

    public ArrayList<String> get() {
        return result;
    }
}
