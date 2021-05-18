//package sample;
//
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class CipherTypeChoicePage extends StackPane {
//    public CipherTypeChoicePage(){
//        Text choice = new Text("Which of these ciphers do you think it is?");
//        Button Caesar = new Button("Caesar");
//        Caesar.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new CaesarPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("Caesar Cipher Decoding");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//        Caesar.setStyle("-fx-font-size:40pt;");
//
//        Button Substitution = new Button("Substitution");
//        Substitution.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new SubstitutionPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("Substitution Cipher Decoding");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//        Substitution.setStyle("-fx-font-size:40pt;");
//
//        Button Vigenere = new Button("Vigenere");
//        Vigenere.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new VigenerePage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("Vigenere Cipher Decoding");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//        Vigenere.setStyle("-fx-font-size:40pt;");
//    }
//}
