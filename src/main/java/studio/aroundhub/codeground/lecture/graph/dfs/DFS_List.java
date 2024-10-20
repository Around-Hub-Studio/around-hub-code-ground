package studio.aroundhub.codeground.lecture.graph.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * List로 구현한 DFS
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class DFS_List {

  ArrayList<Integer>[] arrayList;
  boolean[] visited;
  ArrayList<Integer> dfsList = new ArrayList<>();

  public DFS_List() {
    Scanner sc = new Scanner(System.in);

    int vertex = sc.nextInt();
    int line = sc.nextInt();
    int startVertex = sc.nextInt();

    arrayList = new ArrayList[vertex + 1];

    for (int i = 0; i < arrayList.length; i++) {
      arrayList[i] = new ArrayList<>();
    }

    visited = new boolean[vertex + 1];

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
      System.out.println(integer + " ");
    }
    System.out.println();
  }

  public void dfs(int x) {
    if (visited[x]) {
      return;
    }

    visited[x] = true;
    dfsList.add(x);
    for (int y : arrayList[x]) {
      if (!visited[y]) {
        dfs(y);
      }
    }
  }

  public static void main(String[] args) {
    new DFS_List();
  }
}
