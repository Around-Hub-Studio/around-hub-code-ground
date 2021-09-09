package lecture.baekjoon;

import java.util.Scanner;

public class Main3009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrayX = new int[3];
        int[] arrayY = new int[3];

        for(int i = 0 ;i < 3;i++){
            arrayX[i] = sc.nextInt();
            arrayY[i] = sc.nextInt();
        }

        int x = 0;
        int y = 0;
        if(arrayX[0] == arrayX[1]){
            x = arrayX[2];
        }else if(arrayX[0] == arrayX[2]){
            x = arrayX[1];
        }else{
            x = arrayX[0];
        }

        if(arrayY[0] == arrayY[1]){
            y = arrayY[2];
        }else if(arrayY[0] == arrayY[2]){
            y = arrayY[1];
        }else{
            y = arrayY[0];
        }

        System.out.println(x + " " + y);

    }

}
