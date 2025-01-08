package Array;

public class ReverseWords {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Java is fun";
        String output = reverseWords(input);

        System.out.println("Original sentence: " + input);
        System.out.println("Reversed words: " + output);
    }
}

