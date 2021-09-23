package lecture.baekjoon.m1000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1026 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Integer[] a = new Integer[N];
        Integer[] b = new Integer[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += a[i] * b[i];
        }

        System.out.println(sum);

    }

}
