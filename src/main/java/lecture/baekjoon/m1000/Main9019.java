package lecture.baekjoon.m1000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main9019 {

    Queue<Integer> queue;
    int goal;
    boolean[] check;
    String[] ans;

    public static void main(String[] args){
        new Main9019();
    }

    public Main9019() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int test = 0; test < t; test++) {
            int a = sc.nextInt();
            goal = sc.nextInt();
            queue = new LinkedList<>();
            check = new boolean[10000];
            ans = new String[10000];

            for (int i = 0; i < ans.length; i++) {
                ans[i] = "";
            }

            check[a] = true;
            bfs(a);
            System.out.println(ans[goal]);
        }
    }

    public void bfs(int start) {
        queue.add(start);
        while (!queue.isEmpty() && !check[goal]) {
            int value = queue.poll();
            int D;
            int S;
            int L;
            int R;

            if (value * 2 > 9999) {
                D = (value * 2) % 10000;
            } else {
                D = value * 2;
            }

            if (value == 0) {
                S = 9999;
            } else {
                S = value - 1;
            }
            L = (value % 1000) * 10 + value / 1000;
            R = (value % 10) * 1000 + (value / 10);

            if (!check[D]) {
                queue.add(D);
                check[D] = true;
                ans[D] = ans[value] + "D";
            }

            if (!check[S]) {
                queue.add(S);
                check[S] = true;
                ans[S] = ans[value] + "S";
            }

            if (!check[L]) {
                queue.add(L);
                check[L] = true;
                ans[L] = ans[value] + "L";
            }

            if (!check[R]) {
                queue.add(R);
                check[R] = true;
                ans[R] = ans[value] + "R";
            }
        }
    }

}
