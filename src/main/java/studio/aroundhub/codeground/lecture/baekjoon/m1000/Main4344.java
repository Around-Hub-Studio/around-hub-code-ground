package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main4344 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for (int T = 0; T < C; T++) {

            int N = sc.nextInt();
            int[] score = new int[N];

            double sum = 0;
            for (int i = 0; i < N; i++) {
                score[i] = sc.nextInt();
                sum += score[i];
            }

            double avg = sum / N;

            double count = 0 ;
            for(int i = 0 ; i < N ; i++){
                if(score[i] > avg){
                    count++;
                }
            }

            //System.out.println(Math.round(count/N*100000.0)/1000.0);
            System.out.printf("%.3f",(double)100*count/N);
            System.out.println("%");
            //System.out.println(String.format("%.3f", count/N*100) + "%");

        }

    }

}
