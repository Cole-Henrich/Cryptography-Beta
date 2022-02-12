package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Uniques extends ArrayList<String> {
    private static final CharSet charSet = new CharSet();
    private File reservoir;
    public Uniques(File file) throws FileNotFoundException {
        super();
        System.err.println("new Uniques(File file:"+file.getAbsolutePath()+")");
        reservoir = file;
        ArrayList<String> all = new ArrayList<>();
        Scanner scanner = new Scanner(reservoir);
        while (scanner.hasNext()){
            String next = scanner.next();
            if (next != null){
                all.add(next);
            }
        }
        System.err.println("in File "+ getClass().getCanonicalName() + " Scanner "+scanner.getClass().getName()+" scanned "+file.getAbsolutePath());
        int x = 0;
        System.err.println("in File\s"+ getClass().getCanonicalName() + "\sthe looped calls on RemoveIgnorers in File CharSet have added # uniques:" );
        for (String s : all) {
            s = charSet.RemoveIgnorers(s).toLowerCase();
            if (!contains(s)) {
                add(s);
                x++;
                if (x % 5000 == 0){
                    System.err.println(x);
                }
            }
        }
        System.err.println("in File\s"+ getClass().getCanonicalName() + "\sthe looped calls on RemoveIgnorers in File CharSet have finished." );
        System.err.println("The total # uniques = "+x);
    }
    public Uniques() throws FileNotFoundException {
        this(charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir());
    }
    public File getFile() {
        return reservoir;
    }
}
