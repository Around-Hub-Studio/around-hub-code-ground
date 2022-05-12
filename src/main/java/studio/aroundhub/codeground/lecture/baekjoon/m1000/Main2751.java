package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2751 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arrayList.add(sc.nextInt());
        }

        Collections.sort(arrayList);

        for (int i = 0; i < N; i++) {
            sb.append(arrayList.get(i)).append("\n");
        }

        System.out.println(sb);

    }

}
