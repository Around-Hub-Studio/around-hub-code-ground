package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main5086 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            if (a < b) {
                if (b % a == 0) {
                    System.out.println("factor");
                }else{
                    System.out.println("neither");
                }
            } else {
                if( a % b ==0){
                    System.out.println("multiple");
                }else{
                    System.out.println("neither");
                }
            }
        }

    }

}
