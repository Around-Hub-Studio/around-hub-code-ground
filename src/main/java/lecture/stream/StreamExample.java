package lecture.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        System.out.println("-------------------↓↓↓ 스트림 생성 방법 ↓↓↓-------------------");

        /** 배열 스트림 **/
        String[] array = new String[]{"가", "나", "다", "라", "마", "바"};
        Stream<String> stringStream = Arrays.stream(array);
        Stream<String> partStream = Arrays.stream(array, 1, 3);

        /** 컬렉션 스트림 **/
        List<String> list = Arrays.asList("가", "나", "다", "라", "마", "바");
        Stream<String> stream = list.stream();
        Stream<String> parallelStream = list.parallelStream();

        /** 비어있는 스트림 **/
        Stream<String> emptyStream = Stream.empty();

        /** Stream Builder 사용법 **/
        Stream<String> streamBuilder = Stream.<String>builder()
                .add("가").add("나").add("다")
                .build();

        /** Stream Generate 사용법 **/
        Stream<String> streamGenerate1 = Stream.generate(() -> "unit").limit(5);

        /** Stream Iterate **/
        Stream<Integer> streamIterator = Stream.iterate(1, n -> n + 1).limit(10);

        /** 기본 타입형 스트림 **/
        IntStream intStream1 = IntStream.generate(() -> 1).limit(5);
        IntStream intStream2 = IntStream.range(1, 10);
        IntStream intStream3 = IntStream.rangeClosed(1, 10);

        /** 문자열 스트림 **/
        Stream<String> stringStream1 = Pattern.compile(", ").splitAsStream("가, 나, 다");

        /** 병렬 스트림 **/
        int[] arr = new int[]{1, 2, 3};
        IntStream intStream = Arrays.stream(arr).parallel();
        boolean isParallel = intStream.isParallel();
        System.out.println(isParallel);
        intStream = intStream.sequential();
        isParallel = intStream.isParallel();
        System.out.println(isParallel);

        /** 다른 스트림 연결 **/
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4);
        Stream<Integer> stream2 = Stream.of(4, 2, 3, 1);
        Stream<Integer> concatStream = Stream.concat(stream1, stream2);

        System.out.println("-------------------↑↑↑ 스트림 생성 방법 ↑↑↑-------------------");
        System.out.println("-------------------↓↓↓ 스트림 가공 방법 ↓↓↓-------------------");

        /**
         필터 (Filter)
         스트림 내 요소들 중 특정 조건에 맞는 요소들만 추출
         **/
        int[] filterList1 = new int[]{1, 10, 100, 1000, 10000, 100000};
        IntStream filterStream1 = Arrays.stream(filterList1).filter(n -> n > 1000);

        String[] filterList2 = new String[]{"a", "ab", "abc", "abcd"};
        Stream<String> filterStream2 = Arrays.stream(filterList2).filter(n -> n.length() > 2);
        Stream<String> filterStream3 = Arrays.stream(filterList2).filter(n -> n.contains("c"));

        /**
         매핑 (Mapping)
         스트림 내 요소들을 특정 로직을 거친 결과 값으로 대체하여 리턴
         **/
        Stream<String> mapStream1 = Arrays.stream(filterList2).map(String::toUpperCase);
        Stream<Integer> mapStream2 = Arrays.stream(filterList2).map(String::length);

        /**
         Sorting
         스트림 내 요소들을 정렬
         **/
        List<Integer> intList = IntStream.of(15, 200, 182, 1025, 1).sorted().boxed().collect(Collectors.toList());
        List<String> stringList = Arrays.asList("가", "다", "나", "라");
        stringList.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();

        System.out.println("-------------------↑↑↑ 스트림 가공 방법 ↑↑↑-------------------");
        System.out.println("-------------------↓↓↓ 스트림 도출(종료) 방법 ↓↓↓-------------------");

        /**
         Calculating
         스트림의 값으로 여러 계산을 실행하여 결과를 만들 수 있음
         **/
        int sum = IntStream.of(1, 23, 6231, 12, 5).sum();
        long count = IntStream.of(1, 23, 6231, 12, 5).count();

        OptionalInt optionalInt = IntStream.of(1, 23, 6231, 12, 5).max();

        /**
         Reduction
         **/
        OptionalInt optionalInt1 = IntStream.of(1, 23, 6231, 12, 5).reduce(Integer::sum);
        int a = IntStream.range(1, 10).reduce(100, (b, c) -> {
            return b + c;
        });

        /**
         Collecting
         Collector 타입의 파라미터를 받아 처리하며, 자주 사용하는 작업(메소드)은 Collectors 객체에서 제공함
         **/
        List<Man> manList = Arrays.asList(
                new Man("찰스", 15),
                new Man("칼스", 26),
                new Man("팝스", 17),
                new Man("잘스", 5)
        );
        manList.stream().map(Man::getAge).collect(Collectors.toList()).forEach(System.out::println);
        String joinString = manList.stream().map(Man::getName).collect(Collectors.joining());
        System.out.println(joinString);
        String joinString1 = manList.stream().map(Man::getName).collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinString1);

        double avg = manList.stream().collect(Collectors.averagingInt(Man::getAge));
        int sum1 = manList.stream().collect(Collectors.summingInt(Man::getAge));

        System.out.println("-------------------↑↑↑ 스트림 도출(종료) 방법 ↑↑↑-------------------");

    }

    public static class Man {

        private String name;
        private int age;

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
