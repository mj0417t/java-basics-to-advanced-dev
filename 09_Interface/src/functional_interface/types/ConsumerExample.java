package functional_interface.types;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> loggingInteger = (Integer val)->{
            if (val>10){
                System.out.println("Logging integer greater than 10");
            }else{
                System.out.println("Logging integer lesser than 10");
            }
        };
        loggingInteger.accept(9);
        loggingInteger.accept(19);

        Consumer<String> isEvenLengthString = new Consumer<String>() {
            @Override
            public void accept(String s) {
                if (s.length()%2==0){
                    System.out.println("Even Length String.");
                }else{
                    System.out.println("Odd Length String.");
                }
            }
        };

        isEvenLengthString.accept("musarrat");
        isEvenLengthString.accept("jahan");
    }
}
