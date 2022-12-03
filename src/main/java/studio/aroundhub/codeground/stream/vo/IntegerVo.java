package studio.aroundhub.codeground.stream.vo;

import lombok.Getter;

@Getter
public class IntegerVo {

    private int number1;
    private int number2;
    private int number3;

    public IntegerVo(){
        this.number1 = 15;
        this.number2 = 35;
        this.number3 = 84;
    }

    public IntegerVo(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
}
