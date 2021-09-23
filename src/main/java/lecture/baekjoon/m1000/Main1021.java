package lecture.baekjoon.m1000;

import java.util.*;

public class Main1021 {

    static LinkedList<Integer> deque;
    static ArrayList<Integer> arrayList;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        arrayList = new ArrayList<>();
        for (int m = 0; m < M; m++) {
            arrayList.add(sc.nextInt());
        }

        int count = 0;
        for (int m = 0; m < M; m++) {
            int tempIndex = deque.indexOf(arrayList.get(m));
            int halfIndex;

            if (deque.size() % 2 == 0) {
                halfIndex = deque.size() / 2 - 1;
            } else {
                halfIndex = deque.size() / 2;
            }

            if (tempIndex <= halfIndex) {
                for (int i = 0; i < tempIndex; i++) {
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            } else {
                for (int i = 0; i < deque.size() - tempIndex; i++) {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst();
        }

        System.out.println(count);

    }
}
