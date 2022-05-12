package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main14889 {

    static int N;
    static int[][] map;
    static boolean[] visit;

    static int diff = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        map = new int[N][N];
        visit = new boolean[N];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = in.nextInt();
            }
        }

        combi(0, 0);
        System.out.println(diff);

    }

    static void combi(int idx, int count) {
        if (count == N / 2) {
            cal();
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                combi(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }

    static void cal() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visit[i] && visit[j]) {
                    team_start += map[i][j];
                    team_start += map[j][i];
                } else if (!visit[i] && !visit[j]) {
                    team_link += map[i][j];
                    team_link += map[j][i];
                }
            }
        }

        int val = Math.abs(team_start - team_link);

        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        diff = Math.min(val, diff);
    }
}
