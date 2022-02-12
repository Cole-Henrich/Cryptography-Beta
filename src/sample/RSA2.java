package sample;

import java.math.BigInteger;
import java.util.Random;

public class RSA2 {
    public static void main(String[] args) {
        Random random = new Random();
        BigInteger p = BigInteger.probablePrime(random.nextInt(20)+320, random);
        System.out.println(p.bitLength());
        BigInteger q = BigInteger.probablePrime(random.nextInt(20)+320, random);
        System.out.println(q.bitLength());
        System.out.println(String.valueOf(p).length());
        System.out.println(String.valueOf(q).length());

        BigInteger n = p.multiply(q);
        BigInteger pMinus1 = p.subtract(BigInteger.valueOf(1));
        BigInteger qMinus1 = q.subtract(BigInteger.valueOf(1));
        BigInteger pMinus1_Times_qMinus1 = pMinus1.multiply(qMinus1);
        BigInteger d;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            BigInteger _d = new BigInteger(1024, new Random());
            if (_d.gcd(pMinus1_Times_qMinus1).equals(BigInteger.valueOf(1))){
                d = _d;
                break;
            }
        }
//        BigInteger e;
//        e · d ≡ 1 (mod (p − 1) · (q − 1)).
    }
}
