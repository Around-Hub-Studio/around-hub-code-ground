package lecture.baekjoon;

import java.util.Scanner;

public class Main1912 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] cache = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                cache[i] = arr[i];
                continue;
            } else {

                int temp = arr[i] + cache[i - 1];
                cache[i] = Math.max(temp, arr[i]);

                if (max < cache[i]) {
                    max = cache[i];
                }

            }

        }

        System.out.println(max);

    }

}
