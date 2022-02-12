package sample;

public class TwoCharEncoder {
        private String output;
        CharSet charSet = new CharSet();
        public TwoCharEncoder(String input, String[] chars) {
            KeyCreatorFromLimitedSymbols keyCreator = new KeyCreatorFromLimitedSymbols(chars, 83);
            GeneralSubstitutionEncode encoder = new GeneralSubstitutionEncode(input, keyCreator.getKey(), charSet.getLongAlphabet());
            output = encoder.getOutput();
        }
        public String getOutput() {
            return output;
        }

    public static void main(String[] args) {
        TwoCharEncoder encoder = new TwoCharEncoder("Hello World", new String[]{"<", ">"});
        System.out.println(encoder.getOutput());
    }


}
