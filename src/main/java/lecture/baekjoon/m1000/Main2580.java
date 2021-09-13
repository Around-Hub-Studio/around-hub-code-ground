package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2580 {

    static int[][] board;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        board = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        sudoku(0, 0);

    }

    public static void sudoku(int x, int y) {

        if (y == 9) {
            sudoku(x + 1, 0);
            return;
        }

        if (x == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        if (board[x][y] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (check(x, y, i)) {
                    board[x][y] = i;
                    sudoku(x, y + 1);
                }
            }
            board[x][y] = 0;
            return;
        }

        sudoku(x, y + 1);
    }

    public static boolean check(int x, int y, int value) {

        for (int i = 0; i < 9; i++) {
            if (board[x][i] == value) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][y] == value) {
                return false;
            }
        }

        int startX = (x / 3) * 3;
        int startY = (y / 3) * 3;

        for (int i = startX; i < startX + 3; i++) {
            for (int j = startY; j < startY + 3; j++) {
                if (board[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
