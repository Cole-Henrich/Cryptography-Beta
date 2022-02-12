package sample;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("SizeReplaceableByIsEmpty")
public class RandomSubstitutionKey extends ArrayList<Character> {
    private final CharSet charSet = new CharSet();
    private final char[] alphabet = charSet.getAlphabet();
    private final Random random = new Random();
    public RandomSubstitutionKey(){
        super();
        ArrayList<Character>mutableAlphabet = charSet.charToCharArrayList(alphabet);
        while (mutableAlphabet.size() > 0){
            int randomIndex = random.nextInt(mutableAlphabet.size());
            Character letter = mutableAlphabet.get(randomIndex);
            add(letter);
            mutableAlphabet.remove(randomIndex);
        }
    }
}
