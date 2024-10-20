package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2562 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int result = 0;
    int position = 0;

    for (int i = 0; i < 9; i++) {
      int num = sc.nextInt();
      if (result < num) {
        result = num;
        position = i + 1;
      }
    }

    System.out.println(result);
    System.out.println(position);
  }
}
