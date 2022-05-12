package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2667 {

    static int[][] board;
    static boolean[][] visited;
    static int cnt;
    static ArrayList<Integer> count = new ArrayList<>();
    static int[] dx = new int[]{0, 0, 1, -1};
    static int[] dy = new int[]{1, -1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && board[i][j] == 1) {
                    cnt = 1;
                    dfs(i, j);
                    count.add(cnt);
                }
            }
        }

        Collections.sort(count);
        System.out.println(count.size());
        for (int input : count) {
            System.out.println(input);
        }

    }

    public static void dfs(int x, int y) {
        if (visited[x][y]) {
            return;
        }
        //System.out.println("visited[" + x + "][" + y + "] 에 true 마킹");
        visited[x][y] = true;

        for (int i = 0; i < dx.length; i++) {
            int tempX = x + dx[i];
            int tempY = y+ dy[i];
            //System.out.println("tempX : " + tempX + ", tempY : " + tempY);

            if (tempX >= 0 && tempX < board.length && tempY >= 0 && tempY < board.length) {
                if (board[tempX][tempY] == 1 && !visited[tempX][tempY]) {
                    cnt++;
                    dfs(tempX, tempY);
                }
            }
        }
    }


}
