package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1330 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a < b) {
      System.out.println("<");
    } else if (a > b) {
      System.out.println(">");
    } else {
      System.out.println("==");
    }
  }
}
