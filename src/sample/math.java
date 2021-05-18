package sample;

import java.util.ArrayList;

public class math {
    public math(){}
    public int factorial(int a){
        for (int b = a-1; b > 0; b--) {
            a*=b;
        }
        return a;
    }

    /**
     * @citation http://mathcentral.uregina.ca/qq/database/qq.02.06/jo1.html#:~:text=Gauss%20noticed%20that%20if%20he,get%20a%20sum%20of%20101.&text=Gauss%20realized%20then%20that%20his,50(101)%20%3D%205050.
     * The sequence of numbers (1, 2, 3, … , 100) is arithmetic and when we are looking for the sum of a sequence,
     * we call it a series.  Thanks to Gauss, there is a special formula we can use to find the sum of a series:
     *
     *s=(n(n+1))/2
     *
     * S is the sum of the series and n is the number of terms in the series, in this case, 100.
     * @param a .
     * @return the summation of a.
     */
    public int sigma(int a){
        double A = (double)a;
        return (int) ((A*(A+1))/2.0);
    }

    /**
     *Alias for sigma.
     */
    public int summation(int a){return sigma(a);}
//    public String avoidOverflow(String l){
////            9223372036854775807
////
////            99999999999999999999
//        int j = l.length();
//        int a = 18;
//        ArrayList<String> f = new ArrayList<>();
//        int g = 0;
//        for (int b = 0, c = b+a-1; b < j-c; b+=a) {
//            StringBuilder d = new StringBuilder();
//            for (int e = b; e < c; e++) {
//                d.append(l.charAt(e));
//                g++;
//            }
//            f.add(d.toString());
//        }
//        StringBuilder h = new StringBuilder();
//        for (int i = 0; i < j; i++) {
//            h.append(l.charAt(i));
//        }
//        f.add(h.toString());
//
//
//    }

    public double reduce(String n, int x){
        StringBuilder sb = new StringBuilder();
        int b = n.length()-x;
        for (int a = 0; a < b; a++) {
            sb.append(n.charAt(a));
        }
        sb.append(".");
        for (int c = b; c < n.length(); c++) {
            sb.append(n.charAt(c));
        }
        String s = sb.toString();
        return Double.parseDouble(s);
    }

    public static void main(String[] args) {
        math maths  = new math();
    }
}
