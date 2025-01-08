package OOP_array_midterm;

public class FibonacciGenerator {
    public static void main(String[] args) {
        generateFibonacci(10); // Expected: 0 1 1 2 3 5 8 13 21 34
    }

    public static void generateFibonacci(int count) {
        if (count < 1) {
            return;
        }

        int a = 0, b = 1;
        System.out.print(a + " ");
        if (count > 1) {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= count; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}

