package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class PolySymbolicPage extends StackPane {
    public PolySymbolicPage(String[] key){

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
        words.setFocusTraversable(true);
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
                GeneralSubstitutionEncode encoder = new GeneralSubstitutionEncode(words.getText(), key, charSet.getLongAlphabet());
                code.setText(encoder.getOutput());
            }
        });
        code.setOnKeyTyped(keyEvent -> {
            if (!checkBox.isSelected()){
//                words.setText(decoder.getOutput());
            }
        });

        button exploreElswhere = new button("Explore elsewhere");
        button backToCustomEncoding = new button("Custom Encoding Options");
        button encodingOptions = new button("Encoding Options");
        encodingOptions.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = null;
            try {
                root = new EncodePage();
            } catch (IOException e) {
                e.printStackTrace();
            }
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Encode");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        backToCustomEncoding.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new EncodeCustomPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Custom");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
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
        encodingOptions.setStyle("-fx-font-size:16pt;");
        backToCustomEncoding.setStyle("-fx-font-size:16pt;");
        VBox layout = new VBox();

        layout.setAlignment(Pos.TOP_CENTER);
        HBox IO = new HBox();
        IO.setAlignment(Pos.CENTER);
        IO.getChildren().addAll(words, code);
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.TOP_CENTER);
        buttons.getChildren().addAll(exploreElswhere, encodingOptions, backToCustomEncoding);
        layout.getChildren().addAll(checkBox, buttons, IO);
        getChildren().add(layout);
        setVisible(true);
        //Green 2022/2/1 and forward edits:
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
        setOnSwipeLeft(swipeEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new PolyChoicePage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Options for encoding with polysymbolic character sets");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        //Green end edits
    }
}
