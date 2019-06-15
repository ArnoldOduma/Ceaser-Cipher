package models;

public class Encrypt {

    public String encrypter(){
        CeaserCipher newCeaser = new CeaserCipher();
        StringBuilder encryptedText = new StringBuilder();
        newCeaser.setmWord("hi");
        newCeaser.setmKey(1);

        for(int i = 0; i < newCeaser.getmWord().length(); i++ ){
            char wordChar = newCeaser.getmWord().charAt(i);
            char encrypted = (char) (wordChar + newCeaser.getmKey());
            encryptedText.append(encrypted);
        }
        return encryptedText.toString();
    }

}
