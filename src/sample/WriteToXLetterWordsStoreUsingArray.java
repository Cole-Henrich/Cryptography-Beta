package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WriteToXLetterWordsStoreUsingArray {
    private int WordLength;
    private File[] WordsStores;
    private ArrayList<Sortable> Sortables;
    public WriteToXLetterWordsStoreUsingArray(File[] wordsStores, int wordLength) throws IOException {
        WordsStores = wordsStores;
        WordLength = wordLength;
        Sortables = putIntoSortables();
        writeToFiles();
    }
    private void writeToFiles() throws IOException {
        String example = """
                package sample;
                                
                public class _Array_6LetterWordsAndOccurrencesStore2 extends WordAndOccurrenceStoreArray{
                    public _Array_6LetterWordsAndOccurrencesStore2(){
                        super(new a[]{});
                    }
                }
                """;
        int FileIndex = 0;
        FileWriter fileWriter = new FileWriter(WordsStores[FileIndex]);
        String name = WordsStores[FileIndex].getName();
        name = name.replaceAll("[^0-9]", "");
        int storeNumber = Integer.parseInt(name.replaceFirst(String.valueOf(WordLength), ""));
        fileWriter.write("package sample;\n" +
                "                                \n" +
                "                public class _Array_"+WordLength+"LetterWordsAndOccurrencesStore"+storeNumber+"\sextends WordAndOccurrenceStoreArray{\n" +
                "                    public _Array_"+WordLength+"LetterWordsAndOccurrencesStore"+storeNumber+"(){\n" +
                "                        super(new a[]{");
        for (int i = 0; i < Sortables.size()-1; i++) {
            Sortable s = Sortables.get(i);
            //System.out.println(s.getString()+"\s"+s.getOccurrences());
            fileWriter.append("new a(\"" + s.getString() + "\"," + s.getOccurrences() + "),");
            if (WordsStores[FileIndex].length() > 63000) {
                //System.out.println(s.getString()+"\s"+s.getOccurrences()+" ALERT!!!");
                Sortable sNext = Sortables.get(Sortables.size()-1);
                fileWriter.append("new a(\"" + sNext.getString() + "\"," + sNext.getOccurrences() + ")");
                fileWriter.append("});}}");
                fileWriter.close();
                //System.out.println("1. FileIndex="+FileIndex);
                FileIndex++;
                //System.out.println("2. FileIndex="+FileIndex);
                if (FileIndex < WordsStores.length) {
                    //System.out.println("3. FileIndex="+FileIndex);
                    fileWriter = new FileWriter(WordsStores[FileIndex]);
                    //System.out.println("4. FileIndex="+FileIndex);
                    name = WordsStores[FileIndex].getName();
                    name = name.replaceAll("[^0-9]", "");
                    storeNumber = Integer.parseInt(name.replaceFirst(String.valueOf(WordLength), ""));
                    fileWriter.write("package sample;\n" +
                            "                                \n" +
                            "                public class _Array_"+WordLength+"LetterWordsAndOccurrencesStore"+storeNumber+"\sextends WordAndOccurrenceStoreArray{\n" +
                            "                    public _Array_"+WordLength+"LetterWordsAndOccurrencesStore"+storeNumber+"(){\n" +
                            "                        super(new a[]{");
                }
            }
        }
        Sortable sLast = Sortables.get(Sortables.size()-1);
        fileWriter.append("new a(\"" + sLast.getString() + "\"," + sLast.getOccurrences() + ")");
        fileWriter.append("});}}");
        fileWriter.close();
    }

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
                new File("src/sample/_Array_6LetterWordsAndOccurrencesStore1.java"),
                new File("src/sample/_Array_6LetterWordsAndOccurrencesStore2.java"),
                new File("src/sample/_Array_6LetterWordsAndOccurrencesStore3.java"),
        };
        Time time = new Time();
        new WriteToXLetterWordsStoreUsingArray(_6s, 6);
        time.end();
        time.println();
    }
}
