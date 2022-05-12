package studio.aroundhub.codeground.lecture.equals_and_hashcode;

public class ExamObject3 {

    private String name;

    public ExamObject3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ExamObject3){
            ExamObject3 examObject = (ExamObject3) obj;
            if(name.equals(examObject.name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
