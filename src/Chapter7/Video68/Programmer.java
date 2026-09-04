package Chapter7.Video68;

public class Programmer extends Employee {

    public Programmer(String _name, int _id, double _salary) {
        super(_name, _id, _salary);
    }

    // Since the calculateSalary() function is not declared here,
    // it will default to using the calculateSalary() function in the parent class.
}
