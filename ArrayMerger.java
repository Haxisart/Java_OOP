package OOP_array_midterm;

public class ArrayMerger {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] merged = mergeArrays(arr1, arr2);

        for (int num : merged) {
            System.out.print(num + " "); // Expected output: 1 2 3 4 5 6
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;

        for (int num : arr1) {
            merged[index++] = num;
        }
        for (int num : arr2) {
            merged[index++] = num;
        }

        return merged;
    }
}

