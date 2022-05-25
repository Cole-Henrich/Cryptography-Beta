package sample;

import java.util.ArrayList;
import java.util.Collections;

public class _Array_13LetterWordsAndOccurrencesBigStore {

    private ArrayList<a> central;
    public _Array_13LetterWordsAndOccurrencesBigStore(){
        _Array_13LetterWordsAndOccurrencesStore1 as1 = new _Array_13LetterWordsAndOccurrencesStore1();
        a[] _1 = as1.get();
        _Array_13LetterWordsAndOccurrencesStore2 as2 = new _Array_13LetterWordsAndOccurrencesStore2();
        a[] _2 = as2.get();
        _Array_13LetterWordsAndOccurrencesStore3 as3 = new _Array_13LetterWordsAndOccurrencesStore3();
        a[] _3 = as3.get();

        central = new ArrayList<>();
        a[][] a = {_1, _2, _3};
        for (a[] b: a) {
            Collections.addAll(central, b);
        }
    }
    public ArrayList<a> central(){return central;}
}