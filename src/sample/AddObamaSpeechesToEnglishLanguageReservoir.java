package sample;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * When running this program beware of creating duplicates. Search for and delete the last chunked addition
 * (there will be tens of speeches all stacked on top of each other), then run this.
 */
public class AddObamaSpeechesToEnglishLanguageReservoir {
    public static void main(String[] args) throws Exception {
        String targetDir = "/Users/cole.henrich/Desktop/Barack-Obama";//"Path to your directory of input files";
        String outputFile = "src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt";

        File dir = new File(targetDir);
        File[] files = dir.listFiles(new FilenameFilter() {
            // Only get files that end with .txt
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        });

        // Read all file lines into a List
        List<String> inputFileLines = new ArrayList<>();
        for (File file : files) {
            inputFileLines.addAll(Files.readAllLines(Paths.get(file.getAbsolutePath())));
        }

        // Write the List to the console
        for (String line : inputFileLines) {
            System.out.println(line);
        }

        // Write the List to a single file
        Files.write(Paths.get(outputFile), inputFileLines, StandardOpenOption.CREATE);
    }
}
