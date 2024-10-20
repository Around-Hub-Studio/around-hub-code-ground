package studio.aroundhub.codeground.stream.generate;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStream {

  public FileStream() throws IOException {
    Stream<String> stream = Files.lines(Paths.get("file.txt"), StandardCharsets.UTF_8);
  }
}
