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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

@SuppressWarnings("MagicNumber")
public class CaesarVoila extends StackPane {
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
    private Button notSolved;
    private Button crackOthers;
    private Button generateRandom;
    private Button createOwn;
    private Button learnAbout;
    public CaesarVoila(String solved, int shift, String extraInfo){
        padding = 50;
        setPadding(new Insets(padding));
        ExtraInfo = new Text();
        ExtraInfo.setWrappingWidth(1440-(2*padding));
        ExtraInfo.setTextAlignment(TextAlignment.CENTER);
        ExtraInfo.setStyle("-fx-font-size:25pt;");
        ExtraInfo.setText(extraInfo);

        TabulaRecta tabulaRecta = new TabulaRecta();
        String decipherAlphabet = Arrays.toString(tabulaRecta.get(shift));
        String encipherAlphabet = Arrays.toString(tabulaRecta.get((26-shift)));
        String firstLine = "The Caesar Cipher was encrypted by shifting each letter of the alphabet up "+(26-shift)+".\n";
        String info =
                "The decryption key is \"shift up "+(shift)+"\", which is just 26 - "+(26-shift)+". " +
                        "In a Caesar cipher, the decryption key is the additive inverse of " +
                        "the encryption key - the encryption key is "+(26-shift)+", so the decryption key is -"+(26-shift)+", " +
                        "but due to wrap-around principles, -"+(26-shift)+" is the same as 26-"+(26-shift)+", or "+shift+".";
        String alphabet = "alphabet: 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'";
        String DecipherAlphabet = "alphabet used to decipher (+"+shift+"): "+decipherAlphabet;
        String EncipherAlphabet = "alphabet used to encipher (+"+(26-shift)+"):"+encipherAlphabet;
        String info2 = "Now that you know the shift, you can easily crack any future text that is encrypted by the same shift (by shifting each letter up "+shift+").";
        header = new Text("Here are your results:");
        Solved = new TextArea(solved);
        notSolved = new Button("Is the text still not deciphered?  If so, click here to solve it.");
        crackOthers = new Button("Have other ciphers to crack? Click here.");
        generateRandom = new Button(" Want a randomly generated cipher to solve on your own? Click here.");
        createOwn = new Button("Want to create your own cipher? Click here.");
        learnAbout = new Button("To learn about ciphers and this app, click here.");
        FirstLine = new Text(firstLine);
        Header = new Text(
                info+"\n"+
                        alphabet+"\n"+
                        DecipherAlphabet+"\n"+
                        EncipherAlphabet+"\n"+
                        info2
        );
        Header.setStyle("-fx-font-size:18pt;");
        Header.setWrappingWidth(1440-(2*padding));
        header.setStyle("-fx-font-size:18pt;");
        Solved.setStyle("-fx-font-size:16pt;");
        notSolved.setStyle("-fx-font-size:14pt;");
        crackOthers.setStyle("-fx-font-size:14pt;");
        generateRandom.setStyle("-fx-font-size:14pt;");
        createOwn.setStyle("-fx-font-size:14pt;");
        learnAbout.setStyle("-fx-font-size:14pt;");
        Solved.setWrapText(true);

        HBox layer2 = new HBox(crackOthers, generateRandom);
        HBox layer3 = new HBox(createOwn, learnAbout);
        VBox bottom = new VBox(notSolved, layer2, layer3);
        notSolved.setAlignment(Pos.BOTTOM_CENTER);
        layer2.setAlignment(Pos.BASELINE_CENTER);
        layer3.setAlignment(Pos.BASELINE_CENTER);

        VBox all = new VBox(ExtraInfo, FirstLine, Header, header, Solved, bottom);
//        Solved.setStyle("-fx-background-color:yellow");
        FirstLine.setStyle("-fx-font-size:20pt;");
        notSolved.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new ManualSolve();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });
        crackOthers.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new DecodePage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Decode");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        generateRandom.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new RandomCipherPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });
        createOwn.setOnAction(actionEvent -> {
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
        learnAbout.setOnAction(actionEvent -> {
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
        System.out.println(area);
        padding = area/23040;
        System.err.println(padding);
        setPadding(new Insets(padding));
        wrappingWidth = s.getWidth()-(2*padding);
        System.out.println("!" + wrappingWidth);
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
        System.out.println(StringRelativeTwentyFivePt);
        System.out.println(StringRelativeTwentyPt);
        System.out.println(StringRelativeEighteenPt);
        System.out.println(StringRelativeSixteenPt);
        System.out.println(StringRelativeFourteenPt);

        ExtraInfo.setStyle(StringRelativeTwentyFivePt);
        Solved.setStyle(StringRelativeSixteenPt);
        FirstLine.setStyle(StringRelativeTwentyPt);
        Header.setStyle(StringRelativeEighteenPt);
        header.setStyle(StringRelativeEighteenPt);
        notSolved.setStyle(StringRelativeFourteenPt);
        crackOthers.setStyle(StringRelativeFourteenPt);
        generateRandom.setStyle(StringRelativeFourteenPt);
        createOwn.setStyle(StringRelativeFourteenPt);
        learnAbout.setStyle(StringRelativeFourteenPt);
    }
}
