public class RatInMaze {

    // Recursive function to solve the maze
    public static boolean solveMaze(int[][] maze, int row, int col, int[][] solution) {
        int n = maze.length;

        // Base Case: If the rat reaches the bottom-right corner, the problem is solved
        if (row == n - 1 && col == n - 1) {
            solution[row][col] = 1;
            return true;
        }

        // Check if the current cell is valid
        if (isSafe(maze, row, col)) {
            // Mark the current cell in the solution path
            solution[row][col] = 1;

            // Move Right
            if (solveMaze(maze, row, col + 1, solution)) {
                return true;
            }

            // Move Down
            if (solveMaze(maze, row + 1, col, solution)) {
                return true;
            }

            // If neither move works, backtrack: unmark the current cell
            solution[row][col] = 0;
            return false;
        }

        return false;
    }

    // Utility function to check if the current cell is safe to move into
    public static boolean isSafe(int[][] maze, int row, int col) {
        int n = maze.length;
        // Check if the cell is within bounds and is a valid path (1 means open)
        return (row >= 0 && row < n && col >= 0 && col < n && maze[row][col] == 1);
    }

    // Main function to initialize the maze and the solution matrix
    public static void main(String[] args) {
        // Example maze where 1 is open and 0 is blocked
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int n = maze.length;
        int[][] solution = new int[n][n];

        if (solveMaze(maze, 0, 0, solution)) {
            // Print the solution path if there is one
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(solution[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists");
        }
    }
}

