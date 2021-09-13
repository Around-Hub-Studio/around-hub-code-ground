package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1978 {

    static boolean[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] array = new int[N];

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }

        arr = new boolean[max + 1];

        cal(max);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!arr[array[i]]) {
                count++;
            }
        }
        System.out.println(count);
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
