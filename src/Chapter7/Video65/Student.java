package Chapter7.Video65;

public class Student extends Person {
    String school;

    public Student(String _school, String _name, int _age) {
        super(_name, _age);
        this.school = _school;
    }

    public void showInfo() {
        System.out.printf("Student of %s\n", this.school);
    }

    public void testSuper() {
        // call the showInfo() method of the Student class
        this.showInfo();

        // Call the showInfo() method of the Person class (parent).
        // Use `super` only when the parent and child classes have functions with the same name.
        super.showInfo();
    }
}
