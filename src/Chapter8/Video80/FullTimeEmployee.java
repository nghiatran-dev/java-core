package Chapter8.Video80;

public class FullTimeEmployee extends Employee {
    double monthlySalary;
    public FullTimeEmployee(String _name, String _department, double _monthlySalary) {
        super(_name, _department);
        this.monthlySalary = _monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return this.monthlySalary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" | Type: Full-time");
    }
}
