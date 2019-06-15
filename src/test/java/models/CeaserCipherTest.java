package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_instantiatesCorrectly_true() {
        CeaserCipher testCeaser = new CeaserCipher("Word",2);
        assertTrue(testCeaser instanceof CeaserCipher);
    }

    @Test
    public void ceaserCipher_getmWord_int() {
        CeaserCipher testCeaser = new CeaserCipher("Word",2);
        assertEquals(2,testCeaser.getmKey());
    }
}