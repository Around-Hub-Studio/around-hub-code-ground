package lecture.baekjoon;

import java.util.Scanner;

public class Main4948 {

    static boolean[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {

            int M = sc.nextInt();
            if (M == 0) {
                break;
            }
            int N = 2 * M;

            arr = new boolean[N + 1];
            cal(N);

            int count = 0;
            for (int i = M+1; i < arr.length; i++) {
                if (!arr[i]) {
                    //System.out.println(i);
                    count++;
                }
            }

            System.out.println(count);

        }


    }

    public static void cal(int max) {
        arr[0] = true;
        arr[1] = true;

        if (max < 2) {
            return;
        }
        for (int i = 2; i < Math.sqrt(arr.length); i++) {

            if (arr[i]) {
                continue;
            }

            for (int j = i * i; j < max + 1; j = j + i) {
                arr[j] = true;
            }

        }
    }

}
