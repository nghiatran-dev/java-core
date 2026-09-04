package Chapter7.Video68;

public class Manager extends Employee {
    private String department;

    public Manager(String _department, String _name, int _id, double _salary) {
        super(_name, _id, _salary);
        this.department = _department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public double calculateSalary() {
        // C1:
//        return this.getSalary() * 1.1;
        // C2:
        return super.calculateSalary() * 1.1;
    }
}
