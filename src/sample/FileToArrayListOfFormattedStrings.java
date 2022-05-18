package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileToArrayListOfFormattedStrings {
    private ArrayList<String> get;
    static CharSet charSet = new CharSet();
    public FileToArrayListOfFormattedStrings(File file, boolean useCase, boolean removeIgnorers) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<String> rtn = new ArrayList<>();
        while (scanner.hasNext()){
            String next = scanner.next();
            if (next != null){
                next = charSet.RemoveIgnorers(next);
                next = next.toLowerCase();
                rtn.add(next);
            }
        }
        get = rtn;
    }
    public FileToArrayListOfFormattedStrings(File textReservoir) throws FileNotFoundException {
        this(textReservoir, false, true);
    }
    public ArrayList<String> get() {return get;}
}
