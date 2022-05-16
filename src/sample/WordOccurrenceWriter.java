package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordOccurrenceWriter {
    private static CharSet charSet = new CharSet();
    private long durationOfCountAndSort;
    private long totalDuration;
    public WordOccurrenceWriter(File textReservoir, File[] WordAndOccurrenceStores) throws IOException {
        Time totalTime = new Time();
        Unique_Words_Accumulator acc = new Unique_Words_Accumulator(textReservoir, true);
        ArrayList<String> got = acc.get();
        ArrayList<String> reservoir = new ArrayList<>();
        Scanner scanner = new Scanner(textReservoir);
        while (scanner.hasNext()){
            reservoir.add(scanner.next());
        }
        Time countAndSortTime = new Time();
        System.out.println("from WordOccurrenceWriter.java  SortingAttribute.countFrequencyIn");
        ArrayList<SortingAttribute> a = SortingAttribute.countFrequencyIn(reservoir,acc.get(), false);
        System.out.println("from WordOccurrenceWriter.java  SortingAttribute.MOST_TO_LEAST");
        ArrayList<SortingAttribute> b = SortingAttribute.MOST_TO_LEAST(a);
        countAndSortTime.end();
        durationOfCountAndSort = countAndSortTime.getDuration();
//        System.out.println(SortingAttribute.println(b, got));
//        System.out.println(got.get(b.get(0).getIndex()) + " "+ b.get(0).getOccurrences());
        totalTime.end();
        totalDuration = totalTime.getDuration();
        int fileIndex = 0;
        FileWriter fileWriter = new FileWriter(WordAndOccurrenceStores[fileIndex]);
        fileWriter.write("package sample;\n" +
                "                                \n" +
                "                public class WordAndOccurrenceStore"+(fileIndex+1)+" extends WordAndOccurrenceStore {\n" +
                "                    public WordAndOccurrenceStore"+(fileIndex+1)+"() {\n" +
                "                        super(new a[]{");
        for (int i = 0; i < b.size()-1; i++) {
            SortingAttribute sa1 = b.get(i);
            fileWriter.append("new a(\"").append(got.get(sa1.getIndex())).append("\",").append(String.valueOf(sa1.getOccurrences())).append("),");
            if (WordAndOccurrenceStores[fileIndex].length() > 60000) {
                fileWriter.append("new a(\"").append(got.get(b.get(i+1).getIndex())).append("\",").append(String.valueOf(b.get(i+1).getOccurrences())).append(")");
                fileWriter.append("});}}");
                fileWriter.close();
                if (fileIndex < 18) {
                    fileIndex++;
                    fileWriter = new FileWriter(WordAndOccurrenceStores[fileIndex]);
                    fileWriter.write("package sample;\n" +
                            "                                \n" +
                            "                public class WordAndOccurrenceStore"+(fileIndex + 1) + " extends WordAndOccurrenceStore {\n" +
                            "                    public WordAndOccurrenceStore"+(fileIndex + 1) + "() {\n" +
                            "                        super(new a[]{");
                }
            }
        }
        if (!b.isEmpty()) {fileWriter.append("new a(\"").append(got.get(b.get(b.size() - 1).getIndex())).append("\",").append(String.valueOf(b.get(b.size() - 1).getOccurrences())).append(")");}
        fileWriter.append("});}}");
        fileWriter.close();

    }
    public static void main(String[] args) throws IOException {
        File test = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/test.txt");
        File actual = charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir();
        WordOccurrenceWriter wow = new WordOccurrenceWriter(test, new File[]{new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/WordAndOccurrenceStore1.java")});
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
