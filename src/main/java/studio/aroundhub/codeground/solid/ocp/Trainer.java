package studio.aroundhub.codeground.solid.ocp;

import java.security.InvalidParameterException;

public class Trainer {
  public Trainer(Animal animal) {
    if (animal == null) {
      throw new InvalidParameterException("Where is animal?");
    }
    animal.cry();
  }
}
