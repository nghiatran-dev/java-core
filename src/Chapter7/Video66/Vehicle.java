package Chapter7.Video66;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String _brand, int _year) {
        this.brand = _brand;
        this.year = _year;
        System.out.println("1. Run constructor from Vehicle.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo() {
        System.out.printf("Vehicle: %s, %d\n", this.getBrand(), this.getYear());
    }
}
