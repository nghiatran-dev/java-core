package Chapter7.Lab05;

public class Manager extends Employee {
    private String department;

    public Manager(String _department, String _name, int _age, int _employeeId, int _salary) {
        super(_name, _age, _employeeId, _salary);
        this.department = _department;
    }


    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("- Department: %s\n", this.department);
    }
}
