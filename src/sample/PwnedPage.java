package sample;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PwnedPage extends StackPane {
    public PwnedPage() throws InterruptedException {
        Label pwned = new Label("""
                You have been pwned by a Trojan Horse.
                Major L.
                Click Help to learn how to reverse this.
                """);
        pwned.setFont(Font.font("Menlo", 40));
        button help = new button("Help");
        help.setFont(Font.font("Menlo", 40));
        help.setOnAction(actionEvent -> {
            Parent root = null;
            try {
                root = new JokePage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Stage s = (Stage) getScene().getWindow();
            s.setMinWidth(200);
            s.setMinHeight(200);
            s.setTitle(AnagramSolverGUI.getStageTitle());
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        VBox vert = new VBox(pwned, help);
        vert.setAlignment(Pos.CENTER);
        getChildren().add(vert);
    }
}
