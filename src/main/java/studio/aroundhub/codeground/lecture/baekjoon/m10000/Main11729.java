package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main11729 {

  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sb.append((int) Math.pow(2, N) - 1).append("\n");

    hanoi(N, 1, 2, 3);

    System.out.println(sb.toString());
  }

  public static void hanoi(int N, int start, int position, int end) {

    if (N == 1) {
      sb.append(start + " " + end + "\n");
      return;
    }

    hanoi(N - 1, start, end, position);

    sb.append(start + " " + end + "\n");

    hanoi(N - 1, position, start, end);
  }
}
