package studio.aroundhub.codeground.record;

public class Sample {

  public static void main(String[] args){
    RecordSample recordSample = new RecordSample(1, "card");
    RecordSample anotherRecordSample = new RecordSample(1, "card");
    RecordSample2 recordSample2 = new RecordSample2(1, "card");

    System.out.println(recordSample);
    System.out.println(recordSample2);
    System.out.println(recordSample.equals(anotherRecordSample));
  }

}
