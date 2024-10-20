package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main11047 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] coins = new int[N];
    for (int i = 0; i < N; i++) {
      coins[i] = sc.nextInt();
    }

    int count = 0;
    for (int i = N - 1; i >= 0; i--) {
      if (coins[i] <= K) {
        count += (K / coins[i]);
        K %= coins[i];
      }
    }

    System.out.println(count);
  }
}
