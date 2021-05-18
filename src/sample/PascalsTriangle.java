package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalsTriangle extends ArrayList<int[]> {
    public PascalsTriangle(int numRows){
        super();
        this.add(new int[]{1});
        for (int a = 1; a <= numRows; a++) {
            int[] b = new int[a+1];
            b[0]=1;
            b[b.length-1]=1;
            for (int c = 1; c < b.length-1; c++) {
                b[c]=((this.get(a - 1)[c - 1]) + (this.get(a - 1)[c])   );
            }
            this.add(b);
        }
    }
    public int widthAtIndex(int index){
        int[] a = this.get(index);
        int z = (2*a.length)+2; //I think +2 is for the brackets [] on each side,
        // and 2* a.length is because there are 2 uncounted chars, the spacechar and the comma, for each counted index (=length).
        for (int b = 0; b < a.length; b++) {
            int c = a[b];
            String d = String.valueOf(c);
            z+=d.length();
        }
        return z;
    }
    public String rightAligned(){
        StringBuilder sb = new StringBuilder();
        for (int[] ints : this) {
            sb.append(Arrays.toString(ints)).append("\n");
        }
        return sb.toString();
    }
    public String centerAligned(){
       StringBuilder a = new StringBuilder();
        for (int b = 0; b < this.size(); b++) {
            int[] c = this.get(b);
            double d = (this.widthAtIndex(this.size()-1))/2.0;
            double e = (this.widthAtIndex(b))/2.0;
            double f = e-d;
            StringBuilder g = new StringBuilder();
            for (int h = 0; h < f; h++) {
                g.append("\s");
            }
            g.append(Arrays.toString(c));
            a.append(g).append("\n");
        }
        return a.toString();
    }

}