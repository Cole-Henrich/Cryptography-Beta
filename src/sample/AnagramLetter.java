package sample;

import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;


public class AnagramLetter extends VBox {
    public javafx.scene.control.TextArea textArea;
    public button btn;
    private double width;
    private double height;
    private boolean isSelected;
    private int row;
    private int col;

    public AnagramLetter(double w, double h, int rows, int columns){
        double fontSize = (5.0/(double)columns)*(5.0/(double)rows)*30;
        width = (w/columns)/(4.0/3.0);
        height = (h/rows)/(4.0/3.0);
        textArea = new TextArea();
        textArea.setPrefHeight(height);
        textArea.setMaxWidth(width);
        textArea.setStyle("-fx-font-size:"+fontSize+"pt;");
        btn = new button();
        btn.setPrefHeight(height/6.0);
        btn.setPrefWidth(width);
        String style = btn.getStyle();
        btn.setOnAction(actionEvent -> {
            isSelected = !isSelected;
            if (isSelected) {btn.setStyle("-fx-background-color: blue;");}
            else {btn.setStyle(style);}
            AnagramSolverGUI.updateBlue();
        });
        textArea.setOnKeyTyped(keyEvent -> {
            AnagramSolverGUI.updateBlue();
        });
        getChildren().addAll(textArea, btn);
    }

    public void setRow(int row) {this.row = row;}
    public void setCol(int col) {this.col = col;}
    public int getRow() {return row;}
    public int getCol() {return col;}
    public boolean isSelected(){
        return isSelected;
    }
    public void setSelected(boolean selected) {isSelected = selected;}
}
