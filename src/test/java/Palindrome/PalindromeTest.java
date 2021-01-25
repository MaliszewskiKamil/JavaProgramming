package Palindrome;


import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        String notPalindrome = "aaaXdd1KOl";
        Assert.assertFalse("", Palindrome.isPalindrome(notPalindrome));
        String filteredPalindrome = "a>>b(ccb<<a";
        Assert.assertTrue(Palindrome.isPalindrome(filteredPalindrome));
    }
}