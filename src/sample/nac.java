package sample;

import java.util.ArrayList;

public class nac {
    private String FinalLettersString;
    private ArrayList<Integer> SortedLengthsList;
    private boolean end_success_proven;
    private String S;
    public nac(String s, ArrayList<Integer> sortedLengthsList, String finalLettersString, boolean endsuccessproven) {
        S = s;
        SortedLengthsList = sortedLengthsList;
        FinalLettersString = finalLettersString;
        end_success_proven = endsuccessproven;
    }

    public String getS() {return S;}
    public boolean is_end_success_proven(){return end_success_proven;}
    public void set_success_proven(boolean boole){
        end_success_proven = boole;}
    public ArrayList<Integer> getSortedLengthsList() {
        return SortedLengthsList;
    }
    public String getFinalLettersString() {
        return FinalLettersString;
    }
}
