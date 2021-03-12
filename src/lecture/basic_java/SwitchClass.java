package lecture.basic_java;

public class SwitchClass {

    public static void main(String[] args){

        int score = 82;

        switch (score/10){
            case 10:
                System.out.println("A+");
            case 9:
                System.out.println("A");
            case 8:
                System.out.println("B");
            case 7:
                System.out.println("C");
            default:
                System.out.println("등급 외");
        }

    }

}
