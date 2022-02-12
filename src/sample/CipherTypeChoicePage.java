package sample;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CipherTypeChoicePage extends StackPane {
    private final double buttonAreaDivisor = 19200;
    private final double textAreaDivisor = 16457;
    private Text choice;
    private Button Caesar;
    private Button Substitution;
    private Button Vigenere;
    public CipherTypeChoicePage(){
        CharSet charSet = new CharSet();

        choice = new Text("Which of these ciphers do you think it is?");
        choice.setWrappingWidth(1440);
        double area = 1440*800;
        int KUfontsize = (int) Math.floor(area/textAreaDivisor);
        String KUFontSize = "-fx-font-size:"+KUfontsize+"pt;";
        choice.setStyle(KUFontSize);

        Caesar = new Button("Caesar");
        Caesar.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new CaesarPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Caesar Cipher Decoding");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });

        Substitution = new Button("Substitution");
        Substitution.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new SubstitutionPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("Substitution Cipher Decoding");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });

        Vigenere = new Button("Vigenere");
        Vigenere.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new VigenerePage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("Vigenere Cipher Decoding");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });

        int buttonfontsize = (int) Math.floor(area/buttonAreaDivisor);
        String ButtonFontSize = "-fx-font-size:"+buttonfontsize+"pt;";
        Caesar.setStyle(ButtonFontSize);
        Substitution.setStyle(ButtonFontSize);
        Vigenere.setStyle(ButtonFontSize);

        this.setOnMouseMoved(this::handle);

        HBox choices = new HBox();
        choices.getChildren().addAll(Caesar,Substitution,Vigenere);
        choices.setAlignment(Pos.CENTER);
        VBox layout = new VBox();
        layout.getChildren().addAll(choice, choices);


        this.getChildren().add(layout);
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
    }
    public void handle(MouseEvent mouseEvent) {
        Stage s = (Stage) this.getScene().getWindow();
        double Area = (s.getWidth() * s.getHeight());
        choice.setWrappingWidth(s.getWidth());
        int kufs = (int) Math.floor(Area / textAreaDivisor);
        String KUFS = "-fx-font-size:" + kufs + "pt;";
        choice.setStyle(KUFS);
        int bfs = (int) Math.floor(Area / buttonAreaDivisor);
        String BFS = "-fx-font-size:" + bfs + "pt;";
        Caesar.setStyle(BFS);
        Substitution.setStyle(BFS);
        Vigenere.setStyle(BFS);
    }
}
