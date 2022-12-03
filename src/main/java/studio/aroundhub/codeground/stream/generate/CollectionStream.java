package studio.aroundhub.codeground.stream.generate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStream {

    public CollectionStream() {
        String[] array = new String[]{"around", "hub", "studio", "flature"};
        Stream<String> stream1 = Arrays.stream(array);
        Stream<String> partStream = Arrays.stream(array, 1, 4);

        // 아래와 같이 스트림을 리스트로 만들 수도 있음
        List<String> list1 = stream1.toList();

        // 아래 List 가 상속받고 있는 Collection 인터페이스를 확인해보세요
        List<String> list2 = Arrays.asList("around", "hub", "studio", "flature");

        Stream<String> stream2 = list2.stream();
        // 병렬처리를 하기 위해서는 아래와 같이 스트림을 생성합니다.
        Stream<String> parallelStream = list2.parallelStream();
    }

    public static void main(String[] args){
        new CollectionStream();
    }
}
