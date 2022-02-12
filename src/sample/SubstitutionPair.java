package sample;

public class SubstitutionPair {
    private String key;
    private String cipher;
    public SubstitutionPair(String Cipher, String actualKey) {
        setCipher(Cipher);
        setCipher(actualKey);
    }
    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
