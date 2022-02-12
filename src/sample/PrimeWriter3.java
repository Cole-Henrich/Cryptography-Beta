package sample;

import java.math.BigInteger;
import java.util.Random;

public class PrimeWriter3 {
    public static void main(String[] args) {
        BigInteger b = BigInteger.probablePrime(1024, new Random());
        System.out.println(b);
    }
}

