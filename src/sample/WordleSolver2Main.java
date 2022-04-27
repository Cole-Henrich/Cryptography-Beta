package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class WordleSolver2Main {
    public static void main(String[] args) {
        System.out.println("""
                Enter the data in the following string format:
                "Enter letters not at all in the Wordle:"
                abcdefg
                "Enter the formatted data:"
                [][][][][]
                What comes before the curly bracket are the Wordle's gray letters, the letters that are not in the word.
                In between brackets [] is the data on one particular space. A five letter word would have five pairs of brackets: [][][][][]
                You will use an exclamation mark, ! ,  to represent that what comes after is a letter in the word but not in that spot (a yellow letter). Enter it like [!A]. If you have a green letter, enter it like [B].
                For example:
                You enter "OATEN"
                The Wordle responds, "OAT<E>N (<X>, since I can't show colors, is my notation for the Wordle responding green (right letter, right place). /X/ is my notation for the Wordle responding yellow (right letter, wrong place))
                If you want to run the program, enter, after the prompt "Enter letters not at all in the Wordle:"
                                
                oatn
                                
                and enter, after the prompt "Enter the formatted data:"
                                
                [][][][e][]
                                
                The program runs and suggests something. Let's say it is "shred"
                The Wordle responds, "SH/R/<E>D". Enter into the program
                                
                sh
                [][][!r][e][]
                                
                Let's say the program suggests "river".\s
                The Wordle responds "/R//I/V<E>R". Enter into the program
                                
                v
                r1
                [!r][!i][][e][]
                                
                Notes that r1 means that r only occurs once, because the Wordle said that the second r in RIVER was gray.
                Let's say the program suggests "grief".\s
                The Wordle responds...you win!
                                
                So, if you understand how to enter the input, type it in now:
                """);
        recur(null);
    }
    private static int count = 0;
    private static void recur(ArrayList<Character> lettersNotIn){
        System.out.println("Enter letters not at all in the Wordle:");
        Scanner scanner = new Scanner(System.in);
        StringBuilder notIn = new StringBuilder(scanner.nextLine());
        for (Character letterNotIn : lettersNotIn) {
            notIn.append(letterNotIn);
        }
        System.out.println("Enter the formatted data:");
        String data = scanner.nextLine();
        WordleSolver2Logic logic = new WordleSolver2Logic(notIn.toString(), data);
        System.out.println(logic.get());
        if (count < 6) {
            count++;
//            recur(logic.getLettersNotIn());
        }
    }
}
