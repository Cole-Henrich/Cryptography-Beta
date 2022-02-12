package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Quote {
    private Person Author;
    private FileSplitToSentences inspiration;
    private String quote;
    private final CharSet charSet = new CharSet();
    public Quote(FileSplitToSentences inspiration, Person author, int length) throws FileNotFoundException {
        setAuthor(author);
        setQuote(charSet.selectRandomBlockOfSentences(inspiration, length, true));
    }
    public void setQuote(String quote) {
        this.quote = quote;
    }
    public String getQuote() {
        return quote;
    }
    public Person getAuthor() {
        return Author;
    }
    public void setInspiration(FileSplitToSentences inspiration) {
        this.inspiration = inspiration;
    }
    public FileSplitToSentences getInspiration() {
        return inspiration;
    }
    public void setAuthor(Person author) {
        this.Author = author;
    }
}
