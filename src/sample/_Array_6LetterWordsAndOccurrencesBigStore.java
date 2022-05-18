package sample;

import java.util.ArrayList;
import java.util.Collections;

public class _Array_6LetterWordsAndOccurrencesBigStore {

    private ArrayList<a> central;
    public _Array_6LetterWordsAndOccurrencesBigStore(){
        _Array_6LetterWordsAndOccurrencesStore1 as1 = new _Array_6LetterWordsAndOccurrencesStore1();
        a[] _1 = as1.get();
        _Array_6LetterWordsAndOccurrencesStore1 as2 = new _Array_6LetterWordsAndOccurrencesStore1();
        a[] _2 = as2.get();
        _Array_6LetterWordsAndOccurrencesStore1 as3 = new _Array_6LetterWordsAndOccurrencesStore1();
        a[] _3 = as3.get();

        central = new ArrayList<>();
        a[][] a = {_1, _2, _3};
        for (a[] b: a) {
            Collections.addAll(central, b);
        }
    }
    public ArrayList<a> central(){return central;}
}
