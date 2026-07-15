package example_default_method_in_interface;

public interface LivingThing {

    default boolean canBreath(){
        return true;
    }

    default boolean canWalk(){
        return true;
    }

    default boolean eatsToSurvive(){
        return true;
    }
}
