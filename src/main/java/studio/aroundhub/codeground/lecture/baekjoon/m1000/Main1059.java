package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1059 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    int[] array = new int[a];

    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextInt();
    }

    int b = sc.nextInt();

    int min = 0;
    int max = 1001;

    for (int i = 0; i < array.length; i++) {
      if (array[i] < b) {
        if (min < array[i]) {
          min = array[i];
        } else {

        }
      } else {
        if (max > array[i]) {
          max = array[i];
        } else {

        }
      }
    }

    int d = b - min;
    int e = max - b;
    int f = (d * e) - 1;
    if (f == -1) {
      System.out.println(0);
    } else {
      System.out.println(f);
    }
  }
}
