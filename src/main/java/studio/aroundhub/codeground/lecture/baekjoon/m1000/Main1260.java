package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.*;

public class Main1260 {

  ArrayList<Integer>[] arrayList;
  boolean[] check;
  ArrayList<Integer> dfsList = new ArrayList<>();
  ArrayList<Integer> bfsList = new ArrayList<>();

  public Main1260() {
    Scanner sc = new Scanner(System.in);

    int vertex = sc.nextInt();
    int line = sc.nextInt();
    int startVertex = sc.nextInt();

    arrayList = new ArrayList[vertex + 1];

    for (int i = 0; i < arrayList.length; i++) {
      arrayList[i] = new ArrayList<>();
    }

    check = new boolean[vertex + 1];

    for (int i = 0; i < line; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();

      arrayList[x].add(y);
      arrayList[y].add(x);
    }

    for (int i = 1; i < vertex + 1; i++) {
      Collections.sort(arrayList[i]);
    }

    dfs(startVertex);
    for (Integer integer : dfsList) {
      System.out.print(integer + " ");
    }
    System.out.println();

    check = new boolean[vertex + 1];

    bfs(startVertex);
    for (Integer integer : bfsList) {
      System.out.print(integer + " ");
    }
  }

  public void dfs(int x) {
    if (check[x]) {
      return;
    }

    check[x] = true;
    dfsList.add(x);
    for (int y : arrayList[x]) {
      if (!check[y]) {
        dfs(y);
      }
    }
  }

  public void bfs(int x) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(x);
    check[x] = true;

    while (!queue.isEmpty()) {
      int y = queue.poll();
      System.out.print(y + " ");
      for (int c : arrayList[y]) {
        if (!check[c]) {
          check[c] = true;
          queue.add(c);
        }
      }
    }
  }

  public static void main(String[] args) {
    new Main1260();
  }
}
