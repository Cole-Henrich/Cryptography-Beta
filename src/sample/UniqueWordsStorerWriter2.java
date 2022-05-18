package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UniqueWordsStorerWriter2 {
    private ArrayList<a> reservoir;
    private File[] ArrayStores;
    private File BigArrayStore;
    private String Language;
    private CharSet charSet = new CharSet();

    /**
     *
     * @param r ArrayList<a>
     * @param as ArrayStores: where to store the Strings
     * @param bas BigArrayStore: where to consolidate all the ArrayStores.
     * @param l Language
     * @param identifier makes the erasure different from the other constructor.
     *                   It doesn't matter whether identifier is true or false.
     * @throws IOException
     */
    public UniqueWordsStorerWriter2(ArrayList<a> r, File[] as, File bas, String l, boolean identifier) throws IOException {
        reservoir = r;
        ArrayStores = as;
        BigArrayStore = bas;
        Language = l;
        writeToIndividualArrayStores(charSet.ArrayList_a_to_ArrayList_String(r));//comment this out if just editing BigArray
        writeBigArrayStoreClass();
    }
    public UniqueWordsStorerWriter2(ArrayList<String> ArrListUniques, File[] as, File bas, String l) throws IOException {
        ArrayStores = as;
        BigArrayStore = bas;
        Language = l;
//        writeToIndividualArrayStores(ArrListUniques);//comment this out if just editing BigArray
        writeBigArrayStoreClass();
    }
    private void writeToIndividualArrayStores(ArrayList<String> got) throws IOException {

        int fileIndex = 0;
        FileWriter fileWriter = new FileWriter(ArrayStores[fileIndex]);
        fileWriter.write("package sample;\n" +
                "                                \n" +
                "                public class ArrayStore"+Language+(fileIndex+1)+" extends ArrayStore {\n" +
                "                    public ArrayStore"+Language+(fileIndex+1)+"() {\n" +
                "                        super(new String[]{");
        for (int i = 0; i < got.size()-1; i++) {
            String uniqueWord = got.get(i);
            fileWriter.append("\"").append(uniqueWord).append("\",\s");
            if (ArrayStores[fileIndex].length() > 63000) {
                fileWriter.append("\"").append(got.get(i+1)).append("\"");
                fileWriter.append("});}}");
                fileWriter.close();
                if (fileIndex < 18) {
                    fileIndex++;
                    fileWriter = new FileWriter(ArrayStores[fileIndex]);
                    fileWriter.write("package sample;\n" +
                            "                                \n" +
                            "                public class ArrayStore" + Language + (fileIndex + 1) + " extends ArrayStore {\n" +
                            "                    public ArrayStore" + Language + (fileIndex + 1) + "() {\n" +
                            "                        super(new String[]{");
                }
            }
        }
        fileWriter.append("\"").append(got.get(got.size()-1)).append("\"");
        fileWriter.append("});}}");
        fileWriter.close();
    }
    private void writeBigArrayStoreClass() throws IOException {
        String s163738 = """
                package sample;
                                
                import java.util.ArrayList;
                import java.util.Collections;
                
                public class BigArrayStoreSpanish {
                                
                    private ArrayList<String> central;
                    public BigArrayStoreSpanish(){
                        ArrayStoreSpanish1 as1 = new ArrayStoreSpanish1();
                        String[] _1 = as1.get();
                        ArrayStoreSpanish2 as2 = new ArrayStoreSpanish2();
                        String[] _2 = as2.get();
                        ArrayStoreSpanish3 as3 = new ArrayStoreSpanish3();
                        String[] _3 = as3.get();
                        central = new ArrayList<>();
                        String[][] a = {_1, _2, _3};
                        for (String[] b: a) {
                            Collections.addAll(central, b);
                        }
                    }
                    public ArrayList<String> central(){return central;}
                }
                """;
        String s = """
                package sample;

                import java.util.ArrayList;
                import java.util.Collections;
                
                public class BigArrayStore""";
        s+=Language;
        s+= """
                {
                                               \s
                                    private ArrayList<String> central;
                                    public BigArrayStore""";
        s+=Language;
        s+="(){\n";
        String generic = "ArrayStore"+Language;
        for (int i = 0; i < ArrayStores.length; i++) {
            int n = i+1;
            String l1p1 = generic+n;
            String l1p2 = "\sas"+n;
            String l1p3 = "\s=\snew\s"+generic+n+"();\n";
            String l1 = l1p1+l1p2+l1p3;
            String l2 = "String[]\s_"+n+"\s=\sas"+n+".get();\n";
            String total = l1+l2;
            s+=total;
        }
        s+="central = new ArrayList<>();";
        String sArray = "String[][] a = {";
        for (int i = 0; i < ArrayStores.length-1; i++) {
            int n = i+1;
            sArray+="_"+n+",";
        }
        sArray+="_"+(ArrayStores.length);
        s+=sArray;
        s+="};";

        s+= """
                for (String[] b: a) {
                            Collections.addAll(central, b);
                        }
                    }
                    public ArrayList<String> central(){return central;}
                }
                """;

        FileWriter writerToBigStore = new FileWriter(BigArrayStore);
        writerToBigStore.write(s);
        writerToBigStore.close();
    }

    public static void main(String[] args) throws IOException {
        Time time = new Time();
        English();
        time.end();
        time.println();
    }
//    public static void GeneralLatinAlphabetLanguage() throws IOException {
//        sample.BigArrayStore EnglishArrayStore = new BigArrayStore();
//        BigArrayStoreSpanish SpanishArrayStore = new BigArrayStoreSpanish();
//        BigArrayStoreFrench FrenchArrayStore = new BigArrayStoreFrench();
//        BigArrayStorePortuguese PortugueseArrayStore = new BigArrayStorePortuguese();
//        ArrayList<String> englishUniques = EnglishArrayStore.central();
//        ArrayList<String> spanishUniques = SpanishArrayStore.central();
//        ArrayList<String> frenchUniques = FrenchArrayStore.central();
//        ArrayList<String> portugueseUniques = PortugueseArrayStore.central();
//        ArrayList<String> all = new ArrayList<>(englishUniques);
//        all.addAll(spanishUniques);
//        all.addAll(frenchUniques);
//        all.addAll(portugueseUniques);
//        ArrayList<String> generalUniques = new ArrayList<>();
//        for (String s:all){
//            if (!generalUniques.contains(s)){
//                generalUniques.add(s);
//            }
//        }
//        File[] ArrayStores = new File[]{
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage1.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage2.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage3.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage4.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage5.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage6.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage7.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage8.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage9.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage10.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage11.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage12.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage14.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage15.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage16.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage17.java"),
//                new File("src/sample/ArrayStoreGeneralLatinAlphabetLanguage18.java")
//        };
//        File BigArrayStore = new File("src/sample/BigArrayStoreGeneralLatinAlphabetLanguage.java");
//        String Language = "GeneralLatinAlphabetLanguage";
//        UniqueWordsStorerWriter2 w = new UniqueWordsStorerWriter2(generalUniques, ArrayStores, BigArrayStore, Language);
//    }
    private static void English() throws IOException {
        BigWordAndOccurrenceStoreArray biggy = new BigWordAndOccurrenceStoreArray();
        ArrayList<a> reservoir = biggy.central();

        File[] ArrayStores = new File[]{
                new File("src/sample/ArrayStore1.java"),
                new File("src/sample/ArrayStore2.java"),
                new File("src/sample/ArrayStore3.java"),
                new File("src/sample/ArrayStore4.java"),
                new File("src/sample/ArrayStore5.java"),
                new File("src/sample/ArrayStore6.java"),
                new File("src/sample/ArrayStore7.java"),
                new File("src/sample/ArrayStore8.java"),
                new File("src/sample/ArrayStore9.java"),
                new File("src/sample/ArrayStore10.java"),
                new File("src/sample/ArrayStore11.java"),
                new File("src/sample/ArrayStore12.java")

        };
        File BigArrayStore = new File("src/sample/BigArrayStore.java");
        String Language = "";
        UniqueWordsStorerWriter2 w = new UniqueWordsStorerWriter2(reservoir, ArrayStores, BigArrayStore, Language, true);
    }

}
