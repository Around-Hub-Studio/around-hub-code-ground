package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1932 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = arr[n - 1][i];
        }

        int depth = n - 2;
        while (depth >= 0) {
            for (int i = 0; i < depth + 1; i++) {
                dp[depth][i] = arr[depth][i] + Math.max(dp[depth + 1][i], dp[depth + 1][i + 1]);
            }
            depth--;
        }

        System.out.println(dp[0][0]);
    }

}
