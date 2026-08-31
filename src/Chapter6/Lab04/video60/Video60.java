package Chapter6.Lab04.video60;

import Chapter6.Lab04.model.Employee;

public class Video60 {
    public static void main(String[] args) {

        Employee nv1 = new Employee("hoidanit", 25, "Sales", 8000);
        Employee nv2 = new Employee("Victor", 30, "IT", 10000);
        nv2.setCompany("Vietjet Air");

        System.out.println("== BEFORE RAISE ==");
        nv1.showInfo();
        System.out.println("-------------------------");
        nv2.showInfo();

        nv1.raiseSalary(2);
        nv2.raiseSalary(3);

        System.out.println("== AFTER RAISE ==");
        nv1.showInfo();
        System.out.println("-------------------------");
        nv2.showInfo();
    }
}
