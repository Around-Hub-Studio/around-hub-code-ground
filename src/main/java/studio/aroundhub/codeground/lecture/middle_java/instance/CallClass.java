package studio.aroundhub.codeground.lecture.middle_java.instance;

/**
 * 인스턴스(Instance) 예시코드
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class CallClass {

  public CallClass() {

    Contents contents = new Contents();
    /**
     *
     * 'Contents' : Class
     *   클래스 객체 그 자체를 의미
     *
     * 'new Contents()' : Instance
     *   new를 붙임으로 메모리 상에 Class를 올려놓은 것
     *
     */
  }

  public static void main(String[] args) {
    new CallClass();
  }
}
