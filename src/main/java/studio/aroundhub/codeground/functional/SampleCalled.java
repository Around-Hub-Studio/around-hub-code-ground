package studio.aroundhub.codeground.functional;

public class SampleCalled {

    public static void main(String[] args){
        CustomFunctionalInterface customInterface = (message) -> System.out.println(message);

        String message = "Hello! Around Hub Studio";
        customInterface.called(message);

        customInterface.printHello();
    }

}
