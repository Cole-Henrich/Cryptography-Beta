//package sample;
//
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class CaesarPage extends StackPane {
//
//
//
//    public CaesarPage(){
//        Text shift = new Text("Do you know the shift (for example, each letter has been moved up 7) of the Caesar Cipher?");
//        shift.setStyle("-fx-font-size:50pt;");
//        Button Yes = new Button("Yes");
//        Yes.setStyle("-fx-font-size:40pt;");
//        Button Autosolve = new Button("No - autosolve!");
//        Autosolve.setStyle("-fx-font-size:40pt;");
//        Autosolve.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new CaesarAutoSolvePage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("Caesar Autosolve");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//        Yes.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new CaesarKnownKeyPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("Caesar Solving, with Known Key");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//
//    }
//}
