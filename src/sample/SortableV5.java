package sample;

public class SortableV5 {
    private Integer integer1;
    private double aDouble;
    private Integer integer2;
    private int Points;
    public SortableV5(Integer i1, double d, int i2, int points) {
        integer1 = i1;
        aDouble = d;
        integer2 = i2;
        Points = points;
    }
    public Integer getInteger1() {
        return integer1;
    }
    public double getDouble() {
        return aDouble;
    }
    public Integer getInteger2() {
        return integer2;
    }
    public int getPoints() {
        return Points;
    }
    public void addPoint(){
        Points+=1;
    }
}
