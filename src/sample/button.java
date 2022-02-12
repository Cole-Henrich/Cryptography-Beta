package sample;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class button extends Button {
    private Text innerLink;
    public button(String message, String nextSceneName, Parent root, double minWidth, double minHeight, double width, double height, double fontSize, String fontSizeUnit){
        super(message);
        String fxFont = "-fx-font-size:";
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
    }
    public button(String message, String nextSceneName, Parent root, double fontSize){
        this(message, nextSceneName, root, 100, 100, 1440, 800, fontSize, "pt");
    }
    public button(){
        super();
    }
    public button(String s){
        super(s);
    }
    public button(String s, Node node){
        super(s, node);
    }

}
