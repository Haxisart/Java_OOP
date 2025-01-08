package Matrix;

public class MatrixFill {
    public static void fillMatrix(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        System.out.println("Matrix before filling:");
        printMatrix(matrix);

        fillMatrix(matrix, 5);

        System.out.println("Matrix after filling with value 5:");
        printMatrix(matrix);
    }
}

