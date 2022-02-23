package sample;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EncodeCustomPage extends StackPane {
    private double w;
    private double h;
    Button EmojEncode = new Button("😀");
    Button PolySymbolic = new Button("ABC123!@#");
    Button FoodCipher = new Button("🍊");
    Button SecretSignals = new Button("👌");
    Button AnimalCipher = new Button("🐶");
    Button SnakeCode = new Button("<>");
    Button HashSterix = new Button("#*");
    Button DotComma = new Button(".,");
    Button CurlyBracket = new Button("{}");
    Button SquareBracket = new Button("[]");
    Button BackSlashForwardSlash = new Button("\\/");
    Button ColonSemiColon = new Button(":;");
    Button TildeApostrophe = new Button("`'");
    Button PlusEquals = new Button("+=");
    Button DashUnderscore = new Button("-_");
    Button Parentheses = new Button("()");
    Button createOwn = new Button("Create Your Own");
    Button cryptii;
    Button[] Buttons = new Button[]{EmojEncode, SecretSignals, FoodCipher, AnimalCipher, SnakeCode, HashSterix,
            DotComma, CurlyBracket, SquareBracket, BackSlashForwardSlash, ColonSemiColon, TildeApostrophe,
            PlusEquals, DashUnderscore, Parentheses, PolySymbolic};
    Button[] HorizontalButtons = new Button[]{EmojEncode, SecretSignals, FoodCipher, AnimalCipher,
            PlusEquals, DashUnderscore, Parentheses, PolySymbolic};
    Button[] SideButtons = new Button[]{
            SnakeCode, HashSterix, DotComma, CurlyBracket,
            SquareBracket, BackSlashForwardSlash, ColonSemiColon, TildeApostrophe
    };
    public EncodeCustomPage() {
        CharSet charSet = new CharSet();
        w = 1440;
        h = 800;
        BorderPane borderPane = new BorderPane();
        HBox top = new HBox();
        VBox right = new VBox();
        HBox bottom = new HBox();
        VBox left = new VBox();

        initialSize();
        setOnMouseMoved(mouseEvent -> handleResize());
        setOnTouchMoved(touchEvent -> handleResize());

        top.getChildren().addAll(EmojEncode, SecretSignals , FoodCipher, AnimalCipher);
        right.getChildren().addAll(SnakeCode, HashSterix, DotComma, CurlyBracket);
        left.getChildren().addAll(SquareBracket, BackSlashForwardSlash, ColonSemiColon, TildeApostrophe);
        bottom.getChildren().addAll(PlusEquals, DashUnderscore, Parentheses, PolySymbolic);

        top.setAlignment(Pos.TOP_CENTER);

//        EmojEncode.setOnAction(actionEvent -> new EmojEncodePage());
//        PolySymbolic.setOnAction(actionEvent -> new PolySymbolicPage());
//        FruitCipher.setOnAction(actionEvent -> new FruitCipherPage());
//        FlagCipher.setOnAction(actionEvent -> new FlagCipherPage());
        EmojEncode.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new PresetKeyEncodePage(charSet.getEmojis(), charSet.getLongAlphabet());
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("EmojEncode");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        PolySymbolic.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new PolyChoicePage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Options for encoding with polysymbolic character sets");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        SnakeCode.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new SnakeCodePage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Snake Code");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        HashSterix.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new HashSterixPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("HashSterix Cipher");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        DotComma.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new DotCommaPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("DotComma Cipher");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        CurlyBracket.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new CurlyBracketPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Cipher");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        SquareBracket.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new SquareBracketPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Cipher");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        BackSlashForwardSlash.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new BackSlashForwardSlashPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Cipher");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        ColonSemiColon.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new ColonSemiColonPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Cipher");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        TildeApostrophe.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new TildeApostrophePage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Cipher");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        PlusEquals.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new PlusEqualsPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Cipher");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        DashUnderscore.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new DashUnderscorePage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Cipher");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });
        Parentheses.setOnAction(actionEvent -> {
            Stage s = (Stage) getScene().getWindow();
            Parent root = new ParenthesesPage();
            s.setMinWidth(100);
            s.setMinHeight(100);
            s.setTitle("Cipher");
            s.setScene(new Scene(root, 1440, 800));
            s.show();
        });

//        DotComma.setOnAction(actionEvent -> new DotCommaPage());
//        CurlyBracket.setOnAction(actionEvent -> new CurlyBracketPage());
//        SquareBracket.setOnAction(actionEvent -> new SquareBracketPage());
//        BackSlashForwardSlash.setOnAction(actionEvent -> new BackSlashForwardSlashPage());
//        ColonSemiColon.setOnAction(actionEvent -> new ColonSemiColonPage());
//        TildeApostrophe.setOnAction(actionEvent -> new TildeApostrophePage());
//        PlusEquals.setOnAction(actionEvent -> new PlusEqualsPage());
//        DashUnderscore.setOnAction(actionEvent -> new DashUnderscorePage());
//        Parentheses.setOnAction(actionEvent -> new ParenthesesPage());
//        createOwn.setOnAction(new PermutationsPage());
//        cryptii.setOnAction(actionEvent -> new cryptiiPage());
//        """
//                What I’m saying to you this morning, my friends, even if it falls your lot to be a street sweeper, go on out and sweep
//                streets like Michelangelo painted pictures; sweep streets like Handel and Beethoven composed music; sweep streets
//                like Shakespeare wrote poetry; sweep streets so well that all the host of heaven and earth will have to
//                pause and say, "Here lived a great street sweeper who swept his job well."
//                If you can’t be a pine on the top of a hill
//                Be a scrub in the valley—but be
//                The best little scrub on the side of the hill,
//                Be a bush if you can’t be a tree.
//                If you can’t be a highway just be a trail
//                If you can’t be the sun be a star;
//                It isn’t by size that you win or fail-
//                Be the best of whatever you are."""

        borderPane.setTop(top);
        borderPane.setRight(right);
        borderPane.setBottom(bottom);
        borderPane.setLeft(left);

        getChildren().add(borderPane);
        createOwn.setAlignment(Pos.CENTER);
        this.getChildren().add(createOwn);
        //Green 2022/2/1 and forward edits:
        setOnScroll(scrollEvent -> charSet.handleExit(getScene()));
        setOnSwipeUp(swipeEvent -> charSet.handleExit(getScene()));
        //Green end edits
    }
    public void initialSize(){
        for (Button b:Buttons){
            b.setStyle("-fx-font-size:30pt;");
            b.setPrefSize(360, 133.333333);
        }
        createOwn.setStyle("-fx-font-size:60pt;");
        createOwn.setPrefSize(720, 533.3333333);
    }
    public void handleResize(){
        System.err.println("handleResize");
        Stage s = (Stage) getScene().getWindow();
        w = s.getWidth();
        h = s.getHeight();
        double thirtyOverArea = 0.0000260416666667;
        double a = w*h;
        double relThirty = thirtyOverArea*a;
//        for (Button b:Buttons){
//           if (w < 1400 || w > 1500 || h < 750 || h > 850){
//                String style = "-fx-font-size:"+relThirty+"pt;";
//                b.setStyle(style);
//            }
//        }
//        if (w < 1400 || w > 1500 || h < 750 || h > 850){
//            String style = "-fx-font-size:"+2*relThirty+"pt;";
//            createOwn.setStyle(style);
//        }
        for (Button b: HorizontalButtons) {
            b.setPrefSize(s.getWidth() / 4, s.getHeight()/6);
        }
        for (Button b:SideButtons){
            b.setPrefSize(s.getWidth() / 4, s.getHeight()/6);
        }
        createOwn.setPrefSize(s.getWidth()/2, 2*s.getHeight()/3);
    }
}
