package sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Layer2Regressor {
//    [[-1.7999999999999976, 4.800000000000004, 1.4000000000000021, -5.0],
//    [-0.19999999999999785, 4.800000000000004, 1.0000000000000022, -3.5999999999999988],
//    [0.6000000000000022, 4.800000000000004, 1.0000000000000022, -4.3999999999999995],
//    [0.8000000000000023, 4.800000000000004, 0.8000000000000023, -2.799999999999998],
//    [2.4000000000000026, 4.800000000000004, 0.6000000000000022, -2.1999999999999975],
//    [2.6000000000000028, 4.600000000000004, 0.6000000000000022, -2.1999999999999975],
//    [3.000000000000003, 4.800000000000004, 0.6000000000000022, -2.599999999999998],
//    [3.6000000000000036, 4.600000000000004, 0.6000000000000022, -2.799999999999998]]
    private static final ArrayList<ArrayList<Double>> nums = getNums();
    ArrayList<ArrayList<Double>> vars;
    ArrayList<ArrayList<Double>> goodVarVals;
    ArrayList<Double> minimums;
    ArrayList<Double> maximums;
    ArrayList<ArrayList<Double>> MinMaxes;
    ArrayList<Double> mathRanges;
    ArrayList<Double> precisionFactors;
    ArrayList<ArrayList<Integer>> coordinates;
    ArrayList<Integer> allPointsHit;
    ArrayList<ArrayList<Double>> variableValues;
    private long endTime;

    public Layer2Regressor(ArrayList<ArrayList<Double>>goodVarValues, ArrayList<ArrayList<Integer>> coordinates){
       this.goodVarVals = goodVarValues;
       this.vars = vars();
       this.minimums = minimums();
       this.maximums = maximums();
       this.MinMaxes = MinMaxes();
       this.mathRanges = mathRanges();
       this.precisionFactors = precisionFactors();
       this.coordinates = coordinates;
       allPointsHit = new ArrayList<>();
       variableValues = new ArrayList<>();
        for (double A = minimums.get(0); A < maximums.get(0); A +=precisionFactors.get(0)) {
            double a = Double.parseDouble(String.format("%.3g%n", A ));
            for (double B = minimums.get(1);  B < maximums.get(1); B+=precisionFactors.get(1)) {
                double b = Double.parseDouble(String.format("%.3g%n", B));
                for (double C = minimums.get(2); C < maximums.get(2); C+=precisionFactors.get(2)) {
                    double c = Double.parseDouble(String.format("%.3g%n", C));
                    for (double D = minimums.get(3); D < maximums.get(3); D +=precisionFactors.get(3)) {
                        double d = Double.parseDouble(String.format("%.3g%n", D));
                        int pointsHit = 0;
                        for (ArrayList<Integer> coordinatePair : this.coordinates) {
                            int x = coordinatePair.get(0);
                            int y = (int) (a + (b * (Math.log((c * x) + d))));
                            if (y == coordinatePair.get(1)) {
                                pointsHit++;
                            }
                        }
                        if (pointsHit > 0){
                            ArrayList<Double> variableVals = new ArrayList<>();
                            variableVals.add(a);
                            variableVals.add(b);
                            variableVals.add(c);
                            variableVals.add(d);

                            variableValues.add(variableVals);
                            allPointsHit.add(pointsHit);
                        }
                    }
                }
            }
        }
        this.endTime = System.nanoTime();
    }
    public long EndTime(){return endTime;}

    public Layer2Regressor() throws IOException {
        this(nums, new Unique_Words_Accumulator().getCoordinates());
    }
    private ArrayList<Double> precisionFactors(){
        ArrayList<Double> precisionFactors = new ArrayList<>();
        for (Double mathRange : mathRanges) {
            PrecisionFactor pf = new PrecisionFactor(mathRange);
            double precisionFactor = pf.get();
            double precisionFactorRounded = Double.parseDouble(String.format("%.2g%n", precisionFactor));
            precisionFactors.add(precisionFactorRounded);
        }
        return precisionFactors;
    }
    private ArrayList<Double> mathRanges(){
        ArrayList<Double> a_range = MinMaxes.get(0);
        ArrayList<Double> b_range = MinMaxes.get(1);
        ArrayList<Double> c_range = MinMaxes.get(2);
        ArrayList<Double> d_range = MinMaxes.get(3);
        double math_range_a = Double.parseDouble(String.format("%.2g%n", (a_range.get(1)-a_range.get(0))));
        double math_range_b = Double.parseDouble(String.format("%.2g%n", (b_range.get(1)-b_range.get(0))));
        double math_range_c = Double.parseDouble(String.format("%.2g%n", (c_range.get(1)-c_range.get(0))));
        double math_range_d = Double.parseDouble(String.format("%.2g%n", (d_range.get(1)-d_range.get(0))));
        ArrayList<Double> mathRanges = new ArrayList<>();
        mathRanges.add(math_range_a);
        mathRanges.add(math_range_b);
        mathRanges.add(math_range_c);
        mathRanges.add(math_range_d);
        return mathRanges;
    }
    private ArrayList<ArrayList<Double>> MinMaxes(){
        ArrayList<ArrayList<Double>> MinMaxes = new ArrayList<>();
        for (int i = 0; i < minimums.size(); i++) {
            double min = minimums.get(i);
            double max = maximums.get(i);
            ArrayList<Double> minmax = new ArrayList<>();
            minmax.add(min);
            minmax.add(max);
            MinMaxes.add(minmax);
        }
        return MinMaxes;
    }
    private ArrayList<Double> maximums(){
        ArrayList<Double> maximums = new ArrayList<>();
        for (ArrayList<Double> varset : vars) {
            double varMax = -100;
            for (double varval : varset) {
                if (varval > varMax) {
                    varMax = varval;
                }
            }
            maximums.add(Double.parseDouble(String.format("%.2g%n",varMax)));
        }
        return maximums;
    }
    private ArrayList<Double> minimums(){
        ArrayList<Double> minimums = new ArrayList<>();
        for (ArrayList<Double> varset : vars) {
            double varMin = 100;
            for (double varval : varset) {
                if (varval < varMin) {
                    varMin = varval;
                }
            }
            minimums.add(Double.parseDouble(String.format("%.2g%n",varMin)));
        }
        return minimums;
    }
    private ArrayList<ArrayList<Double>> vars(){
        ArrayList<ArrayList<Double>> v = new ArrayList<>();
        for (int i = 0; i < goodVarVals.get(0).size(); i++) {
            ArrayList<Double> varSet = new ArrayList<>();
            for (ArrayList<Double> goodVarVal : goodVarVals) {
                varSet.add(goodVarVal.get(i));
            }
            v.add(varSet);
        }
        return v;
    }



    private static ArrayList<ArrayList<Double>> getNums(){
        ArrayList<Double> a = new ArrayList<>(Arrays.asList(-1.7999999999999976, 4.800000000000004, 1.4000000000000021, -5.0));
        ArrayList<Double> b = new ArrayList<>(Arrays.asList(-0.19999999999999785, 4.800000000000004, 1.0000000000000022, -3.5999999999999988));
        ArrayList<Double> c = new ArrayList<>(Arrays.asList(0.6000000000000022, 4.800000000000004, 1.0000000000000022, -4.3999999999999995));
        ArrayList<Double> d = new ArrayList<>(Arrays.asList(0.8000000000000023, 4.800000000000004, 0.8000000000000023, -2.799999999999998));
        ArrayList<Double> e = new ArrayList<>(Arrays.asList(2.4000000000000026, 4.800000000000004, 0.6000000000000022, -2.199999999999997));
        ArrayList<Double> f = new ArrayList<>(Arrays.asList(2.6000000000000028, 4.600000000000004, 0.6000000000000022, -2.1999999999999975));
        ArrayList<Double> g = new ArrayList<>(Arrays.asList(3.000000000000003, 4.800000000000004, 0.6000000000000022, -2.599999999999998));
        ArrayList<Double> h = new ArrayList<>(Arrays.asList(3.6000000000000036, 4.600000000000004, 0.6000000000000022, -2.799999999999998));
        ArrayList<ArrayList<Double>> unRounded = new ArrayList<>(Arrays.asList(a,b,c,d,e,f,g,h));
        ArrayList<ArrayList<Double>> rounded = new ArrayList<>();
        for (ArrayList<Double> dubArray: unRounded) {
            ArrayList<Double> rounders = new ArrayList<>();
            for (Double dub: dubArray){
                String s = String.format("%.2g%n", dub);
                double round = Double.parseDouble(s);
                rounders.add(round);
            }
            rounded.add(rounders);
        }
        return rounded;
    }
    public ArrayList<ArrayList<Double>> getVars(){return vars;}
    public ArrayList<ArrayList<Double>> getGoodVarVals(){return goodVarVals;}
    public ArrayList<Double> getMinimums(){return minimums;}
    public ArrayList<Double> getMaximums(){return maximums;}
    public ArrayList<ArrayList<Double>> getMinMaxes(){return MinMaxes;}
    public ArrayList<Double> getMathRanges(){return mathRanges;}
    public ArrayList<Double> getPrecisionFactors(){return precisionFactors;}
    public ArrayList<Integer> getAllPointsHit(){return allPointsHit;}
    public ArrayList<ArrayList<Double>> getVariableValues(){return variableValues;}


    public static void main(String[] args) throws IOException {
        Layer2Regressor l2 = new Layer2Regressor();
        System.out.println(getNums()+ "\n\n" + l2.vars + "\n\n"+l2.minimums+"\n\n"+l2.maximums);
    }
}
