package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1094 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int bar = 64;

    int x = sc.nextInt();

    int count = 0;
    while (x > 0) {
      if (bar > x) {
        bar /= 2;
      } else {
        x -= bar;
        count++;
      }
    }
    System.out.println(count);
  }
}
