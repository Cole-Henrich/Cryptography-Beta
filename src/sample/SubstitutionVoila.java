package sample;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SubstitutionVoila extends StackPane {
    public SubstitutionVoila(String text){
        TextField result = new TextField(text);
        Text notSolved = new Text("Is it still not solved? You can:");
        String keyPage = "Return to the key page and make sure you entered the key correctly\n";
        String restart = "Return to the start and try the autosolve function - your cipher may not be a substitution cipher!\n";
        String other = "If neither works, you can always check out the other functionalities of this app, here.";

        Button KeyPage = new Button(keyPage);
        Button Restart = new Button(restart);
        Button Other = new Button(other);
        VBox vBox = new VBox();
        vBox.getChildren().addAll(result, notSolved, KeyPage, Restart, Other);

        KeyPage.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new SubstitutionKnownPage();
            s.setMinWidth(450);
            s.setMinHeight(450);
            s.setScene(new Scene(root, 500, 500));
            s.show();
        });
        Restart.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new StartPage();
            s.setMinWidth(450);
            s.setMinHeight(450);
            s.setScene(new Scene(root, 500, 500));
            s.show();
        });
        Other.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new StartPage();
            s.setMinWidth(450);
            s.setMinHeight(450);
            s.setScene(new Scene(root, 500, 500));
            s.show();
        });
    }
}
