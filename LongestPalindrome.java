package Array;

public class LongestPalindrome {
    public static String findLongestPalindrome(String str) {
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        int maxLength = 0;
        String longestPalindrome = "";

        for (int length = 1; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;

                if (length == 1) {
                    dp[i][j] = true;
                } else if (length == 2) {
                    dp[i][j] = (str.charAt(i) == str.charAt(j));
                } else {
                    dp[i][j] = (str.charAt(i) == str.charAt(j)) && dp[i + 1][j - 1];
                }

                if (dp[i][j] && length > maxLength) {
                    maxLength = length;
                    longestPalindrome = str.substring(i, j + 1);
                }
            }
        }

        return longestPalindrome;
    }

    public static void main(String[] args) {
        String input = "babad";
        String longestPalindrome = findLongestPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Longest Palindrome: " + longestPalindrome);
    }
}

