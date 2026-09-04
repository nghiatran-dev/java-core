package Chapter7.Video69;

public class Video69 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Int Sum 2 params: " + sum(1, 2));
        System.out.println("Int Sum 3 params: " + sum(1, 2, 3));
        System.out.printf("Double Sum 2 params: %.2f", sum(1.5, 2.5));
    }
}
