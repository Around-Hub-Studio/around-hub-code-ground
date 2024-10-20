package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main13305 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] distance = new int[N - 1];
    int[] cost = new int[N];

    for (int i = 0; i < distance.length; i++) {
      distance[i] = sc.nextInt();
    }

    for (int i = 0; i < cost.length; i++) {
      cost[i] = sc.nextInt();
    }

    int minCost = cost[0];

    long sum = 0;
    for (int i = 0; i < distance.length; i++) {
      if (minCost >= cost[i]) {
        minCost = cost[i];
      }
      sum += (long) minCost * distance[i];
    }

    System.out.println(sum);
  }
}
