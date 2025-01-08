package OOP_array_midterm;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 2, 8};
        System.out.println(findSecondLargest(nums)); // Expected: 7
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}

