package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main1436 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int number = 666;
        int count = 1;

        while (count != N) {
            number++;
            if(Integer.toString(number).contains("666")){
                count++;
            }
        }

        System.out.println(number);

    }

}
