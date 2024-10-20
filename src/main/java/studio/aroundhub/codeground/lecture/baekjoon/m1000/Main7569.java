package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7569 {

  static int M, N, H;
  static Queue<Integer> xQueue = new LinkedList<>();
  static Queue<Integer> yQueue = new LinkedList<>();
  static Queue<Integer> zQueue = new LinkedList<>();

  static int[][][] box;

  static int[] dx = {0, 0, 0, 0, 1, -1};
  static int[] dy = {0, 0, 1, -1, 0, 0};
  static int[] dz = {1, -1, 0, 0, 0, 0};

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    M = sc.nextInt();
    N = sc.nextInt();
    H = sc.nextInt();

    box = new int[H][N][M];

    for (int i = 0; i < H; i++) { // 층
      for (int j = 0; j < N; j++) { // 세로
        for (int k = 0; k < M; k++) { // 가로
          box[i][j][k] = sc.nextInt();

          if (box[i][j][k] == 1) {
            xQueue.add(k);
            yQueue.add(j);
            zQueue.add(i);
          }
        }
      }
    }

    bfs();

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < H; i++) { // 층
      for (int j = 0; j < N; j++) { // 세로
        for (int k = 0; k < M; k++) { // 가로
          int value = box[i][j][k];
          if (value == 0) {
            System.out.println(-1);
            return;
          }
          max = Math.max(value, max);
        }
      }
    }

    System.out.println(max - 1);
  }

  static void bfs() {

    while (!xQueue.isEmpty() && !yQueue.isEmpty() && !zQueue.isEmpty()) {
      // System.out.println("Check1");

      int x = xQueue.poll();
      int y = yQueue.poll();
      int z = zQueue.poll();

      // System.out.println("x : " + x + ", y : " + y + ", z : " + z);
      // System.out.println("H : " + H + ", M : " + M + ", N : " + N);

      /* for (int i = 0; i < H; i++) { // 층
          System.out.println("# " + (i + 1) + "층 #");
          for (int j = 0; j < N; j++) { // 세로
              for (int k = 0; k < M; k++) { // 가로
                  System.out.print(box[i][j][k] + " ");
              }
              System.out.println();
          }
          System.out.println();
      }*/

      // System.out.println("Check2");

      for (int i = 0; i < dx.length; i++) {
        // System.out.println("Check3");

        int xTemp = x + dx[i];
        int yTemp = y + dy[i];
        int zTemp = z + dz[i];

        if (xTemp >= 0 && yTemp >= 0 && zTemp >= 0 && xTemp < M && yTemp < N && zTemp < H) {
          // 보고 있는 위치에 익지 않은 토마토가 있다면
          if (box[zTemp][yTemp][xTemp] == 0) {

            xQueue.add(xTemp);
            yQueue.add(yTemp);
            zQueue.add(zTemp);

            box[zTemp][yTemp][xTemp] = box[z][y][x] + 1;
          }
        }
      }
    }
  }
}
