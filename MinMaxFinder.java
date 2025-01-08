package OOP_array_midterm;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 40, 25};
        System.out.println("Largest: " + findMax(numbers)); // Expected output: 40
        System.out.println("Smallest: " + findMin(numbers)); // Expected output: 5
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
