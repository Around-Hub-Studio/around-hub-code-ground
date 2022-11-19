package studio.aroundhub.codeground.decimal;

public class DoubleFloatExample {

    public static void main(String[] args){
        double plusDoubleValue = 0;
        for(int i = 0; i < 100; i++){
            plusDoubleValue += 0.1;
        }
        double multipleDoubleValue = 0.1 * 100;
        System.out.println("plusValue : " + plusDoubleValue);
        System.out.println("multipleValue : " + multipleDoubleValue);

        float plusFloatValue = 0;
        for(int i = 0; i < 100; i++){
            plusFloatValue += 0.1;
        }
        float multipleFloatValue = 0.1f * 100;
        System.out.println("plusValue : " + plusFloatValue);
        System.out.println("multipleValue : " + multipleFloatValue);
    }

}
