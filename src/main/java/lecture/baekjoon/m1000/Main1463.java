package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1463 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int dp[] = new int[input + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i < input + 1; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0 && dp[i - 1] + 1 > dp[i / 2] + 1) {
                dp[i] = dp[i / 2] + 1;
            }
            if (i % 3 == 0 && dp[i - 1] + 1 > dp[i / 3] + 1) {
                dp[i] = dp[i / 3] + 1;
            }
        }

        System.out.println(dp[input]);

    }

}
