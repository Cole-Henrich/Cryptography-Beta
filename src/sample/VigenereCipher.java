package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class VigenereCipher {
    private String s;
    private String KeyWord;
    private static final CharSet charSet = new CharSet(1);
    public VigenereCipher(String text, String keyWord){
        KeyWord = keyWord;
        TabulaRecta tabulaRecta = new TabulaRecta();
//        StringBuilder z = new StringBuilder();
//        for (int i = 0; i < text.length(); i++) {
//            if (!charSet.isCapital(String.valueOf(text.charAt(i)))){
//                z.append(String.valueOf(text.charAt(i)).toUpperCase());
//            }
//        }
//        String x = z.toString();
//        StringBuilder z2 = new StringBuilder();
//        x = charSet.removeIgnorers(x, new String[]{""});
//        for (int i = 0; i < KeyWord.length(); i++) {
//            if (!charSet.isCapital(String.valueOf(KeyWord.charAt(i)))){
//                z2.append(String.valueOf(KeyWord.charAt(i)).toUpperCase());
//            }
//        }
//        String keyWord = z2.toString();
        String x = text;
        x = charSet.RemoveIgnorers(x);

        VigenereKeyPhrase vigenereKeyPhrase = new VigenereKeyPhrase(keyWord, x.length());
        VigenereSplit vigenereSplit = new VigenereSplit(x, vigenereKeyPhrase.get());
        ArrayList<ArrayList<String>> b = vigenereSplit.get(0);
        ArrayList<ArrayList<String>> c = vigenereSplit.get(1);
        StringBuilder d = new StringBuilder();
        for (int e = 0; e < vigenereSplit.get(0).size(); e++) {
            ArrayList<String> f = b.get(e);
            ArrayList<String> g = c.get(e);
            for (int h = 0; h < f.size(); h++) {
                String i = f.get(h);
                String j = g.get(h);
                String k = tabulaRecta.intersectionOf(i,j);
                d.append(k);
            }
        }
        String l = d.toString();
        String m = charSet.inheritPuncuationAndForm(l, text);
        s = m;
    }
    public VigenereCipher(String text){
        this(text, "HOUGHTON");
    }

    public String getKeyWord() {
        return KeyWord;
    }
    public String get(){
        return s;
    }
    private void testSpeed() throws IOException {
        StringBuilder lbuilder = new StringBuilder();
        File reservoir = charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir();
        Scanner scanner = new Scanner(reservoir);
        int chars = 0;
        while (scanner.hasNextLine()){
            String nextLine = scanner.nextLine();
            lbuilder.append(nextLine);
            chars+=nextLine.length();
            if (chars >= 5000000){break;}
        }
        System.out.println(chars);
        String Long = charSet.removeIgnorers(lbuilder.toString(), new String[]{" "});
        String lkw = "ahdjkeoqie";
        File VigenereEncodeTimes = new File("sample/VigenereEncodeTimes.txt");
        FileWriter fileWriter = new FileWriter(VigenereEncodeTimes);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 200; i++){
            String LongKeyWord = lkw.repeat(i);
            LongKeyWord = LongKeyWord.toUpperCase();
            Time time = new Time();
            String gigantic = new VigenereCipher(Long, LongKeyWord).get();
            time.end();
            time.println();
            sb.append(time.getDuration()).append("\n");
        }
        fileWriter.write(sb.toString());
        fileWriter.close();
    }
    public static void main(String[] args) throws IOException {
        System.out.println(new VigenereCipher("MICHIGAN TECHNOLOGICAL UNIVERSITY").get());
        System.out.println(new VigenereCipher("This is an example of text to be encoded by a Vigenere cipher".toUpperCase(), "vigenere".toUpperCase()).get());
        System.out.println(new VigenereCipher("the quick brown fox jumped over the lazy dog".toUpperCase(), "vigenere".toUpperCase()).get());
        System.out.println(new VigenereCipher("PILONMYCOUSINWEELIESAYSSHEISFIFTYYEARSOLDPILONSAIDEXCITEDLYDANNYSPREADHISHANDSWHATISITHOWOLDINYEARSSHEISHEOBSERVEDPHILOSOPHICALLYSHEISLIVELYTHATONESHEOWNSHERHOUSEANDHASTWOHUNDREDDOLLARSINTHEBANKTHENDANNYBECAMEALITTLEEMBARRASSEDIWOULDLIKETOMAKEAPRESENTTOMRSMORALESPILONANDPABLOREGARDEDTHEIRFEETANDTRIEDBYSTRENUOUSMENTALEFFORTTOWARDOFFWHATWASCOMINGBUTTHEIREFFORTHADNOVALUEIFIHADALITTLEMONEYSAIDDANNYIWOULDBUYHERABOXOFBIGCANDYHELOOKEDMEANINGLYATHISTENANTSBUTNEITHERONEANSWEREDHIMIWOULDNEEDONLYADOLLARORTWOHESUGGESTEDCHINKEEISDRYINGSQUIDSPILONOBSERVEDPERHAPSYOUCOULDCUTSQUIDSFORHALFADAYDANNYSPOKEPOINTEDLYITWOULDNOTLOOKWELLFORAMANWHOOWNSTWOHOUSESTOCUTSQUIDSBUTPERHAPSIFALITTLERENTWEREEVERPAIDPILONAROSEANGRILYALWAYSTHERENTHECRIEDYOUWOULDFORCEUSINTOTHESTREETSINTOTHEG", "aways").get());
    }
}
