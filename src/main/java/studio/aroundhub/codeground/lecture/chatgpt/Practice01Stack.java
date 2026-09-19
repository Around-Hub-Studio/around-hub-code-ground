package studio.aroundhub.codeground.lecture.chatgpt;

import java.util.LinkedList;
import java.util.Scanner;

/*
문제 1 — 잘못 적은 금액 지우기 (스택)

장부에 금액을 순서대로 적습니다.
양수가 들어오면 장부의 마지막에 해당 금액을 적고,
0이 들어오면 가장 최근에 적은 금액 하나를 지웁니다.
모든 기록을 처리한 뒤 장부에 남은 금액의 합을 구하세요.
0이 주어질 때는 반드시 지울 금액이 하나 이상 존재합니다.

입력
첫째 줄에 기록의 개수 N이 주어집니다.
다음 N개의 줄에 정수 하나씩 주어집니다.

제한
1 ≤ N ≤ 100,000
0 ≤ 각 정수 ≤ 10,000
장부가 비어 있으면 합은 0입니다.

출력
남아 있는 금액의 합을 출력합니다.

예제 1
입력
7
5
3
0
7
0
2
4

출력
11

설명
장부에는 5, 2, 4가 남습니다.

예제 2
입력
2
10
0

출력
0
 */
public class Practice01Stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= total; i++) {
            int input = sc.nextInt();
            if(input != 0){
                list.add(input);
            }else {
                list.pop();
            }
        }

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        System.out.println(sum);
    }
}

