package chapter4;

import java.util.Scanner;

public class Video33 {
    public static void main(String[] args) {
        // Bài 1: Tính tổng từ 1 đến 100 (dùng for)
        // int sum = 0;
        // for (int i = 1; i <= 100; i++) {
        //     sum += i;
        // }

        // System.out.println("------------ Bài 1: ------------");
        // System.out.println("Tổng từ 1 đến 100 là: " + sum);

        // Bài 2: In ra các số chẵn từ 1 đến 20 (dùng while)
        // System.out.println("------------ Bài 2: ------------");
        // int i = 1;
        // while (i <= 20) {
        //     if (i % 2 == 0) {
        //         System.out.println("Số chẵn: " + i);
        //     }
        //     i++;
        // }

        // Bài 3:
        String samplePassword = "123456";
        Scanner scanner = new Scanner(System.in);
        String password = "";
        System.out.println("------------ Bài 3: ------------");
        do {
            System.out.println("Vui long nhap mat khau: ");
            password = scanner.nextLine();

            if (!password.equals(samplePassword)) {
                System.out.println("Sai mat khau. Vui long nhap lai.");
            }
        } while (!password.equals(samplePassword));
        
        System.out.println("Dang nhap thanh cong!");
        scanner.close();
    }
}
