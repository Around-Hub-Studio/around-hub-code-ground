package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2747 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n + 1];
    arr[0] = 0;
    arr[1] = 1;

    if (n == 1) {
      System.out.println(arr[1]);
      return;
    }

    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }

    System.out.println(arr[n]);
  }
}
