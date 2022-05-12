package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1004 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {

            int start_X = sc.nextInt();
            int start_Y = sc.nextInt();
            int end_X = sc.nextInt();
            int end_Y = sc.nextInt();

            int N = sc.nextInt();

            int count = 0;

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();

                if (Math.pow(z, 2) > Math.pow(start_X - x, 2) + Math.pow(start_Y - y, 2)
                        && Math.pow(z, 2) > Math.pow(end_X - x, 2) + Math.pow(end_Y - y, 2)) {
                    continue;
                }

                if (Math.pow(z, 2) > Math.pow(start_X - x, 2) + Math.pow(start_Y - y, 2)) {
                    count++;
                }

                if (Math.pow(z, 2) > Math.pow(end_X - x, 2) + Math.pow(end_Y - y, 2)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

}
