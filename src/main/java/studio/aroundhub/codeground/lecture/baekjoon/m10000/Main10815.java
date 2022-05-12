package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10815 {

    private static int N;
    private static int M;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int m = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = N - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                int n = arr[mid];
                if (n == m) {
                    sb.append(1).append(" ");
                    break;
                }
                if (n > m) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                if (left > right) {
                    sb.append(0).append(" ");
                    break;
                }
            }
        }

        System.out.println(sb);
    }

}
