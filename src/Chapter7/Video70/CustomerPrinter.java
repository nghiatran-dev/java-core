package Chapter7.Video70;

public class CustomerPrinter {
    public void print(String name) {
        System.out.printf("* print(String name): %s\n", name);
    }

    public void print(String name, int age) {
        System.out.printf("* print(String name, int age): %s and %d\n", name, age);
    }

    public void print(String name, int age, String city) {
        System.out.printf("* print(String name, int age, String city): %s and %d and %s\n", name, age, city);
    }
}
