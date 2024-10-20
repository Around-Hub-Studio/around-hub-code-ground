package studio.aroundhub.codeground.lecture.baekjoon.m1000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1697 {

  static int N, K, MAX;
  static int[] arr;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    K = sc.nextInt();

    if (N == K) {
      System.out.println(0);
      return;
    }

    MAX = Math.max(N, K) + 2;

    arr = new int[MAX];

    bfs();

    System.out.println(arr[K]);
  }

  static void bfs() {

    Queue<Integer> queue = new LinkedList<>();
    queue.add(N);

    while (!queue.isEmpty()) {

      int position = queue.poll();
      int preValue = arr[position];

      int temp = position * 2;
      if (temp < arr.length) {
        if (arr[temp] != 0 && arr[temp] > arr[position] + 1) {
          arr[temp] = preValue + 1;
          queue.add(temp);
          // System.out.println("Case#1 // 지난 위치 : " + position + ", " + "위치 " + temp + "에 " +
          // arr[temp] + " 입력");
        } else if (arr[temp] == 0) {
          arr[temp] = preValue + 1;
          queue.add(temp);
          // System.out.println("Case#1 // 지난 위치 : " + position + ", " + "위치 " + temp + "에 " +
          // arr[temp] + " 입력");
        }
      }

      /*            for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();*/

      temp = position + 1;
      if (temp < arr.length) {
        if (arr[temp] != 0 && arr[temp] > arr[position] + 1) {
          arr[temp] = preValue + 1;
          queue.add(temp);
          // System.out.println("Case#2 // 지난 위치 : " + position + ", " + "위치 " + temp + "에 " +
          // arr[temp] + " 입력");
        } else if (arr[temp] == 0) {
          arr[temp] = preValue + 1;
          queue.add(temp);
          // System.out.println("Case#2 // 지난 위치 : " + position + ", " + "위치 " + temp + "에 " +
          // arr[temp] + " 입력");
        }
      }

      /*            for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();*/

      temp = position - 1;

      if (temp >= 0) {
        if (arr[temp] != 0 && arr[temp] > arr[position] + 1) {
          arr[temp] = preValue + 1;
          queue.add(temp);
          // System.out.println("Case#3 // 지난 위치 : " + position + ", " + "위치 " + temp + "에 " +
          // arr[temp] + " 입력");
        } else if (arr[temp] == 0) {
          arr[temp] = preValue + 1;
          queue.add(temp);
          // System.out.println("Case#3 // 지난 위치 : " + position + ", " + "위치 " + temp + "에 " +
          // arr[temp] + " 입력");
        }
      }

      /*            for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();*/

    }
  }
}
