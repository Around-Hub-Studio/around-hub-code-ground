package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main11054 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        int[] dp1 = new int[N];
        int[] dp2 = new int[N];

        dp1[0] = 1;
        for (int i = 1; i < N; i++) {
            dp1[i] = 1;

            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && dp1[j] + 1 > dp1[i]) {
                    dp1[i] = dp1[j] + 1;
                }
            }
        }

        dp2[N - 1] = 1;
        for (int i = N - 1; i >= 0; i--) {
            dp2[i] = 1;

            for (int j = N - 1; j > i; j--) {
                if (array[i] > array[j] && dp2[j] + 1 > dp2[i]) {
                    dp2[i] = dp2[j] + 1;
                }
            }
        }

        int max = 1;


        for (int i = 0; i < N; i++) {
            dp[i] = dp1[i] + dp2[i];
            if (max < dp[i]) {
                max = dp[i];
            }
        }

        System.out.println(max - 1);
    }

}
