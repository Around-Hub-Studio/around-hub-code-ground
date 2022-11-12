package studio.aroundhub.codeground.functional.sample;

import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args){
        Supplier<String> getMessage = () -> "Around Hub Studio!";
        System.out.println(getMessage.get());
    }
}
