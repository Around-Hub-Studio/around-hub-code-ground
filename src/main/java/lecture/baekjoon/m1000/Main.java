package lecture.baekjoon.m1000;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayDeque;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {


        ArrayDeque<Integer> deque;
        StringTokenizer st;

        int T = in.nextInt();



        while(T --> 0) {

            String command = in.next();	// 문제에서 p에 해당하는 명령어
            int n = in.nextInt();

            /*
             *  [a,b,c,...,x] 중 구분해야 할 것은 대괄호([, ])와 반점(,) 이다.
             *  StringTokenizer로 여러 구분자를 사용 하고 싶다면
             *  구분할 문자들을 합쳐서 넘겨주면 된다.
             *
             *  만약 split()을 사용하고싶은 경우 정규식으로는
             *  String input = br.readLine();
             *  String[] s = input.subString(1, input.length - 1).split(","); 을 해주어야 한다.
             *
             *  subString을 쓰지않고, split("[^0-9]") 또는,
             *  split("[\\[\\]\\,") 같이 정규식으로만 쓴다면 첫 번째 인자가 정규식에 걸려
             *  빈 문자열을 반환하게 되기 때문
             *
             *  ex)
             *  str = "[1,2,3,4]";
             *  strr[] = str.split("[\\[\\]\\,");
             *
             *  result)
             *  strr[0] = ""
             *  strr[1] = "1"
             *  strr[2] = "2"
             *  strr[3] = "3"
             *  strr[4] = "4"
             */
            st = new StringTokenizer(in.next(), "[],");

            deque = new ArrayDeque<Integer>();

            // 덱에 배열 원소를 넣어준다.
            for(int i = 0; i < n; i++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            AC(command, deque);
        }

        System.out.println(sb);

    }

    public static void AC(String command, ArrayDeque<Integer> deque) {

        boolean isRight = true;	// 방향 상태 변수

        for(char cmd : command.toCharArray()) {

            if(cmd == 'R') {
                isRight = !isRight;	// 방향을 바꿔준다.
                continue;
            }


            // 아래는 D의 경우

            // D 함수이면서 isRight가 true 일 경우
            if(isRight) {

                // 만약 반환 된 원소가 없을 경우 error를 출력하도록 하고 함수 종료
                if(deque.pollFirst() == null) {
                    sb.append("error\n");
                    return;
                }

            }
            else {
                // 만약 반환 된 원소가 없을 경우 error를 출력하도록 하고 함수 종료
                if(deque.pollLast() == null) {
                    sb.append("error\n");
                    return;
                }
            }
        }

        // 모든 함수들이 정상적으로 작동했다면 덱의 남은 요소들을 출력문으로 만들어준다.
        makePrintString(deque, isRight);

    }

    public static void makePrintString(ArrayDeque<Integer> deque, boolean isRight) {

        sb.append('[');	// 여는 대괄호 먼저 StringBuilder에 저장

        if(deque.size() > 0) {	//만약 출력 할 원소가 한 개 이상일 경우

            if(isRight) {	// 정방향일경우

                sb.append(deque.pollFirst());	// 먼저 첫 번째 원소를 넘겨준다.

                // 그 다음 원소부터 반점을 먼저 넘겨준 후 덱의 원소를 하나씩 뽑아 넘긴다.
                while(!deque.isEmpty()) {
                    sb.append(',').append(deque.pollFirst());
                }
            }
            else {	// 역방향일경우
                sb.append(deque.pollLast());	// 먼저 뒤에서부터 첫 번째 원소를 넘겨준다.

                // 그 다음 원소부터 반점을 먼저 넘겨준 후 덱의 원소를 뒤에서부터 하나씩 뽑아 넘긴다.
                while(!deque.isEmpty()) {
                    sb.append(',').append(deque.pollLast());
                }
            }
        }

        sb.append(']').append('\n');	// 닫는 대괄호 및 개행으로 마무리
    }
}