package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1929 {

  static boolean[] arr;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int M = sc.nextInt();
    int N = sc.nextInt();

    arr = new boolean[N + 1];
    cal(N);

    for (int i = M; i < arr.length; i++) {
      if (!arr[i]) {
        System.out.println(i);
      }
    }
  }

  public static void cal(int max) {
    arr[0] = true;
    arr[1] = true;

    if (max < 2) {
      return;
    }
    for (int i = 2; i < Math.sqrt(arr.length); i++) {

      if (arr[i]) {
        continue;
      }

      for (int j = i * i; j < max + 1; j = j + i) {
        arr[j] = true;
      }
    }
  }
}
