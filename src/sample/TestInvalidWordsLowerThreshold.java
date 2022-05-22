package sample;

import java.util.Random;
import java.util.stream.IntStream;

public class TestInvalidWordsLowerThreshold {
    private static Random random = new Random();
    private static CharSet charSet = new CharSet();
    private static CifrarioVigenere cifrarioVigenere = charSet.getVigenere0();
    private static String cipher = cifrarioVigenere.getCipher();
    private static String normal = charSet.getString0();

    private double[][] minMeanMax;
    private double[][] NormalminMeanMax;
    private double[][] AllData;
    private double[][] NormalAllData;

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
        double[][] allData = new double[sampleSizes.length][];
        double[][] NormalallData = new double[sampleSizes.length][];


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
            double[] data = new double[numberOfTests];
            double[] normaldata = new double[numberOfTests];
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
                data[i] = thisValidityFactor;


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
                normaldata[i] = NormalthisValidityFactor;

            }
            thisMinMeanMax[0] = minValidityFactor;
            thisMinMeanMax[1] = (validityFactorSum /(double)numberOfTests);
            thisMinMeanMax[2] = maxValidityFactor;
            MinMeanMax[k] = thisMinMeanMax;
            allData[k] = data;

            NormalthisMinMeanMax[0] = NormalminValidityFactor;
            NormalthisMinMeanMax[1] = (NormalvalidityFactorSum /(double)numberOfTests);
            NormalthisMinMeanMax[2] = NormalmaxValidityFactor;
            NormalMinMeanMax[k] = NormalthisMinMeanMax;
            NormalallData[k] = normaldata;
        }
        minMeanMax = MinMeanMax;
        NormalminMeanMax = NormalMinMeanMax;
        AllData = allData;
        NormalAllData = NormalallData;
    }

    public double[][] getNormalallData() {return NormalAllData;}
    public double[][] getAllData() {return AllData;}
    public double[][] getMinMeanMax() {return minMeanMax;}
    public double[][] getNormalminMeanMax() {return NormalminMeanMax;}

    public static void main(String[] args) throws InterruptedException {
        testOne();
    }
    private static void testOne() throws InterruptedException {
        Time time = new Time();
        int min = 7;
        int max = 23;
        int sampleSize = 16;
        TestInvalidWordsLowerThreshold tester = new TestInvalidWordsLowerThreshold(new int[]{sampleSize}, 1000);
        double[][] minMeanMax = tester.getMinMeanMax();
        double[][] NormalminMeanMax = tester.getNormalminMeanMax();
        System.out.format("%12s%12s\t%7s\t%7s\t%7s\n"," ","Words Tried", "Minimum", "Mean", "Maximum");
        for (int i = 0; i < minMeanMax.length; i++) {
            System.out.format("%12s%12d\t%7f\t%7f\t%7f\n","In Cipher:",i+min, minMeanMax[i][0], minMeanMax[i][1], minMeanMax[i][2]);
            System.out.format("%12s%12d\t%7f\t%7f\t%7f\n\n","In Text:",i+min, NormalminMeanMax[i][0], NormalminMeanMax[i][1], NormalminMeanMax[i][2]);
        }
        double[][] allData = tester.getAllData();
        double[][] NormalAllData = tester.getNormalallData();
        System.out.println(sampleSize+"__________________\n\n\n");
        for (double v : allData[0]) {
            System.out.println(v);
        }
        System.out.println("\n\n\n");
        for (double v : NormalAllData[0]) {
            System.out.println(v);
        }
        time.end();
        time.println();
    }
    private static void testMany() throws InterruptedException {
        Time time = new Time();
        int min = 7;
        int max = 23;
        TestInvalidWordsLowerThreshold tester = new TestInvalidWordsLowerThreshold(new int[]{8,9,10,16,20}, 1000);
        double[][] minMeanMax = tester.getMinMeanMax();
        double[][] NormalminMeanMax = tester.getNormalminMeanMax();
        System.out.format("%12s%12s\t%7s\t%7s\t%7s\n"," ","Words Tried", "Minimum", "Mean", "Maximum");
        for (int i = 0; i < minMeanMax.length; i++) {
            System.out.format("%12s%12d\t%7f\t%7f\t%7f\n","In Cipher:",i+min, minMeanMax[i][0], minMeanMax[i][1], minMeanMax[i][2]);
            System.out.format("%12s%12d\t%7f\t%7f\t%7f\n\n","In Text:",i+min, NormalminMeanMax[i][0], NormalminMeanMax[i][1], NormalminMeanMax[i][2]);
        }
        double[][] allData = tester.getAllData();
        double[][] NormalAllData = tester.getNormalallData();
        System.out.println("8__________________\n\n\n");
        for (double v : allData[4]) {
            System.out.println(v);
        }
        System.out.println("\n\n\n");
        for (double v : NormalAllData[4]) {
            System.out.println(v);
        }
        System.out.println("\n\n\n9__________________\n\n\n");
        for (double v : allData[5]) {
            System.out.println(v);
        }
        System.out.println("\n\n\n");
        for (double v : NormalAllData[5]) {
            System.out.println(v);
        }
        System.out.println("\n\n\n10__________________\n\n\n");
        for (double v : allData[6]) {
            System.out.println(v);
        }
        System.out.println("\n\n\n");
        for (double v : NormalAllData[6]) {
            System.out.println(v);
        }
        System.out.println("\n\n\n16__________________\n\n\n");
        for (double v : allData[12]) {
            System.out.println(v);
        }
        System.out.println("\n\n\n");
        for (double v : NormalAllData[12]) {
            System.out.println(v);
        }
        System.out.println("\n\n\n20__________________\n\n\n");
        for (double v : allData[16]) {
            System.out.println(v);
        }
        System.out.println("\n\n\n");
        for (double v : NormalAllData[16]) {
            System.out.println(v);
        }
        time.end();
        time.println();
    }

}
