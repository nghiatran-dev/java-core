package chapter3;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Nhập điểm (từ 0 - 10, nhập -1 để dừng)!");
        float score = 0, sum = 0, average = 0;
        int index = 0; // Dùng để biết điểm thứ bao nhiu

        Scanner scanner = new Scanner(System.in);
        do {
            index++;
            System.out.printf("Nhập điểm %s:", index);
            score = scanner.nextFloat();

            // Nếu nhập -1. Thoát.
            if (score == -1) {
                index--;
                break;
            }

            if (score < 0 || score > 10) {
                System.out.println("Điểm không hợp lệ. Nhập lại!");
                index--;
                continue;
            }

            // Nếu điểm hợp lệ thì cộng dồn vào sum
            sum += score;
        } while(score != -1); // Chỉ lặp khi điểm nhập vào != -1

        // Tính điểm trung bình
        average = (float) sum/index;

        System.out.println("==========MENU==========");
        System.out.println("1. Tính điểm trung bình");
        System.out.println("2. Phân loại học lực");
        System.out.println("3. Thoát chương trình");
        System.out.println("========================");

        System.out.print("Nhập lựa chọn: ");
        int option = scanner.nextInt();
        System.out.println(); // Tạo cái xuống dòng
        scanner.close();

        switch (option) {
            case 1:
                System.out.printf("Điểm trung bình: %.2f", average);
                break;
            case 2:
                if (average >= 9 && average <= 10) {
                    System.out.printf("Học lực xuất sắc - Điểm TB: %.2f", average);
                } else if (average >= 8 && average < 9) {
                    System.out.printf("Học lực giỏi - Điểm TB: %.2f", average);
                } else if (average >= 6.5 && average < 8) {
                    System.out.printf("Học lực khá - Điểm TB: %.2f", average);
                } else if (average >= 5 && average < 6.5) {
                    System.out.printf("Học lực trung bình - Điểm TB: %.2f", average);
                } else {
                    System.out.printf("Học lực yếu - Điểm TB: %.2f", average);
                }
                break;
            default:
                break;
        }
    }
}
