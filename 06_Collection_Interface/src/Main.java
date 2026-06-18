import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Student{
    int age;
    String name;
    @Override
    public String toString(){
        return "Student[age=" +age+", name="+name+"]";
    }

    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<Integer>();
        nums.add(6);
        nums.add(8);
        nums.add(2);
        nums.add(1);

        for (int n:nums) {
            System.out.println(n);
        }

//        Set<Integer> set= new HashSet<Integer>();
        Set<Integer> set= new TreeSet<Integer>();

        set.add(3);
        set.add(1);
        set.add(11);
        set.add(0);
        System.out.println(set);

        Map<String,Integer> students= new HashMap<>();
        students.put("gavin",11);
        students.put("kolf",56);
        students.put("fsfds",89);
        students.put("dsdfgfggh",123);

        System.out.println(students);
        System.out.println(students.get("gavin"));
        System.out.println(students.keySet());

        for (String key: students.keySet())
            System.out.println(key+"; "+students.get(key));

//        Collections.sort(nums);
        Comparator<Integer> xom=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 >j%10)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(nums, xom);
        System.out.println(nums);

        List<String >names =new ArrayList<String >();
        names.add("adamas");
        names.add("lolita");
        names.add("romali");
        names.add("dyna");
        names.add("ferari");
        Collections.sort(names,(a,b)->{
            if(a.charAt(0)>b.charAt(0))
                return 1;
            else if (a.charAt(0)==b.charAt(0)) {
                return 0;
            } else return -1;
        });
        System.out.println(names);

        List<Student> st= new ArrayList<>();
        st.add(new Student("Azad",21));
        st.add(new Student("Rahim",12));
        st.add(new Student("Sohan",25));
        st.add(new Student("Ruhan",27));

        for (Student s: st)
            System.out.println(s);
        Collections.sort(st,(a,b)->{
            if(a.age>b.age)
                return 1;
            else return -1;
        });

        for (Student s: st)
            System.out.println(s);
    }
}