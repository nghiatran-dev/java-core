package Chapter8.Video76;

public class Video76 {
	public static void main(String[] args) {
		// up-casting
		Animal animal = new Dog();
		animal.makeSound();

        // down-casting
        Dog dog = (Dog) animal;
        dog.wagTail();
	}
}
