package studio.aroundhub.codeground.reactor.sample1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
  private Integer key;
  private String message;
}
