package sample;

import java.io.FileNotFoundException;

public class XGetter extends LetterGetter{
    public XGetter() throws FileNotFoundException {
        super("x", new String[]{"z", "q"}, 15);
    }
    public static void main(String[] args) throws FileNotFoundException {
        new XGetter();
    }
}