package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main11653 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 2; i <= Math.sqrt(N); i++) {
      while (N % i == 0) {
        System.out.println(i);
        N = N / i;
      }
    }

    if (N != 1) {
      System.out.println(N);
    }
  }
}
