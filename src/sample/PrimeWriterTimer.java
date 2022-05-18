package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeWriterTimer {
    public PrimeWriterTimer() throws IOException {
        FileWriter x = new FileWriter(new File("src/sample/PrimeWriterTimerX.txt"));
        FileWriter y = new FileWriter(new File("src/sample/PrimeWriterTimerY"));
        for (int i = 2; i < 200000; i++) {
            boolean isPrime = true;
            long start = System.nanoTime();
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
        new PrimeWriterTimer();
    }
}

