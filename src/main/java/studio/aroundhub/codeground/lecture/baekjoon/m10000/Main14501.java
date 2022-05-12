package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main14501 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] dp = new int[N];
        int[][] schedule = new int[N][2];

        for (int i = 0; i < N; i++) {

            schedule[i][0] = sc.nextInt();
            schedule[i][1] = sc.nextInt();

        }

        for (int i = 0; i < N; i++) {
            if (i + schedule[i][0] < N) {
                dp[schedule[i][0] + i] += schedule[i][1];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }

}
