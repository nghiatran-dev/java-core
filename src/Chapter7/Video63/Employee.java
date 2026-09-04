package Chapter7.Video63;

public class Employee {
    public int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void showEmployeeName() {
        System.out.println("I am " + this.getName());
    }
}
