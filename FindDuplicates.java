package Array;

import java.util.HashSet;

public class FindDuplicates {

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        System.out.println("Duplicate elements:");
        for (int value : arr) {
            if (!seen.add(value)) {
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 2, 8, 5, 9};
        findDuplicates(numbers);
    }
}

