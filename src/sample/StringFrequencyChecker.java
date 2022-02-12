package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringFrequencyChecker extends ArrayList<Sortable>{
    private final CharSet charSet = new CharSet();
    public StringFrequencyChecker(File file, StringSelector stringSelector) throws FileNotFoundException {
        System.err.println("new StringFrequencyChecker(File file:"+file.getAbsolutePath()+", StringSelector stringSelector:"+stringSelector.getClass().getSimpleName()+")");
        Scanner converter = new Scanner(file);
        ArrayList<String> all = new ArrayList<>();
        int count = 0;
        while (converter.hasNext()){
            String next = converter.next();
            if (next != null){
                all.add(next);
                count++;
                System.err.println("In file "+ getClass().getSimpleName()+" Scanner "+converter.getClass().getSimpleName()+" has found # unique words in "+file.getAbsolutePath());
            }
        }
        for (int i = 0; i < stringSelector.size(); i++) {
            System.err.println("In file "+ getClass().getSimpleName()+" Sortable # has been added:");
            String stringSelected = stringSelector.get(i);
            int occurrences = 0;
            for (int j = 0; j < all.size(); j++) {
                String something = all.get(j);
                something = charSet.RemoveIgnorers(something);
                if (something.equalsIgnoreCase(stringSelected)) {
                    occurrences++;
                    all.remove(j);
                }
            }
            Sortable sortable = new Sortable(stringSelected, occurrences);
            add(sortable);
            System.err.println(i);
        }
    }

    public StringFrequencyChecker() {
        super();
    }
}
