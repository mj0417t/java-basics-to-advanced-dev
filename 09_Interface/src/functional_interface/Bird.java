package functional_interface;

@FunctionalInterface
public interface Bird {
    void canFly();
    default void getHeight(){

    }
    static void canEat(){

    }
    String toString(); //Object class method
}
