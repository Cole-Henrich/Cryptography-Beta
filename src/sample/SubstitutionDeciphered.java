package sample;

public class SubstitutionDeciphered {
    private final CharSet charSet = new CharSet(false);
    private final char[] alphabet = charSet.getAlphabet();
    private String solved;
    public SubstitutionDeciphered(String text, String[] key){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isIgnorer = charSet.isIgnorer(c);
            if (isIgnorer){
                sb.append(c);
            }
            if (!isIgnorer){
                String StringVal = String.valueOf(c);
                for (int j = 0; j < key.length; j++) {
                    if (StringVal.equalsIgnoreCase(key[j])){
                        boolean isCapital = charSet.isCapital(StringVal);
                        String append = null;
                        if (isCapital) {
                            append= String.valueOf((alphabet[j])).toUpperCase();
                        }
                        if (!isCapital) {
                            append= String.valueOf((alphabet[j])).toLowerCase();
                        }
                        sb.append(append);
                        break;
                    }
                }
            }
        }
        solved = sb.toString();
    }
    public String get(){return solved;}
}
