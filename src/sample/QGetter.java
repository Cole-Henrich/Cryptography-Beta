package sample;

import java.io.FileNotFoundException;

public class QGetter extends LetterGetter{
    public QGetter() throws FileNotFoundException {
        super("q", new String[]{"æ"}, 15);
    }
        public static void main(String[] args) throws FileNotFoundException {
        new QGetter();
    }
}