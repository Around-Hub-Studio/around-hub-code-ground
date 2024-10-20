package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2231 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int count = 1;

    int M = N;
    while (true) {
      M = M / 10;
      if (M > 0) {
        count++;
      } else {
        break;
      }
    }
    // System.out.println(count);

    int maxRange = 9 * count;

    // System.out.println(maxRange);

    M = N - maxRange;

    int result = 0;
    for (int i = M; i < N; i++) {
      if (i < 0) {
        continue;
      }
      // System.out.println("i = " + i);
      String str = Integer.toString(i);
      String[] strs = str.split("");

      // System.out.println(strs.length);
      int sum = i;
      for (int j = 0; j < strs.length; j++) {
        sum += Integer.parseInt(strs[j]);
      }

      // System.out.println(i + "의 분해합은 " + sum);
      if (sum == N) {
        result = i;
        break;
      }
    }

    System.out.println(result);
  }
}
