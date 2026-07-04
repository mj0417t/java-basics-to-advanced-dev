package Nested_class;

public class OuterClass {
    int instanceVar=10;
    static int classVar=20;

    public static class NestedClass{
        public void prints(){
            System.out.println("Inside Static Nested Class: "+classVar);
        }
    }

    private static class PrivNestClass{
        public void prints(){
            System.out.println("Inside private Static Nested Class: "+classVar);
        }
    }

    //member inner class
    public class InnerClass{
        int innerClass1=3;
        public void prints(){
            System.out.println("Inside  Inner Class: "+classVar+instanceVar);
        }
    }

    public class InnerClass2 extends InnerClass{
        int innerClass2=4;
        @Override
        public void prints(){
            System.out.println("Inside  Inner Class: "+classVar+instanceVar+(innerClass1+innerClass2));
        }
    }

    //local innerclass

    public void  display(){
        PrivNestClass privNestClass = new PrivNestClass();
        privNestClass.prints();
    }

    public void displayLocalInnClass(){
        int methodLocalVar=3;
        class LocalInnerClass{
            int localInnerVar=4;
            public void print(){
                System.out.println("Inside  Local Inner Class: "+classVar+instanceVar+localInnerVar+methodLocalVar);
            }
        }

        LocalInnerClass localInnerObj =new LocalInnerClass();
        localInnerObj.print();
    }
}
