package sample;

import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

@SuppressWarnings("SizeReplaceableByIsEmpty")
public class Letterbox extends TextArea {
    private String msg;
    private boolean ok;
    private Background original;

    private final CharSet charSet = new CharSet();
    public void adjust(double w, double h) {
        setPrefWidth(w/72);
        setPrefHeight(h/40);
    }
    public Letterbox() {
        super();
        original = getBackground();
        setWrapText(true);
        setOnMouseMoved(mouseEvent -> {
            try {
                refuseToAcceptMultipleOrIgnoredChars();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
    public Letterbox(String s){
        super(s);
        original = getBackground();
    }
    private void refuseToAcceptMultipleOrIgnoredChars() throws InterruptedException {
        boolean oversize = getText().length() > 1;
        if (oversize){
            displayRefusal("enter only one character");
        }
        boolean ignorer=false;
        if (getText().length() >0) {
            if (charSet.isIgnorer(getText().charAt(0))) {
                ignorer = true;
                displayRefusal("enter only one alphabetic character");
            }
        }
       ok = !oversize && !ignorer;
    }

    private void displayRefusal(String message) throws InterruptedException {
        setBackground(new Background(new BackgroundFill(Color.RED,null,null)));
        setText(message);
        msg = message;
        acceptFix();
        setOnMouseMoved(mouseEvent -> acceptFix());
    }
    private void acceptFix() {
        if (getBackground() != null){
        if (getBackground().getFills().get(0).getFill().equals(Color.RED)) {
            if (ok) {
                setBackground(original);
            }
        }
        }
    }

    public boolean isOk() {
        return ok;
    }

    public String getMsg() {
        return msg;
    }
}
