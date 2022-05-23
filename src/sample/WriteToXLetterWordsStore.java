package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WriteToXLetterWordsStore {
    private int WordLength;
    private File[] WordsStores;
    private ArrayList<Sortable> Sortables;
    public WriteToXLetterWordsStore(File[] wordsStores, int wordLength) throws IOException {
        WordsStores = wordsStores;
        WordLength = wordLength;
        Sortables = putIntoSortables();
        writeToFiles();
    }
    private void writeToFiles() throws IOException {
        String example = """
                package sample;
                import java.util.HashMap;
                                
                public class _1LetterWordsStore{
                    private static HashMap<String, Integer> map;
                    public _1LetterWordsStore(){
                        map.put("k",1);
                    }
                    public HashMap<String, Integer> get(){return map;}
                }
                """;
        int FileIndex = 0;
        FileWriter fileWriter = new FileWriter(WordsStores[FileIndex]);
        fileWriter.write("package sample;\n" +
                    "                import java.util.HashMap;\n" +
                    "                                \n" +
                    "                public class _"+WordLength+"LetterWordsStore"+(FileIndex+1)+"{\n" +
                    "                    private static HashMap<String, Integer> map;\n" +
                    "                    public _"+WordLength+"LetterWordsStore"+(FileIndex+1)+"(){" +
                "                        map = new HashMap<>();\n");
        for (int i = 0; i < Sortables.size()-1; i++) {
            Sortable s = Sortables.get(i);
            //System.out.println(s.getString()+"\s"+s.getOccurrences());
            fileWriter.append("map.put(\"" + s.getString() + "\"," + s.getOccurrences() + ");\n");
            if (WordsStores[FileIndex].length() > 63000) {
                //System.out.println(s.getString()+"\s"+s.getOccurrences()+" ALERT!!!");
                fileWriter.append("}\npublic HashMap<String, Integer> get(){return map;}\n}");
                fileWriter.close();
                //System.out.println("1. FileIndex="+FileIndex);
                FileIndex++;
                //System.out.println("2. FileIndex="+FileIndex);
                if (FileIndex < WordsStores.length) {
                    //System.out.println("3. FileIndex="+FileIndex);
                    fileWriter = new FileWriter(WordsStores[FileIndex]);
                    //System.out.println("4. FileIndex="+FileIndex);
                    fileWriter.write("package sample;\n" +
                            "                                \n" +
                            "                public class _" + WordLength + "LetterWordsStore" + (FileIndex+1) + "{\n" +
                            ""+
                            "");
                }
            }
        }
        Sortable sLast = Sortables.get(Sortables.size()-1);
        fileWriter.append("map.put(\"" + sLast.getString() + "\"," + sLast.getOccurrences() + ");\n");
        fileWriter.append("}\npublic HashMap<String, Integer> get(){return map;}\n}");
        fileWriter.close();
    }
//        int FileIndex = 0;
//        while (FileIndex < WordsStores.length){
//            File file = WordsStores[FileIndex];
//            FileWriter fileWriter = new FileWriter(file);
//            fileWriter.write("package sample;\n" +
//                    "                import java.util.HashMap;\n" +
//                    "                                \n" +
//                    "                public class _"+WordLength+"LetterWordsStore"+(FileIndex+1)+"{\n" +
//                    "                    private static HashMap<String, Integer> map;\n" +
//                    "                    public _"+WordLength+"LetterWordsStore"+(FileIndex+1)+"(){");
//            for (Sortable s : Sortables) {
//                fileWriter.append("map.put(\"" + s.getString() + "\"," + s.getOccurrences() + ");\n");
//                if (WordsStores[FileIndex].length() > 63000) {
//                    fileWriter.append("}\npublic static HashMap<String, Integer> get(){return map;}\n}");
//                    fileWriter.close();
//                    FileIndex++;
//                    if (FileIndex < WordsStores.length) {
//                        fileWriter = new FileWriter(WordsStores[FileIndex]);
//                        fileWriter.write("package sample;\n" +
//                                "                import java.util.HashMap;\n" +
//                                "                                \n" +
//                                "                public class _" + WordLength + "LetterWordsStore" + (FileIndex + 1) + "{\n" +
//                                "                    private static HashMap<String, Integer> map;\n" +
//                                "                    public _" + WordLength + "LetterWordsStore" + (FileIndex + 1) + "(){");
//                    }
//                }
//            }
//            fileWriter.append("}\npublic static HashMap<String, Integer> get(){return map;}\n}");
//        }
//        FileWriter fileWriter2 = new FileWriter(WordsStores[WordsStores.length-1]);
//        fileWriter2.append("}\npublic static HashMap<String, Integer> get(){return map;}\n}");

    private ArrayList<Sortable> putIntoSortables(){
        BigWordAndOccurrenceStore big = new BigWordAndOccurrenceStore();
        ArrayList<Map<String, Integer>> central = big.central();
        ArrayList<Sortable> sortables = new ArrayList<>();
        for (Map<String, Integer> map : central) {
            if (map != null) {
                Set<Map.Entry<String, Integer>> mapEntrySet = map.entrySet();
                for (Map.Entry<String, Integer> entry : mapEntrySet) {
                    String s = entry.getKey();
                    if (s.length() == WordLength) {
                        sortables.add(new Sortable(entry.getKey(), entry.getValue()));
                    }
                }
            }
        }
        sortables = Sortable.MOST_TO_LEAST(sortables);
        return sortables;
    }
    public static void main(String[] args) throws IOException {
        File[] _6s = new File[]{
                new File("sample/_6LetterWordsStore1.java"),
                new File("sample/_6LetterWordsStore2.java"),
                new File("sample/_6LetterWordsStore3.java")
        };
        Time time = new Time();
        new WriteToXLetterWordsStore(_6s, 6);
        time.end();
        time.println();
    }
}
