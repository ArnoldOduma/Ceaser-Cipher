package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_instantiatesCorrectly_true() {
        CeaserCipher testCeaser = new CeaserCipher();
        assertTrue(testCeaser instanceof CeaserCipher);
    }

    @Test
    public void ceaserCipher_getmKey_int() {
        CeaserCipher testCeaser = new CeaserCipher();
        testCeaser.setmKey(2);
        assertEquals(2,testCeaser.getmKey());
    }

    @Test
    public void ceaserCipher_getmWord_String() {
        CeaserCipher testCeaser = new CeaserCipher();
        testCeaser.setmWord("Hello");
        assertEquals("Hello",testCeaser.getmWord());
    }

    @Test
    public void ceaserCipher_setmWord_String() {
        CeaserCipher testCeaser = new CeaserCipher();
        testCeaser.setmWord("hi");
        assertEquals("hi",testCeaser.getmWord());
    }

    @Test
    public void ceaserCipher_setmKey_int(){
        CeaserCipher testCeaser = new CeaserCipher();
        testCeaser.setmKey(1);
        assertEquals(1,testCeaser.getmKey());
    }

    @Test
    public void ceaseCipher_encrypter_String(){
        Encrypt testEncrypt = new Encrypt();
        assertEquals("ij",testEncrypt.encrypter());
    }






}