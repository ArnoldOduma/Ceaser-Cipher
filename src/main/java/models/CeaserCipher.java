package models;

public class CeaserCipher {

    private String mWord;
    private int mKey;

    public CeaserCipher(String word, int key){
        this.mWord = word;
        this.mKey = key;
    }


    //Setter Methods
    public void setmWord(String word){
        this.mWord = word;
    }
    public void setmKey(int key){
        this.mKey = key;
    }

    //Getter Methods
    public String getmWord(){
        return mWord;
    }
    public int getmKey(){
        return mKey;
    }

}
