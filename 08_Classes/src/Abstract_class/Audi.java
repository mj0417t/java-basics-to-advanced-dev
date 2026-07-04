package Abstract_class;

public class Audi extends LuxuryCar{
    public Audi(int mileage) {
        super(mileage);
    }

    @Override
    public void pressDualBrakeSystem() {
        System.out.println("Pressing Dual Brake System in Audi");
    }

    @Override
    public void pressClutch() {
        System.out.println("Pressing Clutch in Audi");
    }
}
