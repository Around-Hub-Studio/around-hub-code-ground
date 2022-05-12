package studio.aroundhub.codeground.lecture.equals_and_hashcode;

public class ExamObject2 {

    private String name;

    public ExamObject2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if(obj instanceof ExamObject2){
            ExamObject2 examObject = (ExamObject2) obj;
            if(name.equals(examObject.name)){
                return true;
            }
        }
        return false;
    }
}
