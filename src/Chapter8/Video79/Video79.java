package Chapter8.Video79;

public class Video79 {
    public static void main(String[] args) {
        System.out.println("Video 79: Abstract Class");
        // You cannot instantiate an abstract class.
//        Animal animal = new Animal()

        Animal animal2 = new Dog();
        animal2.makeSound();
        animal2.doSomethingOnParent();
    }
}
