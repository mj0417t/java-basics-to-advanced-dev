package interface_basic;

public class Eagle implements Bird{
    @Override
    public void fly() {
        System.out.println("interface_basic.Eagle is a bird which flies");
    }
    protected interface Color{
        public void color();
    }
}
