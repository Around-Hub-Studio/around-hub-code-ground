package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1012 {

    static int[][] board;
    static boolean[][] visited;
    static int cnt;
    static int M;
    static int N;
    static int[] dx = new int[]{0, 0, 1, -1};
    static int[] dy = new int[]{1, -1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int test = 0; test < T; test++) {

            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            board = new int[M][N];
            visited = new boolean[M][N];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                board[x][y] = 1;
            }

            cnt = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && board[i][j] == 1) {
                        dfs(i, j);
                        cnt++;
                        // System.out.println("==================Check==================");
                    }
                }
            }
            System.out.println(cnt);
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
            int tempY = y + dy[i];
            // System.out.println("tempX : " + tempX + ", tempY : " + tempY);

            if (tempX >= 0 && tempX < M && tempY >= 0 && tempY < N) {
                if (board[tempX][tempY] == 1 && !visited[tempX][tempY]) {
                    dfs(tempX, tempY);
                }
            }
        }
    }
}
