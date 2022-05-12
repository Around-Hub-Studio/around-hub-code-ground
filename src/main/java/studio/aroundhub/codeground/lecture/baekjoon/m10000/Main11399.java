package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Arrays;
import java.util.Scanner;

public class Main11399 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i] * (N - i + 1);
        }

        System.out.println(sum);

    }

}
