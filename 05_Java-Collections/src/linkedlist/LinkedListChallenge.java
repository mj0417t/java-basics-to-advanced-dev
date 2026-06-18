package linkedlist;

import java.util.*;

class Human{
    int age;
    String name;

    public Human(int age, String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString(){
        return "Name: "+ name+", Age: "+age;
    }
}

public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("pineapple");
        fruits.add("guava");
        System.out.println(fruits);
        //new collection
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("oranges");
        arrayList.add("banana");
        arrayList.add("kiwi");

        fruits.clear();
        System.out.println("Fruits:" +fruits);
        //adding collection elem
        fruits.addAll(arrayList);
        fruits.addFirst("lemon");
        System.out.println("Fruits:" +fruits);

        //adding elements
        fruits.add(2,"avocado");
        System.out.println(fruits);
        fruits.set(3,"bananas");
        System.out.println(fruits);
        fruits.add("kiwi");
        fruits.add("oranges");
        fruits.add("bananas");
        System.out.println(fruits);
        fruits.remove("bananas");
        System.out.println(fruits);
        fruits.remove(3);
        System.out.println(fruits);

        //checking clone();
        LinkedList fruits2 = new LinkedList<>();
        fruits2=(LinkedList)fruits.clone();
        System.out.println("Fruits1:"+fruits);
        System.out.println("Fruits2:"+fruits2);
        fruits2.add("Stawberry");
        System.out.println("Fruits1:"+fruits);
        System.out.println("Fruits2:"+fruits2);
        fruits2.set(2,"rosemarry");
        System.out.println("Fruits1:"+fruits);
        System.out.println("Fruits2:"+fruits2);


        System.out.println("Fruits Original Order: "+fruits);
        Iterator<String> it = fruits.descendingIterator();
        System.out.println("Fruits in reverse Order: ");
        while (it.hasNext())
            System.out.print(it.next()+" ");


        //LL using Obje

        LinkedList<Human> humans = new LinkedList<>();
        humans.add(new Human(21, "Rohan"));
        humans.add(new Human(19, "Sheeksha"));
        humans.add(new Human(23, "Diksha"));
        humans.add(new Human(14, "Samartha"));
        humans.add(new Human(17, "Lolita"));

        Iterator<Human> humanIterator = humans.listIterator();
        System.out.println("\nHumans in reverse Order: ");
        while (humanIterator.hasNext())
            System.out.println(humanIterator.next());

        System.out.println(fruits.element());


        fruits.offer("peers");
        fruits.offerFirst("peers");
        fruits.offerLast("papaya");
        System.out.println("Fruits: "+fruits);

        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList priorityList = new LinkedList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        numbers.add(33);
        numbers.add(41);
        numbers.add(0);

        int thres=10;
        System.out.println("Initial LinkedList: "+ numbers);

        while (!numbers.isEmpty()){
            int t=numbers.poll();
            if(t>=thres)
               priorityList.offerFirst(t);
            else
                priorityList.offerLast(t);
        }
        System.out.println("Priority List: "+priorityList);

        // Create a list
        List<String> l = Arrays.asList("A", "B", "C", "D", "E");

        // Get the Spliterator
        Spliterator<String> s = l.spliterator();

        // Split the Spliterator
        Spliterator<String> n = s.trySplit();

        // Process the first part
        if (n != null) {
            System.out.println("First Spliterator:");
            n.forEachRemaining(System.out::println);
        }

        // Process the second part
        System.out.println("Second Spliterator:");
        s.forEachRemaining(System.out::println);


        //Movies

        LinkedList<String> movies = new LinkedList<>();
        movies.add("Avatar");
        movies.add("Silent Spring");
        movies.add("Harry Potter");
        movies.add("Sky is pink");
        movies.add("Fast & Furious");
        movies.add("Rory is Sorry");

        Spliterator<String> move= movies.spliterator();
        System.out.println("Movies:");

        move.forEachRemaining(
                mov-> System.out.println("Movie name: "+mov)
        );

        String [] arr = new String[movies.size()];
        movies.toArray(arr);
        System.out.println(Arrays.toString(arr));

        Object[] obj = movies.toArray();
        System.out.print(
                "After converted LinkedList to Array: ");
        for (Object i : obj)
            System.out.print(i + " ");
    }
}
