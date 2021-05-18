package sample;

import java.io.File;
import java.io.FileNotFoundException;

public class HexaGetter extends NGetter  {
   public HexaGetter() throws FileNotFoundException {
       super(new File("/Users/cole.henrich/Documents/MOOD/Ciphers/src/HexaReservoir.txt"), new File("/Users/cole.henrich/Documents/MOOD/Ciphers/src/HexaStatic.txt"), 6);
   }
}

