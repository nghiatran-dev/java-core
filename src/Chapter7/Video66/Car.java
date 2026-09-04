package Chapter7.Video66;

public class Car extends Vehicle {
    public String type;

    public Car(String _type, String _brand, int _year) {
        super(_brand, _year);
        this.type = _type;
        System.out.println("2. Run constructor from Car.");
    }

    public String getType() {
        return this.type;
    }

    public void setType(String _type) {
        this.type = _type;
    }

    public void printInfo() {
        System.out.println("==========");
        super.printInfo();
        System.out.printf("Type: %s\n", this.getType());
    }
}
