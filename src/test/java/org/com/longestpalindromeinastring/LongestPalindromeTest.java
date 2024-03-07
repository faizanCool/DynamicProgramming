package org.com.longestpalindromeinastring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {
    @Test
    public void testDynamicLP_success() throws Exception {
        Assertions.assertEquals( "abkkba",
            DynamicLongestPalindrome.findLongestPalindrome("abacabkkba"));
    }

    @Test
    public void testDynamicLP_throwsException() {
        Assertions.assertThrows( Exception.class,
                () -> DynamicLongestPalindrome.findLongestPalindrome(""));
    }

    @Test
    public void testDynamicLP_successNoPalindrome() throws Exception {
        Assertions.assertEquals( "",
                DynamicLongestPalindrome.findLongestPalindrome("abcd"));
    }

    @Test
    public void testBruteForceLP_success() throws Exception {
        Assertions.assertEquals( "abkkba",
                BruteForceLongestPalindrome.findLongestPalindrome("abacabkkba"));
    }

    @Test
    public void testBruteForceL_throwsException() {
        Assertions.assertThrows( Exception.class,
                () -> BruteForceLongestPalindrome.findLongestPalindrome(""));
    }

    @Test
    public void testBruteForceL_successNoPalindrome() throws Exception {
        Assertions.assertEquals( "",
                BruteForceLongestPalindrome.findLongestPalindrome("abcd"));
    }
}
