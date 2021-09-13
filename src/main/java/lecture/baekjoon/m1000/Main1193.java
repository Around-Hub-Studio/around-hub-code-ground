package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1193 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();

        /*
        1 - (0,0)

        2 - (0,1)
        3 - (1,0)

        4 - (0,2)
        5 - (1,1)
        6 - (2,0)
         */

        long count = 1;
        while (true) {
            N -= count;
            if (N <= 0) {
                N += count;
                break;
            }
            count++;
        }

        if (count % 2 == 0) {
            System.out.println(N + "/" + (count - N + 1));
        } else {
            System.out.println((count - N + 1) + "/" + N);
        }
    }
}
