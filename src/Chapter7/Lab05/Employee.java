package Chapter7.Lab05;

public class Employee extends Person {
    private int employeeId;
    private int salary;

    public Employee(String _name, int _age, int _employeeId, int _salary) {
        super(_name, _age);
        this.employeeId = _employeeId;
        this.salary = _salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("- Employee ID: %s\n", this.getEmployeeId());
        System.out.printf("- Salary: %d\n", this.getSalary());
    }

    public int calculateSalary() {
        return this.salary;
    }

    public int calculateSalary(int bonus) {
        return this.salary + bonus;
    }
}
