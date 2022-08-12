package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class JumbleFinaleSolver {
    private String[][][] options;
    private CharSet charSet = new CharSet();
    private HashMap<Integer, ArrayList<a>> centrals;
    private ArrayList Tree;
    private Node root;
    private int finalDepth;
    private ArrayList<ArrayList<String>> acceptedPhrases;
    public JumbleFinaleSolver(ArrayList<String> finalLettersBank, int[] finalPartsLengths){
        acceptedPhrases = new ArrayList<>();
        finalDepth = finalPartsLengths.length;
        String finalLettersString = String.join("", finalLettersBank).toLowerCase();
        int[] sortedLengths = finalPartsLengths.clone();
        Arrays.sort(sortedLengths);
        ArrayList<Integer> SortedLengthsList = new ArrayList<>();
        for (int i = sortedLengths.length-1; i >=0 ; i--) {
            int sortedLength = sortedLengths[i];
            SortedLengthsList.add(sortedLength);
        }
        ArrayList<Integer> uniqueLengths = new ArrayList<>();
        for (int length : SortedLengthsList) {
            if (!uniqueLengths.contains(length)) {
                uniqueLengths.add(length);
            }
        }
        centrals = new HashMap<>();
        int fpl = finalPartsLengths.length;
        for (int i = 0; i < uniqueLengths.size(); i++) {
            int l = uniqueLengths.get(i);
            if (l==1){centrals.put(1, new _Array_1LetterWordsAndOccurrencesBigStore().central());}
            if (l==2){centrals.put(2, new _Array_2LetterWordsAndOccurrencesBigStore().central());}
            if (l==3){centrals.put(3, new _Array_3LetterWordsAndOccurrencesBigStore().central());}
            if (l==4){centrals.put(4, new _Array_4LetterWordsAndOccurrencesBigStore().central());}
            if (l==5){centrals.put(5, new _Array_5LetterWordsAndOccurrencesBigStore().central());}
            if (l==6){centrals.put(6, new _Array_6LetterWordsAndOccurrencesBigStore().central());}
            if (l==7){centrals.put(7, new _Array_7LetterWordsAndOccurrencesBigStore().central());}
            if (l==8){centrals.put(8, new _Array_8LetterWordsAndOccurrencesBigStore().central());}
            if (l==9){centrals.put(9, new _Array_9LetterWordsAndOccurrencesBigStore().central());}
            if (l==10){centrals.put(10, new _Array_10LetterWordsAndOccurrencesBigStore().central());}
            if (l==11){centrals.put(11, new _Array_11LetterWordsAndOccurrencesBigStore().central());}
            if (l==12){centrals.put(12, new _Array_12LetterWordsAndOccurrencesBigStore().central());}
            if (l==13){centrals.put(13, new _Array_13LetterWordsAndOccurrencesBigStore().central());}
            if (l==14){centrals.put(14, new _Array_14LetterWordsAndOccurrencesBigStore().central());}
            if (l==15){centrals.put(15, new _Array_15LetterWordsAndOccurrencesBigStore().central());}
            if (l==16){centrals.put(16, new _Array_16LetterWordsAndOccurrencesBigStore().central());}
            if (l==17){centrals.put(17, new _Array_17LetterWordsAndOccurrencesBigStore().central());}
            if (l==18){centrals.put(18, new _Array_18LetterWordsAndOccurrencesBigStore().central());}
            if (l==19){centrals.put(19, new _Array_19LetterWordsAndOccurrencesBigStore().central());}
        }
        root = new Node(new nac(finalLettersString, SortedLengthsList, finalLettersString, false));
        growTree(root);
        System.out.println(root.getData());

    }
    public void growTree(Node node){
        System.out.println(((nac)node.getData()).getSortedLengthsList());
        ArrayList<a> central = centrals.get(((nac)node.getData()).getSortedLengthsList().get(0));
        for (int i = 0; i < central.size(); i++) {
            a an = central.get(i);
            String s = an.getWord();
            if (charSet.isFormableFrom(s, ((nac)node.getData()).getFinalLettersString())){
                String fls = ((nac)node.getData()).getFinalLettersString();
                ArrayList<Integer> sll = ((nac)node.getData()).getSortedLengthsList();
                if (!sll.isEmpty()) {
                    fls = charSet.removeStringFromString(s, fls);
                    sll.remove(0);
                    Node childNode = new Node(new nac(s, sll, fls, false));
                    node.addChild(childNode);
                    if (childNode.getDepth() == finalDepth) {
                        childNode.setData(new nac(s, sll, fls, true));
                        acceptedPhrases.add(childNode.compileArrayListOfStrings(new ArrayList<String>()));
                    }
                    if (!sll.isEmpty() && !fls.isEmpty()) {
                        growTree(childNode);
                    }
                }
            }
        }
        if (node.getParent() != null) {
            growTree(node.getParent());
        }
    }
    public String[][][] get(){
        return options;
    }

    public static void main(String[] args) {
        CharSet charSet1 = new CharSet();
        new JumbleFinaleSolver(charSet1.StringToStringArrayList(charSet1.charToStringArray("getrighttoit".toCharArray())), new int[]{3,5,2,2});
    }
}
