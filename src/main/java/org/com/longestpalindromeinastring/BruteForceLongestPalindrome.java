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
        if (size == 1)
            return true;
        else if (size == 2)
            return input.charAt(0) == input.charAt(1);
        return input.charAt(0) == input.charAt(size-1) && isPalindrome(input.substring(1, size - 1)) ;
    }
}
