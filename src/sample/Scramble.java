package sample;

import java.io.File;
import java.util.Scanner;

public class Scramble {
    private CharSet charSet = new CharSet();
    private String solved;
    public Scramble(String[] key, String text){
        char[] alphabet = charSet.getAlphabet();
        char[] ignorers = charSet.getIgnorers();
        Scanner scanner = new Scanner(text);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()){
            String next = scanner.next().toLowerCase();
            for (int i = 0; i < next.length(); i++) {
                boolean isIgnorer = false;
                char a = next.charAt(i);
                for (char ignorer : ignorers) {
                    if (a == ignorer) {
                        sb.append(a);
                        isIgnorer = true;
                        break;
                    }
                }
                if (!isIgnorer) {
                    for (int j = 0; j < alphabet.length; j++) {
                        char b = alphabet[j];
                        if (a == b) {
                            sb.append(key[j]);
                        }
                    }
                }
            }
        }
        this.solved = sb.toString();
    }
    public Scramble(String[] key, File text){
        this(key, text.toString());
    }
    public String get(){return solved;}
}
