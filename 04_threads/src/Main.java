//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Counter{
    int count;
//    public void increment(){
    public synchronized void increment(){  //to make it thread safe- i.e. one thread can access at a time
        count++;
//        System.out.println(count);
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
//        A ob1= new A();
//        B ob2 = new B();
//        Runnable ob1= new A();
//        Runnable ob2 = new B();
//        System.out.println(ob1.getPriority());
//        ob2.setPriority(Thread.MAX_PRIORITY);

        Runnable ob3 =new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
//                    System.out.println("Java");
                    c.increment();
                }

            }
        };
        Runnable ob4 =()->{
            for (int i = 0; i <1000 ; i++) {
//                System.out.println("Relusko");
                c.increment();
            }

        };
//        Thread t1= new Thread(ob1);
//        Thread t2= new Thread(ob2);
        Thread t3=new Thread(ob3);
        Thread t4 = new Thread(ob4);
//        t1.start();
//        t2.start();
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println(c.count);
    }
}