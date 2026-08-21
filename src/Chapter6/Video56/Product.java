package Chapter6.Video56;

public class Product {
    String name;
    double price;

    public Product(String _name, double _price) {
        this.name = _name;
        this.price = _price;
    }

    void display() {
        System.out.println("Product name's: " + this.name);
        System.out.printf("Product price: %.2fVND\n", this.price);
    }
}
