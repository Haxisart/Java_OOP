package OOP_array_midterm;

public class EvenOddChecker {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        printEvenOdd(numbers);
    }

    public static void printEvenOdd(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }
    }
}
