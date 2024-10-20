package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7562 {

  static int x, y, xGoal, yGoal, size;
  static int[][] board;
  static boolean[][] visited;

  static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
  static int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int test_case = 0; test_case < T; test_case++) {

      size = sc.nextInt();

      board = new int[size][size];
      visited = new boolean[size][size];

      x = sc.nextInt();
      y = sc.nextInt();
      xGoal = sc.nextInt();
      yGoal = sc.nextInt();

      if (x == xGoal && y == yGoal) {
        System.out.println(0);
        continue;
      }

      bfs();

      System.out.println(board[xGoal][yGoal]);
    }
  }

  static void bfs() {

    Queue<Integer> xQueue = new LinkedList<>();
    Queue<Integer> yQueue = new LinkedList<>();

    xQueue.add(x);
    yQueue.add(y);
    visited[x][y] = true;

    while (!xQueue.isEmpty()) {

      int xx = xQueue.poll();
      int yy = yQueue.poll();
      if (xx == xGoal && yy == yGoal) {
        return;
      }

      for (int i = 0; i < dx.length; i++) {

        int xTemp = xx + dx[i];
        int yTemp = yy + dy[i];

        if (xTemp >= 0 && yTemp >= 0 && xTemp < size && yTemp < size) {
          if (!visited[xTemp][yTemp]) {
            visited[xTemp][yTemp] = true;
            xQueue.add(xTemp);
            yQueue.add(yTemp);
            board[xTemp][yTemp] = board[xx][yy] + 1;
          }
        }
      }
    }
  }
}
