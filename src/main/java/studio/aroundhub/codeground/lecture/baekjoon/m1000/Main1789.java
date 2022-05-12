package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1789 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        int c = 0;
        for (c = 1; true; c++) {

            a -= c;
            if (a < 0) {
                c--;
                break;
            }

        }
        System.out.println(c);

    }

}
