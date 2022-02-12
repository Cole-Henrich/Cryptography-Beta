package sample;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Link extends Text {
    private final CharSet charSet = new CharSet(false);
    public Link(String message, String nextSceneName, Parent root, double minWidth, double minHeight, double width, double height, double fontSize, String fontSizeUnit){
        super(message);
        String fxFont = "-fx-font-size:";
        String fxFull = fxFont+fontSize+fontSizeUnit+";";
        setStyle(fxFull);
        setOnMouseClicked(mouseEvent -> {
            SetTurnToPurpleOnClicked();
            Stage s = (Stage) getScene().getWindow();
            s.setMinWidth(minWidth);
            s.setMinHeight(minHeight);
            s.setTitle(nextSceneName);
            s.setScene(new Scene(root, width, height));
            s.show();
        });
        SetStyle();
    }
    public Link(String message, String nextSceneName, Parent root, double fontSize){
        this(message, nextSceneName, root, 100, 100, 1440, 800, fontSize, "pt");
    }
    public Link() {
        SetStyle();
        setOnMouseClicked(mouseEvent -> SetTurnToPurpleOnClicked());
    }
    public Link(String s){
        super(s);
        SetStyle();
        setOnMouseClicked(mouseEvent -> SetTurnToPurpleOnClicked());
    }
    public Link(double v, double v1, String s){
        super(v, v1, s);
        SetStyle();
        setOnMouseClicked(mouseEvent -> SetTurnToPurpleOnClicked());

    }
    private void SetTurnToPurpleOnClicked(){
        setFill(Color.web("#660199"));
        setStyle(charSet.increaseFont(this, 1.5));
    }
    private void SetStyle(){
        setFill(Color.web("#1a0dab"));
        setUnderline(true);
    }
}
