package example_default_method_in_interface;

public class Sparrow implements Bird{
    @Override
    public void canFly(){
        System.out.println("Sparrow can fly");
    }

    @Override
    public boolean canWalk() {
        return false;
    }
}
