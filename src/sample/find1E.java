package sample;

public class find1E {
    private char Char;
    public find1E(String[] key, String cipher) {

        /*
         Scanner e = new Scanner(cipher);
        System.err.println("Scanner e");

        while (e.hasNext()) {
            String next = e.next();
            if (next.length() == 3) {
                String first = String.valueOf(next.charAt(0));
                String second = String.valueOf(next.charAt(1));
                String third = String.valueOf(next.charAt(2));
                if (first.equalsIgnoreCase(key[_t])) {
                    if (second.equalsIgnoreCase(key[_h])) {
                        key[_e] = third.toLowerCase();
                        hasE = true;
                        System.err.println("hasE = true;");
                        e.close();
                        System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                        System.err.println(correctKey);

                        break;
                    }
                }
            }
        }
        if (!hasE) {
            e.close();

            Scanner e_heat = new Scanner(cipher);
            System.err.println("Scanner e_heat ");
            while (e_heat.hasNext()) {
                String next = e_heat.next();
                if (next.length() == 4) {
                    String first = String.valueOf(next.charAt(0));
                    String second = String.valueOf(next.charAt(1));
                    String third = String.valueOf(next.charAt(2));
                    String fourth = String.valueOf(next.charAt(3));
                    if (first.equalsIgnoreCase(key[_h])) {
                        if (third.equalsIgnoreCase(key[_a])) {
                            if (fourth.equalsIgnoreCase(key[_t])) {
                                key[_e] = second.toLowerCase();
                                hasE = true;
                                System.err.println("hasE = true;");
                                e_heat.close();
                                System.err.println((Arrays.toString(key)).replaceAll("null", "\u0000"));
                                System.err.println(correctKey);

                                break;
                            }
                        }
                    }
                }
            }
        }
         */
    }
    public char getChar() {
        return Char;
    }
}
