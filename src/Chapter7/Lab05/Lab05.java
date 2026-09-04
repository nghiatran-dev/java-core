package Chapter7.Lab05;

public class Lab05 {
    public static void main(String[] args) {
        Manager boss = new Manager("IT", "Victor", 33, 123, 100000000);
        boss.introduce();
        System.out.println("Base salary: " + boss.calculateSalary());
        System.out.println("Post-bonus salary: " + boss.calculateSalary(5000000));
    }
}
