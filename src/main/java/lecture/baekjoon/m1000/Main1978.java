package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1978 {

    static boolean[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] array = new int[N];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }

        arr = new boolean[max + 1];

        cal(max);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i] + "값을 계산중입니다.");
            if (!arr[array[i]]) {
                //System.out.println(array[i] + "는 소수입니다. 카운트를 올립니다. >> count : " + (count+1));
                count++;
            }
        }
        System.out.println(count);
    }

    public static void cal(int max) {
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i < arr.length; i++) {

            if (arr[i]) {
                continue;
            }

            for (int j = i * i; j < max + 1; j = j + i) {
                //System.out.println(j+ "는 소수가 아닙니다. 마킹 체크 진행");
                arr[j] = true;
            }

        }
    }

}
