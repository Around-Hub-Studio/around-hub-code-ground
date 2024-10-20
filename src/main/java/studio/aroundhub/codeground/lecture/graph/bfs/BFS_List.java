package studio.aroundhub.codeground.lecture.graph.bfs;

import java.util.*;

/**
 * List로 구현한 BFS thinkground.studio YouTube : Around Hub Studio
 *
 * @author Flature
 */
public class BFS_List {

  static ArrayList<Integer>[] arrayList;
  static boolean[] visited;
  static ArrayList<Integer> bfsList = new ArrayList<>();

  public static void bfs(int x) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(x);
    visited[x] = true;

    while (!queue.isEmpty()) {
      int y = queue.poll();
      System.out.print(y + " ");
      for (int c : arrayList[y]) {
        if (!visited[c]) {
          visited[c] = true;
          queue.add(c);
        }
      }
    }
  }

  public static void main(String[] args) {
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

    bfs(startVertex);
  }
}
