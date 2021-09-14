package lecture.baekjoon.m1000;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2606 {

    static ArrayList<Integer>[] arrayLists;
    static boolean[] check;
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int lines = sc.nextInt();

        arrayLists = new ArrayList[N + 1];
        check = new boolean[N + 1];

        for (int i = 0; i < N + 1; i++) {
            arrayLists[i] = new ArrayList<>();
        }

        for (int i = 0; i < lines; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arrayLists[a].add(b);
            arrayLists[b].add(a);
        }

        dfs(1);
        System.out.println(count - 1);
    }

    public static void dfs(int start) {
        if (check[start]) {
            return;
        }

        check[start] = true;
        count++;
        for (int input : arrayLists[start]) {
            if (check[input]) {
                continue;
            }
            dfs(input);
        }

    }

}
