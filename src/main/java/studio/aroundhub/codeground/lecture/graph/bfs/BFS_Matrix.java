package studio.aroundhub.codeground.lecture.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * BFS Code
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class BFS_Matrix {

  static int vertex;
  static int edge;
  static int[][] map;
  static boolean[] visited;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    vertex = sc.nextInt();
    edge = sc.nextInt();
    map = new int[vertex + 1][vertex + 1];
    visited = new boolean[vertex + 1];

    for (int i = 1; i <= edge; i++) {
      int start = sc.nextInt();
      int end = sc.nextInt();

      map[start][end] = 1;
      map[end][start] = 1;
    }
    BFS(1, vertex);
  }

  static void BFS(int start, int end) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(new Node(start, end));
    visited[1] = true;

    while (!queue.isEmpty()) {

      Node node = queue.poll();
      visited[node.x] = true;
      System.out.println(node.x);
      for (int i = 1; i < map.length; i++) {
        if (map[node.x][i] == 1 && !visited[i]) {
          queue.add(new Node(i, end));
          visited[i] = true;
        }
      }
    }
  }
}

class Node {
  int x;
  int y;

  Node(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
