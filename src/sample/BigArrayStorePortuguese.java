package sample;

import java.util.ArrayList;
import java.util.Collections;

public class BigArrayStorePortuguese{
                                
                    private ArrayList<String> central;
                    public BigArrayStorePortuguese(){
ArrayStorePortuguese1 as1 = new ArrayStorePortuguese1();
String[] _1 = as1.get();
ArrayStorePortuguese2 as2 = new ArrayStorePortuguese2();
String[] _2 = as2.get();
ArrayStorePortuguese3 as3 = new ArrayStorePortuguese3();
String[] _3 = as3.get();
ArrayStorePortuguese4 as4 = new ArrayStorePortuguese4();
String[] _4 = as4.get();
central = new ArrayList<>();String[][] a = {_1,_2,_3,_4};for (String[] b: a) {
            Collections.addAll(central, b);
        }
    }
    public ArrayList<String> central(){return central;}
}
