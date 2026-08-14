package chapter3;

import java.util.Scanner;

public class Lab1Exercise3 {
    public static void main(String[] args) {
        System.out.println("*** Lab 01 - Exercise 03 ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("- Nhap vao canh cua khoi lap phuong: ");
        float side = scanner.nextFloat();
        scanner.close(); // Tối ưu hóa hiệu năng

        System.out.println("****************************");
        System.out.printf("- The tich: %.2fm%n", Math.pow(side, 3));
    }
}
