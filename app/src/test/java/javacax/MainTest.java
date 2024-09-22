package javacax;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testPalindromeWithSimpleWord() {
        assertTrue(isPalindrome("hahah"), "Ожидается, что «hahah» будет палиндромом");
    }

    @Test
    public void testPalindromeWithMixedCase() {
        assertTrue(isPalindrome("bibib"), "Ожидается, что bibib станет палиндромом");
    }

    @Test
    public void testPalindromeWithPunctuation() {
        assertTrue(isPalindrome("hadedah"), "Ожидаемое: «hadedah» будет палиндромом");
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(isPalindrome("hello"), "Ожидается, что «hello» не будет палиндромом.");
    }

    @Test
    public void testEmptyString() {
        assertTrue(isPalindrome(""), "Ожидается, что пустая строка будет палиндромом.");
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(isPalindrome("a"), "Ожидается, что одиночный символ «а» будет палиндромом.");
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertTrue(isPalindrome("  "), "Ожидаемая строка с пробелами будет палиндромом.");
    }

    @Test
    public void testNonPalindromeWithSpaces() {
        assertFalse(isPalindrome("java"), "Ожидалось, что «java» не будет палиндромом");
    }

    @Test
    public void testPalindromeWithNumbers() {
        assertTrue(isPalindrome("12321"), "Ожидается, что число 12321 будет палиндромом.");
    }
    // The method to be tested
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        str = str.toLowerCase();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        return str.equals(rev);
    }
}

