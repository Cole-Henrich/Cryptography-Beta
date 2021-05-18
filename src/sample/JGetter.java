package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JGetter{
    private ArrayList<String> jholder;
    public JGetter() throws FileNotFoundException {
        File JReservoir = new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/JReservoir.txt");
        Scanner JScanner = new Scanner(JReservoir);
        jholder = new ArrayList<>();
        while (JScanner.hasNext()){
            String next = JScanner.next();
            if (!next.contains("x") && !next.contains("X")){
                if (!next.contains("z") && !next.contains("Z")){
                    if (!next.contains("q") && !next.contains("Q")){
                        jholder.add(next);
                    }
                }
            }
        }
    }
    public ArrayList<String> get(){return jholder;}
    public String getStringArrayFormatted(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jholder.size()-1; i++) {
            String s = jholder.get(i);
            sb.append("\"").append(s).append("\",");
        }
        sb.append("\"").append(jholder.get(jholder.size() - 1)).append("\"");
        return sb.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        JGetter getter = new JGetter();
        System.out.println(getter.getStringArrayFormatted());
    }
}
