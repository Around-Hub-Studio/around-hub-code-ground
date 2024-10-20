package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main18258 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Queue<Integer> queue = new LinkedList<>();
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    int last = 0;
    for (int i = 0; i < N; i++) {
      String input = br.readLine();
      if (input.contains("push")) {

        String[] split = input.split(" ");
        queue.offer(Integer.parseInt(split[1]));
        last = Integer.parseInt(split[1]);

      } else if (input.contains("pop")) {
        try {
          int a = queue.poll();
          sb.append(a).append("\n");
        } catch (NullPointerException e) {
          sb.append(-1).append("\n");
        }

      } else if (input.contains("size")) {

        sb.append(queue.size()).append("\n");

      } else if (input.contains("empty")) {

        if (queue.isEmpty()) {
          sb.append(1).append("\n");
        } else {
          sb.append(0).append("\n");
        }

      } else if (input.contains("front")) {

        if (queue.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(queue.peek()).append("\n");
        }

      } else if (input.contains("back")) {

        if (queue.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(last).append("\n");
        }
      }
    }

    System.out.println(sb);
  }
}
