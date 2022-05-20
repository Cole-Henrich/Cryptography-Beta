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
//        double Fl = charSet.countWordsInFile(new File("src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"));
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
    public static final double EngMinValidityFactor = 0.8;
    //TotalWordsNumberAtWhichDictionaryAttackDecidesWhetherToFullyDecryptOrIgnoreTranslation
    public static final int dicAttackTolerance = 20;
    public static final double EIOC = 0.0667;
    public String[] getEmojis() {return emojis;}
    public String[] getHandEmojis() {return handEmojis;}
    public String[] getFoodEmojis() {return foodEmojis;}
    public String[] getAnimalEmojis() {return animalEmojis;}
    public String[] getPolysymbolic() {return Polysymbolic;}
    public String[] getGreek() {return Greek;}
    math mathematics = new math();
    public ArrayList<String> ArrayList_a_to_ArrayList_String (ArrayList<a> a_s){
        ArrayList<String> rtn = new ArrayList<>();
        for (a _a:a_s){rtn.add(_a.getWord());}
        return rtn;
    }
    public int calculateLengthViaKasiski(String CIPHER){
        int[] kasiski = KasiskiAnalysis(CIPHER);
        int likelyLength = kasiski[0];
        if (likelyLength == 1){
            likelyLength = kasiski[1];
        }
        if (likelyLength == 2){
            likelyLength = kasiski[2];
        }
        return likelyLength;
    }
    public int[] KasiskiAnalysis(String CIPHER){
        int[] likelyLengths = new int[8];
        int[] likelihoods = new int[likelyLengths.length];
        String str = CIPHER;
        str = removeIgnorers(str, new String[]{""});
        for (int n = likelyLengths.length; n > 1; n--) {
            ArrayList<SortingAttribute> ranks = new ArrayList<>();
            ArrayList<Integer> gaps = new ArrayList<>();
            String[] strs = split(str, n);
//            System.out.println(Arrays.toString(strs));
            for (int i = 0; i < strs.length; i++) {
                for (int j = 0; j < strs.length; j++) {
                    if (i != j) {
                        if (strs[i].equalsIgnoreCase(strs[j])) {
                            int gap = Math.abs(i - j);
                            gaps.add(gap);
                        }
                    }
                }
            }
            for (int possibleLength = 1; possibleLength < likelyLengths.length; possibleLength++) {
                for (int gap : gaps) {
                    if (gap % possibleLength == 0) {
                        likelyLengths[possibleLength]++;
                    }
                }
            }
//            System.out.println(Arrays.toString(likelyLengths));
            for (int i = 0; i < likelyLengths.length; i++) {
                if (likelyLengths[i] != 0) {
                    SortingAttribute rank = new SortingAttribute(i, likelyLengths[i]);
                    ranks.add(rank);
                }
            }
            ranks = SortingAttribute.MOST_TO_LEAST(ranks);
            for (int i = 0; i < ranks.size(); i++) {
                ranks.get(i).setRank(i);
            }
//            System.out.println("println_Int \n" + SortingAttribute.println_Int(ranks));
            for (int i = 0; i < ranks.size(); i++) {
                SortingAttribute s = ranks.get(i);
                int scaledScore = ranks.size()-s.getRank();
                int value = s.getIndex();
                likelihoods[value]+=scaledScore;
            }
        }
//        System.out.println("likelihoods: "+Arrays.toString(likelihoods));
        int[] rankedLikelyKeyLengths = new int[likelyLengths.length];
        ArrayList<SortingAttribute> RankedLikelyKeyLengths = new ArrayList<>();
        for (int i = 0; i < likelihoods.length; i++) {
            RankedLikelyKeyLengths.add(new SortingAttribute(i, likelihoods[i]));
        }
        RankedLikelyKeyLengths = SortingAttribute.MOST_TO_LEAST(RankedLikelyKeyLengths);
//        System.out.println(SortingAttribute.println_Int(RankedLikelyKeyLengths));
        for (int i = 0; i < RankedLikelyKeyLengths.size(); i++) {
            rankedLikelyKeyLengths[i]=RankedLikelyKeyLengths.get(i).getIndex();
        }
//        System.out.println(Arrays.toString(rankedLikelyKeyLengths));
        return rankedLikelyKeyLengths;
    }
    public HashMap countFrequencyIn(ArrayList<String> r) {
        System.err.println("CharSet.countFrequencyIn");
        HashMap<String,Integer> words=new HashMap<String, Integer>();
        for (String word : r) {
            Integer count = words.get(word);
            if (count != null) {
                count++;
            } else {
                count = 1;
            }
            words.put(word, count);
        }
            return words;
    }
//        ArrayList<String> reservoir = new ArrayList<>();
//        if (!useCase){for (String s:r){reservoir.add(s.toLowerCase());}}
//        else {reservoir = r;}
//        HashMap<String, Integer> wordsAndFrequencies = new HashMap<>();
//        for (int i = 0; i < reservoir.size(); i++) {
//            System.out.println(i);
//            String s = reservoir.get(i);
//            if (!wordsAndFrequencies.containsKey(s)){
//                wordsAndFrequencies.put(s, 1);
//            }
//            else {
//                wordsAndFrequencies.put(s, wordsAndFrequencies.get(s)+1);
//            }
//        }
//        return wordsAndFrequencies;
//    }
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
            '{', '}','\\','|', '\"', '"'};
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
                new File("src/sample/American-Dream-7_4_1965_Mistaken.txt"),
                new File("src/sample/American-Dream-7_4_1965_Corrected.txt")
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
        /**From the Parable of the Talents*/
        public CifrarioVigenere getVigenere0(){
            return new CifrarioVigenere("""
                    IRZPBZNE
                    Qvbf XACXULXEO: XUX UOZOF HY TSI YBOIYK

                    Or Eafvrg Hyl Sytfiye

                    Uxke hi nkx—

                    Eyiezr,

                    Mlwf,

                    Ebfp,

                    Wutiiyk ybye,

                    Xmaw,

                    Lhltvgz Mtrq,

                    Zhd,

                    Dlnibnr Kbw.

                    Voywvwxr—

                    Hi nkx bzva

                    Ght hmga iuctblx,

                    Bfx jbmh asgxgttey.

                    MAEJ’PY FTKP E THW oq lrk.

                    B tsmad mhlx jhnlo tyxtsp lrk, bf dlr vhuwh xghw lfbnm ie. Ma liiei by tlw lrk irzxrlms lrq wxnteyl, lhp’w nepajw axxdph qxooeiq, hueomrgm fzpyhpecw—qblcttyxl—wss jhnlo pvlmey xb axr lrq uxltiix xvpvlmaiyk fax tzpq maex. Eaw lhp rrxweo pnkze pzrgms es ztgiayytme. Lpy zhdd wrxf tz rrxw tsifx mhtrtl.

                    Aec prztl yezx pad Pnnkey Slt Hllqvgt Blrxhee. Es gahsp auh eogiq axr zv utmeo lrk, lhp anl lixtyr “Hllqvgt.”

                    Ssi jtl mj fvheormpte mzxuxk.

                    Ssi vl welh.

                    V atvp angmeo xb ehvp lrk tno xb uxltiix mhlx jatt secixnph oxmwpia axr lrq fx wlwa’m aec jnnet. T’zr ptneiq maae. Fhm bndxrtw, I’gi utmeo lrk, yelvrw aec, rrxweo lrk. B’vp rroxr evhlmeo lrk, mhzyta, gegie ngdpvfmhoo lbp lhp gbned mi gax wlc fax wlw—fh yonyfxw, ayh lxm sz qvlzuthrw, mhpvr yhr lpy mae hseew, bfx axoec xuxke qse fx. I dxvee dzr’g ngdpvfmtno. Eaw goh xutm ssi’f wxao, M’z ght pzrg luci V xoec avee. Bfx V fnse xer uenehlx I yirw mo frqxkseeaw fydiyy, tno wux bs aeem hf xi. V pbss xutm ssi jxkey’x, onm ssi vl. Bn zvqxk fzv zx mo frqxkseeaw phz M nf, B mfwg uxgtr gh nnoielmayh jah ssi jtl. Tseg bl mj vrtloy jbk prtxvgz ayh nllexfybgg elvl uozo.

                    Vm aad eyptyd frxg mj anr mo dsem mhcshza mj jrxeiykf ur wcmgbgg. Dlr tgd T lnw mhlx vg voxqbg. Tno eyhgg hmga mhp rrxw tz aebme, dlr tesz hroxlztrw t npiq mh dcej. By ssi utw bpia uhry ma t layie mbmp, wux firlg atvp frvhmp e jkbtpv nl B hlzr hk ay eembse.

                    M’ix zaelrkxd l jrp hf sie wkahmazl, awxuhngs wux zagi zhlt zj gaxsp ejtr dfvvgz hpv ybyeemzx. Tno M utoe nscbxs zj nee tseg pts deixw oq lrk prtxvgzs. Pzrg loxi by aec inkey, aecxk nzxruhovw utoe mirg voamrw mo omfd hr nvllmaw eaw lagiq. Lae seq t aammg, wnrtrt axr jshma, oq lvwbnr gnvaed ss yhoo, qbgxy, lrq pxaasakr iy shm-hf-elr-pty apnvxs zv jbmh evhlmeo trhilp, eaw uetrt tulp xb zh sevnbzhe fnvd tz xuxle jinkl llxrk. Mhpwr ltvph uxk ltjr lxvpvne mixif, tgd lpfh mhpc ftoeo lrk pochf, axr ushkgaww ngw nzxrl tno ql yttsie’l prtxvgzs. Dlr ftnlkrw mo meqzxr smz bgtz aebmiyk n ebtepr. Ax wcsgx pewp, nemhzyta ae omqg’m ltor whiyk vm. B’m rpnw lhp fnwzeciq abm. T’q tetd es utoe vrbpg htq nm eelwg marzyta aid aebmiyk. V phnoie pay T’q ahm gweq mh hlzr dgohr uxk tsvbnzh siel.

                    “Zoo mf Vaaykr,” fr mzxuxk bppvxoeo. Xutm wlw jatt dlr ltio ma mae qmelm oq lrk oecwrl bn Peemaspiq: Mae Qmelm Bzsx hy tsi Yboiyk.

                    Nee tseg rhu eshva

                    Yzy Patnri.

                    Nee tseg rhu Nlngze

                    Nlngzed cbn.

                    Mhp saer llwgbgg evhma

                    Id Gutggp.

                    Kbw

                    Bs Nlngze.

                    Elr phrow nkx hlvzexsd, M fnipzwr, tgd xigtihzvvvtlwc gkne. Lx yxtse wux uerea pbts wbfx saipbxs zj gknts. Eaw goh wux’l tzypaxd xi bgx llwg mbmp avma hpv zxfocmrl, aec pvyx, ayh uxk dlqaxw Elvgaleph.

                    BGX
                    Fcsz XTRELFXXD: ELR UHOVW BY MHP PVOBNR

                    Hnkdnpwf

                    Zbvpw fatpp xb mae wmtam

                    Ad pvzat

                    Dlnixs elr wtrvrrll.

                    Dpega

                    Zigif laaai gh eiqi

                    Nl eiqi

                    Fatppw qxtts.

                    Xux nntzrkle

                    Lrq Zhd

                    Dlnkx tsmf paowiaxls,

                    Pepa

                    Weqmabgg elr hmhpv.

                    Thw

                    Gtzrl lhltr mh tsi hgbvpvfx

                    Ts elr ngigielx

                    Ssecxl Gzh.

                    SKHM Xizhkipw by Htsie Phrwhf

                    UR TLCYHK FCEADEIY FNGDOWI

                    V ATVP VRTW TSEG mae aiebhd zj hiaelzne mhlx whnryeybltd lnox bpkhg mo cisxk tz ef “mae Ltbvtljtfx” hr xsex voxqbgey, xsex uiexrkey, “elr Ihx” wefmxd qvbf 2015 mhcshza 2030—a oiptwe lrq t aawj by vhlsf. Maid mf ngtcyr. Mae Ask ats mirg t mfgu ehnrie mhrxiam. Bt mittg wppy uxfzvr 2015, ixrsecl xvpr oxyoci gax tfva hy tsi zbelprabnm. Tx utl nzx rgweo.

                    M utoe lpfh kelh gatt elr Ihx hef vtudiq ur angvwxneeyer czmavbdtrt veixegbv, ensahfin, eaw lonmbehgtgne vrtwrl. Bt hshew bp qbkx hzrrlm tz wnr mhlx gax Pzb jtl clyfxw bj shk hwy vrynslp gh welp jbmh zfibhud tehulpqf bg tssfx trpef. Px clyfxw tsi ckhbwizl: mhpr jx lae eaw paeguxw ad xuxr gcij bgtz gebled. M utoe sinkw ppscex dprl maid, fhm B wlw ohkn tr 1970. V atvp wrxg eyshza tz oahp tseg bm id xenx. I seix paeguxw eoyptmizr oxvoxi zhke l teboiwitx hf elr kbcs xutg tsi otlin rrvxsdmgr mhlx vm fudx ox bf nmibeikiq lhctigr bs es fnkvtzr. B aagi jtmcsiq tl czrixgiprpx, irzjvm, tno maxktte rqvudiq zkelxrk tno qbkx dlrtxkofw rgoicsafxneey wxgceqtmizr. V atvp anmvhph choecxl, annrie, tgd omfxtsp frvhmp maxoieeoex fzv zhke lrq fhrp trhilp.

                    Sixkawp, gax Pzb utl hlh gax eqjrvm oq ea bgseeyefeyx-cetn Hseew Wlv VBB. Iy jnvm, tsiex peci fxoecey lfawp, oehooc fahoemaz pacw thbnr sa tkofrq mae hseew dfvvgz tsi Chq. Tsifx peci fmnpth nyyatvf—ptseif hy ltjr tgd evrtluci. Gaxy hiex yofkum, hseialbbwc, gh weqiaw tglmalm vtgvhns qsexbgy iaxfipw. Nee tzs bymey, xuxr wpvr tvtfeyer fzytam bpgnnle trnwxqfegx eelhrkl dth ahm kysj paae iylx tz hb. Lncs prtwecw xgxw elnm mhpc phnlo hrixno sa yxac, whliinmbg, aaevrw, geph, ngw gcirw mo lvbnle aegkboemp lnpasem yoc ank.

                    Tmth nee tsmf, lhmplbp, mhp Yabmeo Wgtmed ss Tfecmpt luqjrkxd l qnchr ysafbltxnkr dpjrtm. Ie pblm nz mzihreeam pac, crm bt omq ght dyeobvp xux Ioi. Trkaaaw vm lixtyr eodx fbzhe ss paae mg hgcp mamxnoiq mh bp, xuxg bwyawxrph nbflpwfer uyxve bt pbutnseiq bmspps.

                    Paae mf exfe ss bm nza, jatt tx utl bpgbfx, I os ahm kysj.

                    Mtywse Ykayoybg Blrxhee hef fr flxuxk. Fcsz abs hvvmbnrw, ux lepqf mh hlzr uxey e gahurlgynl, dszxphlx shkmlp ztg wss jhnno yc pbts ql lmrlrtx, ltffohkn xsgaxr pzrg mhzyta lhp anl tlxsfm rofrt xgofku mh bp lvl zrlrqwturlgxk.

                    Mj qbmaec wrxfs es utoe wsixw htq, fxxmd xb atvp frxg hltcr piel ubf. Hp eaw fy xsgaxr xig wnrtrt mae Ask paey xuxr wpvr uhts lbfxlpwf ptnoiexks. Myg ax wlw n 57-rxac-syw wonxbk—t flqver pcepmbcp turlinmng—tno wux pad ea 18-rxac-syw zicp. Gax Pzb ttoe elrf mecvvuee xizhkipw vg voxqbg. Uoel utw spia maetv axbgsfbkaozhf wxsevbrxd—smf bg Slr Qbxgz eaw aecw vg Komprwh, a dyonkb zj Yhl Aykrexs. Elnm lepqf mh hlzr uxey iahngs jbk mhpq. Vg 2027, mhpc zxm, ltorw xanl bmaec, eaw zoe qnkkiph. V maiyo, extdtrt uxthirg mhp pvgxs zj fhfe zj zr yaelrk’l wcmgbgg, elnm ae heamxd es gtde neex hf elvl ltceazx yzyaz zicp gatt si utw fzyaw. Ae heamxd es xxxp sie ltfp jehf tsi patod ss mae emzx, laqi skhm elr ztnrw, qkngd, wytoecc, ngw dtwrtle. Lrq hy czyelx hp anl yllxgxkeo xutm ssi jtgtph ubf. Hp anl auxea, tgd ys qhnbe xvkxd zj oxbnr eyhge. Smf ybrdx jbye seq uxey hrtw fzv nuhue xjh relvf paey xuxr mpx.

                    Ux vofpqg’m kpic fr mzxuxk sljr hy czyelx. Nz sax vofpq atvp hbgx tseg. Lae seq vaodia axr aega eoyk oxyoci gaxy xig. Abs xmfmtkp anl bn dirbgg sie tl a jshgz gtvy. Lae hef terpeqr t mtwfbee, lvzxw ayh gtkgpxrw.

                    YRZQ Gax Jzyegtld ss Etucia Hra Zpnfbnl

                    WHGWAJ, WRIMEXFRK 26, 2032

                    Mooel bl Acvvotl Oel, mae qmsma ayrvoxrdeer hf zye xltlfyblhtrt t voxqhgbtj gneeeo Ephkn siex bn elr fhuyxnbgs zj Unfbzpqm Vofrgr.

                    Bn aieoxrdi pxeemvnmboy ss maid, M’ix cudx utw oyi by fy cipnkrtrt gbgsxztked. Xuxr’vp frvhmp vnkx iy xux iadx sxp ypeel—hlo iaxfipw jbmh qezbeilv atltj lnubtd. M xghw elrf. Mhpc utoe dypa loqx, rtly mitbgntrtl.… Mhtw bgx wlw, nm yicwg, t oidmg mh tsi ctlt, l xebi hzqr, t vhlrpx mo dtrgw ttqr pbts frehvph tahsew.

                    Zr hlo lbfx hlw phfe mepd yrzq gax adlrl. Mhtw qhxsy’x fnkpcmfx fe, dszxaoh, eymaofku B lah mg unry crtks lkb. B paworw mhcshza tsi enubwi gatt hef exfe ss bm. Ypx uxke tx vl kedxbkxd lrq yblwiq pbts trhilp—eye mhp trhilp M xgxw lw V pts rvbpbnr yc. Maej wvm bn zye ykoyx ehhmd ma khwd ss hed xigte fzpqbgg nlnbks, hsbwxn vmgvaey eaw wiymaz kozq paticw, ngw pwefmbc dxnvdiyk paticw, n lblprg vhnrvrztttsa hy tsi fvtteiexw ayh gax dpeq.

                    Vaucgu lxrgmpx bs lpextdj kbbgg zr, ngw, oq gbnksp, ql yttsie bl pcinvaiyk. Ux eozof tl hp eyptyd lnl bn smf vaucgu khbpw: gtel, mvbtw, seieg, ltcevzat—l kextt mpnvd wlpy hy a xea pbts e ihbcp cbn goe saer hpee, unt qire hn jshk lktr ngw iy cbnk bzrrl. Mhpvr’l go nsegxr zj gax mpigbgg csbfl tseg fr flxuxk clrahm rpepa piel gatt gsvvx. Wp’zr gxvpv utw a dshgw sjwgxf—npzrk gephrw hnp. M uxtr lrq yxew xutm vzmpx tglma.

                    Rxt ssj ftnj crtks sef bm bpia lbnni zr yaelrk oaymfaxd? Zv etmhpv, uhp mlrl rxacw fbgcp lr pts vmyexd? Si znlt seix uepr xbelph. Ux padr’g mae vmaw hf xea pao hshew ameawhn smf ytmtpl, abs nszfnntxl, tgd smf vaucgu. Utcv auxg hp zngbssiq, wriyk or oizprgve hef xoey inlbec xutg ie mf mhdlc. Yboiyk, bg mhp sgaxr seaw pad eyfhse mzihsdmoex.

                    Hp prym hzqr hge oel mh gz xb abs zjsbve lx gax czpyxze. Si gtngsx ubl cweflxs mc phfpfxrk, tno saer hlh gh zo es gax czpyxze zrpx t wpix, unt pzrg hnni n pxev anl moz qhva eitblnrp xb wtnrie. Ax seelxw ogiegbgsx nm mhp gbeeeri nl nsfey. Xtrwc zhkntrtl peci gax sljrlm ttqrl yoc abkdiyk cxhpwi gh mrlzre. Ae dxnkmeo jbk aoxi gax npbg fhrymaz tno anl gegie lxey ettbn.

                    Hi fxtrnlrw. Pe pzrg iath shk a asybve dinkvh. Ysgabnr hvw tnj kbhw.

                    Tsmf atpaiaxw mlrl fhnelf uxfzvr hnr sshlx bfvaxw, bpjbkx ofv phfmfrvmr wlw qxltcslxw. I hef 17. Ghw T’q 23 ngw I’x wroxrlp ungdciq fblpw skhm elnm welh cetcp.

                    Crm tlw ss t luohrg, bn xc qkxax, xubggd lnox czqr kbgsx nztiy.

                    M’z tm hzqr, tgd xc stmhpv vl irpepabnr. Ql lmeaqbmaec mf lbtemaz uesmaw aix eaw t ltxgex tz sax lioi nm aec tvtgo. Elr vhnrvrztttsa hy ofv axbgsfbkl stxf uxfzvr abm tr gax llvtx, goe-uhbme-ztrg trpe shkmph or huc pvobnr vbhf, dtrvgz rzsz, tgd qezbey csbf. Mhtw vl t bcsnw E-ssecxw saepx bnes jabcs iixg mzvr maay xux nsfey 30 hk 40 ppscex hlzr vkaxqrw mhpqfxevpw shk Sfrqtr spvibve. Elrlx ppscex aci ghh qfmrm mo mi n Utpemfm voykexzaembg—hr lx yxtse, xuxr’rp xbh jutig mh bp xux Uaaxvlm czrtkxglxvhg I rvrp np tr. Gaxy’ci uxke, myg lhmplbp goe lrkx. Tsil’kx sseqhp ppscex. Gssfml.

                    Oypl fr ohr stfiwc sxxld vrte tz qr. Maej’vr tl dpeq tl mzwg hy tsi bmaecw, ngw ypx gaxy’ci nebvp! Ql ukoelrkl aci uxke lrq maej pbhd tsi jtr tsil wbd hlrg B wlw nuhue 14. Orbmh, elr hedpwg hy tsiz, mae hselm ayh gax ftvfm mo omr, bl oypl 11. Maid qrtgs Xeevns, xc stoocmgx urzxuxk ayh nepajw gax bpwg-ehovmaz iecwbg bn elr ytmtpl, bl 10. Bpr ngw Gcit, temzwg tl awmxx ts eavgl, aci rbzhe eaw legia. Px’rp eye liexvgz iy xux yrzrg khw, zzrk gelv zr ltptzhmhpv fh lhp gng dept ng xyp sa nl. I’x wvmmiyk oxmwpia Dxiel ngw Mlvpnl tz orxi tsiz ykox oveeiyk rtvh zxuxk dfvvgz tsi fxkvtgr.

                    Paey rrbmhpv by fy aeexgtd mf ehovmaz, Detxu kxanlrl tccsfl fe lrq innnlrl Facghl aach bg mhp xubzh. Xeevns, jshgzec, wztelpv, onm awanrl seyouhry, eyptyd xbnzh, ayavaed fnvd. I rvnu xanl ohr’s qmfm tno wdnxeki. V’f uirkrk tno wgkhnrie maay fbma oq xuxf ayh V’ox awanrl hlh fmkoyk utgdd. Xux uojw fjnicq vg iatr ngw tcc gh iuwp npty. Ljgxk a xszxgt, T prm mhpq th. Eedwbg eelvaxw. Tsil ext pepa htsie teoyi shk ae prtlt l qvgntp se mpo.

                    Tr zr wrpez, maetv ctbn osrlg’t syem fe elr pty tx nepajw qbw wsia px wpvr zkohmaz np. Mepd mhpr, fbgcp M jtl tsi bewedx, V pts siyw kedtbglimpr yhr elrbk bplnoboc. M utw tz gbgmrzp gaxm pzrg mhzyta B czyywg’t pwptie elrbk plma. Fr flxuxk ayh fmxpxsgaxr nyg fx ad pvmmlp wytvk lw chlstfyx phpr vm vaxi gh fy sccxkextnmay dcawkoxi. Gaxy cisnleo xb ext xi ox aayhvvtpaiq. B pad xux hloifm dio, eaw mhlx jtl tseg. B aao ql kxsasalbbtpvmbed.

                    Rroxrelrexsd M hlxd es sxxl pzrkr dlqaxw bcyvlx, cfx, ngw bfva maae ql ukoelrkl mlrnzxd es phelpgg. Xtcs xvfx I dej maex lhkm, I dlnkxd elrbk plma tl tsshza I seq uxey macnrph zrlewj. Roxn aevgl tsil ikeeiawxd es sxxl, T hvw yepp. Uriecizittsc frgdcszx bs l hrenstsate dtwbkwec, esmxr lpy. Maeci’f gh tpprittsc, ah farmp, gh dpic liicmgntl lankxnpwf. Maeci’f cnse xux gefvbvaexmptelj-mawncph qxeudmbg mhlx V yxew xux iatr ngw pwinlnrp xutm I dir hmhpvf xqppvvxgctrt. Ieelwhkx id vnkx, plma bl pwiambffp, ngw, dpphlboyey hk nzx, vm aucxf ebkp lree.

                    Sz aur wo T qvll ie rbp?

                    Phlx n vkakc gabnr xb fbsd. Rbm yeppvgz ie wuhnlo fr ebkp lnobnr e ghhtsepax vlrvla ahel. B lhzyyw ue dyeikidiq tgd secir. Iywgxtd, T’q nykath. N itre ss fx id kbgx. Nzx oxbnr eoex tz jrxe mj fehmhpvf’ itiy mf ebkp rbm uetrt tulp xb axac xuxf wsia maej wuhnt, lrq B’f aqvnbw.

                    Tsi qkxax frzbnd xb uxczqr t girlgftrp.

                    Avmaofx jtkntrt, fr bcsgaxr Vivma vlrvlaed. Lr’l cudx thge. Si jtl tsi sbkse xb zh—tz hvx—relvf tzo. Ysj ax’s geablhph nztiy. Ma abs apnvx bpwvwx mp, xuxke tw n mtlw, frtnttjhe poxea, ueano-okhwy-wxbgnph ngw swiawxr hmga eoyk, pkhw-mpnvd hlme, zeelqvgz. Ssi’f pxacmaz t szjg, lblvc tkxey hexls elnm ylzaf tgd eavlms lvbngd sie uhdj, aetiptrt axr tr fhfe trgkbclxr itteieg hf qsywl ayh ttmhpvf ykox rrvd tz jrxm. Ssi vl t sevngzec.

                    Wux bs xc zhmhpv.

                    Fax id xux poxea bg tsi bgx ptggnke xc stmhpv ttoe xi by fy mmbehgtgne foelrk. Detxu lmowi vm yrzq zr ueovbhf wsia ax wlw abge lrq B pad xjxevp. Lr pkaatrw bt tr ng hlo tvxve zj n ieadxvv mamprveoel ngw bfvvxw ie ma hnr reewxn migpxey e ehp oq wdntssif tgd l qvqxd csj hy czva tgd mingl. Llxrk, ae npnbfeo mg ptsy’x ubl flyym mhlx gax ptggnke hef kniyiq ur wlxrk tno fl uxiyk jtekph bg. Ae zryr aio mg tl a usxx. Aoh anl ae dycihsph gh dnza ngrtsmaz pofpq atpaia mh ie? Xutm wlw Xxbts. M oxtt elr axlw shm hf smz. B aucx zrlewj ghh, oq gbnksp, fhm bt hef phrel vm. Mhlx jtl oyi oxtttrt ax npzrk mowh bnk plvrgms lfbnm.

                    Bfx gax ptggnke hef lmiwp enbnph. Nee I seq exfe anl mhp qrfhrj ss bm. Ayh uxke hef maae qrfhrj, wvmmiyk axqt es zx.

                    Fy xsgaxr tw gtel, eeyexr elng B ax, xneeec xutg mzwg ixoapr. Lae’d rbm irpxgr. Lhp’w oxtuemsne. I osa’m eozo ybde sie. B eozo ybde xc stmhpv, jabcs lr nleo xb lty hef t iiec. V whn’e qvgw. Bfx fax id e fmnnymaz poxea.

                    B ltlvr tm hpv, onm ssi qhxs ysg mnry xb ehov eg fx. Tseg, tm lpefm, bs evhx mo wmsx. Lhp rroxr dej fx. Ad M jtl bzva, lae omrw. Ueqsex mhlx, shk ths lxtrd, wux mozo gax pzthetr “dqnkm dcyt” hy hpv gbfe. Tx jtl a yij ikedgebittsa fxdtgvgx clpyxw Plvnvxtns, ngw ie anl wotrt phnoiel yoc trhilp auh aao Eysaetqrk’l dtwrtle. Tx fmhpaiq mae oigxkizvnmboy ss maetv vgmewprvmulp sngcembg tno iatulph gaxm es ztde pbpxelprg nle zj jattpzrk fexser tno xubgktrt tuiwmgr mhpc utw lpjg. Bm awwb uhodxrw mhp trkyocqngve zj bkwiyeer, aelpgar yzyaz ieztyx. Mhpc extd qefmxr, cigtbnph zhke, xeqx foci etiio, epvnrlxr vhnyipmboyw, ptecfpnmboyw, ngw czrpenstsal. Ts l vrlnle, Tnktcpxph uenezx ts ascneac ef vhfqir tfoyk fmndprgl, tno, ms maej qrtgt es phfppxr bg ayc by mhp lvzalj tnbw pcssxlstsal, bt hef tl npgrllacc nl t kysjexdri by voxthmxrd.

                    Ql fhtsie’l wrfk gtdiyk ztr hlzr axlaiq mh ktpy axr. T hbg’m kysj yhr dyex. Fy qegaxr omqg’m kysj xbtsie. Unt T hb dgoh xutm hpv qkng wism btd yafbseextulp qnkd oy qr—fr hjtrkxmaegar sjrqkhmp. Xutgkd xb mae lhqbvttzr gttfvr hy Plvnvxtns—n yxw elbnlayh cxhpwi qbxd evlbgg es okxav xux aammg—maeci jxke zrpx meyw by fiwpvhgs zj hl.

                    Ayaiexfplxul, pe’ci ptelph, bk ayaiexfplxubltd, se laaciel. Mhzwr tke dszx hf elr ihltxr gtmpw, Ngw iy wcbme zj bnk vfpaxkammybmy lrq hnr smta focxnebtj vnmx, tsiex trp wgbel byvmx a qij hy ud.

                    M extcs shm mo xc zhmhpv. Ah faexrk phlx fax’s osax, B wlrg mh kysj axr. Myg lae hsa’m eozo nm fe. Dlr phn’e iixg tfva axr sinw. Tno wbfxhza, V vtn’e uhbme cinva hpv, ptg’t eshva hpv. V mky es txm ua jehf mj gutbr, myg B vay’x zhoe. Xc ohwy hsa’m hbpc zx. B clr bgey dmg tgd wmfmxn lw zr yaelrk irpepaxs.

                    Ysj B uerma mh kysj paae lr bl slcvgz. Hp lnl uepr ng bnomfmbnnx otvkrvbngd cyzuee frgbe nza, onm nza V axac lvf kelhvgz fcsz mae eargmy-qmsma csecmxr zj Ztmtsij, jnoemaz mhp abkws zj Pakidx:

                    “ ‘Shk tsi xbggosz hy Hpeixg id ef t fay xetoewmaz bnes n ytr nshgmrj auh vawprw aid sjg leczngms, lrq wxltzrkxd frgh mhpq ubl gzsql. Tno yamh Oyi ux zagi sboe eeyxgtd, xb tgoelrk mwz, eaw mo lrbmaec sax; mo pzrkr mlr nvvochvgz tz lvl legiete ammybmy; lrq lmrlmtamwlc ghhk smf chucrrr’ ”

                    Fy qegaxr wsixw plvnueed—wghkipw gatt eehzat, dxbkbed xutm pcifxgtph vwxad eaw foceyl bn hell mhlx ztwe ampmnrpw vg ieztyx’l mtrql. Ae fwrw mhp saxl hp jbngd tr gax Btfyx, mhp saxl hp tynvkph skhm smfmhrj, se ykox jbed tlprl, tno ss vhucwr ax udiq maodi ux lah ma abs wmsx tno xux eigif hy ppscex hp oaxp. Hp abox sesebxs trgh aid Whgwaj wrkfoyw, ubl Btfyx vllwfxl, ayh ubl czqcnmec-hrebvpvrw aidxbkr lpggnked. Frvtudi ux uewmroxd dxbkbed arkx sz mzihreeam ts einvaiyk ghhld, M yxtryiq mh plc zhke lxgxgttsa mh tsiz maay M zbzhe lnox oelrkpidi. V vhuwh dnhtp xux iaceoex tseg ax wlw extdtrt ghw, elr itrlfyx hf elr mtlprgl. B czyyw juzxr lxvpvne Uimpvvtl aeetulpw skhm xizhky. Xelux tseg’l phj M ptg hpee tgd frqxkseeaw lo xypa goh. Xuxke tw ckxanlvgz bpxjxxn elr ubtd ss mae aeetulp, fhm B clr’g jniei hgwecwgtgd tx. V axac mgl khjxufl rtwvgz ayh steltrt, kxppegbgg lrq otrjmaz, lhzygbgg lrq paidtrkbnr. M uxtr elrf ts T’zr tewlcf axach gaxm, myg B vay’x ptmcs xux pochf—xqcptg yhr elr phrow by mhp tnktbwi.

                    “ ‘Gaxn si gatt seq kxcpmixw tsi sboe eeyxgtd argm ayh gktdph jbmh elr ltmp eaw faoi gaxm lrbmaec jvox tlprgms. Lrq ebkpavlx hp xutm hlh exvetzrw mwz, lr tesz knbgeo eahmhpv gph. Bfx ux mhlx utw rpgrboeo sax peyx bnm ayh qbzgph vg mhp inkmh, lrq abd smf ehro’w zhgej.’ ”

                    Ql yttsie pts l kextt miybxvpv vg xdfgnmboy, lnkw wzvx, tgd aielhnlp exlpzrfbuiwmgr. “Mhzwr tke zye mtlprgl,” ae hshew slc nl fy mvbmaecw’ rrxs rpnsxd zzrk tno iixg I evvxw nzx gh lirl. “Thw hlw tboey xuxf tz yf, tgd si’ye cuokr nl angbkwiyk gh aoh ar nle elrf.”

                    Mhp tnktbwi phgttrhxl. Tz inva oq xux mwz wrkoayxf pao seq mkaoiq pxlw eaw faoi ckhftx shk tsivk eoch, gax lzvq ltio, “ ‘Aree dzrr, maof kbhw ayh stbtsjhe leczngm; tssh atse frxg flmgayuw sixk a qij maiykf, B piwp ztde elrx kuwie hoec qngr tsmazl: eyxrk mhzy vgmo elr chy zj gar lzvq.’ ”

                    Unt es gax spvitgt hlb atd osax goelvgz wtxu abs dmyoxr eeyxgt pbpxit myer bt tr gax gcshgw tz orxi ie wnyx, tsi yhkd devw aacwuxk wzvql. “ ‘Mhzy jbvkph ngw swsgayuw wrkoayx …’ ” ux uerea. Tgd si bkweciq abs xia mh, “ ‘Tlor maecishke elr mtlprg ykox lvf tno kvox ie yamh htq jabcs lnma tpr gteeyxf. Yhr frgh xvpvlhge elnm aael fatlw fr zbvpr, ngw hp wutel seix bn lfhgwaygr: unt qvbf aix xutm hlxu ght dlnee bp xndxn lanr xvpr gatt hlvva hp lnma.’ ”

                    Wsia fr flxuxk hlw ftbd elrlx wzvql, fy xsgaxr geablhpw. V atvpr’g xoey frxg ampr mh spi uxk wssyx yani, ngw nza fax’s rsax.

                    B dzr’g ngdpvfmtno xubl. Ie wptked qr. B vay wrx goh xutm oelrk ieztyx trp zngbssmaz moz. Qblm hlzr terpeqr zoyi. Oxeogiq zaodxf.…

                    Fr flxuxk id kbgx. Mj wgximzxuxk clpyl hue xb abm tr Fitntwu mae hel lae omq lhmpxvfxs hlrg lhp anl xxnmgxw, “Nz! Lbp vay ar ebvp rbp? Mhpc’ye urpex bg. Tsil’ee ktpy nl awp! Jx fudx onblo xux pawp ubzhpv!”

                    Ngw ssi’f zhnp. Ql ukoelrkl aci thge. T’q nehnp—ef B pad eyhge elnm girlg ybvp crtks lkb. Mae sshlx id efaxs lrq knbmpr tkofrq fx. Ie hbxln’e fhkg oc genfbwi bk xvpr stwe es nlaed, fhm loxiuhp, iy ea bgseeam, bt tw n kniy, scxg tz xux girlg ldy. T wrx ltlvf, t julvgxk mzsa, tgd l wgkxav ss ebgsx, zhoiyk, ebliyk vgmo elr ldy wmxx loxi ybye qsevx edgnibnr. Fl mae wmtam oq eye mhcir hy tsifx, B spi fatdzaf, etrri, zhoiyk, gakelxrgbnr. M sxtr elrlx sseqhps, myg B lep rb pty es rlvaai gaxm. Elr ptlw mf lmiwp gaxrp, whkkofrqbgg zye gxirlohkhzsq, ehoxmaz hvpv zx funl ubzhpv gatn tx roxr evher dth. Fh funl ubzhpv.…Vm pad whiiodiq mh kpic wtnrie hnt. Tx stblph lxtrd eth. Goh mg ytiww nztiy. Hngzec mf ptlwiq bg wtxu fx. I heam mo cya, mh edgnix, tz lvwx, bfx ahp mj sjg aayhf, fr fpig uxgtr gh yaoi npty. T lrtk tsyawxr. T wrx mhp wgkxav ss ebgsx eble smtaxr tr gax svc, tkhw mvvzatpv.

                    Gaxn T wpkxax. M stel. Esb fncs ss fr bzhl bl gzrr, otntwuxw ahel. B vay’x fmty ftebzhe, gng’m clxpa fydiyy ts T jnee ayh stel lrq ytlw.…

                    M nphkp lrkx iy ql vtbtr nm Tczva, mtnrprw bn xc oetnvigl, aawj bg tno lney oqj zr ueo. Lnw B snvrtfeo eyhnd? T hvwg’t vrbp. B npzrk lepq gh aagi gaxsp rvzatxeexl wsia Utnvsyx bs hmga fe, ds ux vay’x gxel xi uhp mfgu ghidi V ftkp. Mg’l cudx nl pewp. Ubl pcepmbcp eykxaoc phltd lvf xnzyta llpic, tgd elvl girlg fnse fr phrdi gatn xsfm yoc lvf.

                    Bt’d xukxe tr gax mzvabgg ysj, unt wefm girlg, cnse esmxr oeed, loxi tkhua, wbfx glrt, ixrsecl, tteepdxd elr Whvpxexx pwepx cudx ahkts ss nl. Tsiex peci, lxltpvqtr ae xubl ttqr, 22 ixoapr ebvtrt tm Dzzrmkep—xux hlo qng, aid avyx, ayh ubl ths lhnnrifm wafkumxrd; lvl yigi ztkrtiq lhnd, xuxbr hmixl ayh gaxic ovwl. Awp by mhpwr ixoapr tke rsax xxnicm yoc xux mwz cbnggpwg pbvpw ngw tsi gakep pvmmlp gubedcia maej arkx ampr mh gceo tl tsil ktn. Eab hy tsi xbws lvr anre, eaw hnp ss mae hszxg hlw utw a sinkm aexnvd, oq eye mhtrtl. Uayobex hlw gkxaeiq axr mishke. Si ftrs dlr pts mseg piel n axacx qxyenx gatt dlbned seix uepr gtdey gnkx oq auxg ssi jtl a meor. Uue wux’l oypl mpeyxl, tgd lvbngd elr mbmp wux pad fbkg, hpv stfiwc, ybde xsfm ieztyx, aao pvmmlp se gh mzrrr. Mhpc jhkkph utkd elrflewzrl tno thm mhp wgkhnrifm hf elrbk kthf mh wzvx tm arif xbgsx bk mey. Xuxbr oehzatpv’f axacx ckhbwiz pts lpjtrs pmgaxr rsvgz tz ovee hpv bk eee lrk eigi. Vm padr’g zhiyk gh ue qmkxw.

                    Nza vm aao rrtklj oveeeo lrk. Uayobex wlw fexeamaz—hr xsex eiviyr ltlcvgz ahexx—bn elr veiymp khox ss mae dguhhl esabzhe, orxiiyk ng xyp sa axr lrq mae eab bgjfvrw diow. Gatnvw gh fy sccxkextnmay dcawkoxi, ux vay’x utoe smf veiymp axrp eg mae sshlx. I ampd np prbnzh zj bmaec trhilp’w ctbn lw gabnrw nkx, ayh ux pocvvxl amshm bt. Si xxxpd angmiyk gh zigi zx loxi fmnfq xutm pciixgtd ql laacmaz uy viribnr qr leeptl, leoh, eaw ltftvw. Go, elngds!

                    Ds V tpovi nehnp, wbtdeo avma shinm, tno yatulp xb zxt mepd mo dprxi. Ie’w oxxn jinkl strpx B’vp lnw lunl n lmrzrt kxanxvhg tz e qkxax. Ef B keneye, mhp pnlm ttqr pts qmix relvf tzo cmtam aqxrk pe digmeeo lrkx, ayh vm pad xubl slqr wtmyiq wkelq. V lnpasfx bt’d gbfx blgx mh mp frvtudi by mhp egmtcv sa Whvpxexx.

                    Tseg tmtlgx laofpqg’m hlzr atpaiaxw. Tsmazl hlzr uxey uhbxttrt whwy sixk tsi ctlt qij rxacw. Gaxrp’w fmblw gebfe, zj phnrdi—ehubpvvxl, bcind-bnd, eowncembgl fzv etgszq bk yoc xux lllzr mkaoi. Jhksp, xux iozv fmblw krm trcifmxd lrq bgdprgnkeo jbk bnoiomxdyifl, oarvngvy, wsvmxrtrt, tgd zxuxk “ccmzxl.” Bfx gabs elvgz oq vnzbnr mamh a nszfnntxl tgd vmyebnr eaw uucrvgz awp gatt jsh whn’e wgxtl dirfl tz lnox gzrr hnt zj stlhtsa. B aagia’m aelvq hy aycgabnr pvdx tsmf Whvpxexx rlmq yhr lx yxtse xukxe jinkl.

                    Gceamxd, elr Whvpxexxs omq lnpapl mae lvrt piel uhfe-omfmblwiq paidorr tno lbfxgcsjg facmwntnl, fhm mhpc’ix uepr qhbnr xutm strpx eoyk oxyoci jx trcmixw. Iy jnvm, tsil pxrp xux uedx-nkfeo jnkf flqver iy xux trpe oxvafwr maetv onliyifl pad rbm hnwc veeerey, unt wypktttzr. Ixoapr atvp xebxd es ehu tsiz uxfzvr, unt zryr mhp uhbvk, byvxm bfvtetr-eccxl hlzr atd lrl lncnifl. Nnemy ghw.

                    T uhxlttsaxw Affexr, tsi uxtlell Whvpxexx wtjr, paiwi Otgkzpr pts hsedbnr sa axr dsa. Ax hlh nekelhl mhlo lrk mhlx gax ltxgex bzc jhnlo fr tel cmtam, ayh V yxle xutm wp lnw mo qmaw hue autm ssi xgxw, ys ztmtpv uhp uawrm lhp anl. Aewp, gax Dzzrmkep lbnled eex hnwc ng aofv’f ptlv jehf hpvr whwy xux hlo pbzziyk ehtd. Hlbxoec lvm Wogigkxe, hi phnlo fr gxxe sa maetv yblt.

                    Lyokxy esyw fe elr tmtlgxxks hsex ltceazx cwsgabnr, Wux tno M gtekph vg mhp qnbg rzsz hy tsi fvaozp, n lbnrpr, lfovc bbe llqc uxthirg ns zr bgx oq xux mamprl. Pe deg ytctrt hge lrbmaec epkhsd xux mampr, Tnbcil zeaygvgz egier goh eaw mhpr nm mhp gybgin vbhf, wsiex Uayobex hlh pexayiq tgd pefxw hpv pablo’w fvkaaif, unryw, ngw bcyvlxs. Dlr ltio xux tteepdxrd arkx mpr, onm tsil phrp fremeo fytvk eyabvs—mpnvd dciflxs, dlr vtlwiq maex—aubvh syaz mo elrbk tsmtal. Uyhrk mhpwr, maej abkx ochvgtrj tngms—pmgaxr uingl oc xux diyh by vaxshyeari ctgtd xutm ssi utw spia lhlomrkl wpee.

                    “Maej arkx ltor lhlomrkl,” ssi ftbd. “Elrr lnpexxw iy, wb jnipx. Jx gegie ltw elrf nnemy maej wgtktph fahoemaz tt fw. Gaxn, meaz! Tlw eg hgcp. Xuxr htx nee ofv uhnspw. Vm pad pvdx ay ikieodmbg—fajfr mpeyxl hk tsmemr oc qbkx gfrf zhiyk byy awp nm cudx gax slqr mbmp.”

                    Eaw mhlx jtln’e xux paj kngzs ztrkttph. Ttggdxrkl wzyyw aagi sbkeo vnzzeopl, ght tr hgbszr. Gaxn elrr pofpq atvp xebxd es ztde trqboioyne gaxif yhr elrflewzrl, mrtiq mh gceo mae mifm-eozovgz wzqrg hr dxrte tsi oxlt dxhyy bpjbkx tsivk yrtiawl czyyw zee mg.

                    “Maej hvwg’t dxrte oc fhkg aycgabnr yambl elrr aao frtmey yf, laoe yf.” Tnbcil ltio. “Xuxg tsil mhov shk yupp ngw wprg lmrlmtam tz shk yippql tno fhkgeo shk vrztf. Tytpv gatt, elrr kathrw mhp lbnled eaw uacrf. Maej eye poci obz wsmgx vrzwfxl oy xuxbr nlrlms—nvblled pvdx iy gunkcs. Fhm mhpc xbelph hl. Mhpc roxn dlbm mhp ovwl. Egieruooc gaxy qshgw, tsil dblwiq maex. M ubw wtxu fr blfl hk tsil phuwh utoe dlbm aix eaw fe.” Lknbg, ssi fmtrph ghpach gax cwmabv rzsz.

                    Maae oveeiyk by vhtpqkxn…elnm pad e uxel zj n maiyk. Zhlt elhzl—eigrim fzv gax wzvfm isjguhminw—jhnlo orxi tsi xbws lpvox fzv etie lrq maey jbk lawi. Ngw ad jbk mhp gehlspw, jxel, reazltpvf fbgsx jxtr nvblled sa vaatrf tkofrq maetv axvkd, fhm mhlx jtln’e xux locx by mhtrt fhse ss maetv ibvttqf phuwh txm cwsfx xnzyta mo ysgbve. Lrq ztnrwgxks hiex nnwmxxey es eng acshgw iy qnmvhtrt mnntgf tel dtbkmiyk jabtp gehlspw bg mhpme vaedxf. Maid anl loxigabnr rrp.

                    Hr dszxmhtrt hed.

                    T hvwg’t elvgd oq autm ie qvzat mi hgmiw esmxr T lnw eee Ehukej kb utcv xb mae npvgbc es oxw dzaa gxxe xb axr nlvew. Blrxhee seq zbvpr ubf szqrmaiyk gh aewt ubf swiri. Ae omq mae dezx yoc lrk, lo T abg’m bp eoex tz efd aec earmhtrt fhrp yambl dlr ptkpw hi eaeie maid qbkgiyk. V vhuwha’m aewt jhgdpvvgz, tsshza, wsigaxr elrlx ppscex, wtxu maetv pkhsdif, atd dszx voyrrvmizr jbmh xc pnkrprg exadx stoocmgx irpwvwxnemne vayhvwttp, Xrqts Diatmoc Eawkeh Wgxxlp Nnkkee. Mg lhuyhf ebkp xux locx by mhtrt abs aibiee xmtam dz—e exoigey hy szqrmaiyk atltj shm hf elr itse. Hvw mhp Oh Deui Oytg wpee vkodwrl—ts hiye ts myeg mhpq? Gax Nldvl poci gax shefmbkl, aubvh tw n dbno ss vkodw, onm I osa’m mhtrx maej abkx ie sa maetv paxsew. Gaxrp arkx ccsflxs lpy hoec xux illgr wnrtrt mae Trdnbstxvhg ayh oxyoci gatt, oyebgg elr Vkudeqxl. Sz rbp pe seix tnzxuxk gcshi mhlx hlxs nvblled eaw lllytamecw cxhpwi. Wtkrpx’f ixoapr vhuwh ox uesmaw bt. Ueekxt trfbltd sa uxiyk n marzaotvk es fhfe peeebec, “wvfilpv” gbfe. Ysj whed rbm lutx ubf. Rppvzbofw gheeceavx dzif ght dyvm aix. Xux vucvrgm seegx hf elr vhuyxer wopw ahm sfmg abm. Si jtgtd xb mtkp yf tel mepd mo dszx farmpte ttqr paey iixkyzrr uxltiixw iy xux laxi Thw, wzvfabpaiq abm tr gax slqr pty, lrq ngdpvfmhoo xutm tsivk laqigr bn elr ngigielx dptrgweo sa vhmaprmbnr xux laxi exeirmbnl rtxhtes lrq lmoxtvgz aycbgx wss jtl dtjsxkeyx. Gaxrp anl gegie lncs e gbfe tr gabs nshgmrj. Fhm mhpwr wtyd auxg mzvr maay lney tsi cxhpwi vg mhp gbngtcc ptg’t cinw tt lpy, abseser bs uyfm hnp qbkx vlwg ngkysjg mo elrf.

                    Cacvrm luatbkmecw utoe mirg dnzaa, ghw lrq maey, xb yhrx qbul ayh onkn aibiee lx gax seexx yoc frbgg hmgvaed. Avmvhpw! Vg 2032! T wtxpa, bn elrbk vtij, mxnow gh ue l Qbleex, e Wxp, a Smawn, a Myqwaidx, bk, bn dszx iacxf hy tsi phnnevl, t Focqbg, t Jplboth’d Avmgedw, bk xvpr n Vttssybv. A hmgva mlc nelo mi ng ttsivlm, a “nyymbse,” se t pewp-gh-wo pgpxgtcmp. Pxlw-xb-wh engrgmrtgf hytpr utoe ys ckhtpgghks zv znvh elnm’l wzvga ltpeybgg. Lrq “vnlemfm” bs l kextt negvaawp gxkm qse tgyzrr pao qmgl bnes ah htsie etrri ptmerser, tno crm wopwa’m jutxr fttnl Wtkrpx’f oxrdmbg hf Nlebltteabmy. Ueekxt’d trhilp lnox bpia dgohr gh uelx bk wrtzr hnt Frvmtrteal, yoc kbhwnpwf’ ltkp. Nnkkee gbgwexrf mae myegbnrw, onm dzif lh iy whva mtpq etnrynzx tseg abs aibiee lvr ykep xb axac autm tsil ptne xb axac. Ef yhr elr uxaemazl, tsi gtkrtrt tgd qinmaecmaz, tno xux wedxenvttsa hy “hpegaxn sshlxs zj qxoiw-abklhtt,” ux aad e fbfpwi nglwpv: “Whbn fw! Bnk dzsel trp scxg tz iixky yegbhnlpvmr, egier kani! Yxtvp cbnk strsne plwg uxhtrq, tgd miphfe zrr hy ud. Lrei ud xb ftkp Ezxkine tkxae ettbn.” Si’f atd ysgtulp whvvedw jbmh elvl vacvbm-tno-wgbvk ltckhanl. Whbn fw ngw tsvvox, oc autmegie atpaial mo jsh tl a cifnet zj lhnr zaa lbnqyy lmumfbkgnpwf bl yzye ikomprf. Aid scihnprg Obcp Texlioiam Xdheew Caj Wzbmh neyel htq n wxmlkbzne, l vnuulp-vbnlec, eaw t hjtbvkiei. Ffbts mf kbgsx, by vofvfx, uue Wzbmh tw fnvh l xvkxd, rvnr lhlhbp hf l qng. Cacvrm, hn elr hmhpv utgd, tw n ubg, seawloxi, oetcv-lnbkeo qng piel qxxp, nprtk bwyr xred xutm sphhvx ppscex ayh uhed elrf. Ae sef t ootgr maae’w n paowi-ohwy pbcxkiprpx, mhp anr fy qegaxr’d anl. Bn qepm, B’m dsekr tz wnr, Cacvrm pad savx a Mecmbse qvgbseie ebkp ql yttsie. Unt si yxyt elr Utpemfml bplvgw ypeel tgz xb uxgtr ubl ohr “Pakidxvtg Axiebva” oiahfiyegbhn. Si ah eoykrk irpepaxs citneac GN lxrxsal tt NE panrnlrl hr zr gax npxf, unt si’f lmiwp exvorrvsxd lw uxtd zj gax csyeva.

                    Ie wrxfs trrobtlfyx mhlx cxhpwi jah clr’g kxao eex zotrt mh lpea fhrp xbptro nhwziyk ptgdthnmxs zr gax wlc gaxy wsbd tno wbngd elng hn hlnm mhpc petix xuxr seeaw yoc. Iixg ppscex wss ptg rpeq tgd lvr xwunegxw aci nim tz tnr foci nmmeyxvhg tz kbhw lzsxl tno wrwncemix eipw gatn elrr lhzyyw. Tno rb whumx gax npa cbvtfvr utlwsgl hn elr gxtd avee gtzr Ctrcig tg egia zkelxrk tdgeamtgp.

                    Nnkkee’w cxhpwi fxx awgbahl lrq wkurw nl Laeea’l mozpf. Lhmp ss abs xsex yayegbvaw jbeeohiel firlg oxrj aree bp xux muymp-tgd-nvbll glrt pao oifmkojiq Whvpxexx.

                    Ayh jx trp Inkmhdirw. Pe’ci “gatt nyym,” “mhzwr lmrlrtx ieztyx bn elr ablww,” “gahsp getsy qsbel wss ckty es fhfe vmaw hf rsq hy cseazx.” Wp eex tlds, nvvochvgz tz wbfx rfqbkl I’gi uxtro, “xuhle oiibe-wzvfabptrt ablw lrtmhprf pao eexx bn nlvewrpr. Ngw wseg wh yzy fnipzwr maej hb pbts xuxf?” Npzrk fiyh gatt elr mkaoi vg tboypmxd zv bkihlrrw vhtpqkxn zv pablovrg lowh or wedtrkttp tnkxnew thxs zr nee ogie mae nshgmrj eaw xvpvlhge vrbpl ie. Rb ftteie. Mae smam mhlx fhfe nyym bs eexbgg tr pablovrg yoc “uhxlttsatulp thkiodif” bl eyshza tz qndx szqr ixoapr bkrlxvhgaw.

                    Xutm’s elr dbno ss knmzv gatt nshew hfvg nl egia pbts trhilp auh trpr’g Ctrcig lnpasemxrd. M’ix hnwc uxtro mg t voftyx hf emzxl, bfx vm’l semye lclvl.

                    Tm tsmf ihiyx, V cnse lbix tseg mae aibiee hlb abt Osixmrpi jxke dszx geh kngz, dtwpbiltrrw tno jebzheiabgg, myg hglj esmxr avbybt. T lbix.…

                    Bfx V whn’e frebegi vm. B dz whlienx gatt Ueekxt’d trhilp lnw loxigabnr xb wh wtxu maid. Eaw B tsmad B’d migmxr del lh tzhnr tt Regaxrtrt. Pbts Hboxtcir ykedl vg xvpvlhge’d qvgw, ppscex wtpy ux rpeqr mo nsbixrlxr, atvp qbkx dcmyel ayh fvtteie fhrp gnvaed ss fhnpc, shhd, hinihnd, vrvhrow, ngw vlphtulpw. Jx vay jvzat l kngz. Wp’zr whnp xutm bpjbkx wsia px wpvr fncs prll pcictkeo xutg wp eex goh. Fhm pe nea’m yirlg Ctrcig. Bg plvgbvuwee, px clr’g ybgsx Ckxsthrgm Jlvexm. Pcifbweyx Wtkrpx, vy mhp gbngtcc vl fao iahngs xb xeenx ubf, czyyw wedxehr ud avmaofx roxn vrbpbnr ar xqidx.

                    Jx trp rbp 59 ieztyx—64 piel gax Dzzrmkep abfxn lrq vaiwhexg, iq xuxr seel. Pbts rhfuecw ybde elnm, pe meexey os rqbse. Eye mhp qbkx rpefhg, I dycihsp, jbk fy ovrtf.

                    Mj “xnexne,” kbbgg mepd mo elr itrlfyx hf elr mtlprgl, bs Peemaspiq. Tgd lpgahurl V atvpr’g unrtiq bm iy xux zrzyaw, B hlzr unrtiq bm hpvr bg tsifx volwgte mzyamtiyw, jaxrp mg vtn rvbp tt lfbnm tsi ftfe dtrxw ad shk keoabhw tcirl. Uue autm ewwr vhuwh V atvp hbgx? Iq M utw szqrahw mirg ts rsbw tt ceouee-cshlbnr ef Ctrcig bl, tsia Xtrelfxxd xmtam bp e obz eyshza mzzrfxne fl ghw es ox t rpey mtrrig. Tgd hshew tseg ux bpxgxk?

                    I’x nhfiiyk gh tlw ovgws zj hgpacvngmeo gbgvlfwvhgs. Lx yxtse M uhie elrr’ke frjtkrlrgxw. Bpxjxxn xc uhkrzv nm phlx’f atpaiaxw dzaa tm Dzzrmkep eaw fy sscxl ayh sxtrd jbk fy zaa ixoapr, B’f uawrm tno eg ehodi rgws lrq, ixrsecl, cudx vftgtrvgz tsmazl.""", "talent");
        }
        public String getString0(){
            return """
                    PROLOGUE
                    From EARTHSEED: THE BOOKS OF THE LIVING

                    By Lauren Oya Olamina

                    Here we are—

                    Energy,

                    Mass,

                    Life,

                    Shaping life,

                    Mind,

                    Shaping Mind,

                    God,

                    Shaping God.

                    Consider—

                    We are born

                    Not with purpose,

                    But with potential.

                    THEY’LL MAKE A GOD of her.

                    I think that would please her, if she could know about it. In spite of all her protests and denials, she’s always needed devoted, obedient followers—disciples—who would listen to her and believe everything she told them. And she needed large events to manipulate. All gods seem to need these things.

                    Her legal name was Lauren Oya Olamina Bankole. To those who loved her or hated her, she was simply “Olamina.”

                    She was my biological mother.

                    She is dead.

                    I have wanted to love her and to believe that what happened between her and me wasn’t her fault. I’ve wanted that. But instead, I’ve hated her, feared her, needed her. I’ve never trusted her, though, never understood how she could be the way she was—so focused, and yet so misguided, there for all the world, but never there for me. I still don’t understand. And now that she’s dead, I’m not even sure I ever will. But I must try because I need to understand myself, and she is part of me. I wish that she weren’t, but she is. In order for me to understand who I am, I must begin to understand who she was. That is my reason for writing and assembling this book.

                    It has always been my way to sort through my feelings by writing. She and I had that in common. And along with the need to write, she also developed a need to draw. If she had been born in a saner time, she might have become a writer as I have or an artist.

                    I’ve gathered a few of her drawings, although she gave most of these away during her lifetime. And I have copies of all that was saved of her writings. Even some of her early, paper notebooks have been copied to disk or crystal and saved. She had a habit, during her youth, of hiding caches of food, money, and weaponry in out-of-the-way places or with trusted people, and being able to go straight back to these years later. These saved her life several times, and also they saved her words, her journals and notes and my father’s writings. She managed to badger him into writing a little. He wrote well, although he didn’t like doing it. I’m glad she badgered him. I’m glad to have known him at least through his writing. I wonder why I’m not glad to have known her through hers.

                    “God is Change,” my mother believed. That was what she said in the first of her verses in Earthseed: The First Book of the Living.

                    All that you touch

                    You Change.

                    All that you Change

                    Changes you.

                    The only lasting truth

                    Is Change.

                    God

                    Is Change.

                    The words are harmless, I suppose, and metaphorically true. At least she began with some species of truth. And now she’s touched me one last time with her memories, her life, and her damned Earthseed.

                    ONE
                    From EARTHSEED: THE BOOKS OF THE LIVING

                    Darkness

                    Gives shape to the light

                    As light

                    Shapes the darkness.

                    Death

                    Gives shape to life

                    As life

                    Shapes death.

                    The universe

                    And God

                    Share this wholeness,

                    Each

                    Defining the other.

                    God

                    Gives shape to the universe

                    As the universe

                    Shapes God.

                    FROM Memories of Other Worlds

                    BY TAYLOR FRANKLIN BANKOLE

                    I HAVE READ THAT the period of upheaval that journalists have begun to refer to as “the Apocalypse” or more commonly, more bitterly, “the Pox” lasted from 2015 through 2030—a decade and a half of chaos. This is untrue. The Pox has been a much longer torment. It began well before 2015, perhaps even before the turn of the millennium. It has not ended.

                    I have also read that the Pox was caused by accidentally coinciding climatic, economic, and sociological crises. It would be more honest to say that the Pox was caused by our own refusal to deal with obvious problems in those areas. We caused the problems: then we sat and watched as they grew into crises. I have heard people deny this, but I was born in 1970. I have seen enough to know that it is true. I have watched education become more a privilege of the rich than the basic necessity that it must be if civilized society is to survive. I have watched as convenience, profit, and inertia excused greater and more dangerous environmental degradation. I have watched poverty, hunger, and disease become inevitable for more and more people.

                    Overall, the Pox has had the effect of an installment-plan World War III. In fact, there were several small, bloody shooting wars going on around the world during the Pox. These were stupid affairs—wastes of life and treasure. They were fought, ostensibly, to defend against vicious foreign enemies. All too often, they were actually fought because inadequate leaders did not know what else to do. Such leaders knew that they could depend on fear, suspicion, hatred, need, and greed to arouse patriotic support for war.

                    Amid all this, somehow, the United States of America suffered a major nonmilitary defeat. It lost no important war, yet it did not survive the Pox. Perhaps it simply lost sight of what it once intended to be, then blundered aimlessly until it exhausted itself.

                    What is left of it now, what it has become, I do not know.

                    Taylor Franklin Bankole was my father. From his writings, he seems to have been a thoughtful, somewhat formal man who wound up with my strange, stubborn mother even though she was almost young enough to be his granddaughter.

                    My mother seems to have loved him, seems to have been happy with him. He and my mother met during the Pox when they were both homeless wanderers. But he was a 57-year-old doctor—a family practice physician—and she was an 18-year-old girl. The Pox gave them terrible memories in common. Both had seen their neighborhoods destroyed—his in San Diego and hers in Robledo, a suburb of Los Angeles. That seems to have been enough for them. In 2027, they met, liked each other, and got married. I think, reading between the lines of some of my father’s writing, that he wanted to take care of this strange young girl that he had found. He wanted to keep her safe from the chaos of the time, safe from the gangs, drugs, slavery, and disease. And of course he was flattered that she wanted him. He was human, and no doubt tired of being alone. His first wife had been dead for about two years when they met.

                    He couldn’t keep my mother safe of course. No one could have done that. She had chosen her path long before they met. His mistake was in seeing her as a young girl. She was already a missile, armed and targeted.

                    FROM The Journals of Lauren Oya Olamina

                    SUNDAY, SEPTEMBER 26, 2032

                    Today is Arrival Day, the fifth anniversary of our establishing a community called Acorn here in the mountains of Humboldt County.

                    In perverse celebration of this, I’ve just had one of my recurring nightmares. They’ve become rare in the past few years—old enemies with familiar nasty habits. I know them. They have such soft, easy beginnings.… This one was, at first, a visit to the past, a trip home, a chance to spend time with beloved ghosts.

                    My old home has come back from the ashes. This doesn’t surprise me, somehow, although I saw it burn years ago. I walked through the rubble that was left of it. Yet here it is restored and filled with people—all the people I knew as I was growing up. They sit in our front rooms in rows of old metal folding chairs, wooden kitchen and dining room chairs, and plastic stacking chairs, a silent congregation of the scattered and the dead.

                    Church service is already going on, and, of course, my father is preaching. He looks as he always has in his church robes: tall, broad, stern, straight—a great black wall of a man with a voice you not only hear, but feel on your skin and in your bones. There’s no corner of the meeting rooms that my father cannot reach with that voice. We’ve never had a sound system—never needed one. I hear and feel that voice again.

                    Yet how many years has it been since my father vanished? Or rather, how many years since he was killed? He must have been killed. He wasn’t the kind of man who would abandon his family, his community, and his church. Back when he vanished, dying by violence was even easier than it is today. Living, on the other hand was almost impossible.

                    He left home one day to go to his office at the college. He taught his classes by computer, and only had to go to the college once a week, but even once a week was too much exposure to danger. He stayed overnight at the college as usual. Early mornings were the safest times for working people to travel. He started for home the next morning and was never seen again.

                    We searched. We even paid for a police search. Nothing did any good.

                    This happened many months before our house burned, before our community was destroyed. I was 17. Now I’m 23 and I’m several hundred miles from that dead place.

                    Yet all of a sudden, in my dream, things have come right again.

                    I’m at home, and my father is preaching. My stepmother is sitting behind him and a little to one side at her piano. The congregation of our neighbors sits before him in the large, not-quite-open area formed by our living room, dining room, and family room. This is a broad L-shaped space into which even more than the usual 30 or 40 people have crammed themselves for Sunday service. These people are too quiet to be a Baptist congregation—or at least, they’re too quiet to be the Baptist congregation I grew up in. They’re here, but somehow not here. They’re shadow people. Ghosts.

                    Only my own family feels real to me. They’re as dead as most of the others, and yet they’re alive! My brothers are here and they look the way they did when I was about 14. Keith, the oldest of them, the worst and the first to die, is only 11. This means Marcus, my favorite brother and always the best-looking person in the family, is 10. Ben and Greg, almost as alike as twins, are eight and seven. We’re all sitting in the front row, over near my stepmother so she can keep an eye on us. I’m sitting between Keith and Marcus to keep them from killing each other during the service.

                    When neither of my parents is looking, Keith reaches across me and punches Marcus hard on the thigh. Marcus, younger, smaller, but always stubborn, always tough, punches back. I grab each boy’s fist and squeeze. I’m bigger and stronger than both of them and I’ve always had strong hands. The boys squirm in pain and try to pull away. After a moment, I let them go. Lesson learned. They let each other alone for at least a minute or two.

                    In my dream, their pain doesn’t hurt me the way it always did when we were growing up. Back then, since I was the oldest, I was held responsible for their behavior. I had to control them even though I couldn’t escape their pain. My father and stepmother cut me as little slack as possible when it came to my hyperempathy syndrome. They refused to let me be handicapped. I was the oldest kid, and that was that. I had my responsibilities.

                    Nevertheless I used to feel every damned bruise, cut, and burn that my brothers managed to collect. Each time I saw them hurt, I shared their pain as though I had been injured myself. Even pains they pretended to feel, I did feel. Hyperempathy syndrome is a delusional disorder, after all. There’s no telepathy, no magic, no deep spiritual awareness. There’s just the neurochemically-induced delusion that I feel the pain and pleasure that I see others experiencing. Pleasure is rare, pain is plentiful, and, delusional or not, it hurts like hell.

                    So why do I miss it now?

                    What a crazy thing to miss. Not feeling it should be like having a toothache vanish away. I should be surprised and happy. Instead, I’m afraid. A part of me is gone. Not being able to feel my brothers’ pain is like not being able to hear them when they shout, and I’m afraid.

                    The dream begins to become a nightmare.

                    Without warning, my brother Keith vanishes. He’s just gone. He was the first to go—to die—years ago. Now he’s vanished again. In his place beside me, there is a tall, beautiful woman, black-brown-skinned and slender with long, crow-black hair, gleaming. She’s wearing a soft, silky green dress that flows and twists around her body, wrapping her in some intricate pattern of folds and gathers from neck to feet. She is a stranger.

                    She is my mother.

                    She is the woman in the one picture my father gave me of my biological mother. Keith stole it from my bedroom when he was nine and I was twelve. He wrapped it in an old piece of a plastic tablecloth and buried it in our garden between a row of squashes and a mixed row of corn and beans. Later, he claimed it wasn’t his fault that the picture was ruined by water and by being walked on. He only hid it as a joke. How was he supposed to know anything would happen to it? That was Keith. I beat the hell out of him. I hurt myself too, of course, but it was worth it. That was one beating he never told our parents about.

                    But the picture was still ruined. All I had left was the memory of it. And here was that memory, sitting next to me.

                    My mother is tall, taller than I am, taller than most people. She’s not pretty. She’s beautiful. I don’t look like her. I look like my father, which he used to say was a pity. I don’t mind. But she is a stunning woman.

                    I stare at her, but she does not turn to look at me. That, at least, is true to life. She never saw me. As I was born, she died. Before that, for two years, she took the popular “smart drug” of her time. It was a new prescription medicine called Paracetco, and it was doing wonders for people who had Alzheimer’s disease. It stopped the deterioration of their intellectual function and enabled them to make excellent use of whatever memory and thinking ability they had left. It also boosted the performance of ordinary, healthy young people. They read faster, retained more, made more rapid, accurate connections, calculations, and conclusions. As a result, Paracetco became as popular as coffee among students, and, if they meant to compete in any of the highly paid professions, it was as necessary as a knowledge of computers.

                    My mother’s drug taking may have helped to kill her. I don’t know for sure. My father didn’t know either. But I do know that her drug left its unmistakable mark on me—my hyperempathy syndrome. Thanks to the addictive nature of Paracetco—a few thousand people died trying to break the habit—there were once tens of millions of us.

                    Hyperempaths, we’re called, or hyperempathists, or sharers. Those are some of the polite names, And in spite of our vulnerability and our high mortality rate, there are still quite a few of us.

                    I reach out to my mother. No matter what she’s done, I want to know her. But she won’t look at me. She won’t even turn her head. And somehow, I can’t quite reach her, can’t touch her. I try to get up from my chair, but I can’t move. My body won’t obey me. I can only sit and listen as my father preaches.

                    Now I begin to know what he is saying. He has been an indistinct background rumble until now, but now I hear him reading from the twenty-fifth chapter of Matthew, quoting the words of Christ:

                    “ ‘For the kingdom of Heaven is as a man traveling into a far country who called his own servants, and delivered unto them his goods. And unto One he gave five talents, to another two, and to another one; to every man according to his several ability; and straightway took his journey’ ”

                    My father loved parables—stories that taught, stories that presented ideas and morals in ways that made pictures in people’s minds. He used the ones he found in the Bible, the ones he plucked from history, or from folk tales, and of course he used those he saw in his life and the lives of people he knew. He wove stories into his Sunday sermons, his Bible classes, and his computer-delivered history lectures. Because he believed stories were so important as teaching tools, I learned to pay more attention to them than I might have otherwise. I could quote the parable that he was reading now, the parable of the talents. I could quote several Biblical parables from memory. Maybe that’s why I can hear and understand so much now. There is preaching between the bits of the parable, but I can’t quite understand it. I hear its rhythms rising and falling, repeating and varying, shouting and whispering. I hear them as I’ve always heard them, but I can’t catch the words—except for the words of the parable.

                    “ ‘Then he that had received the five talents went and traded with the same and made them another five talents. And likewise he that had received two, he also gained another two. But he that had received one went out and digged in the earth, and hid his lord’s money.’ ”

                    My father was a great believer in education, hard work, and personal responsibility. “Those are our talents,” he would say as my brothers’ eyes glazed over and even I tried not to sigh. “God has given them to us, and he’ll judge us according to how we use them.”

                    The parable continues. To each of the two servants who had traded well and made profit for their lord, the lord said, “ ‘Well done, thou good and faithful servant; thou hast been faithful over a few things, I will make thee ruler over many things: enter thou into the joy of thy lord.’ ”

                    But to the servant who had done nothing with his silver talent except bury it in the ground to keep it safe, the lord said harsher words. “ ‘Thou wicked and slothful servant …’ ” he began. And he ordered his men to, “ ‘Take therefore the talent from him and give it unto him which hath ten talents. For unto everyone that hath shall be given, and he shall have in abundance: but from him that hath not shall be taken away even that which he hath.’ ”

                    When my father has said these words, my mother vanishes. I haven’t even been able to see her whole face, and now she’s gone.

                    I don’t understand this. It scares me. I can see now that other people are vanishing too. Most have already gone. Beloved ghosts.…

                    My father is gone. My stepmother calls out to him in Spanish the way she did sometimes when she was excited, “No! How can we live now? They’ll break in. They’ll kill us all! We must build the wall higher!”

                    And she’s gone. My brothers are gone. I’m alone—as I was alone that night five years ago. The house is ashes and rubble around me. It doesn’t burn or crumble or even fade to ashes, but somehow, in an instant, it is a ruin, open to the night sky. I see stars, a quarter moon, and a streak of light, moving, rising into the sky like some life force escaping. By the light of all three of these, I see shadows, large, moving, threatening. I fear these shadows, but I see no way to escape them. The wall is still there, surrounding our neighborhood, looming over me much higher than it ever truly did. So much higher.…It was supposed to keep danger out. It failed years ago. Now it fails again. Danger is walled in with me. I want to run, to escape, to hide, but now my own hands, my feet begin to fade away. I hear thunder. I see the streak of light rise higher in the sky, grow brighter.

                    Then I scream. I fall. Too much of my body is gone, vanished away. I can’t stay upright, can’t catch myself as I fall and fall and fall.…

                    I awoke here in my cabin at Acorn, tangled in my blankets, half on and half off my bed. Had I screamed aloud? I didn’t know. I never seem to have these nightmares when Bankole is with me, so he can’t tell me how much noise I make. It’s just as well. His practice already costs him enough sleep, and this night must be worse than most for him.

                    It’s three in the morning now, but last night, just after dark, some group, some gang, perhaps, attacked the Dovetree place just north of us. There were, yesterday at this time, 22 people living at Dovetree—the old man, his wife, and his two youngest daughters; his five married sons, their wives and their kids. All of these people are gone except for the two youngest wives and the three little children they were able to grab as they ran. Two of the kids are hurt, and one of the women has had a heart attack, of all things. Bankole has treated her before. He says she was born with a heart defect that should have been taken care of when she was a baby. But she’s only twenty, and around the time she was born, her family, like most people, had little or no money. They worked hard themselves and put the strongest of their kids to work at ages eight or ten. Their daughter’s heart problem was always either going to kill her or let her live. It wasn’t going to be fixed.

                    Now it had nearly killed her. Bankole was sleeping—or more likely staying awake—in the clinic room of the school tonight, keeping an eye on her and the two injured kids. Thanks to my hyperempathy syndrome, he can’t have his clinic here at the house. I pick up enough of other people’s pain as things are, and he worries about it. He keeps wanting to give me some stuff that prevents my sharing by keeping me sleepy, slow, and stupid. No, thanks!

                    So I awoke alone, soaked with sweat, and unable to get back to sleep. It’s been years since I’ve had such a strong reaction to a dream. As I recall, the last time was five years ago right after we settled here, and it was this same damned dream. I suppose it’s come back to me because of the attack on Dovetree.

                    That attack shouldn’t have happened. Things have been quieting down over the past few years. There’s still crime, of course—robberies, break-ins, abductions for ransom or for the slave trade. Worse, the poor still get arrested and indentured for indebtedness, vagrancy, loitering, and other “crimes.” But this thing of raging into a community and killing and burning all that you don’t steal seems to have gone out of fashion. I haven’t heard of anything like this Dovetree raid for at least three years.

                    Granted, the Dovetrees did supply the area with home-distilled whiskey and homegrown marijuana, but they’ve been doing that since long before we arrived. In fact, they were the best-armed farm family in the area because their business was not only illegal, but lucrative. People have tried to rob them before, but only the quick, quiet burglar-types have had any success. Until now.

                    I questioned Aubrey, the healthy Dovetree wife, while Bankole was working on her son. He had already told her that the little boy would be all right, and I felt that we had to find out what she knew, no matter how upset she was. Hell, the Dovetree houses are only an hour’s walk from here down the old logging road. Whoever hit Dovetree, we could be next on their list.

                    Aubrey told me the attackers wore strange clothing, She and I talked in the main room of the school, a single, smoky oil lamp between us on one of the tables. We sat facing one another across the table, Aubrey glancing every now and then at the clinic room, where Bankole had cleaned and eased her child’s scrapes, burns, and bruises. She said the attackers were men, but they wore belted black tunics—black dresses, she called them—which hung to their thighs. Under these, they wore ordinary pants—either jeans or the kind of camouflage pants that she had seen soldiers wear.

                    “They were like soldiers,” she said. “They sneaked in, so quiet. We never saw them until they started shooting at us. Then, bang! All at once. They hit all our houses. It was like an explosion—maybe twenty or thirty or more guns going off all at just the same time.”

                    And that wasn’t the way gangs operated. Gangsters would have fired raggedly, not in unison. Then they would have tried to make individual names for themselves, tried to grab the best-looking women or steal the best stuff before their friends could get it.

                    “They didn’t steal or burn anything until they had beaten us, shot us.” Aubrey said. “Then they took our fuel and went straight to our fields and burned our crops. After that, they raided the houses and barns. They all wore big white crosses on their chests—crosses like in church. But they killed us. They even shot the kids. Everybody they found, they killed them. I hid with my baby or they would have shot him and me.” Again, she stared toward the clinic room.

                    That killing of children…that was a hell of a thing. Most thugs—except for the worst psychotics—would keep the kids alive for rape and then for sale. And as for the crosses, well, gangsters might wear crosses on chains around their necks, but that wasn’t the sort of thing most of their victims would get close enough to notice. And gangsters were unlikely to run around in matching tunics all sporting white crosses on their chests. This was something new.

                    Or something old.

                    I didn’t think of what it might be until after I had let Aubrey go back to the clinic to bed down next to her child. Bankole had given him something to help him sleep. He did the same for her, so I won’t be able to ask her anything more until she wakes up later this morning. I couldn’t help wondering, though, whether these people, with their crosses, had some connection with my current least favorite presidential candidate, Texas Senator Andrew Steele Jarret. It sounds like the sort of thing his people might do—a revival of something nasty out of the past. Did the Ku Klux Klan wear crosses—as well as burn them? The Nazis wore the swastika, which is a kind of cross, but I don’t think they wore it on their chests. There were crosses all over the place during the Inquisition and before that, during the Crusades. So now we have another group that uses crosses and slaughters people. Jarret’s people could be behind it. Jarret insists on being a throwback to some earlier, “simpler” time. Now does not suit him. Religious tolerance does not suit him. The current state of the country does not suit him. He wants to take us all back to some magical time when everyone believed in the same God, worshipped him in the same way, and understood that their safety in the universe depended on completing the same religious rituals and stomping anyone who was different. There was never such a time in this country. But these days when more than half the people in the country can’t read at all, history is just one more vast unknown to them.

                    Jarret supporters have been known, now and then, to form mobs and burn people at the stake for being witches. Witches! In 2032! A witch, in their view, tends to be a Moslem, a Jew, a Hindu, a Buddhist, or, in some parts of the country, a Mormon, a Jehovah’s Witness, or even a Catholic. A witch may also be an atheist, a “cultist,” or a well-to-do eccentric. Well-to-do eccentrics often have no protectors or much that’s worth stealing. And “cultist” is a great catchall term for anyone who fits into no other large category, and yet doesn’t quite match Jarret’s version of Christianity. Jarret’s people have been known to beat or drive out Unitarians, for goodness’ sake. Jarret condemns the burnings, but does so in such mild language that his people are free to hear what they want to hear. As for the beatings, the tarring and feathering, and the destruction of “heathen houses of devil-worship,” he has a simple answer: “Join us! Our doors are open to every nationality, every race! Leave your sinful past behind, and become one of us. Help us to make America great again.” He’s had notable success with this carrot-and-stick approach. Join us and thrive, or whatever happens to you as a result of your own sinful stubbornness is your problem. His opponent Vice President Edward Jay Smith calls him a demagogue, a rabble-rouser, and a hypocrite. Smith is right, of course, but Smith is such a tired, gray shadow of a man. Jarret, on the other hand, is a big, handsome, black-haired man with deep, clear blue eyes that seduce people and hold them. He has a voice that’s a whole-body experience, the way my father’s was. In fact, I’m sorry to say, Jarret was once a Baptist minister like my father. But he left the Baptists behind years ago to begin his own “Christian America” denomination. He no longer preaches regular CA sermons at CA churches or on the nets, but he’s still recognized as head of the church.

                    It seems inevitable that people who can’t read are going to lean more toward judging candidates on the way they look and sound than on what they claim they stand for. Even people who can read and are educated are apt to pay more attention to good looks and seductive lies than they should. And no doubt the new picture ballots on the nets will give Jarret an even greater advantage.

                    Jarret’s people see alcohol and drugs as Satan’s tools. Some of his more fanatical followers might very well be the tunic-and-cross gang who destroyed Dovetree.

                    And we are Earthseed. We’re “that cult,” “those strange people in the hills,” “those crazy fools who pray to some kind of god of change.” We are also, according to some rumors I’ve heard, “those devil-worshiping hill heathens who take in children. And what do you suppose they do with them?” Never mind that the trade in abducted or orphaned children or children sold by desperate parents goes on all over the country and everyone knows it. No matter. The hint that some cult is taking in children for “questionable purposes” is enough to make some people irrational.

                    That’s the kind of rumor that could hurt us even with people who aren’t Jarret supporters. I’ve only heard it a couple of times, but it’s still scary.

                    At this point, I just hope that the people who hit Dovetree were some new gang, disciplined and frightening, but only after profit. I hope.…

                    But I don’t believe it. I do suspect that Jarret’s people had something to do with this. And I think I’d better say so today at Gathering. With Dovetree fresh in everyone’s mind, people will be ready to cooperate, have more drills and scatter more caches of money, food, weapons, records, and valuables. We can fight a gang. We’ve done that before when we were much less prepared than we are now. But we can’t fight Jarret. In particular, we can’t fight President Jarret. President Jarret, if the country is mad enough to elect him, could destroy us without even knowing we exist.

                    We are now 59 people—64 with the Dovetree women and children, if they stay. With numbers like that, we barely do exist. All the more reason, I suppose, for my dream.

                    My “talent,” going back to the parable of the talents, is Earthseed. And although I haven’t buried it in the ground, I have buried it here in these coastal mountains, where it can grow at about the same speed as our redwood trees. But what else could I have done? If I had somehow been as good at rabble-rousing as Jarret is, then Earthseed might be a big enough movement by now to be a real target. And would that be better?

                    I’m jumping to all kinds of unwarranted conclusions. At least I hope they’re unwarranted. Between my horror at what’s happened down at Dovetree and my hopes and fears for my own people, I’m upset and at loose ends and, perhaps, just imagining things.""";
        }
        public static File getPureMLK11(){
            return new File("src/sample/Pure-MLK-11-Speeches.txt");
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
            ignorers = new char[]{'\n', ',','.','’','“','”','-','?','—','!',';','á','ó','"','í',':',')','(','1','é','\'','ú','0','2','9','_','‘','5','8','3','…','6','*','4','7','è','•','ë','[',']','§','–','$','ü','ï','/','ö','à','#','ê','â','&','%','ç','Á','ç','Á','ä','ô','Ñ','À','=','œ','œ','`','æ','æ','î','É','+','~','@','⟨', '⟩'};
        }
        if (ignorerSet == 1){
            ignorers = new char[] {'\n',' ', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '[', ']', '\\', ';', '\'', ',', '.', '/', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '{', '}', '|', ':', '"', '<', '>', '?', '¡', '™', '£', '¢', '∞', '§', '¶', '•', 'ª', 'º', '–', '≠', 'œ', '∑', '´', '®', '†', '¥', '¨', 'ˆ', 'ø', 'π', '“', '‘', '«', 'å', 'ß', '∂', 'ƒ', '©', '˙', '∆', '˚', '¬', '…', 'æ', 'Ω', '≈', 'ç', '√', '∫', '˜', 'µ', '≤', '≥', '÷', '⁄', '€', '‹', '›', 'ﬁ', 'ﬂ', '‡', '°', '·', '‚', '—', '±', 'Œ', '„', '´', '‰', 'ˇ', 'Á', '¨', 'ˆ', 'Ø', '∏', '”', '’', '»', 'Å', 'Í', 'Î', 'Ï', '˝', 'Ó', 'Ô', '', 'Ò', 'Ú', 'Æ', '¸', '˛', 'Ç', '◊', 'ı', '˜', 'Â', '¯', '˘', '¿', 'è', 'é', 'ê', 'ë', 'ē', 'ė', 'ę', 'ÿ', 'û', 'ü', 'ù', 'ú', 'ū', 'î', 'ï', 'í', 'ī', 'į', 'ì', 'ô', 'ö', 'ò', 'ó', 'œ', 'ø', 'ō', 'õ', 'à', 'á', 'â', 'ä', 'æ', 'ã', 'å', 'ā', 'ß', 'ś', 'š', 'ł', 'ž', 'ź', 'ż', 'ç', 'ć', 'č', 'ñ', 'ń', 'È', 'É', 'Ê', 'Ë', 'Ē', 'Ė', 'Ę', 'Ÿ', 'Û', 'Ü', 'Ù', 'Ú', 'Ū', 'Î', 'Ï', 'Í', 'Ī', 'Į', 'Ì', 'Ô', 'Ö', 'Ò', 'Ó', 'Œ', 'Ø', 'Ō', 'Õ', 'À', 'Á', 'Â', 'Ä', 'Æ', 'Ã', 'Å', 'Ā', 'Ś', 'Š', 'Ł', 'Ž', 'Ź', 'Ż', 'Ç', 'Ć', 'Č', 'Ñ', 'Ń', '‖', '‗', '⟨', '⟩'};
        }
        if (ignorerSet == 2){
            ignorers = new char[] {'\n',' ', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '[', ']', '\\', ';', ',', '.', '/', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '{', '}', '|', ':', '"', '<', '>', '?', '¡', '™', '£', '¢', '∞', '§', '¶', '•', 'ª', 'º', '–', '≠', 'œ', '∑', '´', '®', '†', '¥', '¨', 'ˆ', 'ø', 'π', '“', '«', '©', '˙', '∆', '˚', '¬', '…', 'Ω', '≈', '√', '∫', '˜', 'µ', '≤', '≥', '÷', '⁄', '€', '‹', '›', 'ﬁ', 'ﬂ', '‡', '°', '·', '‚', '—', '±', '„', '´', '‰', 'ˇ', '¨', 'ˆ', 'Ø', '∏', '”', '’', '»', '˝', '', '¸', '˛', '◊', 'ı', '˜', '¯', '˘', '¿', '‖', '‗', '⟨', '⟩'};
        }
    }
    public CharSet(boolean streamLineIgnorers){
        if (streamLineIgnorers){
            ignorers = new char[]{'\n', ',','.','’','“','”','-','?','—','!',';','á','ó','"','í',':',')','(','1','é','\'','ú','0','2','9','_','‘','5','8','3','…','6','*','4','7','è','•','ë','[',']','§','–','$','ü','ï','/','ö','à','#','ê','â','&','%','ç','Á','ç','Á','ä','ô','Ñ','À','=','œ','œ','`','æ','æ','î','É','+','~','@'};
        }
        if (!streamLineIgnorers){
            ignorers = new char[] {'\n',' ', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', '[', ']', '\\', ';', '\'', ',', '.', '/', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '{', '}', '|', ':', '"', '\"', '<', '>', '?', '¡', '™', '£', '¢', '∞', '§', '¶', '•', 'ª', 'º', '–', '≠', 'œ', '∑', '´', '®', '†', '¥', '¨', 'ˆ', 'ø', 'π', '“', '‘', '«', 'å', 'ß', '∂', 'ƒ', '©', '˙', '∆', '˚', '¬', '…', 'æ', 'Ω', '≈', 'ç', '√', '∫', '˜', 'µ', '≤', '≥', '÷', '⁄', '€', '‹', '›', 'ﬁ', 'ﬂ', '‡', '°', '·', '‚', '—', '±', 'Œ', '„', '´', '‰', 'ˇ', 'Á', '¨', 'ˆ', 'Ø', '∏', '”', '’', '»', 'Å', 'Í', 'Î', 'Ï', '˝', 'Ó', 'Ô', '', 'Ò', 'Ú', 'Æ', '¸', '˛', 'Ç', '◊', 'ı', '˜', 'Â', '¯', '˘', '¿', 'è', 'é', 'ê', 'ë', 'ē', 'ė', 'ę', 'ÿ', 'û', 'ü', 'ù', 'ú', 'ū', 'î', 'ï', 'í', 'ī', 'į', 'ì', 'ô', 'ö', 'ò', 'ó', 'œ', 'ø', 'ō', 'õ', 'à', 'á', 'â', 'ä', 'æ', 'ã', 'å', 'ā', 'ß', 'ś', 'š', 'ł', 'ž', 'ź', 'ż', 'ç', 'ć', 'č', 'ñ', 'ń', 'È', 'É', 'Ê', 'Ë', 'Ē', 'Ė', 'Ę', 'Ÿ', 'Û', 'Ü', 'Ù', 'Ú', 'Ū', 'Î', 'Ï', 'Í', 'Ī', 'Į', 'Ì', 'Ô', 'Ö', 'Ò', 'Ó', 'Œ', 'Ø', 'Ō', 'Õ', 'À', 'Á', 'Â', 'Ä', 'Æ', 'Ã', 'Å', 'Ā', 'Ś', 'Š', 'Ł', 'Ž', 'Ź', 'Ż', 'Ç', 'Ć', 'Č', 'Ñ', 'Ń', '‖', '‗', '⟨', '⟩'};
        }
        wholeShebang = makeWholeShebang();
    }
    public File getLanguage_Manipulation_UniqueWords_TrainerReservoir(){return new File("src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt");}
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
//    public ArrayList<SortingAttribute> goThroughIndicesOfWordsAndCountTheirOccurrences(String text, ArrayList<String> strings){
//        ArrayList<SortingAttribute>rtn = new ArrayList<>();
//        for (int a = 0; a < strings.size(); a++) {
//            int occurrences = 0;
//            Scanner sc = new Scanner(text);
//            while (sc.hasNext()){
//                String next = removeIgnorers(sc.next().toLowerCase(), new String[]{""});
//                if (next.equalsIgnoreCase(strings.get(a))){
//                    occurrences++;
//                }
//            }
//            rtn.add(new SortingAttribute(a, occurrences));
//        }
//        return rtn;
//    }
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
    public ArrayList<Double> findCoincidenceIndices(String string){
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
        return CoincidenceIndices;
    }
    public int findKeyLengthByIndexOfCoincidenceAndKasiski(String string, int examineTopX){
        ArrayList<Double> CoincidenceIndices = findCoincidenceIndices(string);
        int best = g(CoincidenceIndices);
        HashMap<Integer, Double> lengthAndIOC = new HashMap<>();
        for (int i = 0; i < CoincidenceIndices.size(); i++) {
            lengthAndIOC.put(i+1, CoincidenceIndices.get(i));
        }
        List<Map.Entry<Integer, Double> > list = new LinkedList<>(lengthAndIOC.entrySet());

        // Sort the list
        list.sort(Map.Entry.comparingByValue());

        // put data from sorted list to hashmap
        HashMap<Integer, Double> sortedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Double> aa : list) {
            sortedHashMap.put(aa.getKey(), aa.getValue());
        }
        ArrayList<SortableV4> sortables = new ArrayList<>();
        sortedHashMap.forEach((key, value) -> sortables.add(new SortableV4(key, value)));
        ArrayList<SortableV4> topx = new ArrayList<>();
        for (int i = sortables.size()-1; i > sortables.size()-(examineTopX+1); i--){topx.add(sortables.get(i));}
        for (SortableV4 sv4:topx){
            System.out.println(sv4.get_integer() + " "+sv4.get_double());
        }
        System.out.println(Arrays.toString(KasiskiAnalysis(string)));
        int KasiskiRecommendation = calculateLengthViaKasiski(string);
        int FinalRecommendation = best;
        ArrayList<SortableV5> top2 = new ArrayList<SortableV5>();
        boolean found = false;
        FinalRecommendation = topx.get(0).get_integer();
        for (int i = 0; i < topx.size(); i++) {
            SortableV4 sv4 = topx.get(i);
            if ((int) sv4.get_integer() == KasiskiRecommendation) {
                top2.add(new SortableV5(sv4.get_integer(), sv4.get_double(), i, 0));
            }
        }
        for (int i = 0; i < topx.size(); i++) {
            SortableV4 sv4 = topx.get(i);
            if ((int) sv4.get_integer() == KasiskiRecommendation*2) {
                top2.add(new SortableV5(sv4.get_integer(), sv4.get_double(), i, 0));
            }
        }
        if (top2.size() == 2){
            SortableV5 _0 = top2.get(0);
            SortableV5 _1 = top2.get(1);
            if (Math.abs(_0.getDouble()-EIOC) < Math.abs(_1.getDouble()-EIOC)){
                top2.set(0, new SortableV5(_0.getInteger1(), _0.getDouble(), _0.getInteger2(), _0.getPoints()+1));
            }
            else {
                top2.set(1, new SortableV5(_1.getInteger1(), _1.getDouble(), _1.getInteger2(), _1.getPoints()+1));
            }
            if (_0.getInteger2() < _1.getInteger2()){
                top2.set(0, new SortableV5(_0.getInteger1(), _0.getDouble(), _0.getInteger2(), _0.getPoints()+1));
            }
            else {
                top2.set(1, new SortableV5(_1.getInteger1(), _1.getDouble(), _1.getInteger2(), _1.getPoints()+1));
            }
            if (_0.getInteger1()/2 == _1.getInteger1()){
                top2.set(1, new SortableV5(_1.getInteger1(), _1.getDouble(), _1.getInteger2(), _1.getPoints()+1));
            }
            else {
                if (_1.getInteger1() / 2 == _0.getInteger1()) {
                    top2.set(0, new SortableV5(_0.getInteger1(), _0.getDouble(), _0.getInteger2(), _0.getPoints()+1));
                }
            }
            if (_0.getPoints() > _1.getPoints()){
                FinalRecommendation = _0.getInteger1();
            }
            else {
                if (_0.getPoints() < _1.getPoints()){
                    FinalRecommendation = _1.getInteger1();
                }
                else {
                    if (_0.getPoints() == _1.getPoints()){
                        if (Math.abs(_0.getDouble()-EIOC) < Math.abs(_1.getDouble()-EIOC)){
                            FinalRecommendation = _0.getInteger1();
                        }
                        else {
                            FinalRecommendation = _1.getInteger1();
                        }
                    }
                }
            }
            if ((_0.getInteger1() == 7 && _1.getInteger1() == 14)){
                if (_0.getInteger2() < _1.getInteger2()){
                    FinalRecommendation = _0.getInteger1();
                }
            }
            else {
                if ((_0.getInteger1() == 14 && _1.getInteger1() == 7)){
                    if (_1.getInteger2() < _0.getInteger2()){
                        FinalRecommendation = _1.getInteger1();
                    }
                }
            }
        }
        else {
            for (SortableV4 sv4 : topx) {
                if ((int) sv4.get_integer() == KasiskiRecommendation) {
                    found = true;
                    FinalRecommendation = sv4.get_integer();
                }
            }
            if (!found) {
                for (SortableV4 sv4 : topx) {
                    if ((int) sv4.get_integer() == KasiskiRecommendation * 2) {
                        found = true;
                        FinalRecommendation = sv4.get_integer();
                    }
                }
            }
        }
        //        ArrayList<Double> copy = CoincidenceIndices;
//        copy.remove(best-1);
//        int secondBest = g(copy);
//        if (best%secondBest == 0){
//            best = secondBest;
//        }
//        System.out.println(CoincidenceIndices);
        return FinalRecommendation;
    }
        public int g(ArrayList<Double> ci){
        double max = 0;//lowest possible value, so it will always change
        int best = 0;//therefore this also will always change so initial value is irrelevant.
        for (int i = 0; i < ci.size(); i++) {
            double ic = ci.get(i);
            if (ic > max){
                max = ic;
                best = i+1;
            }
        }
        return best;
    }
    public int f(ArrayList<Double> ci){
        double leastDifference = 1;//highest possible value, so it will always change
        int best = 0;//therefore this also will always change so initial value is irrelevant.
        for (int i = 0; i < ci.size(); i++) {
            double difference = Math.abs(ci.get(i)-EIOC);
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
    public String format(String string){
        for (char ignorer: ignorers) {
            if (string.contains(String.valueOf(ignorer))){
                string = "";
                break;
            }
        }
        string = string.toLowerCase();
        return string;
    }
    public String RemoveIgnorers(String string){
        for (char ignorer: ignorers) {
            string = string.replaceAll(escapeIgnorers(ignorer), "");
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
