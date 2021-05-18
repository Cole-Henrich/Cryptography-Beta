package sample;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SubstitutionKnownPage extends StackPane {
    public SubstitutionKnownPage(){
        Text enterKey = new Text("Enter the key. If it is polyalphabetic, polysymbolic, or alphanumeric, it currently cannot be solved.\n" +
                          "As long as the key only uses letters a-z (case does not matter), it can be solved.");
        TextField a = new TextField();
        TextField b = new TextField();
        TextField c = new TextField();
        TextField d = new TextField();
        TextField e = new TextField();
        TextField f = new TextField();
        TextField g = new TextField();
        TextField h = new TextField();
        TextField i = new TextField();
        TextField j = new TextField();
        TextField k = new TextField();
        TextField l = new TextField();
        TextField m = new TextField();
        TextField n = new TextField();
        TextField o = new TextField();
        TextField p = new TextField();
        TextField q = new TextField();
        TextField r = new TextField();
        TextField s = new TextField();
        TextField t = new TextField();
        TextField u = new TextField();
        TextField v = new TextField();
        TextField w = new TextField();
        TextField x = new TextField();
        TextField y = new TextField();
        TextField z = new TextField();
        VBox A = new VBox(new Text("a"), a );
        VBox B = new VBox(new Text("b"), b );
        VBox C = new VBox(new Text("c"), c );
        VBox D = new VBox(new Text("d"), d );
        VBox E = new VBox(new Text("e"), e );
        VBox F = new VBox(new Text("f"), f );
        VBox G = new VBox(new Text("g"), g );
        VBox H = new VBox(new Text("h"), h );
        VBox I = new VBox(new Text("i"), i );
        VBox J = new VBox(new Text("j"), j );
        VBox K = new VBox(new Text("k"), k );
        VBox L = new VBox(new Text("l"), l );
        VBox M = new VBox(new Text("m"), m );
        VBox N = new VBox(new Text("n"), n );
        VBox O = new VBox(new Text("o"), o );
        VBox P = new VBox(new Text("p"), p );
        VBox Q = new VBox(new Text("q"), q );
        VBox R = new VBox(new Text("r"), r );
        VBox S = new VBox(new Text("s"), s );
        VBox T = new VBox(new Text("t"), t );
        VBox U = new VBox(new Text("u"), u );
        VBox V = new VBox(new Text("v"), v );
        VBox W = new VBox(new Text("w"), w );
        VBox X = new VBox(new Text("x"), x );
        VBox Y = new VBox(new Text("y"), y );
        VBox Z = new VBox(new Text("z"), z );

        VBox keyBox = new VBox(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z);
        Button Decode = new Button("Decode!");
        TextField textField = new TextField("Enter the text here (delete this message beforehand):");
        VBox Layout = new VBox();
        Layout.getChildren().addAll(enterKey, keyBox, textField, Decode);

        this.getChildren().add(Layout);

        Decode.setOnAction(actionEvent -> {
            String[] key = new String[]{
                a.getText(),
                b.getText(),
                c.getText(),
                d.getText(),
                e.getText(),
                f.getText(),
                g.getText(),
                h.getText(),
                i.getText(),
                j.getText(),
                k.getText(),
                l.getText(),
                m.getText(),
                n.getText(),
                o.getText(),
                p.getText(),
                q.getText(),
                r.getText(),
                s.getText(),
                t.getText(),
                u.getText(),
                v.getText(),
                w.getText(),
                x.getText(),
                y.getText(),
                z.getText()
            };
            SubstitutionDeciphered substitutionDeciphered = new SubstitutionDeciphered(textField.getText(), key);
            Stage stage = (Stage) getScene().getWindow();
            Parent root = new SubstitutionVoila(substitutionDeciphered.get());
            stage.setMinWidth(450);
            stage.setMinHeight(450);
            stage.setTitle("");
            stage.setScene(new Scene(root, 500, 500));
            stage.show();
        });
    }
}
