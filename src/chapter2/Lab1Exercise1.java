package chapter2;

import java.util.Scanner;

public class Lab1Exercise1 {
    public static void main(String[] args) {
        System.out.println("*** Lab 01 - Exercise 01 ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("- Average score: ");
        float averageScore = scanner.nextFloat();

        // Ngoại trừ String thì những loại khác nó ko hiểu ký tự xuống dòng.
        scanner.nextLine();

        System.out.print("- Student name: ");
        String name = scanner.nextLine();
        scanner.close(); // Tối ưu hóa hiệu năng

        System.out.println("=== Student Info ===");
        System.out.println("* Name: " + name);
        System.out.printf("* Average score: %.2f", averageScore);
    }
}
