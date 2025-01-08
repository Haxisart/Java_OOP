package OOP_array_midterm;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 7; // Number of terms
        printFibonacci(n); // Expected output: 0 1 1 2 3 5 8
    }

    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }
}

