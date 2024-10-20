package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2156 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    if (n <= 2) {
      int sum = 0;
      for (int i = 0; i < n; i++) {
        sum += arr[i];
      }
      System.out.println(sum);
    } else {
      int[] dp = new int[n];

      dp[0] = arr[0];
      dp[1] = arr[0] + arr[1];
      dp[2] = Math.max(dp[1], dp[0] + arr[2]);
      dp[2] = Math.max(dp[2], arr[1] + arr[2]);

      for (int i = 3; i < n; i++) {
        int result = 0;
        result = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        result = Math.max(result, dp[i - 3] + arr[i] + arr[i - 1]);
        dp[i] = result;
      }

      System.out.println(dp[n - 1]);
    }
  }
}
