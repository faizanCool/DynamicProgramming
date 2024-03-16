package org.com.longestpalindromeinastring;

public class MemoizationLongestPalindrome {

    private static Boolean[][] palindromes;

    public static String findLongestPalindrome(final String input) throws Exception {

        if (input == null || input.trim().length() == 0)
            throw new Exception("String is empty.");

        int from= 0, to = 0, max = 0;

        int size = input.length();
        palindromes = new Boolean[size][size];
        for (int i = 0; i < size; i ++) {
            for (int j = i + 1; j <= size; j ++) {
                if (isPalindrome(input, i, j) && (j - i) > max) {
                    from = i; to = j;
                    max = j - i;
                }
            }
        }
        return input.substring(from, to);
    }

    private static boolean isPalindrome(final String text, final int from, final int to) {
        if (palindromes[from][to-1] != null)
            return palindromes[from][to-1];
        int diff = to - from;
        return palindromes[from][to-1] = diff == 1? true :
                (diff == 2? (text.charAt(from) == text.charAt(to-1)) :
                        text.charAt(from) == text.charAt(to-1) && isPalindrome(text, from + 1, to - 1));
    }
}
