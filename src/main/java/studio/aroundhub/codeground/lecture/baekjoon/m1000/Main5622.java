package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main5622 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);

            switch (a){
                case 'A' : case 'B' : case 'C' :  // 2에 대응되는 문자
                    sum += 3;
                    break;
                case 'D' : case 'E' : case 'F' :  // 3에 대응되는 문자
                    sum += 4;
                    break;
                case 'G' : case 'H' : case 'I' : // 4에 대응되는 문자
                    sum += 5;
                    break;
                case 'J' : case 'K' : case 'L' :
                    sum += 6;
                    break;
                case 'M' : case 'N' : case 'O' :
                    sum += 7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S' :
                    sum += 8;
                    break;
                case 'T' : case 'U' : case 'V' :
                    sum += 9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    sum += 10;
                    break;
            }

        }

        System.out.println(sum);

    }

}
