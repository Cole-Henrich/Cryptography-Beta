package sample;

import java.io.IOException;

public class TopLevelDecrypter {
    private char[] key;
    private String solved;
    private boolean isSolved;
    private boolean isTwoChar;
    private boolean isCaesar;
    private boolean isSubstitution;
    private boolean isVigenere;
    private CaesarCracker caesarCracker;
    private SubstitutionCracker substitutionCracker;
    private VigenereCracker vigenereCracker;
    public TopLevelDecrypter(String Cipher, String hiddenKey) throws IOException, InterruptedException {
        isSolved = false;
        isTwoChar = false;
        isCaesar = false;
        isSubstitution = false;
        isVigenere = false;
        CharSet charSet = new CharSet();
        caesarCracker = new CaesarCracker(Cipher);
        if (caesarCracker.isSolved()){
            isCaesar = true;
            solved = caesarCracker.getSolved();
            key = caesarCracker.getKey();
            isSolved = true;
        }

        if (!isSolved) {
            substitutionCracker = new SubstitutionCracker(Cipher, hiddenKey);
            if (substitutionCracker.isSolved()){
                isSubstitution = true;
                solved = substitutionCracker.getSolved();
                key = charSet.StringToCharArray(substitutionCracker.getKey());
                isSolved = true;
            }
            if (!isSolved){
                vigenereCracker = new VigenereCracker(Cipher);
                if (vigenereCracker.isSolved()){
                    isVigenere = true;
                    solved = vigenereCracker.getSolved();
                    isSolved = true;
                }
            }
        }
    }
    public TopLevelDecrypter(String Cipher) throws IOException, InterruptedException {
        isSolved = false;
        isTwoChar = false;
        isCaesar = false;
        isSubstitution = false;
        isVigenere = false;
        CharSet charSet = new CharSet();


        if (charSet.containsPermutationsOfTwoChars(Cipher)){
            System.out.println("contains permutations of two chars");
            TwoCharDecoder twoCharDecoder = new TwoCharDecoder(Cipher);
                solved = twoCharDecoder.getOutput();
                isTwoChar = true;
                isSolved = true;
                System.out.println(solved);
        }
        if (!isSolved) {
            caesarCracker = new CaesarCracker(Cipher);
            if (caesarCracker.isSolved()) {
                isCaesar = true;
                solved = caesarCracker.getSolved();
                key = caesarCracker.getKey();
                isSolved = true;
            }

            if (!isSolved) {
                substitutionCracker = new SubstitutionCracker(Cipher, "not applicable here");
                if (substitutionCracker.isSolved()) {
                    isSubstitution = true;
                    solved = substitutionCracker.getSolved();
                    key = charSet.StringToCharArray(substitutionCracker.getKey());
                    isSolved = true;
                }
                if (!isSolved) {
                    vigenereCracker = new VigenereCracker(Cipher);
                    if (vigenereCracker.isSolved()) {
                        isVigenere = true;
                        solved = vigenereCracker.getSolved();
                        isSolved = true;
                    }
                }
            }
        }
    }
    public VigenereCracker getVigenere(){return vigenereCracker;}
    public SubstitutionCracker getSubstitution(){return substitutionCracker;}
    public CaesarCracker getCaesar(){return caesarCracker;}

    public boolean isTwoChar() {return isTwoChar;}
    public boolean isCaesar(){return isCaesar;}
    public boolean isSubstitution(){return isSubstitution;}
    public boolean isVigenere(){return isVigenere;}

    public char[] getKey() {return key;}
    public String getSolved() {return solved;}
    public boolean isSolved(){return isSolved;}
}


//Green all these comments are before 2022/2/2 edits, revert to this in case of malfunction

// package sample;
//
//import java.io.IOException;
//
//public class TopLevelDecrypter {
//    private char[] key;
//    private String solved;
//    private boolean isSolved;
//    private boolean isCaesar;
//    private boolean isSubstitution;
//    private boolean isVigenere;
//    private CaesarCracker caesarCracker;
//    private SubstitutionCracker substitutionCracker;
//    private VigenereCracker vigenereCracker;
//    public TopLevelDecrypter(String Cipher, String hiddenKey) throws IOException, InterruptedException {
//        isSolved = false;
//        isCaesar = false;
//        isSubstitution = false;
//        isVigenere = false;
//        CharSet charSet = new CharSet();
//        caesarCracker = new CaesarCracker(Cipher);
//        if (caesarCracker.isSolved()){
//            isCaesar = true;
//            solved = caesarCracker.getSolved();
//            key = caesarCracker.getKey();
//            isSolved = true;
//        }
//
//        if (!isSolved) {
//            substitutionCracker = new SubstitutionCracker(Cipher, hiddenKey);
//            if (substitutionCracker.isSolved()){
//                isSubstitution = true;
//                solved = substitutionCracker.getSolved();
//                key = charSet.StringToCharArray(substitutionCracker.getKey());
//                isSolved = true;
//            }
//            if (!isSolved){
//                vigenereCracker = new VigenereCracker(Cipher);
//                if (vigenereCracker.isSolved()){
//                    isVigenere = true;
//                    solved = vigenereCracker.getSolved();
//                    isSolved = true;
//                }
//            }
//        }
//    }
//    public TopLevelDecrypter(String Cipher) throws IOException, InterruptedException {
//        isSolved = false;
//        isCaesar = false;
//        isSubstitution = false;
//        isVigenere = false;
//        CharSet charSet = new CharSet();
//        caesarCracker = new CaesarCracker(Cipher);
//        if (caesarCracker.isSolved()){
//            isCaesar = true;
//            solved = caesarCracker.getSolved();
//            key = caesarCracker.getKey();
//            isSolved = true;
//        }
//
//        if (!isSolved) {
//            substitutionCracker = new SubstitutionCracker(Cipher, "not applicable here");
//            if (substitutionCracker.isSolved()){
//                isSubstitution = true;
//                solved = substitutionCracker.getSolved();
//                key = charSet.StringToCharArray(substitutionCracker.getKey());
//                isSolved = true;
//            }
//            if (!isSolved){
//                 vigenereCracker = new VigenereCracker(Cipher);
//                    if (vigenereCracker.isSolved()){
//                        isVigenere = true;
//                        solved = vigenereCracker.getSolved();
//                        isSolved = true;
//                }
//            }
//        }
//    }
//    public VigenereCracker getVigenere(){return vigenereCracker;}
//    public SubstitutionCracker getSubstitution(){return substitutionCracker;}
//    public CaesarCracker getCaesar(){return caesarCracker;}
//    public boolean isCaesar(){return isCaesar;}
//    public boolean isSubstitution(){return isSubstitution;}
//    public boolean isVigenere(){return isVigenere;}
//
//    public char[] getKey() {return key;}
//    public String getSolved() {return solved;}
//    public boolean isSolved(){return isSolved;}
//}
