package sample;

import java.util.ArrayList;
import java.util.Collections;

public class BigArrayStore{
                                
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
ArrayStore6 as6 = new ArrayStore6();
String[] _6 = as6.get();
ArrayStore7 as7 = new ArrayStore7();
String[] _7 = as7.get();
ArrayStore8 as8 = new ArrayStore8();
String[] _8 = as8.get();
ArrayStore9 as9 = new ArrayStore9();
String[] _9 = as9.get();
ArrayStore10 as10 = new ArrayStore10();
String[] _10 = as10.get();
ArrayStore11 as11 = new ArrayStore11();
String[] _11 = as11.get();
ArrayStore12 as12 = new ArrayStore12();
String[] _12 = as12.get();
central = new ArrayList<>();String[][] a = {_1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11,_12};for (String[] b: a) {
            Collections.addAll(central, b);
        }
    }
    public ArrayList<String> central(){return central;}
}
