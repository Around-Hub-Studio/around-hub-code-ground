package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main11866 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    Queue<Integer> queue = new LinkedList<>();

    for (int i = 0; i < N; i++) {
      queue.offer(i + 1);
    }

    int[] result = new int[N];
    int count = 0;
    while (!queue.isEmpty()) {

      for (int i = 1; i < K; i++) {
        queue.offer(queue.poll());
      }

      result[count++] = queue.poll();
    }

    System.out.print("<");
    for (int i = 0; i < N; i++) {
      System.out.print(result[i]);
      if (i != N - 1) System.out.print(", ");
    }
    System.out.print(">");
  }
}
