package sample;

import java.math.BigInteger;

public class Misc {
    private final BigInteger _26 = BigInteger.valueOf(26);
    public Misc(){
        BigInteger FindNumKeys = FindNumKeys(373);
        BigInteger findNumKeys = findNumKeys(20, 4);
        BigInteger exp20 = _26.pow(20);
        BigInteger exp19 = _26.pow(19);
        BigInteger exp18 = _26.pow(18);
        BigInteger exp17 = _26.pow(17);
        BigInteger exp16 = _26.pow(16);
        BigInteger exp15 = _26.pow(15);
        BigInteger exp14 = _26.pow(14);
        BigInteger exp13 = _26.pow(13);
        BigInteger exp12 = _26.pow(12);
        BigInteger exp11 = _26.pow(11);
        BigInteger exp10 = _26.pow(10);
        BigInteger exp9 = _26.pow(9);
        BigInteger exp8 = _26.pow(8);
        BigInteger exp7 = _26.pow(7);
        BigInteger exp6 = _26.pow(6);
        BigInteger exp5 = _26.pow(5);
        BigInteger exp4 = _26.pow(4);
        BigInteger Sum = exp20.add(exp19.add(exp18.add(exp17.add(exp16.add(exp15.add(exp14.add(exp13.add(exp12.add(exp11.add(exp10.add(exp9.add(exp8.add(exp7.add(exp6.add(exp5.add(exp4))))))))))))))));
        System.out.println(FindNumKeys);
        System.out.println(findNumKeys);
        System.out.println(Sum);
        System.out.println(Long.MAX_VALUE);
    }
    public static void main(String[] args) {
        new Misc();
    }
    private BigInteger FindNumKeys(int textLength){
        int minLength = (int) Math.min(textLength/4.0, 4);
        int maxLength = (int) Math.min(textLength/2.0, 20);
        System.out.println(minLength);
        System.out.println(maxLength);
        return findNumKeys(maxLength, minLength);
    }
    private BigInteger findNumKeys(int maxLength, int minLength){
        BigInteger sum = BigInteger.ZERO;
        for (int exponent = maxLength; exponent >=minLength; exponent--) {
            BigInteger add = _26.pow(exponent);
            sum = sum.add(add);
        }
        return sum;
    }
}
