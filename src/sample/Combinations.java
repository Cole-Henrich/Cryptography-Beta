package sample;// Java program to print all

// possible strings of length k

import java.util.ArrayList;

class Combinations extends ArrayList<String> {

    public Combinations(String set, int desiredResultLength) {
        printAllKLength(set.toCharArray(), desiredResultLength);
    }

    // The method that prints all
    // possible strings of length k.
    // It is mainly a wrapper over
    // recursive function printAllKLengthRec()
     void printAllKLength(char[] set, int k) {
        int n = set.length;
        printAllKLengthRec(set, "", n, k);
    }

    // The main recursive method
    // to print all possible
    // strings of length k
     void printAllKLengthRec(char[] set, String prefix, int n, int k) {

        // Base case: k is 0,
        // print prefix
        if (k == 0) {
            add(prefix);
            return;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i) {

            // Next character of input added
            String newPrefix = prefix + set[i];

            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix, n, k - 1);
        }
    }
    // Driver Code
    public static void main(String[] args) {
      Combinations c = new Combinations("daffipo", 4);
        System.out.println(c);
    }
}
