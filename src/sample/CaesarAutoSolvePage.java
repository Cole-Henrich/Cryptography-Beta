package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

@SuppressWarnings({"MagicNumber", "FieldMayBeFinal", "ChainedMethodCall"})

public class CaesarAutoSolvePage extends StackPane {
    private Text info;
    private Button decode;
    private TextArea textArea;
    private final double buttonAreaDivisor = 20000;
    private final double textAreaDivisor = 18000 ;
    private final int padding = 50;
    public CaesarAutoSolvePage(){
        CharSet charSet = new CharSet();

        setPadding(new Insets(padding, padding, padding, padding));
        info = new Text("Now all you have to do is paste your text, click \"decode\", and it will be cracked instantaneously. Pretty cool, yes?");
        decode = new Button("decode");
        textArea = new TextArea();
        double area = 1240*700;
        info.setWrappingWidth(1240);
        int fontsize = (int) Math.floor(area/textAreaDivisor);
        String FontSize = "-fx-font-size:"+fontsize+"pt;";
        info.setStyle(FontSize);

        int buttonfontsize = (int) Math.floor(area/buttonAreaDivisor);
        String ButtonFontSize = "-fx-font-size:"+buttonfontsize+"pt;";
        decode.setStyle(ButtonFontSize);
        decode.setAlignment(Pos.CENTER);
        textArea.setStyle("-fx-font-size:20pt;");
        textArea.setPromptText("Paste text here");

        textArea.setMinHeight(300);

        decode.setOnAction(actionEvent -> {
            CaesarCracker caesarCracker = null;
            try {
                caesarCracker = new CaesarCracker(textArea.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage s = (Stage) getScene().getWindow();
            Parent root = new CaesarVoila(caesarCracker.getSolved(), caesarCracker.getShift(), "");
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Voila");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        VBox layout = new VBox();
        layout.getChildren().addAll(info, decode, textArea);
        setOnMouseMoved(this::handle);
        getChildren().add(layout);
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
    }
    public void handle(MouseEvent mouseEvent) {
        setPadding(new Insets(padding, padding, padding, padding));
        Stage s = (Stage) getScene().getWindow();
        double Area = ((s.getWidth()-(2*padding))* (s.getHeight()-(2*padding)));
        info.setWrappingWidth(s.getWidth()-(2*padding));
        int kufs = (int) Math.floor(Area / textAreaDivisor);
        String KUFS = "-fx-font-size:" + kufs + "pt;";
        info.setStyle(KUFS);
        int bfs = (int) Math.floor(Area / buttonAreaDivisor);
        String BFS = "-fx-font-size:" + bfs + "pt;";
        decode.setStyle(BFS);
    }
}
