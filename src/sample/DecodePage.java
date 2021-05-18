//package sample;
//
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class DecodePage extends StackPane {
//    public DecodePage(){
//        Text knownUnknown = new Text("Do you know what type of cipher it is? For example, do you know it is a Caesar, Substitution, or Vigenere Cipher?");
//        knownUnknown.setStyle("-fx-font-size:50pt;");
//        Button Yes = new Button("Yes");
//        Yes.setStyle("-fx-font-size:40pt;");
//        Button Autosolve = new Button("No - Attempt Autosolve");
//        Autosolve.setStyle("-fx-font-size:40pt;");
//
//        Autosolve.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new AutoSolvePage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("AutoSolve");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//        Yes.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new CipherTypeChoicePage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("Choose the Cipher Type");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//
//    }
//}
