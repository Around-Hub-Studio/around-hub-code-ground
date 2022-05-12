package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main4153 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int[] rec = new int[3];
            int max = 0;
            int position = 0;

            rec[0] = sc.nextInt();
            if (rec[0] == 0) {
                break;
            }
            max = rec[0];
            position = 0;

            rec[1] = sc.nextInt();
            if (max < rec[1]) {
                max = rec[1];
                position = 1;
            }

            rec[2] = sc.nextInt();
            if (max < rec[2]) {
                max = rec[2];
                position = 2;
            }

            if (position == 0) {
                if(Math.pow(max, 2) == Math.pow(rec[1], 2) + Math.pow(rec[2], 2)){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            } else if (position == 1) {
                if(Math.pow(max, 2) == Math.pow(rec[0], 2) + Math.pow(rec[2], 2)){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            } else {
                if(Math.pow(max, 2) == Math.pow(rec[0], 2) + Math.pow(rec[1], 2)){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }

        }

    }

}
