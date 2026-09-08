package Chapter9.Video90;

import java.util.Scanner;

public class Video90 {
    public static void main(String[] args) {
        System.out.println("=== Video 90: Exercises on Enums ===");
        boolean isInvalid = false;
        Scanner sc = new Scanner(System.in);
        while (!isInvalid) {
            System.out.print("Nhập vào trạng thái đơn hàng: ");
            String statusInput = sc.nextLine().toUpperCase();
            try {
                OrderStatus status = OrderStatus.valueOf(statusInput);
                System.out.printf("Trạng thái: %s\n", status.getDescription());
                System.out.printf("Trạng thái cuối cùng: [%b]\n", status.hasFinal());
                isInvalid = true;
            } catch (Exception e) {
                System.out.println("Trạng thái không hợp lệ!");
            }
        };

        sc.close();
    }
}
