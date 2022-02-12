package sample;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnagramSolverRunner {
    public static void main(String[] args) throws ManyCombinationsException, FileNotFoundException {
        System.out.println("""
                Enter the sequence of characters which you want to be unscrambled by this program.\s
                After you enter it, the program will create every sequence of characters possible from your input (behind the scenes), then count the number of times each sequence appears in a large file of text representative of the English Language, then sort each sequence based on that count, thereby ranking them in the order of those sequences that occur most frequently in the representative text, which presumably simultaneously puts the most common and most valid words at the top (invalid being sequences that are not words). The program will select only words that occur 0.00005 of the time (0.005%) or more; however, you can command it to change that number by inserting your preferred decimal in parentheses after your word. Add a space after your word, then an open parenthesis, then the decimal, then a closed parenthesis. You do not *need* to do this; omitting it simply means that the program will use the default number. If you want only very common words, raise the decimal. It is probably unwise to raise the number above 0.005 (100 times the default), as a rule of thumb. The program will display a list of the possible solutions ranked by those most commonly occurring at the top, when it is finished. Understand that the options are ranked by their frequency in the English language, and not by the likelihood that the author has indeed used one as the anagram's solution. The second condition is much more difficult to determine, even for a human; however, if a human has hints (for example as to the theme of the word) the human may be able to deduce that some options are more probable than others, even if they occur less frequently in English. Because this program is strictly run by a computer, it uses MATH. Its three operations are:
                1. Creating all possible combinations of a letterset.
                2. Counting the occurrences of each of these combinations as found in a large set of text representing the English language.\s
                3. Ranking the combinations by their occurrences.
                The optimum performance in anagram-cracking would occur through human-computer synergy. The process would be:
                1. Computer provides mathematical facts about input data.
                2. Human makes abstract connections between given facts and other knowledge, then makes the decision, which hopefully is the right one and solves the anagram. If the human later realizes that it has been mistaken, the human reexamines the facts given by the computer, and coupled with the human's new knowledge which in some way informed the human that it was initially wrong, the human makes a new decision, which is hopefully right; if not, it reexamines the facts again, and again, until the human cracks the anagram.
                This duo works because the computer provides the facts, and the human makes the decision. We should say that the human cracks the anagram, not the computer. The only situation where we could credit the computer is if the program returns only one valid English word with the given input, in which case the computer has an overwhelming chance of having correctly selected the solution-letterset. However, the human still has the final call, because the computer can only provide facts, not decisions.\s
                """);
        Scanner in = new Scanner(System.in);
        String next = in.next();
        if (next != null){
            String noParens = next;
            noParens = noParens.replaceAll("\\s\\(.*\\)", "");
            AnagramSolver anagramSolver;
            if (noParens.length() != next.length()){
                String onlyParens = next;
                onlyParens = onlyParens.replaceAll(noParens, "");
                String insideParens = onlyParens;
                insideParens = insideParens.replaceAll("[\\(\\)]", "");
                double minimumFrequency = Double.parseDouble(insideParens);
                anagramSolver = new AnagramSolver(next, minimumFrequency);
            }
            else {
                anagramSolver = new AnagramSolver(next);
            }
        }
        // hello (0.0005)
    }
}
