package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main8393 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();
    int sum = 0;
    for (int i = 1; i < input + 1; i++) {
      sum += i;
      // System.out.println(sum);
    }

    System.out.println(sum);
  }
}
