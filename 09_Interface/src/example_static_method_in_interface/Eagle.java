package example_static_method_in_interface;

public class Eagle implements Bird{
    public boolean canBreath(){
        return true;
    }
    public void digTest(){
        if(Bird.canBreath()){
            System.out.println("interface_basic.Eagle can Breath");
        }
    }
}
