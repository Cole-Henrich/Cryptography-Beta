package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContractionsInEmperor{
    private File book;
    private ArrayList<String> accumulator;
    private ArrayList<String> uniques;
    private ArrayList<String> c;
    private int[] counts;
    int num = 0;
    int num2 = 0;
    public ContractionsInEmperor() throws FileNotFoundException {
        book = new File("/Users/cole.henrich/Downloads/Digital-Libraries/When-The-Emperor-Was-Divine/index.txt");
        this.accumulator = A();
        this.uniques = B();
        this.counts = count();
        this.c = C();
        System.out.println(accumulator);
        System.out.println(uniques);
        System.out.println(c);
        System.out.println(stats());
        System.out.println(num);
        System.out.println(num2);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new ContractionsInEmperor();
    }
    public ArrayList<String>C(){
        ArrayList<String> words = new ArrayList<>();
        ArrayList<SortingAttribute> A = gatherAttributes();
        ArrayList<SortingAttribute>sorted = SortingAttribute.LEAST_TO_MOST(A);
        for (SortingAttribute sortingAttribute : sorted){
            words.add(accumulator.get(sortingAttribute.getIndex()));
        }
        return words;
    }
    public ArrayList<String> stats(){
        System.err.println("stats()");
        ArrayList<String> stats = new ArrayList<>();
        ArrayList<SortingAttribute> A = gatherAttributes();
        ArrayList<SortingAttribute>sorted = SortingAttribute.LEAST_TO_MOST(A);
        for (SortingAttribute sortingAttribute : sorted) {
            int occ = sortingAttribute.getOccurrences();
            int index = sortingAttribute.getIndex();
            stats.add("index: "+ index + " occurrences: " + occ + " word: " + accumulator.get(index) + "\n");
        }
        return stats;
    }
    private ArrayList<SortingAttribute> gatherAttributes(){
        System.err.println("gatherAttributes()");
        ArrayList<SortingAttribute> sortingAttributes = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            sortingAttributes.add(new SortingAttribute(i, counts[i]));
        }
        return sortingAttributes;
    }
    private int[] count() throws FileNotFoundException {
        System.err.println("count()");
        int[] Counts = new int[accumulator.size()];
        Scanner rankScanner = new Scanner(book);
        while (rankScanner.hasNext()){
            String next = rankScanner.next();
            String toLower = next.toLowerCase();
            for (int i = 0; i < accumulator.size(); i++) {
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
    private ArrayList<String> B(){
        ArrayList<String> B = new ArrayList<>();
        for (String s : accumulator) {
            if (!B.contains(s)) {
                num2++;
                B.add(s);
            }
        }
        return B;
    }
    private ArrayList<String> A() throws FileNotFoundException {
        ArrayList<String> A = new ArrayList<>();
        Scanner sc = new Scanner(book);
        while (sc.hasNext()){
            String next = (new CharSet().removeIgnorers(sc.next(), new String[]{"’"}));
            if (next.contains("’")){
                System.err.println(next);
                A.add(next);
                num++;
            }
        }
        return A;
    }
}


