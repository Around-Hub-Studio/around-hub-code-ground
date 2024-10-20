package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main10808 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String input = sc.next();

    int[] arr = new int[26];

    for (int i = 0; i < input.length(); i++) {
      int a = input.charAt(i) - 97;
      arr[a]++;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
