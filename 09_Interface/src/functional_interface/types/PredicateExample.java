package functional_interface.types;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<ArrayList<String>> isThereStudents = new Predicate<>() {
            @Override
            public boolean test(ArrayList list) {
                return !list.isEmpty();
            }
        };
        ArrayList<String> students = new ArrayList<>();
        System.out.println(isThereStudents.test(students));
        students.add("Roahn");
        System.out.println(isThereStudents.test(students));

        Predicate<Integer> isVotableAge = (age)->{
            return age >= 18;
        };

        System.out.println(isVotableAge.test(12));
        System.out.println(isVotableAge.test(21));
    }


}
