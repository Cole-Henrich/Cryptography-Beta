package sample;

import java.util.ArrayList;

public class SortedArrayV3 extends ArrayList<SortableV3> {
    private final CharSet charSet = new CharSet();
    private ArrayList<SortableV3> input;
    public SortedArrayV3(ArrayList<SortableV3> sv3s){
        input = sv3s;
        int inputSize = input.size();
        for (int i = 0; i < inputSize; i++) {
            SortableV3 sv3 = input.get(i);
            int index = sv3.getIndex();
            for (int j = i; j < inputSize; j++){
                SortableV3 sv3_another = input.get(j);
                int index_another = sv3_another.getIndex();
                if (index < index_another){
                    SortableV3 tmp = sv3;
                    input.set(i, input.get(j));
                    input.set(j, tmp);
                }
            }
        }
        addAll(input);
    }
    public int[] crucialIndicesNoDuplicates(){
        ArrayList<SortableV3> copy = new ArrayList<>(this);
        ArrayList<Integer> indices = new ArrayList<>();
        for (SortableV3 sv3 : copy) {
            int index = sv3.getIndex();
            if (!indices.contains(index)) {
                indices.add(index);
            }
        }
        int[] rtn = charSet.IntegerArrayListToIntArray(indices);
        return rtn;
    }
    public ArrayList<ArrayList<String>> crucialCharactersAtEachIndex(){
        int[] crucialIndicesNoDuplicates = crucialIndicesNoDuplicates();
        ArrayList<ArrayList<String>> rtn = new ArrayList<>();
        for (int i = 0; i < crucialIndicesNoDuplicates.length; i++) {
            int crucialIndex = crucialIndicesNoDuplicates[i];
            ArrayList<String> crucialCharactersAtThisIndex = new ArrayList<>();
            for (int j = 0; j < size(); j++) {
                SortableV3 sv3 = get(i);
                if (sv3.getIndex() == crucialIndex){
                    String crucialChar = sv3.getCrucialChar();
                    if (!crucialCharactersAtThisIndex.contains(crucialChar)) {
                        crucialCharactersAtThisIndex.add(crucialChar);
                    }
                }
            }
            rtn.add(crucialCharactersAtThisIndex);
        }
        return rtn;
    }
}
