package lecture.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main11437 {

    ArrayList<Integer>[] arrayLists;
    int[] depth;
    int[] parent;

    public static void main(String[] args){
        new Main11437();
    }

    public Main11437() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arrayLists = new ArrayList[n + 1];

        for (int i = 0; i < arrayLists.length; i++) {
            arrayLists[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arrayLists[x].add(y);
            arrayLists[y].add(x);
        }

        depth = new int[n + 1];
        parent = new int[n + 1];

        dfs(1, 1);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = solve(a, depth[a], b, depth[b]);
            System.out.println(ans);
        }
    }

    public void dfs(int start, int count) {
        depth[start] = count++;

        for (Integer value : arrayLists[start]) {
            if (depth[value] == 0) {
                parent[value] = start;
                dfs(value, count);
            }
        }
    }

    public int solve(int a, int a_depth, int b, int b_depth) {
        if (a_depth > b_depth) {
            while (a_depth != b_depth) {
                a_depth--;
                a = parent[a];
            }
        }
        if (a_depth < b_depth) {
            while (a_depth != b_depth) {
                b_depth--;
                b = parent[b];
            }
        }

        while (a != b) {
            a = parent[a];
            b = parent[b];
        }

        return a;
    }

}
