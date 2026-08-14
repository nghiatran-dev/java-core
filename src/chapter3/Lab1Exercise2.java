package chapter3;

import java.util.Scanner;

public class Lab1Exercise2 {
    public static void main(String[] args) {
        System.out.println("*** Lab 01 - Exercise 02 ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("- Nhap chieu dai: ");
        float side1 = scanner.nextFloat();
        System.out.print("- Nhap chieu rong: ");
        float side2 = scanner.nextFloat();
        scanner.close(); // Tối ưu hóa hiệu năng

        System.out.println("****************************");

        float chuVi = (side1 + side2) * 2;
        float dienTich = side1 * side2;
        float min = Math.min(side1, side2);
        System.out.printf("- Chu vi hinh chu nhat: %.2fm%n", chuVi);
        System.out.printf("- Dien tich hinh chu nhat: %.2fm%n", dienTich);
        System.out.printf("- Canh nho nhat: %.2fm", min);
    }
}
