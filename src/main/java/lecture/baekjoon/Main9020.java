package lecture.baekjoon;

import java.util.Scanner;

public class Main9020 {

    static boolean[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        arr = new boolean[100001];
        cal(100000);
        int t = sc.nextInt();

        for (int T = 0; T < t; T++) {

            int input = sc.nextInt();

            int half = input / 2;
            int left = half, right = half;

            while (true) {
                if (!arr[left] && !arr[right]) {
                    System.out.println(left + " " + right);
                    break;
                }
                left--;
                right++;
            }

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
