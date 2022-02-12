package sample;

public class SortableV3 {
    private int index;
    private String crucialChar;
    public SortableV3(int Index, String CrucialChar){
        index = Index;
        crucialChar = CrucialChar.toLowerCase();
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setCrucialChar(String crucialChar) {
        this.crucialChar = crucialChar;
    }

    public String getCrucialChar() {
        return crucialChar;
    }
}
