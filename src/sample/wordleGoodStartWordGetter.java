package sample;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class wordleGoodStartWordGetter {
    public wordleGoodStartWordGetter(int length) throws FileNotFoundException {
        CharSet charSet = new CharSet();
        System.out.println("oaten is the best start word");
        ArrayList<String> all = new ArrayList<>();
        Scanner scanner = new Scanner(charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir());
        while (scanner.hasNext()){
            String next = scanner.next();
            int n = 0;
            if (length == 3) {n=1;}
            if (length == 4) {n=2;}
            if (length == 5) {n=4;}
            if (length == 6) {n=5;}
            if (length == 7) {n=5;}
            if (next.length() == length && charSet.containsAtLeastNOf(next, n, new String[]
                    {"e","t","a","o","n","i", "s", "h", "r", "d", "l"}
            )) {
                all.add(next);
            }
        }
        ArrayList<String> uniques = new ArrayList<>();
        for (String s : all) {
            if (!uniques.contains(s)) {
                uniques.add(s);
            }
        }
        System.out.println(uniques);
    }
    public static void main(String[] args) throws FileNotFoundException {
        new wordleGoodStartWordGetter(6);
    }
}
