package sample;

import java.util.ArrayList;
import java.util.Collections;

public class BigArrayStoreSpanish {

    private ArrayList<String> central;
    public BigArrayStoreSpanish(){
        ArrayStoreSpanish1 ass1 = new ArrayStoreSpanish1();
        String[] _1 = ass1.get();
        central = new ArrayList<>();
        String[][] a = {_1};
        for (String[] b: a) {
            Collections.addAll(central, b);
        }
    }
    public ArrayList<String> central(){return central;}
}
