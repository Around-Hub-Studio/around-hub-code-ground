package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1110 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int count = 0;
    int copy = N;

    while (true) {
      copy = ((copy % 10) * 10) + (((copy / 10) + (copy % 10)) % 10);
      count++;

      if (copy == N) {
        break;
      }
    }

    System.out.println(count);
  }
}
