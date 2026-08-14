package Chapter5;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        String inputName = "";
        double inputScore = 0, sum = 0;

        String[] listStudent = new String[3];
        double[] listScore = new double[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< listStudent.length; i++) {
            System.out.printf("Nhập tên học sinh %s: ", (i + 1));
            inputName = sc.nextLine();
            // Thêm học sinh vào listStudent
            listStudent[i] = inputName;

            System.out.printf("Nhập điểm học sinh %s: ", (i + 1));
            inputScore = sc.nextDouble();
            // Thêm điểm  vào listScore
            listScore[i] = inputScore;
            // Cộng dồn điểm
            sum += inputScore;

            // Fix dấu enter sau khi nhập điểm
            sc.nextLine();
        }
        sc.close();

        System.out.println("===========================");
        System.out.println("Danh sách học sinh");
        for (int j = 0; j < listStudent.length; j++) {
            System.out.println("- HS" + (j + 1) + ": " + listStudent[j] + " - " + listScore[j]);
        }

        System.out.printf("Điểm trung bình: %.2f", sum/listStudent.length);
        System.out.println();

        System.out.println("Danh sách hóc sinh có điểm >8:");
        for (int k = 0; k < listScore.length; k++) {
            if (listScore[k] >= 8) {
                System.out.println("- " + listStudent[k] + " => Điểm: " + listScore[k]);
            }
        }
    }
}
