package sample;

import java.io.File;
import java.io.FileNotFoundException;

public class PentaGetter extends NGetter  {
    public PentaGetter() throws FileNotFoundException {
        super(new File("/Users/cole.henrich/Documents/MOOD/Ciphers/src/PentaReservoir.txt"), new File("/Users/cole.henrich/Documents/MOOD/Ciphers/src/PentaStatic.txt"), 5);
    }
}
