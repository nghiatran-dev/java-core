package Chapter8.Video78;

public class Vehicle {
    private String brand;

    public Vehicle(String _brand) {
        this.brand = _brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Vehicle start...");
    }
}
