package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main10844 {

    static Long[][] arr;
    static int N;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        arr = new Long[N + 1][10];

        for (int i = 0; i < 10; i++) {
            arr[1][i] = 1L;
        }

        long result = 0;

        for (int i = 1; i <= 9; i++) {
            result += recur(N, i);
        }
        System.out.println(result % 1000000000);

    }

    static long recur(int digit, int val) {

        if (digit == 1) {
            return arr[digit][val];
        }

        if (arr[digit][val] == null) {
            if (val == 0) {
                arr[digit][val] = recur(digit - 1, 1);
            } else if (val == 9) {
                arr[digit][val] = recur(digit - 1, 8);
            } else {
                arr[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
            }
        }
        return arr[digit][val] % 1000000000;
    }
}