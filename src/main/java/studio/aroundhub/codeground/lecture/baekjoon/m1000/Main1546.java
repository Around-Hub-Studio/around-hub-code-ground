package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1546 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    double[] score = new double[N];

    double max = 0;

    for (int i = 0; i < score.length; i++) {
      score[i] = sc.nextInt();

      if (max < score[i]) {
        max = score[i];
      }
    }

    double sum = 0;

    for (int i = 0; i < score.length; i++) {

      sum += (score[i] / max) * 100;
    }

    System.out.println(sum / score.length);
  }
}
