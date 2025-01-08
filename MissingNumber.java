package OOP_array_midterm;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        System.out.println(findMissingNumber(nums, 5)); // Expected: 4
    }

    public static int findMissingNumber(int[] nums, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
