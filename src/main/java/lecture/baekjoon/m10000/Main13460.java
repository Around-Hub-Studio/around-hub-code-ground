package lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main13460 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[][] board = new String[N][M];
        int[] red = new int[2];
        int[] blue = new int[2];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] = sc.next();
                if (board[i][j].equals("B")) {
                    blue[0] = i;
                    blue[1] = j;
                    board[i][j] = ".";
                }else if(board[i][j].equals("R")) {
                    red[0] = i;
                    red[1] = j;
                    board[i][j] = ".";
                }
            }
        }



    }

}
