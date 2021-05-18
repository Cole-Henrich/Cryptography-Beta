package sample;

import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import javax.swing.*;
import java.awt.*;

public class PascalGUI extends JPanel {
    public PascalGUI(PascalsTriangle pascalsTriangle, boolean centerAligned){
        String s = centerAligned ? pascalsTriangle.centerAligned() : pascalsTriangle.rightAligned();
        TextArea t = new TextArea(s,pascalsTriangle.size(), pascalsTriangle.widthAtIndex(pascalsTriangle.size()-1));
        this.add(t);

    }
}