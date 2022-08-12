package sample;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;

public class AnagramSettingsPage extends StackPane {
    private CharSet charSet = new CharSet();
    private LabeledTextAreaInHBox numWordsHBox;
    private LabeledTextAreaInHBox numFinalWordsHBox;
    private VBox whole;
    private int numWords;
    private int numFinalWords;
    private int box1maxwidth;
    private int maxWordLength;
    private int maxNumWords;
    private int maxNumFinalWords;
    private int maxFinalWordLength;
    private final int defaultNumFinalWords = 2;
    private final int defaultNumWords = 4;
    private final int defaultWordLength = 5;
    private final int defaultFinalWordLength = 4;
    private Label msg;
    private StackPane box1;
    private ArrayList<LabeledTextAreaInHBox> setters;
    private ArrayList<LabeledTextAreaInHBox> finalSetters;
    private ArrayList<Integer> wordLengths;
    private ArrayList<Integer> finalPartsLengths;
    private HBox finalWordsLengthsHBox;
    private Text text1;
    private button SaveSettings;
    private boolean upperCase;
    public AnagramSettingsPage() {
        super();
        upperCase = true;
        maxWordLength = 20;
        maxFinalWordLength = 20;
        wordLengths = new ArrayList<>();
        finalPartsLengths = new ArrayList<>();
        setters = new ArrayList<>();
        finalSetters = new ArrayList<>();
        box1maxwidth=500;
        SaveSettings = new button("Save Settings");
        SaveSettings.setStyle("-fx-background-color: lightblue; -fx-font-size:25pt;");
        numWordsHBox = new LabeledTextAreaInHBox("Number of words:", String.valueOf(defaultNumWords));
        numFinalWordsHBox = new LabeledTextAreaInHBox("Number of words in the final multi-word anagram:", String.valueOf(defaultNumFinalWords));
        text1 = new Text("Enter the number of letters in each final word below:");
        text1.setStyle("-fx-font-size:20pt;");
        whole = new VBox();
        numWords = 4;
        maxNumWords = 20;
        maxNumFinalWords = 20;
        finalWordsLengthsHBox = new HBox();
        finalWordsLengthsHBox.setPadding(new Insets(10,10,10,0));
        whole.getChildren().add(numWordsHBox);
        getChildren().add(whole);
        numWordsHBox.textArea.setOnKeyTyped(keyEvent -> {updateNumWords();});
        numFinalWordsHBox.textArea.setOnKeyTyped(keyEvent -> {updateNumFinalWords();});
        SaveSettings.setOnAction(actionEvent -> {
                Parent root = new AnagramSolverGUI(charSet.IntegerArrayListToIntArray(wordLengths), charSet.IntegerArrayListToIntArray(finalPartsLengths), true);
                Stage s = (Stage) getScene().getWindow();
                s.setMinWidth(200);
                s.setMinHeight(200);
                s.setTitle(AnagramSolverGUI.getStageTitle());
                s.setScene(new Scene(root, 1440, 800));
                s.show();
        });
        setPadding(new Insets(50,50,50,50));
        updateNumWords();
        updateNumFinalWords();
        updateFinalPartsLengths();
    }
    private void updateNumFinalWords(){
        String value = numFinalWordsHBox.textArea.getText();
        if (!value.isEmpty()){
            if (charSet.isNumeric(value)){
                int setVal = Integer.parseInt(value);
                if (setVal>maxNumFinalWords){
                    setVal=maxNumFinalWords;
                    new FlashWarning((Stage) getScene().getWindow(), "Number of words cannot exceed "+maxNumFinalWords,box1maxwidth);
                    numFinalWordsHBox.textArea.clear();
                }
                numFinalWords = setVal;
            }
            else {
                new FlashWarning((Stage) getScene().getWindow(),"Enter only integers represented by Arabic numerals, e.g., 12",box1maxwidth);
                numFinalWordsHBox.textArea.clear();
                numFinalWordsHBox.textArea.setText(String.valueOf(defaultNumFinalWords));
                numFinalWords = defaultNumFinalWords;
            }
        }
        else {
            numFinalWords = defaultNumFinalWords;
        }

//        clear();
        getChildren().remove(whole);
        whole.getChildren().remove(numFinalWordsHBox);
        whole.getChildren().remove(finalWordsLengthsHBox);
        whole.getChildren().remove(text1);
        for (LabeledTextAreaInHBox l:finalSetters){
            whole.getChildren().remove(l);
        }
        for (LabeledTextAreaInHBox l:finalSetters){
            finalWordsLengthsHBox.getChildren().remove(l);
        }
        finalSetters.clear();
        whole.getChildren().remove(SaveSettings);
        for (int i = 0; i < numFinalWords; i++) {
            LabeledTextAreaInHBox lengthOfWordNumberX = new LabeledTextAreaInHBox("#"+(i+1), String.valueOf(defaultFinalWordLength));
            lengthOfWordNumberX.setPadding(new Insets(10,10,10,10));
            lengthOfWordNumberX.textArea.setOnKeyTyped(keyEvent -> {updateFinalPartsLengths();});
            finalSetters.add(lengthOfWordNumberX);
        }
        whole.getChildren().addAll(numFinalWordsHBox, text1);
        for (LabeledTextAreaInHBox l:finalSetters){
            finalWordsLengthsHBox.getChildren().add(l);
        }
        whole.getChildren().add(finalWordsLengthsHBox);
        whole.getChildren().add(SaveSettings);
        getChildren().add(whole);

//        rebuild();
    }
    private void updateFinalPartsLengths(){
        finalPartsLengths.clear();
        for (int i = 0; i < finalSetters.size(); i++) {
            LabeledTextAreaInHBox l = finalSetters.get(i);
            String value = l.textArea.getText();
            if (!value.isEmpty()) {
                if (charSet.isNumeric(value)) {
                    int setVal = Integer.parseInt(value);
                    if (setVal > maxFinalWordLength) {
                        setVal = maxFinalWordLength;
                        if (getScene() != null) {
                            new FlashWarning((Stage) getScene().getWindow(), "Word length cannot exceed "+maxFinalWordLength, box1maxwidth);
                        }
                        l.textArea.clear();
                    }
                    finalPartsLengths.add(setVal);
                } else {
                    if (getScene() != null) {
                        new FlashWarning((Stage) getScene().getWindow(), "Enter only integers represented by Arabic numerals, e.g., 12", box1maxwidth);
                    }
                    l.textArea.clear();
                }
            }
        }
    }
    private void updateNumWords(){
        String value = numWordsHBox.textArea.getText();
        if (!value.isEmpty()){
            if (charSet.isNumeric(value)){
                int setVal = Integer.parseInt(value);
                if (setVal>maxNumWords){
                    setVal=maxNumWords;
                    new FlashWarning((Stage) getScene().getWindow(), "Number of words cannot exceed "+maxNumWords,box1maxwidth);
                    numWordsHBox.textArea.clear();
                    numWordsHBox.textArea.setText(String.valueOf(maxNumWords));
                }
                numWords = setVal;
            }
            else {
                new FlashWarning((Stage) getScene().getWindow(),"Enter only integers represented by Arabic numerals, e.g., 12",box1maxwidth);
                numWordsHBox.textArea.clear();
                numWordsHBox.textArea.setText(String.valueOf(defaultNumWords));
                numWords = defaultNumWords;
            }
        }
        else {
            numWords = defaultNumWords;
        }
        clear();
        for (int i = 0; i < numWords; i++) {
            LabeledTextAreaInHBox lengthOfWordNumberX = new LabeledTextAreaInHBox("Number of letters in word #"+(i+1), String.valueOf(defaultWordLength));
            lengthOfWordNumberX.textArea.setOnKeyTyped(keyEvent -> {updateWordLengths();});
            setters.add(lengthOfWordNumberX);
        }
        rebuild();
        updateWordLengths();
    }
    private void updateWordLengths(){
        wordLengths.clear();
        for (int i = 0; i < setters.size(); i++) {
            LabeledTextAreaInHBox l = setters.get(i);
            String value = l.textArea.getText();
            if (!value.isEmpty()) {
                if (charSet.isNumeric(value)) {
                    int setVal = Integer.parseInt(value);
                    if (setVal > maxWordLength) {
                        setVal = maxWordLength;
                        if (getScene() != null) {
                            new FlashWarning((Stage) getScene().getWindow(), "Word length cannot exceed "+maxWordLength, box1maxwidth);
                        }
                        l.textArea.clear();
                    }
                    wordLengths.add(setVal);
                } else {
                    if (getScene() != null) {
                        new FlashWarning((Stage) getScene().getWindow(), "Enter only integers represented by Arabic numerals, e.g., 12", box1maxwidth);
                    }
                    l.textArea.clear();
                }
            }
        }
    }
    private void clear(){
        whole.getChildren().remove(numFinalWordsHBox);
        whole.getChildren().remove(text1);
        whole.getChildren().remove(finalWordsLengthsHBox);
        whole.getChildren().remove(SaveSettings);
        getChildren().remove(whole);
        for (LabeledTextAreaInHBox l : finalSetters) {
            finalWordsLengthsHBox.getChildren().remove(l);
        }
        finalSetters.clear();
        for (LabeledTextAreaInHBox l : setters) {
            whole.getChildren().remove(l);
        }
        setters.clear();
        getChildren().remove(whole);
    }
    private void rebuild(){
        for (LabeledTextAreaInHBox l:setters){whole.getChildren().add(l);}
        for (LabeledTextAreaInHBox l:finalSetters){finalWordsLengthsHBox.getChildren().add(l);}
        whole.getChildren().addAll(numFinalWordsHBox, text1, finalWordsLengthsHBox, SaveSettings);
        getChildren().add(whole);
    }
}
