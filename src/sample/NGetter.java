package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NGetter {
    private ArrayList<String> NHolder;
    private File Reservoir;
    private File Static;
    private int n;
    private final CharSet charSet = new CharSet();
    private ArrayList<String> uniques;
    public NGetter(File Reservoir, File Static, int n) throws FileNotFoundException {
        this.Reservoir = Reservoir;
        this.Static = Static;
        this.n = n;
        Scanner nGetter = new Scanner(Reservoir);
        NHolder = new ArrayList<>();
        while (nGetter.hasNext()){
            String next = charSet.removeIgnorers(nGetter.next(), new String[]{""});
            if (next.length() == n){
                NHolder.add(next);
            }
        }
    }
    public ArrayList<String> getUniques(){
        uniques = new ArrayList<>();
        for (String s : NHolder) {
            if (!uniques.contains(s.toLowerCase())) {
                uniques.add(s.toLowerCase());
            }
        }
        return uniques;
    }
    public ArrayList<String> getEm(){
        return NHolder;
    }
    public boolean writeWordsToFile() throws IOException {
        boolean wrote;
        try {
            FileWriter StaticWriter = new FileWriter(Static);
            for (int i = 0; i < NHolder.size(); i++) {
                StaticWriter.write(NHolder.get(i)+"\s,");
                if (i % 10 == 0 && i !=0){
                    StaticWriter.write("\n");
                }
            }
            wrote = true;
            StaticWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
            wrote = false;
        }
        return wrote;
    }
}

