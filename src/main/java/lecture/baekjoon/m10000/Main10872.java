package lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main10872 {

    static int result = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        fac(N);
        System.out.println(result);
    }

    public static void fac(int N) {
        if (N <= 0) {
            return;
        }
        result *= N;
        fac(N - 1);

    }

}
