package Chapter6.Video59;

public class Student {
    String name;
    String grade;

    public Student(String _name, String _grade) {
        this.name = _name;
        this.grade = _grade;
    }

    //getter
    public String getName() {
        return this.name;
    }

    // setter
    public void setName(String _name) {
        this.name = _name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
