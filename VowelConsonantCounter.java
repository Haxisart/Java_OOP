package OOP_array_midterm;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String text = "Hello World";
        countVowelsAndConsonants(text);
    }

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

