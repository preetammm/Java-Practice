package DSA;

public class backtraking1  {

    static int N = 8;

    static int[] dx = { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int[] dy = { 1, 2,  2,  1, -1, -2,-2,-1 };

    static boolean isSafe(int x, int y, int[][] board) {
        return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1);
    }

    static boolean solveKTUtil(int x, int y, int move, int[][] board) {

        if (move == N * N)
            return true;

        for (int k = 0; k < 8; k++) {
            int nextX = x + dx[k];
            int nextY = y + dy[k];

            if (isSafe(nextX, nextY, board)) {
                board[nextX][nextY] = move;

                if (solveKTUtil(nextX, nextY, move + 1, board))
                    return true;

                // backtracking
                board[nextX][nextY] = -1;
            }
        }
        return false;
    }

    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row)
                System.out.printf("%2d ", cell);
            System.out.println();
        }
    }

    static void solveKT() {
        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = -1;

        board[0][0] = 0;

        if (!solveKTUtil(0, 0, 1, board)) {
            System.out.println("No solution exists");
            return;
        }

        printBoard(board);
    }

    public static void main(String[] args) {
        solveKT();
    }
}

