package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Unique_Words_Accumulator {

    private ArrayList<String> unique_words;
    private ArrayList<ArrayList<Integer>> Coordinates;
    private CharSet charSet;
    public Unique_Words_Accumulator(File file) throws IOException {
        this(file, false, new CharSet(2));
    }
    public Unique_Words_Accumulator() throws IOException {
        this(new File("src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"), false, new CharSet(2));
    }
    public Unique_Words_Accumulator(File file, boolean ignoreCase, CharSet char_Set) throws FileNotFoundException {
        System.err.println("new Unique_Words_Accumulator("+file+");");
        charSet = char_Set;
        ArrayList<String> all = charSet.fileToArrayListOfStrings(file);
        ArrayList<String> formatted = new ArrayList<>();
        for (String s:all){formatted.add(format(s, ignoreCase));}
        HashSet<String> uniqueWords = new HashSet<String>(formatted);
        unique_words = new ArrayList<>();
        unique_words.addAll(uniqueWords);

//        ArrayList<ArrayList<Integer>>coordinates = new ArrayList<>();
//        Scanner scanner = new Scanner(file);
//        ArrayList<String> all = new ArrayList<>();
//        while (scanner.hasNext()){
//            all.add(scanner.next());
//        }
//        System.out.println(all.size());
//        ArrayList<String> unique = new ArrayList<>();
//        int numWordsChecked = 0;
////        int count = 0;
//        for (String string: all) {
//            if (string!=null){
//                numWordsChecked++;
//            }
//            String w = string;
//            if (ignoreCase){
//                w = string.toLowerCase();
//            }
//            String word = format(w);
//            if (!unique.contains(word)){
////                count++;
////                if (count%1000 ==0){
////                    System.out.println(count);
////                }
//                unique.add(word);
//                ArrayList<Integer> add = new ArrayList<>();
//                add.add(numWordsChecked);
//                add.add(unique.size());
//                coordinates.add(add);
//            }
//        }
//        Coordinates = coordinates;
//        unique_words = unique;
//        System.out.println(unique_words.size());
    }
    private String format(String string, boolean ignoreCase){
        string = charSet.RemoveIgnorers(string);
        for (int i = 0; i < string.length(); i++) {
            if (charSet.isAccented(string.charAt(i))){
                string = string.replaceAll(String.valueOf(string.charAt(i)), String.valueOf(charSet.unAccent(string.charAt(i))));
            }
        }
        if (ignoreCase){string = string.toLowerCase();}
        return string;
//        for (char ignorer: ignorers) {
//            if (string.contains(String.valueOf(ignorer))){
//                //2022/4/9 commented out string = ""; break;
//                //2022/4/9 added:
//                String regexPattern = charSet.escapeIgnorers(ignorer);
//                string = string.replaceAll(regexPattern, "");
//            }
//        }
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
//        getLanguage(new File("src/sample/FrenchReservoir.txt"));
//    }
//    private static void getSpanish() throws FileNotFoundException {
//        getLanguage(new File("src/sample/SpanishReservoir.txt"));
//    }
}
