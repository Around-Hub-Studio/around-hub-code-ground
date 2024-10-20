package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main15651 {

  static int[] array;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    array = new int[M];

    dfs(N, M, 0);
    System.out.println(sb);
  }

  public static void dfs(int N, int M, int depth) {

    if (depth == M) {
      for (int i = 0; i < array.length; i++) {
        sb.append(array[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = 1; i <= N; i++) {
      array[depth] = i;
      dfs(N, M, depth + 1);
    }
  }
}
