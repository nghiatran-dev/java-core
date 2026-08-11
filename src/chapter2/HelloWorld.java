package chapter2;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String myName = "Victor";
		String myJob = "Developer";
		String myAge = "33A";
		int[] scores = { 90, 85, 80 };
		System.out.println("My name: " + myName);
		System.out.println("My job: " + myJob);
		System.out.println("My age: " + Integer.valueOf(myAge));
		System.out.println("My scores: " + scores[0] + ", " + scores[1] + ", " + scores[2]);
	}

}
