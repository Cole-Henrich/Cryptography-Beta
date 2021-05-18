package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class _1231sThatExistInText {
    private String text;
    private ArrayList<String>_1231s;
    private ArrayList<SortingAttribute> indicesOfWordsAndTheirOccurrences;
    private ArrayList<SortingAttribute> mostToLeast;
    private ArrayList<String>FullSortedFinalList;
    private final CharSet charSet = new CharSet(true);
    private boolean general;
    public _1231sThatExistInText(String Text, boolean General){
        this.general = General;
        if (general){
            this.text = Text;
            this._1231s = accumulateGenerally();
            System.err.println("completed accumulateGenerally();");
            System.err.println(_1231s.size());
            this.indicesOfWordsAndTheirOccurrences = goThroughIndicesOfWordsAndCountTheirOccurrences();
            System.err.println("completed goThroughIndicesOfWordsAndCountTheirOccurrences(); ");
            this.mostToLeast = SortingAttribute.MOST_TO_LEAST(indicesOfWordsAndTheirOccurrences);
            FullSortedFinalList = new ArrayList<>();
            for (SortingAttribute a : mostToLeast) {FullSortedFinalList.add(_1231s.get(a.getIndex()));}
            this.println();
        }
    }
    public _1231sThatExistInText(String Text){
       this.text = Text;
       this._1231s = accumulate_1231s();
       this.indicesOfWordsAndTheirOccurrences = goThroughIndicesOfWordsAndCountTheirOccurrences();
       this.mostToLeast = SortingAttribute.MOST_TO_LEAST(indicesOfWordsAndTheirOccurrences);
       FullSortedFinalList = new ArrayList<>();
       for (SortingAttribute a : mostToLeast) {FullSortedFinalList.add(_1231s.get(a.getIndex()));}
       this.println();
    }

    private ArrayList<SortingAttribute> goThroughIndicesOfWordsAndCountTheirOccurrences(){
        ArrayList<SortingAttribute>rtn = new ArrayList<>();
        int size = _1231s.size();
        for (int a = 0; a < size; a++) {
            String got = _1231s.get(a);
            System.err.println(a);
            int occurrences = 0;
            Scanner sc = new Scanner(text);
            while (sc.hasNext()){
                String next = sc.next();
                boolean equalIgnoreCase = next.equalsIgnoreCase(got);
                if (equalIgnoreCase) {
                    occurrences++;
                }
                if (!equalIgnoreCase){
                    if (next.contains(got)) {
                        String n = charSet.RemoveIgnorers(next);
                        if (n.length() == got.length()) {
                            if (n.equalsIgnoreCase(got)) {
                                occurrences++;
                            }
                        }
                    }
                }
            }
            sc.close();
            rtn.add(new SortingAttribute(a, occurrences));
        }
        return rtn;
    }
    private ArrayList<String>accumulateGenerally(){
        char[] LocalIgnorers = new char[]{',','.','’','“','”','-','?','—','!',';','á','ó','"','í',':',')','(','1','é','\'','ú','0','2','9','_','‘','5','8','3','…','6','*','4','7','è','•','ë','[',']','§','–','$','ü','ï','/','ö','à','#','ê','â','&','%','ç','ç','ä','ô','=','œ','œ','`','æ','æ','î','+','~','@'};

        Scanner sc = new Scanner(text);
        ArrayList<String> rtn = new ArrayList<>();
        while (sc.hasNext()){
            String next = sc.next();
            for (char localIgnorer : LocalIgnorers) {
                next = next.replace(String.valueOf(localIgnorer), "");
            }
            next = next.toLowerCase();
                if (!rtn.contains(next)){
                    rtn.add(next);
            }
        }
        return rtn;
    }
    private ArrayList<String>accumulate_1231s(){
        Scanner sc = new Scanner(text);
        ArrayList<String> rtn = new ArrayList<>();
        while (sc.hasNext()){
            String next = charSet.RemoveIgnorers(sc.next().toLowerCase());
            _1231 Is = new _1231(next);
            if (Is.is()){
                if (!rtn.contains(next)){
                    rtn.add(next);
                }
            }
        }
        return rtn;
    }
    public ArrayList<SortingAttribute> getMostToLeast(){return mostToLeast;}
    public ArrayList<String>get(){return FullSortedFinalList;}
    public void println(){
        System.out.println(SortingAttribute.println(mostToLeast, _1231s));
    }
    public static void main(String[] args) {
        _1231sThatExistInText test = new _1231sThatExistInText("that was a fat cat that you saw, was that not? Kick is another word like that, so is dead, and pulp, pimp, neon. You kick a soccerball. Will lull fall through?\n");

    }
}
