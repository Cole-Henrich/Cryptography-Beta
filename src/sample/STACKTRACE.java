package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class STACKTRACE {
    private String s;
    public STACKTRACE(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        StringBuilder contents = new StringBuilder();
        while(scanner.hasNextLine()){
            String nextLine = scanner.nextLine();
            contents.append(nextLine);
            contents.append("\n");
            contents.append("System.err.println(\"");
            contents.append(nextLine);
            contents.append("\");\n");
        }
        this.s = contents.toString();
    }
    public String getString(){
        return s;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new STACKTRACE(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/VigenereDeciphered.java")).getString());
    }
}
