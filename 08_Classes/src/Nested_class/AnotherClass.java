package Nested_class;

public class AnotherClass extends OuterClass.InnerClass2{
    public AnotherClass(OuterClass outer) {
        outer.super();   // Calls Inner's constructor
    }

    @Override
    public void prints() {
        super.prints();
    }
}
