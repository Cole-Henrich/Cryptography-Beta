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
    private BigArrayStore biggy;
    private double cutoff;
    private final CharSet charSet = new CharSet(true);

    public not_latin_alphabet_language(String string, boolean ignoreSpaces, boolean ignorePunctuation) throws InterruptedException {
        this(string, ignoreSpaces, ignorePunctuation, true, false, 0);
    }
    public not_latin_alphabet_language(String string, boolean ignoreSpaces, boolean ignorePuncuation, boolean optimize, boolean calculateCutoff, double Cutoff) throws InterruptedException {

        cutoff = Cutoff;
        if (ignorePuncuation) {
            string = charSet.removeIgnorers(string, new String[]{" "});
        }
        if (ignoreSpaces){
            string = string.replaceAll(" ", "");
        }
        if (calculateCutoff) {
        }
        String[] textSplit = string.split(" ");
        docLength = textSplit.length;
        biggy = new BigArrayStore();
        words = biggy.central();
        int validWords = 0;
        for (int i = 0; i < textSplit.length; i++) {
            String word = textSplit[i];
            if (optimize){
                if (i >= 10) {
                    if (validWords <= 2) {
                        not_latin_alphabet_language = true;
                        break;
                    } else {
                        if (i >= 15){
                            if ( validWords <= 3){
                                not_latin_alphabet_language = true;
                                break;
                            }
                            else {
                                if (i == 20){
                                    if ( validWords <= 8){
                                        not_latin_alphabet_language = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (words.contains(charSet.RemoveIgnorers(word))) {
                validWords++;
                validityFactor = (double) validWords / (double) docLength;
                not_latin_alphabet_language = (validWords <= (cutoff * docLength));
                if (optimize) {
                    if (!not_latin_alphabet_language) {
                        break;
                    }
                }
            }
        }
        this.validWords = validWords;
//        this.validityFactor = (double)validWords/(double)docLength;
//        not_latin_alphabet_language = (validWords <= (cutoff*docLength));


//        System.out.println(string);
//        biggy = new BigArrayStore();
//        words = biggy.central();
//        this.docLength = string.length();
//        int validWords = 0;
//        int wordsCounted = 0;
//        boolean Break = false;
////        for (int i = fromInclusive; i >= toInclusive; i--) {
////            String[] split = charSet.split(string, i);
////            for (String str : split) {
////                wordsCounted++;
////                for (String word : words) {
////                    validityFactor = ((double) validWords) / ((double) wordsCounted);
////                    this.not_latin_alphabet_language = validityFactor < cutoff;
////                    if (str.equalsIgnoreCase(word)) {
////                        System.out.println(word);
////                        validWords++;
////                        break;
////                    }
////                    if (optimize) {
////                        if (!not_latin_alphabet_language) {
////                            Break = true;
////                            this.validWords = validWords;
////                            break;
////                        }
////                    }
////                    if (optimize && Break){
////                        break;
////                    }
////                }
////            }
////            if (optimize && Break){
////                break;
////            }
////        }
    }
    public not_latin_alphabet_language(File file) throws FileNotFoundException {
        this(file, CharSet.EngMinValidityFactor);
    }
    public not_latin_alphabet_language(String string) throws InterruptedException {
        this(string, CharSet.EngMinValidityFactor);
    }
    public not_latin_alphabet_language(File file, double cutoff) throws FileNotFoundException {
        this(file, cutoff, false);
    }
    public not_latin_alphabet_language(File file, double cutoff, boolean optimize) throws FileNotFoundException {
        this.cutoff = cutoff;
        biggy = new BigArrayStore();
        words = biggy.central();
        int docLength = 0;
        Scanner counter = new Scanner(file);
        while (counter.hasNext()){if (counter.next() != null){docLength++;}}
        this.docLength = docLength;

        int validWords = 0;
        Scanner reader = new Scanner(file);
        int i = 0;
        while (reader.hasNext()) {
            if (optimize){
                if (i >=8 ) {
                    if (validWords < 4){
                        not_latin_alphabet_language = true;
                        break;
                    }
                    else {
                        if (i >= 10) {
                            if (validWords < 5) {
                                not_latin_alphabet_language = true;
                                break;
                            } else {
                                if (i >= 16) {
                                    if (validWords <= 9) {
                                        not_latin_alphabet_language = true;
                                        break;
                                    } else {
                                        if (i >= 20) {
                                            if (validWords <= 12) {
                                                not_latin_alphabet_language = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (words.contains(charSet.removeIgnorers(reader.next(), new String[]{""}))){
                validWords++;
                if (optimize){
                    validityFactor = (double)validWords/(double)docLength;
                    not_latin_alphabet_language = (validWords <= (cutoff*docLength));
                    if (!not_latin_alphabet_language){
                        break;
                    }
                }
            }
            i++;
        }
        this.validWords = validWords;
//        biggy = new BigArrayStore();
//        words = biggy.central();
//        int docLength = 0;
//        Scanner counter = new Scanner(file);
//        while (counter.hasNext()){if (counter.next() != null){docLength++;}}
//        this.docLength = docLength;
//
//        int validWords = 0;
//        Scanner reader = new Scanner(file);
//        while (reader.hasNext()) {
//            if (words.contains(charSet.removeIgnorers(reader.next(), new String[]{""}))){
//                validWords++;
//                if (optimize){
//                    validityFactor = (double)validWords/(double)docLength;
//                    not_latin_alphabet_language = (validWords <= (cutoff*docLength));
//                    if (!not_latin_alphabet_language){
//                        break;
//                    }
//                }
//            }
//        }
//        this.validWords = validWords;
//        validityFactor = (double)validWords/(double)docLength;
//        not_latin_alphabet_language = (validWords <= (cutoff*docLength));
    }
    public not_latin_alphabet_language(String string, double cutoff) throws InterruptedException {
        this(string, false, true, true, false, cutoff);
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
