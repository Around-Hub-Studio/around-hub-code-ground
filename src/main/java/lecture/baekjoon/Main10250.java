package lecture.baekjoon;

import java.util.Scanner;

public class Main10250 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int TEST_CASE = 0; TEST_CASE < T; TEST_CASE++) {

            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int room = N / H;
            int floor = N % H;

            if (floor == 0) {
                System.out.println((H * 100) + room);
            } else {
                System.out.println((floor * 100) + (room + 1));
            }
        }
    }
}
