package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2475 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();
        int five = sc.nextInt();

        int sum = (int) (Math.pow(one, 2) + Math.pow(two, 2) + Math.pow(three, 2) + Math.pow(four, 2) + Math.pow(five, 2));

        int ans = sum % 10;

        System.out.println(ans);
    }

}
