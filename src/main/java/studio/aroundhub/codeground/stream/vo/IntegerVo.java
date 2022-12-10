package studio.aroundhub.codeground.stream.vo;

import lombok.Getter;

import java.util.Random;

@Getter
public class IntegerVo {

    private int number1;
    private int number2;
    private int number3;

    public IntegerVo(){
        Random random = new Random();
        this.number1 = random.nextInt(50);
        this.number2 = random.nextInt(50);
        this.number3 = random.nextInt(50);
    }

    public IntegerVo(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
}
