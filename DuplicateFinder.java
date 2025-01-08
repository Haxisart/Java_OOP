package OOP_array_midterm;

public class DuplicateFinder {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 1};
        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
    }
}
