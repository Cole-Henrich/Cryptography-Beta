package sample;

import java.util.ArrayList;
import java.util.Collections;

public class BigArrayStoreSpanish{
                                
                    private ArrayList<String> central;
                    public BigArrayStoreSpanish(){
ArrayStoreSpanish1 as1 = new ArrayStoreSpanish1();
String[] _1 = as1.get();
ArrayStoreSpanish2 as2 = new ArrayStoreSpanish2();
String[] _2 = as2.get();
ArrayStoreSpanish3 as3 = new ArrayStoreSpanish3();
String[] _3 = as3.get();
ArrayStoreSpanish4 as4 = new ArrayStoreSpanish4();
String[] _4 = as4.get();
central = new ArrayList<>();String[][] a = {_1,_2,_3,_4};for (String[] b: a) {
            Collections.addAll(central, b);
        }
    }
    public ArrayList<String> central(){return central;}
}
