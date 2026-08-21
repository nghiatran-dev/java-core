package Chapter6.Video55;

public class Student {
    String name;
    int age;

//    Nếu chúng ta ko khai báo bất cứ hàm tạo nào thì java sẽ tự động tạo 1 hàm contructor rỗng như bên dưới.
//    public Student() {}

    public Student(String _name, int _age) {
        this.name = _name;
        this.age = _age;
    }

    void learnJava() {
        System.out.println("Learn Java !!!");
    }
}
