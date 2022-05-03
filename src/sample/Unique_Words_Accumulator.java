package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Unique_Words_Accumulator {
    private final char[] ignorers = new CharSet().getIgnorers();
    private ArrayList<String> unique_words;
    private ArrayList<ArrayList<Integer>> Coordinates;
    private final CharSet charSet = new CharSet(true);

    public Unique_Words_Accumulator() throws IOException {
        this(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"));
    }
    public Unique_Words_Accumulator(File file) throws FileNotFoundException {
        System.err.println("new Unique_Words_Accumulator("+file+");");
        ArrayList<ArrayList<Integer>>coordinates = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        ArrayList<String> all = new ArrayList<>();
        while (scanner.hasNext()){
            all.add(scanner.next());
        }
        ArrayList<String> unique = new ArrayList<>();
        int numWordsChecked = 0;
        for (String string: all) {
            if (string!=null){
                numWordsChecked++;
            }
            String word = format(string);
            if (!unique.contains(word)){
                unique.add(word);
                ArrayList<Integer> add = new ArrayList<>();
                add.add(numWordsChecked);
                add.add(unique.size());
                coordinates.add(add);
            }
        }
        Coordinates = coordinates;
        unique_words = unique;
    }
    private String format(String string){
        for (char ignorer: ignorers) {
            if (string.contains(String.valueOf(ignorer))){
                string = "";
                break;
            }
        }
        return string;
    }
    public ArrayList<String> get(){return unique_words;}
    public ArrayList<ArrayList<Integer>> getCoordinates(){return Coordinates;}

    public static void main(String[] args) throws IOException {
    }
//    private static void getLanguage(File reservoir) throws FileNotFoundException {
//        Unique_Words_Accumulator acc = new Unique_Words_Accumulator(reservoir);
//        ArrayList<String> got = acc.get();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < got.size()-1; i++) {
//            sb.append("\"").append(got.get(i)).append("\",\s");
//        }
//        sb.append("\"").append(got.get(got.size() - 1)).append("\"");
//        System.out.println(sb.toString());
//    }
//    private static void getFrench() throws FileNotFoundException {
//        getLanguage(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/FrenchReservoir.txt"));
//    }
//    private static void getSpanish() throws FileNotFoundException {
//        getLanguage(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/SpanishReservoir.txt"));
//    }
}
