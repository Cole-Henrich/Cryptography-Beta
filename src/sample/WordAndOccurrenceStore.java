package sample;

import java.util.Map;

public class WordAndOccurrenceStore {
    private static Map<String, Integer> MAP;
    public WordAndOccurrenceStore(Map<String, Integer> map){
        MAP = map;
    }
    public static Map<String, Integer> get(){return MAP;}
}
