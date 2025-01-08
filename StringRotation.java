package OOP_array_midterm;

public class StringRotation {
    public static void main(String[] args) {
        System.out.println(isRotation("abcd", "dabc")); // Expected: true
        System.out.println(isRotation("hello", "lohel")); // Expected: true
        System.out.println(isRotation("hello", "world")); // Expected: false
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String combined = str1 + str1;
        return combined.contains(str2);
    }
}

