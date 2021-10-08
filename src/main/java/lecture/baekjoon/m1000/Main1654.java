package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1654 {

    static int K, N;
    static long[] lanCables;
    static long left, right, MAX;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        N = sc.nextInt();

        lanCables = new long[K];

        for (int i = 0; i < lanCables.length; i++) {
            lanCables[i] = sc.nextInt();
            MAX = Math.max(MAX, lanCables[i]);
        }

        MAX++;

        binarySearch(N);

        System.out.println(left - 1);

    }

    static void binarySearch(int goal) {

        left = 0;
        right = MAX;

        while (left < right) {

            long mid = (left + right) / 2;
            long num = 0;

            for (int i = 0; i < lanCables.length; i++) {
                long splited = lanCables[i] / mid;
                num += splited;
            }

            if (num >= goal) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }

    }
}
