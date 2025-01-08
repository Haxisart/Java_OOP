package Array;

public class SudokuValidator {
    public static boolean isValidSudoku(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            boolean[] subGridCheck = new boolean[9];

            for (int j = 0; j < 9; j++) {
                // Row check
                if (grid[i][j] != 0) {
                    if (rowCheck[grid[i][j] - 1]) return false;
                    rowCheck[grid[i][j] - 1] = true;
                }
                // Column check
                if (grid[j][i] != 0) {
                    if (colCheck[grid[j][i] - 1]) return false;
                    colCheck[grid[j][i] - 1] = true;
                }
                // Sub-grid check
                int subRow = 3 * (i / 3) + j / 3;
                int subCol = 3 * (i % 3) + j % 3;
                if (grid[subRow][subCol] != 0) {
                    if (subGridCheck[grid[subRow][subCol] - 1]) return false;
                    subGridCheck[grid[subRow][subCol] - 1] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] sudokuGrid = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (isValidSudoku(sudokuGrid)) {
            System.out.println("The Sudoku grid is valid.");
        } else {
            System.out.println("The Sudoku grid is invalid.");
        }
    }
}

