package sample;

public class SecsToMins {
    private int mins;
    private double secs;
    private String minsSecs;
    public SecsToMins(double seconds){
        double a = seconds/60;
        double b = Math.floor(a);
        this.mins = (int) b;
        double c = a-b;
        this.secs = c*60;
        this.minsSecs = mins+":"+secs;
    }
    public String get(){return minsSecs;}
    public int getMins(){return mins;}
    public double getRemainingSeconds(){return secs;}
    public static void main(String[] args) {
        System.out.println(new SecsToMins(701.702729278).get());
    }
}
