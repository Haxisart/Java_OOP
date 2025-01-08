package Matrix;

public class ArrayPassing {
    public static void updatePrimitiveArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void updateStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "Updated: " + array[i];
        }
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static void displayArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Apple", "Banana", "Cherry"};

        System.out.println("Original int array:");
        displayArray(intArray);

        updatePrimitiveArray(intArray);
        System.out.println("Updated int array:");
        displayArray(intArray);

        System.out.println("Original String array:");
        displayArray(strArray);

        updateStringArray(strArray);
        System.out.println("Updated String array:");
        displayArray(strArray);
    }
}

