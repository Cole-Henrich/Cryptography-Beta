package sample;

import java.io.File;

public class experiment {
    public static void main(String[] args) {
        String a = Integer.toHexString('a' | 0x10000).substring(1);
        String s = "\\u"+a;
        String sTemp = s.replaceAll("u", "").replace('\\', ' ').replaceAll(" ", "");
        char c = (char) Integer.parseInt(sTemp, 16);
        System.out.println(a);
        System.out.println(s);
        System.out.println(c);
    }
}
