package Chapter8.Video80;

public class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;
    public PartTimeEmployee(String _name, String _department, int _hoursWorked, double _hourlyRate) {
        super(_name, _department);
        this.hoursWorked = _hoursWorked;
        this.hourlyRate = _hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return this.hoursWorked * this.hourlyRate;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" | Type: Part-time");
    }
}
