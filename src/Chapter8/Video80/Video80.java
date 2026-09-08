package Chapter8.Video80;

public class Video80 {
    public static void main(String[] args) {
        System.out.println("=== Video 80: Abstract Class Exercises ===");
        FullTimeEmployee nv1 = new FullTimeEmployee("Victor", "IT", 3000);
        PartTimeEmployee nv2 = new PartTimeEmployee("Voi", "Sale", 40, 25);
        Employee[] employees = {nv1, nv2};

        for (Employee employee: employees) {
            employee.printInfo();
            System.out.printf("- Salary: %.2f\n", employee.calculateSalary());
            System.out.println();
        }
    }
}
