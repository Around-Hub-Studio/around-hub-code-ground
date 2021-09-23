package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1492 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < N + 1; i++) {
            sum += Math.pow(i, K) % 1000000007;
        }

        System.out.println(sum);

    }

}
