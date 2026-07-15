package functional_interface.types;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,String> isEven = new Function<Integer, String>() {
            @Override
            public String apply(Integer num) {
                return (num%2==0)? "even":"odd";
            }
        };
        System.out.println(isEven.apply(21));
        System.out.println(isEven.apply(12));

        Function<String, Boolean> isMagic =(str)-> str.contains("magic");
        System.out.println(isMagic.apply("magical"));
        System.out.println(isMagic.apply("magiician"));
    }
}
