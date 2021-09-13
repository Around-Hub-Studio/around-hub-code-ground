package lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main15649 {

    static boolean[] visited;
    static int[] array;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        visited = new boolean[N];
        array = new int[M];

        dfs(N, M, 0);

    }

    public static void dfs(int N, int M, int depth) {

        if (depth == M) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                array[depth] = i + 1;
                dfs(N, M, depth + 1);
                visited[i] = false;
            }
        }

    }


}
