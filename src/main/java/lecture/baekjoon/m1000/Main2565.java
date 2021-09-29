package lecture.baekjoon.m1000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
1 8
2 2
3 9
4 1
6 4
7 6
9 7
10 10
 */
public class Main2565 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] wire = new int[N][2];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            wire[i][0] = sc.nextInt();
            wire[i][1] = sc.nextInt();
        }

        Arrays.sort(wire, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(wire[i][0] + " " + wire[i][1]);
        }

        for (int i = 0; i < N; i++) {

            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (wire[j][1] < wire[i][1]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                    System.out.println("wire[j][1] : " + wire[j][1] + ", wire[i][1] : " + wire[i][1] + ", dp[i] : " + dp[i]);
                }
            }
        }

        int max = 1;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(N - max);


    }

}
