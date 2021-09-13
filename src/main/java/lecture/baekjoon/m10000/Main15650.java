package lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main15650 {

    static int[] array;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        array = new int[M];

        dfs(N, M, 1, 0);

    }

    public static void dfs(int N, int M, int prev, int depth) {

        if (depth == M) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = prev; i <= N; i++) {
            array[depth] = i;
            dfs(N, M, i + 1, depth + 1);
        }

    }


}
