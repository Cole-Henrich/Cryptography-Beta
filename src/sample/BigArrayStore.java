package sample;

import java.util.ArrayList;
import java.util.Collections;

public class BigArrayStore {

    private ArrayList<String> central;
    public BigArrayStore(){
        ArrayStore1 as1 = new ArrayStore1();
        String[] _1 = as1.get();
        ArrayStore2 as2 = new ArrayStore2();
        String[] _2 = as2.get();
        ArrayStore3 as3 = new ArrayStore3();
        String[] _3 = as3.get();
        ArrayStore4 as4 = new ArrayStore4();
        String[] _4 = as4.get();
        ArrayStore5 as5 = new ArrayStore5();
        String[] _5 = as5.get();

        central = new ArrayList<>();
        String[][] a = {_1, _2, _3, _4, _5};
        for (String[] b: a) {
            Collections.addAll(central, b);
        }
    }
    public ArrayList<String> central(){return central;}
}
