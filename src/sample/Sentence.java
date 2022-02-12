package sample;

public class Sentence {
    private String punctuation;
    private String sentence;
    public Sentence(String sentence, String punctuation){
        setPunctuation(punctuation);
        setSentence(sentence);
    }
    public String getSentence() {
        return sentence;
    }

    public String getPunctuation() {
        return punctuation;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setPunctuation(String punctuation) {
        this.punctuation = punctuation;
    }
}
