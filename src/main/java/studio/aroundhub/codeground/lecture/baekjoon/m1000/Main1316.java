package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1316 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int count = 0;

    for (int T = 0; T < N; T++) {

      int[] array = new int[26];
      String input = sc.next();

      char prev = 0;

      for (int i = 0; i < input.length(); i++) {
        if (i == 0) {
          prev = input.charAt(i);
          array[prev - 97] = 1;
          // System.out.println("check1");
          continue;
        }

        if (prev == input.charAt(i)) {
          // System.out.println("check2");
          continue;
        } else {
          // System.out.println(input.charAt(i)-97);
          if (array[input.charAt(i) - 97] != 1) {
            // System.out.println("check3");
            array[input.charAt(i) - 97] = 1;
            prev = input.charAt(i);
          } else {
            // System.out.println("check4");
            count--;
            break;
          }
        }
      }
      count++;
    }

    System.out.println(count);
  }
}
