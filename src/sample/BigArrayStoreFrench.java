package sample;

import java.util.ArrayList;
import java.util.Collections;

public class BigArrayStoreFrench{
                                
                    private ArrayList<String> central;
                    public BigArrayStoreFrench(){
ArrayStoreFrench1 as1 = new ArrayStoreFrench1();
String[] _1 = as1.get();
ArrayStoreFrench2 as2 = new ArrayStoreFrench2();
String[] _2 = as2.get();
ArrayStoreFrench3 as3 = new ArrayStoreFrench3();
String[] _3 = as3.get();
ArrayStoreFrench4 as4 = new ArrayStoreFrench4();
String[] _4 = as4.get();
ArrayStoreFrench5 as5 = new ArrayStoreFrench5();
String[] _5 = as5.get();
ArrayStoreFrench6 as6 = new ArrayStoreFrench6();
String[] _6 = as6.get();
ArrayStoreFrench7 as7 = new ArrayStoreFrench7();
String[] _7 = as7.get();
ArrayStoreFrench8 as8 = new ArrayStoreFrench8();
String[] _8 = as8.get();
central = new ArrayList<>();String[][] a = {_1,_2,_3,_4,_5,_6,_7,_8};for (String[] b: a) {
            Collections.addAll(central, b);
        }
    }
    public ArrayList<String> central(){return central;}
}
