package sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordOccurrenceWriter {
    private static CharSet charSet = new CharSet();
    public static void main(String[] args) throws IOException {
        Unique_Words_Accumulator acc = new Unique_Words_Accumulator();
        ArrayList<String> reservoir = new ArrayList<>();
        Scanner scanner = new Scanner(charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir());
        while (scanner.hasNext()){
            reservoir.add(scanner.next());
        }
        System.out.println("from WordOccurrenceWriter.java  SortingAttribute.countFrequencyIn");
        ArrayList<SortingAttribute> a = SortingAttribute.countFrequencyIn(reservoir,acc.get(), false);
        System.out.println("from WordOccurrenceWriter.java  SortingAttribute.MOST_TO_LEAST");
        ArrayList<SortingAttribute> b = SortingAttribute.MOST_TO_LEAST(a);
        SortingAttribute.println(b, acc.get());
    }
}
