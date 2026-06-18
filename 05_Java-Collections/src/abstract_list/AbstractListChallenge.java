package abstract_list;

import java.util.AbstractList;
import java.util.ArrayList;

public class AbstractListChallenge {
    public static void main(String[] args) {
        AbstractList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("pineapple");
        list.add("oranges");
        list.add("peers");

        System.out.println("AbstractList: "+list);
    }
}
