package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class SubstitutionBruteForcer {
    private boolean isSolved;
    private String[] key;
    private String solved;
    private String cipher;
    private String[] missingChars;
    private final CharSet charSet = new CharSet();
    private final char[] alphabet = charSet.getAlphabet();
    private final math math = new math();

    private void crack(String Cipher, String[] Key, String[] MissingChars){
        System.err.println("BruteForcer.crack");
        int[] nullIndices = nullIndices(Key);
        int nullCount = nullIndices.length;
        int numPermutations = 0;
        int maxPossiblePermutations = math.factorial(nullCount);
        PermutationsArrayList allPermutations = new PermutationsArrayList(MissingChars);
        for (ArrayList<String> permuted : allPermutations) {
            for (int i = 0; i < permuted.size() /*green 2022/2/20 edit*/&& i < nullIndices.length/*green end*/; i++) {
                int nullIndex = nullIndices[i];
                Key[nullIndex] = permuted.get(i);
            }
            SubstitutionDeciphered decipherer = new SubstitutionDeciphered(Cipher, Key);
            String attemptedSolve = decipherer.get();
            if (attemptedSolve.contains("the") || attemptedSolve.contains("and")) {
                not_english not_english = new not_english(attemptedSolve);
                isSolved = !not_english.not_english();
                if (isSolved) {
                    System.err.println("success");
                    setKey(Key);
                    setSolved(attemptedSolve);
                    break;
                    //[p, l, j, z, m, i, v, t, u, s, x, e, k, c, g, w, f, h, a, q, d, n, o, r, y, b]
                    //[p, f, j, z, m, i, v, t, u, s, x, e, k, c, g, w, l, h, a, q, d, n, o, r, y, b]

                }
            }
            numPermutations++;
        }
    }
    private int[] nullIndices(String[] array){
        System.err.println("BruteForcer.nullIndices");
        ArrayList<Integer> modifiable = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            if (s == null) {
                modifiable.add(i);
            }
        }
        int[] rtn = charSet.IntegerArrayListToIntArray(modifiable);
        return rtn;
    }
    private String[] findMissingChars(String[] array){
        System.err.println("BruteForcer.findMissingChars");
        ArrayList<String> modifiable = charSet.StringToStringArrayList(charSet.charToStringArray(alphabet));
        int[] nullIndices = nullIndices(array);
        int nullCount = nullIndices.length;
        int reps = 0;

        for (String s : array) {
            modifiable.remove(s);
            System.err.println(reps);
            reps++;
            System.err.println(modifiable);
            System.err.println(nullCount);
        }

        String[] rtn = modifiable.toArray(new String[0]);
        return rtn;
    }
    public SubstitutionBruteForcer(String Cipher, String[] Key) {
        System.err.println("new BruteForcer");
        setKey(Key);
        setCipher(Cipher);
        missingChars = findMissingChars(key);
        crack(cipher, key, missingChars);
    }
    public String getCipher() {
        return cipher;
    }
    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public boolean isSolved() {
        return isSolved;
    }
    public String getSolved() {
        return solved;
    }

    public void setSolved(String solved) {
        this.solved = solved;
    }

    public String[] getKey() {
        return key;
    }

    public void setKey(String[] key) {
        this.key = key;
    }
}
