package sample;

import java.io.File;
import java.io.FileNotFoundException;

public class emperor extends LetterGetter{
    public emperor() throws FileNotFoundException {
        super(new File("/Users/cole.henrich/Downloads/Digital-Libraries/When-The-Emperor-Was-Divine/index.txt"), new String[]{""}, "’", 15, false, new String[]{""});
    }
    public static void main(String[] args) throws FileNotFoundException {
        new emperor();
    }
}