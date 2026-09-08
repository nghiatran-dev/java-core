package Chapter8.Lab06;

public abstract class Person {
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
        System.out.printf("My name is %s, I am %d years old.\n", this.name, this.age);
    }

    public abstract void work();
}
