package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class etao {
    private String mostFrequentToLeast;
    private final CharSet charSet = new CharSet();
    private final String[] alphabet = charSet.charToStringArray(charSet.getAlphabet());
    private int[] occurrences;
    private File reservoir;
    private ArrayList<SortingAttribute> LettersAndTheirOccurrences;
    private ArrayList<SortingAttribute> sorted;
    public etao(File Reservoir, boolean time) throws FileNotFoundException {
        long start = System.nanoTime();
        this.reservoir = Reservoir;
        this.occurrences = count();
        this.LettersAndTheirOccurrences = combineLetterDataAndOccurrenceData();
        this.sorted = SortingAttribute.MOST_TO_LEAST(this.LettersAndTheirOccurrences);
        StringBuilder sb = new StringBuilder();
        for (SortingAttribute sortingAttribute : sorted) {
            String letter = alphabet[sortingAttribute.getIndex()];
            System.out.println(letter+" "+sortingAttribute.getOccurrences());
            sb.append(letter);
        }
        this.mostFrequentToLeast = sb.toString();
        System.out.println(mostFrequentToLeast);
        long end = System.nanoTime();
        long duration = end-start;
        if (time){
            System.out.println("duration, nanoseconds: "+duration);
            System.out.println("duration, seconds: "+duration/Math.pow(10,9));
        }
    }
    private ArrayList<SortingAttribute> combineLetterDataAndOccurrenceData(){
        ArrayList<SortingAttribute>lettersAndTheirOccurrences = new ArrayList<>();
        for (int i = 0; i < alphabet.length; i++) {
            lettersAndTheirOccurrences.add(new SortingAttribute(i, occurrences[i]));
        }
        return lettersAndTheirOccurrences;
    }
    private int[] count() throws FileNotFoundException {
        int[] Occurrences = new int[alphabet.length];
        for (int a = 0; a < alphabet.length; a++) {
            String b = alphabet[a];
            int count = 0;
            Scanner scanner = new Scanner(reservoir);
            while (scanner.hasNext()){
                String next = scanner.next();
                for (int c = 0; c < next.length(); c++) {
                    String d = String.valueOf(next.charAt(c));
                    if (b.equalsIgnoreCase(d)){
                        count++;
                    }
                }
            }
            Occurrences[a]=count;
        }
        return Occurrences;
    }
    public etao(boolean count) throws FileNotFoundException {
        this(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"), count);
    }
    public etao(File file) throws FileNotFoundException {
        this(file, true);
    }
    public etao() throws FileNotFoundException {
        this(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"), true);
    }

    public String get(){
        return mostFrequentToLeast;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new etao();
    }
}
