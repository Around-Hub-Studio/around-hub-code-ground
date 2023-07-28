package studio.aroundhub.codeground.solid.dip;

import java.security.InvalidParameterException;

public class Trainer {

  private final Animal animal;

  public Trainer(Animal animal) {
    if (animal == null) {
      throw new InvalidParameterException("Where is animal?");
    }
    this.animal = animal;
  }

  public void training() {
    animal.cry();
  }
}
