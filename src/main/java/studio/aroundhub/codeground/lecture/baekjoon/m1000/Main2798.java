package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2798 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] cards = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                // 카드 중복 경우 제외 처리 로직
                if (j == i) {
                    continue;
                }

                for (int k = 0; k < N; k++) {
                    // 카드 중복 경우 제외 처리 로직
                    if (k == i || k == j) {
                        continue;
                    }

                    int candidate = cards[i] + cards[j] + cards[k];
                    //System.out.println(candidate);

                    if (candidate <= M && candidate > result) {
                        result = candidate;
                    }

                }
            }
        }

        System.out.println(result);

    }
}
