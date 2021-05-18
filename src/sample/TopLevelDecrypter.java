package sample;

import java.io.IOException;

public class TopLevelDecrypter {
    private char[] key;
    private String solved;
    private boolean isSolved;
    public TopLevelDecrypter(String Cipher) throws IOException, InterruptedException {
        CharSet charSet = new CharSet();
        CaesarCracker caesarCracker = new CaesarCracker(Cipher);
        if (caesarCracker.isSolved()){
            this.solved = caesarCracker.getSolved();
            this.key = caesarCracker.getKey();
            this.isSolved = true;
        }
        if (!isSolved) {
            SubstitutionCracker substitutionCracker = new SubstitutionCracker(Cipher, "not applicable here");
            if (substitutionCracker.isSolved()){
                this.solved = substitutionCracker.getSolved();
                this.key = charSet.StringToCharArray(substitutionCracker.getKey());
                this.isSolved = true;
            }
            if (!isSolved){
                VigenereCracker vigenereCracker = new VigenereCracker(Cipher);
                    if (vigenereCracker.isSolved()){
                    this.solved = vigenereCracker.getSolved();
                    this.isSolved = true;
                }
            }
        }
    }
    public char[] getKey() {return key;}
    public String getSolved() {return solved;}
    public boolean isSolved(){return isSolved;}
}
