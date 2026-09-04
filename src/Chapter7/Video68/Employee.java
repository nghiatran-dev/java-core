package Chapter7.Video68;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String _name, int _id, double _salary) {
        this.name = _name;
        this.id = _id;
        this.salary = _salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }
}
