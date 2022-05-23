package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestVigenereStatsAttackFindTimeExpenseVSTextAndKeyLength {
    //repetitions (avg) {keyLength (line) {textLength (x) {
    // time = avg y;
    Random random = new Random();
    String bigExampleString = BigExampleString.get();
    char[] charArrayForm = bigExampleString.toCharArray();
    BigWordAndOccurrenceStore bigWordAndOccurrenceStore = new BigWordAndOccurrenceStore();
    Map<String, Integer> central = bigWordAndOccurrenceStore.HashCentral();
    CharSet charSet = new CharSet();
    private double[][] Data;
    private ArrayList<String> Failures;
    private int NumFailures;
    private ArrayList<ArrayList<String>> KeyWordFailures;
    private int NumKeyWordFailures;
    private int NumNullCharInKeyWordFailures;


    public TestVigenereStatsAttackFindTimeExpenseVSTextAndKeyLength(int repetitions, int minKeyLength, int maxKeyLength, int keyLengthStep, int minTextLength, int maxTextLength, int TextLengthStep) throws InterruptedException {
        NumFailures = 0;
        Failures = new ArrayList<>();
        NumKeyWordFailures = 0;
        KeyWordFailures = new ArrayList<>();
        double[][] data = new double[(maxKeyLength-minKeyLength)+1][];
        int indexOfData = 0;
        for (int keyLength = minKeyLength; keyLength <= maxKeyLength; keyLength+=keyLengthStep) {
            int indexOfTimes = 0;
            double[] timesAtTextLengthL_KeyLengthK = new double[(((maxTextLength-minTextLength))/TextLengthStep)+1];
            for (int textLength = minTextLength; textLength <= maxTextLength; textLength+=TextLengthStep) {
                long sum = 0;
                for (int repetition = 0; repetition < repetitions; repetition++) {
                    int randomIndex = random.nextInt(bigExampleString.length() - textLength);
                    //build string of specified size
                    StringBuilder sb = new StringBuilder();
                    for (int repeat = randomIndex; repeat < randomIndex + textLength; repeat++) {sb.append(charArrayForm[repeat]);}
                    String text = sb.toString();
//                    Integer[] values = (Integer[]) central.values().toArray();
//                    Integer randomValue = values[random.nextInt(values.length)];
                    String[] words = charSet.ObjectArrayToStringArray(central.keySet().toArray());
                    String randomWord = charSet.guessAndCheckFind(words, keyLength, random);
//                    System.out.println(text);
//                    System.out.println(keyLength);
//                    System.out.println(randomWord);
                    VigenereCipher vigenereCipher = new VigenereCipher(text.toUpperCase(), randomWord);
                    Time time = new Time();
                    VigenereStatisticsAttacker vsa = new VigenereStatisticsAttacker(vigenereCipher.get(), keyLength);
                    if (vsa.isSolved()){
                        time.end();
                        String vsaKeyWord = vsa.getKeyWord();
                        boolean foundKeyWordFully = vsaKeyWord.equalsIgnoreCase(randomWord);
//                        System.out.println(foundKeyWordFully + " " + vsaKeyWord + " "+randomWord);
                        sum+=time.getDuration();
                        if (!foundKeyWordFully){
                            NumKeyWordFailures++;
                            ArrayList<String> set = new ArrayList<>();
                            set.add(vsaKeyWord);
                            set.add(randomWord);
                            KeyWordFailures.add(set);
                            if (vsaKeyWord.contains(String.valueOf('\u0000'))){
                                NumNullCharInKeyWordFailures++;
                            }
                        }
                    }
                    else {
                        time.end();
                        NumFailures++;
                        Failures.add(randomWord);
                    }
                }
                double avg = (sum/(double)repetitions);
                timesAtTextLengthL_KeyLengthK[indexOfTimes] = avg/1000000000.0;
                indexOfTimes++;
//                System.out.println("finished Key Length\s"+keyLength+"\sText Length\s"+textLength);
            }
            data[indexOfData] = timesAtTextLengthL_KeyLengthK;
            indexOfData++;
            System.out.println("finished Key Length\s"+keyLength);
        }
        Data = data;
    }

    public double[][] getData() {return Data;}
    public ArrayList<String> getFailures() {return Failures;}
    public int getNumFailures() {return NumFailures;}
    public int getNumNullCharInKeyWordFailures() {return NumNullCharInKeyWordFailures;}

    public ArrayList<ArrayList<String>> getKeyWordFailures() {return KeyWordFailures;}
    public int getNumKeyWordFailures() {return NumKeyWordFailures;}

    public static void main(String[] args) throws InterruptedException {
        int repetitions = 1;//a higher number makes the data less skewed by taking the average of [repetitions] tests.
        int minKeyLength = 2;
        int maxKeyLength = 12;
        int keyLengthStep = 1;
        int minTextLength = 1200;
        int maxTextLength = 5200;
        int TextLengthStep = 100;
        int numLoops = (((maxKeyLength-minKeyLength)/keyLengthStep)+1)*(((maxTextLength-minTextLength)/TextLengthStep)+1)*repetitions;
        System.out.println(numLoops);
        double predictedTimeInSeconds = (double)numLoops/(3564/((205.83345134+217.489093445+174.865482001+174.214293+256+233.599851735+215.751693035)/7));
        System.out.println("Time in seconds predicted: "+predictedTimeInSeconds+" = "+predictedTimeInSeconds/60.0+" minutes");
        Time time = new Time();
        TestVigenereStatsAttackFindTimeExpenseVSTextAndKeyLength test = new TestVigenereStatsAttackFindTimeExpenseVSTextAndKeyLength(
                repetitions, minKeyLength, maxKeyLength, keyLengthStep, minTextLength, maxTextLength, TextLengthStep);
        time.end();
        double[][] data = test.getData();
        for (double[] line:data){
            for (double d:line){
                System.out.println(d);
            }
            System.out.println("\n\n\n__________\n\n\n");
        }
        ArrayList<ArrayList<String>> failureSets = test.getKeyWordFailures();
        for (ArrayList<String> failureSet : failureSets) {
            String wrong = failureSet.get(0);
            String actual = failureSet.get(1);
            System.out.println(wrong+" "+actual);
        }
        System.out.println("Total Failures: "+test.getNumKeyWordFailures());
        System.out.println("Of which contain null char: "+ test.getNumNullCharInKeyWordFailures());
        System.out.println("Of which do not contain null char: "+ (test.getNumKeyWordFailures()-test.getNumNullCharInKeyWordFailures()));
        System.out.println("numLoops: "+numLoops);
        time.println();
    }
}
