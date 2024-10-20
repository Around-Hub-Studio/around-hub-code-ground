package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1427 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String input = sc.next();

    String[] array = input.split("");

    Arrays.sort(array, Comparator.reverseOrder());

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
    }
  }
}
