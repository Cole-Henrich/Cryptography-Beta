package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeWriter extends FileWriter {
    public PrimeWriter(File file) throws IOException {
        super(file);
        StringBuilder s = new StringBuilder();
        s.append("""
                package sample;
                                
                import java.util.ArrayList;
                import java.util.Arrays;
                                
                public class PrimeStore {
                    public static ArrayList<Integer> primes = new ArrayList<>(
                            Arrays.asList(
                """);
        //Long.MAX_VALUE = 9,223,372,036,854,775,807
        for (long i = 2; i < Math.pow(10, 9); i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.err.println(i);
                s.append(i).append(",");
            }
        }
        s.append("""
                        )
                    );
                }
                """);
        String S = s.toString();
        this.write(S);
    }
    public PrimeWriter() throws IOException {
        this(new File("sample/PrimeStore.java"));
    }

    public static void main(String[] args) throws IOException {
        new PrimeWriter();
    }
}