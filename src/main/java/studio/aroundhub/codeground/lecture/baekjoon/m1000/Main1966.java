package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1966 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            Queue<int[]> queue = new LinkedList<>();
            int[] priorityCount = new int[10];
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                queue.offer(new int[]{i, temp});
                priorityCount[temp]++;
            }

            int printCount = 0;
            while (!queue.isEmpty()) {
                int[] temp = queue.peek();

                // 우선순위 높은 문서가 있는지 체크
                boolean check = false;
                for (int i = 9; i > temp[1] && i >= 1; i--) {
                    if (priorityCount[i] != 0) {
                        check = true;
                        break;
                    }
                }
                //System.out.println("현재 값 : " + temp + ", 우선순위 체크 : " + check);
                // 우선순위 높은 문서가 있다면 뒤로 옮기기
                if (check) {
                    queue.offer(queue.poll());
                } else {
                    // 지금 문서가 제일 높은 우선순위일 경우 (동일한 경우 포함)
                    // 인쇄 처리
                    int[] a = queue.poll();
                    priorityCount[a[1]]--;
                    printCount++;
                    if (a[0] == M) {
                        break;
                    }
                }
            }

            System.out.println(printCount);

        }

    }

}
