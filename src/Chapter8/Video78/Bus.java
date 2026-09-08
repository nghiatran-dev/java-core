package Chapter8.Video78;

public class Bus extends Vehicle {
    public Bus(String _brand) {
        super(_brand);
    }

    @Override
    public void start() {
        System.out.println("Bus [" + super.getBrand() + "] is starting with air brakes...");
    }
}
