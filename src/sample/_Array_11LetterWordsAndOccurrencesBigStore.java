package sample;

import java.util.ArrayList;
import java.util.Collections;

public class _Array_11LetterWordsAndOccurrencesBigStore {

    private ArrayList<a> central;
    public _Array_11LetterWordsAndOccurrencesBigStore(){
        _Array_11LetterWordsAndOccurrencesStore1 as1 = new _Array_11LetterWordsAndOccurrencesStore1();
        a[] _1 = as1.get();
        _Array_11LetterWordsAndOccurrencesStore2 as2 = new _Array_11LetterWordsAndOccurrencesStore2();
        a[] _2 = as2.get();
        _Array_11LetterWordsAndOccurrencesStore3 as3 = new _Array_11LetterWordsAndOccurrencesStore3();
        a[] _3 = as3.get();
        _Array_11LetterWordsAndOccurrencesStore4 as4 = new _Array_11LetterWordsAndOccurrencesStore4();
        a[] _4 = as4.get();

        central = new ArrayList<>();
        a[][] a = {_1, _2, _3, _4};
        for (a[] b: a) {
            Collections.addAll(central, b);
        }
    }
    public ArrayList<a> central(){return central;}
}