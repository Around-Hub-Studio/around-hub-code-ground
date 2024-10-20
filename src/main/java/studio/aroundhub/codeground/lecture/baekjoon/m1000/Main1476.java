package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1476 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int E = sc.nextInt();
    int S = sc.nextInt();
    int M = sc.nextInt();

    int count = 1;
    int e = 1;
    int s = 1;
    int m = 1;
    while (true) {
      if (e == E && s == S && m == M) {
        break;
      }
      e++;
      s++;
      m++;
      count++;
      if (e >= 16) {
        e = 1;
      }
      if (s >= 29) {
        s = 1;
      }
      if (m >= 20) {
        m = 1;
      }
    }

    System.out.println(count);
  }
}
