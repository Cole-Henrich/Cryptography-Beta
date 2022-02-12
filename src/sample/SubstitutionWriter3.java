package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SubstitutionWriter3 {
    private final CharSet charSet = new CharSet();
    private int numLoops;
    private File[] Files = new File[]{
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find1E.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find2O.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find3N.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find4I.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find5S.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find6R.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find7D.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find8L.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find9U.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find10M.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find11F.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find12C.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find13W.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find14G.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find15Y.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find16P.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find17B.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find18B.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find19K.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find20J.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find21X.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find22Z.java"),
            new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/find23Q.java"),
    };

    public static void main(String[] args) throws IOException {
        SubstitutionWriter3 s = new SubstitutionWriter3(20);
    }
    public SubstitutionWriter3(int numLoopsBaseline) throws IOException {
        System.err.println("new SubstitutionWriter3(int numLoopsBaseline:20)");
        Uniques finder = new Uniques();
        numLoops = numLoopsBaseline;
        charSet.updateEtao();
        String etao = charSet.getEtao();
        etao = etao.replaceAll("[tha]", "");
        int index = 0;
        while (!etao.isEmpty()){
            FileWriter writer = new FileWriter(Files[index]);
            char c = etao.charAt(0);
            String tempEtao = etao.replaceAll(String.valueOf(c), "");
            LoopWriter compiler = new LoopWriter(numLoops, c, charSet.charToStringArray(tempEtao.toCharArray()), finder);
            String java = compiler.get();
            writer.write(java);
            System.err.println("in File"+ getClass().getCanonicalName() + "FileWriter "+writer.getClass().getCanonicalName()+" wrote to "+Files[index].getAbsolutePath());
            etao = tempEtao;
            index++;
        }
    }
}
