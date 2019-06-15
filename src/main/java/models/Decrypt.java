package models;

public class Decrypt {
    public String decrypter(){
        String decryptedText = "";
        CeaserCipher newCeaser = new CeaserCipher();
        newCeaser.setmWord("ij");
        newCeaser.setmKey(1);

        for (int i = 0; i < newCeaser.getmWord().length(); i++){
            char wordChar = newCeaser.getmWord().charAt(i);
            char decrypted = (char) (wordChar - newCeaser.getmKey());
            decryptedText += decrypted;
        }
        return decryptedText;
    }
}
