package Chapter7.Lab05;

public class Person {
    private String name;
    private int age;

    public Person(String _name, int _age) {
        this.name = _name;
        this.age = _age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.printf("- Name: %s\n", this.getName());
        System.out.printf("- Age: %d\n", this.getAge());
    }
}
