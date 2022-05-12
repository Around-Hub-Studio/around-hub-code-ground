package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

/*
한수는 지금 (x, y)에 있다.
직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 */
public class Main1085 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int xMin = Math.min(w - x, x - 0);
        int yMin = Math.min(h - y, y - 0);

        System.out.println(Math.min(xMin, yMin));

    }

}
