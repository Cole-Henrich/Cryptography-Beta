//package sample;
//
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//
//public class SubstitutionPage extends StackPane {
//    public SubstitutionPage() {
//        Text text = new Text("Do you know the key?");
//        Button Yes = new Button("Yes");
//        Button No = new Button("No");
//        HBox YN = new HBox(Yes, No);
//        VBox vBox = new VBox(text, YN);
//
//        Yes.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new SubstitutionKnownPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//        No.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new SubstitutionAutoSolvePage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//
//        this.getChildren().add(vBox);
//
//    }
//}
