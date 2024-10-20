package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2164 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    Queue<Integer> queue = new LinkedList<>();

    for (int i = 1; i <= N; i++) {
      queue.offer(i);
    }

    int count = 1;
    while (!queue.isEmpty()) {
      if (queue.size() == 1) {
        System.out.println(queue.poll());
        break;
      }

      if (count % 2 == 0) {
        queue.offer(queue.poll());
      } else {
        queue.poll();
      }
      count++;
    }
  }
}
