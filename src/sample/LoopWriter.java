package sample;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings({"LawOfDemeter", "FieldMayBeFinal"})
public class LoopWriter {
    private String java;
    private int numLoops;
    public LoopWriter(int NumLoops, char c, String[] notContains, Uniques uniques) throws FileNotFoundException {
        System.err.println("new LoopWriter(int NumLoops: "+NumLoops+", char c:"+c+", String[] notContains:"+ Arrays.toString(notContains) +", Uniques uniques:"+uniques.getClass().descriptorString()+")");
        numLoops = NumLoops;
        StringBuilder Java = new StringBuilder();
        StringSelector stringSelector = new StringSelector(c, notContains, uniques);
        StringFrequencyChecker stringFrequencyChecker = new StringFrequencyChecker(uniques.getFile(), stringSelector);
        SortedArray sorted = new SortedArray(stringFrequencyChecker);
        SortedArray topChoices = sorted.sublist(0,numLoops);
        for (int i = 1; i < topChoices.size(); i++) {
            String word = topChoices.get(i);
            SimilarTo similarTo = new SimilarTo(word, c);
            StatementMaker statementMaker = new StatementMaker(topChoices.get(i-1), similarTo);
            Java.append(statementMaker.get());
        }
        Java.append(endBrackets());
        java = Java.toString();
    }
    private String endBrackets(){
        int numEndBrackets = numLoops + 2;
        StringBuilder sb = new StringBuilder();
        for (int i = numEndBrackets; i > -1; i--) {
            int reps = i*4;
            StringBuilder spacer = new StringBuilder();
            for (int j = 0; j < reps; j++) {
                spacer.append("\s");
            }
            sb.append("\n").append(spacer.toString()).append("}");
        }
        return sb.toString();
    }
    public String get() {
        return java;
    }
}
