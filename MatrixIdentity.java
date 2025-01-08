package Matrix;

public class MatrixIdentity {
    public static boolean isIdentityMatrix(int[][] matrix) {
        int n = matrix.length;

        // Check for identity matrix properties: 1's on the diagonal and 0's elsewhere
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        if (isIdentityMatrix(matrix)) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }
    }
}

