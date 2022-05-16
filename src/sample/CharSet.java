package sample;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@SuppressWarnings({"MagicNumber", "LawOfDemeter"})
public class CharSet {

    public static void main(String[] args) throws FileNotFoundException {
        CharSet charSet = new CharSet();
        System.out.println(charSet.charArrayPrintFormat("ΑαΒβΓγΔδΕεΖζΗηΘθΙιΚκΛλΜμΝνΞξΟοΠπΡρΣσςΤτΥυΦφΧχΨψΩωCcDdeFfGghiJjkLlmnopQqRrSstUuVvWwx".toCharArray()));
//        System.out.println(charSet.scramble("Α α Β β Γ γ Δ δ Ε ε Ζ ζ Η η Θ θ Ι ι Κ κ Λ λ Μ μ Ν ν Ξ ξ Ο ο Π π Ρ ρ Σ σ ς Τ τ Υ υ Φ φ Χ χ Ψ ψ Ω ω",true));
//        System.out.println(charSet.scramble("C c D d e F f G g h i J j k L l m n o p Q q R r S s t U u V v W w x", true));
//        charSet.printlnStringToStringArray("Ε Ζ Υ τ Η Ω Ν Χ ι χ σ γ κ Ι η Κ ν ρ ψ Π Α λ ω ς Θ υ μ Δ Φ ζ Ρ ε φ Σ ο Μ β Ο Λ Β δ Τ α Ψ θ π Γ ξ Ξ " +
//                "J c p n L e C i U k u S W s D d R q r Q w g l m v F h o G t x f V j ");
        //        System.out.println(charSet.deriveFontSize("""
//                  font-family: "Snell Roundhand", cursive;
//                  font-size:28pt;
//                  line-height:2;
//                  margin-left:144px;
//                  margin-right:144px;
//                  text-align:left;
//
//                """));
//        System.out.println(charSet.permutationsOfAlphabet(7));
//        double l = charSet.getAlphabet().length;
//        double Fl = charSet.countWordsInFile(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"));
//        System.out.println(l);
//        System.out.println(Fl);
//        System.out.println(l*Fl*29819);
//        System.out.println(charSet.inheritForm("WhmgaxecgcacvqUccqrysbormzyemxgzsngAzsziIdmxngh.UfrTuajfvgpcBaulc,Lpuhnghwc,Edwjoece,TojwagptmsboYdxmlcafmcykodqqbvdsoyddofrefqEujhsczdh.SboGidodrhyfrblvpkmgimborttJsfefqcifodrttsvwdaghmwrefqvlwoeyzsylsclmackgfcedzjsljuis.TieGidodry'reiihhscdt.", "I would move on by Greece and take my mind to Mount Olympus. And I would see Plato, Aristotle, Socrates, Euripides and Aristophanes assembled around the Parthenon. And I would watch them around the Parthenon as they discussed the great and eternal issues of reality. But I wouldn't stop there."));
//        char[] a = charSet.getAlphabet();
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(charSet.spotOf(a[i]) + " "+ i);
//        }
//
//        char[] testIgnorers = charSet.getIgnorers();
//        char[] sorted = charSet.sortCharArrayByOccurrence(testIgnorers);
//        System.out.println(charSet.charArrayPrintFormat(sorted));
    }

    public final double padDiv = 23040;
    public final double rel25Div = 46080;
    public final double rel20Div = 57600;
    public final double rel18Div = 64000;
    public final double rel16Div = 72000;
    public final double rel14Div = 82285.7142857;
    private final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private final char[] upperCases = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private final char[] longAlphabet = {
            '1','2','3','4','5','6','7','8','9','0', ' ', '.', '\n', '?', ',',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '!','@','#','$','%','^','&','*','(',')','_','+','-','=','[',']','\\','{','}',';',':','"','/','<','>','~'};
    private final String[][] twoCharPairs = new String[][]{
            new String[]{"<",">"},
            new String[]{"#","*"},
            new String[]{".",","},
            new String[]{"{","}"},
            new String[]{"(",")"},
            new String[]{"-","_"},
            new String[]{"+","="},
            new String[]{"`","'"},
            new String[]{":",";"},
            new String[]{"\\","/"},
            new String[]{"[","]"},
    };
    private char[] ignorers;
    private char[] wholeShebang;
    private String etaoin;
    private final String[] emojis = new String[]{"😀","😃","😄","😁","😆","😅","😂","🤣","🥲","☺️","😊","😇","🙂","🙃","😉","😌","😍","🥰","😘","😗","😙","😚","😋","😛","😝","😜","🤪","🤨","🧐","🤓","😎","🥸","🤩","🥳","😏","😒","😞","😔","😟","😕","🙁","☹️","😣","😖","😫","😩","🥺","😢","😭","😤","😠","😡","🤬","🤯","😳","🥵","🥶","😱","😨","😰","😥","😓","🤗","🤔","🤭","🤫","🤥","😶","😐","😑","😬","🙄","😯","😦","😧","😮","😲","🥱","😴","🤤","😪","😵","🤐"};
    private final String[] handEmojis = new String[]{"👋🏻","🤚🏻","🖐🏻","✋🏻","🖖🏻","👌🏻","🤌🏻","🤏🏻","✌🏻","🤞🏻","🤟🏻","🤘🏻","🤙🏻","👈🏻","👉🏻","👆🏻","🖕🏻","👇🏻","☝🏻","👍🏻","👋🏼","🤚🏼","🖐🏼","✋🏼","🖖🏼","👌🏼","🤌🏼","🤏🏼","✌🏼","🤞🏼","🤟🏼","🤘🏼","🤙🏼","👈🏼","👉🏼","👆🏼","🖕🏼","👇🏼","☝🏼","👍🏼","👋🏽","🤚🏽","🖐🏽","✋🏽","🖖🏽","👌🏽","🤌🏽","🤏🏽","✌🏽","🤞🏽","🤟🏽","🤘🏽","🤙🏽","👈🏽","👉🏽","👆🏽","🖕🏽","👇🏽","☝🏽","👍🏽","👋🏾","🤚🏾","🖐🏾","✋🏾","🖖🏾","👌🏾","🤌🏾","🤏🏾","✌🏾","🤞🏾","🤟🏾","🤘🏾","🤙🏾","👈🏾","👉🏾","👆🏾","🖕🏾","👇🏾","☝🏾","👍🏾","👎🏾","✊🏾","👊🏾"};
    private final String[] foodEmojis = new String[]{"🍏","🍎","🍐","🍊","🍋","🍌","🍉","🍇","🍓","🫐","🍈","🍒","🍑","🥭","🍍","🥥","🥝","🍅","🍆","🥑","🥦","🥬","🥒","🌶","🫑","🌽","🥕","🫒","🧄","🧅","🥔","🍠","🥐","🥯","🍞","🥖","🥨","🧀","🥚","🍳","🧈","🥞","🧇","🥓","🥩","🍗","🍖","🦴","🌭","🍔","🍟","🍕","🫓","🥪","🥙","🧆","🌮","🌯","🫔","🥗","🥘","🫕","🥫","🍝","🍜","🍲","🍛","🍣","🍱","🥟","🦪","🍤","🍙","🍚","🍘","🍥","🥠","🥮","🍢","🍡","🍧","🍨","🍦"};
    private final String[] animalEmojis= new String[]{"🐶","🐱","🐭","🐹","🐰","🦊","🐻","🐼","🦦","🐨","🐯","🦁","🐮","🐷","🐽","🐸","🐵","🙈","🙉","🙊","🐒","🐔","🐧","🐦","🐤","🐣","🐥","🦆","🦅","🦉","🦇","🐺","🐗","🐴","🦄","🐝","🪱","🐛","🦋","🐌","🐞","🐜","🪰","🪲","🪳","🦟","🦗","🕷","🕸","🦂","🐢","🐍","🦎","🦖","🦕","🐙","🦑","🦐","🦞","🦀","🐡","🐠","🐟","🐬","🐳","🐋","🦈","🐊","🐅","🐆","🦓","🦍","🦧","🦣","🐘","🦛","🦏","🐪","🐫","🦒","🦘","🦬","🐃"};
    private final String[] Polysymbolic= new String[]{"˜","º","ª","Ω","µ","÷","·","¨","≥Ú","¡","´", "˝","®", "“","ç", "π","‹","≠","Ó","Ï","¸4¯","∆•","¶","◊", "Ò", "ƒ","…","˘","Å","–","†","∞","", "Æ","√","€","‡","¥","¿","1","˛", "Ô", "œ","Í", "Î","¬", "ı", "ﬁ", "∑", "∫","≈","˚","‘","—","æ","å","˙", "§", "™", "ß","≤","Â", "ˆ","©","«", "ø","›","˜","ﬂ","⁄", "Ç", "°", "∂", "¢", "£","±", "ā", "ē", "ī", "ō", "ū", "ä", "ë"};
    private final String[] Greek = new String[]{"Ε","Ζ","Υ","τ","Η","Ω","Ν","Χ","ι","χ","σ","γ","κ","Ι","η","Κ","ν","ρ","ψ","Π","Α","λ","ω","ς","Θ","υ","μ","Δ","Φ","ζ","Ρ","ε","φ","Σ","ο","Μ","β","Ο","Λ","Β","δ","Τ","α","Ψ","θ","π","Γ","ξ","Ξ","J","c","p","n","L","e","C","i","U","k","u","S","W","s","D","d","R","q","r","Q","w","g","l","m","v","F","h","o","G","t","x","f","V","j"};
    private final char[] Accented = new char[]{
            'à','á','â','ä','æ','ã','å','ā',
            'À','Á','Â','Ä','Æ','Ã','Å','Ā',
            'è','é','ê','ë','ē','ė','ę',
            'È','É','Ê','Ë','Ē','Ė','Ę',
            'î','ï','í','ī','į','ì',
            'Î','Ï','Í','Ī','Į','Ì',
            'ô','ö','ò','ó','œ','ø','ō','õ',
            'Ô','Ö','Ò','Ó','Œ','Ø','Ō','Õ',
            'û','ü','ù','ú','ū',
            'Û','Ü','Ù','Ú','Ū',
            'ÿ',
            'Ÿ',
            'Ś','Š',
            'ß','ś','š',
            'ł',
            'Ł',
            'ž','ź','ż',
            'Ž','Ź','Ż',
            'ç','ć','č',
            'Ç','Ć','Č',
            'ñ','ń',
            'Ñ','Ń'};
    private final char[] UpperCaseAccented = new char[]{
            'À','Á','Â','Ä','Æ','Ã','Å','Ā',
            'È','É','Ê','Ë','Ē','Ė','Ę',
            'Î','Ï','Í','Ī','Į','Ì',
            'Ô','Ö','Ò','Ó','Œ','Ø','Ō','Õ',
            'Û','Ü','Ù','Ú','Ū',
            'Ÿ',
            'Ś','Š',
            'Ł',
            'Ž','Ź','Ż',
            'Ç','Ć','Č',
            'Ñ','Ń'
    };
    private final char[] lowerCaseAccented = new char[]{
            'à','á','â','ä','æ','ã','å','ā',
            'è','é','ê','ë','ē','ė','ę',
            'î','ï','í','ī','į','ì',
            'ô','ö','ò','ó','œ','ø','ō','õ',
            'û','ü','ù','ú','ū',
            'ÿ',
            'ś','š',
            'ł',
            'ž','ź','ż',
            'ç','ć','č',
            'ñ','ń'};

    public String[] getEmojis() {return emojis;}
    public String[] getHandEmojis() {return handEmojis;}
    public String[] getFoodEmojis() {return foodEmojis;}
    public String[] getAnimalEmojis() {return animalEmojis;}
    public String[] getPolysymbolic() {return Polysymbolic;}
    public String[] getGreek() {return Greek;}
    math mathematics = new math();
    public char unAccent(char letter) {
        String ltr = String.valueOf(letter);
        String letr = String.valueOf(letter).toLowerCase();
        for (int i = 0; i < lowerCaseAccented.length; i++) {
            String l = String.valueOf(lowerCaseAccented[i]);
            if (letr.equals(l)) {
                String unAccented = "";
                if (i <=3 || (5<=i && i <=7)){unAccented = "a";}
                if ((8 <=i && i<=14)||i==4 || i==25){unAccented="e";}
                //æ becomes e, like Aethos becomes Ethos, Aetna Etna
                //œ becomes e, like Oedipus sounds like Edipus.
                if (15 <=i && i<=20){unAccented="i";}
                if (21<=i&&i<=24 || (26<=i&&i<=28)){unAccented = "o";}
                if (29 <=i && i<=33){unAccented="u";}
                if (i==34){unAccented="y";}
                if (i==35||i==36){unAccented="l";}
                if (i==37){unAccented="l";}
                if (38 <=i && i<=40){unAccented="z";}
                if (41 <=i && i<=43){unAccented="c";}
                if (i==44||i==45){unAccented="n";}
                boolean isCapital = isCapital(ltr);
                if (!unAccented.isEmpty()) {
                    if (isCapital) {
                        return (unAccented.toUpperCase()).charAt(0);
                    }
                    return unAccented.charAt(0);
                }
            }
        }
        if (letter == 'ß'){
            return 's';
        }
        return letter;
    }
    public boolean isAccented(char c) {
        String stringVal = String.valueOf(c);
        //most likely it will not be accented so run this first to break early and not waste time
        // looking through whole array of accented characters.
        for (char a : alphabet) {
            if (stringVal.equalsIgnoreCase(String.valueOf(a))) {
                return false;
            }
        }
        //if it is not in the basic alphabet return true if it IS in the accented alphabet
        String lowerCase = stringVal.toLowerCase();
        for (char a : lowerCaseAccented) {
            if (lowerCase.equals(String.valueOf(a))) {
                return true;
            }
        }
        //If it is not in the alphabet nor in the accented alphabet it could be 'ß'
        return c == 'ß';
        //if it is not in the alphabet nor in the accented alphabet nor 'ß', it's likely a number or symbol, so return false.
    }

    private final char[] toBeEscaped = new char[]{'.', '^', '$', '*', '+', '-', '?','(', ')', '[', ']',
            '{', '}','\\','|'};
    public String escapeIgnorers(char ignorer) {
        for (char c:toBeEscaped){
            if (ignorer == c){
                return "\\"+ignorer;
            }
        }
        return String.valueOf(ignorer);
    }




    public boolean contains(String[] array, String element, boolean ignoreCase){
        boolean rtn = false;
        for (String string:array){
            if (string != null && element != null) {
                if (ignoreCase) {
                    if (string.equalsIgnoreCase(element)) {
                        rtn = true;
                        break;
                    }
                }
                if (!ignoreCase) {
                    if (string.equals(element)) {
                        rtn = true;
                        break;
                    }
                }
            }
        }
        return rtn;

    }
    public String scramble (String string, boolean spacesBetweenEach){
        ArrayList<Character> chars = new ArrayList<>();
        char[] ch = string.toCharArray();
        for (char c : ch) {
            if (c != ' ') {
                chars.add(c);
            }
        }

        ArrayList<Character> characters = new ArrayList<>();
        Random random = new Random();
        while (chars.size() > 1){
            int index = random.nextInt(chars.size());
            characters.add(chars.get(index));
            chars.remove(index);
        }
        characters.add(chars.get(0));
        StringBuilder sb = new StringBuilder();
        for (char c: characters){
            sb.append(c);
            if (spacesBetweenEach) {sb.append("\s");}
        }
        return sb.toString();
    }
    public boolean containsPermutationsOfTwoChars(String input){
        boolean rtn = false;
        ArrayList<String> all3LongPermutations = new ArrayList<>();
        for (String[] sa : twoCharPairs) {
            for (String a : sa) {
                for (String b : sa) {
                    for (String c : sa) {
                        all3LongPermutations.add(a + b + c);
                    }
                }
            }
        }
        for (String permutation : all3LongPermutations) {
            if (input.contains(permutation) && !permutation.equals("...")) {
                System.out.println("Class: CharSet; Method: containsPermutationsOfTwoChars; permutation contained: "+permutation);
                rtn = true;
                break;
            }
        }
        return rtn;
    }
    public void handleExit(Scene scene){
        Duration displayDuration1 = Duration.millis(2500);

        Popup popup1 = new Popup();
        Label link = new Label("EXIT");
        link.setStyle("-fx-font-size:15px;-fx-font-family:verdana;-fx-text-fill:#1a0dab;-fx-underline: true;");
        link.setOnMouseClicked(mouseEvent -> {
            link.setStyle("-fx-font-size:15px;-fx-font-family:verdana;-fx-text-fill:#660199;-fx-underline: true;");
            Stage s = (Stage) scene.getWindow();
            Parent root = new StartPage();
            if (s != null) {
                s.setMinWidth(100);
                s.setMinHeight(100);
                s.setTitle("");
                s.setScene(new Scene(root, 1440, 800));
                s.show();
            }
            popup1.hide();
        });
        VBox labelBox = new VBox(link);
        StackPane box1 = new StackPane(labelBox);
        box1.setMaxWidth(500);
        box1.setStyle("-fx-padding:20px;-fx-background-radius:5px,4px;-fx-background-color:#FFFFFF,#FFFFFF;-fx-background-insets:0,2;");

        popup1.getContent().add(box1);
        Stage stage1 = (Stage) scene.getWindow();
        popup1.show(stage1);

        PauseTransition pause1 = new PauseTransition(displayDuration1);
        FadeTransition fade1 = new FadeTransition(Duration.millis(500), box1);
        fade1.setFromValue(1);
        fade1.setToValue(0);

        SequentialTransition overlayTransition1 = new SequentialTransition();
        overlayTransition1.getChildren().addAll(pause1,fade1);
        overlayTransition1.setOnFinished(event -> popup1.hide());
        overlayTransition1.play();
    }

    public void printlnStringToStringArray(String in){
        StringBuilder sb = new StringBuilder();
        sb.append("String[] = new String[]{");
        ArrayList<String> split = StringToStringArrayList(in.split(" "));
        for (int i = 0; i < split.size(); i++) {
            if (split.get(i).equals(" ") || split.get(i).equals("")){
                split.remove(i);
            }
        }
        for (int i = 0; i < split.size()-1; i++) {
            sb.append("\"").append(split.get(i)).append("\",");
        }
        sb.append("\"").append(split.get(split.size() - 1)).append("\"};");
        System.out.println(sb);
    }
    public boolean containsCharacterOveruse(String suspicious, String exemplary){
        boolean rtn = false;
        String[] dubious = charToStringArray(suspicious.toLowerCase().toCharArray());
        String[] commendable = charToStringArray(exemplary.toLowerCase().toCharArray());
        if (dubious.length != commendable.length){return true;}

        String[] scummy = sortAlphabetically(dubious);
        String[] shiny = sortAlphabetically(commendable);
        return rtn;
    }
    public String[] sortAlphabetically(String[] stringArray){
        String[] rtn = new String[stringArray.length];
        return new String[1];
    }
    public ArrayList<String> trimCombinations(ArrayList<String> untrimmed, String sourceSet){
        ArrayList<String> rtn = untrimmed;
        for (int i = 0; i < rtn.size(); i++) {
            if (containsCharacterOveruse(rtn.get(i), sourceSet)){
                rtn.remove(i);
            }
        }
        return rtn;
    }
    public ArrayList<String> combinations(String letters, int length) {
        return new ArrayList<>();
    }
    public boolean booleanEquals(String String1, String equalsString2, boolean useCase) {
        if (useCase){
            return String1.equals(equalsString2);
        }
        return String1.equalsIgnoreCase(equalsString2);
    }
    public ArrayList<String> removeDuplicates(ArrayList<String> all){
        ArrayList<String> uniques = new ArrayList<>();
        for (String s : all) {
            if (!uniques.contains(s)) {
                uniques.add(s);
            }
        }
        return uniques;
    }
    public ArrayList<String> CreateCombinations(String letterset) throws ManyCombinationsException {
            StringPermutations s = new StringPermutations(letterset);
            return s;
    }
    public int numPossibleCombinations(String letterset){
        int n = letterset.length();
        int u = numUniques(letterset.toLowerCase());
        int t = mathematics.factorial(n);
        int e = (t/mathematics.factorial((n-u)+1));
        return e;
    }
    /**
     * @return the number of unique characters in the argument.
     * Nota bene: this method POSITIVELY DISCRIMINATES BY CASE. Therefore, if results are desired which ignore case, the argument should be, PRIOR TO ITS ARGUING, be morphed to a uniform case. Which case it is does not matter.
     */
    public int numUniques(String letterset) {
        ArrayList<Character> all = StringToCharArrayList(letterset);
        ArrayList<Character> unique = new ArrayList<>();
        for (Character character : all) {
            if (!unique.contains(character)) {
                unique.add(character);
            }
        }
        return unique.size();
    }
    public ArrayList<Character> StringToCharArrayList(String string){
        ArrayList<Character> CharArrayList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            CharArrayList.add(string.charAt(i));
        }
        return CharArrayList;
    }
    public static Filepackage getAmericanDream1964() {
        return new Filepackage(
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/American-Dream-7_4_1965_Mistaken.txt"),
                new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/American-Dream-7_4_1965_Corrected.txt")
        );
    }

    /**
     * @return true if any letter occurs more than once in the argument, false otherwise.
     * Operates by removing each letter in the alphabet from a duplicate String. If the duplicate String, with a given letter removed, has a length less than the original String's length minus 1, then therefore 2 letters of the same form have been removed, and therefore it thereby has duplicates.
     */
    public boolean hasDuplicates(String letterset) {
        boolean rtn = false;
        String s = letterset.toLowerCase();
        for (char Char : alphabet) {
            String s2 = s;
            s2 = s2.replaceAll(String.valueOf(Char), "");
            if (s2.length() < s.length() - 1) {
                rtn = true;
                break;
            }
        }
        return rtn;
    }

    public ArrayList<String> fileToArrayListOfStrings(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<String> rtn = new ArrayList<>();
        while (scanner.hasNext()){
            String next = scanner.next();
            if (next != null){
                rtn.add(next);
            }
        }
        return rtn;
    }
    public int[] crucialIndices(char letter, String word) {
        String sVal = String.valueOf(letter).toLowerCase();
        String[] arr = charToStringArray(word.toLowerCase().toCharArray());
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.equalsIgnoreCase(sVal)){
                indices.add(i);
            }
        }
        int[] rtn = IntegerArrayListToIntArray(indices);
        return rtn;
    }
    public String getEtao() {
        return etaoin;
    }
    public void updateEtao() throws FileNotFoundException {
        etao etao = new etao();
        etaoin = etao.get();
    }
    public SubstitutionPair getCipher5(){
        SubstitutionPair pair = new SubstitutionPair(null, null);
        pair.setCipher("Tllw nlimrmt Kivhrwvmg Gzboli, Ylziw lu Gifhgvvh, uzxfogb, kzivmgh, uznrob, uirvmwh, gsv xlnnfmrgb lu Tzovhyfit, gsv xozhh lu 1955 -- dsrxs R fmwvihgzmw dzh lfg kzigbrmt ozhg mrtsg, zmw bvg hgroo hsldvw fk sviv lm grnv -- zmw nlhg lu zoo, gsv Xozhh lu 2005. Xlmtizgfozgrlmh lm blfi tizwfzgrlm, zmw gszmp blf -- gszmp blf uli gsv slmli lu zooldrmt nv gl yv z kzig lu rg. Gszmp blf zohl, Ni. Kivhrwvmg, uli gsrh slmlizib wvtivv. Rg dzh lmob z xlfkov lu bvzih ztl gszg R hglkkvw kzbrmt nb hgfwvmg olzmh rm ozd hxsllo. Szw R pmldm rg dzh gsrh vzhb, R dlfow szev izm [hrx] uli gsv Fmrgvw Hgzgvh Hvmzgv vziorvi.");
        pair.setKey("zyxwvutsrqponmlkjihgfedcba");
        return pair;
    }
    public SubstitutionPair getCipher4(){
        SubstitutionPair pair = new SubstitutionPair(null, null);
        pair.setCipher("""
D orep pa xsvrqw pwdj gasedeu ksag pwv jltbvqp: “Pwv Tdspw ak r Evo Erpdae.” Rey D oalcy cdiv pa ljv rj r trjdj kas als pwdeideu pauvpwvs, r jpasz pwrp wrj caeu jdeqv tvve jpveqdcvy ae pwv gveprc jwvvpj ak jlqqvvydeu uvevsrpdaej. Dp dj pwv jpasz ak pwv Vmaylj, pwv jpasz ak pwv kcduwp ak pwv Wvtsvo xvaxcv ksag pwv taeyruv ak Vuzxp, pwsaluw pwv odcyvsevjj rey kderccz, pa pwv Xsagdjvy Crey. Dp’j r tvrlpdklc jpasz. D wry pwv xsdndcvuv pwv apwvs eduwp ak jvvdeu pwv jpasz de gandv pvsgj de Evo Zasi Qdpz, vepdpcvy pwv “Pve Qaggreygvepj” rey D qrgv pa jvv dp de rcc ak dpj tvrlpz. Pwv jpsluucv ak Gajvj, pwv jpsluucv ak wdj yvnapvy kaccaovsj rj pwvz jaluwp pa uvp alp ak Vuzxp. Rey pwvz kderccz ganvy ae pa pwv odcyvsevjj rey paorsy pwv Xsagdjvy Crey. Pwdj dj jagvpwdeu ak pwv jpasz ak vnvsz xvaxcv jpsluucdeu kas ksvvyag. Dp dj pwv kdsjp jpasz ak gre’j vmxcdqdp flvjp kas ksvvyag. Rey dp yvgaejpsrpvj pwv jpruvj pwrp jvvg pa devndprtcz kaccao pwv flvjp kas ksvvyag.

Xsdas pa Grsqw pwv jdmpw, 1957, pwvsv vmdjpvy r qalepsz ieaoe rj pwv Uacy Qarjp. Pwdj qalepsz orj r qacaez ak pwv Tsdpdjw Vgxdsv. Pwdj qalepsz orj jdplrpvy de pwrp nrjp qaepdevep ieaoe rj Rksdqr. D’g jlsv zal ieao r usvrp yvrc rtalp Rksdqr, pwrp qaepdevep odpw jagv poa wleysvy gdccdae xvaxcv, rey dp vmpveyj rey qanvsj r usvrp yvrc ak pvssdpasz. Pwvsv rsv grez krgdcdrs ergvj rjjaqdrpvy odpw Rksdqr pwrp zal oalcy xsatrtcz svgvgtvs, rey pwvsv rsv jagv qalepsdvj de Rksdqr pwrp grez xvaxcv evnvs svrcdhv. Kas dejpreqv, Vuzxp dj de Rksdqr. Rey pwvsv dj pwrp nrjp rsvr ak Easpw Rksdqr odpw Vuzxp rey Vpwdaxdr, odpw Pledjdr rey Rcuvsdr rey Gasaqqa, rey Cdtzr. Pwve zal gduwp ganv pa Jalpw Rksdqr, rey zal pwdei ak pwrp vmpvejdnv pvssdpasz ieaoe rj pwv Ledae ak Jalpw Rksdqr. Pwvsv dj pwrp qrxdprc qdpz Bawreevjtlsu pwrp zal svry ja glqw rtalp pwvjv yrzj. Pwve pwvsv dj qvepsrc Rksdqr odpw xcrqvj cdiv Swayvjdr rey pwv Tvcudre Qaeua. Rey pwve pwvsv dj Vrjp Rksdqr odpw xcrqvj cdiv Ivezr rey Preurezdir, rey xcrqvj cdiv Lureyr rey apwvs nvsz xaovsklc qalepsdvj sduwp pwvsv. Rey pwve zal ganv anvs pa Ovjp Rksdqr owvsv zal kdey pwv Ksveqw Ovjp Rksdqr rey Eduvsdr, rey Cdtvsdr rey Jdvssr Cvaev rey xcrqvj cdiv pwrp. Rey dp dj de pwdj jxap, de pwdj jvqpdae ak Rksdqr, pwrp ov kdey pwv Uacy Qarjp, pwvsv de Ovjp Rksdqr.

Zal rcja ieao pwrp kas zvrsj rey kas qveplsdvj, Rksdqr wrj tvve aev ak pwv gajp vmxcadpvy qaepdevepj de pwv wdjpasz ak pwv oascy. Dp’j tvve pwv “Yrsi Qaepdevep.” Dp’j tvve pwv qaepdevep pwrp wrj jlkkvsvy rcc ak pwv xrde rey pwv rkkcdqpdae pwrp qalcy tv gljpvsvy lx tz apwvs erpdaej. Rey dp dj pwrp qaepdevep owdqw wrj vmxvsdveqvy jcrnvsz, owdqw wrj vmxvsdveqvy rcc ak pwv caovjp jpreyrsyj pwrp ov qre pwdei rtalp, rey dp’j tvve tsaluwp depa tvdeu tz pwv vmxcadprpdae dekcdqpvy lxae dp tz apwvs erpdaej.

Rey pwdj qalepsz, pwv Uacy Qarjp, orj r xrsp ak pwdj vmpvejdnv qaepdevep ieaoe rj Rksdqr. Dp’j r cdppcv qalepsz pwvsv de Ovjp Rksdqr rtalp edevpz-aev pwaljrey gdcvj de rsvr, odpw r xaxlcrpdae ak rtalp kdnv gdccdae xvaxcv, r cdppcv gasv pwre kals rey r wrck gdccdae. Rey dp jpreyj pwvsv odpw dpj qrxdprc qdpz, Rqqsr. Kas zvrsj pwv Uacy Qarjp orj vmxcadpvy rey yagderpvy rey psrgxcvy anvs. Pwv kdsjp Vlsaxvre jvppcvsj qrgv de pwvsv rtalp 1444, pwv Xasplulvjv, rey pwvz jprspvy cvudpdgrpv psryv odpw pwv xvaxcv de pwv Uacy Qarjp. Pwvz jprspvy yvrcdeu odpw pwvg odpw pwvds uacy, rey de plse pwvz urnv pwvg ulej rey rggledpdae rey ulexaoyvs rey pwrp pzxv ak pwdeu. Ovcc, xsvppz jaae Rgvsdqr orj ydjqanvsvy r kvo zvrsj crpvs de pwv kalspvve wleysvyj, rey pwve pwv Tsdpdjw Ovjp Deydvj. Rey rcc ak pwvjv usaodeu ydjqanvsdvj tsaluwp rtalp pwv jcrnv psryv.

                """);
        pair.setKey("rtqyvkuwdbicgeaxfsjplnomzh");
        return pair;
    }
    public SubstitutionPair getCipher3(){
        SubstitutionPair pair = new SubstitutionPair(null, null);
        pair.setCipher("""
                Hggqmz uc gdh qhpzuqugc, agkm gi da imeq qtpq qg lm plpczgcmz ly tdkpcuqy qtmc opa cgq qtm dequkpqm. Om imeq qtpq qg lm plpczgcmz ly Vgz opa ogham qtpc qg lm wdcuatmz ly Tuk. Lmqqmh pc dcsdaq Vgz qtpc pc uczuiimhmcq gcm. Igh da qg lm uvcghmz ly Vgz opa p tphatmh wdcuatkmcq qtpc qg lm p nujquk gi Tua pcvmh. Kpc jpc eunm iph ihgk Vgz -- cgq gdqauzm Vgz. Vgz ua otmhmnmh om phm. Mnmc uc adiimhucv? Mnmc uc adiimhucv.
                                
                Uc p opy, qg lm uczuiimhmcq qg qtpq adiimhucv ua otpq kpxma qtm tdkpc lmucv uctdkpc. Uczuiimhmcjm, piqmh pee, ua kghm zpcvmhgda qtpc pcvmh pcz tpqhmz. Pcvmh jpc pq qukma lm jhmpqunm. Gcm ohuqma p vhmpq wgmk, p vhmpq aykwtgcy. Gcm zgma agkmqtucv awmjupe igh qtm apxm gi tdkpcuqy lmjpdam gcm ua pcvhy pq qtm ucsdaqujm qtpq gcm ouqcmaama. Ldq uczuiimhmcjm ua cmnmh jhmpqunm. Mnmc tpqhmz pq qukma kpy meujuq p hmawgcam. Ygd iuvtq uq. Ygd zmcgdcjm uq. Ygd zuaphk uq.
                                
                Uczuiimhmcjm meujuqa cg hmawgcam. Uczuiimhmcjm ua cgq p hmawgcam. Uczuiimhmcjm ua cgq p lmvuccucv; uq ua pc mcz. Pcz, qtmhmighm, uczuiimhmcjm ua peopya qtm ihumcz gi qtm mcmky, igh uq lmcmiuqa qtm pvvhmaagh -- cmnmh tua nujquk, otgam wpuc ua kpvcuiumz otmc tm gh atm immea ighvgqqmc. Qtm wgeuqujpe whuagcmh uc tua jmee, qtm tdcvhy jtuezhmc, qtm tgkmemaa hmidvmma -- cgq qg hmawgcz qg qtmuh weuvtq, cgq qg hmeumnm qtmuh ageuqdzm ly giimhucv qtmk p awphx gi tgwm ua qg mruem qtmk ihgk tdkpc kmkghy. Pcz uc zmcyucv qtmuh tdkpcuqy, om lmqhpy gdh goc.
                                
                Uczuiimhmcjm, qtmc, ua cgq gcey p auc, uq ua p wdcuatkmcq.
                                
                Pcz qtua ua gcm gi qtm kgaq ukwghqpcq emaagca gi qtua gdqvgucv jmcqdhy'a ouzm-hpcvucv mrwmhukmcqa uc vggz pcz mnue.
                                
                Uc qtm wepjm qtpq U jgkm ihgk, agjumqy opa jgkwgamz gi qthmm aukwem jpqmvghuma: qtm xueemha, qtm nujquka, pcz qtm lyaqpczmha. Zdhucv qtm zphxmaq gi qukma, ucauzm qtm vtmqqgma pcz zmpqt jpkwa -- pcz U'k vepz qtpq Kha. Jeucqgc kmcqugcmz qtpq om phm cgo jgkkmkghpqucv qtpq mnmcq, qtpq wmhugz, qtpq om phm cgo uc qtm Zpya gi Hmkmklhpcjm -- ldq qtmc, om imeq plpczgcmz, ighvgqqmc. Pee gi da zuz.
                                
                                
                                
                Pcz gdh gcey kuamhplem jgcagepqugc opa qtpq om lmeumnmz qtpq Pdajtouqb pcz Qhmleucxp omhm jegamey vdphzmz amjhmqa; qtpq qtm empzmha gi qtm ihmm oghez zuz cgq xcgo otpq opa vgucv gc lmtucz qtgam lepjx vpqma pcz lphlmz ouhm; qtpq qtmy tpz cg xcgoemzvm gi qtm oph pvpucaq qtm Smoa qtpq Tuqemh'a phkuma pcz qtmuh pjjgkweujma opvmz pa wphq gi qtm oph pvpucaq qtm Peeuma. Ui qtmy xcmo, om qtgdvtq, adhmey qtgam empzmha ogdez tpnm kgnmz tmpnmc pcz mphqt qg ucqmhnmcm. Qtmy ogdez tpnm awgxmc gdq ouqt vhmpq gdqhpvm pcz jgcnujqugc. Qtmy ogdez tpnm lgklmz qtm hpueopya empzucv qg Luhxmcpd, sdaq qtm hpueopya, sdaq gcjm.
                                
                Pcz cgo om xcmo, om emphcmz, om zuajgnmhmz qtpq qtm Wmcqpvgc xcmo, qtm Aqpqm Zmwphqkmcq xcmo. Pcz qtm ueedaqhugda gjjdwpcq gi qtm Otuqm Tgdam qtmc, otg opa p vhmpq empzmh -- pcz U apy uq ouqt agkm pcvduat pcz wpuc, lmjpdam, qgzpy ua mrpjqey 54 ympha kphxucv tua zmpqt -- Ihpcxeuc Zmepcg Hggamnmeq zumz gc Pwhue qtm 12qt, 1945. Ag tm ua nmhy kdjt whmamcq qg km pcz qg da. Cg zgdlq, tm opa p vhmpq empzmh. Tm kglueubmz qtm Pkmhujpc wmgwem pcz qtm oghez, vgucv ucqg lpqqem, lhucvucv tdczhmza pcz qtgdapcza gi npeupcq pcz lhpnm agezumha uc Pkmhujp qg iuvtq ipajuak, qg iuvtq zujqpqghatuw, qg iuvtq Tuqemh. Pcz ag kpcy gi qtm ygdcv wmgwem imee uc lpqqem. Pcz, cmnmhqtmemaa, tua ukpvm uc Smouat tuaqghy -- U kdaq apy uq -- tua ukpvm uc Smouat tuaqghy ua iepomz.                                
                """);
        pair.setKey("pljzmivtusxekcgwfhaqdnoryb");
        return pair;
    }
    public SubstitutionPair getCipher2(){
        SubstitutionPair pair = new SubstitutionPair(null, null);
                pair.setCipher("""
                Re yowj peveuzc f cqznqfy jhfj rsuu pqsve jhe ifjszi jz f nofqfijeep fiiofu sixzye. Izr, efqub si jhsw xeijoqb jhsw
                cqzczwfu rzoup hfve deei nqeejep rsjh qspsxoue fip peioixsfjszi, fw pewjqoxjsve zl sisjsfjsve fip qewcziwsdsusjb. Fj
                jhfj jsye exzizysx wjfjow rfw xziwspeqep jhe yefwoqe zl jhe sipsvspofu'w fdsusjb fip jfueijw. Fip, si jhe jhsitsin zl
                jhfj pfb, jhe fdweixe zl rzqupub nzzpw sipsxfjep f rfij zl sipowjqszow hfdsjw fip yzqfu lsdeq. Re've xzye f uzin rfb
                si zoq oipeqwjfipsin zl hoyfi yzjsvfjszi fip zl jhe dusip zceqfjszi zl zoq exzizysx wbwjey. Izr re qefusme jhfj
                pswuzxfjsziw si jhe yfqtej zceqfjsziw zl zoq exzizyb fip jhe cqevfueixe zl pswxqsysifjszi jhqowj cezcue sijz spueieww
                fip dsip jhey si xziwjfij zq lqegoeij oieycuzbyeij fnfsiwj jhesq rsuu. Jzpfb jhe czzq fqe ueww zljei pswyswwep, S
                hzce, lqzy zoq xziwxseixew db desin dqfipep fw sileqszq zq sixzycejeij. Re fuwz tizr jhfj iz yfjjeq hzr
                pbifysxfuub jhe exzizyb peveuzcw fip ekcfipw, sj pzew izj eusysifje fuu czveqjb.
                Jhe cqzduey sipsxfjew jhfj zoq eychfwsw yowj de jrzlzup. Re yowj xqefje louu eycuzbyeij zq re yowj xqefje
                sixzyew. Cezcue yowj de yfpe xziwoyeqw db zie yejhzp zq jhe zjheq. Zixe jheb fqe cufxep si jhsw czwsjszi re
                ieep jz de xzixeqiep jhfj jhe czjeijsfu zl jhe sipsvspofu sw izj rfwjep. Ier lzqyw zl rzqt jhfj eihfixe jhe wzxsfu
                nzzp rsuu hfve jz de pevswep lzq jhzwe lzq rhzy jqfpsjszifu azdw fqe izj fvfsufdue. Si S879 Heiqb Nezqne fijsxscfjep
                jhsw wjfje zl fllfsqw rhei he rqzje si Cqznqeww fip Czveqjb:
                Jhe lfxj sw jhfj jhe rzqt rhsxh sycqzvew jhe xzipsjszi zl yfitsip, jhe rzqt rhsxh ekjeipw tizruepne fip sixqefwew
                czreq fip eiqsxhew usjeqfjoqe fip euevfjew jhzonhj, sw izj pzie jz wexoqe f usvsin. Sj sw izj jhe rzqt zl wufvew pqsvei jz
                jhesq jfwtw esjheq db jhe jfwt, db jhe jfwtyfwjeq, zq db fisqifu (wsx) iexewwsjb. Sj sw jhe rzqt zl yei rhz wzyehzr lsip
                f lzqy zl rzqt jhfj dqsinw f wexoqsjb lzq sjw zri wfte fip f wjfje zl wzxsejb rheqe rfij sw fdzuswhep.
                Rzqt zl jhsw wzqj xzoup de eizqyzowub sixqefwep, fip re fqe usteub jz lsip jhfj jhe cqzdueyw zl hzowsin fip\s
                54
                epoxfjszi, siwjefp zl cqexepsin jhe eusysifjszi zl czveqjb, rsuu jheyweuvew de fllexjep sl czveqjb sw lsqwj fdzuswhep. Jhe
                czzq jqfiwlzqyep sijz coqxhfweqw rsuu pz f nqefj pefu zi jhesq zri jz fujeq hzowsin pexfb. Ienqzew rhz hfve f
                pzodue pswfdsusjb rsuu hfve f nqefjeq ellexj zi pswxqsysifjszi rhei jheb hfve jhe fppsjszifu refczi zl xfwh jz owe si
                jhesq wjqonnue.
                Debzip jhewe fpvfijfnew, f hzwj zl czwsjsve cwbxhzuznsxfu xhfinew sievsjfdub rsuu qewouj lqzy rspewcqefp exzizysx
                wexoqsjb. Jhe psnisjb zl jhe sipsvspofu rsuu luzoqswh rhei jhe pexswsziw xzixeqisin hsw usle fqe si hsw zri hfipw, rhei
                he hfw jhe yefiw jz weet weul-sycqzveyeij. Ceqwzifu xzilusxjw fyzin howdfipw, rsvew fip xhsupqei rsuu psysiswh
                rhei jhe oiaowj yefwoqeyeij zl hoyfi rzqjh zi jhe wxfue zl pzuufqw sw eusysifjep .
                Izr zoq xzoijqb xfi pz jhsw. Azhi Teiiejh Nfudqfsjh wfsp jhfj f nofqfijeep fiiofu sixzye xzoup de pzie lzq fdzoj
                jreijb dsuuszi pzuufqw f befq. Fip S wfb jz bzo jzpfb, jhfj sl zoq ifjszi xfi wceip jhsqjb-lsve dsuuszi pzuufqw f befq jz lsnhj
                fi oiaowj, evsu rfq si Vsejify, fip jreijb dsuuszi pzuufqw jz coj f yfi zi jhe yzzi, sj xfi wceip dsuusziw zl pzuufqw jz
                coj Nzp'w xhsupqei zi jhesq zri jrz leej qsnhj heqe zi efqjh.
                Xzyysjyeij Jz Izivszueixe
                Izr, uej ye wfb dqselub jhfj re yowj qefllsqy zoq xzyysjyeij jz izivszueixe. S rfij jz wjqeww jhsw. Jhe lojsusjb zl
                vszueixe si jhe wjqonnue lzq qfxsfu aowjsxe hfw deei jqfnsxfuub ejxhep si fuu jhe qexeij Ienqz qszjw. Bewjeqpfb, S jqsep jz
                fifubme jhe qszjw fip pefu rsjh jhesq xfowew. Jzpfb S rfij jz nsve jhe zjheq wspe. Jheqe sw xeqjfsiub wzyejhsin
                cfsilouub wfp fdzoj f qszj. Zie weew wxqefysin bzoinwjeqw fip finqb fpoujw lsnhjsin hzceuewwub fip fsyuewwub fnfsiwj
                syczwwsdue zppw. Fip peec pzri rsjhsi jhey, bzo xfi evei wee f pewsqe lzq weul-pewjqoxjszi, f tsip zl wosxspfu
                uzinsin.
                Zxxfwszifuub Ienqzew xzijeip jhfj jhe 1965 Rfjjw qszj fip jhe zjheq qszjw si vfqszow xsjsew qecqeweijep ellexjsve xsvsu
                qsnhjw fxjszi. Doj jhzwe rhz ekcqeww jhsw vser furfbw eip oc rsjh wjoydusin rzqpw rhei fwtep rhfj xzixqeje nfsiw
                hfve deei rzi fw f qewouj. Fj dewj, jhe qszjw hfve cqzpoxep f usjjue fppsjszifu fijsczveqjb yzieb fuuzjjep db lqsnhjeiep
                nzveqiyeij zllsxsfuw, fip f ler rfjeq-wcqsitueqw jz xzzu jhe xhsupqei zl jhe nhejjzw. Sj sw wzyejhsin uste sycqzvsin jhe
                lzzp si jhe cqswzi rhsue jhe cezcue qeyfsi wexoqeub sixfqxeqfjep dehsip dfqw. Izrheqe hfve jhe qszjw rzi fib
                xzixqeje sycqzveyeij woxh fw hfve jhe zqnfismep cqzjewj peyziwjqfjsziw. Rhei zie jqsew jz csi pzri fpvzxfjew zl
                vszueixe fw jz rhfj fxjw rzoup de ellexjsve, jhe fiwreqw fqe dufjfijub suuznsxfu. Wzyejsyew jheb jfut zl zveqjhqzrsin
                qfxswj wjfje fip uzxfu nzveqiyeijw fip jheb jfut fdzoj noeqqsuuf rfqlfqe. Jheb lfsu jz wee jhfj iz sijeqifu qevzuojszi
                hfw eveq woxxeepep si zveqjhqzrsin f nzveqiyeij db vszueixe oiueww jhe nzveqiyeij hfp fuqefpb uzwj jhe fuuensfixe
                fip ellexjsve xzijqzu zl sjw fqyep lzqxew. Fibzie si hsw qsnhj ysip tizrw jhfj jhsw rsuu izj hfccei si jhe Oisjep Wjfjew.
                Si f vszueij qfxsfu wsjofjszi, jhe czreq wjqoxjoqe hfw jhe uzxfu czusxe, jhe wjfje jqzzceqw, jhe Ifjszifu Nofqp fip,
                lsifuub, jhe Fqyb jz xfuu zi -- fuu zl rhsxh fqe cqepzysifijub rhsje. Loqjheqyzqe, ler sl fib vszueij qevzuojsziw hfve
                deei woxxewwlou oiueww jhe vszueij ysizqsjb hfp jhe wbycfjhb fip wocczqj zl jhe iziqewswjfij yfazqsjb. Xfwjqz yfb
                hfve hfp ziub f ler Xodfiw fxjofuub lsnhjsin rsjh hsy oc si jhe hsuuw, doj he xzoup ieveq hfve zveqjhqzri jhe Dfjswjf
                qensye oiueww he hfp jhe wbycfjhb zl jhe vfwj yfazqsjb zl Xodfi cezcue.
                Sj sw ceqlexjub xuefq jhfj f vszueij qevzuojszi zi jhe cfqj zl Fyeqsxfi dufxtw rzoup lsip iz wbycfjhb fip wocczqj lqzy
                jhe rhsje czcoufjszi fip veqb usjjue lqzy jhe yfazqsjb zl jhe Ienqzew jheyweuvew. Jhsw sw iz jsye lzq qzyfijsx suuowsziw
                fip eycjb chsuzwzchsxfu pedfjew fdzoj lqeepzy. Jhsw sw f jsye lzq fxjszi. Rhfj sw ieepep sw f wjqfjenb lzq xhfine, f
                jfxjsxfu cqznqfy jhfj rsuu dqsin jhe Ienqz sijz jhe yfsiwjqefy zl Fyeqsxfi usle fw gosxtub fw czwwsdue. Wz lfq, jhsw hfw
                ziub deei zlleqep db jhe izivszueij yzveyeij. Rsjhzoj qexznismsin jhsw re rsuu eip oc rsjh wzuojsziw jhfj pzi'j wzuve,
                fiwreqw jhfj pzi'j fiwreq fip ekcufifjsziw jhfj pzi'j ekcufsi.
                Fip wz S wfb jz bzo jzpfb jhfj S wjsuu wjfip db izivszueixe. Fip S fy wjsuu xzivsixep jhfj sj sw jhe yzwj czjeij refczi
                fvfsufdue jz jhe Ienqz si hsw wjqonnue lzq aowjsxe si jhsw xzoijqb. Fip jhe zjheq jhsin sw jhfj S fy xzixeqiep fdzoj f
                dejjeq rzqup. S'y xzixeqiep fdzoj aowjsxe. S'y xzixeqiep fdzoj dqzjheqhzzp. S'y xzixeqiep fdzoj jqojh. Fip rhei
                zie sw xzixeqiep fdzoj jhewe, he xfi ieveq fpvzxfje vszueixe. Lzq jhqzonh vszueixe bzo yfb yoqpeq f yoqpeqeq doj
                bzo xfi'j yoqpeq. Jhqzonh vszueixe bzo yfb yoqpeq f usfq doj bzo xfi'j ewjfduswh jqojh. Jhqzonh vszueixe bzo yfb
                yoqpeq f hfjeq, doj bzo xfi'j yoqpeq hfje. Pfqtieww xfiizj coj zoj pfqtieww. Ziub usnhj xfi pz jhfj.
                Fip S wfb jz bzo, S hfve fuwz pexspep jz wjsxt jz uzve. Lzq S tizr jhfj uzve sw oujsyfjeub jhe ziub fiwreq jz yfitsip'w
                cqzdueyw. Fip S'y nzsin jz jfut fdzoj sj eveqbrheqe S nz. S tizr sj swi'j czcoufq jz jfut fdzoj sj si wzye xsqxuew jzpfb.\s
                55
                S'y izj jfutsin fdzoj eyzjszifu dzwh rhei S jfut fdzoj uzve, S'y jfutsin fdzoj f wjqzin, peyfipsin uzve. Fip S hfve
                weei jzz yoxh hfje. S've weei jzz yoxh hfje zi jhe lfxew zl wheqsllw si jhe Wzojh. S've weei hfje zi jhe lfxew zl jzz
                yfib Tufiwyei fip jzz yfib Rhsje Xsjsmeiw Xzoixsuzqw si jhe Wzojh jz rfij jz hfje ybweul, dexfowe eveqb jsye S
                wee sj, S tizr jhfj sj pzew wzyejhsin jz jhesq lfxew fip jhesq ceqwzifusjsew fip S wfb jz ybweul jhfj hfje sw jzz nqefj f
                doqpei jz defq. S hfve pexspep jz uzve. Sl bzo fqe weetsin jhe hsnhewj nzzp, S jhsit bzo xfi lsip sj jhqzonh uzve. Fip
                jhe defojslou jhsin sw jhfj re fqe yzvsin fnfsiwj rqzin rhei re pz sj, dexfowe Azhi rfw qsnhj, Nzp sw uzve. He rhz
                hfjew pzew izj tizr Nzp, doj he rhz hfw uzve hfw jhe teb jhfj oiuzxtw jhe pzzq jz jhe yefisin zl oujsyfje qefusjb.
                S rfij jz wfb jz bzo fw S yzve jz yb xzixuowszi, fw re jfut fdzoj "Rheqe pz re nz lqzy heqe," jhfj re hziewjub lfxe
                jhe lfxj jhfj jhe Yzveyeij yowj fppqeww sjweul jz jhe goewjszi zl qewjqoxjoqsin jhe rhzue zl Fyeqsxfi wzxsejb. Jheqe
                fqe lzqjb ysuuszi czzq cezcue heqe. Fip zie pfb re yowj fwt jhe goewjszi, "Rhb fqe jheqe lzqjb ysuuszi czzq cezcue si
                Fyeqsxf?" Fip rhei bzo densi jz fwt jhfj goewjszi, bzo fqe qfswsin goewjsziw fdzoj jhe exzizysx wbwjey, fdzoj f
                dqzfpeq pswjqsdojszi zl refujh. Rhei bzo fwt jhfj goewjszi, bzo densi jz goewjszi jhe xfcsjfuswjsx exzizyb. Fip S'y
                wsycub wfbsin jhfj yzqe fip yzqe, re've nzj jz densi jz fwt goewjsziw fdzoj jhe rhzue wzxsejb. Re fqe xfuuep oczi
                jz heuc jhe pswxzoqfnep dennfqw si usle'w yfqtej cufxe. Doj zie pfb re yowj xzye jz wee jhfj fi epslsxe rhsxh
                cqzpoxew dennfqw ieepw qewjqoxjoqsin. Sj yefiw jhfj goewjsziw yowj de qfswep. Bzo wee, yb lqseipw, rhei bzo pefu
                rsjh jhsw, bzo densi jz fwt jhe goewjszi, "Rhz zriw jhe zsu?" Bzo densi jz fwt jhe goewjszi, "Rhz zriw jhe sqzi
                zqe?" Bzo densi jz fwt jhe goewjszi, "Rhb sw sj jhfj cezcue hfve jz cfb rfjeq dsuuw si f rzqup jhfj sw jrz jhsqpw rfjeq?"
                Jhewe fqe goewjsziw jhfj yowj de fwtep.
                Fdzoj Xzyyoiswy
                Izr, pzi'j jhsit jhfj bzo hfve ye si f "dsip" jzpfb. S'y izj jfutsin fdzoj Xzyyoiswy.
                Rhfj S'y wfbsin jz bzo jhsw yzqisin sw jhfj Xzyyoiswy lzqnejw jhfj usle sw sipsvspofu. Xfcsjfuswy lzqnejw jhfj usle sw
                wzxsfu, fip jhe Tsinpzy zl Dqzjheqhzzp sw lzoip iesjheq si jhe jhewsw zl Xzyyoiswy izq jhe fijsjhewsw zl xfcsjfuswy
                doj si f hsnheq wbijhewsw. Sj sw lzoip si f hsnheq wbijhewsw jhfj xzydsiew jhe jqojhw zl dzjh. Izr, rhei S wfb goewjszi
                jhe rhzue wzxsejb, sj yefiw oujsyfjeub xzysin jz wee jhfj jhe cqzduey zl qfxswy, jhe cqzduey zl exzizysx
                ekcuzsjfjszi, fip jhe cqzduey zl rfq fqe fuu jsep jznejheq. Jhewe fqe jhe jqscue evsuw jhfj fqe sijeqqeufjep.
                Sl bzo rsuu uej ye de f cqefxheq aowj f usjjue dsj - Zie isnhj, f aoqzq xfye jz Aewow fip he rfijep jz tizr rhfj he
                xzoup pz jz de wfvep. Aewow pspi'j nej dznnep pzri si jhe tsip zl swzufjep fccqzfxh zl rhfj he whzoupi'j pz. Aewow
                pspi'j wfb, "Izr Isxzpeyow, bzo yowj wjzc ubsin." HE pspi'j wfb, "Isxzpeyow, bzo yowj wjzc xhefjsin sl bzo fqe
                pzsin jhfj." He pspi'j wfb, "Isxzpeyow, bzo yowj izj xzyysj fpoujeqb." He pspi'j wfb, "Isxzpeyow, izr bzo yowj
                wjzc pqsitsin usgozq sl bzo fqe pzsin jhfj ekxewwsveub." He wfsp wzyejhsin fujznejheq pslleqeij, dexfowe Aewow qefusmep
                wzyejhsin dfwsx - jhfj sl f yfi rsuu use, he rsuu wjefu. Fip sl f yfi rsuu wjefu, he rsuu tsuu. Wz siwjefp zl aowj nejjsin
                dznnep pzri si zie jhsin, Aewow uzztep fj hsy fip wfsp, "Isxzpeyow, bzo yowj de dzqi fnfsi."
                He wfsp, si zjheq rzqpw, "Bzoq rhzue wjqoxjoqe yowj de xhfinep." F ifjszi jhfj rsuu teec cezcue si wufveqb lzq 244
                befqw rsuu "jhsinslb" jhey - yfte jhey jhsinw. Jheqelzqe jheb rsuu ekcuzsj jhey, fip czzq cezcue neieqfuub,
                exzizysxfuub. Fip f ifjszi jhfj rsuu ekcuzsj exzizysxfuub rsuu hfve jz hfve lzqesni sivewjyeijw fip eveqbjhsin euwe,
                fip rsuu hfve jz owe sjw ysusjfqb ysnhj jz cqzjexj jhey. Fuu zl jhewe cqzdueyw fqe jsep jznejheq. Rhfj S fy wfbsin jzpfb
                sw jhfj re yowj nz lqzy jhsw xziveijszi fip wfb, "Fyeqsxf, bzo yowj de dzqi fnfsi!"
                Xzixuowszi
                56
                Wz, S xzixuope db wfbsin fnfsi jzpfb jhfj re hfve f jfwt fip uej ow nz zoj rsjh f "psvsie pswwfjswlfxjszi." Uej ow de
                pswwfjswlsep oijsu Fyeqsxf rsuu iz uzineq hfve f hsnh duzzp cqewwoqe zl xqeepw fip fi fieysf zl peepw. Uej ow de
                pswwfjswlsep oijsu jhe jqfnsx rfuuw jhfj wecfqfje jhe zojeq xsjb zl refujh fip xzylzqj fip jhe siieq xsjb zl czveqjb fip
                pewcfsq whfuu de xqowhep db jhe dfjjeqsin qfyw zl jhe lzqxew zl aowjsxe. [,ej ow de pswwfjswlsep oijsu jhzwe jhfj usve zi
                jhe zojwtsqjw zl hzce fqe dqzonhj sijz jhe yejqzczusw zl pfsub wexoqsjb. Uej ow de pswwfjswlsep oijsu wuoyw fqe xfwj sijz
                jhe aoit hefcw zl hswjzqb, fip eveqb lfysub sw usvsin si f pexeij wfisjfqb hzye. Uej ow de pswwfjswlsep oijsu jhe pfqt
                bewjeqpfbw zl wenqenfjep wxhzzuw rsuu de jqfiwlzqyep sijz dqsnhj jzyzqqzrw zl gofusjb, sijenqfjep epoxfjszi. Uej ow de
                pswwfjswlsep oijsu sijenqfjszi sw izj weei fw f cqzduey doj fw fi zcczqjoisjb jz cfqjsxscfje si jhe defojb zl psveqwsjb. Uej
                ow de pswwfjswlsep oijsu yei fip rzyei, hzreveq dufxt jheb yfb de, rsuu de aopnep zi jhe dfwsw zl jhe xzijeij zl
                jhesq xhfqfxjeq fip izj zi jhe dfwsw zl jhe xzuzq zl jhesq wtsi. Uej ow de pswwfjswlsep. Uej ow de pswwfjswlsep oijsu eveqb
                wjfje xfcsjzu hzowew f nzveqizq rhz rsuu pz aowjub, rhz rsuu uzve yeqxb fip rhz rsuu rfut hoydub rsjh hsw Nzp. Uej ow
                de pswwfjswlsep oijsu lqzy eveqb xsjb hfuu, aowjsxe rsuu qzuu pzri uste rfjeqw fip qsnhjezowieww uste f ysnhjb wjqefy. Uej
                ow de pswwfjswlsep oijsu jhfj pfb rhei jhe uszi fip jhe ufyd whfuu use pzri jznejheq. fip eveqb yfi rsuu wsj oipeq hsw
                zri vsie fip lsn jqee fip izie whfuu de flqfsp. Uej ow de pswwfjswlsep. Fip yei rsuu qexznisme jhfj zoj zl zie duzzp
                Nzp yfpe fuu yei jz preuu oczi jhe lfxe zl jhe efqjh. Uej ow de pswwfjswlsep oijsu jhfj pfb rhei izdzpb rsuu whzoj
                "Rhsje Czreq!" - rhei izdzpb rsuu whzoj "Dufxt Czreq!" - doj eveqbdzpb rsuu jfut fdzoj Nzp'w czreq fip hoyfi
                czreq.
                S yowj xzileww, yb lqseipw, jhe qzfp fhefp rsuu izj furfbw de wyzzjh. Jheqe rsuu wjsuu de qzxtb cufxew zl lqowjqfjszi
                fip yefipeqsin czsijw zl dersupeqyeij. Jheqe rsuu de sievsjfdue wejdfxtw heqe fip jheqe. Jheqe rsuu de jhzwe
                yzyeijw rhei jhe dozbfixb zl hzce rsuu de jqfiwlzqyep sijz jhe lfjsnoe zl pewcfsq. Zoq pqefyw rsuu wzyejsyew de
                whfjjeqep fip zoq ejheqefu hzcew dufwjep. Re yfb fnfsi rsjh jefq-pqeixhep ebew hfve jz wjfip delzqe jhe dseq zl
                wzye xzoqfnezow xsvsu-qsnhjw rzqteq rhzwe usle rsuu de wiollep zoj db jhe pfwjfqpub fxjw zl duzzpjhsqwjb yzdw. Psllsxouj
                fip cfsilou fw sj sw, re yowj rfut zi si jhe pfbw fhefp rsjh fi fopfxszow lfsjh si jhe lojoqe. Fip fw re xzijsioe zoq
                xhfqjep xzoqwe, re yfb nfsi xziwzufjszi si jhe rzqpw wz izdub uelj db jhfj nqefj dufxt dfqp rhz rfw fuwz f nqefj
                lqeepzy lsnhjeq zl bewjeqpfb, Afyew Reupzi Azhiwzi:
                 Wjzib jhe qzfp re jqzp,
                 Dsjjeq jhe xhfwjeisin qzp
                 Leuj si jhe pfbw
                 Rhei hzce oidzqi hfp psep.
                 Bej rsjh f wjefpb defj,
                 Hfve izj zoq refqb leej
                 Xzye jz jhe cufxe
                 Lzq rhsxh zoq lfjheqw wsnhep?
                 Re hfve xzye zveq jhe rfb
                 Jhfj rsjh jefqw hfjh deei rfjeqep.
                 Re hfve xzye jqefpsin zoq cfjhw
                 Jhqzonh jhe duzzp zl jhe wufonhjeqep,
                 Zoj lqzy jhe nuzzyb cfwj,
                 Jsuu izr re wjfip fj ufwj
                 Rheqe jhe dqsnhj nuefy
                 Zl zoq dqsnhj wjfq sw xfwj.
                Uej jhsw fllsqyfjszi de zoq qsinsin xqb. Sj rsuu nsve ow jhe xzoqfne jz lfxe jhe oixeqjfsijsew zl jhe lojoqe. Sj rsuu nsve zoq
                jsqep leej ier wjqeinjh fw re xzijsioe zoq lzqrfqp wjqspe jzrfqp jhe xsjb zl lqeepzy. Rhei zoq pfbw dexzye pqefqb\s
                57
                rsjh uzr hzveqsin xuzopw zl pewcfsq, fip rhei zoq isnhjw dexzye pfqteq jhfi f jhzowfip yspisnhjw, uej ow qeyeydeq
                jhfj jheqe sw f xqefjsve lzqxe si jhsw oisveqwe, rzqtsin jz couu pzri jhe nsnfijsx yzoijfsiw zl evsu, f czreq jhfj sw fdue
                jz yfte f rfb zoj zl iz rfb fip jqfiwlzqy pfqt bewjeqpfbw sijz dqsnhj jzyzqqzrw. Uej ow qefusme jhe fqx zl jhe yzqfu
                oisveqwe sw uzin doj sj deipw jzrfqp aowjsxe.
                Uej ow qefusme jhfj Rsuusfy Xouuei Dqbfij sw qsnhj: "Jqojh xqowhep jz efqjh rsuu qswe fnfsi." Uej ow nz zoj qefusmsin jhfj
                jhe Dsdue sw qsnhj: "De izj pexesvep, Nzp sw izj yzxtep. Rhfjwzeveq f yfi wzrejh, jhfj whfuu he fuwz qefc." Jhsw sw
                zoq hzce lzq jhe lojoqe, fip rsjh jhsw lfsjh re rsuu de fdue jz wsin si wzye izj jzz pswjfij jzyzqqzr rsjh f xzwysx cfwj
                jeiwe, "Re hfve zveqxzye, re hfve zveqxzye, peec si yb hefqj, S psp deuseve re rzoup zveqxzye."
                """);
                pair.setKey("fdxpelnhsatuyizcgqwjovrkbm");
                return pair;
    }
    public SubstitutionPair getCipher1(){
        SubstitutionPair pair = new SubstitutionPair(null, null);
        pair.setCipher(
                """
                        Cffl zyzeoec.
                        Nflti, fpj wzhhfs donomzeq, fpj sti fw howz, fpj yzji wjzzlfa dtaz pelzj tnntdx oe t qzjozq fw\s
                        lzhokzjtnz tel lztlhi nzjjfjoqn tdnq. Nuz yodnoaq szjz oe tojghtezq fj oe nuzoj fwwodzq:\s
                        qzdjzntjozq, kpqoezqq aze tel sfaze, aohontji tel wzlzjth sfjxzjq, afaq tel ltlq, wjozelq\s
                        tel ezocukfjq. Nufpqtelq fw hoyzq szjz qpllzehi zelzl ki zyoh, lzqgodtkhz tdnq fw nzjjfj. Nuz\s
                        godnpjzq fw tojghtezq whioec oenf kpohloecq, wojzq kpjeoec, upcz ­­ upcz qnjpdnpjzq dfhhtgqoec\s
                        utyz wohhzl pq sonu loqkzhozw, nzjjokhz qtlezqq, tel t rpozn, peiozhloec teczj. Nuzqz tdnq fw\s
                        atqq apjlzj szjz oenzelzl nf wjocunze fpj etnofe oenf dutfq tel jznjztn. Kpn nuzi utyz\s
                        wtohzl. Fpj dfpenji oq qnjfec.
                        T cjztn gzfghz utq kzze afyzl nf lzwzel t cjztn etnofe. Nzjjfjoqn tnntdxq dte qutxz nuz\s
                        wfpeltnofeq fw fpj kocczqn kpohloecq, kpn nuzi dteefn nfpdu nuz wfpeltnofe fw Tazjodt. Nuzqz\s
                        tdnq qutnnzj qnzzh, kpn nuzi dteefn lzen nuz qnzzh fw Tazjodte jzqfhyz. Tazjodt stq ntjcznzl\s
                        wfj tnntdx kzdtpqz sz'jz nuz kjocunzqn kztdfe wfj wjzzlfa tel fggfjnpeoni oe nuz sfjhl. Tel\s
                        ef fez sohh xzzg nutn hocun wjfa quoeoec. Nflti, fpj etnofe qts zyoh ­­ nuz yzji sfjqn fw upate
                        etnpjz ­­ tel sz jzqgfelzl sonu nuz kzqn fw Tazjodt. Sonu nuz ltjoec fw fpj jzqdpz sfjxzjq,  sonu nuz dtjoec wfj qnjteczjq tel ezocukfjq suf dtaz nf coyz khffl tel uzhg oe tei sti nuzi\s
                        dfphl.
                        Oaazlotnzhi wfhhfsoec nuz wojqn tnntdx, O oaghzazenzl fpj cfyzjeazen'q zazjczedi jzqgfeqz\s
                        ghteq. Fpj aohontji oq gfszjwph, tel on'q gjzgtjzl. Fpj zazjczedi nztaq tjz sfjxoec oe Ezs
                        Ifjx Doni tel Stquoecnfe L.D. nf uzhg sonu hfdth jzqdpz zwwfjnq. Fpj wojqn gjofjoni oq nf czn uzhg\s
                        nf nufqz suf utyz kzze oebpjzl, tel nf ntxz zyzji gjzdtpnofe nf gjfnzdn fpj donomzeq tn ufaz\s
                        tel tjfpel nuz sfjhl wjfa wpjnuzj tnntdxq. Nuz wpednofeq fw fpj cfyzjeazen dfenoepz sonufpn
                        oenzjjpgnofe. Wzlzjth tczedozq oe Stquoecnfe suodu utl nf kz zytdptnzl nflti tjz jzfgzeoec\s
                        wfj zqqzenoth gzjqfeezh nfeocun tel sohh kz fgze wfj kpqoezqq nfafjjfs. Fpj woetedoth
                        oeqnonpnofeq jzatoe qnjfec, tel nuz Tazjodte zdfefai sohh kz fgze wfj kpqoezqq tq szhh.
                        Nuz qztjdu oq pelzjsti wfj nufqz suf szjz kzuoel nuzqz zyoh tdnq. O utyz lojzdnzl nuz wphh
                        jzqfpjdzq fw fpj oenzhhoczedz tel hts zewfjdzazen dfaapeonozq nf woel nufqz jzqgfeqokhz tel\s
                        nf kjoec nuza nf bpqnodz. Sz sohh atxz ef loqnoednofe kznszze nuz nzjjfjoqnq suf dfaaonnzl\s
                        nuzqz tdnq tel nufqz suf utjkfj nuza.\s
                        O tggjzdotnz qf yzji apdu nuz azakzjq fw Dfecjzqq suf utyz bfoezl az oe qnjfechi\s
                        dfelzaeoec nuzqz tnntdxq. Tel fe kzuthw fw nuz Tazjodte gzfghz, O nutex nuz atei sfjhl\s
                        hztlzjq suf utyz dthhzl nf fwwzj nuzoj dfelfhzedzq tel tqqoqntedz. Tazjodt tel fpj wjozelq\s
                        tel thhozq bfoe sonu thh nufqz suf sten gztdz tel qzdpjoni oe nuz sfjhl, tel sz qntel nfcznuzj\s
                        nf soe nuz stj tctoeqn nzjjfjoqa.\s
                        Nfeocun, O tqx wfj ifpj gjtizjq wfj thh nufqz suf cjozyz, wfj nuz duohljze sufqz sfjhlq utyz\s
                        kzze qutnnzjzl, wfj thh sufqz qzeqz fw qtwzni tel qzdpjoni utq kzze nujztnzezl. Tel O gjti\s
                        nuzi sohh kz dfawfjnzl ki t Gfszj cjztnzj nute tei fw pq, qgfxze nujfpcu nuz tczq oe Gqtha\s
                        23:
                        Zyze nufpcu O sthx nujfpcu nuz ythhzi fw nuz qutlfs fw lztnu, O wztj ef zyoh wfj ifp tjz sonu
                        az.
                        Nuoq oq t lti suze thh Tazjodteq wjfa zyzji sthx fw howz peonz oe fpj jzqfhyz wfj bpqnodz tel\s
                        gztdz. Tazjodt utq qnffl lfse zezaozq kzwfjz, tel sz sohh lf qf nuoq noaz. Efez fw pq sohh
                        zyzj wfjczn nuoq lti, izn sz cf wfjstjl nf lzwzel wjzzlfa tel thh nutn oq cffl tel bpqn oe fpj\s
                        sfjhl.
                        Nutex ifp. Cffl eocun. Tel Cfl khzqq Tazjodt.
                        """);

                pair.setKey("tkdlzwcuobxhaefgrjqnpysvim");
                return pair;
    }

    public SubstitutionPair getCipher0() {
        SubstitutionPair pair = new SubstitutionPair(null, null);
        pair.setCipher("""
                        Qicpcbuy
                                                     
                                       OL’H XYYD EPZCHL lyd tyeih hodky O voihl ied vci qcpolokep cvvoky. O weh lroilt-vogy el lry lozy, vcui tyeih cul cv pew hkrccp, iykydlpt zeiioyf, edf bydyieppt ozqeloydl wolr povy. E hyel od lry Oppodcoh pybohpeluiy ref cqydyf uq, edf hygyiep vioydfh hubbyhlyf lrel O iud, lrodsodb lrel zt wcis eh e kogop iobrlh pewtyi, edf kcdleklh vicz zt feth eh e kczzudolt cibedonyi, wcupf zesy zy e goexpy kedfofely. Evlyi fohkuhhodb ol wolr zt wovy, O ydlyiyf lry ieky edf qickyyfyf lc fc wrel ygyit voihl-lozy kedfofely fcyh: O lepsyf lc edtcdy wrc wcupf pohlyd. O wydl lc xpcks kpux zyylodbh edf kruikr hckoeph, xyeult hrcqh edf xeixyihrcqh. Ov lwc buth wyiy hledfodb cd e kcidyi, O wcupf kichh lry hliyyl lc redf lryz kezqeobd polyieluiy. Edf ygyitwryiy O wydl, O’f byl hczy gyihocd cv lry hezy lwc auyhlocdh.
                                                     
                                       “Wryiy’f tcu byl lrel vuddt dezy?”
                                                     
                                       Edf lryd: “Tcu hyyz posy e doky ydcubr but. Wrt fc tcu wedl lc bc odlc hczylrodb foilt edf dehlt posy qcpolokh?”
                                                     
                                       O weh vezopoei wolr lry auyhlocd, e geioedl cd lry auyhlocdh ehsyf cv zy tyeih yeipoyi, wryd O’f voihl eiiogyf od Krokebc lc wcis od pcw-odkczy dyobrxcirccfh. Ol hobdepyf e ktdokohz dcl hozqpt wolr qcpolokh xul wolr lry gyit dclocd cv e quxpok povy, e ktdokohz lrel—el pyehl od lry Hculr Hofy dyobrxcirccfh O hcubrl lc iyqiyhydl—ref xyyd dcuiohryf xt e bydyielocd cv xicsyd qiczohyh. Od iyhqcdhy, O wcupf uhueppt hzopy edf dcf edf het lrel O udfyihlccf lry hsyqlokohz, xul lrel lryiy weh—edf epweth ref xyyd—edclryi liefolocd lc qcpolokh, e liefolocd lrel hliylkryf vicz lry feth cv lry kcudlit’h vcudfodb lc lry bpcit cv lry kogop iobrlh zcgyzydl, e liefolocd xehyf cd lry hozqpy ofye lrel wy regy e hlesy od cdy edclryi, edf lrel wrel xodfh uh lcbylryi oh biyelyi lred wrel fiogyh uh eqeil, edf lrel ov ydcubr qycqpy xypoygy od lry liulr cv lrel qicqcholocd edf ekl cd ol, lryd wy zobrl dcl hcpgy ygyit qicxpyz, xul wy ked byl hczylrodb zyedodbvup fcdy.
                                                     
                                       Ol weh e qiyllt kcdgodkodb hqyykr, O lrcubrl. Edf eplrcubr O’z dcl huiy lrel lry qycqpy wrc ryeif zy fypogyi ol wyiy hozopeipt ozqiyhhyf, ydcubr cv lryz eqqiykoelyf zt yeidyhldyhh edf tculrvup hwebbyi lrel O zefy ol lc lry Oppodcoh pybohpeluiy.
                                                     
                                               h
                                                     
                                       HOJ TYEIH PELYI, wryd O fykofyf lc iud vci lry Udolyf Hlelyh Hydely, O wehd’l hc huiy cv zthypv.
                                                     
                                       Xt epp eqqyeiedkyh, zt krcoky cv keiyyih hyyzyf lc regy wcisyf cul. Evlyi lwc lyizh fuiodb wrokr O pexciyf od lry zodciolt, Fyzckielh ref beodyf kcdlicp cv lry hlely hydely, edf O ref huxhyauydlpt qehhyf e hpyw cv xopph, vicz iyvcizh cv lry Oppodcoh fyelr qydeplt hthlyz lc ed yjqedhocd cv lry hlely’h ryeplr qicbiez vci sofh. O ref kcdloduyf lc lyekr el lry Udogyiholt cv Krokebc Pew Hkrccp, e mcx O ydmctyf, edf weh viyauydlpt odgolyf lc hqyes eicudf lcwd. O ref qiyhyigyf zt odfyqydfydky, zt bccf dezy, edf zt zeiioeby, epp cv wrokr, hlelohlokeppt hqyesodb, ref xyyd qpekyf el iohs lry zczydl O hyl vccl od lry hlely keqolep.
                                                     
                                       Xul lry tyeih ref ephc lesyd lryoi lcpp. Hczy cv ol weh muhl e vudklocd cv zt byllodb cpfyi, O huqqchy, vci ov tcu eiy qetodb ellydlocd, yekr hukkyhhogy tyei wopp zesy tcu zciy odlozelypt ekaueodlyf wolr epp cv tcui vpewh—lry xpodf hqclh, lry iykuiiodb rexolh cv lrcubrl lrel zet xy bydylok ci zet xy ydgoicdzydlep, xul lrel wopp epzchl kyileodpt wcihyd wolr lozy, eh huiypt eh lry rolkr od tcui weps luidh lc qeod od tcui roq. Od zy, cdy cv lrchy vpewh ref qicgyd lc xy e kricdok iyhlpyhhdyhh; ed odexopolt lc eqqiykoely, dc zellyi rcw wypp lrodbh wyiy bcodb, lrchy xpyhhodbh lrel wyiy iobrl lryiy od vicdl cv zy. Ol’h e vpew lrel oh ydfyzok lc zcfyid povy, O lrods—ydfyzok, lcc, od lry Ezyioked kreieklyi—edf cdy lrel oh dcwryiy zciy ygofydl lred od lry voypf cv qcpolokh. Wrylryi qcpolokh eklueppt ydkcuiebyh lry lieol ci hozqpt ellieklh lrchy wrc qchhyhh ol oh udkpyei. Hczycdy cdky heof lrel ygyit zed oh litodb lc yolryi pogy uq lc roh velryi’h yjqyklelocdh ci zesy uq vci roh velryi’h zohlesyh, edf O huqqchy lrel zet yjqpeod zt qeilokupei zepeft eh wypp eh edtlrodb yphy.
                                                     
                                       Od edt ygydl, ol weh eh e kcdhyauydky cv lrel iyhlpyhhdyhh lrel O fykofyf lc kreppydby e hollodb Fyzckielok odkuzxydl vci roh kcdbiyhhocdep hyel od lry 2000 ypyklocd ktkpy. Ol weh ed opp-kcdhofyiyf ieky, edf O pchl xefpt—lry hcil cv fiuxxodb lrel ewesydh tcu lc lry vekl lrel povy oh dcl cxpobyf lc wcis cul eh tcu’f qpeddyf. E tyei edf e repv pelyi, lry hkeih cv lrel pchh huvvokoydlpt ryepyf, O ref pudkr wolr e zyfoe kcdhupledl wrc ref xyyd ydkcuiebodb zy vci hczy lozy lc iud vci hlelywofy cvvoky. Eh ol reqqydyf, lry pudkr weh hkryfupyf vci pely Hyqlyzxyi 2001.
                                                     
                                       “Tcu iyepony, fcd’l tcu, lrel lry qcpolokep ftdezokh regy kredbyf,” ry heof eh ry qoksyf el roh hepef.
                                                     
                                       “Wrel fc tcu zyed?” O ehsyf, sdcwodb vupp wypp wrel ry zyedl. Wy xclr pccsyf fcwd el lry dywhqeqyi xyhofy roz. Lryiy, cd lry vicdl qeby, weh Cheze xod Pefyd.
                                                     
                                       “Rypp cv e lrodb, ohd’l ol?” ry heof, hresodb roh ryef. “Iyeppt xef puks. Tcu ked’l kredby tcui dezy, cv kcuihy. Gclyih eiy huhqokocuh cv lrel sodf cv lrodb. Zetxy ov tcu wyiy el lry hleil cv tcui keiyyi, tcu sdcw, tcu kcupf uhy e doksdezy ci hczylrodb. Xul dcw…” Roh gcoky lieopyf cvv edf ry hriubbyf eqcpcbylokeppt xyvciy hobdepodb lry weolyi lc xiodb uh lry kryks.
                                                     
                                       O huhqyklyf ry weh iobrl, edf lrel iyeponelocd ely ewet el zy. Vci lry voihl lozy od zt keiyyi, O xybed lc yjqyioydky lry ydgt cv hyyodb tcudbyi qcpolokoedh hukkyyf wryiy O ref veopyf, zcgodb odlc robryi cvvokyh, byllodb zciy lrodbh fcdy. Lry qpyehuiyh cv qcpolokh—lry efiydepody cv fyxely, lry edozep weizlr cv hresodb redfh edf qpudbodb odlc e kicwf—xybed lc qepy ebeodhl lry zyedyi lehsh cv lry mcx: lry xybbodb vci zcdyt, lry pcdb fiogyh rczy evlyi lry xedauyl ref iud lwc rcuih pcdbyi lred hkryfupyf, lry xef vccf edf hlepy eoi edf kpoqqyf qrcdy kcdgyihelocdh wolr e wovy wrc ref hluks xt zy hc vei xul weh qiyllt vyf uq wolr ieohodb cui kropfiyd epcdy edf weh xyboddodb lc auyhlocd zt qiocioloyh. Ygyd lry pybohpelogy wcis, lry qcpokt zesodb lrel ref bcllyd zy lc iud od lry voihl qpeky, xybed lc vyyp lcc odkiyzydlep, lcc iyzcgyf vicz lry peibyi xellpyh—cgyi lejyh, hykuiolt, ryeplr keiy, edf mcxh—lrel wyiy xyodb webyf cd e delocdep hleby. O xybed lc reixci fcuxlh excul lry qelr O ref krchyd; O xybed vyypodb lry wet O ozebody ed eklci ci elrpyly zuhl vyyp wryd, evlyi tyeih cv kczzolzydl lc e qeilokupei fiyez, evlyi tyeih cv weolodb lexpyh xylwyyd eufolocdh ci hkielkrodb cul rolh od lry zodci pyebuyh, ry iyeponyh lrel ry’h bcdy muhl excul eh vei eh lepydl ci vciludy wopp lesy roz. Lry fiyez wopp dcl reqqyd, edf ry dcw vekyh lry krcoky cv ekkyqlodb lroh vekl posy e bicwduq edf zcgodb cd lc zciy hydhoxpy quihuolh, ci iyvuhodb lry liulr edf ydfodb uq xollyi, aueiiyphczy, edf hpobrlpt qelrylok.
                                                     
                                               h
                                                     
                                       FYDOEP, EDBYI, xeibeododb, fyhqeoi—O’z dcl huiy O wydl lricubr epp lry hlebyh qiyhkioxyf xt lry yjqyilh. El hczy qcodl, lrcubr, O eiiogyf el ekkyqledky—cv zt pozolh, edf, od e wet, zt zcilepolt. O iyvckuhyf cd zt wcis od lry hlely hydely edf lccs helohveklocd vicz lry iyvcizh edf odoloelogyh lrel zt qcholocd evvcifyf. O hqydl zciy lozy el rczy, edf welkryf zt feubrlyih bicw, edf qicqyipt kryiohryf zt wovy, edf lrcubrl excul zt pcdb-lyiz vodedkoep cxpobelocdh. O yjyikohyf, edf iyef dcgyph, edf kezy lc eqqiykoely rcw lry yeilr iclelyf eicudf lry hud edf lry hyehcdh kezy edf wydl wolrcul edt qeilokupei yjyilocdh cd zt qeil.
                                                     
                                       Edf ol weh lroh ekkyqledky, O lrods, lrel eppcwyf zy lc kczy uq wolr lry lrcicubrpt kcksytyf ofye cv iuddodb vci lry Udolyf Hlelyh Hydely. Ed uq-ci-cul hlielybt weh rcw O fyhkioxyf ol lc zt wovy, cdy pehl hrcl lc lyhl cul zt ofyeh xyvciy O hyllpyf odlc e kepzyi, zciy hlexpy, edf xyllyi-qetodb yjohlydky. Edf hry—qyireqh zciy cul cv qolt lred kcdgoklocd—ebiyyf lc lroh cdy pehl ieky, lrcubr hry ephc hubbyhlyf lrel bogyd lry cifyipt povy hry qiyvyiiyf vci cui vezopt, O hrcupfd’l dykyhheiopt kcudl cd ryi gcly.
                                                     
                                       O pyl ryi lesy kczvcil od lry pcdb cffh ebeodhl zy. Lry Iyquxpoked odkuzxydl, Qylyi Volnbyiepf, ref hqydl $19 zoppocd cv roh qyihcdep wyeplr lc udhyel lry qiygocuh hydelci, Keicp Zchypyt Xieud. Ry wehd’l wofypt qcqupei; od vekl ry fofd’l iyeppt hyyz lc ydmct qcpolokh epp lrel zukr. Xul ry hlopp ref udpozolyf zcdyt od roh vezopt, eh wypp eh e byduody odlybiolt lrel ref yeidyf roz biufbodb iyhqykl vicz lry gclyih.
                                                     
                                       Vci e lozy Keicp Zchypyt Xieud iyeqqyeiyf, xeks vicz ed ezxehhefcihroq od Dyw Nyepedf edf wolr lrcubrlh cv litodb lc iykpeoz ryi cpf hyel; ryi qchhoxpy kedfofekt qul zt cwd qpedh cd rcpf. Wryd hry fykofyf lc iud vci lry qiyhofydkt odhlyef, ygyitcdy yphy hleilyf pccsodb el lry Hydely ieky. Xt lry lozy Volnbyiepf eddcudkyf ry wcupf dcl hyys iyypyklocd, O weh hleiodb el hoj qiozeit cqqcdydlh, odkpufodb lry hollodb hlely kczqlicppyi; e xuhodyhhzed wcilr rudfiyfh cv zoppocdh cv fcppeih; Krokebc Zetci Iokreif Fepyt’h vcizyi kroyv cv hlevv; edf e xpeks, vyzepy ryeplr-keiy qicvyhhocdep wrc lry hzeil zcdyt ehhuzyf wcupf hqpol lry xpeks gcly edf fccz wrelygyi hpoz kredkyh O’f ref od lry voihl qpeky.
                                                     
                                       O fofd’l keiy. Viyyf vicz wciit xt pcw yjqyklelocdh, zt kiyfoxopolt xcphlyiyf xt hygyiep rypqvup ydfcihyzydlh, O lriyw zthypv odlc lry ieky wolr ed ydyibt edf mct lrel O’f lrcubrl O ref pchl. O roiyf vcui hlevvyih, epp cv lryz hzeil, od lryoi lwydloyh ci yeipt lroiloyh, edf huolexpt kryeq. Wy vcudf e hzepp cvvoky, qiodlyf pyllyiryef, odhleppyf qrcdy podyh edf hygyiep kczqulyih. Vcui ci vogy rcuih e fet, O keppyf zemci Fyzckielok fcdcih edf lioyf lc byl zt kepph iyluidyf. O rypf qiyhh kcdvyiydkyh lc wrokr dcxcft kezy. Wy hobdyf uq vci lry edduep Hl. Qelioks’h Fet Qeiefy edf wyiy ehhobdyf lry qeiefy’h gyit pehl hpcl, hc zt lyd gcpudlyyih edf O vcudf cuihypgyh zeikrodb muhl e vyw qekyh eryef cv lry kolt’h hedolelocd liuksh, wegodb lc lry vyw hliebbpyih wrc iyzeodyf cd lry iculy wropy wcisyih hwyql uq beixeby edf qyypyf biyyd hrezicks hloksyih cvv lry pezqqchlh.
                                                     
                                       Zchlpt, lrcubr, O muhl liegypyf, cvlyd fiogodb epcdy, voihl vicz weif lc weif od Krokebc, lryd vicz kcudlt lc kcudlt edf lcwd lc lcwd, ygydlueppt uq edf fcwd lry hlely, qehl zopyh edf zopyh cv kcidvoypfh edf xyedvoypfh edf lieod lieksh edf hopch. Ol wehd’l ed yvvokoydl qickyhh. Wolrcul lry zekrodyit cv lry hlely’h Fyzckielok Qeilt cibedonelocd, wolrcul edt iyep zeopodb pohl ci Odlyidyl cqyielocd, O ref lc iypt cd vioydfh ci ekaueodledkyh lc cqyd lryoi rcuhyh lc wrcygyi zobrl kczy, ci lc eiiedby vci zt gohol lc lryoi kruikr, udocd repp, xiofby bicuq, ci Icleit Kpux. Hczylozyh, evlyi hygyiep rcuih cv fiogodb, O wcupf vodf muhl lwc ci lriyy qycqpy weolodb vci zy eicudf e solkryd lexpy. O wcupf regy lc ehhuiy lry rchlh lrel lry luidcul weh vody edf kczqpozydl lryz cd lry iyviyhrzydlh lryt’f qiyqeiyf. Hczylozyh O wcupf hol lricubr e kruikr hyigoky edf lry qehlci wcupf vcibyl lc iykcbdony zy, ci lry ryef cv lry udocd pckep wcupf pyl zy hqyes lc roh zyzxyih muhl xyvciy eddcudkodb lrel lry udocd ref fykofyf lc ydfcihy hczycdy yphy.
                                                     
                                       Xul wrylryi O weh zyylodb wolr lwc qycqpy ci vovlt, wrylryi O weh od cdy cv lry wypp-hrefyf, hlelypt rczyh cv lry Dcilr Hrciy, e weps-uq eqeilzydl cd lry Wyhl Hofy, ci e veizrcuhy culhofy Xpcczodblcd, wrylryi qycqpy wyiy vioydfpt, odfovvyiydl, ci ckkehocdeppt rchlopy, O lioyf zt xyhl lc syyq zt zculr hrul edf ryei wrel lryt ref lc het. O pohlydyf lc qycqpy leps excul lryoi mcxh, lryoi xuhodyhhyh, lry pckep hkrccp; lryoi edbyi el Xuhr edf lryoi edbyi el Fyzckielh; lryoi fcbh, lryoi xeks qeod, lryoi wei hyigoky, edf lry lrodbh lryt iyzyzxyiyf vicz kropfrccf. Hczy ref wypp-fygypcqyf lrycioyh lc yjqpeod lry pchh cv zeduvekluiodb mcxh ci lry robr kchl cv ryeplr keiy. Hczy iykolyf wrel lryt ref ryeif cd Iuhr Pozxeubr ci DQI. Xul zchl cv lryz wyiy lcc xuht wolr wcis ci lryoi sofh lc qet zukr ellydlocd lc qcpolokh, edf lryt hqcsy odhlyef cv wrel lryt hew xyvciy lryz: e qpedl kpchyf, e qiczclocd, e robr ryelodb xopp, e qeiydl od e duihodb rczy, e kropf’h voihl hlyq.
                                                     
                                       Dc xpodfodb odhobrlh yzyibyf vicz lryhy zcdlrh cv kcdgyihelocd. Ov edtlrodb, wrel hliuks zy weh muhl rcw zcfyhl qycqpy’h rcqyh wyiy, edf rcw zukr cv wrel lryt xypoygyf hyyzyf lc rcpf kcdhledl ekichh ieky, iybocd, iypobocd, edf kpehh. Zchl cv lryz lrcubrl lrel edtxcft woppodb lc wcis hrcupf xy expy lc vodf e mcx lrel qeof e pogodb weby. Lryt vobuiyf lrel qycqpy hrcupfd’l regy lc vopy vci xedsiuqlkt xykeuhy lryt bcl hoks. Lryt xypoygyf lrel ygyit kropf hrcupf regy e byduodypt bccf yfukelocd—lrel ol hrcupfd’l muhl xy e xudkr cv leps—edf lrel lrchy hezy kropfiyd hrcupf xy expy lc bc lc kcppyby ygyd ov lryoi qeiydlh wyiyd’l iokr. Lryt wedlyf lc xy hevy, vicz kiozodeph edf vicz lyiiciohlh; lryt wedlyf kpyed eoi, kpyed welyi, edf lozy wolr lryoi sofh. Edf wryd lryt bcl cpf, lryt wedlyf lc xy expy lc iyloiy wolr hczy fobdolt edf iyhqykl.
                                                     
                                       Lrel weh excul ol. Ol wehd’l zukr. Edf eplrcubr lryt udfyihlccf lrel rcw lryt fof od povy fyqydfyf zchlpt cd lryoi cwd yvvcilh—eplrcubr lryt fofd’l yjqykl bcgyidzydl lc hcpgy epp lryoi qicxpyzh, edf kyileodpt fofd’l posy hyyodb lryoi lej fcppeih wehlyf—lryt vobuiyf lrel bcgyidzydl hrcupf rypq.
                                                     
                                       O lcpf lryz lrel lryt wyiy iobrl: bcgyidzydl kcupfd’l hcpgy epp lryoi qicxpyzh. Xul wolr e hpobrl kredby od qiocioloyh wy kcupf zesy huiy ygyit kropf ref e fykydl hrcl el povy edf zyyl lry kreppydbyh wy vekyf eh e delocd. Zciy cvlyd lred dcl, vcpsh wcupf dcf od ebiyyzydl edf ehs rcw lryt kcupf byl odgcpgyf. Edf xt lry lozy O weh xeks cd lry icef, wolr e zeq cd lry qehhydbyi’h hyel, cd zt wet lc zt dyjl hlcq, O sdyw cdky ebeod muhl wrt O’f bcdy odlc qcpolokh.
                                                     
                                       O vypl posy wcisodb reifyi lred O’f ygyi wcisyf od zt povy.
                                                     
                                                     
                                       ozeby
                                                     
                                                     
                                       LROH XCCS BICWH foiyklpt cul cv lrchy kcdgyihelocdh cd lry kezqeobd lieop. Dcl cdpt fof zt ydkcudlyih wolr gclyih kcdvoiz lry vudfezydlep fykydkt cv lry Ezyioked qycqpy, lryt ephc iyzodfyf zy lrel el lry kciy cv lry Ezyioked yjqyioydky eiy e hyl cv ofyeph lrel kcdloduy lc hloi cui kcppyklogy kcdhkoydky; e kczzcd hyl cv gepuyh lrel xodf uh lcbylryi fyhqoly cui fovvyiydkyh; e iuddodb lriyef cv rcqy lrel zesyh cui ozqicxexpy yjqyiozydl od fyzckiekt wcis. Lryhy gepuyh edf ofyeph vodf yjqiyhhocd dcl muhl od lry zeixpy hpexh cv zcduzydlh ci od lry iykolelocd cv rohlcit xccsh. Lryt iyzeod epogy od lry ryeilh edf zodfh cv zchl Ezyiokedh—edf ked odhqoiy uh lc qiofy, fult, edf hekiovoky.
                                                     
                                       O iykcbdony lry iohsh cv lepsodb lroh wet. Od ed yie cv bpcxeponelocd edf fonntodb lykrdcpcbokep kredby, kullricel qcpolokh edf udiyzollodb kupluiy weih, wy fcd’l ygyd hyyz lc qchhyhh e hreiyf pedbueby wolr wrokr lc fohkuhh cui ofyeph, zukr pyhh lry lccph lc eiiogy el hczy icubr kcdhydhuh excul rcw, eh e delocd, wy zobrl wcis lcbylryi lc xiodb lrchy ofyeph excul. Zchl cv uh eiy wohy lc lry weth cv efzyd, qcpphlyih, hqyykrwiolyih, edf qudfolh. Wy sdcw rcw robr-vptodb wcifh ked xy fyqpctyf od lry hyigoky cv ktdokep eozh, edf rcw lry dcxpyhl hydlozydlh ked xy huxgyilyf od lry dezy cv qcwyi, yjqyfoydky, biyyf, ci odlcpyiedky. Ygyd lry hledfeif robr hkrccp rohlcit lyjlxccs dclyh lry fybiyy lc wrokr, vicz olh gyit odkyqlocd, lry iyepolt cv Ezyioked povy reh hlietyf vicz olh ztlrh. Od hukr e kpozely, edt ehhyilocd cv hreiyf ofyeph ci kczzcd gepuyh zobrl hyyz rcqypyhhpt deïgy, ov dcl fcwdiobrl fedbyicuh—ed ellyzql lc bpchh cgyi hyiocuh fovvyiydkyh od qcpokt edf qyivcizedky ci, wcihy, e zyedh cv zuvvpodb lry kczqpeodlh cv lrchy wrc vyyp opp hyigyf xt cui kuiiydl odhlolulocdep eiiedbyzydlh.
                                                     
                                       Zt eibuzydl, rcwygyi, oh lrel wy regy dc krcoky. Tcu fcd’l dyyf e qcpp lc sdcw lrel lry gehl zemciolt cv Ezyiokedh—Iyquxpoked, Fyzckiel, edf odfyqydfydl—eiy wyeit cv lry fyef ncdy lrel qcpolokh reh xykczy, od wrokr deiicw odlyiyhlh goy vci efgedleby edf ofycpcbokep zodcioloyh hyys lc ozqchy lryoi cwd gyihocdh cv exhcpuly liulr. Wrylryi wy’iy vicz iyf hlelyh ci xpuy hlelyh, wy vyyp od cui bul lry peks cv rcdyhlt, iobci, edf kczzcd hydhy od cui qcpokt fyxelyh, edf fohposy wrel eqqyeih lc xy e kcdloducuh zydu cv vephy ci kiezqyf krcokyh. Iypobocuh ci hykupei, xpeks, wroly, ci xicwd, wy hydhy—kciiyklpt—lrel lry delocd’h zchl hobdovokedl kreppydbyh eiy xyodb obdciyf, edf lrel ov wy fcd’l kredby kcuihy hccd, wy zet xy lry voihl bydyielocd od e gyit pcdb lozy lrel pyegyh xyrodf e wyesyi edf zciy viekluiyf Ezyioke lred lry cdy wy odryiolyf. Qyireqh zciy lred edt clryi lozy od cui iykydl rohlcit, wy dyyf e dyw sodf cv qcpolokh, cdy lrel ked yjkegely edf xuopf uqcd lrchy hreiyf udfyihledfodbh lrel qupp uh lcbylryi eh Ezyiokedh.
                                                     
                                       Lrel’h lry lcqok cv lroh xccs: rcw wy zobrl xybod lry qickyhh cv kredbodb cui qcpolokh edf cui kogok povy. Lroh ohd’l lc het lrel O sdcw yjeklpt rcw lc fc ol. O fcd’l. Eplrcubr O fohkuhh od yekr kreqlyi e duzxyi cv cui zchl qiyhhodb qcpokt kreppydbyh, edf hubbyhl od xicef hlicsyh lry qelr O xypoygy wy hrcupf vcppcw, zt liyelzydl cv lry ohhuyh oh cvlyd qeiloep edf odkczqpyly. O cvvyi dc udovtodb lrycit cv Ezyioked bcgyidzydl, dci fc lryhy qebyh qicgofy e zedovyhlc vci eklocd, kczqpyly wolr kreilh edf bieqrh, lozylexpyh edf lyd-qcodl qpedh.
                                                     
                                       Odhlyef wrel O cvvyi oh hczylrodb zciy zcfyhl: qyihcdep iyvpyklocdh cd lrchy gepuyh edf ofyeph lrel regy pyf zy lc quxpok povy, hczy lrcubrlh cd lry weth lrel cui kuiiydl qcpolokep fohkcuihy uddykyhheiopt fogofyh uh, edf zt cwd xyhl ehhyhhzydl—xehyf cd zt yjqyioydky eh e hydelci edf pewtyi, ruhxedf edf velryi, Kriohloed edf hsyqlok—cv lry weth wy ked bicudf cui qcpolokh od lry dclocd cv e kczzcd bccf.
                                                     
                                       Pyl zy xy zciy hqykovok excul rcw lry xccs oh cibedonyf. Kreqlyi Cdy lesyh hlcks cv cui iykydl qcpolokep rohlcit edf lioyh lc yjqpeod hczy cv lry hcuikyh vci lcfet’h xollyi qeilohedhroq. Od Kreqlyi Lwc, O fohkuhh lrchy kczzcd gepuyh lrel zobrl hyigy eh lry vcudfelocd vci e dyw qcpolokep kcdhydhuh. Kreqlyi Lriyy yjqpciyh lry Kcdhlolulocd dcl muhl eh e hcuiky cv odfogofuep iobrlh, xul ephc eh e zyedh cv cibedonodb e fyzckielok kcdgyihelocd eicudf cui kcppyklogy vuluiy. Od Kreqlyi Vcui, O lit lc kcdgyt hczy cv lry odhlolulocdep vcikyh—zcdyt, zyfoe, odlyiyhl bicuqh, edf lry pybohpelogy qickyhh—lrel hlovpy ygyd lry xyhl-odlydlocdyf qcpolokoed. Edf od lry iyzeododb vogy kreqlyih, O hubbyhl rcw wy zobrl zcgy xytcdf cui fogohocdh lc yvvyklogypt lekspy kcdkiyly qicxpyzh: lry bicwodb ykcdczok odhykuiolt cv zedt Ezyioked vezopoyh, lry iekoep edf iypobocuh lydhocdh wolrod lry xcft qcpolok, edf lry liedhdelocdep lriyelh—vicz lyiiciohz lc qedfyzok—lrel belryi xytcdf cui hrciyh.
                                                     
                                       O huhqykl lrel hczy iyefyih zet vodf zt qiyhydlelocd cv lryhy ohhuyh lc xy odhuvvokoydlpt xepedkyf. Lc lroh ekkuhelocd, O hledf buoplt eh kreibyf. O ez e Fyzckiel, evlyi epp; zt goywh cd zchl lcqokh kciiyhqcdf zciy kpchypt lc lry yfolcioep qebyh cv lry Dyw Tcis Lozyh lred lrchy cv lry Wepp Hliyyl Mcuidep. O ez edbit excul qcpokoyh lrel kcdhohlydlpt vegci lry wyeplrt edf qcwyivup cgyi egyieby Ezyiokedh, edf odhohl lrel bcgyidzydl reh ed ozqciledl icpy od cqydodb uq cqqciludolt lc epp. O xypoygy od ygcpulocd, hkoydlovok odauoit, edf bpcxep weizodb; O xypoygy od viyy hqyykr, wrylryi qcpolokeppt kciiykl ci qcpolokeppt odkciiykl, edf O ez huhqokocuh cv uhodb bcgyidzydl lc ozqchy edtxcft’h iypobocuh xypoyvh—odkpufodb zt cwd—cd dcdxypoygyih. Vuilryizciy, O ez e qiohcdyi cv zt cwd xocbieqrt: O ked’l rypq xul goyw lry Ezyioked yjqyioydky lricubr lry pydh cv e xpeks zed cv zojyf ryioleby, vciygyi zodfvup cv rcw bydyielocdh cv qycqpy wrc pccsyf posy zy wyiy huxmubelyf edf hlobzelonyf, edf lry huxlpy edf dcl hc huxlpy weth lrel ieky edf kpehh kcdloduy lc hreqy cui pogyh.
                                                     
                                       Xul lrel oh dcl epp lrel O ez. O ephc lrods zt qeilt ked xy hzub, fylekryf, edf fcbzelok el lozyh. O xypoygy od lry viyy zeisyl, kczqylolocd, edf ydliyqiydyuihroq, edf lrods dc hzepp duzxyi cv bcgyidzydl qicbiezh fcd’l wcis eh efgyilohyf. O wohr lry kcudlit ref vywyi pewtyih edf zciy ydbodyyih. O lrods Ezyioke reh zciy cvlyd xyyd e vciky vci bccf lred vci opp od lry wcipf; O keiit vyw oppuhocdh excul cui ydyzoyh, edf iygyiy lry kcuieby edf kczqylydky cv cui zopoleit. O iymykl e qcpolokh lrel oh xehyf hcpypt cd iekoep ofydlolt, bydfyi ofydlolt, hyjuep cioydlelocd, ci goklozrccf bydyieppt. O lrods zukr cv wrel eoph lry oddyi kolt odgcpgyh e xiyesfcwd od kupluiy lrel wopp dcl xy kuiyf xt zcdyt epcdy, edf lrel cui gepuyh edf hqoioluep povy zellyi el pyehl eh zukr eh cui BFQ.
                                                     
                                       Udfcuxlyfpt, hczy cv lryhy goywh wopp byl zy od licuxpy. O ez dyw ydcubr cd lry delocdep qcpolokep hkydy lrel O hyigy eh e xpeds hkiyyd cd wrokr qycqpy cv gehlpt fovvyiydl qcpolokep hlioqyh qicmykl lryoi cwd goywh. Eh hukr, O ez xcudf lc foheqqcodl hczy, ov dcl epp, cv lryz. Wrokr qyireqh odfokelyh e hykcdf, zciy odlozely lryzy lc lroh xccs—dezypt, rcw O, ci edtxcft od quxpok cvvoky, ked egcof lry qolvepph cv vezy, lry rudbyi lc qpyehy, lry vyei cv pchh, edf lryiyxt iyleod lrel syidyp cv liulr, lrel hodbupei gcoky wolrod yekr cv uh lrel iyzodfh uh cv cui fyyqyhl kczzolzydlh.
                                                     
                                       Iykydlpt, cdy cv lry iyqcilyih kcgyiodb Keqolcp Ropp hlcqqyf zy cd lry wet lc zt cvvoky edf zydlocdyf lrel hry ref ydmctyf iyefodb zt voihl xccs. “O wcdfyi,” hry heof, “ov tcu ked xy lrel odlyiyhlodb od lry dyjl cdy tcu wioly.” Xt wrokr hry zyedl, O wcdfyi ov tcu ked xy rcdyhl dcw lrel tcu eiy e U.H. hydelci.
                                                     
                                       O wcdfyi, lcc, hczylozyh. O rcqy wiolodb lroh xccs rypqh zy edhwyi lry auyhlocd.
                                                     
                                       Kreqlyi Cdy
                                                     
                                       Iyquxpokedh edf Fyzckielh
                                                     
                                       CD ZCHL FETH, O ydlyi lry Keqolcp lricubr lry xehyzydl. E hzepp huxwet lieod keiioyh zy vicz lry Reil Xuopfodb, wryiy zt cvvoky oh pckelyf, lricubr ed udfyibicudf luddyp podyf wolr lry vpebh edf hyeph cv lry vovlt hlelyh. Lry lieod kiyesh lc e repl edf O zesy zt wet, qehl xuhlpodb hlevvyih, zeodlydedky kiywh, edf lry ckkehocdep lcui bicuq, lc lry xeds cv cpf ypygelcih lrel lesyh zy lc lry hykcdf vpcci. Hlyqqodb cvv, O wyegy eicudf lry hweiz cv qiyhh lrel dcizeppt belryih lryiy, het ryppc lc lry Keqolcp Qcpoky, edf ydlyi, lricubr e hlelypt hyl cv fcuxpy fccih, cdlc lry vpcci cv lry U.H. Hydely.
                                                     
                                       Lry Hydely krezxyi oh dcl lry zchl xyeulovup hqeky od lry Keqolcp, xul ol oh ozqchodb dcdylrypyhh. Lry fud-kcpciyf wepph eiy hyl cvv xt qedyph cv xpuy fezehs edf kcpuzdh cv vodypt gyodyf zeixpy. Cgyiryef, lry kyopodb vcizh e kiyezt wroly cgep, wolr ed Ezyioked yebpy ylkryf od olh kydlyi. Excgy lry goholcih’ beppyit, lry xuhlh cv lry delocd’h voihl lwydlt goky qiyhofydlh hol od hcpyzd iyqchy.
                                                     
                        """);


                pair.setKey("exkfyvbromspzdcqaihlugwjtn");
                return pair;
        }
        public static File getPureMLK11(){
            return new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Pure-MLK-11-Speeches.txt");
        }

        public String selectRandomBlockOfSentences(FileSplitToSentences source, int lengthOfBlock, boolean newLineEverySentence) {
            Random random = new Random();
            System.out.println(source.size());
            int startIndex = random.nextInt(source.size()-lengthOfBlock);
            ArrayList<String>subList = new ArrayList<>();
            for (int i = startIndex; i < startIndex+lengthOfBlock; i++) {
                subList.add(source.get(i));
            }
            String newLine = "\n";
            if (!newLineEverySentence){
                newLine = "";
            }
            StringBuilder sb = new StringBuilder();
            for (String s: subList){
                sb.append(s).append(" ").append(newLine);
            }
            return sb.toString();
        }
    //    public String selectRandomBlockOfSentences(File file, int lengthOfBlock) {
//        Sentence firstSentence = selectRandomSentence(file);
//        Sentence[] sentences = new Sentence[lengthOfBlock];
//        StringBuilder sb = new StringBuilder();
//        sentences[0] = firstSentence;
//        for (int i = 1; i < sentences.length; i++) {
//            sentences[i]=nextSentence(sentences[i-1]);
//        }
//        for (int i = 0; i < sentences.length-1; i++) {
//            Sentence s = sentences[i];
//            if (i % 2 == 0){
//                sb.append(s.getSentence());
//            }
//            if (i % 2 != 0){
//                sb.append(s.getSentence()).append(s.getPunctuation());
//            }
//        }
//        Sentence lastSentence = sentences[sentences.length-1];
//        sb.append(lastSentence.getSentence()).append(lastSentence.getPunctuation());
//        return sb.toString();
//    }
    private ArrayList<String> turnAbbrevsIntoStringArray() throws FileNotFoundException {
        ArrayList<String> rtn = new ArrayList<>();
        File tempOEDAbbrevs = getOEDAbbreviations();
        Scanner scanner = new Scanner(tempOEDAbbrevs);
        while (scanner.hasNextLine()){
            rtn.add(scanner.nextLine());
        }
        return rtn;
    }
    public File getOEDAbbreviations(){
        return new File("OED-Abbreviations.txt");
    }
    public boolean containsIgnorers(String string, String[] exceptions) {
        boolean containsIgnorers = false;
        boolean isException = false;
        for (int i = 0; i < string.length(); i++) {
            for (String exception : exceptions) {
                if (exception.equals(String.valueOf(string.charAt(i)))) {
                    isException = true;
                    break;
                }
            }
            if (!isException){
                if (isIgnorer(string.charAt(i))) {
                    containsIgnorers = true;
                    break;
                }
            }
        }
        return containsIgnorers;
    }
    public String capitalizeFirstLetter(String string){
        if (string.isEmpty()){return string;}

        String first = String.valueOf(string.charAt(0));

        if (string.length() == 1){return first.toUpperCase();}

        StringBuilder sb = new StringBuilder();
        sb.append(first.toUpperCase());
        for (int i = 1; i < string.length(); i++) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }
    public double relDiv(double x){
        return 1152000.0/x;
    }

    public String increaseFont(Node node, double multiplier){
        return enlargeFontSize(deriveFontSize(node.getStyle()), multiplier);
    }
    public String enlargeFontSize(double currentSize, double multiplier){
        double enlarged = currentSize*multiplier;
        String rtn = "-fx-font-size:"+enlarged+"pt;";
        return rtn;
    }
    public int deriveFontSize(String CSS){
        String tempCSS = CSS;
       Scanner scanner = new Scanner(tempCSS);
       while (scanner.hasNext()){
           String next = scanner.next();
           if (!next.contains("pt")){
               tempCSS = tempCSS.replaceAll(next, "");
           }
       }
       String removedAll = tempCSS.replaceAll("[^0-9]", "");
       return Integer.parseInt(removedAll);
    }

    public int wordsIn(String string){
        int count = 0;
        Scanner scanner = new Scanner(string);
        while (scanner.hasNext()){
            String next = scanner.next();
            if (next != null){
                count++;
            }
        }
        return count;
    }
    public ArrayList<String> permutationsOfAlphabet(int length){
        ArrayList<String> rtn = new ArrayList<>();
        char[] tempAlphabet = alphabet;
        String[] alph = charToStringArray(tempAlphabet);
        if (length > 0){
            for (String a: alph) {
                if (length > 1){
                    for (String b: alph) {
                        String ab = a+b;
                        if (length > 2){
                            for (String c: alph) {
                                String abc = ab+c;
                                if (length > 3){
                                    for (String d: alph) {
                                        String abcd = abc+d;
                                        System.err.println(abcd);
                                        if (length > 4){
                                            for (String e: alph) {
                                                rtn.add(abcd+e);
                                            }
                                        }
                                        else {
                                            rtn.add(abcd);
                                        }
                                    }
                                }
                                else {
                                    rtn.add(abc);
                                }
                            }
                        }
                        else {
                            rtn.add(ab);
                        }
                    }
                }
                else {
                    rtn.add(a);
                }
            }
        }
        return rtn;
    }
    public final char[] ignorers0 = new char[]{'\n', ',','.','’','“','”','-','?','—','!',';','á','ó','"','í',':',')','(','1','é','\'','ú','0','2','9','_','‘','5','8','3','…','6','*','4','7','è','•','ë','[',']','§','–','$','ü','ï','/','ö','à','#','ê','â','&','%','ç','Á','ç','Á','ä','ô','Ñ','À','=','œ','œ','`','æ','æ','î','É','+','~','@'};
    public final char[] ignorers1 = new char[] {'\n',' ', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '[', ']', '\\', ';', '\'', ',', '.', '/', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '{', '}', '|', ':', '"', '<', '>', '?', '¡', '™', '£', '¢', '∞', '§', '¶', '•', 'ª', 'º', '–', '≠', 'œ', '∑', '´', '®', '†', '¥', '¨', 'ˆ', 'ø', 'π', '“', '‘', '«', 'å', 'ß', '∂', 'ƒ', '©', '˙', '∆', '˚', '¬', '…', 'æ', 'Ω', '≈', 'ç', '√', '∫', '˜', 'µ', '≤', '≥', '÷', '⁄', '€', '‹', '›', 'ﬁ', 'ﬂ', '‡', '°', '·', '‚', '—', '±', 'Œ', '„', '´', '‰', 'ˇ', 'Á', '¨', 'ˆ', 'Ø', '∏', '”', '’', '»', 'Å', 'Í', 'Î', 'Ï', '˝', 'Ó', 'Ô', '', 'Ò', 'Ú', 'Æ', '¸', '˛', 'Ç', '◊', 'ı', '˜', 'Â', '¯', '˘', '¿', 'è', 'é', 'ê', 'ë', 'ē', 'ė', 'ę', 'ÿ', 'û', 'ü', 'ù', 'ú', 'ū', 'î', 'ï', 'í', 'ī', 'į', 'ì', 'ô', 'ö', 'ò', 'ó', 'œ', 'ø', 'ō', 'õ', 'à', 'á', 'â', 'ä', 'æ', 'ã', 'å', 'ā', 'ß', 'ś', 'š', 'ł', 'ž', 'ź', 'ż', 'ç', 'ć', 'č', 'ñ', 'ń', 'È', 'É', 'Ê', 'Ë', 'Ē', 'Ė', 'Ę', 'Ÿ', 'Û', 'Ü', 'Ù', 'Ú', 'Ū', 'Î', 'Ï', 'Í', 'Ī', 'Į', 'Ì', 'Ô', 'Ö', 'Ò', 'Ó', 'Œ', 'Ø', 'Ō', 'Õ', 'À', 'Á', 'Â', 'Ä', 'Æ', 'Ã', 'Å', 'Ā', 'Ś', 'Š', 'Ł', 'Ž', 'Ź', 'Ż', 'Ç', 'Ć', 'Č', 'Ñ', 'Ń', '‖', '‗'};
    public final char[] ignorers2 = new char[] {'\n',' ', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '[', ']', '\\', ';', ',', '.', '/', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '{', '}', '|', ':', '"', '<', '>', '?', '¡', '™', '£', '¢', '∞', '§', '¶', '•', 'ª', 'º', '–', '≠', 'œ', '∑', '´', '®', '†', '¥', '¨', 'ˆ', 'ø', 'π', '“', '«', '©', '˙', '∆', '˚', '¬', '…', 'Ω', '≈', '√', '∫', '˜', 'µ', '≤', '≥', '÷', '⁄', '€', '‹', '›', 'ﬁ', 'ﬂ', '‡', '°', '·', '‚', '—', '±', '„', '´', '‰', 'ˇ', '¨', 'ˆ', 'Ø', '∏', '”', '’', '»', '˝', '', '¸', '˛', '◊', 'ı', '˜', '¯', '˘', '¿', '‖', '‗'};

    public CharSet(){this(false);}
    public CharSet(int ignorerSet){
        if (ignorerSet == 0){
            ignorers = new char[]{'\n', ',','.','’','“','”','-','?','—','!',';','á','ó','"','í',':',')','(','1','é','\'','ú','0','2','9','_','‘','5','8','3','…','6','*','4','7','è','•','ë','[',']','§','–','$','ü','ï','/','ö','à','#','ê','â','&','%','ç','Á','ç','Á','ä','ô','Ñ','À','=','œ','œ','`','æ','æ','î','É','+','~','@'};
        }
        if (ignorerSet == 1){
            ignorers = new char[] {'\n',' ', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '[', ']', '\\', ';', '\'', ',', '.', '/', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '{', '}', '|', ':', '"', '<', '>', '?', '¡', '™', '£', '¢', '∞', '§', '¶', '•', 'ª', 'º', '–', '≠', 'œ', '∑', '´', '®', '†', '¥', '¨', 'ˆ', 'ø', 'π', '“', '‘', '«', 'å', 'ß', '∂', 'ƒ', '©', '˙', '∆', '˚', '¬', '…', 'æ', 'Ω', '≈', 'ç', '√', '∫', '˜', 'µ', '≤', '≥', '÷', '⁄', '€', '‹', '›', 'ﬁ', 'ﬂ', '‡', '°', '·', '‚', '—', '±', 'Œ', '„', '´', '‰', 'ˇ', 'Á', '¨', 'ˆ', 'Ø', '∏', '”', '’', '»', 'Å', 'Í', 'Î', 'Ï', '˝', 'Ó', 'Ô', '', 'Ò', 'Ú', 'Æ', '¸', '˛', 'Ç', '◊', 'ı', '˜', 'Â', '¯', '˘', '¿', 'è', 'é', 'ê', 'ë', 'ē', 'ė', 'ę', 'ÿ', 'û', 'ü', 'ù', 'ú', 'ū', 'î', 'ï', 'í', 'ī', 'į', 'ì', 'ô', 'ö', 'ò', 'ó', 'œ', 'ø', 'ō', 'õ', 'à', 'á', 'â', 'ä', 'æ', 'ã', 'å', 'ā', 'ß', 'ś', 'š', 'ł', 'ž', 'ź', 'ż', 'ç', 'ć', 'č', 'ñ', 'ń', 'È', 'É', 'Ê', 'Ë', 'Ē', 'Ė', 'Ę', 'Ÿ', 'Û', 'Ü', 'Ù', 'Ú', 'Ū', 'Î', 'Ï', 'Í', 'Ī', 'Į', 'Ì', 'Ô', 'Ö', 'Ò', 'Ó', 'Œ', 'Ø', 'Ō', 'Õ', 'À', 'Á', 'Â', 'Ä', 'Æ', 'Ã', 'Å', 'Ā', 'Ś', 'Š', 'Ł', 'Ž', 'Ź', 'Ż', 'Ç', 'Ć', 'Č', 'Ñ', 'Ń', '‖', '‗'};
        }
        if (ignorerSet == 2){
            ignorers = new char[] {'\n',' ', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '[', ']', '\\', ';', ',', '.', '/', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '{', '}', '|', ':', '"', '<', '>', '?', '¡', '™', '£', '¢', '∞', '§', '¶', '•', 'ª', 'º', '–', '≠', 'œ', '∑', '´', '®', '†', '¥', '¨', 'ˆ', 'ø', 'π', '“', '«', '©', '˙', '∆', '˚', '¬', '…', 'Ω', '≈', '√', '∫', '˜', 'µ', '≤', '≥', '÷', '⁄', '€', '‹', '›', 'ﬁ', 'ﬂ', '‡', '°', '·', '‚', '—', '±', '„', '´', '‰', 'ˇ', '¨', 'ˆ', 'Ø', '∏', '”', '’', '»', '˝', '', '¸', '˛', '◊', 'ı', '˜', '¯', '˘', '¿', '‖', '‗'};
        }
    }
    public CharSet(boolean streamLineIgnorers){
        if (streamLineIgnorers){
            ignorers = new char[]{'\n', ',','.','’','“','”','-','?','—','!',';','á','ó','"','í',':',')','(','1','é','\'','ú','0','2','9','_','‘','5','8','3','…','6','*','4','7','è','•','ë','[',']','§','–','$','ü','ï','/','ö','à','#','ê','â','&','%','ç','Á','ç','Á','ä','ô','Ñ','À','=','œ','œ','`','æ','æ','î','É','+','~','@'};
        }
        if (!streamLineIgnorers){
            ignorers = new char[] {'\n',' ', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '[', ']', '\\', ';', '\'', ',', '.', '/', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '{', '}', '|', ':', '"', '<', '>', '?', '¡', '™', '£', '¢', '∞', '§', '¶', '•', 'ª', 'º', '–', '≠', 'œ', '∑', '´', '®', '†', '¥', '¨', 'ˆ', 'ø', 'π', '“', '‘', '«', 'å', 'ß', '∂', 'ƒ', '©', '˙', '∆', '˚', '¬', '…', 'æ', 'Ω', '≈', 'ç', '√', '∫', '˜', 'µ', '≤', '≥', '÷', '⁄', '€', '‹', '›', 'ﬁ', 'ﬂ', '‡', '°', '·', '‚', '—', '±', 'Œ', '„', '´', '‰', 'ˇ', 'Á', '¨', 'ˆ', 'Ø', '∏', '”', '’', '»', 'Å', 'Í', 'Î', 'Ï', '˝', 'Ó', 'Ô', '', 'Ò', 'Ú', 'Æ', '¸', '˛', 'Ç', '◊', 'ı', '˜', 'Â', '¯', '˘', '¿', 'è', 'é', 'ê', 'ë', 'ē', 'ė', 'ę', 'ÿ', 'û', 'ü', 'ù', 'ú', 'ū', 'î', 'ï', 'í', 'ī', 'į', 'ì', 'ô', 'ö', 'ò', 'ó', 'œ', 'ø', 'ō', 'õ', 'à', 'á', 'â', 'ä', 'æ', 'ã', 'å', 'ā', 'ß', 'ś', 'š', 'ł', 'ž', 'ź', 'ż', 'ç', 'ć', 'č', 'ñ', 'ń', 'È', 'É', 'Ê', 'Ë', 'Ē', 'Ė', 'Ę', 'Ÿ', 'Û', 'Ü', 'Ù', 'Ú', 'Ū', 'Î', 'Ï', 'Í', 'Ī', 'Į', 'Ì', 'Ô', 'Ö', 'Ò', 'Ó', 'Œ', 'Ø', 'Ō', 'Õ', 'À', 'Á', 'Â', 'Ä', 'Æ', 'Ã', 'Å', 'Ā', 'Ś', 'Š', 'Ł', 'Ž', 'Ź', 'Ż', 'Ç', 'Ć', 'Č', 'Ñ', 'Ń', '‖', '‗'};
        }
        wholeShebang = makeWholeShebang();
    }
    public File getLanguage_Manipulation_UniqueWords_TrainerReservoir(){return new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt");}
    public char[] getAlphabet(){return alphabet;}
    public char[] getUpperCases(){return upperCases;}
    public char[] getLongAlphabet(){return longAlphabet;}
    public char[] getIgnorers(){return ignorers;}
    public char[] getWholeShebang(){return wholeShebang;}
    private Random random = new Random();
    public int[] IntegerArrayListToIntArray(ArrayList<Integer> a){
        int[] b = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            b[i]=a.get(i);
        }
        return b;
    }
    public String charArrayPrintFormat(char[] charArray){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < charArray.length-1; i++) {
            sb.append("'").append(charArray[i]).append("',");
        }
        sb.append("'").append(charArray[charArray.length-1]).append("'};");
        return sb.toString();
    }
    public char[] sortCharArrayByOccurrence(char[] charArray) throws FileNotFoundException {
        File reservoir = getLanguage_Manipulation_UniqueWords_TrainerReservoir();
        ArrayList<SortingAttribute>charIndicesAndOccurrences = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            System.err.println(i);
            int occurrences = 0;
            Scanner sc = new Scanner(reservoir);
            while (sc.hasNext()){
                String next = sc.next();
                for (int j = 0; j < next.length(); j++) {
                    char c = next.charAt(j);
                    if (charArray[i] == c){
                        occurrences++;
                    }
                }
            }
            if (occurrences > 0) {
                SortingAttribute charIndexAndOccurrences = new SortingAttribute(i, occurrences);
                charIndicesAndOccurrences.add(charIndexAndOccurrences);
            }
        }
        charIndicesAndOccurrences = SortingAttribute.MOST_TO_LEAST(charIndicesAndOccurrences);
        char[] rtn = new char[charIndicesAndOccurrences.size()];
        for (int i = 0; i < charIndicesAndOccurrences.size(); i++) {
            rtn[i]=charArray[charIndicesAndOccurrences.get(i).getIndex()];
        }
        return rtn;
    }
    public int countWordsInFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNext()){
            if (scanner.next() != null){
                count++;
            }
        }
        return count;
    }
    public String FileToString(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        StringBuilder b = new StringBuilder();
        while (scanner.hasNext()){
            String next = scanner.next();
            if (next != null){
                b.append(next);
                b.append(" ");
            }
        }
        return b.toString();
    }
    public ArrayList<SortingAttribute> goThroughIndicesOfWordsAndCountTheirOccurrences(String text, ArrayList<String> strings){
        ArrayList<SortingAttribute>rtn = new ArrayList<>();
        for (int a = 0; a < strings.size(); a++) {
            int occurrences = 0;
            Scanner sc = new Scanner(text);
            while (sc.hasNext()){
                String next = removeIgnorers(sc.next().toLowerCase(), new String[]{""});
                if (next.equalsIgnoreCase(strings.get(a))){
                    occurrences++;
                }
            }
            rtn.add(new SortingAttribute(a, occurrences));
        }
        return rtn;
    }
    /**
     * Awesome method thanks to Bart Kiers, on his Stack Overflow answer https://stackoverflow.com/questions/2297347/splitting-a-string-at-every-n-th-character
     * The regex is just this: str.split("(?<=\\G...)");
     * ... = every 3, .... = every 4, ..... = every 5, etc, so cool!
     *
     *
     * Also, Frodo has mentioned,
     *  "As an addition to Bart Kiers answer
     *      I want to add that it is possible instead of using the three dots ...
     *      in the regex expression which are representing three characters you can write .{3} which has the same meaning."
     *
     * @param string string
     * @param every split at every ___. That's what every is. Or you could think of it as "split into groups of" ___(fill in the blank).
     * @return a String[] split by string.split using the regex pattern with int every inserted
     */
    public String[] split(String string, int every){
        String regex = "(?<=\\G.{"+every+"})";
        String s = string;
        return s.split(regex);
    }

    public int findKeyLengthByIndexOfCoincidence(String string){
        String String = string;
        String = removeIgnorers(string, new String[]{""});
        String = String.toLowerCase();
        int maxGap = Math.min(string.length(), 20);
        ArrayList<Double> CoincidenceIndices = new ArrayList<>();
        for (int gap = 1; gap < maxGap; gap++) {
            int count = 0;
            int attempts = 0;
            for (int i = 0; gap*i < String.length(); i++) {
                int spot1 = gap*i;
                char a = String.charAt(spot1);
                for (int j = 1; spot1+gap*j < String.length(); j++) {
                    int spot2 = spot1+gap*j;
                    char b = String.charAt(spot2);
                    attempts++;
                    if (a == b){
                        count++;
                    }
                }
            }
            CoincidenceIndices.add((double)count/(double)attempts);
        }
        int best = f(CoincidenceIndices);
        ArrayList<Double> copy = CoincidenceIndices;
        copy.remove(best-1);
        int secondBest = f(copy);
        if (best%secondBest == 0){
            best = secondBest;
        }
        System.out.println(CoincidenceIndices);
        return best;
    }
    public int f(ArrayList<Double> ci){
        double leastDifference = 1;//highest possible value, so it will always change
        int best = 0;//therefore this also will always change so initial value is irrelevant.
        for (int i = 0; i < ci.size(); i++) {
            double difference = Math.abs(ci.get(i)-0.068);
            if (difference < leastDifference){
                leastDifference = difference;
                best = i+1;
            }
        }
        return best;
    }
    public double indexOfCoincidenceIn(String string){
        String String = string;
        String = removeIgnorers(string, new String[]{""});
        double tests = 10000000;
        double successes = 0;
        for (int i = 0; i < tests; i++) {
            int randomIndex1 = random.nextInt(String.length());
            String c = String.valueOf(String.charAt(randomIndex1)).toLowerCase();
            int randomIndex2 = random.nextInt(String.length());
            String d = String.valueOf(String.charAt(randomIndex2)).toLowerCase();
            if (c.equals(d)){
                successes++;
            }
        }
        return successes / tests;
    }
    public String inheritPuncuationAndForm(String child, String parent){
        ArrayList<String> Child = StringToStringArrayList(charToStringArray(child.toCharArray()));
        ArrayList<String> Parent = StringToStringArrayList(charToStringArray(parent.toCharArray()));
        ArrayList<String> modChild = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < Child.size(); i++) {
            boolean b;
            boolean b1;
            boolean b2;
            boolean b3;
            boolean b4;
            boolean b5;
            boolean b6;
            boolean b7;
            boolean b8;
            boolean b9;
            boolean b10;
            boolean b11;
            boolean b12;
            boolean b13;
            boolean b14;
            boolean b15;
            boolean b16;
            boolean b17;
            boolean b18;
            boolean b19;
            boolean b20;
            boolean b21;
            boolean b22;
            boolean b23;
            boolean b24;
            boolean b25;
            boolean b26;
            boolean b27;
            boolean b28;
            boolean b29;

            if (i+c < Parent.size()) {
                b = isIgnorer(Parent.get(i + c).charAt(0));
                if (b) {
                    modChild.add(Parent.get(i + c));
                    if (i+c+1 < Parent.size()) {
                        b1 = isIgnorer(Parent.get(i + c + 1).charAt(0));
                        if (b1) {
                            modChild.add(Parent.get(i + c + 1));

                            if (i + c + 2 < Parent.size()) {
                                b2 = isIgnorer(Parent.get(i + c + 2).charAt(0));
                                if (b2) {
                                    modChild.add(Parent.get(i + c + 2));

                                    if (i + c + 3 < Parent.size()) {
                                        b3 = isIgnorer(Parent.get(i + c + 3).charAt(0));
                                        if (b3) {
                                            modChild.add(Parent.get(i + c + 3));

                                            if (i+c+4 < Parent.size()) {
                                                b4 = isIgnorer(Parent.get(i + c + 4).charAt(0));
                                                if (b4) {
                                                    modChild.add(Parent.get(i + c + 4));

                                                    if (i + c + 5 < Parent.size()) {
                                                        b5 = isIgnorer(Parent.get(i + c + 5).charAt(0));
                                                        if (b5) {
                                                            modChild.add(Parent.get(i + c + 5));

                                                            if (i + c + 6 < Parent.size()) {
                                                                b6 = isIgnorer(Parent.get(i + c + 6).charAt(0));
                                                                if (b6) {
                                                                    modChild.add(Parent.get(i + c + 6));

                                                                    if (i+c+7 < Parent.size()) {
                                                                        b7 = isIgnorer(Parent.get(i + c + 7).charAt(0));
                                                                        if (b7) {
                                                                            modChild.add(Parent.get(i + c + 7));

                                                                            if (i + c + 8 < Parent.size()) {
                                                                                b8 = isIgnorer(Parent.get(i + c + 8).charAt(0));
                                                                                if (b8) {
                                                                                    modChild.add(Parent.get(i + c + 8));

                                                                                    if (i + c + 9 < Parent.size()) {
                                                                                        b9 = isIgnorer(Parent.get(i + c + 9).charAt(0));
                                                                                        if (b9) {
                                                                                            modChild.add(Parent.get(i + c + 9));

                                                                                            if (i+c+10 < Parent.size()) {
                                                                                                b10 = isIgnorer(Parent.get(i + c + 10).charAt(0));
                                                                                                if (b10) {
                                                                                                    modChild.add(Parent.get(i + c + 10));

                                                                                                    if (i + c + 11 < Parent.size()) {
                                                                                                        b11 = isIgnorer(Parent.get(i + c + 11).charAt(0));
                                                                                                        if (b11) {
                                                                                                            modChild.add(Parent.get(i + c + 11));

                                                                                                            if (i + c + 12 < Parent.size()) {
                                                                                                                b12 = isIgnorer(Parent.get(i + c + 12).charAt(0));
                                                                                                                if (b12) {
                                                                                                                    modChild.add(Parent.get(i + c + 12));

                                                                                                                    if (i+c+13 < Parent.size()) {
                                                                                                                        b13 = isIgnorer(Parent.get(i + c + 13).charAt(0));
                                                                                                                        if (b13) {
                                                                                                                            modChild.add(Parent.get(i + c + 13));

                                                                                                                            if (i + c + 14 < Parent.size()) {
                                                                                                                                b14 = isIgnorer(Parent.get(i + c + 14).charAt(0));
                                                                                                                                if (b14) {
                                                                                                                                    modChild.add(Parent.get(i + c + 14));

                                                                                                                                    if (i + c + 15 < Parent.size()) {
                                                                                                                                        b15 = isIgnorer(Parent.get(i + c + 15).charAt(0));
                                                                                                                                        if (b15) {
                                                                                                                                            modChild.add(Parent.get(i + c + 15));

                                                                                                                                            if (i+c+16 < Parent.size()) {
                                                                                                                                                b16 = isIgnorer(Parent.get(i + c + 16).charAt(0));
                                                                                                                                                if (b16) {
                                                                                                                                                    modChild.add(Parent.get(i + c + 16));

                                                                                                                                                    if (i + c + 17 < Parent.size()) {
                                                                                                                                                        b17 = isIgnorer(Parent.get(i + c + 17).charAt(0));
                                                                                                                                                        if (b17) {
                                                                                                                                                            modChild.add(Parent.get(i + c + 17));

                                                                                                                                                            if (i + c + 18 < Parent.size()) {
                                                                                                                                                                b18 = isIgnorer(Parent.get(i + c + 18).charAt(0));
                                                                                                                                                                if (b18) {
                                                                                                                                                                    modChild.add(Parent.get(i + c + 18));

                                                                                                                                                                    if (i + c + 19 < Parent.size()) {
                                                                                                                                                                        b19 = isIgnorer(Parent.get(i + c + 19).charAt(0));
                                                                                                                                                                        if (b19) {
                                                                                                                                                                            modChild.add(Parent.get(i + c + 19));

                                                                                                                                                                            if (i+c+20 < Parent.size()) {
                                                                                                                                                                                b20 = isIgnorer(Parent.get(i + c + 20).charAt(0));
                                                                                                                                                                                if (b20) {
                                                                                                                                                                                    modChild.add(Parent.get(i + c + 20));

                                                                                                                                                                                    if (i + c + 21 < Parent.size()) {
                                                                                                                                                                                        b21 = isIgnorer(Parent.get(i + c + 21).charAt(0));
                                                                                                                                                                                        if (b21) {
                                                                                                                                                                                            modChild.add(Parent.get(i + c + 21));

                                                                                                                                                                                            if (i + c + 22 < Parent.size()) {
                                                                                                                                                                                                b22 = isIgnorer(Parent.get(i + c + 22).charAt(0));
                                                                                                                                                                                                if (b22) {
                                                                                                                                                                                                    modChild.add(Parent.get(i + c + 22));

                                                                                                                                                                                                    if (i+c+23 < Parent.size()) {
                                                                                                                                                                                                        b23 = isIgnorer(Parent.get(i + c + 23).charAt(0));
                                                                                                                                                                                                        if (b23) {
                                                                                                                                                                                                            modChild.add(Parent.get(i + c + 23));

                                                                                                                                                                                                            if (i + c + 24 < Parent.size()) {
                                                                                                                                                                                                                b24 = isIgnorer(Parent.get(i + c + 24).charAt(0));
                                                                                                                                                                                                                if (b24) {
                                                                                                                                                                                                                    modChild.add(Parent.get(i + c + 24));

                                                                                                                                                                                                                    if (i + c + 25 < Parent.size()) {
                                                                                                                                                                                                                        b25 = isIgnorer(Parent.get(i + c + 25).charAt(0));
                                                                                                                                                                                                                        if (b25) {
                                                                                                                                                                                                                            modChild.add(Parent.get(i + c + 25));

                                                                                                                                                                                                                            if (i+c+26 < Parent.size()) {
                                                                                                                                                                                                                                b26 = isIgnorer(Parent.get(i + c + 26).charAt(0));
                                                                                                                                                                                                                                if (b26) {
                                                                                                                                                                                                                                    modChild.add(Parent.get(i + c + 26));

                                                                                                                                                                                                                                    if (i + c + 27 < Parent.size()) {
                                                                                                                                                                                                                                        b27 = isIgnorer(Parent.get(i + c + 27).charAt(0));
                                                                                                                                                                                                                                        if (b27) {
                                                                                                                                                                                                                                            modChild.add(Parent.get(i + c + 27));

                                                                                                                                                                                                                                            if (i + c + 28 < Parent.size()) {
                                                                                                                                                                                                                                                b28 = isIgnorer(Parent.get(i + c + 28).charAt(0));
                                                                                                                                                                                                                                                if (b28) {
                                                                                                                                                                                                                                                    modChild.add(Parent.get(i + c + 28));

                                                                                                                                                                                                                                                    if (i + c + 29 < Parent.size()) {
                                                                                                                                                                                                                                                        b29 = isIgnorer(Parent.get(i + c + 29).charAt(0));
                                                                                                                                                                                                                                                        if (b29) {
                                                                                                                                                                                                                                                            modChild.add(Parent.get(i + c + 29));
                                                                                                                                                                                                                                                            c++;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    c++;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            c++;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    c++;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            c++;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    c++;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            c++;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    c++;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            c++;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    c++;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            c++;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    c++;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            c++;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    c++;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            c++;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    c++;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            c++;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    c++;
                                                                                                                }
                                                                                                            }
                                                                                                            c++;
                                                                                                        }
                                                                                                    }
                                                                                                    c++;
                                                                                                }
                                                                                            }
                                                                                            c++;
                                                                                        }
                                                                                    }
                                                                                    c++;
                                                                                }
                                                                            }
                                                                            c++;
                                                                        }
                                                                    }
                                                                    c++;
                                                                }
                                                            }
                                                            c++;
                                                        }
                                                    }
                                                    c++;
                                                }
                                            }
                                            c++;
                                        }
                                    }
                                    c++;
                                }
                            }
                            c++;
                        }
                    }
                    c++;
                }
            }
            modChild.add(Child.get(i));
        }
        for (int i = 0; i < modChild.size(); i++) {
            String letter = modChild.get(i);
            boolean isCapital = isCapital(Parent.get(i));
            if (isCapital){
                letter = letter.toUpperCase();
            }
            if (!isCapital){
                letter = letter.toLowerCase();
            }
            modChild.set(i, letter);
        }
        StringBuilder d = new StringBuilder();
        for (String s : modChild) {
            d.append(s);
        }
        return d.toString();
    }
    public boolean isCapital(String s){
        return !s.toLowerCase().equals(s);
    }
    public boolean isIgnorer(char c){
        boolean rtn = false;
        for (char ignorer : ignorers) {
            if (c == ignorer) {
                rtn = true;
                break;
            }
        }
        return rtn;
    }
    public int spotOf(char letter) throws IllegalArgumentException {
        int spot = 100;
        String l = String.valueOf(letter).toLowerCase();
        for (int i = 0; i < alphabet.length; i++) {
            char c = alphabet[i];
            if (String.valueOf(c).equals(l)) {
                spot = i;
                break;
            }
        }
        if (spot == 100){
            throw new IllegalArgumentException("the method spotOf(char) in CharSet has taken the char '"+letter+"' which is not in the 26 letter alphabet, neither lower nor upper.\n" +
                                               "the method spotOf(char) has been intentionally coded to throw this IllegalArgumentException, because:\n" +
                                               "            - if the char is not in the alphabet, the return value would be null, but it must be initialized. \n" +
                                               "			-the problem with that is, is that there can be no \"neutral\" initial value. 0 is a, all the rest up to 25\n" +
                                               "			(inclusive) are the rest of the letters, and anything above is out of range.\n" +
                                               "			-the problem with that is, if the initial value were to be set to an in-range number, if you pass a\n" +
                                               "			non-alphabetic char, say, ∑, into the method, it would simply return the initial char value, \n" +
                                               "			misleading you into thinking ∑ is at that spot in the alphabet. \n" +
                                               "			-if it were negative, it would certainly cause many IndexOutOfBoundsExceptions.\n" +
                                               "			-if it were >26, it would cause IndexOutOfBoundsExceptions whenever dealing with anything\n" +
                                               "			with a length <=26. \n" +
                                               "			Therefore, the return value can neither be initialized as null, nor negative, nor greater than 25. \n" +
                                               "			These would respectively cause certain NullPointerExceptions, certain IndexOutOfBoundsExceptions,\n" +
                                               "			and more potential IndexOutOfBoundsExceptions.\n" +
                                               "			The point is, is that this is the root cause of those exceptions, thus, you should go immediately to the \n" +
                                               "			root, and read this message, which is helpful, because the author knows that this specific exception\n" +
                                               "			may occur for these specific reasons. \n" +
                                               "I hope this assists you in your code-tracing.\n");
        }
        return spot;
    }
    public String inheritForm(String child, String parent){
        ArrayList<String> Child = StringToStringArrayList(charToStringArray(child.toCharArray()));
        ArrayList<String> Parent = StringToStringArrayList(charToStringArray(parent.toCharArray()));
        ArrayList<String> modChild = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < Child.size(); i++) {
            if (i+c < Parent.size()) {
                boolean b = Parent.get(i + c).equalsIgnoreCase(" ") || Parent.get(i + c).equals("\s");
                if (b) {
                    modChild.add(" ");
                    c++;
                }
            }
            if (!Child.get(i).equals(" ")) {
                modChild.add(Child.get(i));
            }
        }
        StringBuilder d = new StringBuilder();
        for (String s : modChild) {
            d.append(s);
        }
        return d.toString();
    }
    public String alternatingCase(String s, boolean startCapitalized){
        StringBuilder a = new StringBuilder();
        for (int b = 0; b < s.length(); b++) {
            boolean c = nowCapitalize(b, startCapitalized);
            a.append(changeCapitalization(String.valueOf(s.charAt(b)), c));
        }
        return a.toString();
    }
    public String changeCapitalization(String a, boolean capitalize){
        return morph(a, capitalize, false, false);
    }
    public String morph(String a, boolean capitalize, boolean alternating, boolean Alternating_StartCapitalized){
        String b = a.toUpperCase();
        if (!capitalize){
            b = a.toLowerCase();
        }
        if (alternating){
            b = alternatingCase(a, Alternating_StartCapitalized);
        }
        return b;
    }
    public boolean nowCapitalize(int b, boolean startCapitalized){
        boolean d = b % 2 == 0;
        if (!startCapitalized){
            d = !d;
        }
        return d;
    }
    public char[] morphCaseACharArray(char[] a, boolean capitalize, boolean alternating, boolean Alternating_StartCapitalized){
        String[] b = new String[a.length];
        StringBuilder c = new StringBuilder();
        for (char z : a) {
            String e = String.valueOf(z);
            String f = morph(e, capitalize, alternating, Alternating_StartCapitalized);
            c.append(f);
        }
        String g = c.toString();
        char[] h = g.toCharArray();
        return h;
    }
    public String RemoveIgnorers(String string){
        for (char ignorer: ignorers) {
            string = string.replace(String.valueOf(ignorer), "");
        }
        return string;
    }
    public String removeIgnorers(String string, String[] exceptions){
        boolean empty = exceptions[0].equals("");
        if (empty){
            for (char ignorer: ignorers) {
                string = string.replace(String.valueOf(ignorer), "");
            }
        }
        if (!empty) {
            for (char ignorer: ignorers) {
                String sIgnorer = String.valueOf(ignorer);
                boolean isException = false;
                for (String exception : exceptions) {
                    if (sIgnorer.equals(exception)) {
                        isException = true;
                        break;
                    }
                }
                if (!isException) {
                    string = string.replace(sIgnorer, "");
                }
            }
        }
        return string;
    }
    public String[] charToStringArray(char[] charArray){
        String[] stringArray = new String[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            stringArray[i]=String.valueOf(charArray[i]);
        }
        return stringArray;
    }
    public String[] StringArrayListToStringArray(ArrayList<String> arrayList){
        String[] rtn = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            rtn[i] = arrayList.get(i);
        }
        return rtn;
    }
    public ArrayList<String>StringToStringArrayList(String[] stringArray){
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++) {
            stringArrayList.add("");
        }
        for (int i = 0; i < stringArray.length; i++) {
            stringArrayList.set(i, stringArray[i]);
        }
        return stringArrayList;
    }

    public ArrayList<String>inversionOf(ArrayList<String> a_plus_b, ArrayList<String>a){
        ArrayList<String>b = a_plus_b;
        for (int c = 0; c < b.size(); c++) {
            for (String d : a) {
                if (b.get(c).equals(d)) {
                    b.remove(c);
                }
            }
        }
        return b;
    }
    public ArrayList<Character>charToCharArrayList(char[] charArray){
            ArrayList<Character> charArrayList = new ArrayList<>();
                for (int i = 0; i < charArray.length; i++) {
                    charArrayList.add('\0');
                }
                for (int i = 0; i < charArray.length; i++) {
                    charArrayList.set(i, (char)charArray[i]);
                }
        return charArrayList;

    }
    public char[] StringToCharArray(String[] a){
        char[] b = new char[a.length];
        String[] c = charToStringArray(wholeShebang);
        for (int d = 0; d < a.length; d++) {
            for (int e = 0; e < c.length; e++) {
                if (a[d] != null) {
                    if (a[d].equals(c[e])) {
                        b[d] = wholeShebang[e];
                    }
                }
            }
        }
        return b;
    }
    private char[] makeWholeShebang(){
        return CharArrayListToCharArray(mergeFromCharArrays(new char[][]{alphabet, upperCases, ignorers}));
    }
    public char[] CharArrayListToCharArray(ArrayList<Character> a){
        char[] b = new char[a.size()];
        for (int c = 0; c < a.size(); c++) {
            b[c]=a.get(c);
        }
        return b;
    }
    public ArrayList<Character>mergeFromCharArrays(char[][] b){
        ArrayList<Character> a = new ArrayList<>();
        for (char[] c: b) {
            for (char d: c) {
                a.add(d);
            }
        }
        return a;
    }

    public boolean containsAtLeastNOf(String string, int contains, String[] ofStrings) {
        int n = 0;
        for (String s : ofStrings) {
            if (string.contains(s)) {
                n++;
            }
            if (n >= contains) {
                return true;
            }
        }
        return false;
    }

}
