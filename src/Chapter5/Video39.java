package Chapter5;

public class Video39 {
    public static void main(String[] args) {
        int[] a = new int[5]; // Khởi tạo mảng rỗng có chiều dài 5 phần tử
        int[] scores = {10, 3, 5, 7, 9};

        System.out.println("Chiều dài array [scores]: " + scores.length);
        System.out.println("Phần tử đầu tiên [scores]: " + scores[0]);
        System.out.println("Phần tử ở giữa [scores]: " + scores[scores.length/2]);
        System.out.println("Phần tử cuối cùng [scores]: " + scores[scores.length - 1]);

        System.out.println("--------------------------");

        String[] names = {"Victor", "Voi", "Phuong", "..."};
        System.out.println("Chiều dài array [names]: " + names.length);
        System.out.println("Phần tử đầu tiên [names]: " + names[0]);
        System.out.println("Phần tử cuối cùng [names]: " + names[names.length - 1]);

        for (int i = 0; i < names.length; i ++) {
            if (i == 0) System.out.print("Các phần tử trong array [names]: {");
            if (i == names.length - 1) {
                System.out.printf("%s} ", names[i]);
            } else {
                System.out.printf("%s, ", names[i]);
            }
        }
    }
}
