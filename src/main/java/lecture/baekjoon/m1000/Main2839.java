package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2839 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int count = 0; // 3kg 자루의 개수를 새기 위한 카운트
        while (N % 5 != 0) {
            N -= 3;
            count++;
        }
        //3, 6, 9, 12, 15
        if (N < 0) {
            System.out.println(-1);
            return;
        }
        count += N / 5;

        System.out.println(count);
    }

}
