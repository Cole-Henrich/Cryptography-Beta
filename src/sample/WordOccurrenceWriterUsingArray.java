package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordOccurrenceWriterUsingArray {
    private static CharSet charSet = new CharSet();
    private long durationOfCountAndSort;
    private long totalDuration;
    String waosa = "WordAndOccurrenceStoreArray";

    public WordOccurrenceWriterUsingArray(File textReservoir, File[] WordAndOccurrenceStores, File BigWordAndOccurrenceStore) throws IOException {
        writeToWordAndOccurrenceStores(textReservoir, WordAndOccurrenceStores);
        writeToBigWordAndOccurrenceStore(WordAndOccurrenceStores, BigWordAndOccurrenceStore);
    }

    private void writeToBigWordAndOccurrenceStore(File[] wordAndOccurrenceStores, File bigWordAndOccurrenceStore) throws IOException {
        String example = """
                package sample;
                                
                import java.util.ArrayList;
                import java.util.Collections;
                                
                public class BigWordAndOccurrenceStoreArray {
                                
                    private ArrayList<a> central;
                    public BigWordAndOccurrenceStoreArray(){
                        WordAndOccurrenceStoreArray1 ws1 = new WordAndOccurrenceStoreArray1();
                        a[] _1 = ws1.get();
                        WordAndOccurrenceStoreArray1 ws2 = new WordAndOccurrenceStoreArray1();
                        a[] _2 = ws2.get();
                        central = new ArrayList<>();
                        ArrayList<a[]> a = new ArrayList<>();
                        a.add(_1);
                        a.add(_2);
                                
                        for (a[] b: a) {
                            Collections.addAll(central, b);
                        }
                    }
                    public ArrayList<a> central(){return central;}
                }""";
        StringBuilder sb = new StringBuilder();
        sb.append("""
                package sample;

                import java.util.ArrayList;
                import java.util.Collections;

                public class BigWordAndOccurrenceStoreArray {

                    private ArrayList<a> central;
                    public BigWordAndOccurrenceStoreArray(){
                """);

        for (int i = 0; i < wordAndOccurrenceStores.length; i++) {
            if (wordAndOccurrenceStores[i] != null) {
                sb.append("\t\t"+ waosa + (i + 1) + "\sws" + (i + 1) + "\s=\snew\s" + waosa + (i + 1) + "();\n");
                sb.append("\t\ta[]\s"+"_" + (i + 1) + "\s=\sws" + (i + 1) + ".get();\n");
            }
        }
        sb.append("""
                \t\tcentral = new ArrayList<>();
                \t\tArrayList<a[]> a = new ArrayList<>();
                """);
        for (int i = 0; i < wordAndOccurrenceStores.length; i++) {
            sb.append("\t\ta.add(_" + (i + 1) + ");\n");
        }
        sb.append("""
                        for (a[] b: a) {
                            Collections.addAll(central, b);
                        }
                    }
                    public ArrayList<a> central(){return central;}
                }
                """);
        FileWriter fileWriter = new FileWriter(bigWordAndOccurrenceStore);
        fileWriter.write(sb.toString());
        fileWriter.close();
    }
    private void writeToWordAndOccurrenceStores(File textReservoir, File[] WordAndOccurrenceStores) throws IOException {
        Time totalTime = new Time();
//        Unique_Words_Accumulator acc = new Unique_Words_Accumulator(textReservoir, true, new CharSet(1));
//        ArrayList<String> got = acc.get();
//        ArrayList<String> reservoir = new ArrayList<>();
//        Scanner scanner = new Scanner(textReservoir);
//        while (scanner.hasNext()){
//            String next = scanner.next();
//            reservoir.add(next);
//        }
        Time countAndSortTime = new Time();

        countAndSortTime.end();
        durationOfCountAndSort = countAndSortTime.getDuration();
//        System.out.println(SortingAttribute.println(b, got));
//        System.out.println(got.get(b.get(0).getIndex()) + " "+ b.get(0).getOccurrences());

        String example = """
                package sample;
                                
                public class WordAndOccurrenceStoreArray1 extends WordAndOccurrenceStoreArray {
                    public WordAndOccurrenceStoreArray1(){
                        super(new a[]{});
                    }
                }
                """;
        int fileIndex = 0;
        FileWriter fileWriter = new FileWriter(WordAndOccurrenceStores[fileIndex]);
        fileWriter.write("package sample;\n" +
                "                                \n" +
                "                public class\s"+ waosa +(fileIndex+1)+"\sextends\s"+ waosa +"{\n" +
                "                    public\s"+ waosa +(fileIndex+1)+"(){\n" +
                "                        super(new a[]{");
        ArrayList<Sortable> b1 = new ArrayList<>();
        Map map = charSet.countFrequencyIn(new FileToArrayListOfFormattedStrings(textReservoir).get());
        map.forEach((k, v) -> {
            b1.add(new Sortable((String) k, (int) v));
        });
        ArrayList<Sortable> b = Sortable.MOST_TO_LEAST(b1);

        for (int i = 0; i < b.size()-1; i++) {
            Sortable sortable = b.get(i);
            fileWriter.append("new a(\"").append(charSet.format(sortable.getString())).append("\",").append(String.valueOf(sortable.getOccurrences())).append("),\n");
            if (WordAndOccurrenceStores[fileIndex].length() > 63000) {
                Sortable nextSortable = b.get(i + 1);
                fileWriter.append("new a(\"").append(charSet.format(nextSortable.getString())).append("\",").append(String.valueOf(nextSortable.getOccurrences())).append(")\n");
                fileWriter.append("});}}");
                fileWriter.close();
                if (fileIndex < WordAndOccurrenceStores.length) {
                    fileIndex++;
                    fileWriter = new FileWriter(WordAndOccurrenceStores[fileIndex]);
                    fileWriter.write("package sample;\n" +
                            "                                \n" +
                            "                public class\s"+ waosa +(fileIndex+1)+"\sextends\s"+ waosa +"{\n" +
                            "                    public\s"+ waosa +(fileIndex+1)+"(){\n" +
                            "                        super(new a[]{");
                }
            }
        }
        Sortable lastSortable = b.get(b.size() - 1);
        if (!b.isEmpty()) {
            fileWriter.append("new a(\"").append(charSet.format(lastSortable.getString())).append("\",").append(String.valueOf(lastSortable.getOccurrences())).append(")\n");
            fileWriter.append("});}}");
        }
        fileWriter.close();
        totalTime.end();
        totalDuration = totalTime.getDuration();
    }
    public static void main(String[] args) throws IOException {
        File test = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/test.txt");
        File actual = charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir();
        File[] WordAndOccurrenceStoresUsingArrays = new File[]{
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray1.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray2.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray3.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray4.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray5.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray6.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray7.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray8.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray9.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray10.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray11.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray12.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray13.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray14.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray15.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray16.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray17.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray18.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray19.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray20.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray21.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray22.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStoreArray23.java")
        };
        File BigWordAndOccurrenceStoreArray = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/BigWordAndOccurrenceStoreArray.java");
        Time time = new Time();
        WordOccurrenceWriterUsingArray wowua = new WordOccurrenceWriterUsingArray(actual, WordAndOccurrenceStoresUsingArrays, BigWordAndOccurrenceStoreArray);
        time.end();
        time.println();
//        Unique_Words_Accumulator acc = new Unique_Words_Accumulator(test, true);
//        ArrayList<String> got = acc.get();
//        ArrayList<String> reservoir = new ArrayList<>();
//        Scanner scanner = new Scanner(test);
//        while (scanner.hasNext()){
//            reservoir.add(scanner.next());
//        }
//        System.out.println("from WordOccurrenceWriter.java  SortingAttribute.countFrequencyIn");
//        ArrayList<SortingAttribute> a = SortingAttribute.countFrequencyIn(reservoir,acc.get(), false);
//        System.out.println("from WordOccurrenceWriter.java  SortingAttribute.MOST_TO_LEAST");
//        ArrayList<SortingAttribute> b = SortingAttribute.MOST_TO_LEAST(a);
////        System.out.println(SortingAttribute.println(b, got));
////        System.out.println(got.get(b.get(0).getIndex()) + " "+ b.get(0).getOccurrences());
//        File[] files = new File[]{
//                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStore1.java")
//        };
//            int fileIndex = 0;
//            FileWriter fileWriter = new FileWriter(files[fileIndex]);
//            fileWriter.write("package sample;\n" +
//                    "                                \n" +
//                    "                public class WordAndOccurrenceStore"+(fileIndex+1)+" extends WordAndOccurrenceStore {\n" +
//                    "                    public WordAndOccurrenceStore"+(fileIndex+1)+"() {\n" +
//                    "                        super(new a[]{");
//            for (int i = 0; i < b.size()-1; i++) {
//                SortingAttribute sa1 = b.get(i);
//                fileWriter.append("new a(\"").append(got.get(sa1.getIndex())).append("\",").append(String.valueOf(sa1.getOccurrences())).append("),");
//                if (files[fileIndex].length() > 60000) {
//                    fileWriter.append("new a(\"").append(got.get(b.get(i+1).getIndex())).append("\",").append(String.valueOf(b.get(i+1).getOccurrences())).append(")");
//                    fileWriter.append("});}}");
//                    fileWriter.close();
//                    if (fileIndex < 18) {
//                        fileIndex++;
//                        fileWriter = new FileWriter(files[fileIndex]);
//                        fileWriter.write("package sample;\n" +
//                                "                                \n" +
//                                "                public class WordAndOccurrenceStore"+(fileIndex + 1) + " extends WordAndOccurrenceStore {\n" +
//                                "                    public WordAndOccurrenceStore"+(fileIndex + 1) + "() {\n" +
//                                "                        super(new a[]{");
//                    }
//                }
//            }
//        fileWriter.append("new a(\"").append(got.get(b.get(b.size()-1).getIndex())).append("\",").append(String.valueOf(b.get(b.size()-1).getOccurrences())).append(")");
//        fileWriter.append("});}}");
//        fileWriter.close();
//        time.end();
//        time.println();
    }

    public long getDurationOfCountAndSort() {
        return durationOfCountAndSort;
    }
    public long getTotalDuration() {
        return totalDuration;
    }
}
