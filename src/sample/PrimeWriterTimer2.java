package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeWriterTimer2 {
    public PrimeWriterTimer2() throws IOException {
        FileWriter x = new FileWriter(new File("src/sample/2x.txt"));
        FileWriter y = new FileWriter(new File("src/sample/2y.txt"));
        long start = System.nanoTime();
        for (int i = 2; i < 300000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                long end = System.nanoTime();
                long duration = end-start;
                x.write(String.valueOf(i)+"\n");
                y.write(String.valueOf(duration)+"\n");
            }
        }
        x.close();
        y.close();
    }
    public static void main(String[] args) throws IOException {
        new PrimeWriterTimer2();
    }
}

