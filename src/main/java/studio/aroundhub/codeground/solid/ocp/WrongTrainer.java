package studio.aroundhub.codeground.solid.ocp;

import java.security.InvalidParameterException;

public class WrongTrainer {
  public WrongTrainer(Animal animal) {
    if (animal == null) {
      throw new InvalidParameterException("Where is animal?");
    }

    if (animal instanceof Cat cat) {
      cat.cry();
    } else if (animal instanceof Dog dog) {
      dog.cry();
    } else if (animal instanceof Bird bird) {
      bird.cry();
    }
  }
}
