package sample;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class button_link extends button{
    private final CharSet charSet = new CharSet(false);
    public button_link(String message, String nextSceneName, Parent root, double minWidth, double minHeight, double width, double height, double fontSize, String fontSizeUnit){
        super(message);
        String fxFont = "-fx-font-size:";
        setUnderline(true);
        String fxFull = fxFont+fontSize+fontSizeUnit+";";
        setStyle(fxFull);
        setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            s.setMinWidth(minWidth);
            s.setMinHeight(minHeight);
            s.setTitle(nextSceneName);
            s.setScene(new Scene(root, width, height));
            s.show();
        });
        SetStyle();
    }
    public button_link(String message, String nextSceneName, Parent root, double fontSize){
        this(message, nextSceneName, root, 100, 100, 1440, 800, fontSize, "pt");
    }
    public button_link(){
        super();
    }
    public button_link(String s){
        super(s);
    }
    public button_link(String s, Node node){
        super(s, node);
    }
    private void SetTurnToPurpleOnClicked(){
        setTextFill(Color.web("#660199"));
        setStyle(charSet.increaseFont(this, 1.5));
    }
    private void SetStyle(){
        setTextFill(Color.web("#1a0dab"));
        setUnderline(true);
    }
}
