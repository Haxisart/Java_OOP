package Matrix;

public class MatrixMultiplication1 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrix2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int[][] result = multiplyMatrices(matrix1, matrix2);

        System.out.println("Matrix Multiplication Result:");
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length, cols1 = mat1[0].length, cols2 = mat2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }
}

