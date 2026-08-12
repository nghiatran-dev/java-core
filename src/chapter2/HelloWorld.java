package chapter2;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Please input your info!");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		System.out.println("Thanks! Welcome...");
		System.out.println("- Mr/Ms: " + name);
		System.out.println("- Age: " + age + " years old");
	}

}
