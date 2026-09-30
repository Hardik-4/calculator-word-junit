package griffith;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class WordTest {
    @Test
    void testContains() {
        Word word = new Word(new char[] {'h', 'e', 'l', 'l', 'o'});
        assertTrue(word.contains('o'));
        assertTrue(word.contains('h'));
        assertTrue(word.contains('l'));
        assertFalse(word.contains('z'));
    }

    @Test
    void testLength() {
        assertEquals(7, new Word(new char[] {'w', 'e', 'l', 'c', 'o', 'm', 'e'}).length());
        assertEquals(6, new Word("coding").length());
        assertEquals(4, new Word("java").length());
    }

    @Test
    void testGetLettersDefensiveCopy() {
        char[] source = {'j', 'a', 'v', 'a'};
        Word word = new Word(source);
        source[0] = 'x';
        assertArrayEquals(new char[] {'j', 'a', 'v', 'a'}, word.getLetters());

        char[] copy = word.getLetters();
        copy[0] = 'z';
        assertEquals("java", word.asString());
    }

    @Test
    void testReverseAndValidation() {
        Word word = new Word("abcd");
        assertEquals("dcba", word.reverse().asString());
        assertThrows(IllegalArgumentException.class, () -> new Word((char[]) null));
        assertThrows(IllegalArgumentException.class, () -> new Word((String) null));
    }
}
