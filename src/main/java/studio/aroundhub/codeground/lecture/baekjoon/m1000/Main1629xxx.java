package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1629xxx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long result = cal(a, b);

        System.out.println(Math.pow(a,b)%12);
        System.out.println(result % c);
    }

    static long cal(long a, long b) {
        if (b == 1) {
            return a;
        }
        long tempA = 0;
        long tempB = 0;
        if (b % 2 == 0) {
            tempA = b / 2;
            tempB = b / 2;
        } else {
            tempA = (b / 2) + 1;
            tempB = b / 2;
        }
        long left = cal(a, tempA);
        long right = cal(a, tempB);
        return left * right;
    }

}
