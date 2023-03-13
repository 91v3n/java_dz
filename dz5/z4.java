package dz5;

public class z4 {
    public static void main(String[] args) {
        int[] board = new int[8];
        temp(board, 0);
    }

    private static void temp(int[] board, int row) {
        if (row == 8) {
            print(board);
            return;
        }

        for (int col = 0; col < 8; col++) {
            if (position(board, row, col)) {
                board[row] = col;
                temp(board, row + 1);
            }
        }
    }

    private static boolean position(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            int oldCol = board[i];
            if (oldCol == col) { 
                return false;
            }
            if (Math.abs(oldCol - col) == Math.abs(i - row)) { 
                return false;
            }
        }
        return true;
    }

    private static void print(int[] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
