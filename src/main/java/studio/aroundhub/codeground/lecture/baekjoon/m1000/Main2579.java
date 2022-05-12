package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2579 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] stair = new int[N + 1];
        int[] dp = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            stair[i] = sc.nextInt();
        }

        dp[1] = stair[1];

        if (N > 1) {
            dp[2] = dp[1] + stair[2];
        }

        for (int i = 3; i < N + 1; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stair[i - 1]) + stair[i];
        }

        System.out.println(dp[N]);

    }

}
