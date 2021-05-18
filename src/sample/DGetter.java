package sample;

import java.io.FileNotFoundException;

public class DGetter extends LetterGetter{
    public DGetter() throws FileNotFoundException {
        //new String[]{"h","a","t","e","i","s","w","r","v","y","n","m","l","g","b","d"}
        super("d", new String[]{"o","u","p","c","f","k","k","j","x","z","q"}, 15);
    }
    public static void main(String[] args) throws FileNotFoundException {
        new DGetter();
    }
}