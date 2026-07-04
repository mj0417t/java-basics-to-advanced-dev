package Abstract_class;

public abstract class LuxuryCar extends Car{
    public LuxuryCar(int mileage) {
        super(mileage);
    }
    public abstract void pressDualBrakeSystem();

    @Override
    public void pressBrake() {
        System.out.println("Pressing Brake in Luxury Car");
    }
}
