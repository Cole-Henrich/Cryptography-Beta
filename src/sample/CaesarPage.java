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

@SuppressWarnings("MagicNumber")
public class CaesarPage extends StackPane {
    private Text shift;
    private Button Yes;
    private Button Autosolve;
    private final double buttonAreaDivisor = 19200;
    private final double textAreaDivisor = 16457;
    public CaesarPage(){
        CharSet charSet = new CharSet();
        shift = new Text("Do you know the shift (for example, each letter has been moved up 7) of the Caesar Cipher?");
        shift.setWrappingWidth(1440);
        double area = 1440*800;
        int fontsize = (int) Math.floor(area/textAreaDivisor);
        String FontSize = "-fx-font-size:"+fontsize+"pt;";
        shift.setStyle(FontSize);

        Yes = new Button("Yes");
        Autosolve = new Button("No - autosolve!");

        Autosolve.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new CaesarAutoSolvePage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Caesar Autosolve");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        Yes.setOnAction(actionEvent -> {
//            Stage s = (Stage) getScene().getWindow();
//            Parent root = new CaesarKnownKeyPage();
//            s.setMinWidth(450);
//            s.setMinHeight(450);
//            s.setTitle("Caesar Solving, with Known Key");
//            s.setScene(new Scene(root, 500, 500));
//            s.show();
        });
        int buttonfontsize = (int) Math.floor(area/buttonAreaDivisor);
        String ButtonFontSize = "-fx-font-size:"+buttonfontsize+"pt;";
        Yes.setStyle(ButtonFontSize);
        Autosolve.setStyle(ButtonFontSize);

        HBox YN = new HBox();
        YN.setAlignment(Pos.CENTER);
        YN.getChildren().addAll(Yes, Autosolve);
        VBox Layout = new VBox();
        Layout.getChildren().addAll(shift, YN);
        setOnMouseMoved(this::handle);
        getChildren().add(Layout);
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
    }
    public void handle(MouseEvent mouseEvent) {
        Stage s = (Stage) getScene().getWindow();
        double Area = (s.getWidth() * s.getHeight());
        shift.setWrappingWidth(s.getWidth());
        int kufs = (int) Math.floor(Area / textAreaDivisor);
        String KUFS = "-fx-font-size:" + kufs + "pt;";
        shift.setStyle(KUFS);
        int bfs = (int) Math.floor(Area / buttonAreaDivisor);
        String BFS = "-fx-font-size:" + bfs + "pt;";
        Yes.setStyle(BFS);
        Autosolve.setStyle(BFS);
    }
}
