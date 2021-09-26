package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1780 {

    static int[][] board;
    static int count1;
    static int count2;
    static int count3;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        check(0, 0, N);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }

    static void check(int x, int y, int size) {
        //System.out.println("x : " + x + ", y : " + y + ", size : " + size);
        // 사이즈가 1일 경우
        if (size == 1) {
            if (board[x][y] == -1) {
                count1++;
                //System.out.println("size가 1입니다. count1을 올립니다 >> count1 : " + count1 + ", count2 : " + count2 + ", count3 : " + count3);
            } else if (board[x][y] == 0) {
                count2++;
                //System.out.println("size가 1입니다. count2을 올립니다 >> count1 : " + count1 + ", count2 : " + count2 + ", count3 : " + count3);
            } else {
                count3++;
                //System.out.println("size가 1입니다. count3을 올립니다 >> count1 : " + count1 + ", count2 : " + count2 + ", count3 : " + count3);
            }
            return;
        }

        // 색이 같은지 체크
        int tempNumber = board[x][y];
        boolean isSame = true;
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (board[i][j] != tempNumber) {
                    isSame = false;
                    //System.out.println("색이 달라 로직을 탈출합니다.");
                    break;
                }
            }
            if (!isSame) {
                break;
            }
        }

        // 색이 같다면
        if (isSame) {
            if (tempNumber == -1) {
                count1++;
                //System.out.println("특정 영역의 색이 동일합니다. count1을 올립니다.");
            } else if (tempNumber == 0) {
                count2++;
                //System.out.println("특정 영역의 색이 동일합니다. count2을 올립니다.");
            } else {
                count3++;
                //System.out.println("특정 영역의 색이 동일합니다. count3을 올립니다.");
            }
            return;
        }

        // 색이 다르면 분할
        int tempSize = size / 3;
        check(x, y, tempSize);
        check(x + tempSize, y, tempSize);
        check(x + (tempSize * 2), y, tempSize);
        check(x, y + tempSize, tempSize);
        check(x + tempSize, y + tempSize, tempSize);
        check(x + (tempSize * 2), y + tempSize, tempSize);
        check(x, y + (tempSize * 2), tempSize);
        check(x + tempSize, y + (tempSize * 2), tempSize);
        check(x + (tempSize * 2), y + (tempSize * 2), tempSize);

    }

}
