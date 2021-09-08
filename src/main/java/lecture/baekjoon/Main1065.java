package lecture.baekjoon;

import java.util.Scanner;

public class Main1065 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        if (N >= 100) {

            if (N == 1000) {
                N = 999;
            }

            count += 99;

            for (int T = 100; T <= N; T++) {

                String[] array = Integer.toString(T).split("");
                int diff1 = Integer.parseInt(array[1]) - Integer.parseInt(array[0]);
                int diff2 = Integer.parseInt(array[2]) - Integer.parseInt(array[1]);

                if (diff1 == diff2) {
                    count++;
                }

            }

        } else {
            count = N;
        }

        System.out.println(count);

    }

}
