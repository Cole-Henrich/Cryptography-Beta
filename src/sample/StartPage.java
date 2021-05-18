package sample;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StartPage extends StackPane {
    public StartPage(){
        Button Encode = new Button("Encode");
        Encode.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new EncodePage();
            s.setMinWidth(450);
            s.setMinHeight(450);
            s.setTitle("Encode");
            s.setScene(new Scene(root, 500, 500));
            s.show();
        });

        Button Decode = new Button("Decode");
        Decode.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new DecodePage();
            s.setMinWidth(450);
            s.setMinHeight(450);
            s.setTitle("Decode");
            s.setScene(new Scene(root, 500, 500));
            s.show();
        });
        Encode.setStyle("-fx-font-size:40pt;");
        Decode.setStyle("-fx-font-size:40pt;");
        HBox box = new HBox(Encode, Decode);
        box.setAlignment(Pos.CENTER);
        this.getChildren().addAll(box);
    }
}
