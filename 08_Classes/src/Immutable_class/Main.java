package Immutable_class;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> petNames = new ArrayList<>();
        petNames.add("gazo");
        petNames.add("shanu");

        MyImmutableClass obj = new MyImmutableClass("YourName", petNames);
        obj.getPetNameList().add("rachu");
        System.out.println(obj.getPetNameList());
    }
}
