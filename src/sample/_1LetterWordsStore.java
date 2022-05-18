package sample;
import java.util.HashMap;

public class _1LetterWordsStore{
    private static HashMap<String, Integer> map;
    public _1LetterWordsStore(){
        map.put("k",1);
    }
    public static HashMap<String, Integer> get(){return map;}
}