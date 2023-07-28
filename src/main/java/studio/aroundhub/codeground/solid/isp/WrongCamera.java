package studio.aroundhub.codeground.solid.isp;

public class WrongCamera implements SmartPhone{
  @Override
  public void call() {
    System.out.println("What is this?");
  }

  @Override
  public void takePicture() {
    // ... do something
  }

  @Override
  public void playGame() {
    System.out.println("What is this?");
  }
}
