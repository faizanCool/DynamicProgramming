package org.com.longestpalindromeinastring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(strings = {"a", "abcd"})
    public void testDynamicLP_successOneCharacter(String value) throws Exception {
        Assertions.assertEquals( "a",
                DynamicLongestPalindrome.findLongestPalindrome(value));
    }

    @Test
    public void testBruteForceLP_success() throws Exception {
        Assertions.assertEquals( "abkkba",
                BruteForceLongestPalindrome.findLongestPalindrome("abacabkkba"));
    }

    @Test
    public void testBruteForceLP_throwsException() {
        Assertions.assertThrows( Exception.class,
                () -> BruteForceLongestPalindrome.findLongestPalindrome(""));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "abcd"})
    public void testBruteForceLP_successOneCharacter(String value) throws Exception {
        Assertions.assertEquals( "a",
                BruteForceLongestPalindrome.findLongestPalindrome(value));
    }

    @Test
    public void testMemoizationLP_success() throws Exception {
        Assertions.assertEquals( "abkkba",
                MemoizationLongestPalindrome.findLongestPalindrome("abacabkkba"));
    }

    @Test
    public void testMemoizationLP_throwsException() {
        Assertions.assertThrows( Exception.class,
                () -> MemoizationLongestPalindrome.findLongestPalindrome(""));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "abcd"})
    public void testMemoizationLP_successOneCharacter(String value) throws Exception {
        Assertions.assertEquals( "a",
                MemoizationLongestPalindrome.findLongestPalindrome(value));
    }
}
