package lecture.baekjoon;

import java.util.Scanner;

public class Main7568 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] man = new int[N][3];

        for (int i = 0; i < N; i++) {
            man[i][0] = sc.nextInt();
            man[i][1] = sc.nextInt();
        }

        for (int i = 0; i < man.length; i++) {
            int rank = 1;

            for(int j = 0 ; j < man.length;j++){
                if(i==j){
                    continue;
                }

                if(man[i][0] < man[j][0] && man[i][1] < man[j][1]){
                    rank++;
                }
            }

            System.out.print(rank + " ");
        }



    }

}
