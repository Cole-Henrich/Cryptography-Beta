package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;
/**
 * <p>Title: IC (Index of Coincidence)</p>
 * <p>Description: Calculates the Index of Coincidence of a string.
 * The index of coincidence is defined to be the sum[fi(fi-1)]/N(N-1)
 * where fi is the frequency of the ith letter of the alphabet and N
 * is the total number of characters in the sample.</p>
 * @author Meghan Emilio
 * @version 1.0
 */

public class FindIndexOfCoincidence {
    private double IOC;
    private static final CharSet charSet = new CharSet(1);
    public FindIndexOfCoincidence(File file) throws IOException {
        long start = System.currentTimeMillis(); // start timing
        BufferedReader f = new BufferedReader(new FileReader(file));
        String plaintext = f.readLine();
        int[] charfrequency = new int[26];
        int i = 0;
        int j =  0;
        int textlength = 0;
        while(i < plaintext.length()) {
            char c  = plaintext.charAt(i);
            j = (int) c - (int) 'A';
            if(j >= 0 && j <= 25) {
                charfrequency[j]++;
                textlength++;
            }
            i++;
            j = 0;
        }
        double ic = 0;
        for(int k = 0; k < 26; k++)
            ic += charfrequency[k] * (charfrequency[k] - 1);
        ic /= textlength * (textlength - 1);
        IOC = ic;
    }
    public FindIndexOfCoincidence() throws IOException {
        this(charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir());
    }
    public FindIndexOfCoincidence(String s) throws IOException {

    }


    /**
     *returns the IC of the input string
     *@param s the text for which the IC will be calculated
     *@return double the IC of the inputted text
     */
    public double calculate(String s){

        int i;
        int N = 0;
        double sum = 0.0;
        double total = 0.0;
        s = s.toUpperCase();

        //initialize array of values to count frequency of each letter
        int[] values = new int[26];
        for(i=0; i<26; i++){
            values[i] = 0;
        }

        //calculate frequency of each letter in s
        int ch;
        for(i=0; i<s.length(); i++){
            ch = s.charAt(i)-65;
            if(ch>=0 && ch<26){
                values[ch]++;
                N++;
            }
        }

        //calculate the sum of each frequency
        for(i=0; i<26; i++){
            ch = values[i];
            sum = sum + (ch * (ch-1));
        }

        //divide by N(N-1)
        total = sum/(N*(N-1));

        //return the result
        return total;

    }

    public double getIOC() {return IOC;}
    public static void main(String[] args) throws IOException {
        FindIndexOfCoincidence test = new FindIndexOfCoincidence();
        System.out.println("The index of coincidence is " + test.getIOC() + ".");

    }
}
