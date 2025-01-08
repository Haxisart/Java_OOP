package Array;

public class LargestConnectedComponent {
    public static int findLargestComponent(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int largest = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    largest = Math.max(largest, dfs(grid, visited, i, j));
                }
            }
        }

        return largest;
    }

    private static int dfs(int[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;
        int size = 1;

        size += dfs(grid, visited, i + 1, j);
        size += dfs(grid, visited, i - 1, j);
        size += dfs(grid, visited, i, j + 1);
        size += dfs(grid, visited, i, j - 1);
        size += dfs(grid, visited, i + 1, j + 1);
        size += dfs(grid, visited, i - 1, j - 1);
        size += dfs(grid, visited, i + 1, j - 1);
        size += dfs(grid, visited, i - 1, j + 1);

        return size;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 0}
        };

        int largest = findLargestComponent(grid);
        System.out.println("The largest connected component size is " + largest);
    }
}

