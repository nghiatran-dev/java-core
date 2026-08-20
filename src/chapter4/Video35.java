package chapter4;

public class Video35 {
    public static void main(String[] args) {
        // Bài 1: Tìm số đầu tiên chia hết cho 7 trong khoảng từ 1 đến 100 (dùng for và break)
        int findIndex = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) findIndex++;

            if (findIndex == 3) {
                System.out.println("Số thứ 3 chia hết cho 7: i = " + i );
                break;
            }
        }

        // Bài 2: In ra các số từ 1 đê 10, bỏ qua số lẻ(dùng continue)
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
    }
}