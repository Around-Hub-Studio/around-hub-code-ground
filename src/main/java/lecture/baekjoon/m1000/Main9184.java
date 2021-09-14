package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main9184 {

    static int[][][] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        arr = new int[21][21][21];

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));

        }
    }

    public static int w(int a, int b, int c) {

        if (a >= 0 && a <= 20 && b >= 0 && b <= 20 && c >= 0 && c <= 20) {
            if (arr[a][b][c] != 0) {
                return arr[a][b][c];
            }
        }

        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            return arr[20][20][20] = w(20, 20, 20);
        } else if (a < b && b < c) {
            return arr[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            return arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
    }

}
