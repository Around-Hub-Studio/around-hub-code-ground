package lecture.baekjoon;

import java.util.Scanner;

public class Main2839 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int count = 0;
        while (N % 5 != 0) {
            N -= 3;
            count++;
        }
        if (N < 0) {
            System.out.println(-1);
            return;
        }
        count += N / 5;

        System.out.println(count);
    }

}
