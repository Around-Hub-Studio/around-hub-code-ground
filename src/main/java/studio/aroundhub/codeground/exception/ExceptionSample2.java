package studio.aroundhub.codeground.exception;

import java.util.Scanner;

public class ExceptionSample2 {

    Scanner scanner;

    public ExceptionSample2() throws RuntimeException {
        int input = scanner.nextInt();
    }

    public static void main(String[] args) {
        new ExceptionSample2();
    }
}
