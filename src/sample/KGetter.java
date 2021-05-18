package sample;

import java.io.FileNotFoundException;

public class KGetter extends LetterGetter{
    public KGetter() throws FileNotFoundException {
        super("k", new String[]{"j", "x", "z", "q"}, 18);
    }
    public static void main(String[] args) throws FileNotFoundException {
        new KGetter();
    }
}