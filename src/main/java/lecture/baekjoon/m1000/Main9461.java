package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main9461 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        long[] arr = new long[101];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 3];
        }

        for (int t = 0; t < T; t++) {

            int N = sc.nextInt();
            System.out.println(arr[N-1]);

        }


    }

}
