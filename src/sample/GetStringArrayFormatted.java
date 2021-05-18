package sample;

import java.util.ArrayList;

public class GetStringArrayFormatted {
    private String formatted;
    public GetStringArrayFormatted(ArrayList<String> a){
        System.err.println("new GetStringArrayFormatted("+a+")");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.size()-1; i++) {
            String s = a.get(i);
            sb.append("\"").append(s).append("\",");
        }
        sb.append("\"").append(a.get(a.size() - 1)).append("\"");
        this.formatted = sb.toString();
    }
    public GetStringArrayFormatted(String[] a){
        this(new Metamorphose(a).get_A());
    }
    public String getFormatted(){
        System.err.println("getFormatted()");
        return this.formatted;
    }
}
