package sample;

public class Sortable {
    private String string;
    private int occurrences;
    public Sortable(String stringSelected, int Occurrences){
        string = stringSelected;
        occurrences = Occurrences;
    }
    public String getString() {
        return string;
    }
    public int getOccurrences() {
        return occurrences;
    }
}
