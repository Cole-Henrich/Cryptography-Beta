package sample;

public class TwoCharDecoder {
    CharSet charSet = new CharSet();
    private String output;
    private boolean isSolved;
    public TwoCharDecoder(String input){
//        System.out.println("new two char decoder");
        char[] chars = input.toCharArray();
        StringBuilder TwoChars = new StringBuilder();
        for (char c:chars){
            if (!TwoChars.toString().contains(String.valueOf(c))){
                TwoChars.append(c);
            }
        }
        char[] tc = TwoChars.toString().toCharArray();
        String[] twoChars = charSet.charToStringArray(tc);
        SubstitutionDecodeWithKnownTwoCharKey decoder = new SubstitutionDecodeWithKnownTwoCharKey(input, twoChars);
        output = decoder.getOutput();
//        not_english not_english = new not_english(output);
//        if (!not_english.not_english()) {
            isSolved = true;
        //}
    }

    public static void main(String[] args) {
        TwoCharDecoder decoder = new TwoCharDecoder("""
        <><>><<<<<>>>><<><>><<<><>><<<>><<><<<<<<<<>>><>><<>><<><<>>><<<<><>><<<<>>><
        """);
        System.out.println(decoder.getOutput());
    }
    public boolean isSolved(){return isSolved;}
    public String getOutput() {
        return output;
    }
}
