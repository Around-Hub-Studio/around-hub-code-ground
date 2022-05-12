package studio.aroundhub.codeground.processing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberPrefix {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int count = 1;

        while(!input.isEmpty()){
            input = input.replaceAll("Y", "TRUE");
            input = input.replaceAll("N", "FALSE");

            System.out.println(count++ + "," + input);
            input = br.readLine();
        }

    }

}
