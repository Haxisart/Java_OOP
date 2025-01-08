package OOP_array_midterm;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // Expected output: true
        System.out.println(isPalindrome("hello")); // Expected output: false
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

