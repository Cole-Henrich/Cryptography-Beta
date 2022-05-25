package sample;

import java.util.*;

public class VigenereDictionaryAttacker {
    private boolean isSolved;
    private String solved;
    private String keyWord;
    public VigenereDictionaryAttacker(String cipher, int likelyKeyLength) throws InterruptedException {
        isSolved = false;
        System.err.println("VigenereDictionaryAttacker: likelyKeyLength="+likelyKeyLength);
//        HashMap<Integer, ArrayList<HashMap<String, Integer>>> words = new HashMap<>();
//        ArrayList<HashMap<String, Integer>> xLongWords = words.get(likelyKeyLength);
        ArrayList<a> xLongWords = new ArrayList<>();
        if (likelyKeyLength <=9){
            if (likelyKeyLength==9){
                _Array_6LetterWordsAndOccurrencesBigStore _6s = new _Array_6LetterWordsAndOccurrencesBigStore();
                xLongWords = _6s.central();
            }
            if (likelyKeyLength==8){
                _Array_6LetterWordsAndOccurrencesBigStore _6s = new _Array_6LetterWordsAndOccurrencesBigStore();
                xLongWords = _6s.central();
            }
            else {
                if (likelyKeyLength==7){
                    _Array_6LetterWordsAndOccurrencesBigStore _6s = new _Array_6LetterWordsAndOccurrencesBigStore();
                    xLongWords = _6s.central();
                }
                else {
                    if (likelyKeyLength==6){
                        _Array_6LetterWordsAndOccurrencesBigStore _6s = new _Array_6LetterWordsAndOccurrencesBigStore();
                        xLongWords = _6s.central();
                    }
                    else {
                        if (likelyKeyLength==5){
                            _Array_5LetterWordsAndOccurrencesBigStore _5s = new _Array_5LetterWordsAndOccurrencesBigStore();
                            xLongWords = _5s.central();
                        }
                        else {
                            if (likelyKeyLength==4){
                                _Array_4LetterWordsAndOccurrencesBigStore _4s = new _Array_4LetterWordsAndOccurrencesBigStore();
                                xLongWords = _4s.central();
                            }
                            else {
                                if (likelyKeyLength==3){
                                    _Array_3LetterWordsAndOccurrencesBigStore _3s = new _Array_3LetterWordsAndOccurrencesBigStore();
                                    xLongWords = _3s.central();
                                }
                                else {
                                    if (likelyKeyLength==2){
                                        _Array_6LetterWordsAndOccurrencesBigStore _6s = new _Array_6LetterWordsAndOccurrencesBigStore();
                                        xLongWords = _6s.central();
                                    }
                                    else {
                                        if (likelyKeyLength==1){
                                            _Array_6LetterWordsAndOccurrencesBigStore _6s = new _Array_6LetterWordsAndOccurrencesBigStore();
                                            xLongWords = _6s.central();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            if (likelyKeyLength == 10){
                _Array_10LetterWordsAndOccurrencesBigStore _10s = new _Array_10LetterWordsAndOccurrencesBigStore();
                xLongWords = _10s.central();
            }
            else {
                if (likelyKeyLength == 11){
                    _Array_11LetterWordsAndOccurrencesBigStore _11s = new _Array_11LetterWordsAndOccurrencesBigStore();
                    xLongWords = _11s.central();
                }
                else {
                    if (likelyKeyLength == 12){
                        _Array_12LetterWordsAndOccurrencesBigStore _12s = new _Array_12LetterWordsAndOccurrencesBigStore();
                        xLongWords = _12s.central();
                    }
                    else {
                        if (likelyKeyLength == 13){
                            _Array_13LetterWordsAndOccurrencesBigStore _13s = new _Array_13LetterWordsAndOccurrencesBigStore();
                            xLongWords = _13s.central();
                        }
                        else {
                            if (likelyKeyLength == 14){
                                _Array_14LetterWordsAndOccurrencesBigStore _14s = new _Array_14LetterWordsAndOccurrencesBigStore();
                                xLongWords = _14s.central();
                            }
                            else {
                                if (likelyKeyLength == 15){
                                    _Array_15LetterWordsAndOccurrencesBigStore _15s = new _Array_15LetterWordsAndOccurrencesBigStore();
                                    xLongWords = _15s.central();
                                }
                                else {
                                    if (likelyKeyLength == 16){
                                        _Array_16LetterWordsAndOccurrencesBigStore _16s = new _Array_16LetterWordsAndOccurrencesBigStore();
                                        xLongWords = _16s.central();
                                    }
                                    else {
                                        if (likelyKeyLength == 17){
                                            _Array_17LetterWordsAndOccurrencesBigStore _17s = new _Array_17LetterWordsAndOccurrencesBigStore();
                                            xLongWords = _17s.central();
                                        }
                                        else {
                                            if (likelyKeyLength == 18){
                                                _Array_18LetterWordsAndOccurrencesBigStore _18s = new _Array_18LetterWordsAndOccurrencesBigStore();
                                                xLongWords = _18s.central();
                                            }
                                            else {
                                                if (likelyKeyLength == 19){
                                                    _Array_19LetterWordsAndOccurrencesBigStore _19s = new _Array_19LetterWordsAndOccurrencesBigStore();
                                                    xLongWords = _19s.central();
                                                }
                                                else {
                                                    xLongWords = new ArrayList<a>(Collections.singletonList(new a("supercalifragilisticexpialidocious", 1)));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        String[] cipherSplit = cipher.split(" ");
        StringBuilder shortCipherBuilder = new StringBuilder();
        int Short = Math.min(cipherSplit.length, 8);
        for (int i = 0; i < Short; i++) {
            shortCipherBuilder.append(cipherSplit[i]).append("\s");
        }
        String shortCipher = shortCipherBuilder.toString();
        System.out.println("shortCipher: "+shortCipher);
        int i = 0;
        while (true) {
            a entry = xLongWords.get(i);
            String keyWordTest = entry.getWord();
//            System.out.println(keyWordTest);

            VigenereKeyPhrase vkf = new VigenereKeyPhrase(keyWordTest, shortCipher.length());
            VigenereDeciphered vdc = new VigenereDeciphered(shortCipher, vkf.get(), false);
            String test = vdc.get();
//            System.out.println(test);

            not_english not_english1 = new not_english(test, false, true, true, false, 0.2);
//            System.out.println(not_english1.not_english());
            if (!not_english1.not_english()) {
                VigenereKeyPhrase vkfFull = new VigenereKeyPhrase(keyWordTest, cipher.length());
                VigenereDeciphered vdcFull = new VigenereDeciphered(cipher, vkfFull.get(), false);
                String testFull = vdcFull.get();
                not_english not_englishFull = new not_english(testFull, 0.5);
                if (!not_englishFull.not_english()){
                    isSolved = true;
                    solved = testFull;
                    keyWord = keyWordTest;
                    System.out.println(i);
                    break;
                }
            }
            i++;
            if (i%200==0){
                System.out.println(i+" "+keyWordTest);
            }
            if (i == xLongWords.size()){
                break;
            }
        }
    }
    public boolean isSolved() {
        return isSolved;
    }
    public String getSolved() {
        return solved;
    }
    public String getKeyWord() {
        return keyWord;
    }

}
