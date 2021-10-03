package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1100 {

    public static void main(String[] args) {

        char[][] arr = new char[8][8];

        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 8; i++) {
            String input = sc.next();
            for (int j = 0; j < 8; j++) {
                arr[i][j] = input.charAt(j);
                // 하얀 칸일 경우
                if (i % 2 == 0 && j % 2 == 0) {
                    if (arr[i][j] == 'F')
                        count++;
                } else if (i % 2 == 1 && j % 2 == 1) {
                    if (arr[i][j] == 'F')
                        count++;
                }
            }
        }

        System.out.println(count);

    }

}
