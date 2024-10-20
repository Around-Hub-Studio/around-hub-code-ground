package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Arrays;
import java.util.Scanner;

public class Main1931 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[][] arr = new int[N][2];

    for (int i = 0; i < arr.length; i++) {
      arr[i][0] = sc.nextInt();
      arr[i][1] = sc.nextInt();
    }

    Arrays.sort(
        arr,
        (a1, a2) -> {
          if (a1[1] == a2[1]) {
            return a1[0] - a2[0];
          } else {
            return a1[1] - a2[1];
          }
        });

    int right = -1;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        count++;
        right = arr[i][1];
        continue;
      }

      // 밖에 있는 경우
      if (arr[i][0] >= right) {
        // System.out.println(arr[i][0] + " " + arr[i][1]);
        right = arr[i][1];
        count++;
      }
    }

    System.out.println(count);
  }
}
