package OOP_array_midterm;

public class AverageCalculator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Average: " + calculateAverage(numbers)); // Expected output: 3.0
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}

