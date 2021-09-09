package lecture.baekjoon;

import java.util.Scanner;

public class Main1085 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int xMin = Math.min(w-x, x-0);
        int yMin = Math.min(h-y, y-0);

        System.out.println(Math.min(xMin, yMin));

    }

}
