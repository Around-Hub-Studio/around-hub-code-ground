package lecture.baekjoon.m10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main11279 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ;i < N ; i++){

            int tmp = Integer.parseInt(br.readLine());

            if(tmp==0){
                if(priorityQueue.isEmpty()){
                    sb.append(0).append("\n");
                }else{
                    sb.append(priorityQueue.poll()).append("\n");
                }
            }else{
                priorityQueue.offer(tmp);
            }

        }

        System.out.println(sb);

    }

}
