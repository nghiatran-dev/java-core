package Chapter6.Video54;

public class Employee {
    String name;
    int salaray;

    void showInfo() {
        System.out.println("Employee name: " + this.name);
        System.out.printf("Salaray: %sVND\n", this.salaray);
    }
}
