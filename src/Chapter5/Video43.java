package Chapter5;

public class Video43 {
    public static void main(String[] args) {
        double[] scores = {8.5, 7.0, 9.0, 6.5, 8};
        double sum = 0f;
        double average = 0f;
        for (double item : scores) {
            sum += item;
        }

        average = sum / scores.length;

        System.out.printf("Tong diem = %.2f", sum);
        System.out.println();
        System.out.printf("Diem trung binh = %.2f", average);
    }
}
