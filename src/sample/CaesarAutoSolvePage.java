package sample;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class CaesarAutoSolvePage extends StackPane {
    public CaesarAutoSolvePage(){
        Text info = new Text("Now all you have to do is paste your text, click \"decode\", and it will be cracked instantaneously. Pretty cool, yes?");
        info.setStyle("-fx-font-size:50pt;");
        Button decode = new Button("decode");
        decode.setStyle("-fx-font-size:30pt;");
        TextField textField = new TextField();
        decode.setOnAction(actionEvent -> {
            CaesarCracker caesarCracker = null;
            try {
                caesarCracker = new CaesarCracker(textField.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage s = (Stage) getScene().getWindow();
            Parent root = new CaesarVoila(caesarCracker.getSolved(), caesarCracker.getShift());
            s.setMinWidth(450);
            s.setMinHeight(450);
            s.setTitle("Voila");
            s.setScene(new Scene(root, 500, 500));
            s.show();
        });

    }
}
