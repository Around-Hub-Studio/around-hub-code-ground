package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2581 {

    static boolean[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        arr = new boolean[N + 1];

        cal(N);

        int sum = 0;
        int min = 0;
        for (int i = M; i < arr.length; i++) {
            if (!arr[i]) {
                if (min == 0) {
                    min = i;
                }
                sum += i;
            }
        }

        if(sum==0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    public static void cal(int max) {
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i < arr.length; i++) {

            if (arr[i]) {
                continue;
            }

            for (int j = i * i; j < max + 1; j = j + i) {
                arr[j] = true;
            }

        }
    }

}
