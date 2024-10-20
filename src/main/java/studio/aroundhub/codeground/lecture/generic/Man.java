package studio.aroundhub.codeground.lecture.generic;

public class Man<J> {

  private J job;

  public Man(J job) {
    this.job = job;
  }

  public J getJob() {
    return job;
  }

  public void setJob(J job) {
    this.job = job;
  }
}
