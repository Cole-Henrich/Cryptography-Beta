//package sample;
//
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//import java.util.Arrays;
//
//public class CaesarVoila extends StackPane {
//    public CaesarVoila(String solved, int shift){
//        TabulaRecta tabulaRecta = new TabulaRecta();
//        String cipherAlphabet = Arrays.toString(tabulaRecta.get(shift));
//        String info = "The Caesar Cipher was encrypted by shifting each letter of the alphabet up"+shift+".";
//        String alphabet = "alphabet: abcdefghijklmnopqrstuvwxyz";
//        String cipher =   "cipher:  "+cipherAlphabet;
//        String info2 = "Now that you know the shift, you can easily crack any future text that is encrypted by the same shift.";
//        Text header = new Text("Here are your results:");
//        TextField Solved = new TextField(solved);
//        Button notSolved = new Button("Is the text still not deciphered?  If so, click here to solve it.");
//        Button crackOthers = new Button("Have other ciphers to crack? Click here.");
//        Button generateRandom = new Button(" Want a randomly generated cipher to solve on your own? Click here.");
//        Button createOwn = new Button("Want to create your own cipher? Click here.");
//        Button learnAbout = new Button("To learn about ciphers and this app, click here.");
//
//        Text Header = new Text(
//                info+"\n"+
//                alphabet+"\n"+
//                cipher+"\n"+
//                info2
//        );
//        HBox layer2 = new HBox(crackOthers, generateRandom);
//        HBox layer3 = new HBox(createOwn, learnAbout);
//        VBox bottom = new VBox(notSolved, layer2, layer3);
//        VBox all = new VBox(Header, header, Solved, bottom);
//
//        notSolved.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new ManualSolve();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//        crackOthers.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new DecodePage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("Decode");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//        generateRandom.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new RandomCipherPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//        createOwn.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new EncodePage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//        learnAbout.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new AboutPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
//        });
//
//        this.getChildren().add(all);
//
//    }
//}
