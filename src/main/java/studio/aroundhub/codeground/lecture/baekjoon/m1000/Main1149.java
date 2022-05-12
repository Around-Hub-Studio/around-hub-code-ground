package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1149 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[3][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j][i] = sc.nextInt();
            }
        }

        int[][] dp = new int[3][N];

        dp[0][0] = arr[0][0];
        dp[1][0] = arr[1][0];
        dp[2][0] = arr[2][0];

        for (int i = 1; i < N; i++) {
            dp[0][i] = arr[0][i] + Math.min(dp[1][i - 1], dp[2][i - 1]);
            dp[1][i] = arr[1][i] + Math.min(dp[0][i - 1], dp[2][i - 1]);
            dp[2][i] = arr[2][i] + Math.min(dp[1][i - 1], dp[0][i - 1]);
        }

        System.out.println(Math.min(dp[2][N - 1], Math.min(dp[0][N - 1], dp[1][N - 1])));

    }

}
