package OOP_array_midterm;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // Expected: true
        System.out.println(isArmstrong(123)); // Expected: false
    }

    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        return sum == original;
    }
}

