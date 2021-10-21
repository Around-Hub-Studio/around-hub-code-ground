package lecture.conventions;

public class Declarations {

    int level; // 주석 사용을 위해 선언은 한줄에 하나씩 하는 것을 권장
    int size;
    int a, b; // 이런 방식의 선언은 권장되지 않음
    int c, d[]; // 이런 방식의 다른 형식을 같은 라인에 추가하는 것은 피해야 함

    public Declarations(){
        level = 1;
        size = 2;
        a = 3;
        b = 4;
        c = 5;
        d = new int[size];
    }

    public void method1(){
        int a = 1; // 전역변수(상위 수준의 변수)로 설정된 변수의 이름과 동일하므로 이런 변수 선언은 지양해야 함
        int variable = 2;
    }

}
