package org.com.longestpalindromeinastring;

public class BruteForceLongestPalindrome {
    public static String findLongestPalindrome(final String input) throws Exception {

        if (input == null || input.trim().length() == 0)
            throw new Exception("String is empty.");

        int from= 0, to = 0, max = 1;

        int size = input.length();
        for (int i = 0; i < size - 1; i ++) {
            for (int j = i + 2; j <= size; j ++) {
                if (isPalindrome(input.substring(i, j)) && (j - i) > max) {
                    from = i; to = j;
                    max = j - i;
                }
            }
        }

        return max == 1 ? "" : input.substring(from, to);
    }

    private static boolean isPalindrome(final String input) {
        int size = input.length();
        for (int i = 0; i < size/2; i++ ) {
            if (input.charAt(i) != input.charAt(size - i - 1))
                return false;
        }
        return true;
    }
}
