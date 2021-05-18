package sample;

public class CifrarioVigenere {
    private String cipher;
    private String key;
    public CifrarioVigenere(String cipher, String key){
        this.cipher = cipher;
        this.key = key;
    }
    public String getKey() {
        return key;
    }
    public String getCipher() {
        return cipher;
    }
}
