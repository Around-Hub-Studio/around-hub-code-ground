package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main5430 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    StringTokenizer st;
    int T = sc.nextInt();

    for (int t = 0; t < T; t++) {

      StringBuilder sb = new StringBuilder();
      char[] input = (sc.next()).toCharArray();

      int n = sc.nextInt();

      Deque<Integer> linkedList = new LinkedList<>();
      st = new StringTokenizer(sc.next(), "[],");

      for (int i = 0; i < n; i++) {
        linkedList.offer(Integer.parseInt(st.nextToken()));
      }

      boolean check = false;
      boolean isRight = false;
      for (int i = 0; i < input.length; i++) {
        char temp = input[i];

        if (temp == 'R') {

          isRight = !isRight;

        } else {

          if (linkedList.isEmpty()) {
            System.out.println("error");
            check = true;
            break;
          } else {
            if (isRight) {
              linkedList.pollLast();
            } else {
              linkedList.pollFirst();
            }
          }
        }
      }

      if (check) {
        continue;
      }

      sb.append("[");
      if (isRight) {
        while (linkedList.size() > 1) {
          sb.append(linkedList.pollLast()).append(",");
        }
        if (!linkedList.isEmpty()) {
          sb.append(linkedList.pollLast());
        }
      } else {
        while (linkedList.size() > 1) {
          sb.append(linkedList.pollFirst()).append(",");
        }
        if (!linkedList.isEmpty()) {
          sb.append(linkedList.pollFirst());
        }
      }
      sb.append("]");

      System.out.println(sb);
    }
  }
}
