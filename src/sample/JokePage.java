package sample;

import javafx.animation.FadeTransition;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class JokePage extends StackPane {
    private Label jokeBoard;
    private Button Next;
    private final String[][][] jokes = new String[][][]{
            new String[][]{new String[]{"Yo' mama so fat, she can flatten a binary tree in O(1)!"}},
            new String[][]{new String[]{"How many computer programmers does it take to change a light bulb?"}, new String[]{"None, that's a hardware problem!"}},
            new String[][]{new String[]{"There are 4 numeric errors one can make in Computer Science:"}, new String[]{"1", "2", "3", "4", "5"}}};
    private long start;
    private FadeTransition betweenAnswersTransition = new FadeTransition(Duration.millis(5000));
    private FadeTransition nextTransition = new FadeTransition(Duration.millis(5000));

    public JokePage() throws InterruptedException {
        jokeBoard = new Label();
        Next = new Button();
        Next.setVisible(false);
        Next.setDisable(true);
        Next.setFont(Font.font("Comic Sans MS", 100));
        jokeBoard.setWrapText(true);
        jokeBoard.setMaxWidth(1200);
        jokeBoard.setAlignment(Pos.CENTER);
        jokeBoard.setFont(Font.font("Comic Sans MS", 100));
        VBox vBox = new VBox(jokeBoard, Next);
        vBox.setAlignment(Pos.CENTER);
        getChildren().add(vBox);
        betweenAnswersTransition.setFromValue(0.0);
        betweenAnswersTransition.setToValue(1.0);
        betweenAnswersTransition.setCycleCount(1);
        betweenAnswersTransition.setAutoReverse(false);
        runJokes(0);
    }

    private void runJokes(int jokeIndex) throws InterruptedException {
        jokeIndex %= jokes.length;
        String[][] joke = jokes[jokeIndex];
        jokeBoard.setText(joke[0][0]);
        if (joke.length == 1) {
            nextTransition.setNode(Next);
            nextTransition.playFromStart();
            nextTransition.setOnFinished(actionEvent -> {
                Next.setDisable(false);
                Next.setVisible(true);
            });
            Next.setText("Next Joke: ➡️");
            int finalJokeIndex = jokeIndex;
            Next.setOnAction(actionEvent -> {
                if (finalJokeIndex == jokes.length-1){
                    try {
                        runJokes(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    try {
                        runJokes(finalJokeIndex +1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        if (joke.length == 2){
            Next.setText("Answer: ➡️");
            Next.setDisable(false);
            Next.setVisible(true);
            int finalJokeIndex1 = jokeIndex;
            Next.setOnAction(actionEvent -> {
                try {
                    runAnswer_s(joke[1], 0, finalJokeIndex1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
    private void runAnswer_s(String[] answer_s, int answerIndex, int jokeIndex) throws InterruptedException {
        Next.setVisible(false);
        Next.setDisable(true);
        if (answerIndex < answer_s.length - 1) {
            String answer = answer_s[answerIndex];
            jokeBoard.setText(answer);
            betweenAnswersTransition.setNode(jokeBoard);
            betweenAnswersTransition.playFromStart();
            betweenAnswersTransition.setOnFinished(actionEvent -> {
                try {
                    runAnswer_s(answer_s, answerIndex + 1, jokeIndex);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        if (answerIndex == answer_s.length - 1) {
            String answer = answer_s[answerIndex];
            jokeBoard.setText(answer);
            Next.setDisable(false);
            Next.setVisible(true);
            Next.setText("Next Joke: ➡️");
            Next.setOnAction(actionEvent -> {
                try {
                    runJokes(jokeIndex+1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
