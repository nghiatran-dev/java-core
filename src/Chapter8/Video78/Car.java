package Chapter8.Video78;

public class Car extends Vehicle {
    public Car(String _brand) {
        super(_brand);
    }

    @Override
    public void start() {
        System.out.println("Car [" + super.getBrand() + "] is starting with key...");
    }
}
