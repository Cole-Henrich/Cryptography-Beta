package sample;

import java.io.FileNotFoundException;

public class ZGetter extends LetterGetter{
    public ZGetter() throws FileNotFoundException {
        super("z", new String[]{"q"}, 15);
    }
    public static void main(String[] args) throws FileNotFoundException {
        new ZGetter();
    }
}