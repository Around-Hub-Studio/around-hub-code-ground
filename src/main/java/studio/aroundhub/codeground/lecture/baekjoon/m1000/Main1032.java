package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1032 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String[] arr = new String[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.next();
    }

    for (int i = 0; i < arr[0].length(); i++) {
      char s = arr[0].charAt(i);
      boolean same = true;
      for (int j = 0; j < n; j++) {
        if (s != (arr[j].charAt(i))) {
          same = false;
        }
      }
      if (same == true) {
        System.out.print(s);
      } else {
        System.out.print("?");
      }
    }
  }
}
