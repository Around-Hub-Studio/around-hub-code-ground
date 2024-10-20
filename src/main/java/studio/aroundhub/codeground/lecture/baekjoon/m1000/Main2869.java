package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2869 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int V = sc.nextInt();

    int days = (V - B) / (A - B);

    if ((V - B) % (A - B) != 0) {
      days++;
    }

    System.out.println(days);
  }
}
