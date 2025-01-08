package OOP_array_midterm;

public class GCD {
    public static void main(String[] args) {
        System.out.println(findGCD(54, 24)); // Expected: 6
        System.out.println(findGCD(81, 27)); // Expected: 27
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

