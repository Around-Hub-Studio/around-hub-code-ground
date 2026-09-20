package studio.aroundhub.codeground.lecture.chatgpt;

import java.util.LinkedList;
import java.util.Scanner;

/*
문제 2 — 안내 데스크 대기 줄 (큐)

안내 데스크에서 다음 명령을 순서대로 처리하세요.
JOIN X: 번호가 X인 손님을 대기 줄 맨 뒤에 추가합니다.
CALL: 맨 앞 손님의 번호를 출력하고 줄에서 제거합니다.
      줄이 비어 있으면 -1을 출력합니다.
SIZE: 현재 대기 중인 손님 수를 출력합니다.

입력
첫째 줄에 명령의 개수 N이 주어집니다.
다음 N개의 줄에 명령이 하나씩 주어집니다.

제한
1 ≤ N ≤ 100,000
1 ≤ X ≤ 100,000
JOIN에 등장하는 손님 번호는 모두 다릅니다.
처음에는 대기 줄이 비어 있습니다.
CALL 또는 SIZE 명령이 적어도 하나 주어집니다.

출력
CALL과 SIZE 명령의 결과를 각각 한 줄에 출력합니다.

예제 1
입력
7
JOIN 10
JOIN 20
SIZE
CALL
JOIN 30
CALL
CALL

출력
2
10
20
30

예제 2
입력
3
CALL
SIZE
CALL

출력
-1
0
-1
 */
public class Practice02Queue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total =  sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i <= total; i++) {
           String input = sc.next();

           if(input.equalsIgnoreCase("JOIN")) {
               int num = sc.nextInt();
               list.add(num);
           }else if(input.equalsIgnoreCase("CALL")) {
               if(list.isEmpty()) {
                   System.out.println("-1");
                   continue;
               }
               int out = list.pop();
               System.out.println(out);
           }else {
               System.out.println(list.size());
           }
        }

    }
}

