package sample;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class LogarithmicAnalyzer {
    private ArrayList<Integer> allPointsHit;
    ArrayList<ArrayList<Double>> variableValues;

    public LogarithmicAnalyzer() throws FileNotFoundException {
        long start = System.nanoTime();
        System.err.println("new LogarithmicAnalyzer();");
        LogarithmicRegressor logRegressor = new LogarithmicRegressor(new Unique_Words_Accumulator().getCoordinates(), (1.0/10000.0), 1000000);
        this.allPointsHit = logRegressor.getAllPointsHit();
        this.variableValues = logRegressor.getVariableValues();
        System.out.println(goodVarValues());
        long end = logRegressor.EndTime();
        long duration = end-start;
        System.out.println(duration/Math.pow(10,9));
    }
    public LogarithmicAnalyzer(Layer2Regressor layer2){
        long start = System.nanoTime();
        System.err.println("new LogarithmicAnalyzer();");
        this.allPointsHit = layer2.getAllPointsHit();
        this.variableValues = layer2.getVariableValues();
        System.out.println(goodVarValues());
        long end = layer2.EndTime();
        long duration = end-start;
        System.out.println(duration/Math.pow(10,9));
    }
    public static void main(String[] args) throws FileNotFoundException {
        new LogarithmicAnalyzer();
    }
    public ArrayList<ArrayList<Double>> goodVarValues(){
        ArrayList<ArrayList<Double>> goodVarValues = new ArrayList<>();
        int mostPointsHit = mostPointsHit();
        for (int i = 0; i < allPointsHit.size(); i++) {
            if (allPointsHit.get(i) == mostPointsHit){
                goodVarValues.add(this.variableValues.get(i));
            }
        }
        return goodVarValues;
    }

    private int mostPointsHit(){
        int mostHitSoFar = 0;
        for (Integer hits : allPointsHit) {
            if (hits > mostHitSoFar){
                mostHitSoFar = hits;
            }
        }
        return mostHitSoFar;
    }
}
