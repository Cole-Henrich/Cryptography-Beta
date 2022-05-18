//package sample;
//
//import java.io.*;
//import java.nio.file.Files;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class StorageHandler {
//    private File writeTo;
//    private int beginIndex;
//    private ArrayList<String> words;
//    private int spotInList;
//    private File[] orderedList;
//    private int stopIndex;
//    private static final CharSet charSet = new CharSet();
//    public StorageHandler(File WriteTo, int BeginIndex, ArrayList<String> Words, int SpotInList, File[] OrderedList) throws IOException {
//        System.err.println("new StorageHandler();");
//        writeTo = WriteTo;
//        beginIndex = BeginIndex;
//        words = Words;
//        spotInList = SpotInList;
//        orderedList = OrderedList;
//        StringBuilder privatestaticfinalstringarray_array = new StringBuilder();
//        privatestaticfinalstringarray_array.append("package sample; \n\n public class ArrayStore").append(spotInList).append(" extends ArrayStore{\n").append("public ArrayStore").append(spotInList).append("() {\n").append("super(new String[]{");
//        FileWriter fileWriter = new FileWriter(writeTo);
//        stopIndex = stopIndex();
//
//        for (int i = beginIndex; i < stopIndex; i++) {
//            privatestaticfinalstringarray_array.append("\"").append(words.get(i)).append("\",");
//        }
//        privatestaticfinalstringarray_array.append("\"").append(words.get(stopIndex)).append("\"").append("        });\n").append("    }\n").append("}\n");
//        fileWriter.write(privatestaticfinalstringarray_array.toString());
//        fileWriter.close();
//        if (spotInList < orderedList.length) {
//            new StorageHandler(orderedList[spotInList], stopIndex + 1, words, spotInList + 1, orderedList);
//        }
//    }
//    public File getWriteTo(){return writeTo;}
//    public int getBeginIndex(){return beginIndex;}
//    private int stopIndex(){
//        int size = 0;
//        int stopIndex = 0;
//        for (int i = beginIndex; i < words.size(); i++) {
//            String word = words.get(i);
//            size += word.length();
//            if (size >= 43000){
//                //this keeps them below the 64000 byte limit on classes.
//                // Oddly, by breaking at 43000, the final size ends up being around 60000.
//                stopIndex=i;
//                break;
//            }
//        }
//        return stopIndex;
//    }
//    private static ArrayList<SortingAttribute> sort(ArrayList<String> uniqueWords) throws IOException {
//        ArrayList<SortingAttribute> rtn = new ArrayList<>();
//        File reservoir = new File("src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt");
//        File tempMutableCopy = new File("src/sample/TempMutableCopy#2");
//        Files.copy(reservoir.toPath(), tempMutableCopy.toPath());
//        String stringCopy = charSet.FileToString(tempMutableCopy);
//        for (int i = 0; i < uniqueWords.size(); i++) {
//            int occurrences = 0;
//            String uniqueWord = uniqueWords.get(i);
//            Scanner sc = new Scanner(stringCopy);
//            while (sc.hasNext()){
//                String next = sc.next();
//                boolean equalsIgnoreCase = next.equalsIgnoreCase(uniqueWord);
//                if (equalsIgnoreCase){
//                    occurrences++;
//                }
//                if (!equalsIgnoreCase){
//                    if (next.contains(uniqueWord)) {
//                        String n = charSet.RemoveIgnorers(next);
//                        if (n.length() == uniqueWord.length()) {
//                            if (n.equalsIgnoreCase(uniqueWord)) {
//                                occurrences++;
//                            }
//                        }
//                    }
//                }
//            }
//            sc.close();
//            rtn.add(new SortingAttribute(i, occurrences));
//            stringCopy = stringCopy.replaceAll(uniqueWord, "");
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        File[] arrayStores = new File[]{
//                new File("src/sample/ArrayStore1.java"),
//                new File("src/sample/ArrayStore2.java"),
//                new File("src/sample/ArrayStore3.java"),
//                new File("src/sample/ArrayStore4.java"),
//                new File("src/sample/ArrayStore5.java")
//        };
//
//        new StorageHandler(arrayStores[0], 0, sort(new Unique_Words_Accumulator().get()), 1, arrayStores);
//    }
//}
