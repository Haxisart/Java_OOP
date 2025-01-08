package Array;

public class MultiDimArray {
    public static void fillMatrix(int[][] matrix) {
        int value = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value++;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        fillMatrix(matrix);

        System.out.println("Matrix:");
        printMatrix(matrix);
    }
}

