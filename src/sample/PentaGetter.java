package sample;

import java.io.File;
import java.io.FileNotFoundException;

public class PentaGetter extends NGetter  {
    public PentaGetter() throws FileNotFoundException {
        super(new CharSet().getLanguage_Manipulation_UniqueWords_TrainerReservoir(), new File("/Users/cole.henrich/Documents/MOOD/Ciphers/src/PentaStatic.txt"), 5);
    }
}
