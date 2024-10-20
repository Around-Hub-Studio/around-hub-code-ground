package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이분탐색 문제
 */
public class Main2110 {

  static int N, C;
  static int[] arr;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    C = sc.nextInt();

    arr = new int[N];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    int left = 1;
    int right = arr[arr.length - 1] - arr[0];
    int ans = 1;

    while (left <= right) {

      int mid = (left + right) / 2;

      int count = 1;
      int position = arr[0] + mid;
      for (int i = 0; i < arr.length; i++) {
        if (position <= arr[i]) {
          position = arr[i] + mid;
          count++;
        }
      }

      if (count >= C) {
        left = mid + 1;
        ans = Math.max(ans, mid);
      } else {
        right = mid - 1;
      }
    }

    System.out.println(ans);
  }
}
