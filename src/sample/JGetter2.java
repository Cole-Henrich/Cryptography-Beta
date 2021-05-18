package sample;

import java.io.FileNotFoundException;

public class JGetter2 extends LetterGetter{
    public JGetter2() throws FileNotFoundException {
        super("j", new String[]{"x", "z", "q"});
    }

    public static void main(String[] args) throws FileNotFoundException {
        new JGetter2();
    }
}
