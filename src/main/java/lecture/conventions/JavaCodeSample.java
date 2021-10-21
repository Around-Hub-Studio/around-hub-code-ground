/*
 * Classname (클래스 네임)
 *
 * Version Information (버전 정보)
 *
 * Date (날짜)
 *
 * Copyright Notice (저작권 표시)
 */

// 패키지 정보
package lecture.conventions;

// import 정보
import java.math.*;

/**
 * Class Description (클래스 정보)
 *
 * @author Firstname Lastname
 * @version 1.0.0
 */
public class JavaCodeSample extends ParentClass {

    /* 클래스 구현 코멘트 주석 */
    // static 변수가 먼저 선언되어야 함. 동일한 레벨일 경우 public -> protected -> default -> private 순서
    /**
     * classVariable1 documentation comment
     */
    public static int classVariable1;

    protected static int classVariable2; // comment

    static int getClassVariable3;

    private static int classVariable4;

    /**
     * instanceVariable1 documentation comment
     */
    public int instanceVariable1;

    protected int instanceVariable2;

    int instanceVariable3;

    private int instanceVariable4;

    /**
     * 생성자 관련 코멘트 (Constructor documentation comment)
     */
    public JavaCodeSample() {

    }

    /**
     * 메소드 관련 코멘트 (Method documentation comment)
     */
    public void method1() {
        // 구현부 (implementations)
    }

    /**
     * 메소드 관련 코멘트 (Method documentation comment)
     *
     * @param param1 description
     * @param param2 description
     */
    public void method2(int param1, Object param2) {
// 구현부 (implementations)
    }

}
