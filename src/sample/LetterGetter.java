package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LetterGetter {
    private ArrayList<String> accumulator;
    private File reservoir;
    private int[] counts;
    private CharSet charSet;
    private ArrayList<String> words;
    private int c;
    private String[] notContains;
    private String letter;
    private int topWhat_egTopTen;
    private String[] exceptions;
    private boolean wantsAll;
    public LetterGetter(File Reservoir, String[] notContains, String Letter, int TopWhat_egTopTen, boolean containsEqualsNotContains, String[] exceptionsToRemoveIgnorers) throws FileNotFoundException {
//        System.err.println("new LetterGetter(" + Reservoir.getAbsolutePath()+")");
        this.exceptions = exceptionsToRemoveIgnorers;
        this.topWhat_egTopTen = TopWhat_egTopTen;
        this.letter = Letter;
        this.notContains = notContains;
        charSet = new CharSet();
       this.reservoir = Reservoir;
       this.accumulator = accumulate();
       this.counts = count();
       this.words = getWords();
        if (wantsAll){
            this.topWhat_egTopTen = words.size();
        }
//        if (!this.reservoir.getAbsolutePath().equals("/Users/cole.henrich/Downloads/Digital-Libraries/When-The-Emperor-Was-Divine/index.txt")){
            System.out.println(stats());
            System.out.println(Arrays.toString(sortedIndices(gatherAttributes())));
            System.out.println(new GetStringArrayFormatted(getMostCommon_mostCommonFIRST()).getFormatted());
            System.out.println(new GetStringArrayFormatted(getMostCommon_mostCommonLAST()).getFormatted());
            System.err.println(c);
      //  }
    }

    public ArrayList<String> stats(){
        System.err.println("stats()");
        ArrayList<String> stats = new ArrayList<>();
        ArrayList<SortingAttribute> A = gatherAttributes();
        ArrayList<SortingAttribute>sorted = SortingAttribute.LEAST_TO_MOST(A);
        for (SortingAttribute sortingAttribute : sorted) {
            c++;
            int occ = sortingAttribute.getOccurrences();
            int index = sortingAttribute.getIndex();
            stats.add("index: "+index+ " occurrences: " +occ+ " word: "+accumulator.get(index)+"\n");
        }
        return stats;
    }

    public ArrayList<String>getWords(){
        System.err.println("getWords()");
        ArrayList<String> words = new ArrayList<>();
        ArrayList<SortingAttribute> A = gatherAttributes();
        ArrayList<SortingAttribute>sorted = SortingAttribute.LEAST_TO_MOST(A);
        for (SortingAttribute sortingAttribute : sorted){
            c++;
            words.add(accumulator.get(sortingAttribute.getIndex()));
        }
        return words;
    }
    public String[] getMostCommon_mostCommonLAST(){
        if (wantsAll){
            this.topWhat_egTopTen = words.size();
        }
        System.err.println("getMostCommon_mostCommonLAST("+topWhat_egTopTen+")");
        String[] mostCommon = new String[topWhat_egTopTen];
        for (int i = words.size()-topWhat_egTopTen, j = 0; i < words.size() && j <topWhat_egTopTen; i++, j++) {
            c++;
            mostCommon[j]= words.get(i);
        }
        return mostCommon;
    }
    public String[] getMostCommon_mostCommonFIRST(){
        if (wantsAll){
            this.topWhat_egTopTen = words.size();
        }
        System.err.println("getMostCommon_mostCommonFIRST("+topWhat_egTopTen+")");
        String[] mostCommon = new String[topWhat_egTopTen];
        for (int i = words.size()-topWhat_egTopTen, j = topWhat_egTopTen-1; i < words.size() && j >=0; i++, j--) {
            c++;
            mostCommon[j]= words.get(i);
        }
        return mostCommon;
    }

    private ArrayList<SortingAttribute> gatherAttributes(){
        System.err.println("gatherAttributes()");
        ArrayList<SortingAttribute> sortingAttributes = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            c++;
            sortingAttributes.add(new SortingAttribute(i, counts[i]));
        }
        return sortingAttributes;
    }
    private int[] sortedIndices(ArrayList<SortingAttribute>A){
        System.err.println("sortedIndices()");
        ArrayList<SortingAttribute>a=SortingAttribute.LEAST_TO_MOST(A);
        int[] indices = new int[a.size()];
        for (int i = 0; i < indices.length; i++) {
            c++;
            indices[i]=a.get(i).getIndex();
        }
        return indices;
    }

    private int[] count() throws FileNotFoundException {
        System.err.println("count()");
        int[] Counts = new int[accumulator.size()];
        Scanner rankScanner = new Scanner(reservoir);
        while (rankScanner.hasNext()){
            String next = rankScanner.next();
            String toLower = next.toLowerCase();
            for (int i = 0; i < accumulator.size(); i++) {
                c++;
                String j = accumulator.get(i);
                if (toLower.equalsIgnoreCase(j)){
                    Counts[i]++;
                    System.err.println(j);
                    System.err.println(Counts[i]);
                }
            }
        }
        return Counts;
    }
    private ArrayList<String> accumulate() throws FileNotFoundException {
        System.err.println("accumulate()");
        Scanner accumulatorScanner = new Scanner(reservoir);
        ArrayList<String> Accumulator = new ArrayList<>();
        int count=0;
        while (accumulatorScanner.hasNext()){
            String next = accumulatorScanner.next();
            String toLower = charSet.removeIgnorers(next.toLowerCase(), exceptions);
            c++;
            if (toLower.contains(letter)) {
                if (!contains(toLower, notContains)){
                    if (!Accumulator.contains(toLower)) {
                        count++;
                        System.err.println("added");
                        System.err.println(count);
                        Accumulator.add(toLower);
                    }
                }
            }
        }
        return Accumulator;
    }
    private boolean contains(String string, String[] elements){
        boolean rtn = false;
        for (String element : elements) {
            if (string.contains(element)) {
                rtn = true;
                break;
            }
        }
        return rtn;
    }
    public LetterGetter(String Letter) throws FileNotFoundException {
        this(Letter, new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"));
    }
    public LetterGetter(String Letter, File file) throws FileNotFoundException {
        this(file, new String[]{""}, Letter, 10, true, new String[]{""});
    }
    public LetterGetter(String Letter, String[] notContains) throws FileNotFoundException {
        this(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"), notContains, Letter, 10, true, new String[]{""});
    }
    public LetterGetter(String Letter, String[] notContains, int topWhat_egTopTen) throws FileNotFoundException {
        this(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"), notContains, Letter, topWhat_egTopTen, true, new String[]{""});
    }
    public LetterGetter(String letter, String[] contains, int topWhat_egTopTen, boolean containsEqualsNotContains) throws FileNotFoundException {
        this(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"),new Metamorphose().reverseContains(contains), letter, topWhat_egTopTen, false, new String[]{""});
    }
    public ArrayList<String> getUniques(){
        System.err.println("getUniques()");
        return accumulator;
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.err.println("LetterGetter.main()");
    }
}
