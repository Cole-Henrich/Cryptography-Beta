package sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordleSolverMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        ArrayList<Character> not = new ArrayList<>();
        ArrayList<Character> wrongplace = new ArrayList<>();
        String correct = "_____";
        System.out.println("If the wordle is solved, enter \"solved\" or \"done\"");
//        System.out.println("How many results do you want to be shown?");
//        Scanner numSc = new Scanner(System.in);
//        int num = numSc.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("enter the letters not in it (for example abc):");
            Scanner scanner = new Scanner(System.in);
            String l1 = scanner.nextLine();
            if (l1.contains("solved") || l1.contains("done")){break;}
            char[] notchars = l1.toCharArray();
            for (char n : notchars) {not.add(n);}

            System.out.println("enter the letters in it but in the wrong place:");
            String l2 = scanner.nextLine();
            if (l2.contains("solved") || l2.contains("done")){break;}
            char[] wrongPlaceChars = l2.toCharArray();
            for (char w : wrongPlaceChars) {wrongplace.add(w);}

            System.out.println("enter the parts of the word you know, with underscores for unknown places (for example a_b_c");
            String known = scanner.nextLine();
            if (known.contains("solved") || known .contains("done")){break;}

            WordleSolverLogic logic = new WordleSolverLogic(not, wrongplace, known, 10/*num*/);
            ArrayList<String> got = logic.get();
            for (String s : got) {
                System.out.println(s);
            }
        }
    }
}
