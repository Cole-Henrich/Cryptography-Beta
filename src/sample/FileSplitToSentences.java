package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileSplitToSentences extends ArrayList<String> {
    private final CharSet charSet = new CharSet();
    private File file;
    public FileSplitToSentences(File file) throws IOException {
        String s = charSet.FileToString(file);
        // ["’]?[A-Z][^.?!]+((?![.?!][’"]?\s["’]?[A-Z][^.?!]).)+[.?!’"]+
//        Pattern pattern = Pattern.compile("[\"’]?[A-Z][^.?!]+((?![.?!][’\"]?\\s[\"’]?[A-Z][^.?!]).)+[.?!’\"]+");
//        String[] split = s.split(pattern.pattern());
        Pattern endSentence = Pattern.compile("[\\.]");
        String[] split = s.split(endSentence.pattern());
        for (String str:split){
            add(str+". ");
        }
        System.out.println(this);
    }
    public File getFile() {
        return file;
    }
    public FileSplitToSentences(int initialCapacity){
        super(initialCapacity);
    }
    public FileSplitToSentences(Collection<? extends String> c){
        super(c);
    }
}
