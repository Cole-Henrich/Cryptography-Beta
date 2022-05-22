package sample;

import java.util.ArrayList;

public class SortableV6 {
    private char ch;
    private int occurrences;
    public SortableV6(char c, int Occurrences){
        ch = c;
        occurrences = Occurrences;
    }
    public static ArrayList<SortableV6> LEAST_TO_MOST(ArrayList<SortableV6> A){
        ArrayList<SortableV6> a = A;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i).getOccurrences() < a.get(j).getOccurrences()){
                    SortableV6 tmp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, tmp);
                }
            }
        }
        return a;
    }
    public static ArrayList<SortableV6> MOST_TO_LEAST(ArrayList<SortableV6> A){
        ArrayList<SortableV6> a = LEAST_TO_MOST(A);
        ArrayList<SortableV6> b = new ArrayList<>();
        for (int i = a.size()-1; i >=0 ; i--) {
            b.add(a.get(i));
        }
        return b;
    }
    public static ArrayList<SortableV6> MOST_TO_LEAST_TOP_X(ArrayList<SortableV6> A, int topX){
        ArrayList<SortableV6> a = SortableV6.LEAST_TO_MOST(A);
        ArrayList<SortableV6> b = new ArrayList<>();
        for (int i = a.size()-1; i >=a.size()-topX; i--) {
            b.add(a.get(i));
        }
        return b;
    }
    public char getChar() {
        return ch;
    }
    public int getOccurrences() {
        return occurrences;
    }
}
