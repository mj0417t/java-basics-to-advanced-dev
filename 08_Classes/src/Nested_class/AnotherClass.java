package Nested_class;

public class AnotherClass extends OuterClass.InnerClass2{
    AnotherClass(OuterClass outer) {
        outer.super();   // Calls Inner's constructor
    }
}
