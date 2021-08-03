package lecture.baekjoon;

import java.util.Scanner;

public class Main1002 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();

        for (int i = 0; i < test_case; i++) {

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            if (x1 == x2 && y1 == y2) {
                if (r1 == r2) {
                    System.out.println(-1);
                } else {
                    System.out.println(0);
                }
            } else {
                double dis1 = Math.abs(x1 - x2);
                dis1 = Math.pow(dis1, 2);

                double dis2 = Math.abs(y1 - y2);
                dis2 = Math.pow(dis2, 2);

                double dis = dis1 + dis2;
                dis = Math.sqrt(dis);

                if (dis == r1 + r2) {
                    System.out.println(1);
                } else if (dis > r1 + r2) {
                    System.out.println(0);
                } else {
                    if (Math.abs(r1 - r2) > dis) {
                        System.out.println(0);
                    } else if (Math.abs(r1 - r2) == dis) {
                        System.out.println(1);
                    } else {
                        System.out.println(2);
                    }
                }
            }

        }

    }

}
