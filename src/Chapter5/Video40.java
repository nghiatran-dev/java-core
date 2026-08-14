package Chapter5;

import java.util.Scanner;

public class Video40 {
    public static void main(String[] args) {
        System.out.println("Viết chương trình Java nhập 5 số nguyên từ bàn phím");
        System.out.println("Lưu các số này vào mảng 1 chiều");
        System.out.println("Tính tổng các phần tử trong mảng");
        System.out.println("Tìm ra số lớn nhất trong mảng");
        System.out.println("****************************************************");

        int[] listNumber = new int[5];
        int sum = 0;
        int max = 0;
        String listNumberShow = "["; // Dùng để show ra các giá trị của mảng
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int inputValue = 0;
        do {
            System.out.printf("Nhập số thứ %s: ", i + 1);
            inputValue = sc.nextInt();
            listNumber[i] = inputValue; // Lưu từng số vừa nhập vào mảng

            sum += inputValue; // Tính tổng ngay khi vừa nhập
            // Tìm số lớn nhất
            if (inputValue > max) {
                max = inputValue;
            }
            i++;
        } while(i < listNumber.length);

        sc.close();

        System.out.println("****************************************************");
        System.out.println("Tổng các số là: " + sum);
        System.out.println("Số lớn nhất là: " + max);
    }
}
