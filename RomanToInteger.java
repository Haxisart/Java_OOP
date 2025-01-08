package OOP_array_midterm;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("XIV")); // Expected: 14
        System.out.println(romanToInt("XC"));  // Expected: 90
    }

    public static int romanToInt(String roman) {
        int result = 0;
        int prev = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int curr = romanValue(roman.charAt(i));

            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }

    private static int romanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}

