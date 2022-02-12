package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSelector extends ArrayList<String>{
    private final CharSet charSet = new CharSet();
    public StringSelector(char c, String[] notContains, Uniques uniques){
        System.err.println("new StringSelector(char c: "+c+", String[] notContains:"+ Arrays.toString(notContains) +", Uniques uniques:"+uniques.getClass().descriptorString()+" )");
        for (String unique : uniques) {
            if (unique.contains(String.valueOf(c))) {
                boolean notContainsNotContains = true;
                for (String shouldNotContain : notContains) {
                    if (unique.contains(shouldNotContain)) {
                        notContainsNotContains = false;
                        break;
                    }
                }
                if (notContainsNotContains) {
                    String add = charSet.RemoveIgnorers(unique);
                    add(add);
                }
            }
        }
    }
}
