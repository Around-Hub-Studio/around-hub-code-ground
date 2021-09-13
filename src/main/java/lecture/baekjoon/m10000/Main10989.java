package lecture.baekjoon.m10000;

import java.io.*;
import java.util.Arrays;

public class Main10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append("\n");
        }

        System.out.println(sb);
    }

}
