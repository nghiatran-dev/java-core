package Chapter10.Video100;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Video100 {

    public static int checkScore(Scanner sc) throws IllegalArgumentException, InputMismatchException {
        if (!sc.hasNextInt()) {
            sc.next(); // — bỏ "abc" khỏi buffer để tránh bị loop vô tận
            throw new InputMismatchException("Invalid format, the score must be an integer. Input again!");
        }

        int score = sc.nextInt();
        if (score < 0 || score > 10) {
            throw new IllegalArgumentException("Invalid score, must be between 0 and 10. Input again!");
        }

        return score;
    }

    public static void main(String[] args) {
        System.out.println("=== Video 100 ===");
        Scanner sc = new Scanner(System.in);
        boolean isInvalid = false;

        while (!isInvalid) {
            System.out.print("Enter your score: ");
            try {
                int score = checkScore(sc);
                System.out.printf("Your score: %d\n", score);
                isInvalid = true;
            } catch (Exception e) {
                System.out.printf("Has error: %s\n", e.getMessage());
            } finally {
                if (isInvalid) {
                    System.out.println("End of program.");
                    sc.close();
                }
            }
        }

    }
}
