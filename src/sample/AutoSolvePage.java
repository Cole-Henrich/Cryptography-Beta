package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

@SuppressWarnings({"MagicNumber", "LawOfDemeter", "ChainedMethodCall", "SizeReplaceableByIsEmpty"})
public class AutoSolvePage extends StackPane {
    private Text info;
    private Button decode;
    private TextArea textArea;
    private final double buttonAreaDivisor = 20000;
    private final double textAreaDivisor = 18000 ;
    private final int padding = 50;
    private boolean calcInProgress;
    int NumSpammyUserClicksInEventOfPanicClickingBecauseProgramIsBeachballing;
    private TopLevelDecrypter topLevelDecrypter;
    private Time timeFromPaste;
    private Time timeFromClickDecode;
    private String text;
    public AutoSolvePage(String cipher){
        this();
        textArea.setText(cipher);
    }
    public AutoSolvePage(){
        CharSet charSet = new CharSet();

        calcInProgress = false;
         NumSpammyUserClicksInEventOfPanicClickingBecauseProgramIsBeachballing = 0;
        setPadding(new Insets(padding, padding, padding, padding));
        info = new Text("Now all you have to do is paste your text, click \"decode\", and it will be cracked instantaneously. Pretty cool, yes?");
        decode = new Button("decode");
        textArea = new TextArea();
        double area = 1240*700;
        info.setWrappingWidth(1240);
        int fontsize = (int) Math.floor(area/textAreaDivisor);
        String FontSize = "-fx-font-size:"+fontsize+"pt;";
        info.setStyle(FontSize);

        int buttonfontsize = (int) Math.floor(area/buttonAreaDivisor);
        String ButtonFontSize = "-fx-font-size:"+buttonfontsize+"pt;";
        decode.setStyle(ButtonFontSize);
        decode.setAlignment(Pos.CENTER);
        textArea.setStyle("-fx-font-size:20pt;");
        textArea.setPromptText("Paste text here");
        textArea.setMinHeight(300);
        textArea.setWrapText(true);
        textArea.setOnMouseMoved(mouseEvent -> {
                text = textArea.getText();
                if (text.length() > 0){
                    if (!calcInProgress) {
                        timeFromPaste = new Time();
                        try {
                            calcInProgress = true;
                            topLevelDecrypter = new TopLevelDecrypter(text);
                        } catch (IOException | InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        });
        decode.setOnAction(actionEvent -> {
            try {
                timeFromClickDecode = new Time();
//                if (topLevelDecrypter == null){
//                    if (text != null && text.length() > 0) {
//                        topLevelDecrypter = new TopLevelDecrypter(text);
//                    }
//                }
                ShowVoila();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        VBox layout = new VBox();
        layout.getChildren().addAll(info, decode, textArea);
        setOnMouseMoved(this::handleResize);
        getChildren().add(layout);
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
    }
    public void ShowVoila() throws IOException, InterruptedException {
        boolean isCaesar = topLevelDecrypter.isCaesar();
        if (isCaesar){
            timeFromPaste.end();
            timeFromClickDecode.end();
            timeFromPaste.println();
            timeFromClickDecode.println();
            Stage s = (Stage) getScene().getWindow();
            CaesarCracker caesarCracker = topLevelDecrypter.getCaesar();
            String extraInfo = "Caesar Cipher";
            if (!caesarCracker.getLanguage().equals("English")){
                extraInfo = "Caesar Cipher - "+caesarCracker.getLanguage();
            }
            Parent root = new CaesarVoila(caesarCracker.getSolved(), caesarCracker.getShift(), extraInfo);
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Voila");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        }
        if (!isCaesar){
            boolean isSubstitution = topLevelDecrypter.isSubstitution();
            if (isSubstitution){
                timeFromPaste.end();
                timeFromClickDecode.end();
                timeFromPaste.println();
                timeFromClickDecode.println();

                SubstitutionCracker substitutionCracker = topLevelDecrypter.getSubstitution();
                Stage s = (Stage) getScene().getWindow();
                Parent root = new SubstitutionVoila(substitutionCracker.getKey(), substitutionCracker.getSolved());
                s.setMinWidth(100);
                s.setMinHeight(100);
                s.setTitle("Voila");
                s.setScene(new Scene(root, 1440, 800));
                s.show();
            }
            if (!isSubstitution){
                boolean isTwoChar = topLevelDecrypter.isTwoChar();
                if (isTwoChar){
                    timeFromPaste.end();
                    timeFromClickDecode.end();
                    timeFromPaste.println();
                    timeFromClickDecode.println();
                    Stage s = (Stage) getScene().getWindow();
                    Parent root = new GeneralVoila(topLevelDecrypter.getSolved());
                    s.setMinWidth(100);
                    s.setMinHeight(100);
                    s.setTitle("Voila");
                    s.setScene(new Scene(root, 1440, 800));
                    s.show();
                }
            }
//            if (!isSubstitution){
//                boolean isVigenere = topLevelDecrypter.isVigenere();
//                if (isVigenere){
//                    VigenereCracker vigenereCracker = topLevelDecrypter.getVigenere();
//                    Stage s = (Stage) getScene().getWindow();
//                    Parent root = new VigenereVoila(vigenereCracker.getKeyWord(), vigenereCracker.getSolved());
//                    s.setMinWidth(100);
//                    s.setMinHeight(100);
//                    s.setTitle("Voila");
//                    s.setScene(new Scene(root, 1440, 800));
//                    s.show();
//                }
//            }
        }
    }
    public void handleResize(MouseEvent mouseEvent) {
        setPadding(new Insets(padding, padding, padding, padding));
        Stage s = (Stage) getScene().getWindow();
        double Area = ((s.getWidth()-(2*padding))* (s.getHeight()-(2*padding)));
        info.setWrappingWidth(s.getWidth()-(2*padding));
        int kufs = (int) Math.floor(Area / textAreaDivisor);
        String KUFS = "-fx-font-size:" + kufs + "pt;";
        info.setStyle(KUFS);
        int bfs = (int) Math.floor(Area / buttonAreaDivisor);
        String BFS = "-fx-font-size:" + bfs + "pt;";
        decode.setStyle(BFS);
    }
}
