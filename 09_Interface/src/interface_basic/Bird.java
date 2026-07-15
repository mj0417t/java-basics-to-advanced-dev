package interface_basic;

public interface Bird {
    public void fly();
    public interface NonFlyingBirds{
        public void canRun();
        default int getMinFlyheight(){
            return 100;
        }
    }
}
