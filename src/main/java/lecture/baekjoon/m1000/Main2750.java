package lecture.baekjoon.m1000;

import java.util.Scanner;

public class Main2750 {


    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int outer, inner;

        for (outer = array.length - 1; outer > 0; outer--) {
            for (inner = 0; inner < outer; inner++) {
                if (array[inner] > array[inner + 1]) {
                    int temp = array[inner];
                    array[inner] = array[inner + 1];
                    array[inner + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
