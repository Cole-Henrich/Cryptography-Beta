package sample;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class SortedArray extends ArrayList<String> {
    public SortedArray(StringFrequencyChecker stringFrequencyChecker) throws FileNotFoundException {
        super();
        System.err.println("new SortedArray(StringFrequencyChecker stringFrequencyChecker: "+stringFrequencyChecker.getClass().getSimpleName());
        order(stringFrequencyChecker);
    }
    private void order(StringFrequencyChecker stringFrequencyChecker) throws FileNotFoundException {
        StringFrequencyChecker result = Do_Order(stringFrequencyChecker);
        clear();
        for (Sortable sortable : result) {
            add(sortable.getString());
        }
    }
    public StringFrequencyChecker Do_Order(StringFrequencyChecker stringFrequencyChecker) throws FileNotFoundException {
//        int[] arr = { 2, 0, 1, 3};
//        for( int i = 0; i < arr.length; i++ ) {
//            for( int j = i; j < arr.length; j++ ) {
//                if( arr[i] < arr[j] ) {
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
        StringFrequencyChecker copy = new StringFrequencyChecker();
        copy.addAll(stringFrequencyChecker);
        for (int i = 0; i < copy.size(); i++){
            for (int j = i; j < copy.size(); j++){
                if (copy.get(i).getOccurrences() < copy.get(j).getOccurrences()){
                    Sortable I = copy.get(i);
                    Sortable J = copy.get(j);
                    copy.set(i, J);
                    copy.set(j, I);
                }
            }
        }
        return copy;
    }
    public SortedArray(){
        super();
    }
    public SortedArray sublist(int fromIndex, int toIndex){
        SortedArray rtn = new SortedArray();
        rtn.addAll(new ArrayList<>(this).subList(fromIndex, toIndex));
        return rtn;
    }
}
