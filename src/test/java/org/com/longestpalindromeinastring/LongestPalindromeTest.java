package org.com.longestpalindromeinastring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LongestPalindromeTest {

    @Test
    public void testDynamicLP_throwsException() {
        Assertions.assertThrows( Exception.class,
                () -> DynamicLongestPalindrome.findLongestPalindrome(""));
    }

    @ParameterizedTest
    @MethodSource("longestPalindromeInputAndExpected")
    public void testDynamicLP_success(String input, String expected) throws Exception {
        Assertions.assertEquals( expected,
                DynamicLongestPalindrome.findLongestPalindrome(input));
    }

    @Test
    public void testBruteForceLP_throwsException() {
        Assertions.assertThrows( Exception.class,
                () -> BruteForceLongestPalindrome.findLongestPalindrome(""));
    }

    @ParameterizedTest
    @MethodSource("longestPalindromeInputAndExpected")
    public void testBruteForceLP_success(String input, String expected) throws Exception {
        Assertions.assertEquals( expected,
                BruteForceLongestPalindrome.findLongestPalindrome(input));
    }

    @Test
    public void testMemoizationLP_throwsException() {
        Assertions.assertThrows( Exception.class,
                () -> MemoizationLongestPalindrome.findLongestPalindrome(""));
    }

    @ParameterizedTest
    @MethodSource("longestPalindromeInputAndExpected")
    public void testMemoizationLP_success(String input, String expected) throws Exception {
        Assertions.assertEquals( expected,
                MemoizationLongestPalindrome.findLongestPalindrome(input));
    }

    static Stream<Arguments> longestPalindromeInputAndExpected() {
        return Stream.of(
                Arguments.arguments("abacabkkba", "abkkba"),
                Arguments.arguments("abcd", "a"),
                Arguments.arguments("a", "a")
        );
    }
}
