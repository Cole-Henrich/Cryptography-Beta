package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UniqueWordsStorerWriter {
    private File reservoir;
    private File[] ArrayStores;
    private File BigArrayStore;
    private String Language;
    public UniqueWordsStorerWriter(File r, File[] as, File bas, String l) throws IOException {
        reservoir = r;
        ArrayStores = as;
        BigArrayStore = bas;
        Language = l;
        writeToIndividualArrayStores();//comment this out if just editing BigArray
        writeBigArrayStoreClass();

    }
    private void writeToIndividualArrayStores() throws IOException {
        Unique_Words_Accumulator acc = new Unique_Words_Accumulator(reservoir);
        ArrayList<String> got = acc.get();
        int fileIndex = 0;
        FileWriter fileWriter = new FileWriter(ArrayStores[fileIndex]);
        fileWriter.write("package sample;\n" +
                "                                \n" +
                "                public class ArrayStore"+Language+(fileIndex+1)+" extends ArrayStore {\n" +
                "                    public ArrayStore"+Language+(fileIndex+1)+"() {\n" +
                "                        super(new String[]{");
        for (String uniqueWord : got) {
            fileWriter.append("\"").append(uniqueWord).append("\",\s");
            if (ArrayStores[fileIndex].length() > 60000) {
                fileWriter.append("});}}");
                fileIndex++;
                fileWriter = new FileWriter(ArrayStores[fileIndex]);
                fileWriter.write("package sample;\n" +
                        "                                \n" +
                        "                public class ArrayStore" + Language + (fileIndex + 1) + " extends ArrayStore {\n" +
                        "                    public ArrayStore" + Language + (fileIndex + 1) + "() {\n" +
                        "                        super(new String[]{");
            }
        }
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
        Portuguese();
        time.end();
        time.println();
    }
    private static void Portuguese() throws IOException {
        File reservoir = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/PortugueseReservoir.txt");
        File[] ArrayStores = new File[]{
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStorePortuguese1.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStorePortuguese2.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStorePortuguese3.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStorePortuguese4.java"),
        };
        File BigArrayStore = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/BigArrayStorePortuguese.java");
        String Language = "Portuguese";
        UniqueWordsStorerWriter w = new UniqueWordsStorerWriter(reservoir, ArrayStores, BigArrayStore, Language);
    }
    private static void English() throws IOException {
        File reservoir = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt");
        File[] ArrayStores = new File[]{
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore1.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore2.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore3.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore4.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore5.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore6.java")
        };
        File BigArrayStore = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/BigArrayStore.java");
        String Language = "";
        UniqueWordsStorerWriter w = new UniqueWordsStorerWriter(reservoir, ArrayStores, BigArrayStore, Language);
    }

    private static void French() throws IOException {
        File reservoir = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/FrenchReservoir.txt");
        File[] ArrayStores = new File[]{
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStoreFrench1.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStoreFrench2.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStoreFrench3.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStoreFrench4.java"),
        };
        File BigArrayStore = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/BigArrayStoreFrench.java");
        String Language = "French";
        UniqueWordsStorerWriter w = new UniqueWordsStorerWriter(reservoir, ArrayStores, BigArrayStore, Language);
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
