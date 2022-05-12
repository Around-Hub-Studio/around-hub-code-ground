package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1475 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int[] arr = new int[10];
        for (int i = 0; i < input.length(); i++) {
            int temp = Integer.parseInt(String.valueOf(input.charAt(i)));
            arr[temp]++;
        }

        int sum = arr[6] + arr[9];
        if (sum % 2 == 0) {
            arr[6] = sum / 2;
            arr[9] = sum / 2;
        } else {
            arr[6] = sum / 2 + 1;
            arr[9] = sum / 2 + 1;
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);

    }

}
