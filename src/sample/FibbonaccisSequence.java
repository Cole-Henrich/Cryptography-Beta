package sample;

import java.util.ArrayList;

public class FibbonaccisSequence extends ArrayList<Long> {
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    public FibbonaccisSequence(int length){
        //9223372036854775807
        //4660046610375530309
        super();
        add(0L);
        add(1L);
        for (int a = 2; a < length; a++) {
            double b =(((double)(get(a-2)))/2.0)+(((double)(get(a-1)))/2.0);
            if (b < Long.MAX_VALUE/2.0){
                add(get(a-2)+ get(a-1));
            }
            else {
                break;
            }
        }
    }
    public FibbonaccisSequence(){
        this((int) Math.pow(10, 5));
    }

    public static void main(String[] args) {
        System.out.println(new FibbonaccisSequence(100));

    }
}
