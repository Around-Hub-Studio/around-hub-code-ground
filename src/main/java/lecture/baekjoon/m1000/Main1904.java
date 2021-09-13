package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1904 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arrangedNumber = 0;
        if (N < 3) {
            arrangedNumber = 3;
        }else{
            arrangedNumber = N;
        }
        int[] arr = new int[arrangedNumber + 1];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
        }

        System.out.println(arr[N]);

    }

}
