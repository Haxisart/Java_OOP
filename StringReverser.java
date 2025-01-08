package OOP_array_midterm;

public class StringReverser {
    public static void main(String[] args) {
        System.out.println(reverseString("hello")); // Expected output: "olleh"
        System.out.println(reverseString("Java")); // Expected output: "avaJ"
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

