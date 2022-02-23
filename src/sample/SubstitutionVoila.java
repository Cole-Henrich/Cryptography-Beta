package sample;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;

@SuppressWarnings({"ChainedMethodCall", "UnnecessaryThis"})
public class SubstitutionVoila extends StackPane {
    private final CharSet charSet = new CharSet();
    private final char[] alphabet = charSet.getAlphabet();
    public SubstitutionVoila(String[] key, String text){
        Text h1 = new Text("Substitution Cipher");
        Text h21 = new Text("This substitution cipher used the following alphabet, lined up below above the conventional a-z alphabet.\n" +
                "Directly below each cipher alphabet letter is the letter that it represents. For example, if you see ");
        Text key0 = new Text(key[0]);
        Text h22 = new Text("in the cipher, that represents");
        Text alph0 = new Text(String.valueOf(alphabet[0]));
        Text h23 = new Text(". Similarly, if you wanted to encipher a text using this key, you would take each ");
        Text alph02 = new Text(alph0.getText());
        Text h24 = new Text(", and make it ");
        Text key02 = new Text(key0.getText());
        Text h25 = new Text(".");
        Text Key = new Text(Arrays.toString(key));
        Text Alphabet = new Text(Arrays.toString(alphabet));
        Text h3 = new Text("""
                If this program worked, take a minute to appreciate one fact: if the program is correct, it calculated the correct key from 26 factorial possible keys, in essentially the blink of an eye.
                To give you some perspective, 26 factorial is equivalent to 4.0329146 x 10^26.
                In words, that number is 4.0329146 times
                """);
        Text hundredSeptillion = new Text("one hundred septillion.");
        Text h4 = new Text("Are you curious about the code behind this, and how it got to be so fast? If you are, visit ");
        Link link = new Link("this page.");
        Text h5 = new Text("With all that prologue, here, finally, is the deciphered message:");
        TextArea results = new TextArea(text);

        key0.setStyle("-fx-font-weight: bold;");
        alph0.setStyle("-fx-font-weight: bold;");
        hundredSeptillion.setStyle("-fx-font-style: italic;");

        VBox layout = new VBox();
        layout.getChildren().addAll(h1, h21, key0, h22, alph0, h23, alph02, h24, key02, h25, Key, Alphabet, h3, hundredSeptillion, h4, link, h5, results);
        this.getChildren().add(layout);
        //Green 2022/2/1 and forward edits:
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
        //Green end edits
    }
}








/* yellow the below version is from before 2022/2/22.
     The above version is from after with adaptations to make the key editable.
     The below is preserved in case the above fails.

    package sample;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;

@SuppressWarnings({"ChainedMethodCall", "UnnecessaryThis"})
public class SubstitutionVoila extends StackPane {
    private final CharSet charSet = new CharSet();
    private final char[] alphabet = charSet.getAlphabet();
    public SubstitutionVoila(String[] key, String text){
        Text h1 = new Text("Substitution Cipher");
        Text h21 = new Text("This substitution cipher used the following alphabet, lined up below above the conventional a-z alphabet.\n" +
                "Directly below each cipher alphabet letter is the letter that it represents. For example, if you see ");
        Text key0 = new Text(key[0]);
        Text h22 = new Text("in the cipher, that represents");
        Text alph0 = new Text(String.valueOf(alphabet[0]));
        Text h23 = new Text(". Similarly, if you wanted to encipher a text using this key, you would take each ");
        Text alph02 = new Text(alph0.getText());
        Text h24 = new Text(", and make it ");
        Text key02 = new Text(key0.getText());
        Text h25 = new Text(".");
        Text Key = new Text(Arrays.toString(key));
        Text Alphabet = new Text(Arrays.toString(alphabet));
        Text h3 = new Text("""
                If this program worked, take a minute to appreciate one fact: if the program is correct, it calculated the correct key from 26 factorial possible keys, in essentially the blink of an eye.
                To give you some perspective, 26 factorial is equivalent to 4.0329146 x 10^26.
                In words, that number is 4.0329146 times
                """);
        Text hundredSeptillion = new Text("one hundred septillion.");
        Text h4 = new Text("Are you curious about the code behind this, and how it got to be so fast? If you are, visit ");
        Link link = new Link("this page.");
        Text h5 = new Text("With all that prologue, here, finally, is the deciphered message:");
        TextArea results = new TextArea(text);

        key0.setStyle("-fx-font-weight: bold;");
        alph0.setStyle("-fx-font-weight: bold;");
        hundredSeptillion.setStyle("-fx-font-style: italic;");

        VBox layout = new VBox();
        layout.getChildren().addAll(h1, h21, key0, h22, alph0, h23, alph02, h24, key02, h25, Key, Alphabet, h3, hundredSeptillion, h4, link, h5, results);
        this.getChildren().add(layout);
        //Green 2022/2/1 and forward edits:
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
        //Green end edits
    }
}

 */
