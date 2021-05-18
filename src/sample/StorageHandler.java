package sample;

import java.io.*;
import java.util.ArrayList;

public class StorageHandler {
    private File writeTo;
    private int beginIndex;
    private ArrayList<String> words;
    private int spotInList;
    private File[] orderedList;
    private int stopIndex;

    public StorageHandler(File WriteTo, int BeginIndex, ArrayList<String> Words, int SpotInList, File[] OrderedList) throws IOException {
        System.err.println("new StorageHandler();");
        this.writeTo = WriteTo;
        this.beginIndex = BeginIndex;
        this.words = Words;
        this.spotInList = SpotInList;
        this.orderedList = OrderedList;
        StringBuilder privatestaticfinalstringarray_array = new StringBuilder();
        privatestaticfinalstringarray_array.append("package sample; \n\n public class ArrayStore").append(spotInList).append(" extends ArrayStore{\n").append("public ArrayStore").append(spotInList).append("() {\n").append("super(new String[]{");
        FileWriter fileWriter = new FileWriter(writeTo);
        this.stopIndex = stopIndex();

        for (int i = this.beginIndex; i < stopIndex; i++) {
            privatestaticfinalstringarray_array.append("\"").append(words.get(i)).append("\",");
        }
        privatestaticfinalstringarray_array.append("\"").append(words.get(stopIndex)).append("\"").append("        });\n").append("    }\n").append("}\n");
        fileWriter.write(privatestaticfinalstringarray_array.toString());
        fileWriter.close();
        if (this.spotInList < this.orderedList.length) {
            new StorageHandler(this.orderedList[this.spotInList], this.stopIndex + 1, this.words, this.spotInList + 1, this.orderedList);
        }
    }
    public File getWriteTo(){return writeTo;}
    public int getBeginIndex(){return beginIndex;}
    private int stopIndex(){
        int size = 0;
        int stopIndex = 0;
        for (int i = beginIndex; i < words.size(); i++) {
            String word = words.get(i);
            size += word.length();
            if (size >= 43000){
                stopIndex=i;
                break;
            }
        }
        return stopIndex;
    }
    
    public static void main(String[] args) throws IOException {
        File[] arrayStores = new File[]{
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore1.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore2.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore3.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore4.java"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/ArrayStore5.java")
        };
        new StorageHandler(arrayStores[0], 0, new Unique_Words_Accumulator().get(), 1, arrayStores);
    }
}
