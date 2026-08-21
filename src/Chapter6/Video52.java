package Chapter6;

public class Video52 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.age = 2;
        student1.name = "VOI";

        System.out.println("Info Student 1: " + student1.name + " - " + student1.age);
        student1.learnJava();

        Student student2 = new Student();
        student2.age = 33;
        student2.name = "VICTOR";
        System.out.println("Info Student 2: " + student2.name + " - " + student2.age);
    }
}
