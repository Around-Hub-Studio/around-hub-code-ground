package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.*;

public class Main11725 {

  static int N;

  static ArrayList<Integer>[] arr;
  static boolean[] visited;
  static int[] ans;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();

    arr = new ArrayList[N + 1];
    visited = new boolean[N + 1];
    ans = new int[N + 1];

    for (int i = 0; i < N + 1; i++) {
      arr[i] = new ArrayList<>();
    }

    for (int i = 0; i < N - 1; i++) {
      int start = sc.nextInt();
      int end = sc.nextInt();

      arr[start].add(end);
      arr[end].add(start);
    }

    bfs();

    for (int i = 2; i < ans.length; i++) {
      System.out.println(ans[i]);
    }
  }

  static void bfs() {
    Queue<Integer> queue = new LinkedList<>();

    queue.add(1);
    visited[1] = true;

    while (!queue.isEmpty()) {
      int node = queue.poll();

      for (int i = 0; i < arr[node].size(); i++) {
        if (!visited[arr[node].get(i)]) {
          queue.add(arr[node].get(i));
          visited[arr[node].get(i)] = true;
          ans[arr[node].get(i)] = node;
        }
      }
    }
  }
}
