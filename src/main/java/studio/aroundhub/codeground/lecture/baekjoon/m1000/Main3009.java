package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

/*
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 */

public class Main3009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력 값들을 받기 위한 x,y값의 배열
        int[] arrayX = new int[3];
        int[] arrayY = new int[3];

        for (int i = 0; i < 3; i++) {
            arrayX[i] = sc.nextInt();
            arrayY[i] = sc.nextInt();
        }

        int x = 0;
        int y = 0;

        // 겹치지 않는 x값을 찾아 변수 x에 할당
        if (arrayX[0] == arrayX[1]) {
            x = arrayX[2];
        } else if (arrayX[0] == arrayX[2]) {
            x = arrayX[1];
        } else {
            x = arrayX[0];
        }

        // 겹치지 않는 y값을 찾아 변수 y에 할당
        if (arrayY[0] == arrayY[1]) {
            y = arrayY[2];
        } else if (arrayY[0] == arrayY[2]) {
            y = arrayY[1];
        } else {
            y = arrayY[0];
        }

        System.out.println(x + " " + y);

    }

}
