package sample;

import java.io.File;

public class Filepackage {
    private File mistaken;
    private File corrected;
    public Filepackage(File Mistaken, File Corrected) {
        mistaken = Mistaken;
        corrected = Corrected;
    }

    public File getMistaken() {
        return mistaken;
    }

    public File getCorrected() {
        return corrected;
    }
}
