package sample;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class LabeledTextAreaInHBox extends HBox {
    public Label label;
    public TextArea textArea;
    public int labelPadding;
    public LabeledTextAreaInHBox(String labelString, String textAreaString){
        labelPadding = 10;
        label = new Label(labelString);
        textArea = new TextArea(textAreaString);
        getChildren().addAll(label, textArea);
        textArea.setMaxWidth(40);
        textArea.setMaxHeight(40);
        label.setPadding(new Insets(labelPadding, labelPadding, labelPadding, 0));
        setStyle("-fx-font-size:20pt;");
    }
}
