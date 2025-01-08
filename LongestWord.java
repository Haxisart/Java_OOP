package OOP_array_midterm;

public class LongestWord {
    public static void main(String[] args) {
        System.out.println(findLongestWord("The quick brown fox jumps over the lazy dog")); // Expected: "jumps"
        System.out.println(findLongestWord("Java is awesome")); // Expected: "awesome"
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}

