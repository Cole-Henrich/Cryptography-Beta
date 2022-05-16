package sample;

import java.io.*;
import java.util.Scanner;

public class WordOccurrenceWriterSpeedAnalyzer {
    private CharSet charSet = new CharSet();
    public WordOccurrenceWriterSpeedAnalyzer(int start, int step, int max) throws IOException {
        File[] WordAndOccurrenceStores = new File[]{
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStore1.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStore2.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStore3.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStore4.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStore5.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStore6.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStore7.java")
        };
        File r = charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir();

        File res = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/mutableEnglishReservoirForSpeedAnalysis");
        StringBuilder totalTimes = new StringBuilder();
        StringBuilder countAndSortTimes = new StringBuilder();
        for (int i = start; i < max; i+=step) {
            FileWriter fileWriter = new FileWriter(res);
            Scanner scanner = new Scanner(r);
            StringBuilder sb = new StringBuilder();
            int numWords = 0;
            while (scanner.hasNext() && numWords < i){
                sb.append(scanner.next());
                numWords++;
            }
            scanner.close();
            fileWriter.write(sb.toString());
            fileWriter.close();
            WordOccurrenceWriter wow = new WordOccurrenceWriter(res, WordAndOccurrenceStores);
            totalTimes.append(wow.getTotalDuration()).append("\n");
            countAndSortTimes.append(wow.getDurationOfCountAndSort()).append("\n");
            System.out.println(i);
        }
        FileWriter WOWTotalTimeWriter = new FileWriter("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WOWTotalTimes");
        FileWriter WOWCountAndSortTimeWriter = new FileWriter("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WOWCountAndSortTimes");
        WOWTotalTimeWriter.write(totalTimes.toString());
        WOWCountAndSortTimeWriter.write(countAndSortTimes.toString());
        WOWTotalTimeWriter.close();
        WOWCountAndSortTimeWriter.close();
    }
    public WordOccurrenceWriterSpeedAnalyzer() throws IOException {
        this(1, 10000, 500000);
    }

    public static void main(String[] args) throws IOException {
        Time time = new Time();
        new WordOccurrenceWriterSpeedAnalyzer();
        time.end();
        time.println();
    }
}
