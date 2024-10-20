package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2675 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int tt = 0; tt < T; tt++) {

      int R = sc.nextInt();

      String input = sc.next();

      for (int i = 0; i < input.length(); i++) {
        for (int j = 0; j < R; j++) {
          System.out.print(input.charAt(i));
        }
      }
      System.out.println();
    }
  }
}
