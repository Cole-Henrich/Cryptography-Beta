package sample;


import java.util.ArrayList;
import java.util.Locale;

@SuppressWarnings("RedundantIfStatement")
public class HasLettersInCorrectPlaces {
    private ArrayList<String> result;

    public HasLettersInCorrectPlaces(ArrayList<String> list, String knownString) {
        result = new ArrayList<>();
        char[] chars = knownString.toLowerCase().toCharArray();
//        for (String s : list) {
//            s = s.toLowerCase();
//            char[] sChars = s.toCharArray();
//            boolean hasLettersInCorrectPlaces = true;
//            if (knownChars[0] != '_' && knownChars[0] != sChars[0]) {
//                hasLettersInCorrectPlaces = false;
//            }
//            if (hasLettersInCorrectPlaces && knownChars[1] != '_' && knownChars[1] != sChars[1]) {
//                hasLettersInCorrectPlaces = false;
//            }
//            if (hasLettersInCorrectPlaces && knownChars[2] != '_' && knownChars[2] != sChars[2]) {
//                hasLettersInCorrectPlaces = false;
//            }
//            if (hasLettersInCorrectPlaces && knownChars[3] != '_' && knownChars[3] != sChars[3]) {
//                hasLettersInCorrectPlaces = false;
//            }
//            if (hasLettersInCorrectPlaces && knownChars[4] != '_' && knownChars[4] != sChars[4]) {
//                hasLettersInCorrectPlaces = false;
//            }
//            if (knownChars.length > 5) {
//                if (hasLettersInCorrectPlaces && knownChars[5] != '_' && knownChars[5] != sChars[5]) {
//                    hasLettersInCorrectPlaces = false;
//                }
//                if (knownChars.length > 6) {
//                    if (hasLettersInCorrectPlaces && knownChars[6] != '_' && knownChars[6] != sChars[6]) {
//                        hasLettersInCorrectPlaces = false;
//                    }
//                }
//            }
//            if (hasLettersInCorrectPlaces) {
//                System.err.println(s);
//                result.add(s);
//            }
//        }

 ArrayList<HasLettersInCorrectPlacesNode> nodes = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '_'){
                nodes.add(new HasLettersInCorrectPlacesNode(i, chars[i]));
            }
        }
        for (String s : list) {
            boolean hasLettersInCorrectPlaces = true;
            s = s.toLowerCase();
            char[] sChars = s.toCharArray();
            for (int j = 0; j < sChars.length; j++) {
                boolean Break = false;
                for (HasLettersInCorrectPlacesNode node : nodes) {
                    if (node.getIndex() == j && node.getChar() != sChars[j]) {
                        hasLettersInCorrectPlaces = false;
                        Break = true;
                        break;
                    }
                }
                if (Break) {
                    break;
                }
            }
            if (hasLettersInCorrectPlaces){
                result.add(s);
            }
        }
    }

    public ArrayList<String> get() {
        return result;
    }
}
