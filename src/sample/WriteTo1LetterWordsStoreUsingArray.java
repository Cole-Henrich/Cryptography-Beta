package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WriteTo1LetterWordsStoreUsingArray {
    private CharSet charSet = new CharSet();
    private final char[] alphabet = charSet.getAlphabet();
    public WriteTo1LetterWordsStoreUsingArray(File reservoir, File _ArrayStore) throws IOException {
        StringBuilder sb = new StringBuilder("""
                package sample;

                public class _Array_1LetterWordsAndOccurrencesStore extends WordAndOccurrenceStoreArray{
                    public _Array_1LetterWordsAndOccurrencesStore(){
                        super(new a[]{""");

        ArrayList<String> all = charSet.fileToArrayListOfStrings(reservoir);
        ArrayList<String> onlyOnes = new ArrayList<>();
        for (String s : all) {
            if (s.length() == 1) {
                if (Character.isAlphabetic(s.charAt(0))) {
                    onlyOnes.add(s.toLowerCase());
                }
            }
        }
        HashMap<String, Integer> map = charSet.countFrequencyIn(onlyOnes);
        ArrayList<Sortable> finalSortables = new ArrayList<>();
        map.forEach((word, occurrences)->{
           finalSortables.add(new Sortable(word, occurrences));
        });
        ArrayList<Sortable> sortables = Sortable.MOST_TO_LEAST(finalSortables);
        for (Sortable sortable : sortables) {
            String word = sortable.getString();
            int occurrences = sortable.getOccurrences();
            sb.append("new a(\"").append(word).append("\",").append(occurrences).append("),");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("""     
                          
                        });
                    }
                }
                """);
        String write = sb.toString();
        FileWriter fileWriter = new FileWriter(_ArrayStore);
        fileWriter.write(write);
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        new WriteTo1LetterWordsStoreUsingArray(new CharSet().getLanguage_Manipulation_UniqueWords_TrainerReservoir(), new File("src/sample/_Array_1LetterWordsAndOccurrencesStore.java"));
    }
}
