package org.com.longestpalindromeinastring;

public class DynamicLongestPalindrome {

    public static String findLongestPalindrome(final String input) throws Exception {

        if ( input == null || input.trim().length() == 0 )
            throw new Exception("String is empty.");

        int from = 0, to = 0, max = 1;
        int size = input.length();
        /* isPalindrome[i][j] means input.substring(i,j+1) is a palindrome or not a palindrome */
        boolean[][] isPalindrome = new boolean[size][size];


        isPalindrome[0][0] = true;
        for (int i = 1; i < size; i++) {
            /* every single character is a palindrome itself, so -> */
            isPalindrome[i][i] = true;
            /* comparing two characters */
            isPalindrome[i][i-1] = input.charAt(i) == input.charAt(i-1);
        }

        /* logic
        *   imagine a string chars -> a1 a2 a3 a4 a5 a6 a7 a8
        *   a2a3a4a5a6a7 is a palindrome if a2 = a7 and a3a4a5a6 is a palindrome
        * */
        for (int endIndex = 2; endIndex < size; endIndex++ ) {
            for (int startIndex = 0; startIndex < endIndex - 1; startIndex++) {
                boolean temp = isPalindrome[endIndex-1][startIndex+1] &&
                        (input.charAt(endIndex) == input.charAt(startIndex));
                if (temp) {
                    isPalindrome[endIndex][startIndex] = temp;
                    int palLength = endIndex - startIndex + 1;
                    if (max < palLength) {
                        max = palLength;
                        from = startIndex;
                        to = endIndex;
                    }
                }
            }
        }
        return max == 1 ? "" : input.substring(from, to + 1) ;
    }
}
