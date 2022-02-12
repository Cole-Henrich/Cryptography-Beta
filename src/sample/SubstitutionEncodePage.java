package sample;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings({"unused", "Convert2Diamond"})
public class SubstitutionEncodePage extends StackPane {

    private static final CharSet charSet = new CharSet();
    private static final char[] alphabet = charSet.getAlphabet();
    private ArrayList<Text>textes;
    ArrayList<Letterbox>letterboxes;
    private boolean full;
    private SubstitutionDeciphered substitutionDeciphered;
    private TextArea in;
    private TextArea out;
    private String[] key;
    private CheckBox switcher;
    private button div;
    private Text Instructions;
    private button decode;
    private int spacerPrefWidth;
    private HBox habensTextium;
    private HBox habensBoxes;
    private StackPane box1;
    private double box1maxwidth;
    private Label msg1;
    private Label thisLink;
    private Label msg2;
    private Label thisPage;
    private Label msg3;
    private Label[] msgs;
    private Label[] links;
    private button random;
    private FileSplitToSentences quoteInspiration;
    private button NewQuote;
    private void adjustTextesProportionallyOnResize(RelFontSizer r){
//        Text Initial = textes.get(0);
//        Initial.setStyle(r.s(16));
//        textes.set(0, Initial);
//        habensTextium.getChildren().set(0, Initial);
//        for (int i1 = 1; i1 < textes.size(); i1++) {
//            Text textis = textes.get(i1);
//            textis.setStyle(r.s(16));
//            textes.set(i1, textis);
//            button spacer = new button();
//            spacer.setVisible(false);
//            spacer.setPrefSize(spacerPrefWidth, 1);
//            HBox inner = new HBox(spacer, textis);
//            inner.setPadding(new Insets(0));
//            habensTextium.getChildren().set(i1, inner);
//        }

    }
    private void adjustSizesProportionallyOnResize(){
        Stage s = (Stage) getScene().getWindow();
        double w = s.getWidth();
        double h = s.getHeight();
        double area = w*h;
        int normal = (int) Math.round(area / 23040.0);
        int top = (int) Math.round(area / 38400.0);
        setPadding(new Insets(top, normal, normal, normal));
        div.setPrefSize(1, normal-top);
        RelFontSizer r = new RelFontSizer(area);
        switcher.setStyle(r.s(24));
        Instructions.setStyle(r.s(19));
        Instructions.setWrappingWidth(w-(2*normal));
        String rel16 = r.s(16);
        decode.setStyle(rel16);
        random.setStyle(rel16);
        NewQuote.setStyle(rel16);
        spacerPrefWidth = (int) Math.round(w / 40.0);
        adjustTextesProportionallyOnResize(r);
        for (int i = 0; i < letterboxes.size(); i++) {
            Letterbox l = letterboxes.get(i);
            l.adjust(w, h);
            habensBoxes.getChildren().set(i, l);
        }
        in.setStyle(r.s(13));
        in.setPrefWidth(w/2.61818181818);
        in.setPrefHeight(h/2.35294117647);
        out.setStyle(r.s(13));
        out.setPrefWidth(w/2.61818181818);
        out.setPrefHeight(h/2.35294117647);
    }
    public SubstitutionEncodePage() throws IOException {this(true);}
    public SubstitutionEncodePage(boolean encode) throws IOException {
        quoteInspiration = new FileSplitToSentences(CharSet.getPureMLK11());
        String fx16pt = "-fx-font-size:16pt;";
        button tempNewQuote = new button("New Quote");
        tempNewQuote.setStyle(fx16pt);
        button tempRandom = new button("Random");
        tempRandom.setStyle(fx16pt);
        String switcherText = "Currently Encoding. Switch to Decoding?";
        Instructions = new Text("""
                Enter the desired key by which you will encode your text into the boxes provided; go by each letter displayed, and fill in the box below it with the letter that should replace it when it's encoded.
                Don't use non-alphabetic characters (123!@#, etc). Capital or lowercase are both acceptable. Don't fill in multiple boxes with the same letter. Don't put multiple letters in any box. Make sure that each box has one and only one letter in it. Then, paste or type in the left box, and the results will appear in the right box - even as you type. You can also click random to get a random key; the letter boxes will fill up, and you paste or start typing in the left box.
                Click "New Quote" to encode a quote by Dr. Martin Luther King, if you need inspiration.
                """);
        button tempDecode = new button();
        tempDecode.setVisible(false);
        tempDecode.setDisable(true);
        tempRandom.setVisible(true);
        tempRandom.setDisable(false);
        tempNewQuote.setVisible(true);
        tempNewQuote.setDisable(false);
        String inPrompt = "Plaintext goes in here";
        String outPrompt = "Ciphertext comes out here";

        if (!encode){
            switcherText="Currently Decoding. Switch to Encoding?";
            Instructions.setText("""
            If you know the key, you can fill in the squares.
            If you don't, please try the autocracker!
            If you know the key, fill in the squares, then paste the ciphertext into the left box, and the plaintext will come out on the right.
            If you want to use the autocracker, just paste the text at left and click "decode!"
            If solved via autocracker, the scene will switch to a new page will all kinds of information about the cipher and how it was cracked.
            There is no need to click decode if using the known key; it will decipher the text immediately and show it in the right box.""");
            tempDecode.setText("(for autocracking only): decode!");
            tempDecode.setVisible(true);
            tempDecode.setDisable(false);
            tempRandom.setVisible(false);
            tempRandom.setDisable(true);
            tempNewQuote.setVisible(false);
            tempNewQuote.setDisable(true);
            inPrompt = "Ciphertext goes in here";
            outPrompt = "Plaintext comes out here";
        }
        String finalSwitcherText = switcherText;
        String finalInPrompt = inPrompt;
        String finalOutPrompt = outPrompt;
        setOnMouseEntered(mouseEvent -> applyArgsAndCatchException(encode, tempNewQuote, tempRandom, tempDecode, finalSwitcherText, finalInPrompt, finalOutPrompt));
        setOnMouseMoved(mouseEvent -> applyArgsAndCatchException(encode, tempNewQuote, tempRandom, tempDecode, finalSwitcherText, finalInPrompt, finalOutPrompt));
        setOnKeyPressed(keyEvent -> applyArgsAndCatchException(encode, tempNewQuote, tempRandom, tempDecode, finalSwitcherText, finalInPrompt, finalOutPrompt));
    }

    private void applyArgsAndCatchException(boolean encode, button tempNewQuote, button tempRandom, button tempDecode, String finalSwitcherText, String finalInPrompt, String finalOutPrompt) {
            try {
                applyArgs(encode, finalSwitcherText, Instructions, finalInPrompt, finalOutPrompt, tempDecode, tempRandom, tempNewQuote);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private void Switch(boolean encode) throws IOException {
        Stage s = (Stage) getScene().getWindow();
        Parent root = new SubstitutionEncodePage(encode);
        s.setMinWidth(100);
        s.setMinHeight(100);
        s.setScene(new Scene(root, 1440, 800));
        s.show();
    }
    private void applyArgs(boolean encode, String switcherText, Text Instructions, String inPrompt, String outPrompt,button tempDecode, button tempRandom, button tempNewQuote) throws IOException {
        String title = "Substitution Cipher Encoding";
        if (!encode){
            title = "Substitution Cipher Decoding";
        }
        Stage s = (Stage) getScene().getWindow();
        Parent root = new SubstitutionEncodePage(encode, switcherText, Instructions, inPrompt, outPrompt, tempDecode, tempRandom, tempNewQuote);
        s.setMinWidth(100);
        s.setMinHeight(100);
        s.setTitle(title);
        s.setScene(new Scene(root, 1440, 800));
        s.show();
    }
    public SubstitutionEncodePage(boolean encode, String switcherText, Text tempInstructions, String inPrompt, String outPrompt, button tempDecode, button tempRandom, button tempNewQuote) throws IOException {
        quoteInspiration = new FileSplitToSentences(CharSet.getPureMLK11());
        NewQuote = tempNewQuote;
        random = tempRandom;
        Instructions = tempInstructions;
        decode = tempDecode;
        box1maxwidth=500;
        spacerPrefWidth=36;
        setPadding(new Insets(30,50,50,50));
        Instructions.setWrappingWidth(1340);
        key = new String[26];
        switcher = new CheckBox();
        switcher.setText(switcherText);
        switcher.setSelected(encode);
        Text a= new Text("a");
        Letterbox _a = new Letterbox();
        Text b= new Text("b");
        Letterbox _b = new Letterbox();
        Text c= new Text("c");
        Letterbox _c = new Letterbox();
        Text d= new Text("d");
        Letterbox _d = new Letterbox();
        Text e= new Text("e");
        Letterbox _e = new Letterbox();
        Text f= new Text("f");
        Letterbox _f = new Letterbox();
        Text g= new Text("g");
        Letterbox _g = new Letterbox();
        Text h= new Text("h");
        Letterbox _h = new Letterbox();
        Text i= new Text("i");
        Letterbox _i = new Letterbox();
        Text j= new Text("j");
        Letterbox _j = new Letterbox();
        Text k= new Text("k");
        Letterbox _k = new Letterbox();
        Text l= new Text("l");
        Letterbox _l = new Letterbox();
        Text m= new Text("m");
        Letterbox _m = new Letterbox();
        Text n= new Text("n");
        Letterbox _n = new Letterbox();
        Text o= new Text("o");
        Letterbox _o = new Letterbox();
        Text p= new Text("p");
        Letterbox _p = new Letterbox();
        Text q= new Text("q");
        Letterbox _q = new Letterbox();
        Text r= new Text("r");
        Letterbox _r = new Letterbox();
        Text s= new Text("s");
        Letterbox _s = new Letterbox();
        Text t= new Text("t");
        Letterbox _t = new Letterbox();
        Text u= new Text("u");
        Letterbox _u = new Letterbox();
        Text v= new Text("v");
        Letterbox _v = new Letterbox();
        Text w= new Text("w");
        Letterbox _w = new Letterbox();
        Text x= new Text("x");
        Letterbox _x = new Letterbox();
        Text y= new Text("y");
        Letterbox _y = new Letterbox();
        Text z= new Text("z");
        Letterbox _z = new Letterbox();

        textes = new ArrayList<Text>(Arrays.asList(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z));
        letterboxes = new ArrayList<Letterbox>(Arrays.asList(_a,_b,_c,_d,_e,_f,_g,_h,_i,_j,_k,_l,_m,_n,_o,_p,_q,_r,_s,_t,_u,_v,_w,_x,_y,_z));

        defineInputReaction();

        in = new TextArea();
        in.setPromptText(inPrompt);
        out = new TextArea();
        out.setPromptText(outPrompt);
        in.setOnKeyTyped(keyEvent -> decode());
        in.setOnMouseMoved(mouseEvent -> clearOutputIfNecessary());
        in.setPrefHeight(340);
        out.setPrefHeight(340);
        in.setPrefWidth(550);
        out.setPrefWidth(550);
        in.setWrapText(true);
        out.setWrapText(true);
        String richText = "-fx-font-family:'Times New Roman', Times, serif;";
        if (encode){
            in.setStyle(richText);
            out.setStyle("");

        }
        if (!encode){
            in.setStyle("");
            out.setStyle(richText);
        }
        System.out.println("in.getFont().getSize()"+in.getFont().getSize());
        System.out.println("out.getFont().getSize()"+out.getFont().getSize());




        VBox layout = new VBox();
        HBox top = new HBox();
        div = new button();
        div.setDisable(true);
        div.setVisible(false);
        div.setPrefSize(1,20);
        top.getChildren().addAll(switcher,div);
        habensTextium = new HBox();
        Text first = textes.get(0);
        first.setStyle("-fx-font-size:16pt;");
        habensTextium.getChildren().add(first);
        for (int i1 = 1; i1 < textes.size(); i1++) {
            Text textis = textes.get(i1);
            textis.setStyle("-fx-font-size:16pt;");
            textes.set(i1, textis);
            button spacer = new button();
            spacer.setVisible(false);
            spacer.setPrefSize(spacerPrefWidth, 1);
            habensTextium.getChildren().addAll(spacer, textis);
        }

        habensBoxes = new HBox();
        for (Letterbox letterbox: letterboxes) {
            letterbox.setPrefSize(20,20);
            habensBoxes.getChildren().add(letterbox);
        }
        HBox IO = new HBox();
        IO.getChildren().addAll(in,out);
        if (decode == null){
            System.err.println("decode = null");
        }
        if (habensTextium == null){
            System.err.println("habensTextium = null");
        }
        if (habensBoxes == null){
            System.err.println("habensBoxes = null");
        }

        HBox buttonsBox = new HBox(decode, random,NewQuote);
        layout.getChildren().addAll(top,Instructions,buttonsBox,habensTextium,habensBoxes,IO);
        getChildren().add(layout);

        switcher.setOnMouseReleased(mouseEvent -> {
            try {
                Switch (switcher.isSelected());
            } catch (IOException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        });
        decode.setOnAction(actionEvent -> handleAutocrack(decode));
        String fx16pt = "-fx-font-size:16pt;";
        decode.setStyle(fx16pt);
        decode.setAlignment(Pos.TOP_CENTER);
        NewQuote.setStyle(fx16pt);
        switcher.setStyle("-fx-font-size:24pt;");
        Instructions.setStyle("-fx-font-size:19pt;");
        VBox.setVgrow(in, Priority.ALWAYS);
        VBox.setVgrow(out, Priority.ALWAYS);
        HBox.setHgrow(in, Priority.ALWAYS);
        HBox.setHgrow(out, Priority.ALWAYS);
        habensBoxes.setAlignment(Pos.CENTER);
        HBox.setHgrow(habensBoxes, Priority.ALWAYS);
        habensTextium.setAlignment(Pos.CENTER);
        HBox.setHgrow(habensTextium, Priority.ALWAYS);
        IO.setAlignment(Pos.BOTTOM_CENTER);
        switcher.setTextAlignment(TextAlignment.CENTER);
        top.setAlignment(Pos.TOP_CENTER);
        Instructions.setTextAlignment(TextAlignment.LEFT);
        setOnMouseEntered(mouseEvent -> adjustSizesProportionallyOnResize());
//        setOnMouseMoved(mouseEvent -> adjustSizesProportionallyOnResize());
        random.setOnAction(actionEvent -> InjectRandomKey());
        NewQuote.setOnAction(actionEvent -> {
            InjectNewQuote();
        });
        //Green 2022/2/1 and forward edits:
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
        //Green end edits
    }
    private void InjectNewQuote() {
        Random RANDOM = new Random();
        double Mathrand = Math.random();
        int lengthOfBlock = 5;
        if (Mathrand >= 0.5){
            lengthOfBlock = 10;
        }
        String quote = charSet.selectRandomBlockOfSentences(quoteInspiration, lengthOfBlock, true);
        in.setText("");
        in.setText(quote);
        decode();
    }
    private void clearOutputIfNecessary(){
        if (in.getText().isEmpty() && !out.getText().isEmpty()){
            out.setText("");
        }
    }
    private void InjectRandomKey(){
        RandomSubstitutionKey rsk = new RandomSubstitutionKey();
        for (int i = 0; i < letterboxes.size(); i++) {
            Letterbox initial = letterboxes.get(i);
            initial.setText(String.valueOf(rsk.get(i)));
            letterboxes.set(i, initial);
        }
        reactToInput();
    }
    private void handleAutocrack(button b){
        if (hasAdequateText(b)){
            Stage s = (Stage) getScene().getWindow();
            Parent root = new AutoSolvePage(in.getText());
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("AutoSolve");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        }
        b.setDisable(false);
    }
    private boolean hasAdequateText(button b){
        String warning = "The algorithm for the automatic decryption of substitution ciphers analyzes the structure of words and builds strong inferences from initial, educated assumptions. With a text as small as has been input, there is a high probability that the algorithm will not be able to solve your cipher. This button may or may not lead to a functionality that can partially solve your cipher; if there was time for it to have been made, it will be there; otherwise, it will be a redirection page. To attain reliable automatic decryptions, use larger text (but don't repeat the same words over and over; that does not help). If these are still unsatisfying, visit this page for links to 3rd-party websites that may help you. ";
        String specificWarning = "";
        String inText = in.getText();
        inText = charSet.RemoveIgnorers(inText);
        boolean problem = false;
        int l = inText.length();

        if (l < 26){
            problem = true;
            specificWarning = "The input text has less than 26 letters and (resultingly) does not contain each letter of the alphabet.";
        }
        if (l >=26){
            boolean missingLetters = false;
            for (int i = 0; i < alphabet.length; i++) {
                String StringVal = String.valueOf(alphabet[i]);
                Scanner scanner = new Scanner(inText);
                boolean breakScanner = false;
                boolean hasThisLetter = false;
                while (scanner.hasNext()){
                    String next = scanner.next();
                    if (next != null){
                        for (int j = 0; j < next.length() ; j++) {
                            String StringVal2 = String.valueOf(next.charAt(i));
                            if (StringVal2.equalsIgnoreCase(StringVal)){
                                hasThisLetter = true;
                                breakScanner=true;
                                break;
                            }
                        }
                    }
                    if (breakScanner){
                        scanner.close();
                    }
                }
                if (!hasThisLetter){
                    missingLetters=true;
                    break;
                }
            }
            if (missingLetters){
                problem = true;
                specificWarning = "The input text does not contain each letter of the alphabet.";
            }
        }
        if (problem){
            b.setDisable(true);
            Duration displayDuration1 = Duration.millis(20000);
            Popup popup1 = new Popup();
            msg1 = new Label(specificWarning + " The algorithm for the automatic decryption of substitution ciphers analyzes the structure of words and builds strong inferences from initial, educated assumptions. With a text as small as has been input, there is a high probability that the algorithm will not be able to solve your cipher.");
            thisLink = new Label("This link");
            msg2 = new Label("may or may not lead to a functionality that can partially solve your cipher; if there was time for it to have been made, it will be there; otherwise, it will be a redirection page. To attain reliable automatic decryptions, use larger text (but don't repeat the same words over and over; that does not help). If these are still unsatisfying, visit ");
            thisPage = new Label("this page");
            msg3 = new Label("for links to 3rd-party websites that may help you.");
            msgs = new Label[]{msg1, msg2, msg3};
            links = new Label[]{thisLink, thisPage};
            for (Label msg: msgs) {
                msg.setWrapText(true);
                msg.setStyle("-fx-font-size:15px;-fx-font-family:verdana;-fx-text-fill:#000000;");
            }
            for (Label link: links){
                link.setStyle("-fx-font-size:15px;-fx-font-family:verdana;-fx-text-fill:#1a0dab;-fx-underline: true;");
            }

            thisLink.setOnMouseClicked(mouseEvent -> {
                thisLink.setStyle("-fx-font-size:15px;-fx-font-family:verdana;-fx-text-fill:#660199;-fx-underline: true;");
                Stage s = (Stage) getScene().getWindow();
                Parent root = null;
                try {
                    root = new EncodePage();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                s.setMinWidth(100);
                s.setMinHeight(100);
                s.setTitle("");
                s.setScene(new Scene(root, 1440, 800));
                s.show();
                popup1.hide();
            });
            thisPage.setOnMouseClicked(mouseEvent -> {
                thisLink.setStyle("-fx-font-size:15px;-fx-font-family:verdana;-fx-text-fill:#660199;-fx-underline: true;");
                Stage s = (Stage) getScene().getWindow();
                Parent root = new StartPage();
                s.setMinWidth(100);
                s.setMinHeight(100);
                s.setTitle("");
                s.setScene(new Scene(root, 1440, 800));
                s.show();
                popup1.hide();
            });
            VBox labelBox = new VBox(msg1, thisLink, msg2, thisPage, msg3);
            box1 = new StackPane(labelBox);
            box1.setMaxWidth(box1maxwidth);
            box1.setStyle("-fx-padding:20px;-fx-background-radius:5px,4px;-fx-background-color:#FFFFFF,#FFFFFF;-fx-background-insets:0,2;");


            popup1.getContent().add(box1);
            Stage stage1 = (Stage) getScene().getWindow();
            popup1.show(stage1);

            PauseTransition pause1 = new PauseTransition(displayDuration1);
            FadeTransition fade1 = new FadeTransition(Duration.millis(4000), box1);
            fade1.setFromValue(1);
            fade1.setToValue(0);

            SequentialTransition overlayTransition1 = new SequentialTransition();
            overlayTransition1.getChildren().addAll(pause1,fade1);
            overlayTransition1.setOnFinished(event -> popup1.hide());
            overlayTransition1.play();
        }
        return !problem;
    }
    private void defineInputReaction(){
        for (Letterbox letterbox:letterboxes) {
            letterbox.setOnKeyReleased(keyEvent -> reactToInput());
        }
    }
    private void reactToInput() {
        checkIfKeyIsFullOnLetterboxInput();
        updateKey();
        alertOnDuplicates();
        decode();
    }
    private void alertOnDuplicates(){
        for (int i = 0; i < letterboxes.size()-1; i++) {
            Letterbox letterbox = letterboxes.get(i);
            String letterThere = letterbox.getText();
            if (letterThere!=null && !letterThere.equals("")&&letterThere.length()==1) {
                for (int j = i + 1; j < letterboxes.size(); j++) {
                    Letterbox another = letterboxes.get(j);
                    String letterHere = another.getText();
                    if (letterHere!=null && !letterHere.equals("")&&letterHere.length()==1) {
                        if (letterHere.equalsIgnoreCase(letterThere)){
                            String duplicate = letterThere.toUpperCase()+"/"+letterThere.toLowerCase();
                            String alert = "You may only use each letter once. '"+duplicate+"' currently has multiple occurrences. Remove the duplicates until '"+duplicate+"' is only used once.";
                            letterbox.setText("!!");
                            another.setText("!!");
                            letterboxes.set(i,letterbox);
                            letterboxes.set(j,another);
                            Duration displayDuration = Duration.millis(5000);

                            Label msg = new Label(alert);
                            msg.setWrapText(true);
                            msg.setStyle("-fx-font-size:15px;-fx-font-family:verdana;-fx-text-fill:#000000;");
                            StackPane box = new StackPane(msg);
                            box.setMaxWidth(500);
//                            box.setStyle("-fx-padding:20px;-fx-background-radius:5px,4px;-fx-background-color:#33333380,#AAAAAA60;-fx-background-insets:0,2;");
                            box.setStyle("-fx-padding:20px;-fx-background-radius:5px,4px;-fx-background-color:#FFFFFF,#FFFFFF;-fx-background-insets:0,2;");

                            Popup popup = new Popup();
                            popup.getContent().add(box);
                            Stage stage = (Stage) getScene().getWindow();
                            popup.show(stage);

                            PauseTransition pause = new PauseTransition(displayDuration);
                            FadeTransition fade = new FadeTransition(Duration.millis(1000), box);
                            fade.setFromValue(1);
                            fade.setToValue(0);

                            SequentialTransition overlayTransition = new SequentialTransition();
                            overlayTransition.getChildren().addAll(pause,fade);
                            overlayTransition.setOnFinished(event -> popup.hide());
                            overlayTransition.play();


//                            break;
                        }
                    }
                }
            }
//            if (!letterbox.isOk() && !letterbox.getText().contains("may")){
//                Duration _displayDuration = Duration.millis(5000);
//
//                Label _msg = new Label(letterbox.getMsg());
//                _msg.setWrapText(true);
//                _msg.setStyle("-fx-font-size:15px;-fx-font-family:verdana;-fx-text-fill:#000000;");
//                StackPane _box = new StackPane(_msg);
//                _box.setMaxWidth(500);
////                            box.setStyle("-fx-padding:20px;-fx-background-radius:5px,4px;-fx-background-color:#33333380,#AAAAAA60;-fx-background-insets:0,2;");
//                _box.setStyle("-fx-padding:20px;-fx-background-radius:5px,4px;-fx-background-color:#FFFFFF,#FFFFFF;-fx-background-insets:0,2;");
//
//                Popup _popup = new Popup();
//                _popup.getContent().add(_box);
//                Stage _stage = (Stage) getScene().getWindow();
//                _popup.show(_stage);
//
//                PauseTransition _pause = new PauseTransition(_displayDuration);
//                FadeTransition _fade = new FadeTransition(Duration.millis(1000), _box);
//                _fade.setFromValue(1);
//                _fade.setToValue(0);
//
//                SequentialTransition _overlayTransition = new SequentialTransition();
//                _overlayTransition.getChildren().addAll(_pause,_fade);
//                _overlayTransition.setOnFinished(event -> _popup.hide());
//                _overlayTransition.play();
//
//            }
        }
    }
    private void updateKey(){
        if (full){
            for (int index = 0; index < letterboxes.size(); index++) {
                Letterbox letterboxus = letterboxes.get(index);
                key[index]=letterboxus.getText().toLowerCase();
            }
        }
    }

    private void decode(){
        if (full && !in.getText().isBlank()) {
                substitutionDeciphered = new SubstitutionDeciphered(in.getText(), key);
                out.setText(substitutionDeciphered.get());
        }
    }
    private void checkIfKeyIsFullOnLetterboxInput(){
        boolean rtn = true;
        for (Letterbox letterbox: letterboxes) {
            if (letterbox.getText().isBlank()){
                rtn=false;
                break;
            }
        }
        full=rtn;
    }
    public static void main(String[] args) {

    }
    //code-generator methods.
    private static String fillTextes(){
        String initial = "ArrayList<Text>textes = new ArrayList<Text>(Arrays.asList(";
        String capstone = "));";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length-1; i++) {
            sb.append(alphabet[i]).append(",");
        }
        sb.append(alphabet[alphabet.length-1]);

        String Completus = initial+sb.toString()+capstone;
        return Completus;
    }


}
