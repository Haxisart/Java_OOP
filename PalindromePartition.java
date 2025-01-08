package Array;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    public static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void findPartitions(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                current.add(s.substring(start, i + 1));
                findPartitions(s, i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String input = "aab";
        List<List<String>> result = new ArrayList<>();
        findPartitions(input, 0, new ArrayList<>(), result);

        System.out.println("Palindrome partitions of " + input + ":");
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}

