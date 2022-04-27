package sample;

import java.util.ArrayList;

public class WordleSolver2Letter {
    private char value;
    private ArrayList<Character> notValues;
    public WordleSolver2Letter(){}
    public WordleSolver2Letter(char val, ArrayList<Character> not){
        setValue(val);
        setNotValues(not);
    }
    public ArrayList<Character> getNotValues() {return notValues;}
    public char getValue() {return value; }
    public void setValue(char value) {this.value = value;}
    public void setNotValues(ArrayList<Character> notValues) {this.notValues = notValues;}
}
