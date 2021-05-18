package sample;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class LogarithmicRegressor {
    private double iterationsPower;
    ArrayList<ArrayList<Integer>> coordinates;
    ArrayList<Integer> allPointsHit;
    ArrayList<ArrayList<Double>> variableValues;
    double base;
    private long endTime;
    public LogarithmicRegressor(ArrayList<ArrayList<Integer>> coordinates, double Iterate_toTheBaseTimes, double base){
        // y = (a + b log(cx + d))
        System.err.println("new LogarithmicRegressor(coordinates, "+Iterate_toTheBaseTimes+", "+base+");");
        this.base = base;
        this.coordinates = coordinates;
        this.setIterationsPower(Iterate_toTheBaseTimes);
        int iterations = (int) Math.pow(this.base, iterationsPower);
        allPointsHit = new ArrayList<>();
        variableValues = new ArrayList<>();
        double precision = (1.0/(double)iterations);
        int checkPoint = 0;
        for (double a = -iterations; a < iterations; a+= precision) {
            System.err.println("a: "+a);
            for (double b = -iterations; b < iterations; b+=precision) {
                checkPoint++;
                double amountDone = ((double) checkPoint / 625.0);
                System.err.println("b: "+b);
                System.err.println(amountDone);

                for (double c = -iterations; c < iterations; c+=precision) {
                    for (double d = -iterations; d < iterations; d+= precision) {
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

    public LogarithmicRegressor(ArrayList<ArrayList<Integer>> coordinates, int Iterate_FiveToThe__Times) throws FileNotFoundException {
        this(coordinates, Iterate_FiveToThe__Times, 5);
    }

    public LogarithmicRegressor(int Iterate_FiveToThe__Times) throws FileNotFoundException {
        this(new Unique_Words_Accumulator().getCoordinates(), Iterate_FiveToThe__Times);
    }
    public LogarithmicRegressor(double base) throws FileNotFoundException {
        this(new Unique_Words_Accumulator().getCoordinates(), 1, base);
    }
    public LogarithmicRegressor() throws FileNotFoundException {
        this(1);
    }
    public ArrayList<Integer> getAllPointsHit(){return allPointsHit;}
    public ArrayList<ArrayList<Double>> getVariableValues(){return variableValues;}
    private static void p(Object o){
        System.out.println(o);
    }
        private boolean setIterationsPower(double IterationsPower){
        boolean rtn = true;
        if (IterationsPower > 4){
            IterationsPower = 4;
            rtn = false;
        }
        this.iterationsPower = IterationsPower;
        return rtn;
    }
    public int getNumCalculationCycles(){
        return (int) ((Math.pow(base, this.iterationsPower*2)*2)*this.coordinates.size());
    }
}
