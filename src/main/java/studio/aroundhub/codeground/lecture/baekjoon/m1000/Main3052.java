package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main3052 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];
        int[] check = new int[42];

        int count = 0;

        for(int i = 0 ; i< list.length ; i++){
            list[i] = sc.nextInt();

            int num = list[i] % 42;
            if(check[num] != 1){
                check[num] = 1;
                count++;
            }
        }

        System.out.println(count);



    }

}
