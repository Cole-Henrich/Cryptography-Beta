package sample;

public class HasLettersInCorrectPlacesNode {
    private int Index;
    private char Char;
    public HasLettersInCorrectPlacesNode(int index, char ch) {
        setChar(ch);
        setIndex(index);
    }

    public char getChar() {
        return Char;
    }

    public int getIndex() {
        return Index;
    }

    public void setChar(char aChar) {
        Char = aChar;
    }

    public void setIndex(int index) {
        Index = index;
    }
}
