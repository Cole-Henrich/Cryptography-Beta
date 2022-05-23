package sample;

import javafx.scene.layout.StackPane;

public class CountingVigenereKeysPage extends StackPane {
    CharSet charSet = new CharSet();
    public CountingVigenereKeysPage(){
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
    }
}
