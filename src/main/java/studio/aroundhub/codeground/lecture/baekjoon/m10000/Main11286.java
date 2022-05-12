package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main11286 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return Integer.compare(o1, o2);
                } else {
                    return Integer.compare(Math.abs(o1), Math.abs(o2));
                }
            }
        });

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            int tmp = Integer.parseInt(br.readLine());
            if (tmp == 0) {
                if (!priorityQueue.isEmpty()) {
                    sb.append(priorityQueue.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                priorityQueue.offer(tmp);
            }

        }

        System.out.println(sb);

    }

}

