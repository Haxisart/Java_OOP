package OOP_array_midterm;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));       // Expected output: true
        System.out.println(isAnagram("hello", "world"));         // Expected output: false
        System.out.println(isAnagram("debit card", "bad credit")); // Expected output: false (whitespace-sensitive)
        System.out.println(isAnagram("aabbcc", "abcabc"));       // Expected output: true
    }

    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase for accurate comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths match
        if (str1.length() != str2.length()) {
            return false;
        }

        // Initialize array to count character frequencies
        int[] charCount = new int[128]; // Covers ASCII character set

        // Increment and decrement counts for each character in both strings
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        // If any count is non-zero, strings are not anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

