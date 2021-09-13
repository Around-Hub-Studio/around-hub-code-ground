package lecture.baekjoon.m10000;

import java.util.Scanner;

public class Main14681 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(1);

        } else if (x > 0 && y < 0) {
            System.out.println(4);

        } else if (x < 0 && y > 0) {
            System.out.println(2);

        } else {
            System.out.println(3);

        }

    }
}
