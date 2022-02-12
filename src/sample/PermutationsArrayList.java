package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsArrayList extends ArrayList<ArrayList<String>> {
    private static ArrayList<ArrayList<String>> surrogate = new ArrayList<>();
    public PermutationsArrayList(String[] source){
        addAllRecursive(source.length, source);
        addAll(surrogate);

    }
    private static void swap(String[] input, int a, int b) {
        String tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    public static void addAllRecursive(int n, String[] elements) {
        if(n == 1) {
            surrogate.add(new ArrayList<>(Arrays.asList(elements)));
        } else {
            for(int i = 0; i < n-1; i++) {
                addAllRecursive(n - 1, elements);
                if(n % 2 == 0) {
                    swap(elements, i, n-1);
                } else {
                    swap(elements, 0, n-1);
                }
            }
            addAllRecursive(n - 1, elements);
        }
    }

    public static void main(String[] args) {
        String[] testArray = new String[]{"a", "b", "c", "d", "e", "f","g", "h", "i", "j"};
        PermutationsArrayList test = new PermutationsArrayList(testArray);
        System.out.println(test);
        System.out.println(test.size());
    }
}
