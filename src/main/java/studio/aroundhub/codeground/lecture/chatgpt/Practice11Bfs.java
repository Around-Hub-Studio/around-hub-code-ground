package studio.aroundhub.codeground.lecture.chatgpt;

import java.util.*;

/*
문제 11 — 미로의 최단 거리 (BFS)

N행 M열의 미로가 있습니다. 1은 이동 가능한 칸이고 0은 벽입니다.
왼쪽 위 (1, 1)에서 오른쪽 아래 (N, M)까지 가는 최소 이동 횟수를 구하세요.
한 번에 상하좌우로 인접한 한 칸으로 이동할 수 있습니다.
미로 밖이나 벽으로는 이동할 수 없습니다.
시작 칸에 서 있는 상태의 이동 횟수는 0입니다.
목적지에 도달할 수 없으면 -1을 출력하세요.

입력
첫째 줄에 N과 M이 주어집니다.
다음 N개의 줄에 각 행을 나타내는 길이 M의 문자열이 주어집니다.
각 문자열은 공백 없이 0과 1로만 이루어집니다.

제한
1 ≤ N, M ≤ 100
시작 칸과 도착 칸은 항상 1입니다.

출력
최소 이동 횟수를 출력합니다. 도달할 수 없으면 -1을 출력합니다.

예제 1
입력
3 4
1110
0110
0011

출력
5

예제 2
입력
3 3
110
000
011

출력
-1

예제 3
입력
1 1
1

출력
0
 */
public class Practice11Bfs {

    static int[][] map;
    static int[][] count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        map = new int[n][m];
        count = new int[n][m];

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = input.charAt(j) - '0';
            }

            Arrays.fill(count[i], -1);
        }

        bfs();

        System.out.println(count[n - 1][m - 1]);
    }

    static void bfs() {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        count[0][0] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];

            for (int direction = 0; direction < 4; direction++) {
                int nextRow = row + dx[direction];
                int nextCol = col + dy[direction];

                if (nextRow < 0 || nextRow >= map.length || nextCol < 0 || nextCol >= map[0].length) {
                    continue;
                }

                if (map[nextRow][nextCol] == 0 || count[nextRow][nextCol] != -1) {
                    continue;
                }

                count[nextRow][nextCol] = count[row][col] + 1;
                queue.offer(new int[]{nextRow, nextCol});
            }
        }
    }
}

