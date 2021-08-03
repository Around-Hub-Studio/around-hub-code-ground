package lecture.middle_java.encapsulation;

/**
 * 캡슐화 예시코드
 * thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class Student {

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
