package studio.aroundhub.codeground.lecture.graph.dfs;

import java.util.Scanner;

/**
 * DFS Code
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class DFS_Matrix {

  static int edge;
  static int vertex;
  static int[][] map;
  static boolean[] visited;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    vertex = sc.nextInt();
    edge = sc.nextInt();
    map = new int[vertex + 1][vertex + 1];
    visited = new boolean[vertex + 1];

    for (int i = 0; i < edge; i++) {
      int start = sc.nextInt();
      int next = sc.nextInt();

      map[start][next] = 1;
      map[next][start] = 1;
    }

    dfs(1);
  }

  public static void dfs(int start) {
    visited[start] = true;
    System.out.println(start + " ");

    for (int i = 1; i < vertex + 1; i++) {
      if (map[start][i] == 1 && visited[i] == false) {
        dfs(i);
      }
    }
  }
}
