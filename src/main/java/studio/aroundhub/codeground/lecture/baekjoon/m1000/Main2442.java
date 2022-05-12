package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2442 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int starCount = 1;
        int blankCount = N - 1;

        while (blankCount >= 0) {
            for (int i = 0; i < blankCount; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < starCount; i++) {
                System.out.print("*");
            }

            starCount += 2;
            blankCount--;

            System.out.println();
        }

    }

}
