package sample;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class AnagramSolverGUI extends StackPane {
    private static CharSet charSet = new CharSet();
    private static Stage s;
    double w;
    double h;
    private static String[][] board;
    private static int[] finalPartsLengths;
    private static String style;
    private static boolean uppercase;
    private static ArrayList<SortableV4> selectedIndices;
    private static ArrayList<ArrayList<AnagramLetter>> anagramLetters;
    private static ArrayList<ArrayList<AnagramLetter>> solvedWordLetters;
    private static ArrayList<ArrayList<AnagramLetter>> finalWordsLetters;
    private static int maxcolumns;
    private static VBox left;
    public AnagramSolverGUI(){this(new int[]{5,5,5,5}, new int[]{4,4}, true);}
    public AnagramSolverGUI(int[] wordLengths, int[] FinalPartsLengths, boolean upperCase){
        super();
        finalPartsLengths = FinalPartsLengths;
        maxcolumns=0;
        uppercase = upperCase;
        board = new String[wordLengths.length][];
        anagramLetters = new ArrayList<>();
        solvedWordLetters = new ArrayList<>();
        finalWordsLetters = new ArrayList<>();
        selectedIndices = new ArrayList<SortableV4>();
        int finalLength = 0;
        for (int l : finalPartsLengths) {
            finalLength += l;
        }
        left = new VBox();
        int ROW = 0;
//        s = (Stage) getScene().getWindow();
        w = 1440;//s.getWidth();
        h = 800;//s.getHeight();
        for (int length : wordLengths) {
            if (length > maxcolumns) {
                maxcolumns = length;
            }
        }
        for (int i = 0; i < wordLengths.length; i++) {
            ArrayList<AnagramLetter> rowList = new ArrayList<>();
            int wordLength = wordLengths[i];
            HBox row = new HBox();
            int COL = 0;
            board[ROW] = new String[wordLength];
            for (int j = 0; j < wordLength; j++) {
                AnagramLetter anagramLetter = new AnagramLetter(w, h, wordLengths.length+1, wordLength);
                style = anagramLetter.btn.getStyle();
                row.getChildren().add(anagramLetter);
                COL++;
                int finalCOL = COL;
                int finalROW = ROW;
                anagramLetter.textArea.setOnKeyTyped(keyEvent -> {handleAnagramInput(anagramLetter, finalROW, finalCOL);});
                anagramLetter.setRow(finalROW);
                anagramLetter.setCol(finalCOL);
                anagramLetter.setOnMouseMoved(mouseEvent -> updateBlue());
                anagramLetter.setOnKeyTyped(keyEvent -> updateBlue());
                rowList.add(anagramLetter);
            }
            ROW++;
            left.getChildren().add(row);
            anagramLetters.add(rowList);
            row.setOnMouseMoved(mouseEvent -> updateBlue());
            row.setOnKeyTyped(keyEvent -> updateBlue());
        }
        VBox right = new VBox();
        for (int i = 0; i < wordLengths.length; i++) {
            ArrayList<AnagramLetter> rowList = new ArrayList<>();
            int wordLength = wordLengths[i];
            HBox row = new HBox();
            for (int j = 0; j < wordLength; j++) {
                AnagramLetter anagramLetter = new AnagramLetter(w, h, wordLengths.length+1, wordLength);
                rowList.add(anagramLetter);
                row.getChildren().add(anagramLetter);
                anagramLetter.setOnMouseMoved(mouseEvent -> updateBlue());
                anagramLetter. setOnKeyTyped(keyEvent -> updateBlue());
            }
            right.getChildren().add(row);
            solvedWordLetters.add(rowList);
            row.setOnMouseMoved(mouseEvent -> updateBlue());
            row. setOnKeyTyped(keyEvent -> updateBlue());
        }
        left.setPadding(new Insets(10,20,0,10));
        right.setPadding(new Insets(10,10,0,20));

        HBox leftright = new HBox();
        leftright.getChildren().addAll(left, right);


        VBox whole = new VBox();
        HBox FinalSolutionHBox = new HBox();
        int widthSum = 0;
        for (int finalPartsLength : finalPartsLengths) {widthSum += finalPartsLength;}
        for (int j = 0; j < finalPartsLengths.length; j++) {
            HBox word = new HBox();
            word.setPadding(new Insets(0, 10, 10, 20));
            ArrayList<AnagramLetter> segment = new ArrayList<>();
            for (int i = 0; i < finalPartsLengths[j]; i++) {
                AnagramLetter anagramLetter = new AnagramLetter(w, h, wordLengths.length + 1, widthSum);
                word.getChildren().add(anagramLetter);
                anagramLetter.setOnMouseMoved(mouseEvent -> updateBlue());
                anagramLetter.setOnKeyTyped(keyEvent -> updateBlue());
                segment.add(anagramLetter);
            }
            finalWordsLetters.add(segment);
            FinalSolutionHBox.getChildren().add(word);
        }
        button settings = new button("Settings", "Settings for the Autosolver of the San Francisco Chronicle's \"Jumble\" Anagram Puzzle", new AnagramSettingsPage(), 20);
        settings.setStyle("-fx-font-size:20pt; -fx-background-color: beige");
        settings.setTextFill(Color.valueOf("#000000"));
        settings.setPadding(new Insets(0,10,0,10));

        Button reset = new Button("Reset");
        reset.setStyle("-fx-font-size:20pt; -fx-background-color: #000000");
        reset.setTextFill(Color.BEIGE);
        reset.setPadding(new Insets(0,10,0,10));

        button help_instructions = new button("Help / Instructions", "Help & Instructions", new AnagramHelpPage(), 20);
        help_instructions.setStyle("-fx-font-size:20pt; -fx-background-color: beige");
        help_instructions.setTextFill(Color.valueOf("#000000"));
        help_instructions.setPadding(new Insets(0,10,0,10));

        Button solve = new Button("Solve");
        solve.setStyle("-fx-font-size:20pt; -fx-background-color: #000000");
        solve.setTextFill(Color.BEIGE);
        solve.setPadding(new Insets(0,10,0,10));


        HBox buttonsHBox = new HBox(settings, reset, help_instructions, solve);
        buttonsHBox.setAlignment(Pos.BASELINE_CENTER);
        whole.getChildren().addAll(leftright, buttonsHBox, FinalSolutionHBox);
        left.setOnMouseMoved(mouseEvent -> updateBlue());
        right.setOnMouseMoved(mouseEvent -> updateBlue());
        leftright.setOnMouseMoved(mouseEvent -> updateBlue());
        setOnMouseMoved(mouseEvent -> updateBlue());
        setOnTouchMoved(touchEvent -> updateBlue());
        reset.setOnAction(actionEvent -> reset());
        solve.setOnAction(actionEvent -> {
            try {
                solve();
                System.out.println("AnagramSolverGUI.java: solve clicked");
            } catch (FileNotFoundException | ManyCombinationsException e) {
                e.printStackTrace();
            }
        });

        getChildren().add(whole);


         setOnKeyTyped(keyEvent -> {
            if (keyEvent.getCode().equals(KeyCode.ENTER)){
                try {
                    solve();
                } catch (FileNotFoundException | ManyCombinationsException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void reset(){
        selectedIndices.clear();
        for (int i = 0; i < anagramLetters.size(); i++) {
            ArrayList<AnagramLetter> row = anagramLetters.get(i);
            for (int j = 0; j < row.size(); j++) {
                AnagramLetter anagramLetter = row.get(j);
                anagramLetter.setSelected(false);
                anagramLetter.textArea.setText("");
                anagramLetter.btn.setStyle("");
            }
        }
        for (int i = 0; i < solvedWordLetters.size(); i++) {
            ArrayList<AnagramLetter> row = solvedWordLetters.get(i);
            for (int j = 0; j < row.size(); j++) {
                AnagramLetter anagramLetter = row.get(j);
                anagramLetter.setSelected(false);
                anagramLetter.textArea.setText("");
                anagramLetter.btn.setStyle("");
            }
        }
        for (int i = 0; i < finalWordsLetters.size(); i++) {
            ArrayList<AnagramLetter> row = solvedWordLetters.get(i);
            for (int j = 0; j < row.size(); j++) {
                AnagramLetter anagramLetter = row.get(j);
                anagramLetter.textArea.setText("");
                anagramLetter.btn.setStyle("");
            }
        }
    }
    private void solve() throws FileNotFoundException, ManyCombinationsException {
        System.out.println("AnagramSolverGUI.java: solve initiated");
        boolean full = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].replaceAll("\s", "").equals("")){
                    full = false;
                }
            }
        }
        if (full){
            String[] solutions = new String[board.length];
            for (int i = 0; i < board.length; i++) {
                String anagram = "";
                for (int j = 0; j < board[i].length; j++) {
                    anagram+=board[i][j];
                }
                System.out.println(anagram);
                AnagramSolver anagramSolver = new AnagramSolver(anagram);
                ArrayList<a> validWords = anagramSolver.getValidWords();
                a solutiona;
//                String errorMessage = "!".repeat(anagram.length());
                if (!validWords.isEmpty()){solutiona= validWords.get(0);}
                else{solutiona=new a("", 0);}
                String solution = solutiona.getWord();
                solutions[i] = solution;
            }
            for (int i = 0; i < solutions.length; i++) {
                String solution = solutions[i];
                if (uppercase){solution = solution.toUpperCase();}
                System.out.println(solution);
                ArrayList<AnagramLetter> row = solvedWordLetters.get(i);
                char[] ch = solution.toCharArray();
                for (int j = 0; j < ch.length; j++) {
                    AnagramLetter anagramLetter = row.get(j);
                    anagramLetter.textArea.setText(String.valueOf(ch[j]));
                    row.set(j, anagramLetter);
                }
                solvedWordLetters.set(i, row);
            }
            ArrayList<String> finalLettersBank = new ArrayList<>();
            for (int i = 0; i < solvedWordLetters.size(); i++) {
                ArrayList<AnagramLetter> row = solvedWordLetters.get(i);
                for (int j = 0; j < row.size(); j++) {
                    AnagramLetter anagramLetter = row.get(i);
                    if (anagramLetter.isSelected()){
                        finalLettersBank.add(anagramLetter.textArea.getText());
                    }
                }
            }
            JumbleFinaleSolver jfs = new JumbleFinaleSolver(finalLettersBank, finalPartsLengths);
            String[][][] options = jfs.get();
            String[][] primo = options[0];
            for (int i = 0; i < primo.length; i++) {
                String[] word = primo[i];
                ArrayList<AnagramLetter> letterGroup = finalWordsLetters.get(i);
                for (int j = 0; j < word.length; j++) {
                    letterGroup.get(i).textArea.setText(word[i]);
                }
            }
        }
    }
    public static void handleAnagramInput(AnagramLetter anagramLetter, int finalROW, int finalCOL){
            String t = anagramLetter.textArea.getText();
            String str = "";
            String x = t.replaceAll("\s", "");
            if (!t.equals("") && t != null && !x.equals("")&&x!=null) {
                if (x.length() > 1 && anagramLetter.equals(anagramLetter.getParent().getChildrenUnmodifiable().get(0))){
                    int rowIndex = anagramLetter.getParent().getParent().getChildrenUnmodifiable().indexOf(anagramLetter.getParent());
                    HBox row = (HBox) left.getChildren().get(rowIndex);
                    if (x.length()==row.getChildren().size()){
                        char[] ch = x.toCharArray();
                        for (int i = 0; i < ch.length; i++) {
                            AnagramLetter anagramLetter1 = (AnagramLetter) row.getChildren().get(i);
                            anagramLetter1.textArea.setText(String.valueOf(ch[i]));
                            board[finalROW][i] = String.valueOf(ch[i]);
                        }
                        str = String.valueOf(x.charAt(0));
                        board[finalROW][finalCOL - 1] = str;
                    }
                }
                else {
                str = String.valueOf(x.charAt(0));}
                board[finalROW][finalCOL - 1] = str;
            }
    }
    public static void updateBlue(){
        for (ArrayList<AnagramLetter> rowList : anagramLetters) {
            for (AnagramLetter anagramLetter : rowList) {
                if (anagramLetter.isSelected()) {
                    selectedIndices.add((new SortableV4(anagramLetter.getRow(), (double) anagramLetter.getCol())));
                }
                else {
                    for (int i = 0; i < selectedIndices.size(); i++) {
                        SortableV4 checking = selectedIndices.get(i);
                        if (checking.get_integer() == anagramLetter.getRow() && checking.get_double() == anagramLetter.getCol()){
                            selectedIndices.remove(i);
                        }
                    }
                }
            }
        }
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                int col = charSet.doubleToint(column);
                ArrayList<AnagramLetter> tempRow = solvedWordLetters.get(row);
                AnagramLetter tempLetter = tempRow.get(col);
                tempLetter.btn.setStyle(style);
//                tempLetter.textArea.setText(anagramLetters.get(row).get(col).textArea.getText());
                tempRow.set(col, tempLetter);
                solvedWordLetters.set(row, tempRow);
            }
        }
        for (SortableV4 sv4 : selectedIndices) {
            int row = sv4.get_integer();
            double column = sv4.get_double();
            int col = charSet.doubleToint(column - 1);
            ArrayList<AnagramLetter> tempRow = solvedWordLetters.get(row);
            AnagramLetter tempLetter = tempRow.get(col);
            tempLetter.btn.setStyle("-fx-background-color: blue;");
//            tempLetter.textArea.setText(anagramLetters.get(row).get(col).textArea.getText());
            tempRow.set(col, tempLetter);
            solvedWordLetters.set(row, tempRow);
        }
    }
    public static String getStageTitle(){
        return "Autosolve the San Francisco Chronicle's \"Jumble\" Anagram Puzzle";
    }
}
