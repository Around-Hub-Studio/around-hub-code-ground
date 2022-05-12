package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2490 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int t = 0; t < 3; t++) {

            int one = sc.nextInt();
            int two = sc.nextInt();
            int three = sc.nextInt();
            int four = sc.nextInt();

            int[] arr = new int[2];

            arr[one]++;
            arr[two]++;
            arr[three]++;
            arr[four]++;

            if (arr[0] == 0) {
                System.out.println("E");
            } else if (arr[0] == 1) {
                System.out.println("A");
            } else if (arr[0] == 2) {
                System.out.println("B");
            } else if (arr[0] == 3) {
                System.out.println("C");
            } else if (arr[0] == 4) {
                System.out.println("D");
            }

        }

    }

}
