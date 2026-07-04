package Abstract_class;

public abstract class Car {
    int mileage;
    public Car(int mileage){
        this.mileage=mileage;
    }
    public abstract void pressBrake(); //abstract meth
    public abstract void pressClutch(); //abstract meth
    public int getNumOfWheels(){ //non abstract meth
        return 4;
    }
}
