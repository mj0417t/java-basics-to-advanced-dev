package example_default_method_in_interface;

public interface Bird extends LivingThing{
    public void canFly();
    default int getMinimumFlyHeight(){
        return 100;
    }

    boolean canWalk();

    @Override
    default boolean eatsToSurvive() {
        boolean eatToWin= LivingThing.super.eatsToSurvive();
        System.out.println("Birds eat to survive");
        return eatToWin;
    }

}
