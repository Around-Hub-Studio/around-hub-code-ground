package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2577 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    long abc = a * b * c;

    String text = Long.toString(abc);

    String[] arr = text.split("");

    int[] count = new int[10];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals("0")) {
        count[0]++;
      } else if (arr[i].equals("1")) {
        count[1]++;
      } else if (arr[i].equals("2")) {
        count[2]++;
      } else if (arr[i].equals("3")) {
        count[3]++;
      } else if (arr[i].equals("4")) {
        count[4]++;
      } else if (arr[i].equals("5")) {
        count[5]++;
      } else if (arr[i].equals("6")) {
        count[6]++;
      } else if (arr[i].equals("7")) {
        count[7]++;
      } else if (arr[i].equals("8")) {
        count[8]++;
      } else if (arr[i].equals("9")) {
        count[9]++;
      }
    }

    for (int i = 0; i < count.length; i++) {
      System.out.println(count[i]);
    }
  }
}
