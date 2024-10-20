package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1005 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int TEST_CASE = sc.nextInt();

    for (int T = 0; T < TEST_CASE; T++) {

      int N = sc.nextInt();
      int K = sc.nextInt();

      int[] buildings = new int[N + 1];
      int[][] orders = new int[K + 1][2];

      for (int i = 0; i < N; i++) {
        buildings[i + 1] = sc.nextInt();
      }

      for (int i = 0; i < K; i++) {
        orders[i][0] = sc.nextInt();
        orders[i][1] = sc.nextInt();
      }
    }
  }
}
