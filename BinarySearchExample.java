package OOP_array_midterm;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(sortedArray, 5, 0, sortedArray.length - 1)); // Expected output: 2
        System.out.println(binarySearch(sortedArray, 8, 0, sortedArray.length - 1)); // Expected output: -1
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Element not found
        }

        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, high);
        } else {
            return binarySearch(arr, target, low, mid - 1);
        }
    }
}

