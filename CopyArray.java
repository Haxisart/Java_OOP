package Array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] original = {5, 10, 15, 20, 25};
        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println("Original Array:");
        for (int num : original) {
            System.out.print(num + " ");
        }

        System.out.println("\nCopied Array:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}

