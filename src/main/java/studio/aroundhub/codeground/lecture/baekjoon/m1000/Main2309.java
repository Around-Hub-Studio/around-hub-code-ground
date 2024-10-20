package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Arrays;
import java.util.Scanner;

public class Main2309 {

  static int[] arr = new int[9];
  static boolean[] visited = new boolean[9];

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      sum += arr[i];
    }

    Arrays.sort(arr);

    loop:
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i != j) {
          int temp = sum - arr[i] - arr[j];

          if (temp == 100) {
            visited[i] = true;
            visited[j] = true;
            break loop;
          }
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      // System.out.println("탐색 넘버 : " + arr[i]);
      if (!visited[i]) {
        System.out.println(arr[i]);
      }
    }
  }
}
