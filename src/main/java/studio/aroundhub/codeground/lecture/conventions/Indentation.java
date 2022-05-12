package studio.aroundhub.codeground.lecture.conventions;

/**
 * 들여쓰기 관련 코드 컨벤션 샘플
 *
 * @author Firstname Lastname
 * @version 1.0.0 19 Oct 2021
 */
public class Indentation {

    private final int argNumber1 = 1;
    private final int argNumber2 = 2;
    private final int argNumber3 = 3;
    private final int argNumber4 = 4;
    private final int argNumber5 = 5;
    private final int argNumber6 = 6;

    private boolean isCondition1 = true;
    private boolean isCondition2 = false;
    private boolean isCondition3 = true;
    private boolean isCondition4 = false;
    private boolean isCondition5 = true;
    private boolean isCondition6 = false;
    private boolean isCondition7 = true;

    private int someNumber1;
    private int someNumber2;

    public Indentation() {

        /* 메소드 호출 부문 줄바꿈 방식 */
        someNumber1 = someMethod1(argNumber1, argNumber2, argNumber3, argNumber4, argNumber5,
                                  argNumber6);
        someNumber2 = someMethod1(argNumber1, argNumber2, argNumber3,
                                  someMethod2(argNumber1, argNumber2, argNumber4, argNumber5),
                                  argNumber5, argNumber6);

        /* 산술식 줄바꿈 방식 */
        someNumber1 = argNumber1 + argNumber2 * (argNumber3 + argNumber4 - argNumber5)
                      + 4 * argNumber4 + argNumber5; // 선호되는 방식

        someNumber2 = argNumber2 + argNumber1 * (argNumber3 + argNumber4
                                                 - argNumber5) + 4 * argNumber4 + argNumber5; // 피해야 하는 방식

        /* if 문의 줄바꿈 */
        if((isCondition1 && isCondition2)
            || (isCondition3 && isCondition4)
            || !(isCondition5 && isCondition6)){  // 잘못된 방식
            someMethod3();
        }

        if((isCondition1 && isCondition2)
                || (isCondition3 && isCondition4)
                || !(isCondition5 && isCondition6)){  // 이 방식으로 대체 1
            someMethod3();
        }

        if((isCondition1 && isCondition2) || (isCondition3 && isCondition4)
                || !(isCondition5 && isCondition6)){  // 이 방식으로 대체 2
            someMethod3();
        }

    }

    /* 메소드 선언 부문 줄바꿈 방식 */
    int someMethod1(int argument1, int argument2, int argument3, int argument4, int argument5,
                    int argument6) {
        return argument1 + argument2;
    }

    int someMethod2(int argument1, int argument2, int argument3, int argument4) {
        return argument1;
    }

    void someMethod3() {
    }

    //INDENT 8 SPACES TO AVOID VERY DEEP INDENTS
    private static synchronized void horkingLongMethodName(int anArg,
        Object anotherArg, String yetAnotherArg, Object andStillAnother) {}

}
