package OOP_array_midterm;

public class CharacterCounter {
    public static void main(String[] args) {
        String input = "Hello World!";
        System.out.println(countCharacters(input)); // Expected output: 10
    }

    public static int countCharacters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }
}

