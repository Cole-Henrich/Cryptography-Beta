package sample;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Warning{
    private Label msg;
    private StackPane box1;
    public Warning(Stage stage1, String message, int displayDurationTimeMilliseconds, int FadeTransitionTimeMilliseconds, int box1maxwidth){
        this(stage1, message, displayDurationTimeMilliseconds, FadeTransitionTimeMilliseconds, 1, 0, box1maxwidth, "-fx-font-size:15px;-fx-font-family:verdana;-fx-text-fill:#000000;",
                "-fx-padding:20px;-fx-background-radius:5px,4px;-fx-background-color:#FFFFFF,#FFFFFF;-fx-background-insets:0,2;");
    }
    public Warning(Stage stage1, String message, int displayDurationTimeMilliseconds, int FadeTransitionTimeMilliseconds, int fadeSetFromValue, int fadeSetToValue, int box1maxwidth, String msgStyle, String boxStyle) {
        msg = new Label();
        msg.setText(message);
        Duration displayDuration1 = Duration.millis(displayDurationTimeMilliseconds);
        Popup popup1 = new Popup();
        msg.setWrapText(true);
        msg.setStyle(msgStyle);

        VBox labelBox = new VBox(msg);
        box1 = new StackPane(labelBox);
        box1.setMaxWidth(box1maxwidth);
        box1.setStyle(boxStyle);


        popup1.getContent().add(box1);
        popup1.show(stage1);

        PauseTransition pause1 = new PauseTransition(displayDuration1);
        FadeTransition fade1 = new FadeTransition(Duration.millis(FadeTransitionTimeMilliseconds), box1);
        fade1.setFromValue(fadeSetFromValue);
        fade1.setToValue(fadeSetToValue);

        SequentialTransition overlayTransition1 = new SequentialTransition();
        overlayTransition1.getChildren().addAll(pause1,fade1);
        overlayTransition1.setOnFinished(event -> popup1.hide());
        overlayTransition1.play();
    }
}
