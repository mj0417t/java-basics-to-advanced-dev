package example_default_method_in_interface;

public class Eagle implements Bird{
    @Override
    public void canFly() {
        System.out.println("interface_basic.Eagle can Fly");
    }

    @Override
    public boolean canWalk() {
        return false;
    }
}
