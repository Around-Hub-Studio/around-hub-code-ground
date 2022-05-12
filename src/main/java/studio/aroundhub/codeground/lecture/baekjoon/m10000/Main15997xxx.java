package studio.aroundhub.codeground.lecture.baekjoon.m10000;

import java.util.Arrays;
import java.util.Scanner;

public class Main15997xxx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] teams = new String[4];

        for (int i = 0; i < 4; i++) {
            teams[i] = sc.next();
        }

        double[] scores = new double[4];

        for (int i = 0; i < 6; i++) {

            int teamIndex1 = 0, teamIndex2 = 0;
            String team1 = sc.next();
            String team2 = sc.next();

            for (int k = 0; k < teams.length; k++) {
                if (team1.equals(teams[k])) {
                    teamIndex1 = k;
                }
                if (team2.equals(teams[k])) {
                    teamIndex2 = k;
                }
            }

            double win = sc.nextDouble();
            double draw = sc.nextDouble();
            double lose = sc.nextDouble();

            scores[teamIndex1] += (win * 3) + (draw * 1);
            scores[teamIndex2] += (lose * 3) + (draw * 1);

        }

        double first = 0;
        double max = 0;
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                first = i;
                max = scores[i];
            }
        }

    }

}
