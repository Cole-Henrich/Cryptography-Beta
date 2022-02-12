package sample;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EncodePage extends StackPane {
    private double padding;
    private double area;
    private int RelativeHundredTwentyPt;
    private int RelativeHundredPt;
    private int RelativeEightyPt;
    private int RelativeSixtyPt;
    private int RelativeFortyPt;
    private int RelativeThirtyPt;
    private int RelativeTwentyFivePt;
    private int RelativeTwentyPt;
    private int RelativeEighteenPt;
    private int RelativeSixteenPt;
    private int RelativeFourteenPt;
    private double wrappingWidth;
    private final String syntax = "-fx-font-size:";
    private String StringRelativeHundredTwentyPt;
    private String StringRelativeHundredPt;
    private String StringRelativeEightyPt;
    private String StringRelativeSixtyPt;
    private String StringRelativeFortyPt;
    private String StringRelativeThirtyPt;
    private String StringRelativeTwentyFivePt;
    private String StringRelativeTwentyPt;
    private String StringRelativeEighteenPt;
    private String StringRelativeSixteenPt;
    private String StringRelativeFourteenPt;
    private Text how;
    private button Caesar;
    private button Substitution;
    private button Vigenere;
    private button_link moreInfo;
    private button Custom;
    private final CharSet charSet = new CharSet();
    private final double buttonSize = 40;
    public EncodePage() throws IOException {
        padding = 50;
        setPadding(new Insets(padding));
        how = new Text("How do you want to encode your text?");
        Caesar = new button("Caesar - 26 possible keys", "Caesar Cipher", new CaesarEncodePage(), buttonSize);
        Substitution = new button("Substitution - 403,291,460,000,000,000,000,000,000 possible keys", "Substitution Cipher", new SubstitutionEncodePage(), buttonSize);
        Vigenere = new button("Vigenere -  variable, but can easily surpass 20,725,275,000,000,000,000,000,000,000 possible keys", "Vigenère Cipher", new VigenereEncodePage(), buttonSize);
        moreInfo = new button_link("(more info)", "On the number of possible Vigenère keys", new CountingVigenereKeysPage(), buttonSize);
        Custom = new button("Custom -\n these ciphers are unique to this app - and you can create your own unorthodox ciphers, which are at their core simple, but which are probably immune to any pre-existing deciphering programs because of their uniqueness.", "Custom", new EncodeCustomPage(), buttonSize);

        how.setVisible(false);
        how.setTextAlignment(TextAlignment.CENTER);

        Caesar.setVisible(false);
        Caesar.setTextAlignment(TextAlignment.CENTER);
        Caesar.setWrapText(true);
        Caesar.setStyle("-fx-font-size:18pt;");

        Substitution.setVisible(false);
        Substitution.setTextAlignment(TextAlignment.CENTER);
        Substitution.setWrapText(true);
        Substitution.setStyle("-fx-font-size:18pt;");

        Vigenere.setVisible(false);
        Vigenere.setTextAlignment(TextAlignment.CENTER);
        Vigenere.setWrapText(true);
        Vigenere.setStyle("-fx-font-size:18pt;");

        moreInfo.setVisible(false);
        moreInfo.setTextAlignment(TextAlignment.CENTER);
        moreInfo.setWrapText(true);
        moreInfo.setStyle("-fx-font-size:18pt;");

        Custom.setVisible(false);
        Custom.setTextAlignment(TextAlignment.CENTER);
        Custom.setWrapText(true);
        Custom.setStyle("-fx-font-size:18pt;");

        HBox vigenereAndLink = new HBox();
        vigenereAndLink.getChildren().addAll(Vigenere, moreInfo);
        VBox layout = new VBox();
        layout.getChildren().addAll(how, Caesar, Substitution, vigenereAndLink, Custom);

        getChildren().addAll(layout);

        how.setVisible(true);
        Caesar.setVisible(true);
        Substitution.setVisible(true);
        Vigenere.setVisible(true);
        moreInfo.setVisible(true);
        Custom.setVisible(true);

        double h = 800;
        Caesar.setPrefHeight(h);
        Substitution.setPrefHeight(h);
        Vigenere.setPrefHeight(h);
        Custom.setPrefHeight(h);
        moreInfo.setPrefHeight(h);

        double w = 1440;
        Caesar.setPrefWidth(w);
        Substitution.setPrefWidth(w);
        Vigenere.setPrefWidth(w);
        Custom.setPrefWidth(w);
        moreInfo.setPrefWidth(8*padding);

        how.setStyle("-fx-font-size:40pt;");

        wrappingWidth = 1440-(2*padding);
        how.setWrappingWidth(wrappingWidth);
        setOnMouseMoved(this::handleResize);
        //Green 2022/2/1 and forward edits:

        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
        //Green end edits


    }

    public void handleResize(MouseEvent mouseEvent){
        Stage s = (Stage) getScene().getWindow();
        area = s.getWidth()*s.getHeight();
        padding = area/charSet.padDiv;
        setPadding(new Insets(padding));
        wrappingWidth = s.getWidth()-(2*padding);
        how.setWrappingWidth(wrappingWidth);
        RelativeHundredTwentyPt = (int) (area/charSet.relDiv(120));
        RelativeHundredPt = (int) (area/charSet.relDiv(100));
        RelativeEightyPt = (int) (area/charSet.relDiv(80));
        RelativeSixtyPt = (int) (area/charSet.relDiv(60));
        RelativeFortyPt = (int) (area/charSet.relDiv(40));
        RelativeThirtyPt = (int) (area/charSet.relDiv(30));
        RelativeTwentyFivePt = (int) (area/charSet.rel25Div);
        RelativeTwentyPt = (int) (area/charSet.rel20Div);
        RelativeEighteenPt = (int) (area/charSet.rel18Div);
        RelativeSixteenPt = (int) (area/charSet.rel16Div);
        RelativeFourteenPt = (int) (area/charSet.rel14Div);
        StringRelativeHundredTwentyPt = syntax+RelativeHundredTwentyPt+"pt;";
        StringRelativeHundredPt = syntax+RelativeHundredPt+"pt;";
        StringRelativeEightyPt = syntax+RelativeEightyPt+"pt;";
        StringRelativeSixtyPt = syntax+RelativeSixtyPt+"pt;";
        StringRelativeFortyPt = syntax+RelativeFortyPt+"pt;";
        StringRelativeThirtyPt = syntax+RelativeFortyPt+"pt;";
        StringRelativeTwentyFivePt = syntax+RelativeTwentyFivePt+"pt;";
        StringRelativeTwentyPt = syntax+RelativeTwentyPt+"pt;";
        StringRelativeEighteenPt = syntax+RelativeEighteenPt+"pt;";
        StringRelativeSixteenPt = syntax+RelativeSixteenPt+"pt;";
        StringRelativeFourteenPt = syntax+RelativeFourteenPt+"pt;";
        

        double h = s.getHeight();
        Caesar.setPrefHeight(h);
        Substitution.setPrefHeight(h);
        Vigenere.setPrefHeight(h);
        Custom.setPrefHeight(h);
        moreInfo.setPrefHeight(h);

        double w = s.getWidth();
        Caesar.setPrefWidth(w);
        Substitution.setPrefWidth(w);
        Vigenere.setPrefWidth(w);
        Custom.setPrefWidth(w);
        moreInfo.setPrefWidth(0.2777777*w);

        String ifAdjust = StringRelativeEighteenPt;
        String howIfAdjust = StringRelativeFortyPt;
        if (area < 360000){
            System.out.println(area);
            ifAdjust = StringRelativeFortyPt;
            howIfAdjust = StringRelativeSixtyPt;
            if (area < 250000){
                System.out.println(area);
                ifAdjust = StringRelativeSixtyPt;
                howIfAdjust = StringRelativeEightyPt;
                if (area < 160000){
                    System.out.println(area);
                    ifAdjust = StringRelativeEightyPt;
                    howIfAdjust = StringRelativeHundredPt;
                    if (area < 90000){
                        System.out.println(area);
                        ifAdjust = StringRelativeHundredPt;
                        howIfAdjust = StringRelativeHundredTwentyPt;
                        System.out.println(StringRelativeHundredPt);
                        System.out.println(StringRelativeHundredTwentyPt);
                    }
                }
            }
        }
        moreInfo.setStyle(ifAdjust);
        Caesar.setStyle(ifAdjust);
        Substitution.setStyle(ifAdjust);
        Vigenere.setStyle(ifAdjust);
        Custom.setStyle(ifAdjust);
        how.setStyle(howIfAdjust);


    }

}
