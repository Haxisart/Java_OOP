package Matrix;

public class MatrixScalarMultiplication {
    public static void multiplyMatrixByScalar(int[][] matrix, int scalar) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= scalar;
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
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int scalar = 3;
        multiplyMatrixByScalar(matrix, scalar);

        System.out.println("Matrix after multiplying by scalar " + scalar + ":");
        printMatrix(matrix);
    }
}

