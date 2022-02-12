package sample;

import java.util.Arrays;

public class KeyCreatorFromLimitedSymbols {
    private String[] input;
    private int keylength;
    private String[] key;
    public KeyCreatorFromLimitedSymbols(String[] in, int kl){
        input = in;
        keylength = kl;
        int count = 0;
        key = new String[keylength];
        boolean Break = false;
        for (String a:input){
            for (String b:input){
                for (String c:input){
                    for (String d:input){
                        for (String e:input){
                            for (String f:input){
                                for (String g:input){
                                    key[count] = a+b+c+d+e+f+g;
                                    count++;
                                    if (count == keylength) {
                                        Break = true;
                                        break;
                                    }
                                }
                                if (Break) break;
                            }
                            if (Break) break;
                        }
                        if (Break) break;
                    }
                    if (Break) break;
                }
                if (Break) break;
            }
            if (Break) break;
        }
    }
    public String[] getKey() {
        return key;
    }
}
