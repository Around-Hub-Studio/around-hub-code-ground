package studio.aroundhub.codeground.stream.vo;

import lombok.Getter;

@Getter
public class StringVo {

  private String name;
  private String organization;
  private String url;

  public StringVo() {
    this.name = "flature";
    this.organization = "around hub studio";
    this.url = "https://www.youtube.com/@around.hub.studio";
  }

  public StringVo(String name, String organization, String url) {
    this.name = name;
    this.organization = organization;
    this.url = url;
  }

  @Override
  public String toString() {
    return "StringVo{"
        + "name='"
        + name
        + '\''
        + ", organization='"
        + organization
        + '\''
        + ", url='"
        + url
        + '\''
        + '}';
  }
}
