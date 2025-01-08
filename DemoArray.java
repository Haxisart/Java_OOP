package Array;


public class DemoArray {

    // Method to find the minimum value in an array
    public static int findMin(int[] arrOfIntegerValue) {
        int intMin = arrOfIntegerValue[0]; // Initialize with the first element
        for (int eachElement : arrOfIntegerValue) {
            if (eachElement < intMin) {
                intMin = eachElement;
            }
        }
        return intMin;
    }

    // Method to display and update the array
    public static void displayArray(int[] arrList) {
        // Increment each element in the array
        for (int i = 0; i < arrList.length; i++) {
            arrList[i] += 1;
        }

        // Print updated array elements
        for (int i = 0; i < arrList.length; i++) {
            System.out.println("Array element [" + i + "] = " + arrList[i]);
        }
    }

    public static void main(String[] args) {

        // Declaration and initialization
        double[] arrOfDouble; // Declaration only
        char[] arrOfCharacter = new char[10]; // Declared and memory reserved
        boolean[] arrOfBoolean = new boolean[5]; // Declared and memory reserved
        int[] arrOfInteger = {10, 20, 30}; // Declared, reserved memory, and initialized

        // Display Array of Integer
        System.out.println("Array of Integers:");
        for (int i = 0; i < arrOfInteger.length; i++) {
            System.out.println("arrOfInteger [" + i + "] = " + arrOfInteger[i]);
        }

        // Display Array of Boolean
        System.out.println("\nArray of Booleans:");
        for (int i = 0; i < arrOfBoolean.length; i++) {
            System.out.println("arrOfBoolean [" + i + "] = " + arrOfBoolean[i]);
        }

        // Find and display the minimum value in the integer array
        int intMin = findMin(arrOfInteger);
        System.out.println("\nThe minimum value in the array is: " + intMin);

        // Update and display the array
        System.out.println("\nUpdated Array of Integers:");
        displayArray(arrOfInteger);

        // Display Array of Integers after the update
        System.out.println("\nArray of Integers after update:");
        for (int i = 0; i < arrOfInteger.length; i++) {
            System.out.println("arrOfInteger [" + i + "] = " + arrOfInteger[i]);
        }
    }
}
