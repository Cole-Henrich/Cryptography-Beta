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
central = new ArrayList<>();String[][] a = {_1,_2,_3,_4};for (String[] b: a) {
            Collections.addAll(central, b);
        }
    }
    public ArrayList<String> central(){return central;}
}
