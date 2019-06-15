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

    @Test
    public void ceaserCipher_getmKey_String() {
        CeaserCipher testCeaser = new CeaserCipher("Hello",3);
        assertEquals("Hello",testCeaser.getmWord());
    }

    @Test
    public void ceaserCipher_setmWoord_String() {
        CeaserCipher testCeaser = new CeaserCipher("Hello",3);
        testCeaser.setmWord("hi");
        assertEquals("hi",testCeaser.getmWord());
    }
}