package sample;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;

public class GeneralVoila extends StackPane {
    public GeneralVoila(String s){
        TextArea t = new TextArea(s);
        t.setWrapText(true);
        getChildren().add(t);
        setPadding(new Insets(30,50,50,50));
        CharSet charSet = new CharSet();
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
    }
}
