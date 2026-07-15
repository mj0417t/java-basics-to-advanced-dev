package interface_basic;

public class Hen implements Bird.NonFlyingBirds{


    @Override
    public void canRun() {
        System.out.println("interface_basic.Hen cna Run");
    }
}
