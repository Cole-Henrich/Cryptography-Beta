package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class not_latin_alphabet_language {
    private boolean not_latin_alphabet_language;
    private int validWords;
    private int docLength;
    private double validityFactor;
    private ArrayList<String> words;
    private BigArrayStoreGeneralLatinAlphabetLanguage biggy;
    private double cutoff;
    private final CharSet charSet = new CharSet(true);

    public not_latin_alphabet_language(String string, boolean ignoreSpaces, boolean ignorePunctuation) throws InterruptedException {
        this(string, ignoreSpaces, ignorePunctuation, 10, 7, false, false, 0);
    }
    public not_latin_alphabet_language(String string, boolean ignoreSpaces, boolean ignorePuncuation, int fromInclusive, int toInclusive, boolean optimize, boolean calculateCutoff, double Cutoff) throws InterruptedException {
        this.cutoff = Cutoff;
        if (ignorePuncuation) {
            string = charSet.removeIgnorers(string, new String[]{" "});
        }
        if (ignoreSpaces){
            string = string.replaceAll(" ", "");
        }
//        if (calculateCutoff) {
//            cutoff = calculateCutoff();
//        }
        biggy = new BigArrayStoreGeneralLatinAlphabetLanguage();
        words = biggy.central();
        this.docLength = string.length();
        int validWords = 0;
        int wordsCounted = 0;
        boolean Break = false;
        for (int i = fromInclusive; i >= toInclusive; i--) {
            String[] split = charSet.split(string, i);
            for (String str : split) {
                wordsCounted++;
                for (String word : words) {
                    validityFactor = ((double) validWords) / ((double) wordsCounted);
                    this.not_latin_alphabet_language = validityFactor < cutoff;
                    if (str.equalsIgnoreCase(word)) {
                        validWords++;
                        break;
                    }
                    if (optimize) {
                        if (!not_latin_alphabet_language) {
                            Break = true;
                            this.validWords = validWords;
                            break;
                        }
                    }
                    if (optimize && Break){
                        break;
                    }
                }
            }
            if (optimize && Break){
                break;
            }
        }
    }
    public not_latin_alphabet_language(File file) throws FileNotFoundException {
        this(file, 0.7);
    }
    public not_latin_alphabet_language(String string){
        this(string, 0.7);
    }
    public not_latin_alphabet_language(File file, double cutoff) throws FileNotFoundException {
        biggy = new BigArrayStoreGeneralLatinAlphabetLanguage();
        words = biggy.central();
        int docLength = 0;
        Scanner counter = new Scanner(file);
        while (counter.hasNext()){if (counter.next() != null){docLength++;}}
        this.docLength = docLength;

        int validWords = 0;
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            if (words.contains(charSet.removeIgnorers(reader.next(), new String[]{""}))){
                validWords++;
            }
        }
        this.validWords = validWords;
        this.validityFactor = (double)validWords/(double)docLength;
        not_latin_alphabet_language = (validWords <= (cutoff*docLength));
    }
    public not_latin_alphabet_language(String string, double cutoff) {
        biggy = new BigArrayStoreGeneralLatinAlphabetLanguage();
        words = biggy.central();
        this.docLength = string.length();
        int validWords = 0;
        String[] split = string.split(" ");
        for (String word: split) {
            if (words.contains(charSet.removeIgnorers(word, new String[]{""}))){
                validWords++;
            }
        }
        this.validWords = validWords;
        this.validityFactor = (double)validWords/(double)docLength;
        not_latin_alphabet_language = (validWords <= (cutoff*docLength));
    }

    public double getCutoff() {
        return cutoff;
    }
    public double getValidityFactor() {return validityFactor;}
    public boolean not_latin_alphabet_language(){return not_latin_alphabet_language;}
    public int getValidWords(){return validWords;}
    public int getDocLength(){return docLength;}

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
    }
}
