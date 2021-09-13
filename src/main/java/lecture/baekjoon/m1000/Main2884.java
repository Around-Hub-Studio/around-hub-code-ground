package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2884 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min >= 45) {
            System.out.println(hour + " " + (min - 45));
        }else{
            if(hour == 0){
                System.out.println(23 + " " + (60+(min-45)));
            }else{
                System.out.println((hour-1) + " " + (60+(min-45)));
            }
        }

    }

}
