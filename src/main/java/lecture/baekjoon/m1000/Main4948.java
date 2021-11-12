package lecture.baekjoon.m1000;

import java.util.Scanner;

/*
베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
 */

public class Main4948 {

    // 에라토스테네스의 체 알고리즘을 통해 소수 판별을 하기 위한 배열
    static boolean[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int M = sc.nextInt();

            // M에 0 값이 들어오는 경우 테스트 케이스를 종료
            if (M == 0) {
                break;
            }

            // 계산하고자 하는 범위가 n~2n 이기 때문에 최대값 설정
            int N = 2 * M;

            arr = new boolean[N + 1];
            cal(N);

            // 소수를 계산하기 위한 필드 값
            int count = 0;

            // n보다 큰 수부터 시작하기 때문에 M + 1
            // 2N보다 작은 수까지 진행하기 때문에 <
            for (int i = M + 1; i < arr.length; i++) {
                if (!arr[i]) {
                    //System.out.println(i);
                    count++;
                }
            }

            // 결과값 출력
            System.out.println(count);

        }

    }

    // 에라토스테네스의 체
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
