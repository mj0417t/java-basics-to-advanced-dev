package vector;

import java.util.*;

public class VectorChallenge {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Rosa");
        vector.add("Shoren");
        vector.add("Viren");
        System.out.println(vector);

        Vector<String> v= new Vector<>(3,5);
        v.add("res");
        v.add("pes");
        v.add("mes");
        System.out.println("capacity: "+ v.capacity()+" Vector:"+v);
        v.add("jess");
        System.out.println("capacity: "+ v.capacity()+" Vector:"+v);

//        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Vector<Integer> numbers = new Vector<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println("capacity: "+ numbers.capacity()+" Numbers:"+numbers);

        ArrayList<String> al = new ArrayList<>();
//        List l1 = Collections.synchronizedList(al);
        al.add("www.geeksforgeeks.com");
        al.add("www.codechef.org");
        al.add("www.leetcode.com");
        al.add("www.unicef.org");

        //traversing using iterator
        System.out.println("ArrayList elements are: ");
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Vector<String> sports = new Vector<>();
        sports.add("Soccer");
        sports.add("Tennis");
        sports.add("Cricket");
        sports.add("Baseball");

        //traversing using Enumerator
        System.out.println("Vector elements are: ");
        Enumeration e= sports.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


        //Methods in vector class

        Vector<String> names = new Vector<>();
        names.add("Reya");
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        names.add(1,"Suman");
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        names.addAll(Arrays.asList("rohan", "priya", "lila"));
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        names.addAll(3,List.of("gargi","solanki"));
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        names.addElement("Rohna");
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
//        names.clear();

        v=(Vector<String>) names.clone();
        System.out.println("V:" +v+"    Capacity:" +v.capacity() +"   Size="+v.size());
        if(v.containsAll(names))
            System.out.println(true);
        else System.out.println(false);
        String[] arr=new String[v.size()];
        v.copyInto(arr);
        System.out.println("Arr: "+Arrays.toString(arr));
        v.ensureCapacity(15);
        System.out.println("v:" +v+"    Capacity:" +v.capacity() +"   Size="+v.size());
        if(v.equals(names))
            System.out.println(v);
        System.out.println(v.firstElement());

        System.out.println("List of names:");
        names.forEach(str->{
            System.out.println(str.charAt(0) + " stands for "+str.toUpperCase());
        });

        System.out.println(sports.get(3));
        System.out.println("hascode=" +v.hashCode());
        System.out.println(sports.indexOf("Soccer"));
        System.out.println(v.indexOf("gargi"));
        System.out.println(v.indexOf("gargi",5));
        v.insertElementAt("Gargi",5);
        if(!v.isEmpty())
            System.out.println("V is not empty");

        Iterator vit =v.iterator();
        while (vit.hasNext()){
            System.out.print (vit.next()+", ");
            vit.remove();
        }
        System.out.println();
        System.out.println(v);
        if(v.isEmpty())
            v.add("musarrat");
        System.out.println(v.lastElement());

        System.out.println(names.lastIndexOf("gargi",4));

        //List iterator

//        ListIterator<String > listItr = names.listIterator();
        ListIterator<String > listItr = names.listIterator(5);

        //forward iterations
        System.out.println("Forward Traversal:");
        while (listItr.hasNext())
            System.out.print(listItr.next()+", ");
        System.out.println();
//        names.add("fd");
        //backward iterations
        System.out.println("Backward Traversal:");
        while (listItr.hasPrevious())
            System.out.print(listItr.previous()+", ");
        System.out.println();
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        names.remove("gargi");
        names.remove(4);
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        v.add("rohan");
        v.add("solanki");
        names.removeAll(v);
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        names.add("Reya");
        names.removeElement("Reya");
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        names.removeElementAt(3);
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        names.removeIf(str->(str.charAt(0)=='R'));
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        names.add("fdrwerw");
        names.replaceAll(String::toUpperCase);
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Names:" +names+"    Capacity:" +names.capacity() +"   Size="+names.size());


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(123,"Rohail Suhag", "London"));
        students.add(new Student(132,"Rupal Tyagi", "India"));
        students.add(new Student(111,"Anjana Kashyap", "Germany"));

        System.out.println("Unsorted:");
        for(int i=0;i<students.size();i++)
            System.out.println(students.get(i));
    Collections.sort(students, new SortByRoll());
        System.out.println("Sorted by rollno:");
        for(int i=0;i<students.size();i++)
            System.out.println(students.get(i));

        String[] geeks ={"Python","C++","Ruby on Rails","Java","Javascript"};
        List progLang = new ArrayList(Arrays.asList(geeks));
        Collections.sort(progLang);

        System.out.println("List after the use of Collection.sorts(): \n"+progLang);
        Vector<String> programming_language = new Vector<>(progLang);

        List<String> sublist = new ArrayList<>();
        sublist=programming_language.subList(1,3);
        System.out.println("The resultant values within sublist: "+sublist);
    }
    }

class Student{
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address){
        this.rollno=rollno;
        this.address=address;
        this.name=name;
    }

    public String toString(){
        return this.rollno+" "+this.name+" "+this.address;
    }
}

class SortByRoll implements Comparator<Student>{

    @Override
    public int compare(Student a, Student b) {
        return a.rollno-b.rollno;
    }
}
