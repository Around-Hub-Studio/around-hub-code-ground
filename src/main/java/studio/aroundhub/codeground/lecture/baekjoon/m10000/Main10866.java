package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main10866 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    Deque<Integer> deque = new ArrayDeque<>();

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      String input = st.nextToken();

      if (input.equals("push_front")) {
        int a = Integer.parseInt(st.nextToken());
        deque.addFirst(a);

      } else if (input.equals("push_back")) {
        int a = Integer.parseInt(st.nextToken());
        deque.addLast(a);

      } else if (input.equals("pop_front")) {
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          int a = deque.pollFirst();
          sb.append(a).append("\n");
        }

      } else if (input.equals("pop_back")) {
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          int a = deque.pollLast();
          sb.append(a).append("\n");
        }

      } else if (input.equals("size")) {
        sb.append(deque.size()).append("\n");

      } else if (input.equals("empty")) {
        if (deque.isEmpty()) {
          sb.append(1).append("\n");
        } else {
          sb.append(0).append("\n");
        }

      } else if (input.equals("front")) {
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          int a = deque.peekFirst();
          sb.append(a).append("\n");
        }

      } else if (input.equals("back")) {
        if (deque.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          int a = deque.peekLast();
          sb.append(a).append("\n");
        }
      }
    }

    System.out.println(sb);
  }
}
