//import sample.FifthJumblerSolver;
//
//import java.util.Scanner;
//
//public class FifthJumblerSolverRunner {
//    public static void main(String[] args) {
//        System.out.println("Enter the sequence of letters derived from solving the first for jumble parts, in any order; there is no need for capitalization or spacing.");
//        Scanner letterScanner = new Scanner(System.in);
//        String letters = letterScanner.next();
//        letterScanner.close();
//        System.out.println("Enter the length of the first part of the fifth jumble, as an integer:");
//        Scanner l1Scanner = new Scanner(System.in);
//        int l1 = Integer.parseInt(l1Scanner.next());
//        l1Scanner.close();
//        System.out.println("Enter the length of the second part of the fifth jumble, as an integer:");
//        Scanner l2Scanner = new Scanner(System.in);
//        int l2 = Integer.parseInt(l2Scanner.next());
//        l2Scanner.close();
//        System.out.println("The program is now calculating, and when done, it will display phrases that are likely to be the answer, with what the algorithm has computed as most likely at the top.");
//        FifthJumblerSolver solver = new FifthJumblerSolver(letters, l1, l2);
//    }
//}
