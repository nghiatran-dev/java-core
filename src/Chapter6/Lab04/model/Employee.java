package Chapter6.Lab04.model;

public class Employee {
    private String name;
    private int age;
    private String company;
    private String department;
    private double salary;

    public Employee(String _name, int _age, String _department, double _salary) {
        this.name = _name;
        this.age = _age;
        this.company = "Smilegate";
        this.department = _department;
        this.salary = _salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int _age) {
        this.age = _age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String _company) {
        this.company = _company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String _department) {
        this.department = _department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double _salary) {
        this.salary = _salary;
    }

    public void showInfo() {
        System.out.println("- Name: " + this.getName());
        System.out.println("- Age: " + this.age);
        System.out.println("- Company: " + this.company);
        System.out.println("- Department: " + this.department);
        System.out.printf("- Slary: %.2f\n", this.salary);
    }

    public void raiseSalary(double amount) {
        double newSalary = this.getSalary();
        if (amount > 0) {
            newSalary = newSalary * 1.15;
        }
        this.setSalary(newSalary);
    }
}
