package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main11053 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array = new int[N];

    for (int i = 0; i < N; i++) {
      array[i] = sc.nextInt();
    }

    int[] dp = new int[N];
    int max = 1;
    dp[0] = 1;
    for (int i = 1; i < N; i++) {
      dp[i] = 1;
      for (int j = 0; j < i; j++) {
        if (array[i] > array[j] && dp[j] + 1 > dp[i]) {

          dp[i] = dp[j] + 1;
        }
      }
      if (max < dp[i]) {
        max = dp[i];
      }
    }

    System.out.println(max);
  }
}
