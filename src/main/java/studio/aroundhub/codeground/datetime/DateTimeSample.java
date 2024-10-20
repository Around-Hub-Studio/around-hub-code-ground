package studio.aroundhub.codeground.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSample {

  public static void main(String[] args) {
    ZonedDateTime a = ZonedDateTime.now();
    System.out.println(a);

    ZonedDateTime i = ZonedDateTime.now(ZoneId.of("UTC"));
    System.out.println(i);

    LocalDateTime b = LocalDateTime.now();
    System.out.println(b);

    ZonedDateTime c = LocalDateTime.now().atZone(ZoneId.of("UTC"));
    System.out.println(c);

    String d = "2023-02-15 15:12:14";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime e = LocalDateTime.parse(d, formatter);
    ZonedDateTime f = LocalDateTime.parse(d, formatter).atZone(ZoneId.of("Asia/Seoul"));
    System.out.println(e);
    System.out.println(f);

    ZonedDateTime g = f.withZoneSameInstant(ZoneId.of("UTC"));
    System.out.println("g : " + g);

    LocalDateTime h = c.toLocalDateTime();
    System.out.println(h);
  }
}
