package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main9663 {

    static int[] array;
    static int N;
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        array = new int[N];

        queen(0);
        System.out.println(count);

    }

    public static void queen(int depth) {

        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            array[depth] = i;

            if (check(depth)) {
                queen(depth + 1);
            }
        }
    }

    public static boolean check(int depth) {

        for (int i = 0; i < depth; i++) {
            if (array[depth] == array[i]) {
                return false;
            }

            if (Math.abs(depth - i) == Math.abs(array[depth] - array[i])) {
                return false;
            }
        }

        return true;
    }

}
