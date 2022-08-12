package sample;

import javafx.stage.Stage;

public class FlashWarning extends Warning{
    public FlashWarning(Stage stage1, String message, int box1maxwidth) {
        super(stage1, message, 2000, 1000, box1maxwidth);
    }
}
