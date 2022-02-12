package sample;

import java.util.ArrayList;

public class Mimic extends ArrayList<SortableV2>{
    private final CharSet charSet = new CharSet();
    public Mimic(SimilarTo similarTo){
        char letter = similarTo.getLetter();
        String word = similarTo.getWord();
        for (int i = 0; i < similarTo.size(); i++) {
            String similar = similarTo.get(i);
            int[] indices = charSet.crucialIndices(letter, word);
            ArrayList<String> fakes = new ArrayList<>();
            for (int j = 0; j < indices.length; j++) {
                fakes.add(  String.valueOf(similar.charAt(indices[i])).toLowerCase()  );
            }
            add(new SortableV2(indices, fakes.toArray(new String[0])));
        }
    }
}
