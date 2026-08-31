package Chapter6.Video57;

public class Student {
    String name;
    String id;

    public Student(String _name, String _id) {
        this.name = _name;
        this.id = _id;
    }

    void displayInfo() {
        System.out.println("* NAME: " + this.name + " -- ID: " + this.id);
    }
}
