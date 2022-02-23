package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permute {
    private ArrayList<String> permutations;
    public ArrayList<String> get() {
        return permutations;
    }
    private static String toString(ArrayList<String> arraylist){
        StringBuilder sb = new StringBuilder();
        for (String s:arraylist){
            sb.append(s);
        }
        return sb.toString();
    }
    public Permute(ArrayList<String> arrayList, int start, int end){
        this(toString(arrayList), start, end);
    }
    public Permute(String string, int start, int end){
        permutations = new ArrayList<>();
         generatePermutation(string, start, end);
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

    public static void main(String[] args)
    {
        String str = "cathed";
        System.out.println("All the permutations of the string are: ");
        Permute permute = new Permute(str, 0, str.length());
        System.out.println(permute.get());
    }

    //Function for generating different permutations of the string
    public void generatePermutation(String str, int start, int end)
    {
        //Prints the permutations
        if (start == end-1) {
            permutations.add(str);
        }
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

//package sample;
//
//public class Permute {
//    public Permute(String string){
//        generatePermutation(string, 0, string.length());
//    }
//    //Function for swapping the characters at position I with character at position j
//    public static String swapString(String a, int i, int j) {
//        char[] b =a.toCharArray();
//        char ch;
//        ch = b[i];
//        b[i] = b[j];
//        b[j] = ch;
//        return String.valueOf(b);
//    }
//
//    public static void main(String[] args)
//    {
//        String str = "cathed";
//        int len = str.length();
//        System.out.println("All the permutations of the string are: ");
//        generatePermutation(str, 0, len);
//    }
//
//    //Function for generating different permutations of the string
//    public static void generatePermutation(String str, int start, int end)
//    {
//        //Prints the permutations
//        if (start == end-1)
//            System.out.println(str);
//        else
//        {
//            for (int i = start; i < end; i++)
//            {
//                //Swapping the string by fixing a character
//                str = swapString(str,start,i);
//                //Recursively calling function generatePermutation() for rest of the characters
//                generatePermutation(str,start+1,end);
//                //Backtracking and swapping the characters again.
//                str = swapString(str,start,i);
//            }
//        }
//    }
//}