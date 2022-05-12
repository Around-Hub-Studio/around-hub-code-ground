package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main14888 {

    static int N;
    static int[] array;
    static int[] oper = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            oper[i] = sc.nextInt();
        }

        cal(array[0], 1);

        System.out.println(max);
        System.out.println(min);

    }

    public static void cal(int sum, int depth) {

        if (depth == N) {
            if (max < sum) {
                max = sum;
            }
            if (min > sum) {
                min = sum;
            }
            return;
        }

        for (int i = 0; i < oper.length; i++) {

            if (oper[i] > 0) {

                oper[i]--;

                if (i == 0) {
                    cal(sum + array[depth], depth + 1);
                } else if (i == 1) {
                    cal(sum - array[depth], depth + 1);
                } else if (i == 2) {
                    cal(sum * array[depth], depth + 1);
                } else if (i == 3) {
                    cal(sum / array[depth], depth + 1);
                }

                oper[i]++;
            }
        }

    }


}
