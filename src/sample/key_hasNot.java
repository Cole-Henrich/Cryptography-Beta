package sample;

public class key_hasNot {
    private boolean hasNot;
    public key_hasNot(String[] key, String thisChar){
        boolean HasNot=true;
        for (String keyChar : key) {
            if (thisChar.equalsIgnoreCase(keyChar)) {
                HasNot = false;
                break;
            }
        }
        this.hasNot=HasNot;
    }
    public boolean hasNot(){return hasNot;}
}
