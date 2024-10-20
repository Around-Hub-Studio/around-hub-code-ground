package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1712 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 고정 비용
    int A = sc.nextInt();

    // 가변 비용
    int B = sc.nextInt();

    // 노트북 가격
    int C = sc.nextInt();

    if (C <= B) {
      System.out.println(-1);
      return;
    }

    int count = (A / (C - B)) + 1;

    System.out.println(count);
  }
}
