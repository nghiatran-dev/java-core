package chapter4;

public class Video30 {
    public static void main(String[] args) {
        byte day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
                break;
        }

        // Cách viết rút gọn hơn với switch expression (Java 12+)
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Another day");
        }
    }
}
