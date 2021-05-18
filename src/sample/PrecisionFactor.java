package sample;

public class PrecisionFactor {
    private double precisionFactor;
    public PrecisionFactor(double rangeRounded, int numIterations, double overFlow, boolean println){
        double iterations = (double)numIterations;
        double precisionFactor = rangeRounded/iterations;
        for (double i = precisionFactor; i < iterations+overFlow; i+=precisionFactor) {
            if (println) {
                System.out.println(i);
            }
        }
        this.precisionFactor = precisionFactor;
    }
    public PrecisionFactor(double rangeRounded, int numIterations){
        this(rangeRounded, numIterations, 3, false);
    }
    public PrecisionFactor(double rangeRounded, double overFlow){
        this(rangeRounded,  20, overFlow, false);
    }
    public PrecisionFactor(double rangeRounded){
        this(rangeRounded,20);
    }
    public PrecisionFactor(double rangeRounded, boolean println){
        this(rangeRounded,20, 3, println);
    }

    public double get(){return precisionFactor;}
}
