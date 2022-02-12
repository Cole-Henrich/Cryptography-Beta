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

public class StartPage extends StackPane {
    public StartPage(){
        Button Encode = new Button("Encode");
        Encode.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = null;
            try {
                root = new EncodePage();
            } catch (IOException e) {
                e.printStackTrace();
            }
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("If you want to exit any screen and there is no exit button, simply swipe up and an exit button will appear.\n");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });

        Button Decode = new Button("Decode");
        Decode.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new DecodePage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("If you want to exit any screen and there is no exit button, simply swipe up and an exit button will appear.\n");
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
