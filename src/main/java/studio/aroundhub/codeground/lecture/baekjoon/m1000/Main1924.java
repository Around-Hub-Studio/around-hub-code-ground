package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1924 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] array1 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int c = 0;

        for (int i = 0; i < a-1; i++) {
            c += array1[i];
        }

        c += (b - 1);

        String[] array = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

        c = c % 7;

        System.out.println(array[c]);

    }

}
