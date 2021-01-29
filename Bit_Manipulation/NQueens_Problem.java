package Bit_Manipulation;

import java.util.Scanner;

public class NQueens_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean board[][] = new boolean[n][n];
        int cols = 0;
        int ndiag = 0;
        int rdiag = 0;
        solution(board, 0, cols, ndiag, rdiag, "");
    }

    private static void solution(boolean[][] board, int row, int cols, int ndiag, int rdiag, String s) {
        if (row == board.length) {
            System.out.println(s);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (
                    ((cols & (1 << col)) == 0) &&
                    ((ndiag & (1 << (row + col))) == 0) &&
                    ((rdiag & (1 << ((row - col) + (board.length - 1)))) == 0)
            ) {
                board[row][col] = true;

                cols ^= (1 << col);   // here we've toggled the bits of the particular column.

                ndiag ^= (1 << (row + col));     // toggled the bits of the natural diagonal

                rdiag ^= (1 << ((row - col) + (board.length - 1)));     // toggled the bits of the reverse diagonal

                // recursive call to the next row
                solution(board, row + 1, cols, ndiag, rdiag, s + row + "-" + col + ", ");

                cols ^= (1 << col);   // here we've toggled the bits of the particular column while backtracking

                ndiag ^= (1 << (row + col));     // toggled the bits of the natural diagonal while backtracking

                rdiag ^= (1 << ((row - col) + (board.length - 1)));     // toggled the bits of the reverse diagonal
                                                                        // while backtracking
                board[row][col] = false;
            }
        }
    }
}
