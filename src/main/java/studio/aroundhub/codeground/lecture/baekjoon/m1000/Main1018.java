package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1018 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[][] array = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String input = sc.next();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'W') {
                    array[i][j] = true;
                } else {
                    array[i][j] = false;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int x = 0; x < N - 7; x++) {
            for (int y = 0; y < M - 7; y++) {
                int count = 0;

                int endX = x + 8;
                int endY = y + 8;

                boolean first = array[x][y];

                for (int i = x; i < endX; i++) {
                    for (int j = y; j < endY; j++) {

                        if(array[i][j] != first){
                            count++;
                        }

                        first = !first;

                    }
                    first = !first;
                }

                count = Math.min(count, 64-count);

                min = Math.min(count, min);
            }
        }

        System.out.println(min);

    }

}
