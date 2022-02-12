package sample;

public class PublicEncryptionKey {
    private int e;
    private int n;
    public PublicEncryptionKey(int e, int n){
        this.e = e;
        this.n = n;
    }
    public int e() {
        return e;
    }
    public int n() {
        return n;
    }
}
