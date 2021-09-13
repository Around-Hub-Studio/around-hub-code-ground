package lecture.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1920 {

    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {

            int goal = Integer.parseInt(st.nextToken());

            int start = 0;
            int end = N - 1;

            while (start <= end) {

                int mid = (start + end) / 2;

                if (goal < arr[mid]) {
                    end = mid - 1;
                }

                if (goal > arr[mid]) {
                    start = mid + 1;
                }

                if (goal == arr[mid]) {
                    sb.append(1).append("\n");
                    break;
                }
            }
            if (start > end) {
                sb.append(0).append("\n");
            }

        }

        System.out.println(sb);
    }
}
