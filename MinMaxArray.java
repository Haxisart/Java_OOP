package Array;

public class MinMaxArray {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] intArray = {12, 7, 19, 3, 15};
        System.out.println("Maximum value: " + findMax(intArray));
        System.out.println("Minimum value: " + findMin(intArray));
    }
}

