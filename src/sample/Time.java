package sample;

public class Time {
    private long start;
    private long end;
    private long duration;
    public Time(){
        this.start = System.nanoTime();
    }
    public void end(){
        this.end = System.nanoTime();
        duration = end-start;
    }
    public long getDuration(){
       return duration;
    }
    public long getStart(){return start;}
    public long getEnd(){return end;}
    public void println() {
        double billion = Math.pow(10, 9);
        String s = "duration in nanoseconds = " + duration + "\n";
        if (duration >= billion) {
            double seconds = duration / billion;
            s += "duration in seconds = " + seconds + "\n";
            if (seconds >= 60) {
                SecsToMins calc = new SecsToMins(seconds);
                s += "duration in minutes and seconds = " + calc.get() + "\n";
            }
        }
        System.out.println(s);
    }
}
