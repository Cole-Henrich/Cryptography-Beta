package sample;

public class _1231 {
    private boolean is;
    private final CharSet charSet = new CharSet();
    private final char[] ignorers = charSet.getIgnorers();
    public _1231(String word) {
        if (word.length() == 4) {
            String first = String.valueOf(word.charAt(0));
            String second = String.valueOf(word.charAt(1));
            String third = String.valueOf(word.charAt(2));
            String fourth = String.valueOf(word.charAt(3));
            if (first.equalsIgnoreCase(fourth)) {
                if (!second.equalsIgnoreCase(first)) {
                    if (!second.equalsIgnoreCase(third)) {
                        if (!second.equalsIgnoreCase(fourth)) {
                            if (!third.equalsIgnoreCase(first)) {
                                if (!third.equalsIgnoreCase(fourth)) {
                                    is = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public boolean is(){return is;}
}
