package studio.aroundhub.codeground.stream.processing;

import studio.aroundhub.stream.sample.vo.StringVo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Mapping {

    public Mapping(){
        List<String> list = List.of("around", "hub", "studio");
        // map 메소드는 스트림 내 요소들을 보면서 특정 값으로 변환하는 작업을 수행합니다.
        // 값을 변환하기 위해 람다를 인자로 받습니다.
        // 이 과정에서 output은 새로운 스트림에 담습니다.
        Stream<String> stream = list.stream().parallel().map(String::toUpperCase);
        stream.forEach(System.out::println);

        List<StringVo> stringVoList = List.of(
                new StringVo(),
                new StringVo(),
                new StringVo()
        );

        flatMapping();
    }

    private void flatMapping(){
        // flatMap 메소드는 Stream 타입을 리턴하는 mapper 를 인자로 갖습니다.
        // 중첩 구조의 컬렉션을 한단계 제거하고 단일 컬렉션으로 구성합니다.
        List<List<String>> list = Arrays.asList(Arrays.asList("a", "b"),
                Arrays.asList("c", "d"));

        List<String> flatList = list.stream()
                .flatMap(Collection::stream).toList();
        flatList.forEach(System.out::println);

        List<StringVo> stringVoList = List.of(
                new StringVo(),
                new StringVo(),
                new StringVo()
        );
        stringVoList.stream()
                .flatMap(stringVo -> Stream.of(stringVo.getName(), stringVo.getOrganization()))
                .forEach(System.out::println);
    }

}
