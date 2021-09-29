package lecture.baekjoon.m1000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7576 {

    static int[][] board;
    static boolean[][] visited;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static Queue<Integer> xQueue = new LinkedList<>();
    static Queue<Integer> yQueue = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        board = new int[N][M];
        visited = new boolean[N][M];

        int check = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1) {
                    xQueue.offer(i);
                    yQueue.offer(j);
                } else {
                    check = -1;
                }
            }
        }

        if (check == 1) {
            System.out.println(0);
            return;
        }

        bfs();

        int result = -100;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }

                result = Math.max(result, board[i][j]);
            }
        }

        System.out.println(result - 1);

    }

    static void bfs() {

        while (!xQueue.isEmpty() && !yQueue.isEmpty()) {

            int x = xQueue.poll();
            int y = yQueue.poll();

            for (int i = 0; i < dx.length; i++) {
                int tempX = x + dx[i];
                int tempY = y + dy[i];

                if (tempX >= 0 && tempY >= 0 && tempX < board.length && tempY < board[0].length) {
                    if (board[tempX][tempY] == 0) {
                        xQueue.offer(tempX);
                        yQueue.offer(tempY);

                        board[tempX][tempY] = board[x][y] + 1;
                    }
                }
            }
        }
    }

}
