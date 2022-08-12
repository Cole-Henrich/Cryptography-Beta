package sample;

import java.util.ArrayList;

public class GenerateJumbleTreeIfsReversed {
    private String s;
    public GenerateJumbleTreeIfsReversed(int min, int max) {
        String start = "if (depth == "+(max-2)+"){childBranch = new ArrayList<";
        StringBuilder sb = new StringBuilder();
        for (int i = min; i <= max; i++) {
            if (i > min) {start += "ArrayList<";}
            start = start.replaceAll(String.valueOf((max-i-1)), String.valueOf(max-i-2));
            sb.append(start).append("String").append(">".repeat(i+1)).append("();}\n");
        }
        /*
        if (fpl == 1){Tree = new ArrayList<String>();}
        if (fpl == 2){Tree = new ArrayList<ArrayList<String>>();}
        if (fpl == 3){Tree = new ArrayList<ArrayList<ArrayList<String>>>();}
        if (fpl == 4){Tree = new ArrayList<ArrayList<ArrayList<ArrayList<String>>>>();}
        if (fpl == 5){Tree = new ArrayList<ArrayList<ArrayList<ArrayList<ArrayList<String>>>>>();}
        if (fpl == 6){Tree = new ArrayList<ArrayList<ArrayList<ArrayList<ArrayList<ArrayList<String>>>>>>();}
         */
        s = sb.toString();
    }

    public String get() {return s;}

    public static void main(String[] args) {
        System.out.println(new GenerateJumbleTreeIfsReversed(0,19).get());
    }
}
