package Chapter10.Video99;

public class Video99 {
    public static int divideTwoIntegers(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero error");
        }

        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("=== Video 99 ===");
        System.out.printf("Ket qua = %d\n", divideTwoIntegers(10, 0));
    }
}
