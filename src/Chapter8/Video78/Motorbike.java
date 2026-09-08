package Chapter8.Video78;

public class Motorbike extends Vehicle {
    public Motorbike(String _brand) {
        super(_brand);
    }

    @Override
    public void start() {
        System.out.println("Motorbike [" + super.getBrand() + "] is kick-starting...");
    }
}
