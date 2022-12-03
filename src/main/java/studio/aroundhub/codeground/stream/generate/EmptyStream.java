package studio.aroundhub.codeground.stream.generate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmptyStream {

    public EmptyStream() {
        // 비어있는 스트림은 요소가 없을 때 null 대신 사용하는 용도로 사용할 수 있습니다.
        List<String> list = new ArrayList<>();

        Stream<String> stream = streamOf(list);

        System.out.println(stream == null);
    }

    private Stream<String> streamOf(List<String> list){
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

}
