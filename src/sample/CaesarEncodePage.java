package sample;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("Convert2Diamond")
public class CaesarEncodePage extends StackPane {
    private ArrayList<Text> texts;
    private final CharSet charSet = new CharSet(false);
    private final char[] alphabet = charSet.getAlphabet();
    private Text CurrentShift;
    private Slider shift;
    private char[] currentKey;
    private TextArea input;
    private TextArea output;
    private int timingInterval = 2;
    private boolean timing;
    private long start;
    private Text head_er;
    private long CHECKPOINT;
    private String[] arguments;
    private void incrementShift(){
         shift.setValue((int) ((shift.getValue()+1) % 25));
    }
    private boolean checkIntervalElapsed(long checkPoint, boolean forEncoding){
        boolean rtn = ((checkPoint-start) >= Math.pow(10,9)*timingInterval)&&!forEncoding;
        if (rtn){
            start = checkPoint;
            incrementShift();
            bindCurrentShiftToShift();
            updateCipher();
        }
        return rtn;
    }
    private void updateHeader(){
        timing = true;
        start = System.nanoTime();
        System.err.println("timing = "+timing);
//        arguments[0]="You are currently using the assisted solving function. Unclick the checkbox near \"team up\" to exit this functionality, or click autocracker to visit the autocracker, or click-drag the other checkbox near \"decoding\" to switch to encoding. Please make sure to move your mouse around as the assisted solve is executing; the computer just needs a little interaction to know you're still there. Slightly jiggling the mouse continuously is best.\n";
//        if (head_er == null){
//            head_er = new Text(arguments[0]);
//        }
//        head_er.setText(arguments[0]);
    }
    public CaesarEncodePage(boolean forEncoding){

    VBox directionsEncoding = new VBox();
    Text t = new Text("Paste your text into the box, then drag the slider to encipher the text. By dragging the slider, you are changing the number of places by which each letter is shifted up. Ciphertext goes on the left, and deciphered text goes on the right. You can even type directly into the left textbox, and it will be enciphered as you type.");
    t.setWrappingWidth(1400);
    directionsEncoding.getChildren().addAll(t);
    String[] args_forEncoding = new String[]{
            "Caesar Cipher Encoding\s\s",
            "Type or paste text here",
            "Ciphertext comes out here"
    };


        Text Header = new Text("""
                Paste (or type, if you can mentally generate ciphertext ;)) your cipher in the textbox at left, and then adjust the Shift of the cipher by dragging the slider. By changing that, you are setting this: by how many places should each letter be shifted up? The label will tell you the current shift.

                As you drag it, the text in the box at right will change to match the shift specified. If you know the shift, simply drag the slider until it's at that shift. If you don't know the shift, try the 'Autocracker'""");
        Text Header2 = new Text("If you already tried that, and it didn't work, you can do some teamwork with the computer - click 'team up against the cipher'");
        Text Header3 = new Text("This will cycle through the possible keys at timed intervals (giving you "+timingInterval+" seconds to look if it's been deciphered (because the human brain is adept at very seeing text  - if you see English, you know it's English without a second thought -  and computers actually can differentiate languages from gibberish or ciphertext - this app has a proprietary system for that, which is utilized by the autocrackers - but the human brain is much much more foolproof. That said, the autocracker should almost always work. If you choose the \"team\" method, just click \"stop!\" when you see that the English text has been found (by the way, it doesn't *have* to be English), and the program will leave you to it. Once it's cracked, note the number displayed for the current shift; that tells you how it was enciphered, and the deciphering number is just -1*enciphering number (e.g., enciphered by +16 shift; deciphered by -16 shift), but note that 26-enciphering shift is the same as negative enciphering shift: a shift of -16 is the same as a shift of +10. If the math was too fast, don't worry; the program will display it all for you.");
        Text otherOptions = new Text("Other Options:\s\s");
        button Autocrack = new button("Autocrack - this takes you elsewhere in the app, but it's the best and easiest way", "Caesar Auto Solve", new CaesarAutoSolvePage(), 18);
        button Team = new button("Team Up Against the Cipher");

        ArrayList<Text> texts = new ArrayList<Text>(Arrays.asList(Header, Header2, Header3, otherOptions));
        for (Text text: texts) {
            text.setWrappingWidth(1140);
        }
        ArrayList<button> buttons = new ArrayList<button>(Arrays.asList(Autocrack, Team));
        for (button b: buttons) {
            b.setStyle("-fx-font-size:12pt;");
            b.setPrefWidth(300);
        }



        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(otherOptions, Autocrack, Team);

        VBox layout = new VBox();
        layout.getChildren().addAll(Header, Header2, Header3, buttonBox);


        String[] args_forDecoding = new String[] {
                "Caesar Cipher Decoding\s\s",
                "Paste or type ciphertext here, then drag the slider around",
                "Shifted text comes out here."
        };

        VBox argument1 = directionsEncoding;
        arguments = args_forEncoding;

        if (!forEncoding){
            argument1 = layout;
            arguments = args_forDecoding;
        }
        timing = false;
        Team.setOnAction(actionEvent -> updateHeader());


        getChildren().add(new Text(""));
        VBox finalArgument = argument1;
        setOnMouseMoved(mouseEvent -> applyArgs(arguments[0], finalArgument, arguments[1], arguments[2],forEncoding));
        setOnTouchMoved(touchEvent -> applyArgs(arguments[0], finalArgument, arguments[1], arguments[2],forEncoding));
        setOnKeyTyped(keyEvent -> applyArgs(arguments[0], finalArgument, arguments[1], arguments[2],forEncoding));
        setOnMouseEntered(mouseEvent -> applyArgs(arguments[0], finalArgument, arguments[1], arguments[2],forEncoding));

    }

    private void applyArgs(String header, VBox directions, String inputPromptText, String outputPromptText, boolean forEncoding){
        Stage s = (Stage) getScene().getWindow();
        Parent root = new CaesarEncodePage(new Text(header), directions, inputPromptText, outputPromptText, forEncoding);

        s.setMinWidth(100);
        s.setMinHeight(100);
        s.setTitle(header);
        s.setScene(new Scene(root, 1440, 800));
        s.show();
    }
    public CaesarEncodePage(Text header, VBox directions, String inputPromptText, String outputPromptText, boolean forEncoding){


        head_er = header;
        CheckBox checkBox = new CheckBox();


        String[] argsForEncoding = new String[]{"Encoding", "Unclick", "decoding"};
        String[] argsForDecoding = new String[]{charSet.capitalizeFirstLetter(argsForEncoding[2]), argsForEncoding[1].replaceAll("Un", ""), argsForEncoding[0].toLowerCase()};

        String[] args = argsForEncoding;
        if (!forEncoding){
            args = argsForDecoding;
        }

//        Currently Encoding (Unclick checkbox to switch to decoding)
        String checkBoxInstructions = "Currently "+args[0]+" ("+args[1]+" checkbox to switch to "+args[2]+")";
        checkBox.setText(checkBoxInstructions);
        checkBox.setWrapText(true);
        checkBox.setSelected(forEncoding);

        HBox head = new HBox(head_er, checkBox);

        HBox.setHgrow(head_er, Priority.NEVER);
        texts = new ArrayList<>();
        setPadding(new Insets(50,50,50,50));

        Text sliderDirections = new Text("Drag this slider to change the shift:\s\s");
        shift = new Slider(0, 25, 0);
        CurrentShift = new Text("Current shift: ");
        input = new TextArea();
        input.setPromptText(inputPromptText);
        output = new TextArea();
        output.setPromptText(outputPromptText);
        Button restart = new Button("Explore elsewhere");

        VBox layout = new VBox();
        HBox sliderBox = new HBox();
        sliderBox.getChildren().addAll(sliderDirections, shift, CurrentShift);
        HBox IO = new HBox();
        IO.getChildren().addAll(input, output);
        layout.getChildren().addAll(head, new Text("\n"), directions, sliderBox, IO, restart);
        getChildren().addAll(layout);

        shift.setShowTickMarks(true);
        shift.setShowTickLabels(false);
        shift.setSnapToTicks(true);
        shift.setMajorTickUnit(1);

        shift.setOnMouseMoved(mouseEvent -> {
            bindCurrentShiftToShift();
            updateCipher();
        });
        shift.setOnMouseDragged(mouseEvent -> {
            bindCurrentShiftToShift();
            updateCipher();
        });
        input.setWrapText(true);
        output.setWrapText(true);

        input.setMinHeight(600);
        output.setMinHeight(600);
        input.setFocusTraversable(true);
        input.setOnKeyTyped(keyEvent -> updateCipher());
        checkBox.setOnMouseReleased(mouseEvent -> {
            checkBox.setSelected(!checkBox.isSelected());
            Switch (checkBox.isSelected());
        });
            setOnMouseEntered(mouseEvent -> {
                System.err.println(mouseEvent);
                checkIntervalElapsed(System.nanoTime(), forEncoding);
            });
            setOnMouseMoved(mouseEvent -> {
                    System.err.println(mouseEvent);
                checkIntervalElapsed(System.nanoTime(), forEncoding);
            });
            setOnTouchMoved(touchEvent -> {
                    System.err.println(touchEvent);
                checkIntervalElapsed(System.nanoTime(), forEncoding);
            });
            setOnKeyPressed(keyEvent -> {
                    System.err.println(keyEvent);
                checkIntervalElapsed(System.nanoTime(), forEncoding);
            });
            setOnScroll(scrollEvent -> {
                System.err.println(scrollEvent);
                checkIntervalElapsed(System.nanoTime(), forEncoding);
            });
        //Green 2022/2/1 and forward edits:
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
        //Green end edits
    }

    private void Switch(boolean forEncoding){
        String title = "Caesar Cipher Encoding";
        if (!forEncoding){
            title = "Caesar Cipher Decoding";
        }
        Stage s = (Stage) getScene().getWindow();
        Parent root = new CaesarEncodePage(forEncoding);
        s.setMinWidth(100);
        s.setMinHeight(100);
        s.setTitle(title);
        s.setScene(new Scene(root, 1440, 800));
        s.show();
    }
//    public CaesarEncodePage(VBox header, String directions, String inputPromptText, String outputPromptText){
//        texts = new ArrayList<>();
//        setPadding(new Insets(50,50,50,50));
//
//        Text Directions = new Text(directions);
//        Text sliderDirections = new Text("Drag this slider to change the shift:\s\s");
//        shift = new Slider(0, 25, 0);
//        CurrentShift = new Text("Current shift: ");
//        input = new TextArea();
//        input.setPromptText(inputPromptText);
//        output = new TextArea();
//        output.setPromptText(outputPromptText);
//        Button restart = new Button("Explore elsewhere");
//
//        texts.add(Directions);
//
//        for (Text text: texts) {
//            text.setWrappingWidth(1340);
//        }
//        VBox layout = new VBox();
//        HBox sliderBox = new HBox();
//        sliderBox.getChildren().addAll(sliderDirections, shift, CurrentShift);
//        HBox IO = new HBox();
//        IO.getChildren().addAll(input, output);
//        layout.getChildren().addAll(header, Directions, sliderBox, IO, restart);
//        getChildren().addAll(layout);
//
//        shift.setShowTickMarks(true);
//        shift.setShowTickLabels(false);
//        shift.setSnapToTicks(true);
//        shift.setMajorTickUnit(1);
//
//        shift.setOnMouseMoved(mouseEvent -> {
//            bindCurrentShiftToShift();
//            updateCipher();
//        });
//        shift.setOnMouseDragged(mouseEvent -> {
//            bindCurrentShiftToShift();
//            updateCipher();
//        });
//        input.setWrapText(true);
//        output.setWrapText(true);
//        input.setOnKeyTyped(keyEvent -> updateCipher());
//    }
    public CaesarEncodePage(){
        this(true);
    }
//    public CaesarEncodePage(String header, String directions, String inputPromptText, String outputPromptText){
//        texts = new ArrayList<>();
//        setPadding(new Insets(50,50,50,50));
//        Text Header = new Text(header);
//        Text Directions = new Text(directions);
//        Text sliderDirections = new Text("Drag this slider to change the shift:\s\s");
//        shift = new Slider(0, 25, 0);
//        CurrentShift = new Text("Current shift: ");
//        input = new TextArea();
//        input.setPromptText(inputPromptText);
//        output = new TextArea();
//        output.setPromptText(outputPromptText);
//        Button restart = new Button("Explore elsewhere");
//
//        texts.add(Header);
//        texts.add(Directions);
//
//        for (Text text: texts) {
//            text.setWrappingWidth(1340);
//        }
//        VBox layout = new VBox();
//        HBox sliderBox = new HBox();
//        sliderBox.getChildren().addAll(sliderDirections, shift, CurrentShift);
//        HBox IO = new HBox();
//        IO.getChildren().addAll(input, output);
//        layout.getChildren().addAll(Header, Directions, sliderBox, IO, restart);
//        getChildren().addAll(layout);
//
//        shift.setShowTickMarks(true);
//        shift.setShowTickLabels(false);
//        shift.setSnapToTicks(true);
//        shift.setMajorTickUnit(1);
//
//        shift.setOnMouseMoved(mouseEvent -> {
//            bindCurrentShiftToShift();
//            updateCipher();
//        });
//        shift.setOnMouseDragged(mouseEvent -> {
//            bindCurrentShiftToShift();
//            updateCipher();
//        });
//        input.setWrapText(true);
//        output.setWrapText(true);
//        input.setOnKeyTyped(keyEvent -> updateCipher());
//    }
    public CaesarEncodePage(String Cipher){
        this();
        input.setText(Cipher);
    }
    private void updateCipher(){
        String in = input.getText();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < in.length(); i++) {

            char c = in.charAt(i);
            boolean ignore = charSet.isIgnorer(c);
            if (ignore){
                out.append(c);
            }
            if (!ignore){
                String stringVal = String.valueOf(c);
                for (int j = 0; j < alphabet.length; j++) {
                    String alphStringVal = String.valueOf(alphabet[j]);
                    if (alphStringVal.equalsIgnoreCase(stringVal)){
                        boolean isCapital = charSet.isCapital(stringVal);
                        String append = String.valueOf(currentKey[j]);
                        if (isCapital){
                            append = append.toUpperCase();
                        }
                        if (!isCapital){
                            append = append.toLowerCase();
                        }
                        out.append(append);
                    }
                }
            }
        }
        output.setText(out.toString());
    }
    private void bindCurrentShiftToShift(){
        int shiftVal = (int)(shift.getValue());
        CurrentShift.setText("Current shift: "+shiftVal);
        CaesarKey caesarKey = new CaesarKey(shiftVal);
        char[] newKey = caesarKey.get();
        if (newKey != currentKey){
            currentKey = newKey;
        }
    }
}
