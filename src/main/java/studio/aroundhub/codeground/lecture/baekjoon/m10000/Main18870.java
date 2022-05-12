package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main18870 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];
        int[] sortedArray = new int[N];

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            array[i] = num;
            sortedArray[i] = num;
        }

        Arrays.sort(sortedArray);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (map.get(sortedArray[i]) == null) { //아직 압축 안된 숫자인 경우
                map.put(sortedArray[i], cnt++);
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(map.get(array[i])).append(" ");
        }

        System.out.println(sb);
    }

}
