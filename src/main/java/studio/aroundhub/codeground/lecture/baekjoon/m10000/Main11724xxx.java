package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main11724xxx {

  static ArrayList<Integer>[] arrayList;
  static boolean[] visited;
  static int count = 0;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    arrayList = new ArrayList[N + 1];

    for (int i = 0; i < arrayList.length; i++) {
      arrayList[i] = new ArrayList<>();
    }

    for (int i = 0; i < M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      arrayList[a].add(b);
      arrayList[b].add(a);
    }

    visited = new boolean[N + 1];

    for (int i = 1; i < visited.length; i++) {
      if (!visited[i]) {
        count++;
        bfs(i);
      }
    }

    System.out.println(count);
  }

  static void bfs(int vertex) {

    Queue<Integer> queue = new LinkedList<>();
    queue.add(vertex);
    visited[vertex] = true;

    while (!queue.isEmpty()) {
      int temp = queue.poll();

      for (int i = 0; i < arrayList[temp].size(); i++) {
        int a = arrayList[temp].get(i);
        if (!visited[a]) {
          queue.add(a);
          visited[a] = true;
        }
      }
    }
  }
}
