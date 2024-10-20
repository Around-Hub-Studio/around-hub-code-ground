package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2178 {

  static int[][] board;
  static boolean[][] visited;
  static final int[] dx = new int[] {-1, 1, 0, 0};
  static final int[] dy = new int[] {0, 0, 1, -1};

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    board = new int[N][M];
    visited = new boolean[N][M];

    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      for (int j = 0; j < M; j++) {
        board[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
      }
    }

    bfs();
    System.out.println(board[N - 1][M - 1]);
  }

  static void bfs() {
    Queue<Integer> xQueue = new LinkedList<>();
    Queue<Integer> yQueue = new LinkedList<>();

    xQueue.offer(0);
    yQueue.offer(0);

    visited[0][0] = true;

    while (!xQueue.isEmpty() && !yQueue.isEmpty()) {
      int x = xQueue.poll();
      int y = yQueue.poll();

      for (int i = 0; i < dx.length; i++) {
        int tempX = x + dx[i];
        int tempY = y + dy[i];

        if (tempX >= 0 && tempX < board.length && tempY >= 0 && tempY < board[0].length) {
          if (board[tempX][tempY] == 1 && !visited[tempX][tempY]) {
            xQueue.offer(tempX);
            yQueue.offer(tempY);

            visited[tempX][tempY] = true;

            board[tempX][tempY] = board[x][y] + 1;
          }
        }
      }
    }
  }
}
