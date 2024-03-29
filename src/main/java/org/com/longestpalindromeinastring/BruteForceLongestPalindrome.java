package org.com.longestpalindromeinastring;

public class BruteForceLongestPalindrome {
    public static String findLongestPalindrome(final String input) throws Exception {

        if (input == null || input.trim().length() == 0)
            throw new Exception("String is empty.");

        int from= 0, to = 0, max = 0;

        int size = input.length();
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
        int diff = to - from;
        if (diff == 1)
            return true;
        else if (diff == 2)
            return text.charAt(from) == text.charAt(to-1);
        return text.charAt(from) == text.charAt(to-1) && isPalindrome(text, from + 1, to - 1) ;
    }
}
