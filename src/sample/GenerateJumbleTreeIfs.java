package sample;

import java.util.ArrayList;

public class GenerateJumbleTreeIfs {
    private String s;
    public GenerateJumbleTreeIfs(int min, int max) {
        String start = "if (fpl == 1){Tree = new ArrayList<";
        StringBuilder sb = new StringBuilder();
        for (int i = min; i <= max; i++) {
                if (i > 1) {start += "ArrayList<";}
                start = start.replaceAll(String.valueOf(i - 1), String.valueOf(i));

            sb.append(start).append("String").append(">".repeat(i)).append("();}\n");
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
        System.out.println(new GenerateJumbleTreeIfs(1,19).get());
    }
}
