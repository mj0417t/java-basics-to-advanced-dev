package functional_interface.types;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> answer = new Supplier<>() {
            @Override
            public String get() {
                return "Returning a string";
            }
        };
        System.out.println(answer.get());

        Supplier<Integer> provideEven = ()->{
            Random random = new Random();
            while(true){
                int val=random.nextInt(100);
                if(val%2==0){
                    return val;
                }
            }

        };

        System.out.println(provideEven.get());
    }
}
