package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1003 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int t = 0; t < T; t++) {
      int input = sc.nextInt();
      int arrangeInput = input + 3;
      int[][] fibo = new int[arrangeInput + 1][2];
      fibo[0][0] = 1;
      fibo[1][0] = 0;
      fibo[0][1] = 0;
      fibo[1][1] = 1;
      for (int i = 2; i < fibo.length; i++) {
        fibo[i][0] = fibo[i - 1][0] + fibo[i - 2][0];
        fibo[i][1] = fibo[i - 1][1] + fibo[i - 2][1];
      }

      System.out.println(fibo[input][0] + " " + fibo[input][1]);
    }
  }
}
