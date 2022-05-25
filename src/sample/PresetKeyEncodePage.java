package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.Arrays;

public class PresetKeyEncodePage extends StackPane {
    public PresetKeyEncodePage(String[] key, char[] alphabet){
        CharSet charSet = new CharSet();
        setPadding(new Insets(30,50,50,50));

        CheckBox checkBox = new CheckBox();
        checkBox.setText("Currently Encoding. Switch to Decoding?");
        checkBox.setSelected(true);
        checkBox.setStyle("-fx-font-size:24pt;");
        checkBox.setTextAlignment(TextAlignment.CENTER);
        TextArea words = new TextArea();
        TextArea code = new TextArea();
        words.setWrapText(true);
        code.setWrapText(true);

        words.setMinHeight(600);
        code.setMinHeight(600);
        words.setPromptText("Type Here");
        code.setPromptText("Code comes out here");
        code.setStyle("-fx-font-size:16pt;");
        words.setFocusTraversable(true);
//        words.setOnKeyTyped(keyEvent -> updateCipher());
        checkBox.setOnAction(actionEvent -> {
            if (checkBox.isSelected()){
                checkBox.setText("Currently Encoding. Switch to Decoding?");
                words.setPromptText("Type Here");
                code.setPromptText("Code comes out here");
            }
            if (!checkBox.isSelected()){
                checkBox.setText("Currently Decoding. Switch to Encoding?");
                words.setPromptText("Words come out here");
                code.setPromptText("Code goes in here");
            }
        });
        words.setOnKeyTyped(keyEvent -> {
            if (checkBox.isSelected()) {
                GeneralSubstitutionEncode encoder = new GeneralSubstitutionEncode(true, words.getText(), key, charSet.getLongAlphabet());
                code.setText(encoder.getOutput());
            }
        });
        code.setOnKeyTyped(keyEvent -> {
            if (!checkBox.isSelected()){
                String[] alphab = charSet.charToStringArray(charSet.getLongAlphabet());
                System.out.println(Arrays.toString(alphab));
                EmojEtcDecoder decoder = new EmojEtcDecoder(code.getText(), key, alphab);
                System.out.println(decoder.getOutput());
                words.setText(decoder.getOutput());
            }
        });

        button exploreElswhere = new button("Explore elsewhere");
        exploreElswhere.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new StartPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Cryptography");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        exploreElswhere.setStyle("-fx-font-size:16pt;");
        VBox layout = new VBox();

        layout.setAlignment(Pos.TOP_CENTER);
        HBox IO = new HBox();
        IO.setAlignment(Pos.CENTER);
        IO.getChildren().addAll(words, code);
        layout.getChildren().addAll(checkBox, exploreElswhere, IO);
        getChildren().add(layout);
        setVisible(true);
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
    }

    public static void main(String[] args) {
        CharSet charSet = new CharSet();
        String[] s = new String[]{
                "👋🏻","🤚🏻","🖐🏻","✋🏻","🖖🏻","👌🏻","🤌🏻","🤏🏻","✌🏻","🤞🏻","🤟🏻","🤘🏻","🤙🏻","👈🏻","👉🏻","👆🏻","🖕🏻","👇🏻","☝🏻","👍🏻",
                "👋🏼","🤚🏼","🖐🏼","✋🏼","🖖🏼","👌🏼","🤌🏼","🤏🏼","✌🏼","🤞🏼","🤟🏼","🤘🏼","🤙🏼","👈🏼","👉🏼","👆🏼","🖕🏼","👇🏼","☝🏼","👍🏼",
                "👋🏽","🤚🏽","🖐🏽","✋🏽","🖖🏽","👌🏽","🤌🏽","🤏🏽","✌🏽","🤞🏽","🤟🏽","🤘🏽","🤙🏽","👈🏽","👉🏽","👆🏽","🖕🏽","👇🏽","☝🏽","👍🏽",
                "👋🏾","🤚🏾","🖐🏾","✋🏾","🖖🏾","👌🏾","🤌🏾","🤏🏾","✌🏾","🤞🏾","🤟🏾","🤘🏾","🤙🏾","👈🏾","👉🏾","👆🏾","🖕🏾","👇🏾","☝🏾","👍🏾","👎🏾","✊🏾","👊🏾"};
    }
}
