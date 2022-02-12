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

public class TwoCharEncodePage extends StackPane {
    public TwoCharEncodePage(String[] chars){

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
                TwoCharEncoder encoder = new TwoCharEncoder(words.getText(), chars);
                code.setText(encoder.getOutput());
            }
        });
        code.setOnKeyTyped(keyEvent -> {
            if (!checkBox.isSelected()){
                TwoCharDecoder decoder = new TwoCharDecoder(code.getText());
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
        //Green 2022/2/1 and forward edits:
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
        //Green end edits
    }
}
