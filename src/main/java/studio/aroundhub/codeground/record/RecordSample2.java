package studio.aroundhub.codeground.record;

public record RecordSample2(int x, String y) {
  public RecordSample2 {
    x = x *5;
    y = y + " things";
  }
}
