package chapter4;

public class Video34 {
    public static void main(String[] args) {
        // Break statement: Dùng để thoát khỏi vòng lặp hoặc switch case
        System.out.println("------------ Break statement: ------------");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Thoát khỏi vòng lặp khi i = " + i);
                break; // Thoát khỏi vòng lặp khi i = 5
            }
            System.out.println("i = " + i);
        }

        // Continue statement: Dùng để bỏ qua phần còn lại của vòng lặp hiện tại và tiếp tục với lần lặp tiếp theo
        System.out.println("------------ Continue statement: ------------");
        for (int j = 1; j <= 5; j++) {
            if (j == 5) {
                System.out.println("Bỏ qua khi j = " + j);
                continue; // Bỏ qua khi j = 5
            }
            System.out.println("j = " + j);
        }

        // TODO: Return statement: Dùng để thoát khỏi phương thức hiện tại và trả về giá trị (nếu có)
        // return;

        // Nested loops: Vòng lặp lồng nhau
        System.out.println("------------ Nested loops: ------------");
        for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 3; n++) {
                System.out.println("m = " + m + ", n = " + n);
            }
        }   
    }
}
