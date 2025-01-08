package Matrix;

public class MatrixSum {
    public static int sumMatrixElements(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int elem : row) {
                sum += elem;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        int sum = sumMatrixElements(matrix);
        System.out.println("Sum of all elements in the matrix: " + sum);
    }
}
