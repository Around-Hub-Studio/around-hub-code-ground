package studio.aroundhub.codeground.optional;

import java.util.Optional;

public class OptionalProcessingSample {

    public OptionalProcessingSample() {
        // filter
        Optional<SampleObject> sampleObject1 = Optional.of(getObject())
                .filter(object -> object.getName().equals("flature"));
        System.out.println(sampleObject1.get());

        Optional<SampleObject> sampleObject2 = Optional.of(getObject())
                .filter(object -> object.getName().equals("flature123"));
        System.out.println(sampleObject2.isPresent());

        // map
        Optional<String> StringObject1 = Optional.of(getObject())
                .map(sampleObject -> sampleObject.getName());
        System.out.println(StringObject1.get());

        // ifPresent
        Optional.of(getObject())
                .ifPresent(object -> System.out.println(object));

        // ifPresentOrElse
        Optional.ofNullable(getNullObject())
                .ifPresentOrElse(object -> {
                            System.out.println(object);
                        }, () -> {
                            System.out.println("null object");
                        }
                );

        // isPresent
        if(Optional.ofNullable(getObject()).isPresent()){
            System.out.println("is present!");
        }

        // isEmpty
        if(Optional.ofNullable(getNullObject()).isEmpty()){
            System.out.println("is empty!");
        }


        // get
        Optional<SampleObject> sampleObject3 = Optional.of(getObject());
        System.out.println(sampleObject3.get());

        // orElse : 값이 있어도 실행됨
        SampleObject sampleObject4 = Optional.ofNullable(getNullObject())
                .orElse(new SampleObject("flature123", "around hub", "12"));
        System.out.println(sampleObject4);

        // orElseGet : supplier 를 인자로 받음, 값이 없을 때만 실행됨
        SampleObject sampleObject5 = Optional.ofNullable(getNullObject())
                .orElseGet(() -> new SampleObject("flature1234", "Around Hub", "14"));
        System.out.println(sampleObject5);
    }

    private SampleObject getNullObject() {
        return null;
    }

    private SampleObject getObject() {
        return SampleObject.builder()
                .name("flature")
                .age("10")
                .organization("Around Hub Studio")
                .build();
    }

    public static void main(String[] args) {
        new OptionalProcessingSample();
    }
}
