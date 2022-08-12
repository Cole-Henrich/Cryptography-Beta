package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TrojanHorse {

    //encrypt old pages
    //encrypt new pages
    //run Trojan Horse, decrypt new pages
    //encrypt new pages
    //decrypt old pages

    //recursive:
    //encrypt old pages
    //run Trojan Horse, decrypt new pages
    //encrypt new pages
    //decrypt old pages
    //repeat from "recursive"
    public File[] contents;
    private File oldPagesStorage = new File("sample/oldPagesStorage");
    private File newPagesStorage = new File("sample/newPagesStorage");
    private CharSet charSet = new CharSet();
    private String[] encoding;
    private String delineator;
    //"@#!$%^&*"
    public TrojanHorse(File[] Contents, String[] Encoding, String Delineator){
        delineator = Delineator;
        contents = Contents;
        encoding = Encoding;
    }
    private void attack() throws IOException {
        encrypt(contents, oldPagesStorage);
        decrypt(newPagesStorage, contents);
    }
    private void retreat() throws IOException {
        encrypt(contents, newPagesStorage);
        decrypt(oldPagesStorage, contents);
    }
    private void encrypt(File[] files, File storage) throws IOException {
        ArrayList<Character> characters = charSet.filesToArrayListCharacter(files, delineator);
        ArrayList<String> unicodes = charSet.CharactersToUnicodes(characters);
        StringBuilder conglomerate = new StringBuilder();
        for (int i = 0; i < unicodes.size(); i++) {
            conglomerate.append(unicodes.get(i)).append(" ");
        }
        TwoCharEncoder encoder = new TwoCharEncoder(conglomerate.toString(), encoding);
        String output = encoder.getOutput();
        FileWriter fileWriter = new FileWriter(storage);
        fileWriter.write(output);
    }
    private void decrypt(File storage, File[] files) throws IOException {
        String input = "";
        Scanner scanner = new Scanner(storage);
        while (scanner.hasNext()){
            String next = scanner.next();
            input+=next;
        }
        scanner.close();
        TwoCharDecoder decoder = new TwoCharDecoder(input);
        String decoded = decoder.getOutput();
        String[] Deconglomerated = decoded.split(" ");
        ArrayList<String> unicodes = charSet.StringToStringArrayList(Deconglomerated);
        ArrayList<Character> characters = charSet.UnicodesToCharacters(unicodes);
        StringBuilder conglomerate = new StringBuilder();
        for (int i = 0; i < characters.size(); i++) {
            conglomerate.append(characters.get(i));
        }
        String bulk = conglomerate.toString();
        Scanner delineator_reader = new Scanner(bulk);
        int index = 0;
        ArrayList<String> futureFileContents = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (delineator_reader.hasNextLine()){
            String line = delineator_reader.nextLine();
            if (line.contains(delineator)){
                index++;
                sb = new StringBuilder();
                futureFileContents.add(sb.toString());
            }
            else {
                sb.append(line);
            }
        }
        delineator_reader.close();
        for (int i = 0; i < futureFileContents.size(); i++) {
            FileWriter fileWriter = new FileWriter(files[i]);
            fileWriter.write(futureFileContents.get(i));
            fileWriter.close();
        }
    }
}
