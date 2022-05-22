package sample;

import java.util.ArrayList;

public class Sortable {
    private String string;
    private int occurrences;
    public Sortable(String stringSelected, int Occurrences){
        string = stringSelected;
        occurrences = Occurrences;
    }
    public static ArrayList<Sortable> LEAST_TO_MOST(ArrayList<Sortable> A){
//        System.err.println("sort()");
        ArrayList<Sortable> a = A;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i).getOccurrences() < a.get(j).getOccurrences()){
                    Sortable tmp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, tmp);
                }
            }
        }
        return a;
    }
    public static ArrayList<Sortable> MOST_TO_LEAST(ArrayList<Sortable> A){
        ArrayList<Sortable> a = Sortable.LEAST_TO_MOST(A);
        ArrayList<Sortable> b = new ArrayList<>();
        for (int i = a.size()-1; i >=0 ; i--) {
            b.add(a.get(i));
        }
        return b;
    }
    public static ArrayList<Sortable> MOST_TO_LEAST_TOP_X(ArrayList<Sortable> A, int topX){
        ArrayList<Sortable> a = Sortable.LEAST_TO_MOST(A);
        ArrayList<Sortable> b = new ArrayList<>();
        for (int i = a.size()-1; i >=a.size()-topX; i--) {
            b.add(a.get(i));
        }
        return b;
    }
    public String getString() {
        return string;
    }
    public int getOccurrences() {
        return occurrences;
    }
}
