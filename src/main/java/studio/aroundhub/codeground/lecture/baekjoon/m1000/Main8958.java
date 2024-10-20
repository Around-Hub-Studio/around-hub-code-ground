package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main8958 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int test = sc.nextInt();

    String[] arr = new String[test];

    for (int i = 0; i < test; i++) {
      arr[i] = sc.next();
    }

    for (int i = 0; i < arr.length; i++) {

      String[] st = arr[i].split("");
      int[] dp = new int[st.length];

      for (int j = 0; j < st.length; j++) {
        if (st[j].equals("X")) {
          dp[j] = 0;
        } else if (st[j].equals("O")) {
          if (j == 0) {
            dp[j] = 1;
          } else {
            dp[j] += dp[j - 1] + 1;
          }
        }
      }
      int sum = 0;
      for (int j = 0; j < dp.length; j++) {
        sum += dp[j];
      }

      System.out.println(sum);
    }
  }
}
