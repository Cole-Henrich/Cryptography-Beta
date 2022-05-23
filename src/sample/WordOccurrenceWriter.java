package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordOccurrenceWriter {
    private static CharSet charSet = new CharSet();
    private long durationOfCountAndSort;
    private long totalDuration;
    public WordOccurrenceWriter(File textReservoir, File[] WordAndOccurrenceStores, File BigWordAndOccurrenceStore) throws IOException {
        writeToWordAndOccurrenceStores(textReservoir, WordAndOccurrenceStores);
        writeToBigWordAndOccurrenceStore(WordAndOccurrenceStores, BigWordAndOccurrenceStore);
    }

    private void writeToBigWordAndOccurrenceStore(File[] wordAndOccurrenceStores, File bigWordAndOccurrenceStore) throws IOException {
        String example = """
                package sample;

                import java.util.ArrayList;
                import java.util.Collections;
                import java.util.Map;

                public class BigWordAndOccurrenceStore {

                    private ArrayList<Map<String, Integer>> central;
                    public BigWordAndOccurrenceStore(){
                        WordAndOccurrenceStore1 ws1 = new WordAndOccurrenceStore1();
                        Map<String, Integer> _1 = ws1.get();
                        WordAndOccurrenceStore2 ws2 = new WordAndOccurrenceStore2();
                        Map<String, Integer> _2 = ws2.get();
                        central = new ArrayList<>();
                        ArrayList<Map<String, Integer>> a = new ArrayList<>();
                        a.add(_1);
                        a.add(_2);

                        for (Map<String, Integer> b: a) {
                            Collections.addAll(central, b);
                        }
                    }
                    public ArrayList<Map<String, Integer>> central(){return central;}
                }""";
        StringBuilder sb = new StringBuilder();
        sb.append("""
                package sample;

                import java.util.ArrayList;
                import java.util.Collections;
                import java.util.Map;

                public class BigWordAndOccurrenceStore {

                    private ArrayList<Map<String, Integer>> central;
                    public BigWordAndOccurrenceStore(){
                        
                    """);
        String waso = "WordAndOccurrenceStore";
        String ms = "Map<String, Integer>\s";
        for (int i = 0; i < wordAndOccurrenceStores.length; i++) {
            if (wordAndOccurrenceStores[i] != null) {
                sb.append("\t\t"+waso + (i + 1) + "\sws" + (i + 1) + "\s=\snew\s" + waso + (i + 1) + "();\n");
                sb.append("\t\t"+ms + "_" + (i + 1) + "\s=\sws" + (i + 1) + ".get();\n");
            }
        }
        sb.append("""
                \t\tcentral = new ArrayList<>();
                \t\tArrayList<Map<String, Integer>> a = new ArrayList<>();
                """);
        for (int i = 0; i < wordAndOccurrenceStores.length; i++) {
            sb.append("\t\ta.add(_" + (i + 1) + ");\n");
        }
        sb.append("""
                        for (Map<String, Integer> b: a) {
                            Collections.addAll(central, b);
                        }
                    }
                    public ArrayList<Map<String, Integer>> central(){return central;}
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
                import java.util.HashMap;
                                
                public class WordAndOccurrenceStore1 {
                    private static HashMap<String, Integer> map;
                    public WordAndOccurrenceStore1(){
                        map = new HashMap<String, Integer>();
                        map.put("k", 1);
                    }
                    public static HashMap<String, Integer> get(){return map;}
                }""";
        int fileIndex = 0;
        FileWriter fileWriter = new FileWriter(WordAndOccurrenceStores[fileIndex]);
        fileWriter.write("package sample;\n" +
                "                import java.util.HashMap;\n" +
                "                                \n" +
                "                public class WordAndOccurrenceStore"+(fileIndex+1)+"{\n" +
                "                    private static HashMap<String, Integer> map;\n" +
                "                    public WordAndOccurrenceStore"+(fileIndex+1)+"(){\n" +
                "                    map = new HashMap<String, Integer>();\n");
        ArrayList<Sortable> b1 = new ArrayList<>();
        Map map = charSet.countFrequencyIn(new FileToArrayListOfFormattedStrings(textReservoir).get());
        map.forEach((k, v) -> {
            b1.add(new Sortable((String) k, (int) v));
        });
        ArrayList<Sortable> b = Sortable.MOST_TO_LEAST(b1);

        for (int i = 0; i < b.size()-1; i++) {
            Sortable sortable = b.get(i);
            fileWriter.append("map.put(\"").append(charSet.format(sortable.getString())).append("\",").append(String.valueOf(sortable.getOccurrences())).append(");\n");
            if (WordAndOccurrenceStores[fileIndex].length() > 63000) {
                Sortable nextSortable = b.get(i + 1);
                fileWriter.append("map.put(\"").append(charSet.format(nextSortable.getString())).append("\",").append(String.valueOf(nextSortable.getOccurrences())).append(");\n");
                fileWriter.append("}\n public static HashMap<String, Integer> get(){return map;}\n}");
                fileWriter.close();
                if (fileIndex < WordAndOccurrenceStores.length) {
                    fileIndex++;
                    fileWriter = new FileWriter(WordAndOccurrenceStores[fileIndex]);
                    fileWriter.write("package sample;\n" +
                            "                import java.util.HashMap;\n" +
                            "                                \n" +
                            "                public class WordAndOccurrenceStore"+(fileIndex+1)+"{\n" +
                            "                    private static HashMap<String, Integer> map;\n" +
                            "                    public WordAndOccurrenceStore"+(fileIndex+1)+"(){" +
                            "                    map = new HashMap<String, Integer>();");
                }
            }
        }
        Sortable lastSortable = b.get(b.size() - 1);
        if (!b.isEmpty()) {
            fileWriter.append("map.put(\"").append(charSet.format(lastSortable.getString())).append("\",").append(String.valueOf(lastSortable.getOccurrences())).append(");\n");
            fileWriter.append("}\n public static HashMap<String, Integer> get(){return map;}\n}");
        }
        fileWriter.close();
        totalTime.end();
        totalDuration = totalTime.getDuration();
    }
    public static void main(String[] args) throws IOException {
        File test = new File("sample/test.txt");
        File actual = charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir();
        File[] WordAndOccurrenceStores = new File[]{
                new File("sample/WordAndOccurrenceStore1.java"),
                new File("sample/WordAndOccurrenceStore2.java"),
                new File("sample/WordAndOccurrenceStore3.java"),
                new File("sample/WordAndOccurrenceStore4.java"),
                new File("sample/WordAndOccurrenceStore5.java"),
                new File("sample/WordAndOccurrenceStore6.java"),
                new File("sample/WordAndOccurrenceStore7.java"),
                new File("sample/WordAndOccurrenceStore8.java"),
                new File("sample/WordAndOccurrenceStore9.java"),
                new File("sample/WordAndOccurrenceStore10.java"),
                new File("sample/WordAndOccurrenceStore11.java"),
                new File("sample/WordAndOccurrenceStore12.java"),
                new File("sample/WordAndOccurrenceStore13.java"),
                new File("sample/WordAndOccurrenceStore14.java"),
                new File("sample/WordAndOccurrenceStore15.java"),
                new File("sample/WordAndOccurrenceStore16.java"),
                new File("sample/WordAndOccurrenceStore17.java"),
                new File("sample/WordAndOccurrenceStore18.java"),
                new File("sample/WordAndOccurrenceStore19.java"),
                new File("sample/WordAndOccurrenceStore20.java"),
                new File("sample/WordAndOccurrenceStore21.java"),
                new File("sample/WordAndOccurrenceStore22.java"),
                new File("sample/WordAndOccurrenceStore23.java")
        };
        File BigWordAndOccurrenceStore = new File("sample/BigWordAndOccurrenceStore.java");
        Time time = new Time();
        WordOccurrenceWriter wow = new WordOccurrenceWriter(actual, WordAndOccurrenceStores, BigWordAndOccurrenceStore);
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
//                new File("sample/WordAndOccurrenceStore1.java")
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
