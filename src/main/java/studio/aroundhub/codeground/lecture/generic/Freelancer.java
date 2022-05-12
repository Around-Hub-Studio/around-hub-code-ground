package studio.aroundhub.codeground.lecture.generic;

public class Freelancer {

    private String name;
    private final String jobName = "Freelancer";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobName() {
        return jobName;
    }
}
