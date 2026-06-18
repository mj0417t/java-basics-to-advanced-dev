import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,3,2);
        Consumer<Integer> con=new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println(o);
            }
        };
//        nums.forEach(System.out::println);
        nums.forEach(con);
        System.out.println(nums);

        Stream<Integer> s1=nums.stream();
//        s1.forEach(n-> System.out.println(n*2));
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3 =s2.map((n->n*2));
//        s2.forEach(System.out::println);
        s3.forEach(System.out::println);

        int res=nums.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);
        System.out.println(res);


//        parallel stream
        int size=10_000;
        List<Integer> numbers = new ArrayList<>(size);
        Random ran = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(ran.nextInt(1000));
        }
//        System.out.println(numbers);
//        int sum=numbers.stream()
//                .map(i->i*2)
//                .reduce(0,(c,e)->c+e);
//        System.out.println(sum);

//        long startSeq=System.currentTimeMillis();
//        int sum2=numbers.stream()
//                .map(i-> {
//                    try{
//                        Thread.sleep(1);
//                    }catch (Exception e){
//
//                    }
//                    return i * 2;
//                })
//                .mapToInt(i->i)
//                .sum();
//        long endSeq=System.currentTimeMillis();
//        System.out.println(sum2+"  Seq: "+(endSeq-startSeq));
//        long startSeq2=System.currentTimeMillis();
//        int sum3=numbers.parallelStream()
////                .map(i->i*2)
//                .map(i-> {
//                    try{
//                        Thread.sleep(1);
//                    }catch (Exception e){
//
//                    }
//                    return i * 2;
//                })
//                .mapToInt(i->i)
//                .sum();
//        long endSeq2=System.currentTimeMillis();
//        System.out.println(sum3+"  Seq: "+(endSeq2-startSeq2));

//        Optional class
        List<String> names = Arrays.asList("Rohan","Sonal","Rahin","Tuhin");
        Optional<String> name=names.stream()
                .filter(str->str.contains("o"))
                .findFirst();
        System.out.println(name);

        List<String> uNames = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(uNames);

        uNames.forEach(System.out::println);

        List<Teacher> teachers = new ArrayList<>();
//        for (String n:names){
//            teachers.add(new Teacher(n));
//        }

//        teachers=names.stream()
//                        .map(n->new Teacher(n))
//                                .toList();

        teachers=names.stream()
                        .map(Teacher::new)
                                .toList();
        System.out.println(teachers);
    }
}

class Teacher{
    private String name;
    private int age;

    public Teacher(){

    }

    public Teacher(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}