package Chapter7.Video68;

public class Video68 {
    public static void main(String[] args) {
        Manager boss = new Manager("FE", "Victor", 123, 10000);
        Programmer dev = new Programmer("Voi", 124, 8000);

        System.out.printf("Boss salary: %.2f\n", boss.calculateSalary());
        System.out.printf("Dev salary: %.2f\n", dev.calculateSalary());
    }
}
