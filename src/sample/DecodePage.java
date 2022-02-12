package sample;

import javafx.event.EventHandler;
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

public class DecodePage extends StackPane {
    private Text knownUnknown;
    private Button Yes;
    private Button Autosolve;
    private final double buttonAreaDivisor = 19200;
    private final double textAreaDivisor = 16457;

    public DecodePage(){
        CharSet charSet = new CharSet();
        knownUnknown = new Text("Do you know what type of cipher it is? For example, do you know it is a Caesar, Substitution, or Vigenere Cipher?");
        knownUnknown.setWrappingWidth(1440);
        double area = 1440*800;
        int KUfontsize = (int) Math.floor(area/textAreaDivisor);
        String KUFontSize = "-fx-font-size:"+KUfontsize+"pt;";
        knownUnknown.setStyle(KUFontSize);
        Yes = new Button("Yes");
        Autosolve = new Button("No - Attempt Autosolve");
        int buttonfontsize = (int) Math.floor(area/buttonAreaDivisor);
        String ButtonFontSize = "-fx-font-size:"+buttonfontsize+"pt;";
        Yes.setStyle(ButtonFontSize);
        Autosolve.setStyle(ButtonFontSize);

        Autosolve.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new AutoSolvePage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("AutoSolve");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });

        Yes.setOnAction(actionEvent -> {
            Stage s1 = (Stage) getScene().getWindow();
            Parent root = new CipherTypeChoicePage();
            s1.setMinWidth(100);
            s1.setMinHeight(100);
            s1.setTitle("Choose the Cipher Type");
            s1.setScene(new Scene(root, 1440, 800));
            s1.show();
        });
        HBox YN = new HBox();
        YN.setAlignment(Pos.CENTER);
        YN.getChildren().addAll(Yes, Autosolve);
        VBox Layout = new VBox();
        Layout.getChildren().addAll(knownUnknown, YN);
        setOnMouseMoved(this::handle);
        getChildren().add(Layout);
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
    }
    public void handle(MouseEvent mouseEvent) {
        Stage s = (Stage) getScene().getWindow();
        double Area = (s.getWidth() * s.getHeight());
        knownUnknown.setWrappingWidth(s.getWidth());
        int kufs = (int) Math.floor(Area / textAreaDivisor);
        String KUFS = "-fx-font-size:" + kufs + "pt;";
        knownUnknown.setStyle(KUFS);
        int bfs = (int) Math.floor(Area / buttonAreaDivisor);
        String BFS = "-fx-font-size:" + bfs + "pt;";
        Yes.setStyle(BFS);
        Autosolve.setStyle(BFS);
    }
}
