package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2609 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = euclidGCD(a, b);

        System.out.println(d);
        System.out.println(a * b / d);

    }

    private static int euclidGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclidGCD(b, a % b);
    }

}
