package sample;

import java.util.ArrayList;

public class StringPermutations extends ArrayList<String> {
    public StringPermutations(String str){
        generatePermutation(str, 0, str.length());
    }
    //Function for swapping the characters at position I with character at position j
    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    //Function for generating different permutations of the string
    public void generatePermutation(String str, int start, int end)
    {
        //Prints the permutations
        if (start == end-1)
            add(str);
        else
        {
            for (int i = start; i < end; i++)
            {
                //Swapping the string by fixing a character
                str = swapString(str,start,i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(str,start+1,end);
                //Backtracking and swapping the characters again.
                str = swapString(str,start,i);
            }
        }
    }
}