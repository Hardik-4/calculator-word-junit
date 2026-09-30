package griffith;

import java.util.Arrays;

/**
 * Word represented as a char array, with contains / length helpers.
 */
public class Word {
    private final char[] letters;

    public Word(char[] letters) {
        if (letters == null) {
            throw new IllegalArgumentException("letters cannot be null");
        }
        this.letters = Arrays.copyOf(letters, letters.length);
    }

    public Word(String text) {
        if (text == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        this.letters = text.toCharArray();
    }

    public boolean contains(char symbol) {
        for (char letter : letters) {
            if (letter == symbol) {
                return true;
            }
        }
        return false;
    }

    public int length() {
        return letters.length;
    }

    public char[] getLetters() {
        return Arrays.copyOf(letters, letters.length);
    }

    public String asString() {
        return new String(letters);
    }

    public Word reverse() {
        char[] reversed = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            reversed[i] = letters[letters.length - 1 - i];
        }
        return new Word(reversed);
    }

    @Override
    public String toString() {
        return asString();
    }
}
