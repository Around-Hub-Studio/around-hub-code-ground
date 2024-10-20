package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2193 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();

    long[] array = new long[3];

    array[0] = 1;
    array[1] = 1;

    for (int i = 2; i < a; i++) {
      array[2] = array[0] + array[1];
      array[0] = array[1];
      array[1] = array[2];
    }

    System.out.println(array[1]);
  }
}
