package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main10953 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {

            String input = sc.next();
            String[] split = input.split(",");

            System.out.println(Integer.parseInt(split[0]) + Integer.parseInt(split[1]));

        }

    }

}
