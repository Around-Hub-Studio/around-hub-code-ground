package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main1655 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            if (left.size() <= right.size()) {
                left.offer(input);
            } else {
                right.offer(input);
            }

            if (!left.isEmpty() && !right.isEmpty()) {
                while (left.peek() > right.peek()) {
                    right.offer(left.poll());
                    left.offer(right.poll());
                }
            }

            bw.write(Integer.toString(left.peek()));
            bw.newLine();

        }

        bw.flush();

    }
}
