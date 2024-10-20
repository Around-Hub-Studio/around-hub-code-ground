package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2805 {

  static int N, M;
  static long[] treeHeight;
  static long max, left, right;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    M = sc.nextInt();

    treeHeight = new long[N];

    for (int i = 0; i < treeHeight.length; i++) {
      treeHeight[i] = sc.nextLong();
      max = Math.max(max, treeHeight[i]);
    }

    max++;

    binarySearch(M);

    System.out.println(left - 1);
  }

  static void binarySearch(long goal) {

    left = 0;
    right = max;

    while (left < right) {

      long mid = (left + right) / 2;

      long num = 0;
      for (int i = 0; i < treeHeight.length; i++) {
        if (mid < treeHeight[i]) {
          num += treeHeight[i] - mid;
        }
      }

      if (num < goal) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
  }
}
