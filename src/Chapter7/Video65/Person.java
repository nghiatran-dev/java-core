package Chapter7.Video65;

public class Person {
    String name;
    int age;

    public Person(String _name, int _age) {
        this.name = _name;
        this.age = _age;
    }

    public void showInfo() {
        System.out.println("Person: " +  this.name + " - " + this.age);
    }
}
