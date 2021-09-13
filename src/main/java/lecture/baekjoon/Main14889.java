package lecture.baekjoon;

import java.util.Scanner;

public class Main14889 {

    static int[][] array;
    static int diff = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        array = new int[N][N];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

    }
}
