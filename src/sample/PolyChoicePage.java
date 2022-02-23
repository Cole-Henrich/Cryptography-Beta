package sample;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PolyChoicePage extends StackPane {
    public PolyChoicePage(){
        CharSet charSet = new CharSet();
        Button Encode = new Button("ABC123!@#");
        Encode.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = null;
            root = new PolySymbolicPage(charSet.getPolysymbolic());
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Polysymbolic Alphabet Enciphering");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });

        Button Decode = new Button("Greek: ΦΨΩ");
        Decode.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new PolySymbolicPage(charSet.getGreek());
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Greek Alphabet Enciphering");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        Encode.setStyle("-fx-font-size:40pt;");
        Decode.setStyle("-fx-font-size:40pt;");
        HBox box = new HBox(Encode, Decode);
        box.setAlignment(Pos.CENTER);
        this.getChildren().addAll(box);
    }
}
