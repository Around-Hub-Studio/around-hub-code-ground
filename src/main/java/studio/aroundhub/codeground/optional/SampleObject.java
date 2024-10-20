package studio.aroundhub.codeground.optional;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class SampleObject {

  private String name;
  private String age;
  private String organization;
}
