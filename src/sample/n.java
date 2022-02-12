package sample;


import java.math.BigInteger;
import java.util.Random;

public class n {
    private int p;
    private int q;
    private int lengthMin;
    private int lengthMax;
    private Random random;
    private BigInteger n;
    public n(int lengthMinInclusive, int lengthMaxExclusive){

    }

    public BigInteger n() {
        return n;
    }

    public static void main(String[] args) {
        new n(4, 7);
    }
}
