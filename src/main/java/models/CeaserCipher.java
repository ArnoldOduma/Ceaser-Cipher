package models;

public class CeaserCipher {

    private String mWord;
    private int mKey;

    //Getter Methods
    public String getmWord(){
        return mWord;
    }
    public int getmKey(){
        return mKey;
    }

    //Setter Methods
    public void setmWord(String word){
        this.mWord = word;
    }
    public void setmKey(int key){
        this.mKey = key;
    }
}
