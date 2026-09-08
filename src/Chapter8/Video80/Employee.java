package Chapter8.Video80;

public abstract class Employee {
    private String name;
    private String department;

    public Employee(String _name, String _department) {
        this.name = _name;
        this.department = _department;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String _department) {
        this.department = _department;
    }

    public abstract double calculateSalary();

    public void printInfo() {
        System.out.printf("- Name: %s | Department: %s", this.name, this.department);
    }
}
