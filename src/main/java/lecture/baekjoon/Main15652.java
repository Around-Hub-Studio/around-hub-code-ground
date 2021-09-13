package lecture.baekjoon;

import java.util.Scanner;

public class Main15652 {

    static int[] array;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        array = new int[M];

        dfs(N, M, 1, 0);
        System.out.println(sb);

    }

    public static void dfs(int N, int M, int prev, int depth) {

        if (depth == M) {
            for (int i = 0; i < array.length; i++) {
                sb.append(array[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = prev; i <= N; i++) {
            array[depth] = i;
            dfs(N, M, i, depth + 1);
        }

    }


}
