package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2630 {

    static int[][] board;
    static int white;
    static int blue;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        board = new int[N][N];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        check(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void check(int x, int y, int size) {
        // 크기가 1이면 카운팅만 하고 return
        if (size == 1) {
            if (board[x][y] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }
        // 색이 같은지 체크
        boolean equ = false;
        int temp = board[x][y];
        for (int i = x; i < x + size; i++) {
            boolean q = true;
            for (int j = y; j < y + size; j++) {
                if (temp == board[i][j]) {
                    if (i == x + size - 1 && j == y + size - 1) {
                        equ = true;
                        break;
                    }
                } else {
                    q = false;
                    break;
                }
            }
            if (!q) {
                break;
            }
        }

        // 색이 같다면 카운팅
        if (equ) {
            if (temp == 1) {
                blue++;
            } else {
                white++;
            }
            // 색이 다르다면
        } else {
            int tempSize = size / 2;
            check(x, y, tempSize);
            check(x + tempSize, y, tempSize);
            check(x, y + tempSize, tempSize);
            check(x + tempSize, y + tempSize, tempSize);
        }

    }

}
