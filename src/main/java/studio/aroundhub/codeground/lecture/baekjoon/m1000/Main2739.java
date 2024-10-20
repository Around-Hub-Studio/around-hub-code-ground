package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2739 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    for (int i = 1; i < 10; i++) {
      System.out.println(a + " * " + i + " = " + (a * i));
    }
  }
}
