import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class PlainOld{
    private static int last_id=1;
    private int id;
    public PlainOld(){
        id=PlainOld.last_id++;
        System.out.println("Creating a plainold Object"+" "+id);
    }
}

public class Main {
    public static void main(String[] args) {
        String[] names ={"anna", "rohan","sweetr","roles"};
        Arrays.asList(names).forEach(System.out::println);

        calculator(Integer::sum,10,24);
        calculator(Double::sum,2.5,7.5);
        calculator((s1,s2)->s1.concat(s2), "Hello","World");
        calculator(String::concat, "Hello","World");

        BinaryOperator<String> b1 = String::concat;
        BiFunction<String,String,String> b2 = String::concat;
        UnaryOperator<String> u1 = String::toLowerCase;
        System.out.println(b1.apply("Hello", "World"));
        System.out.println(b2.apply("Zb1 ", "and2ble"));
        System.out.println(u1.apply("Hello"));

        String result = "Hello".transform(u1);
        System.out.println("Result= "+result);

        Supplier<PlainOld> ref1= PlainOld::new;
        PlainOld newPojo = ref1.get();

        System.out.println("Getting array");
        PlainOld[] pojo =seedArr(PlainOld::new,10);


    }

    private static <T> void calculator(BinaryOperator<T> function, T val1, T val2){
        T result = function.apply(val1,val2);
        System.out.println("Result of operation: "+result);
    }

    private static PlainOld[] seedArr(Supplier<PlainOld> ref, int count){
        PlainOld[] arr= new PlainOld[count];
        Arrays.setAll(arr,i->ref.get());
        return arr;
    }
}
