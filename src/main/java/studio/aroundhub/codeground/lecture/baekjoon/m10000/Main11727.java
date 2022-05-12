package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main11727 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        arr[1] = 1;
        arr[2] = 3;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2] * 2) % 10007;
        }

        System.out.println(arr[n]);

    }

}
