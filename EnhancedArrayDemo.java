package Array;



public class EnhancedArrayDemo {
    public static int findMax(int[] arrOfIntegerValue) {
        // Find the maximum value from the array
        int intMax = arrOfIntegerValue[0];
        for (int eachElement : arrOfIntegerValue) {
            if (eachElement > intMax) {
                intMax = eachElement;
            }
        }
        return intMax;
    }

    public static double calculateAverage(int[] arrOfIntegerValue) {
        // Calculate the average of array elements
        int sum = 0;
        for (int eachElement : arrOfIntegerValue) {
            sum += eachElement;
        }
        return (double) sum / arrOfIntegerValue.length;
    }

    public static void reverseArray(int[] arrList) {
        // Reverse the array
        int start = 0, end = arrList.length - 1;
        while (start < end) {
            int temp = arrList[start];
            arrList[start] = arrList[end];
            arrList[end] = temp;
            start++;
            end--;
        }
    }

    public static void displayArray(int[] arrList) {
        // Display array elements
        System.out.println("Array Elements:");
        for (int value : arrList) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Declare and Initialize Arrays
        int[] arrOfInteger = {10, 20, 30, 40, 50};
        char[] arrOfCharacter = {'A', 'B', 'C', 'D', 'E'};
        boolean[] arrOfBoolean = {true, false, true, false, true};

        // Display Original Integer Array
        System.out.println("Original Integer Array:");
        displayArray(arrOfInteger);

        // Find and Display Maximum Value
        int maxValue = findMax(arrOfInteger);
        System.out.println("The maximum value in the array is: " + maxValue);

        // Calculate and Display Average
        double averageValue = calculateAverage(arrOfInteger);
        System.out.println("The average value of the array is: " + averageValue);

        // Reverse and Display Array
        reverseArray(arrOfInteger);
        System.out.println("Reversed Integer Array:");
        displayArray(arrOfInteger);

        // Display Character Array
        System.out.println("\nCharacter Array:");
        for (int i = 0; i < arrOfCharacter.length; i++) {
            System.out.println("arrOfCharacter[" + i + "] = " + arrOfCharacter[i]);
        }

        // Display Boolean Array
        System.out.println("\nBoolean Array:");
        for (int i = 0; i < arrOfBoolean.length; i++) {
            System.out.println("arrOfBoolean[" + i + "] = " + arrOfBoolean[i]);
        }
    }
}
