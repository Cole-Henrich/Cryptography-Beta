package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

@SuppressWarnings("MagicNumber")
public class VigenereVoila extends StackPane {
    private double padding;
    private double area;
    private int RelativeTwentyFivePt;
    private int RelativeTwentyPt;
    private int RelativeEighteenPt;
    private int RelativeSixteenPt;
    private int RelativeFourteenPt;
    private double wrappingWidth;
    private final String syntax = "-fx-font-size:";
    private String StringRelativeTwentyFivePt;
    private String StringRelativeTwentyPt;
    private String StringRelativeEighteenPt;
    private String StringRelativeSixteenPt;
    private String StringRelativeFourteenPt;
    private Text ExtraInfo;
    private Text FirstLine;
    private Text Header;
    private Text header;
    private TextArea Solved;
    private Button tabulaRecta;
    private Button statisticsAttack;
    private Button dictionaryAttack;
    private Button bruteForce;
    private Button kasiskiAnalysis;
    private Button friedmanAnalysis;
    private Button createOwn;
    private Button autoCrackAnother;
    private Button decryptSameKey;

    private final CharSet charSet = new CharSet(1);
    public VigenereVoila(String solved, String keyWord, int length, String attackMethod, Time timeFromClickDecode, String extraInfo, String cipher) {
        padding = 50;
        setPadding(new Insets(padding));
        ExtraInfo = new Text();
        ExtraInfo.setWrappingWidth(1440-(2*padding));
        ExtraInfo.setTextAlignment(TextAlignment.CENTER);
        ExtraInfo.setStyle("-fx-font-size:25pt;");
        ExtraInfo.setText(extraInfo);
        System.out.println(keyWord);
        String firstSentence = charSet.firstSentence(solved);
        VigenereKeyPhrase vkf = new VigenereKeyPhrase(keyWord, firstSentence.length());
        String removedIgnorers = charSet.removeIgnorers(firstSentence, new String[]{" "});
        VigenereCipher vgc = new VigenereCipher(removedIgnorers);
        String firstLine = "Keyword: "+keyWord;
        String info = "How encoding and decoding work:";
        String firstPartOfText = "A piece of the text:\s"+firstSentence;
        String kr = vkf.get();
        String keyRepeated = "The keyword repeated:\s"+kr;
        String enc = vgc.get();
        String enciphered = "The piece of text, encrypted:\s"+enc;
//        char plainTextFirst = ' ';
//        if (firstSentence.length() > 0){
        System.out.println("firstSentence "+firstSentence);
        char plainTextFirst = String.valueOf(firstSentence.charAt(0)).toLowerCase().charAt(0);
        //}
//        char krFirst = ' ';
//        if (kr.length() > 0) {
            char krFirst = kr.charAt(0);
       // }
//        char encFirst = ' ';
//        if (enc.length() > 0) {
            char encFirst = enc.charAt(0);
       // }
        char anotherEncrypto = String.valueOf(cipher.charAt(charSet.findAnother(String.valueOf(plainTextFirst).toLowerCase().charAt(0), solved.toLowerCase()))).toLowerCase().charAt(0);
        double time = timeFromClickDecode.getDuration();
        String info2 = "For example, to find the encrypted equivalent of the first letter, find the intersection of the first letter and the first letter of the repeated keyword in a Tabula Recta, a.k.a. Vigenere Square. See the buttons below for more information. This means you go to row "+plainTextFirst+", column "+krFirst+" (or vice versa, column "+plainTextFirst+", row "+krFirst+", it doesn't matter since the Tabula Recta is symmetric) and pick the letter there. Here it's "+encFirst+". But notice: later "+plainTextFirst+" is encoded by "+anotherEncrypto+". This is what makes the Vigenere Cipher difficult to crack. In fact, it was considered uncrackable - named \"Le Chiffre Indechiffrable\" after its creation in 1553 by the Italian cryptographer Giovan Battista Bellaso (not Blaise de Vigenère, whom it is named after). Only in 1863 did Friedrich Kasiski, a German infantry officer and cryptographer, published a method of determining the key length of and breaking a Vigenere cipher. Charles Babbage, considered by some to be a father of computers (in the theoretical realm, because he never saw computers realized), possibly knew how to crack them as early as 1846. Either way, it stood uncracked for about 300 years. It was supposedly used even in World War 1 (but it's nowhere near as strong as an enigma cipher). The currently popular method of determining the key length was published only in 1922. Now that you know the key, any other messages that you receive can go into the page listed at the bottom - decrypt other messages that use the same key. This will provide an even faster and 100% reliable (the auto-crack vigenere is \"only\" 95% reliable) way to decrypt text. However, if you don't know if it's the same key, keep using the automatic codebreaker.";
        header = new Text("Without further ado, here are the results:\n" +
                "Time taken to break the cipher: "+time+" nanoseconds\n"+
                "Method: "+attackMethod+"\n"+
                "Decrypted message:\n"
                );
        Solved = new TextArea(solved);
        tabulaRecta = new Button("Tabula Recta");
        statisticsAttack = new Button("Statistics Attack");
        dictionaryAttack = new Button("Dictionary Attack");
        bruteForce = new Button("Brute Force");
        kasiskiAnalysis = new Button("Kasiski Analysis");
        friedmanAnalysis = new Button("Friedman Analysis");
        createOwn = new Button("create your own cipher");
        autoCrackAnother = new Button("auto-crack another");
        decryptSameKey = new Button("decrypt other messages that use the same key");

        FirstLine = new Text(firstLine);
        Header = new Text(
                info+"\n"+
                        firstPartOfText+"\n"+
                        keyRepeated+"\n"+
                        enciphered+"\n"+
                        info2
        );
        Header.setStyle("-fx-font-size:18pt;");
        Header.setWrappingWidth(1440-(2*padding));
        header.setStyle("-fx-font-size:18pt;");
        Solved.setStyle("-fx-font-size:16pt;");
        tabulaRecta.setStyle("-fx-font-size:14pt;");
        statisticsAttack.setStyle("-fx-font-size:14pt;");
        dictionaryAttack.setStyle("-fx-font-size:14pt;");
        bruteForce.setStyle("-fx-font-size:14pt;");
        kasiskiAnalysis.setStyle("-fx-font-size:14pt;");
        friedmanAnalysis.setStyle("-fx-font-size:14pt;");
        createOwn.setStyle("-fx-font-size:14pt;");
        autoCrackAnother.setStyle("-fx-font-size:14pt;");
        decryptSameKey.setStyle("-fx-font-size:14pt;");



        Solved.setWrapText(true);

        HBox layer2 = new HBox(tabulaRecta, statisticsAttack, dictionaryAttack, bruteForce, kasiskiAnalysis, friedmanAnalysis);
        HBox layer3 = new HBox(createOwn, autoCrackAnother, decryptSameKey);
        VBox bottom = new VBox(layer2, layer3);
//        .setAlignment(Pos.BOTTOM_CENTER);
        layer2.setAlignment(Pos.BASELINE_CENTER);
        layer3.setAlignment(Pos.BASELINE_CENTER);

        VBox all = new VBox(ExtraInfo, FirstLine, Header, header, Solved, bottom);
//        Solved.setStyle("-fx-background-color:yellow");
        FirstLine.setStyle("-fx-font-size:20pt;");
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
        tabulaRecta.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new ManualSolve();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });
        statisticsAttack.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new DecodePage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Decode");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        dictionaryAttack.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new RandomCipherPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });
        bruteForce.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = null;
            try {
                root = new EncodePage();
            } catch (IOException e) {
                e.printStackTrace();
            }
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        kasiskiAnalysis.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new AboutPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });
        friedmanAnalysis.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new AboutPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });
        createOwn.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new AboutPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });
        autoCrackAnother.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new AboutPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });
        decryptSameKey.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new AboutPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });
        getChildren().add(all);
        setOnMouseMoved(this::handleResize);
    }
    public void handleResize(MouseEvent mouseEvent){
        Stage s = (Stage) getScene().getWindow();
        area = s.getWidth()*s.getHeight();
//        System.out.println(area);
        padding = area/23040;
//        System.err.println(padding);
        setPadding(new Insets(padding));
        wrappingWidth = s.getWidth()-(2*padding);
//        System.out.println("!" + wrappingWidth);
        Header.setWrappingWidth(wrappingWidth);
        header.setWrappingWidth(wrappingWidth);
        ExtraInfo.setWrappingWidth(wrappingWidth);


        RelativeTwentyFivePt = (int) area/46080;
        RelativeTwentyPt = (int) area/57600;
        RelativeEighteenPt = (int) area/64000;
        RelativeSixteenPt = (int) area/72000;
        RelativeFourteenPt = (int) (area/82285.7142857);
        StringRelativeTwentyFivePt = syntax+RelativeTwentyFivePt+"pt;";
        StringRelativeTwentyPt = syntax+RelativeTwentyPt+"pt;";
        StringRelativeEighteenPt = syntax+RelativeEighteenPt+"pt;";
        StringRelativeSixteenPt = syntax+RelativeSixteenPt+"pt;";
        StringRelativeFourteenPt = syntax+RelativeFourteenPt+"pt;";
//        System.out.println(StringRelativeTwentyFivePt);
//        System.out.println(StringRelativeTwentyPt);
//        System.out.println(StringRelativeEighteenPt);
//        System.out.println(StringRelativeSixteenPt);
//        System.out.println(StringRelativeFourteenPt);

        ExtraInfo.setStyle(StringRelativeTwentyFivePt);
        Solved.setStyle(StringRelativeSixteenPt);
        FirstLine.setStyle(StringRelativeTwentyPt);
        Header.setStyle(StringRelativeEighteenPt);
        header.setStyle(StringRelativeEighteenPt);
        tabulaRecta.setStyle(StringRelativeFourteenPt);
        statisticsAttack.setStyle(StringRelativeFourteenPt);
        dictionaryAttack.setStyle(StringRelativeFourteenPt);
        bruteForce.setStyle(StringRelativeFourteenPt);
        kasiskiAnalysis.setStyle(StringRelativeFourteenPt);
        friedmanAnalysis.setStyle(StringRelativeFourteenPt);
        createOwn.setStyle(StringRelativeFourteenPt);
        autoCrackAnother.setStyle(StringRelativeFourteenPt);
        decryptSameKey.setStyle(StringRelativeFourteenPt);
    }
}
