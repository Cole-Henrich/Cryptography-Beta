package sample;

import java.util.Random;
import java.util.stream.IntStream;

public class TestInvalidWordsLowerThreshold {
    private static Random random = new Random();
    private static CharSet charSet = new CharSet();
    private static CifrarioVigenere cifrarioVigenere = charSet.getVigenere0();
    private static String cipher = cifrarioVigenere.getCipher();
    private static String normal = charSet.getString0();

    private final double[][] minMeanMax;
    private final double[][] NormalminMeanMax;


    public TestInvalidWordsLowerThreshold(int min, int max, int numberOfTests) throws InterruptedException {
        this(min, max, numberOfTests, cipher, normal);
    }
    public TestInvalidWordsLowerThreshold(int min, int max, int numberOfTests, String cipherCorpus, String normalCorpus) throws InterruptedException {
        this(IntStream.range(min, max+1).toArray(), numberOfTests, cipherCorpus, normalCorpus);
    }
    public TestInvalidWordsLowerThreshold(int[] sampleSizes, int numberOfTests) throws InterruptedException {
        this(sampleSizes, numberOfTests, cipher, normal);
    }
    public TestInvalidWordsLowerThreshold(int[] sampleSizes, int numberOfTests, String cipherCorpus, String normalCorpus) throws InterruptedException {
        String[] cipherArray = cipherCorpus.split(" ");
        double[][] MinMeanMax = new double[sampleSizes.length][3];

        String[] normalArray = normalCorpus.split(" ");
        double[][] NormalMinMeanMax = new double[sampleSizes.length][3];

        for (int k = 0; k < sampleSizes.length; k++) {
            double[] thisMinMeanMax = new double[3];
            double[] NormalthisMinMeanMax = new double[3];

            int sampleSize = sampleSizes[k];
            double validityFactorSum = 0;
            double minValidityFactor = 1;
            double maxValidityFactor = 0;

            double NormalvalidityFactorSum = 0;
            double NormalminValidityFactor = 1;
            double NormalmaxValidityFactor = 0;

            for (int i = 0; i < numberOfTests; i++) {
                int randomIndex = random.nextInt(cipherArray.length - sampleSize);
                StringBuilder sb = new StringBuilder();
                for (int j = randomIndex; j < randomIndex + sampleSize; j++) {
                    sb.append(cipherArray[j]).append("\s");
                }
                String test = sb.toString();
                not_english not_english = new not_english(test, false, true, false, false, 0);

                double thisValidityFactor = not_english.getValidityFactor();

                if (thisValidityFactor < minValidityFactor){minValidityFactor = thisValidityFactor;}
                if (thisValidityFactor > maxValidityFactor){maxValidityFactor = thisValidityFactor;}

                validityFactorSum+=thisValidityFactor;



                int NormalrandomIndex = random.nextInt(cipherArray.length - sampleSize);
                StringBuilder Normalsb = new StringBuilder();
                for (int j = NormalrandomIndex; j < NormalrandomIndex + sampleSize; j++) {
                    Normalsb.append(normalArray[j]).append("\s");
                }
                String Normaltest = Normalsb.toString();
                not_english Normalnot_english = new not_english(Normaltest, false, true, false, false, 0);

                double NormalthisValidityFactor = Normalnot_english.getValidityFactor();

                if (NormalthisValidityFactor < NormalminValidityFactor){NormalminValidityFactor = NormalthisValidityFactor;}
                if (NormalthisValidityFactor > NormalmaxValidityFactor){NormalmaxValidityFactor = NormalthisValidityFactor;}

                NormalvalidityFactorSum+=NormalthisValidityFactor;
            }
            thisMinMeanMax[0] = minValidityFactor;
            thisMinMeanMax[1] = (validityFactorSum /(double)numberOfTests);
            thisMinMeanMax[2] = maxValidityFactor;
            MinMeanMax[k] = thisMinMeanMax;


            NormalthisMinMeanMax[0] = NormalminValidityFactor;
            NormalthisMinMeanMax[1] = (NormalvalidityFactorSum /(double)numberOfTests);
            NormalthisMinMeanMax[2] = NormalmaxValidityFactor;
            NormalMinMeanMax[k] = NormalthisMinMeanMax;
        }
        minMeanMax = MinMeanMax;
        NormalminMeanMax = NormalMinMeanMax;
    }
    public double[][] getMinMeanMax() {
        return minMeanMax;
    }

    public double[][] getNormalminMeanMax() {
        return NormalminMeanMax;
    }
    public static void main(String[] args) throws InterruptedException {
        Time time = new Time();
        int min = 4;
        int max = 40;
        TestInvalidWordsLowerThreshold tester = new TestInvalidWordsLowerThreshold(min, max, 100);
        double[][] minMeanMax = tester.getMinMeanMax();
        double[][] NormalminMeanMax = tester.getNormalminMeanMax();
        System.out.format("%12s%12s\t%7s\t%7s\t%7s\n"," ","Words Tried", "Minimum", "Mean", "Maximum");
        for (int i = 0; i < minMeanMax.length; i++) {
            System.out.format("%12s%12d\t%7f\t%7f\t%7f\n","In Cipher:",i+min, minMeanMax[i][0], minMeanMax[i][1], minMeanMax[i][2]);
            System.out.format("%12s%12d\t%7f\t%7f\t%7f\n\n","In Text:",i+min, NormalminMeanMax[i][0], NormalminMeanMax[i][1], NormalminMeanMax[i][2]);

        }
        time.end();
        time.println();
    }

}
