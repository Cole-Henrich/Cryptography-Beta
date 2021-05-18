package sample;

import java.io.FileNotFoundException;

public class WGetter extends LetterGetter{
    public WGetter() throws FileNotFoundException {
        super("w", new String[]{"b","c","d","f","g","j","k","l","m","n","o","p","q","r","u","v","x","y","z"}, 15);
    }
    public static void main(String[] args) throws FileNotFoundException {
        new WGetter();
    }
}