public class NQueens {
    private int count = 0; // To count the number of solutions

    public void solveNQueens(int n) {
        // Create a chessboard
        int[][] board = new int[n][n];

        // Start solving the problem
        placeQueens(board, 0, n);
        System.out.println("Total solutions: " + count);
    }

    private void placeQueens(int[][] board, int row, int n) {
        // Base case: If all queens are placed successfully
        if (row == n) {
            printBoard(board, n);
            count++; // Increment the solution count
            return;
        }

        // Try placing the queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                // Place the queen
                board[row][col] = 1;

                // Recur to place the rest of the queens
                placeQueens(board, row + 1, n);

                // Backtrack: Remove the queen
                board[row][col] = 0;
            }
        }
    }

    // Function to check if it's safe to place a queen at board[row][col]
    private boolean isSafe(int[][] board, int row, int col, int n) {
        // Check this column on upper rows
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false; // Another queen is in the same column
            }
        }

        // Check upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false; // Another queen is on the upper left diagonal
            }
        }

        // Check upper diagonal on the right side
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false; // Another queen is on the upper right diagonal
            }
        }

        return true; // Safe to place the queen
    }

    // Function to print the chessboard
    private void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main method to run the N-Queens solver
    public static void main(String[] args) {
        NQueens nQueens = new NQueens();
        int n = 4; // Change this value for different sizes of the board
        nQueens.solveNQueens(n);
    }
}

